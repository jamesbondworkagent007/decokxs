package o;

import aws.sdk.kotlin.services.polly.serde.StartSpeechSynthesisTaskOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.OvershootInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class LegacyErrorStrings implements BB<OvershootInterpolator> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super OvershootInterpolator> continuation) throws java.lang.Throwable {
        StartSpeechSynthesisTaskOperationDeserializer$deserialize$1 startSpeechSynthesisTaskOperationDeserializer$deserialize$1;
        OvershootInterpolator.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof StartSpeechSynthesisTaskOperationDeserializer$deserialize$1) {
            startSpeechSynthesisTaskOperationDeserializer$deserialize$1 = (StartSpeechSynthesisTaskOperationDeserializer$deserialize$1) continuation;
            int i = startSpeechSynthesisTaskOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startSpeechSynthesisTaskOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startSpeechSynthesisTaskOperationDeserializer$deserialize$1 = new StartSpeechSynthesisTaskOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startSpeechSynthesisTaskOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startSpeechSynthesisTaskOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (OvershootInterpolator.ActionBar) startSpeechSynthesisTaskOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                PluginStub.KWHzl(actionBar, bArr);
            }
            actionBar.KWHzl();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startSpeechSynthesisTaskOperationDeserializer$deserialize$1.label = 1;
            if (PluginStub.EZpvd(dt, c58859zS, startSpeechSynthesisTaskOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new OvershootInterpolator.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startSpeechSynthesisTaskOperationDeserializer$deserialize$1.L$0 = actionBar;
        startSpeechSynthesisTaskOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startSpeechSynthesisTaskOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.KWHzl();
        return actionBar.copydefault();
    }
}
