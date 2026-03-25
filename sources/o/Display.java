package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.serde.GetRoleCredentialsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AttributeSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Display implements BB<AttributeSet> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AttributeSet> continuation) throws java.lang.Throwable {
        GetRoleCredentialsOperationDeserializer$deserialize$1 getRoleCredentialsOperationDeserializer$deserialize$1;
        AttributeSet.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof GetRoleCredentialsOperationDeserializer$deserialize$1) {
            getRoleCredentialsOperationDeserializer$deserialize$1 = (GetRoleCredentialsOperationDeserializer$deserialize$1) continuation;
            int i = getRoleCredentialsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRoleCredentialsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getRoleCredentialsOperationDeserializer$deserialize$1 = new GetRoleCredentialsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getRoleCredentialsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getRoleCredentialsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (AttributeSet.TaskDescription) getRoleCredentialsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ActionMode.EZpvd(taskDescription, bArr);
            }
            taskDescription.OLrzqt();
            return taskDescription.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getRoleCredentialsOperationDeserializer$deserialize$1.label = 1;
            if (ActionMode.KWHzl(dt, c58859zS, getRoleCredentialsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new AttributeSet.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getRoleCredentialsOperationDeserializer$deserialize$1.L$0 = taskDescription;
        getRoleCredentialsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getRoleCredentialsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.OLrzqt();
        return taskDescription.EZpvd();
    }
}
