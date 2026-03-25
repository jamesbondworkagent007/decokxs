package aws.smithy.kotlin.runtime;

/* JADX INFO: loaded from: classes2.dex */
public class ClientException extends SdkBaseException {
    public ClientException() {
    }

    public ClientException(String str) {
        super(str);
    }

    public ClientException(String str, Throwable th) {
        super(str, th);
    }

    public ClientException(Throwable th) {
        super(th);
    }
}
