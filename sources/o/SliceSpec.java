package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminDeleteUserAttributesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ExemptionMechanism;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SliceSpec implements BB<ExemptionMechanism> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ExemptionMechanism> continuation) throws java.lang.Throwable {
        AdminDeleteUserAttributesOperationDeserializer$deserialize$1 adminDeleteUserAttributesOperationDeserializer$deserialize$1;
        if (continuation instanceof AdminDeleteUserAttributesOperationDeserializer$deserialize$1) {
            adminDeleteUserAttributesOperationDeserializer$deserialize$1 = (AdminDeleteUserAttributesOperationDeserializer$deserialize$1) continuation;
            int i = adminDeleteUserAttributesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminDeleteUserAttributesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                adminDeleteUserAttributesOperationDeserializer$deserialize$1 = new AdminDeleteUserAttributesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = adminDeleteUserAttributesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = adminDeleteUserAttributesOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                adminDeleteUserAttributesOperationDeserializer$deserialize$1.label = 1;
                if (DistroFormatVersion.copydefault(dt, c58859zS, adminDeleteUserAttributesOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                ExemptionMechanism.TaskDescription taskDescription = new ExemptionMechanism.TaskDescription();
                taskDescription.KWHzl();
                return taskDescription.OLrzqt();
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
