package o;

import aws.sdk.kotlin.services.comprehend.model.JobNotFoundException;
import aws.sdk.kotlin.services.comprehend.serde.JobNotFoundExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class QuoteSpan implements BB<JobNotFoundException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super JobNotFoundException> continuation) throws java.lang.Throwable {
        JobNotFoundExceptionDeserializer$deserialize$1 jobNotFoundExceptionDeserializer$deserialize$1;
        JobNotFoundException.TaskDescription taskDescription;
        if (continuation instanceof JobNotFoundExceptionDeserializer$deserialize$1) {
            jobNotFoundExceptionDeserializer$deserialize$1 = (JobNotFoundExceptionDeserializer$deserialize$1) continuation;
            int i = jobNotFoundExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jobNotFoundExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                jobNotFoundExceptionDeserializer$deserialize$1 = new JobNotFoundExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = jobNotFoundExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = jobNotFoundExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            JobNotFoundException.TaskDescription taskDescription2 = new JobNotFoundException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            jobNotFoundExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            jobNotFoundExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, jobNotFoundExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (JobNotFoundException.TaskDescription) jobNotFoundExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            MetricAffectingSpan.KWHzl(taskDescription, bArr);
        }
        taskDescription.EZpvd();
        return taskDescription.copydefault();
    }
}
