package o;

import aws.sdk.kotlin.services.rekognition.serde.UpdateDatasetEntriesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C12813cu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C32887mm implements BB<C12813cu> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C12813cu> continuation) throws java.lang.Throwable {
        UpdateDatasetEntriesOperationDeserializer$deserialize$1 updateDatasetEntriesOperationDeserializer$deserialize$1;
        if (continuation instanceof UpdateDatasetEntriesOperationDeserializer$deserialize$1) {
            updateDatasetEntriesOperationDeserializer$deserialize$1 = (UpdateDatasetEntriesOperationDeserializer$deserialize$1) continuation;
            int i = updateDatasetEntriesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateDatasetEntriesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateDatasetEntriesOperationDeserializer$deserialize$1 = new UpdateDatasetEntriesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = updateDatasetEntriesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateDatasetEntriesOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                updateDatasetEntriesOperationDeserializer$deserialize$1.label = 1;
                if (C33258mt.OLrzqt(dt, c58859zS, updateDatasetEntriesOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C12813cu.TaskDescription taskDescription = new C12813cu.TaskDescription();
                taskDescription.EZpvd();
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
