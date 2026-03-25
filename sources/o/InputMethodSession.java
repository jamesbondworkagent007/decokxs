package o;

import aws.sdk.kotlin.services.polly.serde.GetSpeechSynthesisTaskOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.CaptioningManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class InputMethodSession implements BB<CaptioningManager> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super CaptioningManager> continuation) throws java.lang.Throwable {
        GetSpeechSynthesisTaskOperationDeserializer$deserialize$1 getSpeechSynthesisTaskOperationDeserializer$deserialize$1;
        CaptioningManager.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetSpeechSynthesisTaskOperationDeserializer$deserialize$1) {
            getSpeechSynthesisTaskOperationDeserializer$deserialize$1 = (GetSpeechSynthesisTaskOperationDeserializer$deserialize$1) continuation;
            int i = getSpeechSynthesisTaskOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSpeechSynthesisTaskOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getSpeechSynthesisTaskOperationDeserializer$deserialize$1 = new GetSpeechSynthesisTaskOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getSpeechSynthesisTaskOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getSpeechSynthesisTaskOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (CaptioningManager.ActionBar) getSpeechSynthesisTaskOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                InputMethodManager.EZpvd(actionBar, bArr);
            }
            actionBar.AEQbTJ();
            return actionBar.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getSpeechSynthesisTaskOperationDeserializer$deserialize$1.label = 1;
            if (InputMethodManager.AEQbTJ(dt, c58859zS, getSpeechSynthesisTaskOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new CaptioningManager.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getSpeechSynthesisTaskOperationDeserializer$deserialize$1.L$0 = actionBar;
        getSpeechSynthesisTaskOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getSpeechSynthesisTaskOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.AEQbTJ();
        return actionBar.KWHzl();
    }
}
