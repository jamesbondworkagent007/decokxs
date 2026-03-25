package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.InvalidRequestException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.serde.InvalidRequestExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ContextThemeWrapper implements BB<InvalidRequestException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidRequestException> continuation) throws java.lang.Throwable {
        InvalidRequestExceptionDeserializer$deserialize$1 invalidRequestExceptionDeserializer$deserialize$1;
        InvalidRequestException.Application application;
        if (continuation instanceof InvalidRequestExceptionDeserializer$deserialize$1) {
            invalidRequestExceptionDeserializer$deserialize$1 = (InvalidRequestExceptionDeserializer$deserialize$1) continuation;
            int i = invalidRequestExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidRequestExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidRequestExceptionDeserializer$deserialize$1 = new InvalidRequestExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidRequestExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidRequestExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidRequestException.Application application2 = new InvalidRequestException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidRequestExceptionDeserializer$deserialize$1.L$0 = application2;
            invalidRequestExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidRequestExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (InvalidRequestException.Application) invalidRequestExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            ContextMenu.EZpvd(application, bArr);
        }
        application.OLrzqt();
        return application.copydefault();
    }
}
