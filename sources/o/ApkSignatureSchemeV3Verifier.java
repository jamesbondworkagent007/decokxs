package o;

import aws.sdk.kotlin.services.comprehend.serde.StopDominantLanguageDetectionJobOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.SeekBarDialogPreference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApkSignatureSchemeV3Verifier implements BB<SeekBarDialogPreference> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super SeekBarDialogPreference> continuation) throws java.lang.Throwable {
        StopDominantLanguageDetectionJobOperationDeserializer$deserialize$1 stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1;
        SeekBarDialogPreference.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof StopDominantLanguageDetectionJobOperationDeserializer$deserialize$1) {
            stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1 = (StopDominantLanguageDetectionJobOperationDeserializer$deserialize$1) continuation;
            int i = stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1 = new StopDominantLanguageDetectionJobOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (SeekBarDialogPreference.ActionBar) stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ByteBufferDataSource.EZpvd(actionBar, bArr);
            }
            actionBar.EZpvd();
            return actionBar.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label = 1;
            if (ByteBufferDataSource.copydefault(dt, c58859zS, stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new SeekBarDialogPreference.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1.L$0 = actionBar;
        stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, stopDominantLanguageDetectionJobOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.EZpvd();
        return actionBar.OLrzqt();
    }
}
