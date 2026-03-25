package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserAttributesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.BackupManagerMonitor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RadioMetadata implements BB<BackupManagerMonitor> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BackupManagerMonitor> continuation) throws java.lang.Throwable {
        UpdateUserAttributesOperationDeserializer$deserialize$1 updateUserAttributesOperationDeserializer$deserialize$1;
        BackupManagerMonitor.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof UpdateUserAttributesOperationDeserializer$deserialize$1) {
            updateUserAttributesOperationDeserializer$deserialize$1 = (UpdateUserAttributesOperationDeserializer$deserialize$1) continuation;
            int i = updateUserAttributesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateUserAttributesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateUserAttributesOperationDeserializer$deserialize$1 = new UpdateUserAttributesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = updateUserAttributesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = updateUserAttributesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (BackupManagerMonitor.TaskDescription) updateUserAttributesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                TunerCallbackAdapter.OLrzqt(taskDescription, bArr);
            }
            taskDescription.copydefault();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            updateUserAttributesOperationDeserializer$deserialize$1.label = 1;
            if (TunerCallbackAdapter.EZpvd(dt, c58859zS, updateUserAttributesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new BackupManagerMonitor.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        updateUserAttributesOperationDeserializer$deserialize$1.L$0 = taskDescription;
        updateUserAttributesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, updateUserAttributesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.copydefault();
        return taskDescription.KWHzl();
    }
}
