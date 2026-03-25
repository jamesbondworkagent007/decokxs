package o;

import aws.sdk.kotlin.services.polly.model.UnsupportedPlsAlphabetException;
import aws.sdk.kotlin.services.polly.serde.UnsupportedPlsAlphabetExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class URLUtil implements BB<UnsupportedPlsAlphabetException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UnsupportedPlsAlphabetException> continuation) throws java.lang.Throwable {
        UnsupportedPlsAlphabetExceptionDeserializer$deserialize$1 unsupportedPlsAlphabetExceptionDeserializer$deserialize$1;
        UnsupportedPlsAlphabetException.StateListAnimator stateListAnimator;
        if (continuation instanceof UnsupportedPlsAlphabetExceptionDeserializer$deserialize$1) {
            unsupportedPlsAlphabetExceptionDeserializer$deserialize$1 = (UnsupportedPlsAlphabetExceptionDeserializer$deserialize$1) continuation;
            int i = unsupportedPlsAlphabetExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unsupportedPlsAlphabetExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                unsupportedPlsAlphabetExceptionDeserializer$deserialize$1 = new UnsupportedPlsAlphabetExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = unsupportedPlsAlphabetExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unsupportedPlsAlphabetExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            UnsupportedPlsAlphabetException.StateListAnimator stateListAnimator2 = new UnsupportedPlsAlphabetException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            unsupportedPlsAlphabetExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            unsupportedPlsAlphabetExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, unsupportedPlsAlphabetExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (UnsupportedPlsAlphabetException.StateListAnimator) unsupportedPlsAlphabetExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            SslErrorHandler.KWHzl(stateListAnimator, bArr);
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.EZpvd();
    }
}
