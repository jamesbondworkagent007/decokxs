package o;

import aws.sdk.kotlin.services.polly.model.EngineNotSupportedException;
import aws.sdk.kotlin.services.polly.serde.EngineNotSupportedExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InputConnectionWrapper implements BB<EngineNotSupportedException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super EngineNotSupportedException> continuation) throws java.lang.Throwable {
        EngineNotSupportedExceptionDeserializer$deserialize$1 engineNotSupportedExceptionDeserializer$deserialize$1;
        EngineNotSupportedException.TaskDescription taskDescription;
        if (continuation instanceof EngineNotSupportedExceptionDeserializer$deserialize$1) {
            engineNotSupportedExceptionDeserializer$deserialize$1 = (EngineNotSupportedExceptionDeserializer$deserialize$1) continuation;
            int i = engineNotSupportedExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                engineNotSupportedExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                engineNotSupportedExceptionDeserializer$deserialize$1 = new EngineNotSupportedExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = engineNotSupportedExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = engineNotSupportedExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            EngineNotSupportedException.TaskDescription taskDescription2 = new EngineNotSupportedException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            engineNotSupportedExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            engineNotSupportedExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, engineNotSupportedExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (EngineNotSupportedException.TaskDescription) engineNotSupportedExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            InputConnectionInspector.copydefault(taskDescription, bArr);
        }
        taskDescription.copydefault();
        return taskDescription.AEQbTJ();
    }
}
