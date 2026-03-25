package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminDisableUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Mac;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class NetworkStatsManager implements BB<Mac> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Mac> continuation) throws java.lang.Throwable {
        AdminDisableUserOperationDeserializer$deserialize$1 adminDisableUserOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminDisableUserOperationDeserializer$deserialize$1) {
            adminDisableUserOperationDeserializer$deserialize$1 = (AdminDisableUserOperationDeserializer$deserialize$1) continuation;
            int i = adminDisableUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminDisableUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminDisableUserOperationDeserializer$deserialize$1 = new AdminDisableUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminDisableUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminDisableUserOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminDisableUserOperationDeserializer$deserialize$1.label = 1;
                if (StorageStatsManager.KWHzl(dt, c58859zS, adminDisableUserOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Mac.Activity activity = new Mac.Activity();
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
