package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.UnlinkIdentityOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.RuntimePermission;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class RandomAccess implements BB<RuntimePermission> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super RuntimePermission> continuation) throws java.lang.Throwable {
        UnlinkIdentityOperationDeserializer$deserialize$1 unlinkIdentityOperationDeserializer$deserialize$1;
        if (continuation instanceof UnlinkIdentityOperationDeserializer$deserialize$1) {
            unlinkIdentityOperationDeserializer$deserialize$1 = (UnlinkIdentityOperationDeserializer$deserialize$1) continuation;
            int i = unlinkIdentityOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unlinkIdentityOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unlinkIdentityOperationDeserializer$deserialize$1 = new UnlinkIdentityOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unlinkIdentityOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unlinkIdentityOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                unlinkIdentityOperationDeserializer$deserialize$1.label = 1;
                if (Set.KWHzl(dt, c58859zS, unlinkIdentityOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                RuntimePermission.ActionBar actionBar = new RuntimePermission.ActionBar();
                actionBar.copydefault();
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
