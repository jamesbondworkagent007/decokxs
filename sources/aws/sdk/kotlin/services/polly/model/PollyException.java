package aws.sdk.kotlin.services.polly.model;

import aws.sdk.kotlin.runtime.AwsServiceException;

/* JADX INFO: loaded from: classes21.dex */
public class PollyException extends AwsServiceException {
    public PollyException() {
    }

    public PollyException(String str) {
        super(str);
    }

    public PollyException(String str, Throwable th) {
        super(str, th);
    }

    public PollyException(Throwable th) {
        super(th);
    }
}
