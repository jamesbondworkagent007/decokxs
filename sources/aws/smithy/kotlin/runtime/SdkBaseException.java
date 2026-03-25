package aws.smithy.kotlin.runtime;

import o.C52427wL;

/* JADX INFO: loaded from: classes2.dex */
public class SdkBaseException extends RuntimeException {
    private final C52427wL sdkErrorMetadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52427wL getSdkErrorMetadata() {
        return this.sdkErrorMetadata;
    }

    public SdkBaseException() {
        this.sdkErrorMetadata = new C52427wL();
    }

    public SdkBaseException(String str) {
        super(str);
        this.sdkErrorMetadata = new C52427wL();
    }

    public SdkBaseException(String str, Throwable th) {
        super(str, th);
        this.sdkErrorMetadata = new C52427wL();
    }

    public SdkBaseException(Throwable th) {
        super(th);
        this.sdkErrorMetadata = new C52427wL();
    }
}
