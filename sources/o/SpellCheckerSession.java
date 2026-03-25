package o;

import aws.sdk.kotlin.services.polly.model.LexiconSizeExceededException;
import aws.sdk.kotlin.services.polly.serde.LexiconSizeExceededExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SpellCheckerSession implements BB<LexiconSizeExceededException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super LexiconSizeExceededException> continuation) throws java.lang.Throwable {
        LexiconSizeExceededExceptionDeserializer$deserialize$1 lexiconSizeExceededExceptionDeserializer$deserialize$1;
        LexiconSizeExceededException.Application application;
        if (continuation instanceof LexiconSizeExceededExceptionDeserializer$deserialize$1) {
            lexiconSizeExceededExceptionDeserializer$deserialize$1 = (LexiconSizeExceededExceptionDeserializer$deserialize$1) continuation;
            int i = lexiconSizeExceededExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lexiconSizeExceededExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                lexiconSizeExceededExceptionDeserializer$deserialize$1 = new LexiconSizeExceededExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = lexiconSizeExceededExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = lexiconSizeExceededExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            LexiconSizeExceededException.Application application2 = new LexiconSizeExceededException.Application();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            lexiconSizeExceededExceptionDeserializer$deserialize$1.L$0 = application2;
            lexiconSizeExceededExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, lexiconSizeExceededExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            application = application2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (LexiconSizeExceededException.Application) lexiconSizeExceededExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            SmartSelectionEventTracker.copydefault(application, bArr);
        }
        application.EZpvd();
        return application.AEQbTJ();
    }
}
