package o;

import aws.sdk.kotlin.services.polly.model.InvalidLexiconException;
import aws.sdk.kotlin.services.polly.serde.InvalidLexiconExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InputMethodInfo implements BB<InvalidLexiconException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InvalidLexiconException> continuation) throws java.lang.Throwable {
        InvalidLexiconExceptionDeserializer$deserialize$1 invalidLexiconExceptionDeserializer$deserialize$1;
        InvalidLexiconException.Application application;
        if (continuation instanceof InvalidLexiconExceptionDeserializer$deserialize$1) {
            invalidLexiconExceptionDeserializer$deserialize$1 = (InvalidLexiconExceptionDeserializer$deserialize$1) continuation;
            int i = invalidLexiconExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                invalidLexiconExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                invalidLexiconExceptionDeserializer$deserialize$1 = new InvalidLexiconExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = invalidLexiconExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = invalidLexiconExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            InvalidLexiconException.Application application2 = new InvalidLexiconException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            invalidLexiconExceptionDeserializer$deserialize$1.L$0 = application2;
            invalidLexiconExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, invalidLexiconExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (InvalidLexiconException.Application) invalidLexiconExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            InputMethodSubtype.KWHzl(application, bArr);
        }
        application.EZpvd();
        return application.OLrzqt();
    }
}
