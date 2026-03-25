package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.InvalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Gesture implements BB<InvalidSmsRoleAccessPolicyException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidSmsRoleAccessPolicyException> continuation) throws java.lang.Throwable {
        InvalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1 invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1;
        InvalidSmsRoleAccessPolicyException.TaskDescription taskDescription;
        if (continuation instanceof InvalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1) {
            invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1 = (InvalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1) continuation;
            int i = invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1 = new InvalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidSmsRoleAccessPolicyException.TaskDescription taskDescription2 = new InvalidSmsRoleAccessPolicyException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (InvalidSmsRoleAccessPolicyException.TaskDescription) invalidSmsRoleAccessPolicyExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            GestureLibraries.copydefault(taskDescription, bArr);
        }
        taskDescription.OLrzqt();
        return taskDescription.EZpvd();
    }
}
