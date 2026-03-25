package org.tensorflow.lite.support.tensorbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TensorBuffer {
    protected ByteBuffer buffer;
    protected int flatSize = -1;
    protected final boolean isDynamic = true;
    protected int[] shape;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ByteBuffer getBuffer() {
        return this.buffer;
    }

    public abstract DataType getDataType();

    public abstract float[] getFloatArray();

    public abstract float getFloatValue(int i);

    public abstract int[] getIntArray();

    public abstract int getIntValue(int i);

    public abstract int getTypeSize();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isDynamic() {
        return this.isDynamic;
    }

    public abstract void loadArray(float[] fArr, int[] iArr);

    public abstract void loadArray(int[] iArr, int[] iArr2);

    /* JADX INFO: renamed from: org.tensorflow.lite.support.tensorbuffer.TensorBuffer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$DataType;

        static {
            int[] iArr = new int[DataType.values().length];
            $SwitchMap$org$tensorflow$lite$DataType = iArr;
            try {
                iArr[DataType.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.UINT8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static TensorBuffer createFixedSize(int[] iArr, DataType dataType) {
        int i = AnonymousClass1.$SwitchMap$org$tensorflow$lite$DataType[dataType.ordinal()];
        if (i == 1) {
            return new TensorBufferFloat(iArr);
        }
        if (i == 2) {
            return new TensorBufferUint8(iArr);
        }
        throw new AssertionError("TensorBuffer does not support data type: " + dataType);
    }

    public static TensorBuffer createDynamic(DataType dataType) {
        int i = AnonymousClass1.$SwitchMap$org$tensorflow$lite$DataType[dataType.ordinal()];
        if (i == 1) {
            return new TensorBufferFloat();
        }
        if (i == 2) {
            return new TensorBufferUint8();
        }
        throw new AssertionError("TensorBuffer does not support data type: " + dataType);
    }

    public static TensorBuffer createFrom(TensorBuffer tensorBuffer, DataType dataType) {
        TensorBuffer tensorBufferCreateFixedSize;
        SupportPreconditions.checkNotNull(tensorBuffer, "Cannot create a buffer from null");
        if (tensorBuffer.isDynamic()) {
            tensorBufferCreateFixedSize = createDynamic(dataType);
        } else {
            tensorBufferCreateFixedSize = createFixedSize(tensorBuffer.shape, dataType);
        }
        DataType dataType2 = tensorBuffer.getDataType();
        DataType dataType3 = DataType.FLOAT32;
        if (dataType2 == dataType3 && dataType == dataType3) {
            tensorBufferCreateFixedSize.loadArray(tensorBuffer.getFloatArray(), tensorBuffer.shape);
        } else {
            tensorBufferCreateFixedSize.loadArray(tensorBuffer.getIntArray(), tensorBuffer.shape);
        }
        return tensorBufferCreateFixedSize;
    }

    public int getFlatSize() {
        assertShapeIsCorrect();
        return this.flatSize;
    }

    public int[] getShape() {
        assertShapeIsCorrect();
        int[] iArr = this.shape;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void loadArray(int[] iArr) {
        loadArray(iArr, this.shape);
    }

    public void loadArray(float[] fArr) {
        loadArray(fArr, this.shape);
    }

    public void loadBuffer(ByteBuffer byteBuffer, int[] iArr) {
        SupportPreconditions.checkNotNull(byteBuffer, "Byte buffer cannot be null.");
        SupportPreconditions.checkArgument(isShapeValid(iArr), "Values in TensorBuffer shape should be non-negative.");
        int iComputeFlatSize = computeFlatSize(iArr);
        SupportPreconditions.checkArgument(byteBuffer.limit() == getTypeSize() * iComputeFlatSize, "The size of byte buffer and the shape do not match. Expected: " + (getTypeSize() * iComputeFlatSize) + " Actual: " + byteBuffer.limit());
        if (!this.isDynamic) {
            SupportPreconditions.checkArgument(Arrays.equals(iArr, this.shape));
        }
        this.shape = (int[]) iArr.clone();
        this.flatSize = iComputeFlatSize;
        byteBuffer.rewind();
        this.buffer = byteBuffer;
    }

    public void loadBuffer(ByteBuffer byteBuffer) {
        loadBuffer(byteBuffer, this.shape);
    }

    public TensorBuffer(int[] iArr) {
        allocateMemory(iArr);
    }

    public TensorBuffer() {
        allocateMemory(new int[]{0});
    }

    public static int computeFlatSize(int[] iArr) {
        SupportPreconditions.checkNotNull(iArr, "Shape cannot be null.");
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        return i;
    }

    public void resize(int[] iArr) {
        if (this.isDynamic) {
            allocateMemory(iArr);
        } else {
            SupportPreconditions.checkArgument(Arrays.equals(iArr, this.shape));
            this.shape = (int[]) iArr.clone();
        }
    }

    public void copyByteBufferIfReadOnly() {
        synchronized (this) {
            if (this.buffer.isReadOnly()) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.buffer.capacity());
                byteBufferAllocateDirect.order(this.buffer.order());
                byteBufferAllocateDirect.put(this.buffer);
                byteBufferAllocateDirect.rewind();
                this.buffer = byteBufferAllocateDirect;
            }
        }
    }

    private void allocateMemory(int[] iArr) {
        SupportPreconditions.checkNotNull(iArr, "TensorBuffer shape cannot be null.");
        SupportPreconditions.checkArgument(isShapeValid(iArr), "Values in TensorBuffer shape should be non-negative.");
        int iComputeFlatSize = computeFlatSize(iArr);
        this.shape = (int[]) iArr.clone();
        if (this.flatSize == iComputeFlatSize) {
            return;
        }
        this.flatSize = iComputeFlatSize;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iComputeFlatSize * getTypeSize());
        this.buffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
    }

    private void assertShapeIsCorrect() {
        boolean z = this.buffer.limit() == getTypeSize() * computeFlatSize(this.shape);
        SupportPreconditions.checkState(z, String.format("The size of underlying ByteBuffer (%d) and the shape (%s) do not match. The ByteBuffer may have been changed.", Integer.valueOf(this.buffer.limit()), Arrays.toString(this.shape)));
    }

    private static boolean isShapeValid(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        for (int i : iArr) {
            if (i < 0) {
                return false;
            }
        }
        return true;
    }
}
