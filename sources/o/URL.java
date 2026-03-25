package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.GetIdOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.IllegalThreadStateException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class URL implements BB<IllegalThreadStateException> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super IllegalThreadStateException> continuation) throws java.lang.Throwable {
        GetIdOperationDeserializer$deserialize$1 getIdOperationDeserializer$deserialize$1;
        IllegalThreadStateException.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof GetIdOperationDeserializer$deserialize$1) {
            getIdOperationDeserializer$deserialize$1 = (GetIdOperationDeserializer$deserialize$1) continuation;
            int i = getIdOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getIdOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getIdOperationDeserializer$deserialize$1 = new GetIdOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getIdOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getIdOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (IllegalThreadStateException.StateListAnimator) getIdOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                BigInteger.EZpvd(stateListAnimator, bArr);
            }
            stateListAnimator.EZpvd();
            return stateListAnimator.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getIdOperationDeserializer$deserialize$1.label = 1;
            if (BigInteger.AEQbTJ(dt, c58859zS, getIdOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new IllegalThreadStateException.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getIdOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        getIdOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getIdOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.AEQbTJ();
    }
}
