package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.TooManyRequestsException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.serde.TooManyRequestsExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class KeyEvent implements BB<TooManyRequestsException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TooManyRequestsException> continuation) throws java.lang.Throwable {
        TooManyRequestsExceptionDeserializer$deserialize$1 tooManyRequestsExceptionDeserializer$deserialize$1;
        TooManyRequestsException.StateListAnimator stateListAnimator;
        if (continuation instanceof TooManyRequestsExceptionDeserializer$deserialize$1) {
            tooManyRequestsExceptionDeserializer$deserialize$1 = (TooManyRequestsExceptionDeserializer$deserialize$1) continuation;
            int i = tooManyRequestsExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tooManyRequestsExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                tooManyRequestsExceptionDeserializer$deserialize$1 = new TooManyRequestsExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = tooManyRequestsExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tooManyRequestsExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            TooManyRequestsException.StateListAnimator stateListAnimator2 = new TooManyRequestsException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            tooManyRequestsExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            tooManyRequestsExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, tooManyRequestsExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (TooManyRequestsException.StateListAnimator) tooManyRequestsExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            DragAndDropPermissions.KWHzl(stateListAnimator, bArr);
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.copydefault();
    }
}
