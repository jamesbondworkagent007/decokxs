package aws.smithy.kotlin.runtime.serde;

import aws.smithy.kotlin.runtime.ClientException;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializationException extends ClientException {
    public SerializationException() {
    }

    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(String str, Throwable th) {
        super(str, th);
    }

    public SerializationException(Throwable th) {
        super(th);
    }
}
