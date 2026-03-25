package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.UsernameExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UsernameExistsExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IpSecAlgorithm implements BB<UsernameExistsException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UsernameExistsException> continuation) throws java.lang.Throwable {
        UsernameExistsExceptionDeserializer$deserialize$1 usernameExistsExceptionDeserializer$deserialize$1;
        UsernameExistsException.TaskDescription taskDescription;
        if (continuation instanceof UsernameExistsExceptionDeserializer$deserialize$1) {
            usernameExistsExceptionDeserializer$deserialize$1 = (UsernameExistsExceptionDeserializer$deserialize$1) continuation;
            int i = usernameExistsExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                usernameExistsExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                usernameExistsExceptionDeserializer$deserialize$1 = new UsernameExistsExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = usernameExistsExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = usernameExistsExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UsernameExistsException.TaskDescription taskDescription2 = new UsernameExistsException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            usernameExistsExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            usernameExistsExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, usernameExistsExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (UsernameExistsException.TaskDescription) usernameExistsExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            IpSecSpiResponse.AEQbTJ(taskDescription, bArr);
        }
        taskDescription.copydefault();
        return taskDescription.AEQbTJ();
    }
}
