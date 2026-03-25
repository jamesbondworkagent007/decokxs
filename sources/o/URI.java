package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.GetIdentityPoolRolesOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.IndexOutOfBoundsException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class URI implements BB<IndexOutOfBoundsException> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super IndexOutOfBoundsException> continuation) throws java.lang.Throwable {
        GetIdentityPoolRolesOperationDeserializer$deserialize$1 getIdentityPoolRolesOperationDeserializer$deserialize$1;
        IndexOutOfBoundsException.StateListAnimator stateListAnimator;
        byte[] bArr;
        if (continuation instanceof GetIdentityPoolRolesOperationDeserializer$deserialize$1) {
            getIdentityPoolRolesOperationDeserializer$deserialize$1 = (GetIdentityPoolRolesOperationDeserializer$deserialize$1) continuation;
            int i = getIdentityPoolRolesOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getIdentityPoolRolesOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getIdentityPoolRolesOperationDeserializer$deserialize$1 = new GetIdentityPoolRolesOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getIdentityPoolRolesOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getIdentityPoolRolesOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (IndexOutOfBoundsException.StateListAnimator) getIdentityPoolRolesOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                Buffer.EZpvd(stateListAnimator, bArr);
            }
            stateListAnimator.KWHzl();
            return stateListAnimator.AEQbTJ();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getIdentityPoolRolesOperationDeserializer$deserialize$1.label = 1;
            if (Buffer.copydefault(dt, c58859zS, getIdentityPoolRolesOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        stateListAnimator = new IndexOutOfBoundsException.StateListAnimator();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getIdentityPoolRolesOperationDeserializer$deserialize$1.L$0 = stateListAnimator;
        getIdentityPoolRolesOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getIdentityPoolRolesOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        stateListAnimator.KWHzl();
        return stateListAnimator.AEQbTJ();
    }
}
