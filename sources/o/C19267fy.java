package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectLabelsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.RadioGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C19267fy implements BB<RadioGroup> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super RadioGroup> continuation) throws java.lang.Throwable {
        DetectLabelsOperationDeserializer$deserialize$1 detectLabelsOperationDeserializer$deserialize$1;
        RadioGroup.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof DetectLabelsOperationDeserializer$deserialize$1) {
            detectLabelsOperationDeserializer$deserialize$1 = (DetectLabelsOperationDeserializer$deserialize$1) continuation;
            int i = detectLabelsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                detectLabelsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                detectLabelsOperationDeserializer$deserialize$1 = new DetectLabelsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = detectLabelsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = detectLabelsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (RadioGroup.StateListAnimator) detectLabelsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C19214fx.copydefault(stateListAnimator, bArr);
            }
            stateListAnimator.AEQbTJ();
            return stateListAnimator.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            detectLabelsOperationDeserializer$deserialize$1.label = 1;
            if (C19214fx.EZpvd(dt, c58859zS, detectLabelsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new RadioGroup.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        detectLabelsOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        detectLabelsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, detectLabelsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.KWHzl();
    }
}
