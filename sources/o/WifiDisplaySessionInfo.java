package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.StopUserImportJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ConnectEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WifiDisplaySessionInfo implements BB<ConnectEvent> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ConnectEvent> continuation) throws java.lang.Throwable {
        StopUserImportJobOperationDeserializer$deserialize$1 stopUserImportJobOperationDeserializer$deserialize$1;
        ConnectEvent.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof StopUserImportJobOperationDeserializer$deserialize$1) {
            stopUserImportJobOperationDeserializer$deserialize$1 = (StopUserImportJobOperationDeserializer$deserialize$1) continuation;
            int i = stopUserImportJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopUserImportJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopUserImportJobOperationDeserializer$deserialize$1 = new StopUserImportJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = stopUserImportJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stopUserImportJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (ConnectEvent.TaskDescription) stopUserImportJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                VirtualDisplay.EZpvd(taskDescription, bArr);
            }
            taskDescription.AEQbTJ();
            return taskDescription.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            stopUserImportJobOperationDeserializer$deserialize$1.label = 1;
            if (VirtualDisplay.copydefault(dt, c58859zS, stopUserImportJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new ConnectEvent.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        stopUserImportJobOperationDeserializer$deserialize$1.L$0 = taskDescription;
        stopUserImportJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, stopUserImportJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.AEQbTJ();
        return taskDescription.KWHzl();
    }
}
