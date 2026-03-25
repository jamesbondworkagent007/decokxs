package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.MalformedPolicyDocumentException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.MalformedPolicyDocumentExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class DataInputStream implements BB<MalformedPolicyDocumentException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MalformedPolicyDocumentException> continuation) throws java.lang.Throwable {
        MalformedPolicyDocumentExceptionDeserializer$deserialize$1 malformedPolicyDocumentExceptionDeserializer$deserialize$1;
        MalformedPolicyDocumentException.TaskDescription taskDescription;
        if (continuation instanceof MalformedPolicyDocumentExceptionDeserializer$deserialize$1) {
            malformedPolicyDocumentExceptionDeserializer$deserialize$1 = (MalformedPolicyDocumentExceptionDeserializer$deserialize$1) continuation;
            int i = malformedPolicyDocumentExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                malformedPolicyDocumentExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                malformedPolicyDocumentExceptionDeserializer$deserialize$1 = new MalformedPolicyDocumentExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = malformedPolicyDocumentExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = malformedPolicyDocumentExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            MalformedPolicyDocumentException.TaskDescription taskDescription2 = new MalformedPolicyDocumentException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            malformedPolicyDocumentExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            malformedPolicyDocumentExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, malformedPolicyDocumentExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (MalformedPolicyDocumentException.TaskDescription) malformedPolicyDocumentExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            Console.copydefault(taskDescription, bArr);
        }
        taskDescription.copydefault();
        return taskDescription.AEQbTJ();
    }
}
