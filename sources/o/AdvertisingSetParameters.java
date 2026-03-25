package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminUserGlobalSignOutOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AccountManagerInternal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AdvertisingSetParameters implements BB<AccountManagerInternal> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AccountManagerInternal> continuation) throws java.lang.Throwable {
        AdminUserGlobalSignOutOperationDeserializer$deserialize$1 adminUserGlobalSignOutOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminUserGlobalSignOutOperationDeserializer$deserialize$1) {
            adminUserGlobalSignOutOperationDeserializer$deserialize$1 = (AdminUserGlobalSignOutOperationDeserializer$deserialize$1) continuation;
            int i = adminUserGlobalSignOutOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminUserGlobalSignOutOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminUserGlobalSignOutOperationDeserializer$deserialize$1 = new AdminUserGlobalSignOutOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminUserGlobalSignOutOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminUserGlobalSignOutOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminUserGlobalSignOutOperationDeserializer$deserialize$1.label = 1;
                if (BluetoothLeScanner.AEQbTJ(dt, c58859zS, adminUserGlobalSignOutOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                AccountManagerInternal.Application application = new AccountManagerInternal.Application();
                application.copydefault();
                return application.OLrzqt();
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
