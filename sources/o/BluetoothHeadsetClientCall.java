package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminResetUserPasswordOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.PBEKeySpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BluetoothHeadsetClientCall implements BB<PBEKeySpec> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PBEKeySpec> continuation) throws java.lang.Throwable {
        AdminResetUserPasswordOperationDeserializer$deserialize$1 adminResetUserPasswordOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminResetUserPasswordOperationDeserializer$deserialize$1) {
            adminResetUserPasswordOperationDeserializer$deserialize$1 = (AdminResetUserPasswordOperationDeserializer$deserialize$1) continuation;
            int i = adminResetUserPasswordOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminResetUserPasswordOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminResetUserPasswordOperationDeserializer$deserialize$1 = new AdminResetUserPasswordOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminResetUserPasswordOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminResetUserPasswordOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminResetUserPasswordOperationDeserializer$deserialize$1.label = 1;
                if (BluetoothHidHost.OLrzqt(dt, c58859zS, adminResetUserPasswordOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                PBEKeySpec.StateListAnimator stateListAnimator = new PBEKeySpec.StateListAnimator();
                stateListAnimator.EZpvd();
                return stateListAnimator.AEQbTJ();
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
