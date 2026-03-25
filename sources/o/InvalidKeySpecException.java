package o;

import aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException;
import aws.sdk.kotlin.services.cognitoidentity.serde.NotAuthorizedExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidKeySpecException implements BB<NotAuthorizedException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NotAuthorizedException> continuation) throws java.lang.Throwable {
        NotAuthorizedExceptionDeserializer$deserialize$1 notAuthorizedExceptionDeserializer$deserialize$1;
        NotAuthorizedException.TaskDescription taskDescription;
        if (continuation instanceof NotAuthorizedExceptionDeserializer$deserialize$1) {
            notAuthorizedExceptionDeserializer$deserialize$1 = (NotAuthorizedExceptionDeserializer$deserialize$1) continuation;
            int i = notAuthorizedExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notAuthorizedExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                notAuthorizedExceptionDeserializer$deserialize$1 = new NotAuthorizedExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = notAuthorizedExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = notAuthorizedExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            NotAuthorizedException.TaskDescription taskDescription2 = new NotAuthorizedException.TaskDescription();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            notAuthorizedExceptionDeserializer$deserialize$1.L$0 = taskDescription2;
            notAuthorizedExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, notAuthorizedExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            taskDescription = taskDescription2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription = (NotAuthorizedException.TaskDescription) notAuthorizedExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            KeySpec.OLrzqt(taskDescription, bArr);
        }
        taskDescription.OLrzqt();
        return taskDescription.AEQbTJ();
    }
}
