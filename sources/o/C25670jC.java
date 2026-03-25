package o;

import aws.sdk.kotlin.services.rekognition.serde.RecognizeCelebritiesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C6264aM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C25670jC implements BB<C6264aM> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C6264aM> continuation) throws java.lang.Throwable {
        RecognizeCelebritiesOperationDeserializer$deserialize$1 recognizeCelebritiesOperationDeserializer$deserialize$1;
        C6264aM.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof RecognizeCelebritiesOperationDeserializer$deserialize$1) {
            recognizeCelebritiesOperationDeserializer$deserialize$1 = (RecognizeCelebritiesOperationDeserializer$deserialize$1) continuation;
            int i = recognizeCelebritiesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                recognizeCelebritiesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                recognizeCelebritiesOperationDeserializer$deserialize$1 = new RecognizeCelebritiesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = recognizeCelebritiesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = recognizeCelebritiesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (C6264aM.StateListAnimator) recognizeCelebritiesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C25751jF.EZpvd(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            recognizeCelebritiesOperationDeserializer$deserialize$1.label = 1;
            if (C25751jF.OLrzqt(dt, c58859zS, recognizeCelebritiesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new C6264aM.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        recognizeCelebritiesOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        recognizeCelebritiesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, recognizeCelebritiesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.OLrzqt();
    }
}
