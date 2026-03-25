package o;

import aws.sdk.kotlin.services.rekognition.serde.DeleteDatasetOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ExpandableListView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C16498el implements BB<ExpandableListView> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ExpandableListView> continuation) throws java.lang.Throwable {
        DeleteDatasetOperationDeserializer$deserialize$1 deleteDatasetOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteDatasetOperationDeserializer$deserialize$1) {
            deleteDatasetOperationDeserializer$deserialize$1 = (DeleteDatasetOperationDeserializer$deserialize$1) continuation;
            int i = deleteDatasetOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteDatasetOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteDatasetOperationDeserializer$deserialize$1 = new DeleteDatasetOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteDatasetOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteDatasetOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteDatasetOperationDeserializer$deserialize$1.label = 1;
                if (C16710ep.EZpvd(dt, c58859zS, deleteDatasetOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                ExpandableListView.TaskDescription taskDescription = new ExpandableListView.TaskDescription();
                taskDescription.copydefault();
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
