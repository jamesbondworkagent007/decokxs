package o;

import aws.sdk.kotlin.services.comprehend.model.BatchSizeLimitExceededException;
import aws.sdk.kotlin.services.comprehend.serde.BatchSizeLimitExceededExceptionDeserializer$deserialize$1;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class KeyCharacteristics implements BB<BatchSizeLimitExceededException> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super BatchSizeLimitExceededException> continuation) throws java.lang.Throwable {
        BatchSizeLimitExceededExceptionDeserializer$deserialize$1 batchSizeLimitExceededExceptionDeserializer$deserialize$1;
        BatchSizeLimitExceededException.StateListAnimator stateListAnimator;
        if (continuation instanceof BatchSizeLimitExceededExceptionDeserializer$deserialize$1) {
            batchSizeLimitExceededExceptionDeserializer$deserialize$1 = (BatchSizeLimitExceededExceptionDeserializer$deserialize$1) continuation;
            int i = batchSizeLimitExceededExceptionDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                batchSizeLimitExceededExceptionDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                batchSizeLimitExceededExceptionDeserializer$deserialize$1 = new BatchSizeLimitExceededExceptionDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object obj = batchSizeLimitExceededExceptionDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = batchSizeLimitExceededExceptionDeserializer$deserialize$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
            BatchSizeLimitExceededException.StateListAnimator stateListAnimator2 = new BatchSizeLimitExceededException.StateListAnimator();
            zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
            batchSizeLimitExceededExceptionDeserializer$deserialize$1.L$0 = stateListAnimator2;
            batchSizeLimitExceededExceptionDeserializer$deserialize$1.label = 1;
            java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, batchSizeLimitExceededExceptionDeserializer$deserialize$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            stateListAnimator = stateListAnimator2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (BatchSizeLimitExceededException.StateListAnimator) batchSizeLimitExceededExceptionDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            KeyAttestationPackageInfo.OLrzqt(stateListAnimator, bArr);
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.copydefault();
    }
}
