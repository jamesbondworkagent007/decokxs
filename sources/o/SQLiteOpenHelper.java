package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.GroupExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.GroupExistsExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SQLiteOpenHelper implements BB<GroupExistsException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super GroupExistsException> continuation) throws java.lang.Throwable {
        GroupExistsExceptionDeserializer$deserialize$1 groupExistsExceptionDeserializer$deserialize$1;
        GroupExistsException.TaskDescription taskDescription;
        if (continuation instanceof GroupExistsExceptionDeserializer$deserialize$1) {
            groupExistsExceptionDeserializer$deserialize$1 = (GroupExistsExceptionDeserializer$deserialize$1) continuation;
            int i = groupExistsExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupExistsExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                groupExistsExceptionDeserializer$deserialize$1 = new GroupExistsExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = groupExistsExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupExistsExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            GroupExistsException.TaskDescription taskDescription2 = new GroupExistsException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            groupExistsExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            groupExistsExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, groupExistsExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (GroupExistsException.TaskDescription) groupExistsExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            SQLiteProgram.EZpvd(taskDescription, bArr);
        }
        taskDescription.copydefault();
        return taskDescription.AEQbTJ();
    }
}
