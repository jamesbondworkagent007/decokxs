package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ListUsersOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ListActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CaptureResult implements BB<ListActivity> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ListActivity> continuation) throws java.lang.Throwable {
        ListUsersOperationDeserializer$deserialize$1 listUsersOperationDeserializer$deserialize$1;
        ListActivity.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof ListUsersOperationDeserializer$deserialize$1) {
            listUsersOperationDeserializer$deserialize$1 = (ListUsersOperationDeserializer$deserialize$1) continuation;
            int i = listUsersOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listUsersOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listUsersOperationDeserializer$deserialize$1 = new ListUsersOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listUsersOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listUsersOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (ListActivity.TaskDescription) listUsersOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                DngCreator.OLrzqt(taskDescription, bArr);
            }
            taskDescription.OLrzqt();
            return taskDescription.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listUsersOperationDeserializer$deserialize$1.label = 1;
            if (DngCreator.EZpvd(dt, c58859zS, listUsersOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new ListActivity.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listUsersOperationDeserializer$deserialize$1.L$0 = taskDescription;
        listUsersOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listUsersOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.OLrzqt();
        return taskDescription.copydefault();
    }
}
