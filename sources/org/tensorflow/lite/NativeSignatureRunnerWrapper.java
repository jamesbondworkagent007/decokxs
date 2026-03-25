package org.tensorflow.lite;

/* JADX INFO: loaded from: classes17.dex */
public final class NativeSignatureRunnerWrapper {
    private final long errorHandle;
    private boolean isMemoryAllocated = false;
    private final long signatureRunnerHandle;

    public static native void nativeAllocateTensors(long j, long j2);

    public static native int nativeGetInputIndex(long j, String str);

    public static native int nativeGetOutputIndex(long j, String str);

    public static native long nativeGetSignatureRunner(long j, String str);

    public static native int nativeGetSubgraphIndex(long j);

    public static native String[] nativeInputNames(long j);

    public static native void nativeInvoke(long j, long j2);

    public static native String[] nativeOutputNames(long j);

    public static native boolean nativeResizeInput(long j, long j2, String str, int[] iArr);

    public NativeSignatureRunnerWrapper(long j, long j2, String str) {
        this.errorHandle = j2;
        long jNativeGetSignatureRunner = nativeGetSignatureRunner(j, str);
        this.signatureRunnerHandle = jNativeGetSignatureRunner;
        if (jNativeGetSignatureRunner != -1) {
            return;
        }
        throw new IllegalArgumentException("Input error: Signature " + str + " not found.");
    }

    public int getSubgraphIndex() {
        return nativeGetSubgraphIndex(this.signatureRunnerHandle);
    }

    public String[] inputNames() {
        return nativeInputNames(this.signatureRunnerHandle);
    }

    public String[] outputNames() {
        return nativeOutputNames(this.signatureRunnerHandle);
    }

    public TensorImpl getInputTensor(String str) {
        return TensorImpl.fromSignatureInput(this.signatureRunnerHandle, str);
    }

    public TensorImpl getOutputTensor(String str) {
        return TensorImpl.fromSignatureOutput(this.signatureRunnerHandle, str);
    }

    public int getInputIndex(String str) {
        int iNativeGetInputIndex = nativeGetInputIndex(this.signatureRunnerHandle, str);
        if (iNativeGetInputIndex != -1) {
            return iNativeGetInputIndex;
        }
        throw new IllegalArgumentException("Input error: input " + str + " not found.");
    }

    public int getOutputIndex(String str) {
        int iNativeGetOutputIndex = nativeGetOutputIndex(this.signatureRunnerHandle, str);
        if (iNativeGetOutputIndex != -1) {
            return iNativeGetOutputIndex;
        }
        throw new IllegalArgumentException("Input error: output " + str + " not found.");
    }

    public boolean resizeInput(String str, int[] iArr) {
        this.isMemoryAllocated = false;
        return nativeResizeInput(this.signatureRunnerHandle, this.errorHandle, str, iArr);
    }

    public void allocateTensorsIfNeeded() {
        if (this.isMemoryAllocated) {
            return;
        }
        nativeAllocateTensors(this.signatureRunnerHandle, this.errorHandle);
        this.isMemoryAllocated = true;
    }

    public void invoke() {
        nativeInvoke(this.signatureRunnerHandle, this.errorHandle);
    }
}
