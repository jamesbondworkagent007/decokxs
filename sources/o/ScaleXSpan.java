package o;

import aws.sdk.kotlin.services.comprehend.model.KmsKeyValidationException;
import aws.sdk.kotlin.services.comprehend.serde.KmsKeyValidationExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ScaleXSpan implements BB<KmsKeyValidationException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super KmsKeyValidationException> continuation) throws java.lang.Throwable {
        KmsKeyValidationExceptionDeserializer$deserialize$1 kmsKeyValidationExceptionDeserializer$deserialize$1;
        KmsKeyValidationException.TaskDescription taskDescription;
        if (continuation instanceof KmsKeyValidationExceptionDeserializer$deserialize$1) {
            kmsKeyValidationExceptionDeserializer$deserialize$1 = (KmsKeyValidationExceptionDeserializer$deserialize$1) continuation;
            int i = kmsKeyValidationExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kmsKeyValidationExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                kmsKeyValidationExceptionDeserializer$deserialize$1 = new KmsKeyValidationExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = kmsKeyValidationExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = kmsKeyValidationExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            KmsKeyValidationException.TaskDescription taskDescription2 = new KmsKeyValidationException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            kmsKeyValidationExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            kmsKeyValidationExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, kmsKeyValidationExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (KmsKeyValidationException.TaskDescription) kmsKeyValidationExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            SpellCheckSpan.EZpvd(taskDescription, bArr);
        }
        taskDescription.OLrzqt();
        return taskDescription.AEQbTJ();
    }
}
