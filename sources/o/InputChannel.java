package o;

import aws.sdk.kotlin.services.comprehend.model.TextSizeLimitExceededException;
import aws.sdk.kotlin.services.comprehend.serde.TextSizeLimitExceededExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InputChannel implements BB<TextSizeLimitExceededException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super TextSizeLimitExceededException> continuation) throws java.lang.Throwable {
        TextSizeLimitExceededExceptionDeserializer$deserialize$1 textSizeLimitExceededExceptionDeserializer$deserialize$1;
        TextSizeLimitExceededException.StateListAnimator stateListAnimator;
        if (continuation instanceof TextSizeLimitExceededExceptionDeserializer$deserialize$1) {
            textSizeLimitExceededExceptionDeserializer$deserialize$1 = (TextSizeLimitExceededExceptionDeserializer$deserialize$1) continuation;
            int i = textSizeLimitExceededExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                textSizeLimitExceededExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                textSizeLimitExceededExceptionDeserializer$deserialize$1 = new TextSizeLimitExceededExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = textSizeLimitExceededExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = textSizeLimitExceededExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            TextSizeLimitExceededException.StateListAnimator stateListAnimator2 = new TextSizeLimitExceededException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            textSizeLimitExceededExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            textSizeLimitExceededExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, textSizeLimitExceededExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (TextSizeLimitExceededException.StateListAnimator) textSizeLimitExceededExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            KeyboardShortcutInfo.OLrzqt(stateListAnimator, bArr);
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.EZpvd();
    }
}
