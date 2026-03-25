package o;

import aws.sdk.kotlin.services.cognitoidentity.model.LimitExceededException;
import aws.sdk.kotlin.services.cognitoidentity.serde.LimitExceededExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class NoSuchAlgorithmException implements BB<LimitExceededException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super LimitExceededException> continuation) throws java.lang.Throwable {
        LimitExceededExceptionDeserializer$deserialize$1 limitExceededExceptionDeserializer$deserialize$1;
        LimitExceededException.ActionBar actionBar;
        if (continuation instanceof LimitExceededExceptionDeserializer$deserialize$1) {
            limitExceededExceptionDeserializer$deserialize$1 = (LimitExceededExceptionDeserializer$deserialize$1) continuation;
            int i = limitExceededExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                limitExceededExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                limitExceededExceptionDeserializer$deserialize$1 = new LimitExceededExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = limitExceededExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = limitExceededExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            LimitExceededException.ActionBar actionBar2 = new LimitExceededException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            limitExceededExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            limitExceededExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, limitExceededExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (LimitExceededException.ActionBar) limitExceededExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            Key.EZpvd(actionBar, bArr);
        }
        actionBar.EZpvd();
        return actionBar.KWHzl();
    }
}
