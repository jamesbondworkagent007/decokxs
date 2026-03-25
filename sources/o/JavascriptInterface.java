package o;

import aws.sdk.kotlin.services.polly.serde.PutLexiconOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.Interpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JavascriptInterface implements BB<Interpolator> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super Interpolator> continuation) throws java.lang.Throwable {
        PutLexiconOperationDeserializer$deserialize$1 putLexiconOperationDeserializer$deserialize$1;
        if (continuation instanceof PutLexiconOperationDeserializer$deserialize$1) {
            putLexiconOperationDeserializer$deserialize$1 = (PutLexiconOperationDeserializer$deserialize$1) continuation;
            int i = putLexiconOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                putLexiconOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                putLexiconOperationDeserializer$deserialize$1 = new PutLexiconOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = putLexiconOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = putLexiconOperationDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!zT.copydefault(c58859zS.AEQbTJ().OLrzqt())) {
                putLexiconOperationDeserializer$deserialize$1.label = 1;
                if (HttpAuthHandler.KWHzl(dt, c58859zS, putLexiconOperationDeserializer$deserialize$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                Interpolator.ActionBar actionBar = new Interpolator.ActionBar();
                actionBar.copydefault();
                return actionBar.OLrzqt();
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
