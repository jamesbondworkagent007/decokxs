package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.DescribeIdentityOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.FunctionalInterface;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Throwable implements BB<FunctionalInterface> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super FunctionalInterface> continuation) throws java.lang.Throwable {
        DescribeIdentityOperationDeserializer$deserialize$1 describeIdentityOperationDeserializer$deserialize$1;
        FunctionalInterface.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof DescribeIdentityOperationDeserializer$deserialize$1) {
            describeIdentityOperationDeserializer$deserialize$1 = (DescribeIdentityOperationDeserializer$deserialize$1) continuation;
            int i = describeIdentityOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeIdentityOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeIdentityOperationDeserializer$deserialize$1 = new DescribeIdentityOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeIdentityOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeIdentityOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (FunctionalInterface.TaskDescription) describeIdentityOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                VirtualMachineError.KWHzl(taskDescription, bArr);
            }
            taskDescription.EZpvd();
            return taskDescription.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeIdentityOperationDeserializer$deserialize$1.label = 1;
            if (VirtualMachineError.AEQbTJ(dt, c58859zS, describeIdentityOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new FunctionalInterface.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeIdentityOperationDeserializer$deserialize$1.L$0 = taskDescription;
        describeIdentityOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeIdentityOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.EZpvd();
        return taskDescription.AEQbTJ();
    }
}
