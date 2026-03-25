package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.Delegate;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes13.dex */
public class NnApiDelegateImpl implements NnApiDelegate.PrivateInterface, Delegate, AutoCloseable {
    private static final long INVALID_DELEGATE_HANDLE = 0;
    private long delegateHandle;

    public static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, long j);

    public static native void deleteDelegate(long j);

    public static native int getNnapiErrno(long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.tensorflow.lite.Delegate
    public long getNativeHandle() {
        return this.delegateHandle;
    }

    public NnApiDelegateImpl(NnApiDelegate.Options options) {
        TensorFlowLite.init();
        int executionPreference = options.getExecutionPreference();
        String acceleratorName = options.getAcceleratorName();
        String cacheDir = options.getCacheDir();
        String modelToken = options.getModelToken();
        int maxNumberOfDelegatedPartitions = options.getMaxNumberOfDelegatedPartitions();
        boolean z = true;
        boolean z2 = options.getUseNnapiCpu() != null;
        if (options.getUseNnapiCpu() != null && options.getUseNnapiCpu().booleanValue()) {
            z = false;
        }
        this.delegateHandle = createDelegate(executionPreference, acceleratorName, cacheDir, modelToken, maxNumberOfDelegatedPartitions, z2, z, options.getAllowFp16(), options.getNnApiSupportLibraryHandle());
    }

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface, org.tensorflow.lite.Delegate, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.delegateHandle;
        if (j != 0) {
            deleteDelegate(j);
            this.delegateHandle = 0L;
        }
    }

    @Override // org.tensorflow.lite.nnapi.NnApiDelegate.PrivateInterface
    public int getNnapiErrno() {
        checkNotClosed();
        return getNnapiErrno(this.delegateHandle);
    }

    private void checkNotClosed() {
        if (this.delegateHandle == 0) {
            throw new IllegalStateException("Should not access delegate after it has been closed.");
        }
    }
}
