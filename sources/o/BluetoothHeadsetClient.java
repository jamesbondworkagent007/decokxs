package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminRemoveUserFromGroupOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.OAEPParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BluetoothHeadsetClient implements BB<OAEPParameterSpec> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super OAEPParameterSpec> continuation) throws java.lang.Throwable {
        AdminRemoveUserFromGroupOperationDeserializer$deserialize$1 adminRemoveUserFromGroupOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminRemoveUserFromGroupOperationDeserializer$deserialize$1) {
            adminRemoveUserFromGroupOperationDeserializer$deserialize$1 = (AdminRemoveUserFromGroupOperationDeserializer$deserialize$1) continuation;
            int i = adminRemoveUserFromGroupOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminRemoveUserFromGroupOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminRemoveUserFromGroupOperationDeserializer$deserialize$1 = new AdminRemoveUserFromGroupOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminRemoveUserFromGroupOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminRemoveUserFromGroupOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminRemoveUserFromGroupOperationDeserializer$deserialize$1.label = 1;
                if (BluetoothHealthCallback.KWHzl(dt, c58859zS, adminRemoveUserFromGroupOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                OAEPParameterSpec.Activity activity = new OAEPParameterSpec.Activity();
                activity.EZpvd();
                return activity.OLrzqt();
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
