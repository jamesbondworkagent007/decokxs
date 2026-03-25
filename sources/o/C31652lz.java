package o;

import aws.sdk.kotlin.services.rekognition.serde.StopStreamProcessorOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C8668bH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31652lz implements BB<C8668bH> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C8668bH> continuation) throws java.lang.Throwable {
        StopStreamProcessorOperationDeserializer$deserialize$1 stopStreamProcessorOperationDeserializer$deserialize$1;
        if (continuation instanceof StopStreamProcessorOperationDeserializer$deserialize$1) {
            stopStreamProcessorOperationDeserializer$deserialize$1 = (StopStreamProcessorOperationDeserializer$deserialize$1) continuation;
            int i = stopStreamProcessorOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopStreamProcessorOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopStreamProcessorOperationDeserializer$deserialize$1 = new StopStreamProcessorOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = stopStreamProcessorOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = stopStreamProcessorOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                stopStreamProcessorOperationDeserializer$deserialize$1.label = 1;
                if (C29779lA.KWHzl(dt, c58859zS, stopStreamProcessorOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C8668bH.TaskDescription taskDescription = new C8668bH.TaskDescription();
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
