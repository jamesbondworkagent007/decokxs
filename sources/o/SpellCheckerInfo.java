package o;

import aws.sdk.kotlin.services.polly.model.LexiconNotFoundException;
import aws.sdk.kotlin.services.polly.serde.LexiconNotFoundExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SpellCheckerInfo implements BB<LexiconNotFoundException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super LexiconNotFoundException> continuation) throws java.lang.Throwable {
        LexiconNotFoundExceptionDeserializer$deserialize$1 lexiconNotFoundExceptionDeserializer$deserialize$1;
        LexiconNotFoundException.Activity activity;
        if (continuation instanceof LexiconNotFoundExceptionDeserializer$deserialize$1) {
            lexiconNotFoundExceptionDeserializer$deserialize$1 = (LexiconNotFoundExceptionDeserializer$deserialize$1) continuation;
            int i = lexiconNotFoundExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lexiconNotFoundExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                lexiconNotFoundExceptionDeserializer$deserialize$1 = new LexiconNotFoundExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = lexiconNotFoundExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = lexiconNotFoundExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            LexiconNotFoundException.Activity activity2 = new LexiconNotFoundException.Activity();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            lexiconNotFoundExceptionDeserializer$deserialize$1.L$0 = activity2;
            lexiconNotFoundExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, lexiconNotFoundExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            activity = activity2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity = (LexiconNotFoundException.Activity) lexiconNotFoundExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            SentenceSuggestionsInfo.KWHzl(activity, bArr);
        }
        activity.OLrzqt();
        return activity.AEQbTJ();
    }
}
