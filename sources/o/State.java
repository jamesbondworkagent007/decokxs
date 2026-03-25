package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.DeleteIdentitiesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Deprecated;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class State implements BB<Deprecated> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Deprecated> continuation) throws java.lang.Throwable {
        DeleteIdentitiesOperationDeserializer$deserialize$1 deleteIdentitiesOperationDeserializer$deserialize$1;
        Deprecated.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof DeleteIdentitiesOperationDeserializer$deserialize$1) {
            deleteIdentitiesOperationDeserializer$deserialize$1 = (DeleteIdentitiesOperationDeserializer$deserialize$1) continuation;
            int i = deleteIdentitiesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteIdentitiesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteIdentitiesOperationDeserializer$deserialize$1 = new DeleteIdentitiesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = deleteIdentitiesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deleteIdentitiesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (Deprecated.TaskDescription) deleteIdentitiesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                UncaughtExceptionHandler.AEQbTJ(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            deleteIdentitiesOperationDeserializer$deserialize$1.label = 1;
            if (UncaughtExceptionHandler.copydefault(dt, c58859zS, deleteIdentitiesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new Deprecated.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        deleteIdentitiesOperationDeserializer$deserialize$1.L$0 = taskDescription;
        deleteIdentitiesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteIdentitiesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.AEQbTJ();
        return taskDescription.copydefault();
    }
}
