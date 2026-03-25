package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.InvalidGrantException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.serde.InvalidGrantExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ViewGroup implements BB<InvalidGrantException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidGrantException> continuation) throws java.lang.Throwable {
        InvalidGrantExceptionDeserializer$deserialize$1 invalidGrantExceptionDeserializer$deserialize$1;
        InvalidGrantException.StateListAnimator stateListAnimator;
        if (continuation instanceof InvalidGrantExceptionDeserializer$deserialize$1) {
            invalidGrantExceptionDeserializer$deserialize$1 = (InvalidGrantExceptionDeserializer$deserialize$1) continuation;
            int i = invalidGrantExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidGrantExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidGrantExceptionDeserializer$deserialize$1 = new InvalidGrantExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidGrantExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidGrantExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidGrantException.StateListAnimator stateListAnimator2 = new InvalidGrantException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidGrantExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            invalidGrantExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidGrantExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (InvalidGrantException.StateListAnimator) invalidGrantExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            ViewManager.EZpvd(stateListAnimator, bArr);
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.AEQbTJ();
    }
}
