package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.GetPrincipalTagAttributeMapOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.InterruptedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Charset implements BB<InterruptedException> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super InterruptedException> continuation) throws java.lang.Throwable {
        GetPrincipalTagAttributeMapOperationDeserializer$deserialize$1 getPrincipalTagAttributeMapOperationDeserializer$deserialize$1;
        InterruptedException.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof GetPrincipalTagAttributeMapOperationDeserializer$deserialize$1) {
            getPrincipalTagAttributeMapOperationDeserializer$deserialize$1 = (GetPrincipalTagAttributeMapOperationDeserializer$deserialize$1) continuation;
            int i = getPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getPrincipalTagAttributeMapOperationDeserializer$deserialize$1 = new GetPrincipalTagAttributeMapOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getPrincipalTagAttributeMapOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (InterruptedException.StateListAnimator) getPrincipalTagAttributeMapOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                AbstractInterruptibleChannel.KWHzl(stateListAnimator, bArr);
            }
            stateListAnimator.EZpvd();
            return stateListAnimator.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label = 1;
            if (AbstractInterruptibleChannel.EZpvd(dt, c58859zS, getPrincipalTagAttributeMapOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new InterruptedException.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getPrincipalTagAttributeMapOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        getPrincipalTagAttributeMapOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getPrincipalTagAttributeMapOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.EZpvd();
        return stateListAnimator.KWHzl();
    }
}
