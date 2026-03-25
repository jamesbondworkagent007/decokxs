package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedTokenTypeException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UnsupportedTokenTypeExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextHubClient implements BB<UnsupportedTokenTypeException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnsupportedTokenTypeException> continuation) throws java.lang.Throwable {
        UnsupportedTokenTypeExceptionDeserializer$deserialize$1 unsupportedTokenTypeExceptionDeserializer$deserialize$1;
        UnsupportedTokenTypeException.Activity activity;
        if (continuation instanceof UnsupportedTokenTypeExceptionDeserializer$deserialize$1) {
            unsupportedTokenTypeExceptionDeserializer$deserialize$1 = (UnsupportedTokenTypeExceptionDeserializer$deserialize$1) continuation;
            int i = unsupportedTokenTypeExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsupportedTokenTypeExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unsupportedTokenTypeExceptionDeserializer$deserialize$1 = new UnsupportedTokenTypeExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unsupportedTokenTypeExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unsupportedTokenTypeExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnsupportedTokenTypeException.Activity activity2 = new UnsupportedTokenTypeException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unsupportedTokenTypeExceptionDeserializer$deserialize$1.L$0 = activity2;
            unsupportedTokenTypeExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unsupportedTokenTypeExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (UnsupportedTokenTypeException.Activity) unsupportedTokenTypeExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            ContextHubManager.EZpvd(activity, bArr);
        }
        activity.EZpvd();
        return activity.KWHzl();
    }
}
