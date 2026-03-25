package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteUserPoolClientOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ColorRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PackageParser implements BB<ColorRes> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ColorRes> continuation) throws java.lang.Throwable {
        DeleteUserPoolClientOperationDeserializer$deserialize$1 deleteUserPoolClientOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteUserPoolClientOperationDeserializer$deserialize$1) {
            deleteUserPoolClientOperationDeserializer$deserialize$1 = (DeleteUserPoolClientOperationDeserializer$deserialize$1) continuation;
            int i = deleteUserPoolClientOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteUserPoolClientOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteUserPoolClientOperationDeserializer$deserialize$1 = new DeleteUserPoolClientOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteUserPoolClientOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteUserPoolClientOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteUserPoolClientOperationDeserializer$deserialize$1.label = 1;
                if (PackageList.AEQbTJ(dt, c58859zS, deleteUserPoolClientOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                ColorRes.StateListAnimator stateListAnimator = new ColorRes.StateListAnimator();
                stateListAnimator.AEQbTJ();
                return stateListAnimator.EZpvd();
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
