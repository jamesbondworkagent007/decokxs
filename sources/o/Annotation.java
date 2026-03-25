package o;

import aws.sdk.kotlin.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException;
import aws.sdk.kotlin.services.cognitoidentity.serde.DeveloperUserAlreadyRegisteredExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Annotation implements BB<DeveloperUserAlreadyRegisteredException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super DeveloperUserAlreadyRegisteredException> continuation) throws java.lang.Throwable {
        DeveloperUserAlreadyRegisteredExceptionDeserializer$deserialize$1 developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1;
        DeveloperUserAlreadyRegisteredException.Application application;
        if (continuation instanceof DeveloperUserAlreadyRegisteredExceptionDeserializer$deserialize$1) {
            developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1 = (DeveloperUserAlreadyRegisteredExceptionDeserializer$deserialize$1) continuation;
            int i = developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1 = new DeveloperUserAlreadyRegisteredExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            DeveloperUserAlreadyRegisteredException.Application application2 = new DeveloperUserAlreadyRegisteredException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1.L$0 = application2;
            developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (DeveloperUserAlreadyRegisteredException.Application) developerUserAlreadyRegisteredExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            AccessibleObject.KWHzl(application, bArr);
        }
        application.AEQbTJ();
        return application.KWHzl();
    }
}
