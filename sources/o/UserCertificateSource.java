package o;

import aws.sdk.kotlin.services.comprehend.serde.DeleteDocumentClassifierOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.WakeupStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class UserCertificateSource implements BB<WakeupStats> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super WakeupStats> continuation) throws java.lang.Throwable {
        DeleteDocumentClassifierOperationDeserializer$deserialize$1 deleteDocumentClassifierOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteDocumentClassifierOperationDeserializer$deserialize$1) {
            deleteDocumentClassifierOperationDeserializer$deserialize$1 = (DeleteDocumentClassifierOperationDeserializer$deserialize$1) continuation;
            int i = deleteDocumentClassifierOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteDocumentClassifierOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteDocumentClassifierOperationDeserializer$deserialize$1 = new DeleteDocumentClassifierOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteDocumentClassifierOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteDocumentClassifierOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteDocumentClassifierOperationDeserializer$deserialize$1.label = 1;
                if (AutofillServiceHelper.copydefault(dt, c58859zS, deleteDocumentClassifierOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                WakeupStats.TaskDescription taskDescription = new WakeupStats.TaskDescription();
                taskDescription.OLrzqt();
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
