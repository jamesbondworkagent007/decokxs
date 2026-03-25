package o;

import aws.sdk.kotlin.services.rekognition.serde.GetLabelDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ViewSwitcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C19698gM implements BB<ViewSwitcher> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ViewSwitcher> continuation) throws java.lang.Throwable {
        GetLabelDetectionOperationDeserializer$deserialize$1 getLabelDetectionOperationDeserializer$deserialize$1;
        ViewSwitcher.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof GetLabelDetectionOperationDeserializer$deserialize$1) {
            getLabelDetectionOperationDeserializer$deserialize$1 = (GetLabelDetectionOperationDeserializer$deserialize$1) continuation;
            int i = getLabelDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLabelDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getLabelDetectionOperationDeserializer$deserialize$1 = new GetLabelDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getLabelDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getLabelDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ViewSwitcher.StateListAnimator) getLabelDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C19779gP.EZpvd(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getLabelDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C19779gP.AEQbTJ(dt, c58859zS, getLabelDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new ViewSwitcher.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getLabelDetectionOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        getLabelDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getLabelDetectionOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.copydefault();
    }
}
