package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.InvalidClientException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.serde.InvalidClientExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OnUnhandledKeyEventListener implements BB<InvalidClientException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidClientException> continuation) throws java.lang.Throwable {
        InvalidClientExceptionDeserializer$deserialize$1 invalidClientExceptionDeserializer$deserialize$1;
        InvalidClientException.TaskDescription taskDescription;
        if (continuation instanceof InvalidClientExceptionDeserializer$deserialize$1) {
            invalidClientExceptionDeserializer$deserialize$1 = (InvalidClientExceptionDeserializer$deserialize$1) continuation;
            int i = invalidClientExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidClientExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidClientExceptionDeserializer$deserialize$1 = new InvalidClientExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidClientExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidClientExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidClientException.TaskDescription taskDescription2 = new InvalidClientException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidClientExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            invalidClientExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidClientExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (InvalidClientException.TaskDescription) invalidClientExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            ViewOutlineProvider.copydefault(taskDescription, bArr);
        }
        taskDescription.KWHzl();
        return taskDescription.copydefault();
    }
}
