package o;

import aws.sdk.kotlin.services.polly.model.ServiceFailureException;
import aws.sdk.kotlin.services.polly.serde.ServiceFailureExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MimeTypeMap implements BB<ServiceFailureException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ServiceFailureException> continuation) throws java.lang.Throwable {
        ServiceFailureExceptionDeserializer$deserialize$1 serviceFailureExceptionDeserializer$deserialize$1;
        ServiceFailureException.StateListAnimator stateListAnimator;
        if (continuation instanceof ServiceFailureExceptionDeserializer$deserialize$1) {
            serviceFailureExceptionDeserializer$deserialize$1 = (ServiceFailureExceptionDeserializer$deserialize$1) continuation;
            int i = serviceFailureExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                serviceFailureExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                serviceFailureExceptionDeserializer$deserialize$1 = new ServiceFailureExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = serviceFailureExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = serviceFailureExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ServiceFailureException.StateListAnimator stateListAnimator2 = new ServiceFailureException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            serviceFailureExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            serviceFailureExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, serviceFailureExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ServiceFailureException.StateListAnimator) serviceFailureExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            JsPromptResult.KWHzl(stateListAnimator, bArr);
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.AEQbTJ();
    }
}
