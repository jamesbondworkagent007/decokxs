package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.EnableSoftwareTokenMfaException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.EnableSoftwareTokenMfaExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ObbInfo implements BB<EnableSoftwareTokenMfaException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super EnableSoftwareTokenMfaException> continuation) throws java.lang.Throwable {
        EnableSoftwareTokenMfaExceptionDeserializer$deserialize$1 enableSoftwareTokenMfaExceptionDeserializer$deserialize$1;
        EnableSoftwareTokenMfaException.Application application;
        if (continuation instanceof EnableSoftwareTokenMfaExceptionDeserializer$deserialize$1) {
            enableSoftwareTokenMfaExceptionDeserializer$deserialize$1 = (EnableSoftwareTokenMfaExceptionDeserializer$deserialize$1) continuation;
            int i = enableSoftwareTokenMfaExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                enableSoftwareTokenMfaExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                enableSoftwareTokenMfaExceptionDeserializer$deserialize$1 = new EnableSoftwareTokenMfaExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = enableSoftwareTokenMfaExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = enableSoftwareTokenMfaExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            EnableSoftwareTokenMfaException.Application application2 = new EnableSoftwareTokenMfaException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            enableSoftwareTokenMfaExceptionDeserializer$deserialize$1.L$0 = application2;
            enableSoftwareTokenMfaExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, enableSoftwareTokenMfaExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (EnableSoftwareTokenMfaException.Application) enableSoftwareTokenMfaExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            GradientColor.copydefault(application, bArr);
        }
        application.KWHzl();
        return application.OLrzqt();
    }
}
