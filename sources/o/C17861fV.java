package o;

import aws.sdk.kotlin.services.rekognition.serde.DistributeDatasetEntriesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.SelectionActionModeHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C17861fV implements BB<SelectionActionModeHelper> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super SelectionActionModeHelper> continuation) throws java.lang.Throwable {
        DistributeDatasetEntriesOperationDeserializer$deserialize$1 distributeDatasetEntriesOperationDeserializer$deserialize$1;
        if (continuation instanceof DistributeDatasetEntriesOperationDeserializer$deserialize$1) {
            distributeDatasetEntriesOperationDeserializer$deserialize$1 = (DistributeDatasetEntriesOperationDeserializer$deserialize$1) continuation;
            int i = distributeDatasetEntriesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                distributeDatasetEntriesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                distributeDatasetEntriesOperationDeserializer$deserialize$1 = new DistributeDatasetEntriesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = distributeDatasetEntriesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = distributeDatasetEntriesOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                distributeDatasetEntriesOperationDeserializer$deserialize$1.label = 1;
                if (C17888fW.KWHzl(dt, c58859zS, distributeDatasetEntriesOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                SelectionActionModeHelper.TaskDescription taskDescription = new SelectionActionModeHelper.TaskDescription();
                taskDescription.copydefault();
                return taskDescription.EZpvd();
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
