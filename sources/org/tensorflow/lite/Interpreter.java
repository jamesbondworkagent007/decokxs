package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class Interpreter extends InterpreterImpl implements InterpreterApi {
    private final NativeInterpreterWrapperExperimental wrapperExperimental;

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void allocateTensors() {
        super.allocateTensors();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getInputIndex(String str) {
        return super.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getInputTensor(int i) {
        return super.getInputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getInputTensorCount() {
        return super.getInputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getInputTensorFromSignature(String str, String str2) {
        return super.getInputTensorFromSignature(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Long getLastNativeInferenceDurationNanoseconds() {
        return super.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getOutputIndex(String str) {
        return super.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getOutputTensor(int i) {
        return super.getOutputTensor(i);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ int getOutputTensorCount() {
        return super.getOutputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ Tensor getOutputTensorFromSignature(String str, String str2) {
        return super.getOutputTensorFromSignature(str, str2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureInputs(String str) {
        return super.getSignatureInputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureKeys() {
        return super.getSignatureKeys();
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ String[] getSignatureOutputs(String str) {
        return super.getSignatureOutputs(str);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void resizeInput(int i, int[] iArr) {
        super.resizeInput(i, iArr);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void resizeInput(int i, int[] iArr, boolean z) {
        super.resizeInput(i, iArr, z);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void run(Object obj, Object obj2) {
        super.run(obj, obj2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runForMultipleInputsOutputs(Object[] objArr, Map map) {
        super.runForMultipleInputsOutputs(objArr, map);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runSignature(Map map, Map map2) {
        super.runSignature(map, map2);
    }

    @Override // org.tensorflow.lite.InterpreterImpl, org.tensorflow.lite.InterpreterApi
    public /* bridge */ /* synthetic */ void runSignature(Map map, Map map2, String str) {
        super.runSignature(map, map2, str);
    }

    public static class Options extends InterpreterImpl.Options {
        public Options() {
        }

        public Options(InterpreterApi.Options options) {
            super(options);
        }

        public Options(InterpreterImpl.Options options) {
            super(options);
        }

        /* JADX DEBUG: Method merged with bridge method: setUseXNNPACK(Z)Lorg/tensorflow/lite/InterpreterApi$Options; */
        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setUseXNNPACK(boolean z) {
            super.setUseXNNPACK(z);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: setNumThreads(I)Lorg/tensorflow/lite/InterpreterApi$Options; */
        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setNumThreads(int i) {
            super.setNumThreads(i);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: setUseNNAPI(Z)Lorg/tensorflow/lite/InterpreterApi$Options; */
        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setUseNNAPI(boolean z) {
            super.setUseNNAPI(z);
            return this;
        }

        @Deprecated
        public Options setAllowFp16PrecisionForFp32(boolean z) {
            this.allowFp16PrecisionForFp32 = Boolean.valueOf(z);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: addDelegate(Lorg/tensorflow/lite/Delegate;)Lorg/tensorflow/lite/InterpreterApi$Options; */
        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options addDelegate(Delegate delegate) {
            super.addDelegate(delegate);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: addDelegateFactory(Lorg/tensorflow/lite/DelegateFactory;)Lorg/tensorflow/lite/InterpreterApi$Options; */
        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options addDelegateFactory(DelegateFactory delegateFactory) {
            super.addDelegateFactory(delegateFactory);
            return this;
        }

        public Options setAllowBufferHandleOutput(boolean z) {
            this.allowBufferHandleOutput = Boolean.valueOf(z);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: setCancellable(Z)Lorg/tensorflow/lite/InterpreterApi$Options; */
        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setCancellable(boolean z) {
            super.setCancellable(z);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: setRuntime(Lorg/tensorflow/lite/InterpreterApi$Options$TfLiteRuntime;)Lorg/tensorflow/lite/InterpreterApi$Options; */
        @Override // org.tensorflow.lite.InterpreterApi.Options
        public Options setRuntime(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
            super.setRuntime(tfLiteRuntime);
            return this;
        }
    }

    public Interpreter(File file) {
        this(file, (Options) null);
    }

    public Interpreter(File file, Options options) {
        this(new NativeInterpreterWrapperExperimental(file.getAbsolutePath(), options));
    }

    public Interpreter(ByteBuffer byteBuffer) {
        this(byteBuffer, (Options) null);
    }

    public Interpreter(ByteBuffer byteBuffer, Options options) {
        this(new NativeInterpreterWrapperExperimental(byteBuffer, options));
    }

    private Interpreter(NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental) {
        super(nativeInterpreterWrapperExperimental);
        this.wrapperExperimental = nativeInterpreterWrapperExperimental;
    }

    public void resetVariableTensors() {
        checkNotClosed();
        this.wrapperExperimental.resetVariableTensors();
    }

    public void setCancelled(boolean z) {
        this.wrapper.setCancelled(z);
    }
}
