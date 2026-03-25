package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteUserOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.FractionRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageBackwardCompatibility implements BB<FractionRes> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super FractionRes> continuation) throws java.lang.Throwable {
        DeleteUserOperationDeserializer$deserialize$1 deleteUserOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteUserOperationDeserializer$deserialize$1) {
            deleteUserOperationDeserializer$deserialize$1 = (DeleteUserOperationDeserializer$deserialize$1) continuation;
            int i = deleteUserOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteUserOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteUserOperationDeserializer$deserialize$1 = new DeleteUserOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteUserOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteUserOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteUserOperationDeserializer$deserialize$1.label = 1;
                if (PackageParserCacheHelper.copydefault(dt, c58859zS, deleteUserOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                FractionRes.StateListAnimator stateListAnimator = new FractionRes.StateListAnimator();
                stateListAnimator.EZpvd();
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
