package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnsupportedGrantTypeException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.serde.UnsupportedGrantTypeExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityEvent implements BB<UnsupportedGrantTypeException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnsupportedGrantTypeException> continuation) throws java.lang.Throwable {
        UnsupportedGrantTypeExceptionDeserializer$deserialize$1 unsupportedGrantTypeExceptionDeserializer$deserialize$1;
        UnsupportedGrantTypeException.StateListAnimator stateListAnimator;
        if (continuation instanceof UnsupportedGrantTypeExceptionDeserializer$deserialize$1) {
            unsupportedGrantTypeExceptionDeserializer$deserialize$1 = (UnsupportedGrantTypeExceptionDeserializer$deserialize$1) continuation;
            int i = unsupportedGrantTypeExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsupportedGrantTypeExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unsupportedGrantTypeExceptionDeserializer$deserialize$1 = new UnsupportedGrantTypeExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unsupportedGrantTypeExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unsupportedGrantTypeExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnsupportedGrantTypeException.StateListAnimator stateListAnimator2 = new UnsupportedGrantTypeException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unsupportedGrantTypeExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            unsupportedGrantTypeExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unsupportedGrantTypeExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (UnsupportedGrantTypeException.StateListAnimator) unsupportedGrantTypeExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            Window.EZpvd(stateListAnimator, bArr);
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.EZpvd();
    }
}
