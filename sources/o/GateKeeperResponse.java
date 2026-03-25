package o;

import aws.sdk.kotlin.services.comprehend.serde.DescribeFlywheelIterationOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NfcFServiceInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GateKeeperResponse implements BB<NfcFServiceInfo> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NfcFServiceInfo> continuation) throws java.lang.Throwable {
        DescribeFlywheelIterationOperationDeserializer$deserialize$1 describeFlywheelIterationOperationDeserializer$deserialize$1;
        NfcFServiceInfo.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof DescribeFlywheelIterationOperationDeserializer$deserialize$1) {
            describeFlywheelIterationOperationDeserializer$deserialize$1 = (DescribeFlywheelIterationOperationDeserializer$deserialize$1) continuation;
            int i = describeFlywheelIterationOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeFlywheelIterationOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeFlywheelIterationOperationDeserializer$deserialize$1 = new DescribeFlywheelIterationOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeFlywheelIterationOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeFlywheelIterationOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (NfcFServiceInfo.TaskDescription) describeFlywheelIterationOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                CameraPrewarmService.EZpvd(taskDescription, bArr);
            }
            taskDescription.KWHzl();
            return taskDescription.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeFlywheelIterationOperationDeserializer$deserialize$1.label = 1;
            if (CameraPrewarmService.OLrzqt(dt, c58859zS, describeFlywheelIterationOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new NfcFServiceInfo.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeFlywheelIterationOperationDeserializer$deserialize$1.L$0 = taskDescription;
        describeFlywheelIterationOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeFlywheelIterationOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        taskDescription.KWHzl();
        return taskDescription.EZpvd();
    }
}
