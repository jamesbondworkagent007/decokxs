package o;

import aws.sdk.kotlin.services.comprehend.serde.StopTrainingDocumentClassifierOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PrintManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CollapsibleActionView implements BB<PrintManager> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PrintManager> continuation) throws java.lang.Throwable {
        StopTrainingDocumentClassifierOperationDeserializer$deserialize$1 stopTrainingDocumentClassifierOperationDeserializer$deserialize$1;
        if (continuation instanceof StopTrainingDocumentClassifierOperationDeserializer$deserialize$1) {
            stopTrainingDocumentClassifierOperationDeserializer$deserialize$1 = (StopTrainingDocumentClassifierOperationDeserializer$deserialize$1) continuation;
            int i = stopTrainingDocumentClassifierOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTrainingDocumentClassifierOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTrainingDocumentClassifierOperationDeserializer$deserialize$1 = new StopTrainingDocumentClassifierOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = stopTrainingDocumentClassifierOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = stopTrainingDocumentClassifierOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                stopTrainingDocumentClassifierOperationDeserializer$deserialize$1.label = 1;
                if (DisplayAdjustments.EZpvd(dt, c58859zS, stopTrainingDocumentClassifierOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                PrintManager.ActionBar actionBar = new PrintManager.ActionBar();
                actionBar.copydefault();
                return actionBar.OLrzqt();
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
