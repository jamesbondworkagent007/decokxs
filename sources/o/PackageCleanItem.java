package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteUserAttributesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CallbackExecutor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PackageCleanItem implements BB<CallbackExecutor> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CallbackExecutor> continuation) throws java.lang.Throwable {
        DeleteUserAttributesOperationDeserializer$deserialize$1 deleteUserAttributesOperationDeserializer$deserialize$1;
        if (continuation instanceof DeleteUserAttributesOperationDeserializer$deserialize$1) {
            deleteUserAttributesOperationDeserializer$deserialize$1 = (DeleteUserAttributesOperationDeserializer$deserialize$1) continuation;
            int i = deleteUserAttributesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteUserAttributesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteUserAttributesOperationDeserializer$deserialize$1 = new DeleteUserAttributesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = deleteUserAttributesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deleteUserAttributesOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                deleteUserAttributesOperationDeserializer$deserialize$1.label = 1;
                if (OrgApacheHttpLegacyUpdater.AEQbTJ(dt, c58859zS, deleteUserAttributesOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                CallbackExecutor.TaskDescription taskDescription = new CallbackExecutor.TaskDescription();
                taskDescription.OLrzqt();
                return taskDescription.KWHzl();
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
