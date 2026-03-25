package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteResourceServerOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CheckResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MacAuthenticatedInputStream implements BB<CheckResult> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CheckResult> continuation) throws java.lang.Throwable {
        DeleteResourceServerOperationDeserializer$deserialize$1 deleteResourceServerOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteResourceServerOperationDeserializer$deserialize$1) {
            deleteResourceServerOperationDeserializer$deserialize$1 = (DeleteResourceServerOperationDeserializer$deserialize$1) continuation;
            int i = deleteResourceServerOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteResourceServerOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteResourceServerOperationDeserializer$deserialize$1 = new DeleteResourceServerOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteResourceServerOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteResourceServerOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteResourceServerOperationDeserializer$deserialize$1.label = 1;
                if (LauncherActivityInfo.AEQbTJ(dt, c58859zS, deleteResourceServerOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                CheckResult.TaskDescription taskDescription = new CheckResult.TaskDescription();
                taskDescription.EZpvd();
                return taskDescription.AEQbTJ();
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
