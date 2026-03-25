package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UnsupportedIdentityProviderExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ActivityChangedEvent implements BB<UnsupportedIdentityProviderException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnsupportedIdentityProviderException> continuation) throws java.lang.Throwable {
        UnsupportedIdentityProviderExceptionDeserializer$deserialize$1 unsupportedIdentityProviderExceptionDeserializer$deserialize$1;
        UnsupportedIdentityProviderException.StateListAnimator stateListAnimator;
        if (continuation instanceof UnsupportedIdentityProviderExceptionDeserializer$deserialize$1) {
            unsupportedIdentityProviderExceptionDeserializer$deserialize$1 = (UnsupportedIdentityProviderExceptionDeserializer$deserialize$1) continuation;
            int i = unsupportedIdentityProviderExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsupportedIdentityProviderExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unsupportedIdentityProviderExceptionDeserializer$deserialize$1 = new UnsupportedIdentityProviderExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unsupportedIdentityProviderExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unsupportedIdentityProviderExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnsupportedIdentityProviderException.StateListAnimator stateListAnimator2 = new UnsupportedIdentityProviderException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unsupportedIdentityProviderExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            unsupportedIdentityProviderExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unsupportedIdentityProviderExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (UnsupportedIdentityProviderException.StateListAnimator) unsupportedIdentityProviderExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            TouchCalibration.copydefault(stateListAnimator, bArr);
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.KWHzl();
    }
}
