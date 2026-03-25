package o;

import aws.sdk.kotlin.services.translate.model.InvalidFilterException;
import aws.sdk.kotlin.services.translate.serde.InvalidFilterExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48643uZ implements BB<InvalidFilterException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidFilterException> continuation) throws java.lang.Throwable {
        InvalidFilterExceptionDeserializer$deserialize$1 invalidFilterExceptionDeserializer$deserialize$1;
        InvalidFilterException.TaskDescription taskDescription;
        if (continuation instanceof InvalidFilterExceptionDeserializer$deserialize$1) {
            invalidFilterExceptionDeserializer$deserialize$1 = (InvalidFilterExceptionDeserializer$deserialize$1) continuation;
            int i = invalidFilterExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidFilterExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidFilterExceptionDeserializer$deserialize$1 = new InvalidFilterExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidFilterExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidFilterExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidFilterException.TaskDescription taskDescription2 = new InvalidFilterException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidFilterExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            invalidFilterExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidFilterExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (InvalidFilterException.TaskDescription) invalidFilterExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C50857vc.EZpvd(taskDescription, bArr);
        }
        taskDescription.EZpvd();
        return taskDescription.OLrzqt();
    }
}
