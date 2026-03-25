package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateDeviceStatusOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AssistStructure;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class GeofenceHardwareService implements BB<AssistStructure> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AssistStructure> continuation) throws java.lang.Throwable {
        UpdateDeviceStatusOperationDeserializer$deserialize$1 updateDeviceStatusOperationDeserializer$deserialize$1;
        if (continuation instanceof UpdateDeviceStatusOperationDeserializer$deserialize$1) {
            updateDeviceStatusOperationDeserializer$deserialize$1 = (UpdateDeviceStatusOperationDeserializer$deserialize$1) continuation;
            int i = updateDeviceStatusOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateDeviceStatusOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                updateDeviceStatusOperationDeserializer$deserialize$1 = new UpdateDeviceStatusOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = updateDeviceStatusOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateDeviceStatusOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                updateDeviceStatusOperationDeserializer$deserialize$1.label = 1;
                if (MemoryRegion.KWHzl(dt, c58859zS, updateDeviceStatusOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                AssistStructure.ActionBar actionBar = new AssistStructure.ActionBar();
                actionBar.OLrzqt();
                return actionBar.EZpvd();
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
