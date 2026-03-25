package o;

import aws.sdk.kotlin.services.rekognition.model.ResourceNotFoundException;
import aws.sdk.kotlin.services.rekognition.serde.ResourceNotFoundExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C26021jP implements BB<ResourceNotFoundException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ResourceNotFoundException> continuation) throws java.lang.Throwable {
        ResourceNotFoundExceptionDeserializer$deserialize$1 resourceNotFoundExceptionDeserializer$deserialize$1;
        ResourceNotFoundException.TaskDescription taskDescription;
        if (continuation instanceof ResourceNotFoundExceptionDeserializer$deserialize$1) {
            resourceNotFoundExceptionDeserializer$deserialize$1 = (ResourceNotFoundExceptionDeserializer$deserialize$1) continuation;
            int i = resourceNotFoundExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resourceNotFoundExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                resourceNotFoundExceptionDeserializer$deserialize$1 = new ResourceNotFoundExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = resourceNotFoundExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = resourceNotFoundExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ResourceNotFoundException.TaskDescription taskDescription2 = new ResourceNotFoundException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            resourceNotFoundExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            resourceNotFoundExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, resourceNotFoundExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (ResourceNotFoundException.TaskDescription) resourceNotFoundExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C25994jO.AEQbTJ(taskDescription, bArr);
        }
        taskDescription.KWHzl();
        return taskDescription.OLrzqt();
    }
}
