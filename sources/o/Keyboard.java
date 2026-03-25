package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UserNotFoundExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Keyboard implements BB<UserNotFoundException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UserNotFoundException> continuation) throws java.lang.Throwable {
        UserNotFoundExceptionDeserializer$deserialize$1 userNotFoundExceptionDeserializer$deserialize$1;
        UserNotFoundException.Activity activity;
        if (continuation instanceof UserNotFoundExceptionDeserializer$deserialize$1) {
            userNotFoundExceptionDeserializer$deserialize$1 = (UserNotFoundExceptionDeserializer$deserialize$1) continuation;
            int i = userNotFoundExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userNotFoundExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                userNotFoundExceptionDeserializer$deserialize$1 = new UserNotFoundExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = userNotFoundExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = userNotFoundExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UserNotFoundException.Activity activity2 = new UserNotFoundException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            userNotFoundExceptionDeserializer$deserialize$1.L$0 = activity2;
            userNotFoundExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, userNotFoundExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (UserNotFoundException.Activity) userNotFoundExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            KeyboardView.AEQbTJ(activity, bArr);
        }
        activity.copydefault();
        return activity.EZpvd();
    }
}
