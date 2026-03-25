package o;

import aws.sdk.kotlin.services.comprehend.serde.ListSentimentDetectionJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ServiceHealthStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DataUnit implements BB<ServiceHealthStats> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ServiceHealthStats> continuation) throws java.lang.Throwable {
        ListSentimentDetectionJobsOperationDeserializer$deserialize$1 listSentimentDetectionJobsOperationDeserializer$deserialize$1;
        ServiceHealthStats.Activity activity;
        byte[] bArr;
        if (continuation instanceof ListSentimentDetectionJobsOperationDeserializer$deserialize$1) {
            listSentimentDetectionJobsOperationDeserializer$deserialize$1 = (ListSentimentDetectionJobsOperationDeserializer$deserialize$1) continuation;
            int i = listSentimentDetectionJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listSentimentDetectionJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listSentimentDetectionJobsOperationDeserializer$deserialize$1 = new ListSentimentDetectionJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listSentimentDetectionJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listSentimentDetectionJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (ServiceHealthStats.Activity) listSentimentDetectionJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                DayOfMonthCursor.copydefault(activity, bArr);
            }
            activity.EZpvd();
            return activity.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listSentimentDetectionJobsOperationDeserializer$deserialize$1.label = 1;
            if (DayOfMonthCursor.OLrzqt(dt, c58859zS, listSentimentDetectionJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        activity = new ServiceHealthStats.Activity();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listSentimentDetectionJobsOperationDeserializer$deserialize$1.L$0 = activity;
        listSentimentDetectionJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listSentimentDetectionJobsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        activity.EZpvd();
        return activity.AEQbTJ();
    }
}
