package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserPoolOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.BackupObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class UsbInterface implements BB<BackupObserver> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BackupObserver> continuation) throws java.lang.Throwable {
        UpdateUserPoolOperationDeserializer$deserialize$1 updateUserPoolOperationDeserializer$deserialize$1;
        if (continuation instanceof UpdateUserPoolOperationDeserializer$deserialize$1) {
            updateUserPoolOperationDeserializer$deserialize$1 = (UpdateUserPoolOperationDeserializer$deserialize$1) continuation;
            int i = updateUserPoolOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateUserPoolOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateUserPoolOperationDeserializer$deserialize$1 = new UpdateUserPoolOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = updateUserPoolOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateUserPoolOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                updateUserPoolOperationDeserializer$deserialize$1.label = 1;
                if (UsbPort.EZpvd(dt, c58859zS, updateUserPoolOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                BackupObserver.TaskDescription taskDescription = new BackupObserver.TaskDescription();
                taskDescription.KWHzl();
                return taskDescription.OLrzqt();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
