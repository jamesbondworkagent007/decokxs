package org.tensorflow.lite.support.tensorbuffer;

import androidx.camera.video.AudioStats;
import com.google.common.primitives.UnsignedBytes;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class TensorBufferUint8 extends TensorBuffer {
    private static final DataType DATA_TYPE = DataType.UINT8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public DataType getDataType() {
        return DATA_TYPE;
    }

    public TensorBufferUint8(int[] iArr) {
        super(iArr);
    }

    public TensorBufferUint8() {
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public float[] getFloatArray() {
        this.buffer.rewind();
        this.buffer.get(new byte[this.flatSize]);
        float[] fArr = new float[this.flatSize];
        for (int i = 0; i < this.flatSize; i++) {
            fArr[i] = r0[i] & UnsignedBytes.MAX_VALUE;
        }
        return fArr;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public float getFloatValue(int i) {
        return this.buffer.get(i) & UnsignedBytes.MAX_VALUE;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public int[] getIntArray() {
        this.buffer.rewind();
        byte[] bArr = new byte[this.flatSize];
        this.buffer.get(bArr);
        int[] iArr = new int[this.flatSize];
        for (int i = 0; i < this.flatSize; i++) {
            iArr[i] = bArr[i] & UnsignedBytes.MAX_VALUE;
        }
        return iArr;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public int getIntValue(int i) {
        return this.buffer.get(i) & UnsignedBytes.MAX_VALUE;
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public int getTypeSize() {
        return DATA_TYPE.byteSize();
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public void loadArray(float[] fArr, int[] iArr) {
        SupportPreconditions.checkNotNull(fArr, "The array to be loaded cannot be null.");
        int i = 0;
        SupportPreconditions.checkArgument(fArr.length == TensorBuffer.computeFlatSize(iArr), "The size of the array to be loaded does not match the specified shape.");
        copyByteBufferIfReadOnly();
        resize(iArr);
        this.buffer.rewind();
        byte[] bArr = new byte[fArr.length];
        int length = fArr.length;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) Math.max(Math.min(fArr[i], 255.0d), AudioStats.AUDIO_AMPLITUDE_NONE);
            i++;
            i2++;
        }
        this.buffer.put(bArr);
    }

    @Override // org.tensorflow.lite.support.tensorbuffer.TensorBuffer
    public void loadArray(int[] iArr, int[] iArr2) {
        SupportPreconditions.checkNotNull(iArr, "The array to be loaded cannot be null.");
        int i = 0;
        SupportPreconditions.checkArgument(iArr.length == TensorBuffer.computeFlatSize(iArr2), "The size of the array to be loaded does not match the specified shape.");
        copyByteBufferIfReadOnly();
        resize(iArr2);
        this.buffer.rewind();
        byte[] bArr = new byte[iArr.length];
        int length = iArr.length;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) Math.max(Math.min(iArr[i], 255.0f), 0.0f);
            i++;
            i2++;
        }
        this.buffer.put(bArr);
    }
}
