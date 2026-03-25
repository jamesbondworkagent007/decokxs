package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminAddUserToGroupOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AEADBadTagException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ObjectPool implements BB<AEADBadTagException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AEADBadTagException> continuation) throws java.lang.Throwable {
        AdminAddUserToGroupOperationDeserializer$deserialize$1 adminAddUserToGroupOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminAddUserToGroupOperationDeserializer$deserialize$1) {
            adminAddUserToGroupOperationDeserializer$deserialize$1 = (AdminAddUserToGroupOperationDeserializer$deserialize$1) continuation;
            int i = adminAddUserToGroupOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminAddUserToGroupOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminAddUserToGroupOperationDeserializer$deserialize$1 = new AdminAddUserToGroupOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminAddUserToGroupOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminAddUserToGroupOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminAddUserToGroupOperationDeserializer$deserialize$1.label = 1;
                if (ResumeActivityItem.KWHzl(dt, c58859zS, adminAddUserToGroupOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                AEADBadTagException.Application application = new AEADBadTagException.Application();
                application.OLrzqt();
                return application.AEQbTJ();
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
