package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminSetUserMFAPreferenceOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.RC5ParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class BluetoothManager implements BB<RC5ParameterSpec> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super RC5ParameterSpec> continuation) throws java.lang.Throwable {
        AdminSetUserMFAPreferenceOperationDeserializer$deserialize$1 adminSetUserMFAPreferenceOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminSetUserMFAPreferenceOperationDeserializer$deserialize$1) {
            adminSetUserMFAPreferenceOperationDeserializer$deserialize$1 = (AdminSetUserMFAPreferenceOperationDeserializer$deserialize$1) continuation;
            int i = adminSetUserMFAPreferenceOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminSetUserMFAPreferenceOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminSetUserMFAPreferenceOperationDeserializer$deserialize$1 = new AdminSetUserMFAPreferenceOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminSetUserMFAPreferenceOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminSetUserMFAPreferenceOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminSetUserMFAPreferenceOperationDeserializer$deserialize$1.label = 1;
                if (BluetoothInputStream.copydefault(dt, c58859zS, adminSetUserMFAPreferenceOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                RC5ParameterSpec.ActionBar actionBar = new RC5ParameterSpec.ActionBar();
                actionBar.AEQbTJ();
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
