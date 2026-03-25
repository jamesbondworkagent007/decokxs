package o;

import aws.sdk.kotlin.services.polly.model.InvalidS3BucketException;
import aws.sdk.kotlin.services.polly.serde.InvalidS3BucketExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SparseRectFArray implements BB<InvalidS3BucketException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidS3BucketException> continuation) throws java.lang.Throwable {
        InvalidS3BucketExceptionDeserializer$deserialize$1 invalidS3BucketExceptionDeserializer$deserialize$1;
        InvalidS3BucketException.Activity activity;
        if (continuation instanceof InvalidS3BucketExceptionDeserializer$deserialize$1) {
            invalidS3BucketExceptionDeserializer$deserialize$1 = (InvalidS3BucketExceptionDeserializer$deserialize$1) continuation;
            int i = invalidS3BucketExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidS3BucketExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidS3BucketExceptionDeserializer$deserialize$1 = new InvalidS3BucketExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidS3BucketExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidS3BucketExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidS3BucketException.Activity activity2 = new InvalidS3BucketException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidS3BucketExceptionDeserializer$deserialize$1.L$0 = activity2;
            invalidS3BucketExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidS3BucketExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (InvalidS3BucketException.Activity) invalidS3BucketExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            EntityConfidence.AEQbTJ(activity, bArr);
        }
        activity.copydefault();
        return activity.KWHzl();
    }
}
