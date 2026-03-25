package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserLambdaValidationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UserLambdaValidationExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IInputMethodWrapper implements BB<UserLambdaValidationException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UserLambdaValidationException> continuation) throws java.lang.Throwable {
        UserLambdaValidationExceptionDeserializer$deserialize$1 userLambdaValidationExceptionDeserializer$deserialize$1;
        UserLambdaValidationException.StateListAnimator stateListAnimator;
        if (continuation instanceof UserLambdaValidationExceptionDeserializer$deserialize$1) {
            userLambdaValidationExceptionDeserializer$deserialize$1 = (UserLambdaValidationExceptionDeserializer$deserialize$1) continuation;
            int i = userLambdaValidationExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userLambdaValidationExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                userLambdaValidationExceptionDeserializer$deserialize$1 = new UserLambdaValidationExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = userLambdaValidationExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = userLambdaValidationExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UserLambdaValidationException.StateListAnimator stateListAnimator2 = new UserLambdaValidationException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            userLambdaValidationExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            userLambdaValidationExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, userLambdaValidationExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (UserLambdaValidationException.StateListAnimator) userLambdaValidationExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            InputMethodService.OLrzqt(stateListAnimator, bArr);
        }
        stateListAnimator.copydefault();
        return stateListAnimator.KWHzl();
    }
}
