package o;

import aws.sdk.kotlin.services.polly.model.MaxLexemeLengthExceededException;
import aws.sdk.kotlin.services.polly.serde.MaxLexemeLengthExceededExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DownloadListener implements BB<MaxLexemeLengthExceededException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super MaxLexemeLengthExceededException> continuation) throws java.lang.Throwable {
        MaxLexemeLengthExceededExceptionDeserializer$deserialize$1 maxLexemeLengthExceededExceptionDeserializer$deserialize$1;
        MaxLexemeLengthExceededException.ActionBar actionBar;
        if (continuation instanceof MaxLexemeLengthExceededExceptionDeserializer$deserialize$1) {
            maxLexemeLengthExceededExceptionDeserializer$deserialize$1 = (MaxLexemeLengthExceededExceptionDeserializer$deserialize$1) continuation;
            int i = maxLexemeLengthExceededExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                maxLexemeLengthExceededExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                maxLexemeLengthExceededExceptionDeserializer$deserialize$1 = new MaxLexemeLengthExceededExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = maxLexemeLengthExceededExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = maxLexemeLengthExceededExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            MaxLexemeLengthExceededException.ActionBar actionBar2 = new MaxLexemeLengthExceededException.ActionBar();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            maxLexemeLengthExceededExceptionDeserializer$deserialize$1.L$0 = actionBar2;
            maxLexemeLengthExceededExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, maxLexemeLengthExceededExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            actionBar = actionBar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (MaxLexemeLengthExceededException.ActionBar) maxLexemeLengthExceededExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            CookieSyncManager.copydefault(actionBar, bArr);
        }
        actionBar.AEQbTJ();
        return actionBar.copydefault();
    }
}
