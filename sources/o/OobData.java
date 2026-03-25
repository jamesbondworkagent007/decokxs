package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminSetUserSettingsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AccessibilityServiceInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class OobData implements BB<AccessibilityServiceInfo> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AccessibilityServiceInfo> continuation) throws java.lang.Throwable {
        AdminSetUserSettingsOperationDeserializer$deserialize$1 adminSetUserSettingsOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminSetUserSettingsOperationDeserializer$deserialize$1) {
            adminSetUserSettingsOperationDeserializer$deserialize$1 = (AdminSetUserSettingsOperationDeserializer$deserialize$1) continuation;
            int i = adminSetUserSettingsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminSetUserSettingsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminSetUserSettingsOperationDeserializer$deserialize$1 = new AdminSetUserSettingsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminSetUserSettingsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminSetUserSettingsOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminSetUserSettingsOperationDeserializer$deserialize$1.label = 1;
                if (BluetoothSap.copydefault(dt, c58859zS, adminSetUserSettingsOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                AccessibilityServiceInfo.Application application = new AccessibilityServiceInfo.Application();
                application.OLrzqt();
                return application.AEQbTJ();
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
