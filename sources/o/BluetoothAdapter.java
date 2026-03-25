package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminLinkProviderForUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.DHGenParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BluetoothAdapter implements BB<DHGenParameterSpec> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super DHGenParameterSpec> continuation) throws java.lang.Throwable {
        AdminLinkProviderForUserOperationDeserializer$deserialize$1 adminLinkProviderForUserOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminLinkProviderForUserOperationDeserializer$deserialize$1) {
            adminLinkProviderForUserOperationDeserializer$deserialize$1 = (AdminLinkProviderForUserOperationDeserializer$deserialize$1) continuation;
            int i = adminLinkProviderForUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminLinkProviderForUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminLinkProviderForUserOperationDeserializer$deserialize$1 = new AdminLinkProviderForUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminLinkProviderForUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminLinkProviderForUserOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminLinkProviderForUserOperationDeserializer$deserialize$1.label = 1;
                if (BluetoothClass.KWHzl(dt, c58859zS, adminLinkProviderForUserOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                DHGenParameterSpec.StateListAnimator stateListAnimator = new DHGenParameterSpec.StateListAnimator();
                stateListAnimator.copydefault();
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
