package o;

import aws.sdk.kotlin.services.comprehend.serde.DeleteResourcePolicyOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NdefMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FillEventHistory implements BB<NdefMessage> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NdefMessage> continuation) throws java.lang.Throwable {
        DeleteResourcePolicyOperationDeserializer$deserialize$1 deleteResourcePolicyOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteResourcePolicyOperationDeserializer$deserialize$1) {
            deleteResourcePolicyOperationDeserializer$deserialize$1 = (DeleteResourcePolicyOperationDeserializer$deserialize$1) continuation;
            int i = deleteResourcePolicyOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteResourcePolicyOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteResourcePolicyOperationDeserializer$deserialize$1 = new DeleteResourcePolicyOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteResourcePolicyOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteResourcePolicyOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteResourcePolicyOperationDeserializer$deserialize$1.label = 1;
                if (FillResponse.OLrzqt(dt, c58859zS, deleteResourcePolicyOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                NdefMessage.TaskDescription taskDescription = new NdefMessage.TaskDescription();
                taskDescription.AEQbTJ();
                return taskDescription.KWHzl();
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
