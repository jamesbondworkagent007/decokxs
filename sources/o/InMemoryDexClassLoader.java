package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.ExtractedText;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class InMemoryDexClassLoader implements BB<ExtractedText> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super ExtractedText> continuation) throws java.lang.Throwable {
        AssumeRoleOperationDeserializer$deserialize$1 assumeRoleOperationDeserializer$deserialize$1;
        ExtractedText.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof AssumeRoleOperationDeserializer$deserialize$1) {
            assumeRoleOperationDeserializer$deserialize$1 = (AssumeRoleOperationDeserializer$deserialize$1) continuation;
            int i = assumeRoleOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                assumeRoleOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                assumeRoleOperationDeserializer$deserialize$1 = new AssumeRoleOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = assumeRoleOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = assumeRoleOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (ExtractedText.StateListAnimator) assumeRoleOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                DexClassLoader.EZpvd(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            assumeRoleOperationDeserializer$deserialize$1.label = 1;
            if (DexClassLoader.EZpvd(dt, c58859zS, assumeRoleOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new ExtractedText.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        assumeRoleOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        assumeRoleOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, assumeRoleOperationDeserializer$deserialize$1);
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
