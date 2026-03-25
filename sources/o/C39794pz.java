package o;

import aws.sdk.kotlin.services.textract.model.ConflictException;
import aws.sdk.kotlin.services.textract.serde.ConflictExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C39794pz implements BB<ConflictException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ConflictException> continuation) throws java.lang.Throwable {
        ConflictExceptionDeserializer$deserialize$1 conflictExceptionDeserializer$deserialize$1;
        ConflictException.StateListAnimator stateListAnimator;
        if (continuation instanceof ConflictExceptionDeserializer$deserialize$1) {
            conflictExceptionDeserializer$deserialize$1 = (ConflictExceptionDeserializer$deserialize$1) continuation;
            int i = conflictExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                conflictExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                conflictExceptionDeserializer$deserialize$1 = new ConflictExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = conflictExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = conflictExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            ConflictException.StateListAnimator stateListAnimator2 = new ConflictException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            conflictExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            conflictExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, conflictExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ConflictException.StateListAnimator) conflictExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            C37769pA.copydefault(stateListAnimator, bArr);
        }
        stateListAnimator.AEQbTJ();
        return stateListAnimator.OLrzqt();
    }
}
