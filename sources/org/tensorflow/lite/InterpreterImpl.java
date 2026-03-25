package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;

/* JADX INFO: loaded from: classes13.dex */
class InterpreterImpl implements InterpreterApi {
    private final String[] signatureKeyList = getSignatureKeys();
    NativeInterpreterWrapper wrapper;

    public static class Options extends InterpreterApi.Options {
        Boolean allowBufferHandleOutput;
        Boolean allowFp16PrecisionForFp32;

        public Options() {
        }

        public Options(InterpreterApi.Options options) {
            super(options);
        }

        public Options(Options options) {
            super(options);
            this.allowFp16PrecisionForFp32 = options.allowFp16PrecisionForFp32;
            this.allowBufferHandleOutput = options.allowBufferHandleOutput;
        }
    }

    public InterpreterImpl(File file, Options options) {
        this.wrapper = new NativeInterpreterWrapper(file.getAbsolutePath(), options);
    }

    public InterpreterImpl(ByteBuffer byteBuffer, Options options) {
        this.wrapper = new NativeInterpreterWrapper(byteBuffer, options);
    }

    public InterpreterImpl(NativeInterpreterWrapper nativeInterpreterWrapper) {
        this.wrapper = nativeInterpreterWrapper;
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void run(Object obj, Object obj2) {
        HashMap map = new HashMap();
        map.put(0, obj2);
        runForMultipleInputsOutputs(new Object[]{obj}, map);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map) {
        checkNotClosed();
        this.wrapper.run(objArr, map);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void allocateTensors() {
        checkNotClosed();
        this.wrapper.allocateTensors();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void resizeInput(int i, int[] iArr) {
        checkNotClosed();
        this.wrapper.resizeInput(i, iArr, false);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void resizeInput(int i, int[] iArr, boolean z) {
        checkNotClosed();
        this.wrapper.resizeInput(i, iArr, z);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getInputTensorCount() {
        checkNotClosed();
        return this.wrapper.getInputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getInputIndex(String str) {
        checkNotClosed();
        return this.wrapper.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getInputTensor(int i) {
        checkNotClosed();
        return this.wrapper.getInputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getOutputTensorCount() {
        checkNotClosed();
        return this.wrapper.getOutputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getOutputIndex(String str) {
        checkNotClosed();
        return this.wrapper.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getOutputTensor(int i) {
        checkNotClosed();
        return this.wrapper.getOutputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runSignature(Map<String, Object> map, Map<String, Object> map2, String str) {
        checkNotClosed();
        if (str == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str = strArr[0];
            }
        }
        if (str == null) {
            throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.signatureKeyList));
        }
        this.wrapper.runSignature(map, map2, str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runSignature(Map<String, Object> map, Map<String, Object> map2) {
        checkNotClosed();
        runSignature(map, map2, null);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getInputTensorFromSignature(String str, String str2) {
        checkNotClosed();
        if (str2 == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.signatureKeyList));
        }
        return this.wrapper.getInputTensor(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public String[] getSignatureKeys() {
        checkNotClosed();
        return this.wrapper.getSignatureKeys();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public String[] getSignatureInputs(String str) {
        checkNotClosed();
        return this.wrapper.getSignatureInputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public String[] getSignatureOutputs(String str) {
        checkNotClosed();
        return this.wrapper.getSignatureOutputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getOutputTensorFromSignature(String str, String str2) {
        checkNotClosed();
        if (str2 == null) {
            String[] strArr = this.signatureKeyList;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.signatureKeyList));
        }
        return this.wrapper.getOutputTensor(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Long getLastNativeInferenceDurationNanoseconds() {
        checkNotClosed();
        return this.wrapper.getLastNativeInferenceDurationNanoseconds();
    }

    public int getExecutionPlanLength() {
        checkNotClosed();
        return this.wrapper.getExecutionPlanLength();
    }

    @Override // org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.wrapper;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.wrapper = null;
        }
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public void checkNotClosed() {
        if (this.wrapper == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }
}
