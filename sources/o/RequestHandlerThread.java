package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ResendConfirmationCodeOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ProfilerInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RequestHandlerThread implements BB<ProfilerInfo> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ProfilerInfo> continuation) throws java.lang.Throwable {
        ResendConfirmationCodeOperationDeserializer$deserialize$1 resendConfirmationCodeOperationDeserializer$deserialize$1;
        ProfilerInfo.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof ResendConfirmationCodeOperationDeserializer$deserialize$1) {
            resendConfirmationCodeOperationDeserializer$deserialize$1 = (ResendConfirmationCodeOperationDeserializer$deserialize$1) continuation;
            int i = resendConfirmationCodeOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resendConfirmationCodeOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                resendConfirmationCodeOperationDeserializer$deserialize$1 = new ResendConfirmationCodeOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = resendConfirmationCodeOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = resendConfirmationCodeOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ProfilerInfo.StateListAnimator) resendConfirmationCodeOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SurfaceTextureRenderer.OLrzqt(stateListAnimator, bArr);
            }
            stateListAnimator.AEQbTJ();
            return stateListAnimator.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            resendConfirmationCodeOperationDeserializer$deserialize$1.label = 1;
            if (SurfaceTextureRenderer.KWHzl(dt, c58859zS, resendConfirmationCodeOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new ProfilerInfo.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        resendConfirmationCodeOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        resendConfirmationCodeOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, resendConfirmationCodeOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.EZpvd();
    }
}
