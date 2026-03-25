package o;

import aws.sdk.kotlin.services.comprehend.serde.StopTrainingEntityRecognizerOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PrinterId;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DisplayListCanvas implements BB<PrinterId> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PrinterId> continuation) throws java.lang.Throwable {
        StopTrainingEntityRecognizerOperationDeserializer$deserialize$1 stopTrainingEntityRecognizerOperationDeserializer$deserialize$1;
        if (continuation instanceof StopTrainingEntityRecognizerOperationDeserializer$deserialize$1) {
            stopTrainingEntityRecognizerOperationDeserializer$deserialize$1 = (StopTrainingEntityRecognizerOperationDeserializer$deserialize$1) continuation;
            int i = stopTrainingEntityRecognizerOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopTrainingEntityRecognizerOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopTrainingEntityRecognizerOperationDeserializer$deserialize$1 = new StopTrainingEntityRecognizerOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = stopTrainingEntityRecognizerOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = stopTrainingEntityRecognizerOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                stopTrainingEntityRecognizerOperationDeserializer$deserialize$1.label = 1;
                if (FallbackEventHandler.KWHzl(dt, c58859zS, stopTrainingEntityRecognizerOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                PrinterId.Activity activity = new PrinterId.Activity();
                activity.EZpvd();
                return activity.copydefault();
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
