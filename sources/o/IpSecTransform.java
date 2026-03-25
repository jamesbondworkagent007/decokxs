package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.VerifyUserAttributeOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ClientTransaction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class IpSecTransform implements BB<ClientTransaction> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ClientTransaction> continuation) throws java.lang.Throwable {
        VerifyUserAttributeOperationDeserializer$deserialize$1 verifyUserAttributeOperationDeserializer$deserialize$1;
        if (continuation instanceof VerifyUserAttributeOperationDeserializer$deserialize$1) {
            verifyUserAttributeOperationDeserializer$deserialize$1 = (VerifyUserAttributeOperationDeserializer$deserialize$1) continuation;
            int i = verifyUserAttributeOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyUserAttributeOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyUserAttributeOperationDeserializer$deserialize$1 = new VerifyUserAttributeOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = verifyUserAttributeOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = verifyUserAttributeOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                verifyUserAttributeOperationDeserializer$deserialize$1.label = 1;
                if (LocalServerSocket.KWHzl(dt, c58859zS, verifyUserAttributeOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                ClientTransaction.StateListAnimator stateListAnimator = new ClientTransaction.StateListAnimator();
                stateListAnimator.KWHzl();
                return stateListAnimator.AEQbTJ();
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
