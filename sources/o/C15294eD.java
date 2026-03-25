package o;

import aws.sdk.kotlin.services.rekognition.serde.DeleteStreamProcessorOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Gallery;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C15294eD implements BB<Gallery> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Gallery> continuation) throws java.lang.Throwable {
        DeleteStreamProcessorOperationDeserializer$deserialize$1 deleteStreamProcessorOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteStreamProcessorOperationDeserializer$deserialize$1) {
            deleteStreamProcessorOperationDeserializer$deserialize$1 = (DeleteStreamProcessorOperationDeserializer$deserialize$1) continuation;
            int i = deleteStreamProcessorOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteStreamProcessorOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteStreamProcessorOperationDeserializer$deserialize$1 = new DeleteStreamProcessorOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteStreamProcessorOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteStreamProcessorOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteStreamProcessorOperationDeserializer$deserialize$1.label = 1;
                if (C15429eI.copydefault(dt, c58859zS, deleteStreamProcessorOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Gallery.TaskDescription taskDescription = new Gallery.TaskDescription();
                taskDescription.AEQbTJ();
                return taskDescription.copydefault();
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
