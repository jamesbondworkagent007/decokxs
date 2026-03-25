package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminSetUserPasswordOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AccessibilityService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class BluetoothPan implements BB<AccessibilityService> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AccessibilityService> continuation) throws java.lang.Throwable {
        AdminSetUserPasswordOperationDeserializer$deserialize$1 adminSetUserPasswordOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminSetUserPasswordOperationDeserializer$deserialize$1) {
            adminSetUserPasswordOperationDeserializer$deserialize$1 = (AdminSetUserPasswordOperationDeserializer$deserialize$1) continuation;
            int i = adminSetUserPasswordOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminSetUserPasswordOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminSetUserPasswordOperationDeserializer$deserialize$1 = new AdminSetUserPasswordOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminSetUserPasswordOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminSetUserPasswordOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminSetUserPasswordOperationDeserializer$deserialize$1.label = 1;
                if (BluetoothPbap.copydefault(dt, c58859zS, adminSetUserPasswordOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                AccessibilityService.ActionBar actionBar = new AccessibilityService.ActionBar();
                actionBar.KWHzl();
                return actionBar.AEQbTJ();
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
