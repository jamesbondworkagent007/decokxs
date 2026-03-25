package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.PreconditionNotMetException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.PreconditionNotMetExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LegacyFaceDetectMapper implements BB<PreconditionNotMetException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super PreconditionNotMetException> continuation) throws java.lang.Throwable {
        PreconditionNotMetExceptionDeserializer$deserialize$1 preconditionNotMetExceptionDeserializer$deserialize$1;
        PreconditionNotMetException.TaskDescription taskDescription;
        if (continuation instanceof PreconditionNotMetExceptionDeserializer$deserialize$1) {
            preconditionNotMetExceptionDeserializer$deserialize$1 = (PreconditionNotMetExceptionDeserializer$deserialize$1) continuation;
            int i = preconditionNotMetExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preconditionNotMetExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                preconditionNotMetExceptionDeserializer$deserialize$1 = new PreconditionNotMetExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = preconditionNotMetExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preconditionNotMetExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            PreconditionNotMetException.TaskDescription taskDescription2 = new PreconditionNotMetException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            preconditionNotMetExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            preconditionNotMetExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, preconditionNotMetExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (PreconditionNotMetException.TaskDescription) preconditionNotMetExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            LegacyRequestMapper.AEQbTJ(taskDescription, bArr);
        }
        taskDescription.KWHzl();
        return taskDescription.AEQbTJ();
    }
}
