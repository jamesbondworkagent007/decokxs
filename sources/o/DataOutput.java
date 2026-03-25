package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.InvalidIdentityTokenException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.InvalidIdentityTokenExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DataOutput implements BB<InvalidIdentityTokenException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidIdentityTokenException> continuation) throws java.lang.Throwable {
        InvalidIdentityTokenExceptionDeserializer$deserialize$1 invalidIdentityTokenExceptionDeserializer$deserialize$1;
        InvalidIdentityTokenException.StateListAnimator stateListAnimator;
        if (continuation instanceof InvalidIdentityTokenExceptionDeserializer$deserialize$1) {
            invalidIdentityTokenExceptionDeserializer$deserialize$1 = (InvalidIdentityTokenExceptionDeserializer$deserialize$1) continuation;
            int i = invalidIdentityTokenExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidIdentityTokenExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidIdentityTokenExceptionDeserializer$deserialize$1 = new InvalidIdentityTokenExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidIdentityTokenExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidIdentityTokenExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidIdentityTokenException.StateListAnimator stateListAnimator2 = new InvalidIdentityTokenException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidIdentityTokenExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            invalidIdentityTokenExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidIdentityTokenExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (InvalidIdentityTokenException.StateListAnimator) invalidIdentityTokenExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            DataInput.EZpvd(stateListAnimator, bArr);
        }
        stateListAnimator.copydefault();
        return stateListAnimator.EZpvd();
    }
}
