package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.PackedPolicyTooLargeException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.PackedPolicyTooLargeExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Externalizable implements BB<PackedPolicyTooLargeException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PackedPolicyTooLargeException> continuation) throws java.lang.Throwable {
        PackedPolicyTooLargeExceptionDeserializer$deserialize$1 packedPolicyTooLargeExceptionDeserializer$deserialize$1;
        PackedPolicyTooLargeException.TaskDescription taskDescription;
        if (continuation instanceof PackedPolicyTooLargeExceptionDeserializer$deserialize$1) {
            packedPolicyTooLargeExceptionDeserializer$deserialize$1 = (PackedPolicyTooLargeExceptionDeserializer$deserialize$1) continuation;
            int i = packedPolicyTooLargeExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                packedPolicyTooLargeExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                packedPolicyTooLargeExceptionDeserializer$deserialize$1 = new PackedPolicyTooLargeExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = packedPolicyTooLargeExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = packedPolicyTooLargeExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            PackedPolicyTooLargeException.TaskDescription taskDescription2 = new PackedPolicyTooLargeException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            packedPolicyTooLargeExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            packedPolicyTooLargeExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, packedPolicyTooLargeExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (PackedPolicyTooLargeException.TaskDescription) packedPolicyTooLargeExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            DataOutputStream.KWHzl(taskDescription, bArr);
        }
        taskDescription.KWHzl();
        return taskDescription.OLrzqt();
    }
}
