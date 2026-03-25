package o;

import aws.sdk.kotlin.services.rekognition.serde.StartSegmentDetectionOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C10894bx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30751lh implements BB<C10894bx> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C10894bx> continuation) throws java.lang.Throwable {
        StartSegmentDetectionOperationDeserializer$deserialize$1 startSegmentDetectionOperationDeserializer$deserialize$1;
        C10894bx.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof StartSegmentDetectionOperationDeserializer$deserialize$1) {
            startSegmentDetectionOperationDeserializer$deserialize$1 = (StartSegmentDetectionOperationDeserializer$deserialize$1) continuation;
            int i = startSegmentDetectionOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startSegmentDetectionOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startSegmentDetectionOperationDeserializer$deserialize$1 = new StartSegmentDetectionOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startSegmentDetectionOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startSegmentDetectionOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (C10894bx.StateListAnimator) startSegmentDetectionOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C30592le.copydefault(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startSegmentDetectionOperationDeserializer$deserialize$1.label = 1;
            if (C30592le.KWHzl(dt, c58859zS, startSegmentDetectionOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new C10894bx.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startSegmentDetectionOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        startSegmentDetectionOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startSegmentDetectionOperationDeserializer$deserialize$1);
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
