package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminEnableUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.MacSpi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class NetworkStats implements BB<MacSpi> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MacSpi> continuation) throws java.lang.Throwable {
        AdminEnableUserOperationDeserializer$deserialize$1 adminEnableUserOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminEnableUserOperationDeserializer$deserialize$1) {
            adminEnableUserOperationDeserializer$deserialize$1 = (AdminEnableUserOperationDeserializer$deserialize$1) continuation;
            int i = adminEnableUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminEnableUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminEnableUserOperationDeserializer$deserialize$1 = new AdminEnableUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminEnableUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminEnableUserOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminEnableUserOperationDeserializer$deserialize$1.label = 1;
                if (UsageEvents.copydefault(dt, c58859zS, adminEnableUserOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                MacSpi.ActionBar actionBar = new MacSpi.ActionBar();
                actionBar.copydefault();
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
