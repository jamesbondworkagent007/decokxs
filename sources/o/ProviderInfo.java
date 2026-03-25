package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteUserPoolOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CurrentTimeMillisLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ProviderInfo implements BB<CurrentTimeMillisLong> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CurrentTimeMillisLong> continuation) throws java.lang.Throwable {
        DeleteUserPoolOperationDeserializer$deserialize$1 deleteUserPoolOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteUserPoolOperationDeserializer$deserialize$1) {
            deleteUserPoolOperationDeserializer$deserialize$1 = (DeleteUserPoolOperationDeserializer$deserialize$1) continuation;
            int i = deleteUserPoolOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteUserPoolOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteUserPoolOperationDeserializer$deserialize$1 = new DeleteUserPoolOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteUserPoolOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteUserPoolOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteUserPoolOperationDeserializer$deserialize$1.label = 1;
                if (PermissionGroupInfo.OLrzqt(dt, c58859zS, deleteUserPoolOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                CurrentTimeMillisLong.ActionBar actionBar = new CurrentTimeMillisLong.ActionBar();
                actionBar.OLrzqt();
                return actionBar.copydefault();
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
