package aws.sdk.kotlin.runtime;

import aws.smithy.kotlin.runtime.ServiceException;
import o.Rect;

/* JADX INFO: loaded from: classes.dex */
public class AwsServiceException extends ServiceException {
    private final Rect sdkErrorMetadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getSdkErrorMetadata()Lo/wL; */
    /* JADX DEBUG: Method merged with bridge method: getSdkErrorMetadata()Lo/wQ; */
    @Override // aws.smithy.kotlin.runtime.ServiceException, aws.smithy.kotlin.runtime.SdkBaseException
    public Rect getSdkErrorMetadata() {
        return this.sdkErrorMetadata;
    }

    public AwsServiceException() {
        this.sdkErrorMetadata = new Rect();
    }

    public AwsServiceException(String str) {
        super(str);
        this.sdkErrorMetadata = new Rect();
    }

    public AwsServiceException(String str, Throwable th) {
        super(str, th);
        this.sdkErrorMetadata = new Rect();
    }

    public AwsServiceException(Throwable th) {
        super(th);
        this.sdkErrorMetadata = new Rect();
    }
}
