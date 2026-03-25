package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.DeleteIdentityPoolOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Error;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class UnknownError implements BB<Error> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Error> continuation) throws java.lang.Throwable {
        DeleteIdentityPoolOperationDeserializer$deserialize$1 deleteIdentityPoolOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteIdentityPoolOperationDeserializer$deserialize$1) {
            deleteIdentityPoolOperationDeserializer$deserialize$1 = (DeleteIdentityPoolOperationDeserializer$deserialize$1) continuation;
            int i = deleteIdentityPoolOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteIdentityPoolOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteIdentityPoolOperationDeserializer$deserialize$1 = new DeleteIdentityPoolOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteIdentityPoolOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteIdentityPoolOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteIdentityPoolOperationDeserializer$deserialize$1.label = 1;
                if (UnsatisfiedLinkError.copydefault(dt, c58859zS, deleteIdentityPoolOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Error.StateListAnimator stateListAnimator = new Error.StateListAnimator();
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
