package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ConfirmForgotPasswordOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.KeyframeSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CursorLoader implements BB<KeyframeSet> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super KeyframeSet> continuation) throws java.lang.Throwable {
        ConfirmForgotPasswordOperationDeserializer$deserialize$1 confirmForgotPasswordOperationDeserializer$deserialize$1;
        if (continuation instanceof ConfirmForgotPasswordOperationDeserializer$deserialize$1) {
            confirmForgotPasswordOperationDeserializer$deserialize$1 = (ConfirmForgotPasswordOperationDeserializer$deserialize$1) continuation;
            int i = confirmForgotPasswordOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                confirmForgotPasswordOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                confirmForgotPasswordOperationDeserializer$deserialize$1 = new ConfirmForgotPasswordOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = confirmForgotPasswordOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = confirmForgotPasswordOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                confirmForgotPasswordOperationDeserializer$deserialize$1.label = 1;
                if (IContentProvider.copydefault(dt, c58859zS, confirmForgotPasswordOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                KeyframeSet.ActionBar actionBar = new KeyframeSet.ActionBar();
                actionBar.EZpvd();
                return actionBar.KWHzl();
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
