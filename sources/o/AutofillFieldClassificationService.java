package o;

import aws.sdk.kotlin.services.comprehend.serde.DeleteEndpointOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.WakeupEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AutofillFieldClassificationService implements BB<WakeupEvent> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super WakeupEvent> continuation) throws java.lang.Throwable {
        DeleteEndpointOperationDeserializer$deserialize$1 deleteEndpointOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteEndpointOperationDeserializer$deserialize$1) {
            deleteEndpointOperationDeserializer$deserialize$1 = (DeleteEndpointOperationDeserializer$deserialize$1) continuation;
            int i = deleteEndpointOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteEndpointOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteEndpointOperationDeserializer$deserialize$1 = new DeleteEndpointOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteEndpointOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteEndpointOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteEndpointOperationDeserializer$deserialize$1.label = 1;
                if (AutofillServiceInfo.OLrzqt(dt, c58859zS, deleteEndpointOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                WakeupEvent.Activity activity = new WakeupEvent.Activity();
                activity.AEQbTJ();
                return activity.EZpvd();
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
