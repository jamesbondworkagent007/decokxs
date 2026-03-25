package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteIdentityProviderOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.BoolRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InstantAppRequest implements BB<BoolRes> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BoolRes> continuation) throws java.lang.Throwable {
        DeleteIdentityProviderOperationDeserializer$deserialize$1 deleteIdentityProviderOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteIdentityProviderOperationDeserializer$deserialize$1) {
            deleteIdentityProviderOperationDeserializer$deserialize$1 = (DeleteIdentityProviderOperationDeserializer$deserialize$1) continuation;
            int i = deleteIdentityProviderOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteIdentityProviderOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteIdentityProviderOperationDeserializer$deserialize$1 = new DeleteIdentityProviderOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteIdentityProviderOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteIdentityProviderOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteIdentityProviderOperationDeserializer$deserialize$1.label = 1;
                if (IntentFilterVerificationInfo.copydefault(dt, c58859zS, deleteIdentityProviderOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                BoolRes.Activity activity = new BoolRes.Activity();
                activity.EZpvd();
                return activity.OLrzqt();
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
