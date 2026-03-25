package o;

import aws.sdk.kotlin.services.comprehend.serde.DeleteEntityRecognizerOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NsdServiceInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CharSequenceTransformation implements BB<NsdServiceInfo> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NsdServiceInfo> continuation) throws java.lang.Throwable {
        DeleteEntityRecognizerOperationDeserializer$deserialize$1 deleteEntityRecognizerOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteEntityRecognizerOperationDeserializer$deserialize$1) {
            deleteEntityRecognizerOperationDeserializer$deserialize$1 = (DeleteEntityRecognizerOperationDeserializer$deserialize$1) continuation;
            int i = deleteEntityRecognizerOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteEntityRecognizerOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteEntityRecognizerOperationDeserializer$deserialize$1 = new DeleteEntityRecognizerOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteEntityRecognizerOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteEntityRecognizerOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteEntityRecognizerOperationDeserializer$deserialize$1.label = 1;
                if (BatchUpdates.EZpvd(dt, c58859zS, deleteEntityRecognizerOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                NsdServiceInfo.ActionBar actionBar = new NsdServiceInfo.ActionBar();
                actionBar.KWHzl();
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
