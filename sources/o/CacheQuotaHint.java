package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminDisableProviderForUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.KeyGenerator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class CacheQuotaHint implements BB<KeyGenerator> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super KeyGenerator> continuation) throws java.lang.Throwable {
        AdminDisableProviderForUserOperationDeserializer$deserialize$1 adminDisableProviderForUserOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminDisableProviderForUserOperationDeserializer$deserialize$1) {
            adminDisableProviderForUserOperationDeserializer$deserialize$1 = (AdminDisableProviderForUserOperationDeserializer$deserialize$1) continuation;
            int i = adminDisableProviderForUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminDisableProviderForUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminDisableProviderForUserOperationDeserializer$deserialize$1 = new AdminDisableProviderForUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminDisableProviderForUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminDisableProviderForUserOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminDisableProviderForUserOperationDeserializer$deserialize$1.label = 1;
                if (EventList.EZpvd(dt, c58859zS, adminDisableProviderForUserOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                KeyGenerator.StateListAnimator stateListAnimator = new KeyGenerator.StateListAnimator();
                stateListAnimator.AEQbTJ();
                return stateListAnimator.KWHzl();
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
