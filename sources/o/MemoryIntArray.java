package o;

import aws.sdk.kotlin.services.comprehend.model.ResourceUnavailableException;
import aws.sdk.kotlin.services.comprehend.serde.ResourceUnavailableExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MemoryIntArray implements BB<ResourceUnavailableException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ResourceUnavailableException> continuation) throws java.lang.Throwable {
        ResourceUnavailableExceptionDeserializer$deserialize$1 resourceUnavailableExceptionDeserializer$deserialize$1;
        ResourceUnavailableException.TaskDescription taskDescription;
        if (continuation instanceof ResourceUnavailableExceptionDeserializer$deserialize$1) {
            resourceUnavailableExceptionDeserializer$deserialize$1 = (ResourceUnavailableExceptionDeserializer$deserialize$1) continuation;
            int i = resourceUnavailableExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resourceUnavailableExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                resourceUnavailableExceptionDeserializer$deserialize$1 = new ResourceUnavailableExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = resourceUnavailableExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resourceUnavailableExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ResourceUnavailableException.TaskDescription taskDescription2 = new ResourceUnavailableException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            resourceUnavailableExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            resourceUnavailableExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, resourceUnavailableExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (ResourceUnavailableException.TaskDescription) resourceUnavailableExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            MutableChar.EZpvd(taskDescription, bArr);
        }
        taskDescription.EZpvd();
        return taskDescription.copydefault();
    }
}
