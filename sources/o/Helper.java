package o;

import aws.sdk.kotlin.services.polly.serde.DeleteLexiconOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.WindowInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Helper implements BB<WindowInfo> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super WindowInfo> continuation) throws java.lang.Throwable {
        DeleteLexiconOperationDeserializer$deserialize$1 deleteLexiconOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteLexiconOperationDeserializer$deserialize$1) {
            deleteLexiconOperationDeserializer$deserialize$1 = (DeleteLexiconOperationDeserializer$deserialize$1) continuation;
            int i = deleteLexiconOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteLexiconOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteLexiconOperationDeserializer$deserialize$1 = new DeleteLexiconOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteLexiconOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteLexiconOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteLexiconOperationDeserializer$deserialize$1.label = 1;
                if (AutofillManagerInternal.OLrzqt(dt, c58859zS, deleteLexiconOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                WindowInfo.TaskDescription taskDescription = new WindowInfo.TaskDescription();
                taskDescription.AEQbTJ();
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
