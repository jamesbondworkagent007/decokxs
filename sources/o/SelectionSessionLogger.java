package o;

import aws.sdk.kotlin.services.polly.model.InvalidSampleRateException;
import aws.sdk.kotlin.services.polly.serde.InvalidSampleRateExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SelectionSessionLogger implements BB<InvalidSampleRateException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidSampleRateException> continuation) throws java.lang.Throwable {
        InvalidSampleRateExceptionDeserializer$deserialize$1 invalidSampleRateExceptionDeserializer$deserialize$1;
        InvalidSampleRateException.Activity activity;
        if (continuation instanceof InvalidSampleRateExceptionDeserializer$deserialize$1) {
            invalidSampleRateExceptionDeserializer$deserialize$1 = (InvalidSampleRateExceptionDeserializer$deserialize$1) continuation;
            int i = invalidSampleRateExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidSampleRateExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidSampleRateExceptionDeserializer$deserialize$1 = new InvalidSampleRateExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidSampleRateExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidSampleRateExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidSampleRateException.Activity activity2 = new InvalidSampleRateException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidSampleRateExceptionDeserializer$deserialize$1.L$0 = activity2;
            invalidSampleRateExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidSampleRateExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (InvalidSampleRateException.Activity) invalidSampleRateExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            TextClassificationConstants.copydefault(activity, bArr);
        }
        activity.copydefault();
        return activity.OLrzqt();
    }
}
