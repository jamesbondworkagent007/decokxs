package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.TagResourceOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Type;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Comparator implements BB<Type> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Type> continuation) throws java.lang.Throwable {
        TagResourceOperationDeserializer$deserialize$1 tagResourceOperationDeserializer$deserialize$1;
        if (continuation instanceof TagResourceOperationDeserializer$deserialize$1) {
            tagResourceOperationDeserializer$deserialize$1 = (TagResourceOperationDeserializer$deserialize$1) continuation;
            int i = tagResourceOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tagResourceOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                tagResourceOperationDeserializer$deserialize$1 = new TagResourceOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = tagResourceOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tagResourceOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                tagResourceOperationDeserializer$deserialize$1.label = 1;
                if (Enumeration.AEQbTJ(dt, c58859zS, tagResourceOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Type.TaskDescription taskDescription = new Type.TaskDescription();
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
