package o;

import aws.sdk.kotlin.services.cognitoidentity.serde.GetOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.IncompatibleClassChangeError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ByteBuffer implements BB<IncompatibleClassChangeError> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super IncompatibleClassChangeError> continuation) throws java.lang.Throwable {
        GetOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1 getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1;
        IncompatibleClassChangeError.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1) {
            getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1 = (GetOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1) continuation;
            int i = getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1 = new GetOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (IncompatibleClassChangeError.ActionBar) getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ByteChannel.EZpvd(actionBar, bArr);
            }
            actionBar.KWHzl();
            return actionBar.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1.label = 1;
            if (ByteChannel.KWHzl(dt, c58859zS, getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new IncompatibleClassChangeError.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1.L$0 = actionBar;
        getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getOpenIdTokenForDeveloperIdentityOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.KWHzl();
        return actionBar.EZpvd();
    }
}
