package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.InterpreterFactoryApi;
import org.tensorflow.lite.TensorFlowLite;

/* JADX INFO: loaded from: classes13.dex */
public class NnApiDelegate implements Delegate, AutoCloseable {
    private PrivateInterface impl;
    private boolean initialized;
    private Options options;

    public interface PrivateInterface extends Delegate, AutoCloseable {
        @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
        void close();

        int getNnapiErrno();
    }

    public static final class Options {
        public static final int EXECUTION_PREFERENCE_FAST_SINGLE_ANSWER = 1;
        public static final int EXECUTION_PREFERENCE_LOW_POWER = 0;
        public static final int EXECUTION_PREFERENCE_SUSTAINED_SPEED = 2;
        public static final int EXECUTION_PREFERENCE_UNDEFINED = -1;
        private int executionPreference = -1;
        private String acceleratorName = null;
        private String cacheDir = null;
        private String modelToken = null;
        private Integer maxDelegatedPartitions = null;
        private Boolean useNnapiCpu = null;
        private Boolean allowFp16 = null;
        private long nnApiSupportLibraryHandle = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getAcceleratorName() {
            return this.acceleratorName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getCacheDir() {
            return this.cacheDir;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getExecutionPreference() {
            return this.executionPreference;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getModelToken() {
            return this.modelToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long getNnApiSupportLibraryHandle() {
            return this.nnApiSupportLibraryHandle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Boolean getUseNnapiCpu() {
            return this.useNnapiCpu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Options setAcceleratorName(String str) {
            this.acceleratorName = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Options setCacheDir(String str) {
            this.cacheDir = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Options setExecutionPreference(int i) {
            this.executionPreference = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Options setModelToken(String str) {
            this.modelToken = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Options setNnApiSupportLibraryHandle(long j) {
            this.nnApiSupportLibraryHandle = j;
            return this;
        }

        public Options setMaxNumberOfDelegatedPartitions(int i) {
            this.maxDelegatedPartitions = Integer.valueOf(i);
            return this;
        }

        public Options setUseNnapiCpu(boolean z) {
            this.useNnapiCpu = Boolean.valueOf(z);
            return this;
        }

        public Options setAllowFp16(boolean z) {
            this.allowFp16 = Boolean.valueOf(z);
            return this;
        }

        public int getMaxNumberOfDelegatedPartitions() {
            Integer num = this.maxDelegatedPartitions;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public boolean getAllowFp16() {
            Boolean bool = this.allowFp16;
            return bool != null && bool.booleanValue();
        }
    }

    public NnApiDelegate(Options options) {
        TensorFlowLite.init();
        this.options = options;
    }

    public NnApiDelegate() {
        this(new Options());
    }

    public void initWithInterpreterFactoryApi(InterpreterFactoryApi interpreterFactoryApi) {
        this.impl = interpreterFactoryApi.createNnApiDelegateImpl(this.options);
        this.initialized = true;
    }

    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        checkNotClosed();
        return this.impl.getNativeHandle();
    }

    @Override // org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        PrivateInterface privateInterface = this.impl;
        if (privateInterface != null) {
            privateInterface.close();
            this.impl = null;
        }
    }

    public int getNnapiErrno() {
        if (!this.initialized) {
            return 0;
        }
        checkNotClosed();
        return this.impl.getNnapiErrno();
    }

    public boolean hasErrors() {
        return getNnapiErrno() != 0;
    }

    private void checkNotClosed() {
        if (this.impl == null) {
            throw new IllegalStateException(this.initialized ? "Should not access delegate after delegate has been closed." : "Should not access delegate before interpreter has been constructed.");
        }
    }
}
