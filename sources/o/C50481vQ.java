package o;

import aws.sdk.kotlin.services.translate.model.ServiceUnavailableException;
import aws.sdk.kotlin.services.translate.serde.ServiceUnavailableExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50481vQ implements BB<ServiceUnavailableException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ServiceUnavailableException> continuation) throws java.lang.Throwable {
        ServiceUnavailableExceptionDeserializer$deserialize$1 serviceUnavailableExceptionDeserializer$deserialize$1;
        ServiceUnavailableException.TaskDescription taskDescription;
        if (continuation instanceof ServiceUnavailableExceptionDeserializer$deserialize$1) {
            serviceUnavailableExceptionDeserializer$deserialize$1 = (ServiceUnavailableExceptionDeserializer$deserialize$1) continuation;
            int i = serviceUnavailableExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                serviceUnavailableExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                serviceUnavailableExceptionDeserializer$deserialize$1 = new ServiceUnavailableExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = serviceUnavailableExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = serviceUnavailableExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ServiceUnavailableException.TaskDescription taskDescription2 = new ServiceUnavailableException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            serviceUnavailableExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            serviceUnavailableExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, serviceUnavailableExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (ServiceUnavailableException.TaskDescription) serviceUnavailableExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C50373vM.AEQbTJ(taskDescription, bArr);
        }
        taskDescription.OLrzqt();
        return taskDescription.EZpvd();
    }
}
