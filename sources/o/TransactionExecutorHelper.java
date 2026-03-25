package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminConfirmSignUpOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CipherInputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class TransactionExecutorHelper implements BB<CipherInputStream> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CipherInputStream> continuation) throws java.lang.Throwable {
        AdminConfirmSignUpOperationDeserializer$deserialize$1 adminConfirmSignUpOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminConfirmSignUpOperationDeserializer$deserialize$1) {
            adminConfirmSignUpOperationDeserializer$deserialize$1 = (AdminConfirmSignUpOperationDeserializer$deserialize$1) continuation;
            int i = adminConfirmSignUpOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminConfirmSignUpOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminConfirmSignUpOperationDeserializer$deserialize$1 = new AdminConfirmSignUpOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminConfirmSignUpOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminConfirmSignUpOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminConfirmSignUpOperationDeserializer$deserialize$1.label = 1;
                if (WindowVisibilityItem.OLrzqt(dt, c58859zS, adminConfirmSignUpOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                CipherInputStream.StateListAnimator stateListAnimator = new CipherInputStream.StateListAnimator();
                stateListAnimator.KWHzl();
                return stateListAnimator.copydefault();
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
