package org.tensorflow.lite.support.image;

import android.graphics.RectF;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class BoundingBoxUtil {

    public enum CoordinateType {
        RATIO,
        PIXEL
    }

    public enum Type {
        BOUNDARIES,
        UPPER_LEFT,
        CENTER
    }

    public static List<RectF> convert(TensorBuffer tensorBuffer, int[] iArr, int i, Type type, CoordinateType coordinateType, int i2, int i3) {
        int length = i;
        int[] shape = tensorBuffer.getShape();
        SupportPreconditions.checkArgument(length >= (-shape.length) && length < shape.length, String.format("Axis %d is not in range (-(D+1), D), where D is the number of dimensions of input tensor (shape=%s)", Integer.valueOf(i), Arrays.toString(shape)));
        if (length < 0) {
            length += shape.length;
        }
        int i4 = shape[length];
        SupportPreconditions.checkArgument(i4 == 4, String.format("Size of bounding box dimension %d is not 4. Got %d in shape %s", Integer.valueOf(length), Integer.valueOf(i4), Arrays.toString(shape)));
        SupportPreconditions.checkArgument(iArr.length == 4, String.format("Bounding box index array length %d is not 4. Got index array %s", Integer.valueOf(iArr.length), Arrays.toString(iArr)));
        SupportPreconditions.checkArgument(tensorBuffer.getDataType() == DataType.FLOAT32, "Bounding Boxes only create from FLOAT32 buffers. Got: " + tensorBuffer.getDataType().name());
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        for (int i6 = 0; i6 < length; i6++) {
            i5 *= shape[i6];
        }
        int i7 = 1;
        for (int i8 = length + 1; i8 < shape.length; i8++) {
            i7 *= shape[i8];
        }
        float[] fArr = new float[4];
        ByteBuffer buffer = tensorBuffer.getBuffer();
        buffer.rewind();
        FloatBuffer floatBufferAsFloatBuffer = buffer.asFloatBuffer();
        for (int i9 = 0; i9 < i5; i9++) {
            for (int i10 = 0; i10 < i7; i10++) {
                for (int i11 = 0; i11 < 4; i11++) {
                    fArr[i11] = floatBufferAsFloatBuffer.get((((i9 * 4) + i11) * i7) + i10);
                }
                arrayList.add(convertOneBoundingBox(fArr, iArr, type, coordinateType, i2, i3));
            }
        }
        buffer.rewind();
        return arrayList;
    }

    private static RectF convertOneBoundingBox(float[] fArr, int[] iArr, Type type, CoordinateType coordinateType, int i, int i2) {
        float[] fArr2 = new float[4];
        for (int i3 = 0; i3 < 4; i3++) {
            fArr2[i3] = fArr[iArr[i3]];
        }
        return convertOneBoundingBox(fArr2, type, coordinateType, i, i2);
    }

    /* JADX INFO: renamed from: org.tensorflow.lite.support.image.BoundingBoxUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type = iArr;
            try {
                iArr[Type.BOUNDARIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type[Type.UPPER_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type[Type.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static RectF convertOneBoundingBox(float[] fArr, Type type, CoordinateType coordinateType, int i, int i2) {
        int i3 = AnonymousClass1.$SwitchMap$org$tensorflow$lite$support$image$BoundingBoxUtil$Type[type.ordinal()];
        if (i3 == 1) {
            return convertFromBoundaries(fArr, coordinateType, i, i2);
        }
        if (i3 == 2) {
            return convertFromUpperLeft(fArr, coordinateType, i, i2);
        }
        if (i3 == 3) {
            return convertFromCenter(fArr, coordinateType, i, i2);
        }
        throw new IllegalArgumentException("Cannot recognize BoundingBox.Type " + type);
    }

    private static RectF convertFromBoundaries(float[] fArr, CoordinateType coordinateType, int i, int i2) {
        return getRectF(fArr[0], fArr[1], fArr[2], fArr[3], i, i2, coordinateType);
    }

    private static RectF convertFromUpperLeft(float[] fArr, CoordinateType coordinateType, int i, int i2) {
        float f = fArr[0];
        float f2 = fArr[1];
        return getRectF(f, f2, f + fArr[2], f2 + fArr[3], i, i2, coordinateType);
    }

    private static RectF convertFromCenter(float[] fArr, CoordinateType coordinateType, int i, int i2) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2] / 2.0f;
        float f4 = fArr[3] / 2.0f;
        return getRectF(f - f3, f2 - f4, f + f3, f2 + f4, i, i2, coordinateType);
    }

    private static RectF getRectF(float f, float f2, float f3, float f4, int i, int i2, CoordinateType coordinateType) {
        if (coordinateType == CoordinateType.PIXEL) {
            return new RectF(f, f2, f3, f4);
        }
        if (coordinateType == CoordinateType.RATIO) {
            float f5 = i2;
            float f6 = i;
            return new RectF(f * f5, f2 * f6, f3 * f5, f4 * f6);
        }
        throw new IllegalArgumentException("Cannot convert coordinate type " + coordinateType);
    }

    private BoundingBoxUtil() {
    }
}
