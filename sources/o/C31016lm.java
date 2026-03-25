package o;

import aws.sdk.kotlin.services.rekognition.serde.StartStreamProcessorOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.C8350bB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C31016lm implements BB<C8350bB> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super C8350bB> continuation) throws java.lang.Throwable {
        StartStreamProcessorOperationDeserializer$deserialize$1 startStreamProcessorOperationDeserializer$deserialize$1;
        C8350bB.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof StartStreamProcessorOperationDeserializer$deserialize$1) {
            startStreamProcessorOperationDeserializer$deserialize$1 = (StartStreamProcessorOperationDeserializer$deserialize$1) continuation;
            int i = startStreamProcessorOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startStreamProcessorOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                startStreamProcessorOperationDeserializer$deserialize$1 = new StartStreamProcessorOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = startStreamProcessorOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = startStreamProcessorOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (C8350bB.StateListAnimator) startStreamProcessorOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                C30910lk.OLrzqt(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            startStreamProcessorOperationDeserializer$deserialize$1.label = 1;
            if (C30910lk.OLrzqt(dt, c58859zS, startStreamProcessorOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new C8350bB.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        startStreamProcessorOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        startStreamProcessorOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, startStreamProcessorOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.EZpvd();
    }
}
