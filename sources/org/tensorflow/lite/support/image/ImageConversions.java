package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes13.dex */
class ImageConversions {
    public static Bitmap convertRgbTensorBufferToBitmap(TensorBuffer tensorBuffer) {
        int[] shape = tensorBuffer.getShape();
        ColorSpaceType colorSpaceType = ColorSpaceType.RGB;
        colorSpaceType.assertShape(shape);
        int height = colorSpaceType.getHeight(shape);
        int width = colorSpaceType.getWidth(shape);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, colorSpaceType.toBitmapConfig());
        int i = width * height;
        int[] iArr = new int[i];
        int[] intArray = tensorBuffer.getIntArray();
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            iArr[i3] = Color.rgb(intArray[i2], intArray[i2 + 1], intArray[i2 + 2]);
            i3++;
            i2 += 3;
        }
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    public static Bitmap convertGrayscaleTensorBufferToBitmap(TensorBuffer tensorBuffer) {
        DataType dataType = tensorBuffer.getDataType();
        DataType dataType2 = DataType.UINT8;
        if (dataType != dataType2) {
            tensorBuffer = TensorBuffer.createFrom(tensorBuffer, dataType2);
        }
        int[] shape = tensorBuffer.getShape();
        ColorSpaceType colorSpaceType = ColorSpaceType.GRAYSCALE;
        colorSpaceType.assertShape(shape);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(colorSpaceType.getWidth(shape), colorSpaceType.getHeight(shape), colorSpaceType.toBitmapConfig());
        tensorBuffer.getBuffer().rewind();
        bitmapCreateBitmap.copyPixelsFromBuffer(tensorBuffer.getBuffer());
        return bitmapCreateBitmap;
    }

    public static void convertBitmapToTensorBuffer(Bitmap bitmap, TensorBuffer tensorBuffer) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = {height, width, 3};
        int i2 = AnonymousClass1.$SwitchMap$org$tensorflow$lite$DataType[tensorBuffer.getDataType().ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            byte[] bArr = new byte[i * 3];
            int i4 = 0;
            while (i4 < i) {
                int i5 = iArr[i4];
                bArr[i3] = (byte) ((i5 >> 16) & 255);
                bArr[i3 + 1] = (byte) ((i5 >> 8) & 255);
                bArr[i3 + 2] = (byte) (i5 & 255);
                i4++;
                i3 += 3;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.order(ByteOrder.nativeOrder());
            tensorBuffer.loadBuffer(byteBufferWrap, iArr2);
            return;
        }
        if (i2 == 2) {
            float[] fArr = new float[i * 3];
            int i6 = 0;
            while (i6 < i) {
                int i7 = iArr[i6];
                fArr[i3] = (i7 >> 16) & 255;
                fArr[i3 + 1] = (i7 >> 8) & 255;
                fArr[i3 + 2] = i7 & 255;
                i6++;
                i3 += 3;
            }
            tensorBuffer.loadArray(fArr, iArr2);
            return;
        }
        throw new IllegalStateException("The type of TensorBuffer, " + tensorBuffer.getBuffer() + ", is unsupported.");
    }

    /* JADX INFO: renamed from: org.tensorflow.lite.support.image.ImageConversions$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$DataType;

        static {
            int[] iArr = new int[DataType.values().length];
            $SwitchMap$org$tensorflow$lite$DataType = iArr;
            try {
                iArr[DataType.UINT8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.FLOAT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ImageConversions() {
    }
}
