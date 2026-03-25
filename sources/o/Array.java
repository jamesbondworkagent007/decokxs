package o;

import aws.sdk.kotlin.services.cognitoidentity.model.ExternalServiceException;
import aws.sdk.kotlin.services.cognitoidentity.serde.ExternalServiceExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Array implements BB<ExternalServiceException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ExternalServiceException> continuation) throws java.lang.Throwable {
        ExternalServiceExceptionDeserializer$deserialize$1 externalServiceExceptionDeserializer$deserialize$1;
        ExternalServiceException.StateListAnimator stateListAnimator;
        if (continuation instanceof ExternalServiceExceptionDeserializer$deserialize$1) {
            externalServiceExceptionDeserializer$deserialize$1 = (ExternalServiceExceptionDeserializer$deserialize$1) continuation;
            int i = externalServiceExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                externalServiceExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                externalServiceExceptionDeserializer$deserialize$1 = new ExternalServiceExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = externalServiceExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = externalServiceExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ExternalServiceException.StateListAnimator stateListAnimator2 = new ExternalServiceException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            externalServiceExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            externalServiceExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, externalServiceExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ExternalServiceException.StateListAnimator) externalServiceExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            Method.copydefault(stateListAnimator, bArr);
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.copydefault();
    }
}
