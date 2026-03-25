package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import org.tensorflow.lite.Tensor;

/* JADX INFO: loaded from: classes13.dex */
public final class TensorImpl implements Tensor {
    private final DataType dtype;
    private long nativeHandle;
    private final Tensor.QuantizationParams quantizationParamsCopy;
    private int[] shapeCopy;
    private final int[] shapeSignatureCopy;

    public static native ByteBuffer buffer(long j);

    public static native long create(long j, int i, int i2);

    public static native long createSignatureInputTensor(long j, String str);

    public static native long createSignatureOutputTensor(long j, String str);

    public static native void delete(long j);

    public static native int dtype(long j);

    public static native boolean hasDelegateBufferHandle(long j);

    public static native int index(long j);

    public static native String name(long j);

    public static native int numBytes(long j);

    public static native float quantizationScale(long j);

    public static native int quantizationZeroPoint(long j);

    public static native void readMultiDimensionalArray(long j, Object obj);

    public static native int[] shape(long j);

    public static native int[] shapeSignature(long j);

    public static native void writeDirectBuffer(long j, Buffer buffer);

    public static native void writeMultiDimensionalArray(long j, Object obj);

    public static native void writeScalar(long j, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.Tensor
    public DataType dataType() {
        return this.dtype;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.Tensor
    public Tensor.QuantizationParams quantizationParams() {
        return this.quantizationParamsCopy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.Tensor
    public int[] shape() {
        return this.shapeCopy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.Tensor
    public int[] shapeSignature() {
        return this.shapeSignatureCopy;
    }

    public static TensorImpl fromIndex(long j, int i) {
        return new TensorImpl(create(j, i, 0));
    }

    public static TensorImpl fromSignatureInput(long j, String str) {
        long jCreateSignatureInputTensor = createSignatureInputTensor(j, str);
        if (jCreateSignatureInputTensor == -1) {
            throw new IllegalArgumentException("Input error: input " + str + " not found.");
        }
        return new TensorImpl(jCreateSignatureInputTensor);
    }

    public static TensorImpl fromSignatureOutput(long j, String str) {
        long jCreateSignatureOutputTensor = createSignatureOutputTensor(j, str);
        if (jCreateSignatureOutputTensor == -1) {
            throw new IllegalArgumentException("Input error: output " + str + " not found.");
        }
        return new TensorImpl(jCreateSignatureOutputTensor);
    }

    public void close() {
        delete(this.nativeHandle);
        this.nativeHandle = 0L;
    }

    @Override // org.tensorflow.lite.Tensor
    public int numDimensions() {
        return this.shapeCopy.length;
    }

    @Override // org.tensorflow.lite.Tensor
    public int numBytes() {
        return numBytes(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public int numElements() {
        return computeNumElements(this.shapeCopy);
    }

    @Override // org.tensorflow.lite.Tensor
    public int index() {
        return index(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public String name() {
        return name(this.nativeHandle);
    }

    @Override // org.tensorflow.lite.Tensor
    public ByteBuffer asReadOnlyBuffer() {
        return buffer().asReadOnlyBuffer().order(ByteOrder.nativeOrder());
    }

    public void setTo(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.nativeHandle)) {
                throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        throwIfTypeIsIncompatible(obj);
        throwIfSrcShapeIsIncompatible(obj);
        if (isBuffer(obj)) {
            setTo((Buffer) obj);
            return;
        }
        if (this.dtype == DataType.STRING && this.shapeCopy.length == 0) {
            writeScalar(this.nativeHandle, obj);
        } else if (obj.getClass().isArray()) {
            writeMultiDimensionalArray(this.nativeHandle, obj);
        } else {
            writeScalar(this.nativeHandle, obj);
        }
    }

    private void setTo(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (buffer instanceof ShortBuffer) {
            ShortBuffer shortBuffer = (ShortBuffer) buffer;
            if (shortBuffer.isDirect() && shortBuffer.order() == ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.nativeHandle, buffer);
                return;
            } else {
                buffer().asShortBuffer().put(shortBuffer);
                return;
            }
        }
        throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
    }

    public void copyTo(Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.nativeHandle)) {
                throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        throwIfTypeIsIncompatible(obj);
        throwIfDstShapeIsIncompatible(obj);
        if (isBuffer(obj)) {
            copyTo((Buffer) obj);
        } else {
            readMultiDimensionalArray(this.nativeHandle, obj);
        }
    }

    private void copyTo(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(buffer());
            return;
        }
        if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(buffer().asFloatBuffer());
            return;
        }
        if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(buffer().asLongBuffer());
            return;
        }
        if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(buffer().asIntBuffer());
        } else {
            if (buffer instanceof ShortBuffer) {
                ((ShortBuffer) buffer).put(buffer().asShortBuffer());
                return;
            }
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    public int[] getInputShapeIfDifferent(Object obj) {
        if (obj == null || isBuffer(obj)) {
            return null;
        }
        throwIfTypeIsIncompatible(obj);
        int[] iArrComputeShapeOf = computeShapeOf(obj);
        if (Arrays.equals(this.shapeCopy, iArrComputeShapeOf)) {
            return null;
        }
        return iArrComputeShapeOf;
    }

    public void refreshShape() {
        this.shapeCopy = shape(this.nativeHandle);
    }

    public DataType dataTypeOf(Object obj) {
        Class<?> componentType = obj.getClass();
        if (componentType.isArray()) {
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
            }
            if (Float.TYPE.equals(componentType)) {
                return DataType.FLOAT32;
            }
            if (Integer.TYPE.equals(componentType)) {
                return DataType.INT32;
            }
            if (Short.TYPE.equals(componentType)) {
                return DataType.INT16;
            }
            if (Byte.TYPE.equals(componentType)) {
                DataType dataType = this.dtype;
                DataType dataType2 = DataType.STRING;
                return dataType == dataType2 ? dataType2 : DataType.UINT8;
            }
            if (Long.TYPE.equals(componentType)) {
                return DataType.INT64;
            }
            if (Boolean.TYPE.equals(componentType)) {
                return DataType.BOOL;
            }
            if (String.class.equals(componentType)) {
                return DataType.STRING;
            }
        } else {
            if (Float.class.equals(componentType) || (obj instanceof FloatBuffer)) {
                return DataType.FLOAT32;
            }
            if (Integer.class.equals(componentType) || (obj instanceof IntBuffer)) {
                return DataType.INT32;
            }
            if (Short.class.equals(componentType) || (obj instanceof ShortBuffer)) {
                return DataType.INT16;
            }
            if (Byte.class.equals(componentType)) {
                return DataType.UINT8;
            }
            if (Long.class.equals(componentType) || (obj instanceof LongBuffer)) {
                return DataType.INT64;
            }
            if (Boolean.class.equals(componentType)) {
                return DataType.BOOL;
            }
            if (String.class.equals(componentType)) {
                return DataType.STRING;
            }
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + obj.getClass().getName());
    }

    private int[] computeShapeOf(Object obj) {
        int iComputeNumDimensions = computeNumDimensions(obj);
        if (this.dtype == DataType.STRING) {
            Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (Byte.TYPE.equals(componentType)) {
                    iComputeNumDimensions--;
                }
            }
        }
        int[] iArr = new int[iComputeNumDimensions];
        fillShape(obj, 0, iArr);
        return iArr;
    }

    public static int computeNumElements(int[] iArr) {
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        return i;
    }

    public static int computeNumDimensions(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) == 0) {
            throw new IllegalArgumentException("Array lengths cannot be 0.");
        }
        return computeNumDimensions(Array.get(obj, 0)) + 1;
    }

    public static void fillShape(Object obj, int i, int[] iArr) {
        if (iArr == null || i == iArr.length) {
            return;
        }
        int length = Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length;
        } else if (i2 != length) {
            throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(i)));
        }
        int i3 = i + 1;
        if (i3 == iArr.length) {
            return;
        }
        for (int i4 = 0; i4 < length; i4++) {
            fillShape(Array.get(obj, i4), i3, iArr);
        }
    }

    private void throwIfTypeIsIncompatible(Object obj) {
        DataType dataTypeDataTypeOf;
        if (!isByteBuffer(obj) && (dataTypeDataTypeOf = dataTypeOf(obj)) != this.dtype && !DataTypeUtils.toStringName(dataTypeDataTypeOf).equals(DataTypeUtils.toStringName(this.dtype))) {
            throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", this.dtype, obj.getClass().getName(), dataTypeDataTypeOf));
        }
    }

    private void throwIfSrcShapeIsIncompatible(Object obj) {
        if (isBuffer(obj)) {
            Buffer buffer = (Buffer) obj;
            int iNumBytes = numBytes();
            int iCapacity = isByteBuffer(obj) ? buffer.capacity() : buffer.capacity() * this.dtype.byteSize();
            if (iNumBytes != iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
            return;
        }
        int[] iArrComputeShapeOf = computeShapeOf(obj);
        if (!Arrays.equals(iArrComputeShapeOf, this.shapeCopy)) {
            throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", name(), Arrays.toString(this.shapeCopy), Arrays.toString(iArrComputeShapeOf)));
        }
    }

    private void throwIfDstShapeIsIncompatible(Object obj) {
        if (isBuffer(obj)) {
            Buffer buffer = (Buffer) obj;
            int iNumBytes = numBytes();
            int iCapacity = isByteBuffer(obj) ? buffer.capacity() : buffer.capacity() * this.dtype.byteSize();
            if (iNumBytes > iCapacity) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(), Integer.valueOf(iNumBytes), Integer.valueOf(iCapacity)));
            }
            return;
        }
        int[] iArrComputeShapeOf = computeShapeOf(obj);
        if (!Arrays.equals(iArrComputeShapeOf, this.shapeCopy)) {
            throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", name(), Arrays.toString(this.shapeCopy), Arrays.toString(iArrComputeShapeOf)));
        }
    }

    private static boolean isBuffer(Object obj) {
        return obj instanceof Buffer;
    }

    private static boolean isByteBuffer(Object obj) {
        return obj instanceof ByteBuffer;
    }

    private TensorImpl(long j) {
        this.nativeHandle = j;
        this.dtype = DataTypeUtils.fromC(dtype(j));
        this.shapeCopy = shape(j);
        this.shapeSignatureCopy = shapeSignature(j);
        this.quantizationParamsCopy = new Tensor.QuantizationParams(quantizationScale(j), quantizationZeroPoint(j));
    }

    private ByteBuffer buffer() {
        return buffer(this.nativeHandle).order(ByteOrder.nativeOrder());
    }
}
