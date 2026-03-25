package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.MfaMethodNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.MfaMethodNotFoundExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraDeviceImpl implements BB<MfaMethodNotFoundException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MfaMethodNotFoundException> continuation) throws java.lang.Throwable {
        MfaMethodNotFoundExceptionDeserializer$deserialize$1 mfaMethodNotFoundExceptionDeserializer$deserialize$1;
        MfaMethodNotFoundException.Application application;
        if (continuation instanceof MfaMethodNotFoundExceptionDeserializer$deserialize$1) {
            mfaMethodNotFoundExceptionDeserializer$deserialize$1 = (MfaMethodNotFoundExceptionDeserializer$deserialize$1) continuation;
            int i = mfaMethodNotFoundExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfaMethodNotFoundExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                mfaMethodNotFoundExceptionDeserializer$deserialize$1 = new MfaMethodNotFoundExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = mfaMethodNotFoundExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mfaMethodNotFoundExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            MfaMethodNotFoundException.Application application2 = new MfaMethodNotFoundException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            mfaMethodNotFoundExceptionDeserializer$deserialize$1.L$0 = application2;
            mfaMethodNotFoundExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, mfaMethodNotFoundExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (MfaMethodNotFoundException.Application) mfaMethodNotFoundExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            CameraMetadataNative.AEQbTJ(application, bArr);
        }
        application.copydefault();
        return application.AEQbTJ();
    }
}
