package o;

import aws.sdk.kotlin.services.polly.model.UnsupportedPlsLanguageException;
import aws.sdk.kotlin.services.polly.serde.UnsupportedPlsLanguageExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TracingController implements BB<UnsupportedPlsLanguageException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnsupportedPlsLanguageException> continuation) throws java.lang.Throwable {
        UnsupportedPlsLanguageExceptionDeserializer$deserialize$1 unsupportedPlsLanguageExceptionDeserializer$deserialize$1;
        UnsupportedPlsLanguageException.StateListAnimator stateListAnimator;
        if (continuation instanceof UnsupportedPlsLanguageExceptionDeserializer$deserialize$1) {
            unsupportedPlsLanguageExceptionDeserializer$deserialize$1 = (UnsupportedPlsLanguageExceptionDeserializer$deserialize$1) continuation;
            int i = unsupportedPlsLanguageExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsupportedPlsLanguageExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unsupportedPlsLanguageExceptionDeserializer$deserialize$1 = new UnsupportedPlsLanguageExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unsupportedPlsLanguageExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unsupportedPlsLanguageExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnsupportedPlsLanguageException.StateListAnimator stateListAnimator2 = new UnsupportedPlsLanguageException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unsupportedPlsLanguageExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            unsupportedPlsLanguageExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unsupportedPlsLanguageExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (UnsupportedPlsLanguageException.StateListAnimator) unsupportedPlsLanguageExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            UrlInterceptHandler.KWHzl(stateListAnimator, bArr);
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.AEQbTJ();
    }
}
