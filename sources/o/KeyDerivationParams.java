package o;

import aws.sdk.kotlin.services.comprehend.serde.CreateDocumentClassifierOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.WifiKey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class KeyDerivationParams implements BB<WifiKey> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super WifiKey> continuation) throws java.lang.Throwable {
        CreateDocumentClassifierOperationDeserializer$deserialize$1 createDocumentClassifierOperationDeserializer$deserialize$1;
        WifiKey.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof CreateDocumentClassifierOperationDeserializer$deserialize$1) {
            createDocumentClassifierOperationDeserializer$deserialize$1 = (CreateDocumentClassifierOperationDeserializer$deserialize$1) continuation;
            int i = createDocumentClassifierOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createDocumentClassifierOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                createDocumentClassifierOperationDeserializer$deserialize$1 = new CreateDocumentClassifierOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createDocumentClassifierOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createDocumentClassifierOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (WifiKey.StateListAnimator) createDocumentClassifierOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                RecoveryCertPath.OLrzqt(stateListAnimator, bArr);
            }
            stateListAnimator.EZpvd();
            return stateListAnimator.OLrzqt();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            createDocumentClassifierOperationDeserializer$deserialize$1.label = 1;
            if (RecoveryCertPath.AEQbTJ(dt, c58859zS, createDocumentClassifierOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new WifiKey.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        createDocumentClassifierOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        createDocumentClassifierOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, createDocumentClassifierOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.OLrzqt();
    }
}
