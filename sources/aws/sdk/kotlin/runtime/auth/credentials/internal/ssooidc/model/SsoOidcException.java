package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.sdk.kotlin.runtime.AwsServiceException;

/* JADX INFO: loaded from: classes.dex */
public class SsoOidcException extends AwsServiceException {
    public SsoOidcException() {
    }

    public SsoOidcException(String str) {
        super(str);
    }

    public SsoOidcException(String str, Throwable th) {
        super(str, th);
    }

    public SsoOidcException(Throwable th) {
        super(th);
    }
}
