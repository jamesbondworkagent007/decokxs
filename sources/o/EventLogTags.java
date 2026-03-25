package o;

import aws.sdk.kotlin.services.comprehend.serde.ListTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ProcessHealthStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EventLogTags implements BB<ProcessHealthStats> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ProcessHealthStats> continuation) throws java.lang.Throwable {
        ListTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1 listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1;
        ProcessHealthStats.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof ListTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1) {
            listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1 = (ListTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1) continuation;
            int i = listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1 = new ListTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (ProcessHealthStats.ActionBar) listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                IconDrawableFactory.copydefault(actionBar, bArr);
            }
            actionBar.EZpvd();
            return actionBar.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1.label = 1;
            if (IconDrawableFactory.copydefault(dt, c58859zS, listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new ProcessHealthStats.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1.L$0 = actionBar;
        listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, listTargetedSentimentDetectionJobsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.EZpvd();
        return actionBar.KWHzl();
    }
}
