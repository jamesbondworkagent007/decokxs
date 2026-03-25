package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminUpdateUserAttributesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AccountManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SdpSapsRecord implements BB<AccountManager> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AccountManager> continuation) throws java.lang.Throwable {
        AdminUpdateUserAttributesOperationDeserializer$deserialize$1 adminUpdateUserAttributesOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminUpdateUserAttributesOperationDeserializer$deserialize$1) {
            adminUpdateUserAttributesOperationDeserializer$deserialize$1 = (AdminUpdateUserAttributesOperationDeserializer$deserialize$1) continuation;
            int i = adminUpdateUserAttributesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminUpdateUserAttributesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminUpdateUserAttributesOperationDeserializer$deserialize$1 = new AdminUpdateUserAttributesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminUpdateUserAttributesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminUpdateUserAttributesOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminUpdateUserAttributesOperationDeserializer$deserialize$1.label = 1;
                if (AdvertiseCallback.AEQbTJ(dt, c58859zS, adminUpdateUserAttributesOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                AccountManager.Activity activity = new AccountManager.Activity();
                activity.KWHzl();
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
