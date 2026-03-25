package o;

import aws.sdk.kotlin.services.comprehend.serde.BatchDetectDominantLanguageOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.NetworkPolicy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MetadataReader implements BB<NetworkPolicy> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super NetworkPolicy> continuation) throws java.lang.Throwable {
        BatchDetectDominantLanguageOperationDeserializer$deserialize$1 batchDetectDominantLanguageOperationDeserializer$deserialize$1;
        NetworkPolicy.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof BatchDetectDominantLanguageOperationDeserializer$deserialize$1) {
            batchDetectDominantLanguageOperationDeserializer$deserialize$1 = (BatchDetectDominantLanguageOperationDeserializer$deserialize$1) continuation;
            int i = batchDetectDominantLanguageOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                batchDetectDominantLanguageOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                batchDetectDominantLanguageOperationDeserializer$deserialize$1 = new BatchDetectDominantLanguageOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = batchDetectDominantLanguageOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = batchDetectDominantLanguageOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (NetworkPolicy.StateListAnimator) batchDetectDominantLanguageOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                FontRequest.AEQbTJ(stateListAnimator, bArr);
            }
            stateListAnimator.AEQbTJ();
            return stateListAnimator.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            batchDetectDominantLanguageOperationDeserializer$deserialize$1.label = 1;
            if (FontRequest.OLrzqt(dt, c58859zS, batchDetectDominantLanguageOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new NetworkPolicy.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        batchDetectDominantLanguageOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        batchDetectDominantLanguageOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, batchDetectDominantLanguageOperationDeserializer$deserialize$1);
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
