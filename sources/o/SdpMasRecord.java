package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminUpdateDeviceStatusOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AccountAuthenticatorResponse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SdpMasRecord implements BB<AccountAuthenticatorResponse> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AccountAuthenticatorResponse> continuation) throws java.lang.Throwable {
        AdminUpdateDeviceStatusOperationDeserializer$deserialize$1 adminUpdateDeviceStatusOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminUpdateDeviceStatusOperationDeserializer$deserialize$1) {
            adminUpdateDeviceStatusOperationDeserializer$deserialize$1 = (AdminUpdateDeviceStatusOperationDeserializer$deserialize$1) continuation;
            int i = adminUpdateDeviceStatusOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminUpdateDeviceStatusOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminUpdateDeviceStatusOperationDeserializer$deserialize$1 = new AdminUpdateDeviceStatusOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminUpdateDeviceStatusOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminUpdateDeviceStatusOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminUpdateDeviceStatusOperationDeserializer$deserialize$1.label = 1;
                if (SdpRecord.EZpvd(dt, c58859zS, adminUpdateDeviceStatusOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                AccountAuthenticatorResponse.ActionBar actionBar = new AccountAuthenticatorResponse.ActionBar();
                actionBar.KWHzl();
                return actionBar.copydefault();
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
