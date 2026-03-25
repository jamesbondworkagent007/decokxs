package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteUserPoolDomainOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Dimension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ParceledListSlice implements BB<Dimension> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Dimension> continuation) throws java.lang.Throwable {
        DeleteUserPoolDomainOperationDeserializer$deserialize$1 deleteUserPoolDomainOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteUserPoolDomainOperationDeserializer$deserialize$1) {
            deleteUserPoolDomainOperationDeserializer$deserialize$1 = (DeleteUserPoolDomainOperationDeserializer$deserialize$1) continuation;
            int i = deleteUserPoolDomainOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteUserPoolDomainOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteUserPoolDomainOperationDeserializer$deserialize$1 = new DeleteUserPoolDomainOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteUserPoolDomainOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteUserPoolDomainOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteUserPoolDomainOperationDeserializer$deserialize$1.label = 1;
                if (PathPermission.OLrzqt(dt, c58859zS, deleteUserPoolDomainOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Dimension.ActionBar actionBar = new Dimension.ActionBar();
                actionBar.copydefault();
                return actionBar.EZpvd();
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
