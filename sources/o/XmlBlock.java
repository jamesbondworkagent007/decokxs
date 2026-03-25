package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.ExpiredCodeException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ExpiredCodeExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class XmlBlock implements BB<ExpiredCodeException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ExpiredCodeException> continuation) throws java.lang.Throwable {
        ExpiredCodeExceptionDeserializer$deserialize$1 expiredCodeExceptionDeserializer$deserialize$1;
        ExpiredCodeException.Activity activity;
        if (continuation instanceof ExpiredCodeExceptionDeserializer$deserialize$1) {
            expiredCodeExceptionDeserializer$deserialize$1 = (ExpiredCodeExceptionDeserializer$deserialize$1) continuation;
            int i = expiredCodeExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                expiredCodeExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                expiredCodeExceptionDeserializer$deserialize$1 = new ExpiredCodeExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = expiredCodeExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = expiredCodeExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ExpiredCodeException.Activity activity2 = new ExpiredCodeException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            expiredCodeExceptionDeserializer$deserialize$1.L$0 = activity2;
            expiredCodeExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, expiredCodeExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ExpiredCodeException.Activity) expiredCodeExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            StringBlock.OLrzqt(activity, bArr);
        }
        activity.OLrzqt();
        return activity.AEQbTJ();
    }
}
