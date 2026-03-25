package org.tensorflow.lite.support.model;

import android.content.Context;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.Tensor;
import org.tensorflow.lite.support.common.FileUtil;
import org.tensorflow.lite.support.common.internal.SupportPreconditions;

/* JADX INFO: loaded from: classes25.dex */
public class Model {
    private final MappedByteBuffer byteModel;
    private final GpuDelegateProxy gpuDelegateProxy;
    private final InterpreterApi interpreter;
    private final String modelPath;

    public enum Device {
        CPU,
        NNAPI,
        GPU
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MappedByteBuffer getData() {
        return this.byteModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPath() {
        return this.modelPath;
    }

    public static class Options {
        private final Device device;
        private final int numThreads;
        private final InterpreterApi.Options.TfLiteRuntime tfLiteRuntime;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 org.tensorflow.lite.support.model.Model$Options$Builder) A[MD:(org.tensorflow.lite.support.model.Model$Options$Builder):void (m)] (LINE:56) call: org.tensorflow.lite.support.model.Model.Options.<init>(org.tensorflow.lite.support.model.Model$Options$Builder):void type: THIS */
        public /* synthetic */ Options(Builder builder, AnonymousClass1 anonymousClass1) {
            this(builder);
        }

        public static class Builder {
            private Device device = Device.CPU;
            private int numThreads = 1;
            private InterpreterApi.Options.TfLiteRuntime tfLiteRuntime;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Builder setDevice(Device device) {
                this.device = device;
                return this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Builder setNumThreads(int i) {
                this.numThreads = i;
                return this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Builder setTfLiteRuntime(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
                this.tfLiteRuntime = tfLiteRuntime;
                return this;
            }

            public Options build() {
                return new Options(this, null);
            }
        }

        private Options(Builder builder) {
            this.device = builder.device;
            this.numThreads = builder.numThreads;
            this.tfLiteRuntime = builder.tfLiteRuntime;
        }
    }

    @Deprecated
    public static class Builder {
        private final MappedByteBuffer byteModel;
        private final String modelPath;
        private Device device = Device.CPU;
        private int numThreads = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setDevice(Device device) {
            this.device = device;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setNumThreads(int i) {
            this.numThreads = i;
            return this;
        }

        public Builder(Context context, String str) throws IOException {
            this.modelPath = str;
            this.byteModel = FileUtil.loadMappedFile(context, str);
        }

        public Model build() {
            return Model.createModel(this.byteModel, this.modelPath, new Options.Builder().setNumThreads(this.numThreads).setDevice(this.device).build());
        }
    }

    public static Model createModel(Context context, String str) throws IOException {
        return createModel(context, str, new Options.Builder().build());
    }

    public static Model createModel(Context context, String str, Options options) throws IOException {
        SupportPreconditions.checkNotEmpty(str, "Model path in the asset folder cannot be empty.");
        return createModel(FileUtil.loadMappedFile(context, str), str, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Model createModel(MappedByteBuffer mappedByteBuffer, String str, Options options) {
        GpuDelegateProxy gpuDelegateProxyMaybeNewInstance;
        InterpreterApi.Options options2 = new InterpreterApi.Options();
        int i = AnonymousClass1.$SwitchMap$org$tensorflow$lite$support$model$Model$Device[options.device.ordinal()];
        if (i != 1) {
            if (i == 2) {
                gpuDelegateProxyMaybeNewInstance = GpuDelegateProxy.maybeNewInstance();
                SupportPreconditions.checkArgument(gpuDelegateProxyMaybeNewInstance != null, "Cannot inference with GPU. Did you add \"tensorflow-lite-gpu\" as dependency?");
                options2.addDelegate(gpuDelegateProxyMaybeNewInstance);
            }
            options2.setNumThreads(options.numThreads);
            if (options.tfLiteRuntime != null) {
                options2.setRuntime(options.tfLiteRuntime);
            }
            return new Model(str, mappedByteBuffer, InterpreterApi.create(mappedByteBuffer, options2), gpuDelegateProxyMaybeNewInstance);
        }
        options2.setUseNNAPI(true);
        gpuDelegateProxyMaybeNewInstance = null;
        options2.setNumThreads(options.numThreads);
        if (options.tfLiteRuntime != null) {
        }
        return new Model(str, mappedByteBuffer, InterpreterApi.create(mappedByteBuffer, options2), gpuDelegateProxyMaybeNewInstance);
    }

    /* JADX INFO: renamed from: org.tensorflow.lite.support.model.Model$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$support$model$Model$Device;

        static {
            int[] iArr = new int[Device.values().length];
            $SwitchMap$org$tensorflow$lite$support$model$Model$Device = iArr;
            try {
                iArr[Device.NNAPI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$support$model$Model$Device[Device.GPU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$support$model$Model$Device[Device.CPU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Tensor getInputTensor(int i) {
        return this.interpreter.getInputTensor(i);
    }

    public Tensor getOutputTensor(int i) {
        return this.interpreter.getOutputTensor(i);
    }

    public int[] getOutputTensorShape(int i) {
        return this.interpreter.getOutputTensor(i).shape();
    }

    public void run(Object[] objArr, Map<Integer, Object> map) {
        this.interpreter.runForMultipleInputsOutputs(objArr, map);
    }

    public void close() {
        InterpreterApi interpreterApi = this.interpreter;
        if (interpreterApi != null) {
            interpreterApi.close();
        }
        GpuDelegateProxy gpuDelegateProxy = this.gpuDelegateProxy;
        if (gpuDelegateProxy != null) {
            gpuDelegateProxy.close();
        }
    }

    private Model(String str, MappedByteBuffer mappedByteBuffer, InterpreterApi interpreterApi, GpuDelegateProxy gpuDelegateProxy) {
        this.modelPath = str;
        this.byteModel = mappedByteBuffer;
        this.interpreter = interpreterApi;
        this.gpuDelegateProxy = gpuDelegateProxy;
    }
}
