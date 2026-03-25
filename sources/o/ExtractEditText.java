package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UserNotConfirmedExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtractEditText implements BB<UserNotConfirmedException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UserNotConfirmedException> continuation) throws java.lang.Throwable {
        UserNotConfirmedExceptionDeserializer$deserialize$1 userNotConfirmedExceptionDeserializer$deserialize$1;
        UserNotConfirmedException.TaskDescription taskDescription;
        if (continuation instanceof UserNotConfirmedExceptionDeserializer$deserialize$1) {
            userNotConfirmedExceptionDeserializer$deserialize$1 = (UserNotConfirmedExceptionDeserializer$deserialize$1) continuation;
            int i = userNotConfirmedExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userNotConfirmedExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                userNotConfirmedExceptionDeserializer$deserialize$1 = new UserNotConfirmedExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = userNotConfirmedExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = userNotConfirmedExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UserNotConfirmedException.TaskDescription taskDescription2 = new UserNotConfirmedException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            userNotConfirmedExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            userNotConfirmedExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, userNotConfirmedExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (UserNotConfirmedException.TaskDescription) userNotConfirmedExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            IInputMethodSessionWrapper.AEQbTJ(taskDescription, bArr);
        }
        taskDescription.AEQbTJ();
        return taskDescription.EZpvd();
    }
}
