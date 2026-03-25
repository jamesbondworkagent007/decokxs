package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SignUpOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.UserSwitchObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CloseableLock implements BB<UserSwitchObserver> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super UserSwitchObserver> continuation) throws java.lang.Throwable {
        SignUpOperationDeserializer$deserialize$1 signUpOperationDeserializer$deserialize$1;
        UserSwitchObserver.Application application;
        byte[] bArr;
        if (continuation instanceof SignUpOperationDeserializer$deserialize$1) {
            signUpOperationDeserializer$deserialize$1 = (SignUpOperationDeserializer$deserialize$1) continuation;
            int i = signUpOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signUpOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                signUpOperationDeserializer$deserialize$1 = new SignUpOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = signUpOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = signUpOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (UserSwitchObserver.Application) signUpOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                HashCodeHelpers.AEQbTJ(application, bArr);
            }
            application.copydefault();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            signUpOperationDeserializer$deserialize$1.label = 1;
            if (HashCodeHelpers.AEQbTJ(dt, c58859zS, signUpOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new UserSwitchObserver.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        signUpOperationDeserializer$deserialize$1.L$0 = application;
        signUpOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, signUpOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.copydefault();
        return application.EZpvd();
    }
}
