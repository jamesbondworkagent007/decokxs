package o;

import aws.sdk.kotlin.services.rekognition.serde.DetectModerationLabelsOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.RelativeLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C17294fA implements BB<RelativeLayout> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super RelativeLayout> continuation) throws java.lang.Throwable {
        DetectModerationLabelsOperationDeserializer$deserialize$1 detectModerationLabelsOperationDeserializer$deserialize$1;
        RelativeLayout.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof DetectModerationLabelsOperationDeserializer$deserialize$1) {
            detectModerationLabelsOperationDeserializer$deserialize$1 = (DetectModerationLabelsOperationDeserializer$deserialize$1) continuation;
            int i = detectModerationLabelsOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                detectModerationLabelsOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                detectModerationLabelsOperationDeserializer$deserialize$1 = new DetectModerationLabelsOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = detectModerationLabelsOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = detectModerationLabelsOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (RelativeLayout.StateListAnimator) detectModerationLabelsOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C19320fz.AEQbTJ(stateListAnimator, bArr);
            }
            stateListAnimator.AEQbTJ();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            detectModerationLabelsOperationDeserializer$deserialize$1.label = 1;
            if (C19320fz.AEQbTJ(dt, c58859zS, detectModerationLabelsOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new RelativeLayout.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        detectModerationLabelsOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        detectModerationLabelsOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, detectModerationLabelsOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.copydefault();
    }
}
