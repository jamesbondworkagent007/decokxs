package o;

import aws.sdk.kotlin.services.cognitoidentity.model.InternalErrorException;
import aws.sdk.kotlin.services.cognitoidentity.serde.InternalErrorExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Watchable implements BB<InternalErrorException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InternalErrorException> continuation) throws java.lang.Throwable {
        InternalErrorExceptionDeserializer$deserialize$1 internalErrorExceptionDeserializer$deserialize$1;
        InternalErrorException.Application application;
        if (continuation instanceof InternalErrorExceptionDeserializer$deserialize$1) {
            internalErrorExceptionDeserializer$deserialize$1 = (InternalErrorExceptionDeserializer$deserialize$1) continuation;
            int i = internalErrorExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                internalErrorExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                internalErrorExceptionDeserializer$deserialize$1 = new InternalErrorExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = internalErrorExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = internalErrorExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InternalErrorException.Application application2 = new InternalErrorException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            internalErrorExceptionDeserializer$deserialize$1.L$0 = application2;
            internalErrorExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, internalErrorExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (InternalErrorException.Application) internalErrorExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            BasicPermission.copydefault(application, bArr);
        }
        application.OLrzqt();
        return application.KWHzl();
    }
}
