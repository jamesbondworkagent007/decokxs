package o;

import aws.sdk.kotlin.services.rekognition.model.ServiceQuotaExceededException;
import aws.sdk.kotlin.services.rekognition.serde.ServiceQuotaExceededExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C29407kt implements BB<ServiceQuotaExceededException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ServiceQuotaExceededException> continuation) throws java.lang.Throwable {
        ServiceQuotaExceededExceptionDeserializer$deserialize$1 serviceQuotaExceededExceptionDeserializer$deserialize$1;
        ServiceQuotaExceededException.TaskDescription taskDescription;
        if (continuation instanceof ServiceQuotaExceededExceptionDeserializer$deserialize$1) {
            serviceQuotaExceededExceptionDeserializer$deserialize$1 = (ServiceQuotaExceededExceptionDeserializer$deserialize$1) continuation;
            int i = serviceQuotaExceededExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                serviceQuotaExceededExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                serviceQuotaExceededExceptionDeserializer$deserialize$1 = new ServiceQuotaExceededExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = serviceQuotaExceededExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = serviceQuotaExceededExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ServiceQuotaExceededException.TaskDescription taskDescription2 = new ServiceQuotaExceededException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            serviceQuotaExceededExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            serviceQuotaExceededExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, serviceQuotaExceededExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (ServiceQuotaExceededException.TaskDescription) serviceQuotaExceededExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C29248kq.EZpvd(taskDescription, bArr);
        }
        taskDescription.OLrzqt();
        return taskDescription.EZpvd();
    }
}
