package aws.smithy.kotlin.runtime.serde;

import aws.smithy.kotlin.runtime.ClientException;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationException extends ClientException {
    public DeserializationException() {
    }

    public DeserializationException(String str) {
        super(str);
    }

    public DeserializationException(String str, Throwable th) {
        super(str, th);
    }

    public DeserializationException(Throwable th) {
        super(th);
    }
}
