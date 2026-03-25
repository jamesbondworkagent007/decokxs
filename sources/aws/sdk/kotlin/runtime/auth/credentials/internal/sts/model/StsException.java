package aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model;

import aws.sdk.kotlin.runtime.AwsServiceException;

/* JADX INFO: loaded from: classes.dex */
public class StsException extends AwsServiceException {
    public StsException() {
    }

    public StsException(String str) {
        super(str);
    }

    public StsException(String str, Throwable th) {
        super(str, th);
    }

    public StsException(Throwable th) {
        super(th);
    }
}
