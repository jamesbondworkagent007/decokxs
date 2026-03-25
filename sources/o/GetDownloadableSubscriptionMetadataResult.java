package o;

import aws.sdk.kotlin.services.comprehend.serde.DescribeEventsDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.HostNfcFService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GetDownloadableSubscriptionMetadataResult implements BB<HostNfcFService> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super HostNfcFService> continuation) throws java.lang.Throwable {
        DescribeEventsDetectionJobOperationDeserializer$deserialize$1 describeEventsDetectionJobOperationDeserializer$deserialize$1;
        HostNfcFService.TaskDescription taskDescription;
        byte[] bArr;
        if (continuation instanceof DescribeEventsDetectionJobOperationDeserializer$deserialize$1) {
            describeEventsDetectionJobOperationDeserializer$deserialize$1 = (DescribeEventsDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = describeEventsDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                describeEventsDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                describeEventsDetectionJobOperationDeserializer$deserialize$1 = new DescribeEventsDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = describeEventsDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = describeEventsDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (HostNfcFService.TaskDescription) describeEventsDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                EuiccProfileInfo.OLrzqt(taskDescription, bArr);
            }
            taskDescription.KWHzl();
            return taskDescription.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            describeEventsDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (EuiccProfileInfo.KWHzl(dt, c58859zS, describeEventsDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        taskDescription = new HostNfcFService.TaskDescription();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        describeEventsDetectionJobOperationDeserializer$deserialize$1.L$0 = taskDescription;
        describeEventsDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, describeEventsDetectionJobOperationDeserializer$deserialize$1);
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
