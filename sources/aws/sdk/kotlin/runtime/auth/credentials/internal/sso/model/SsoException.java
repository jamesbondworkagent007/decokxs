package aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model;

import aws.sdk.kotlin.runtime.AwsServiceException;

/* JADX INFO: loaded from: classes.dex */
public class SsoException extends AwsServiceException {
    public SsoException() {
    }

    public SsoException(String str) {
        super(str);
    }

    public SsoException(String str, Throwable th) {
        super(str, th);
    }

    public SsoException(Throwable th) {
        super(th);
    }
}
