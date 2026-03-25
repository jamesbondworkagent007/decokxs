package o;

import aws.sdk.kotlin.services.polly.serde.GetLexiconOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AccessibilityRequestPreparer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class InputBinding implements BB<AccessibilityRequestPreparer> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AccessibilityRequestPreparer> continuation) throws java.lang.Throwable {
        GetLexiconOperationDeserializer$deserialize$1 getLexiconOperationDeserializer$deserialize$1;
        AccessibilityRequestPreparer.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof GetLexiconOperationDeserializer$deserialize$1) {
            getLexiconOperationDeserializer$deserialize$1 = (GetLexiconOperationDeserializer$deserialize$1) continuation;
            int i = getLexiconOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLexiconOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getLexiconOperationDeserializer$deserialize$1 = new GetLexiconOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getLexiconOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getLexiconOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (AccessibilityRequestPreparer.StateListAnimator) getLexiconOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                CursorAnchorInfo.KWHzl(stateListAnimator, bArr);
            }
            stateListAnimator.EZpvd();
            return stateListAnimator.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getLexiconOperationDeserializer$deserialize$1.label = 1;
            if (CursorAnchorInfo.KWHzl(dt, c58859zS, getLexiconOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new AccessibilityRequestPreparer.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getLexiconOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        getLexiconOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getLexiconOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.AEQbTJ();
    }
}
