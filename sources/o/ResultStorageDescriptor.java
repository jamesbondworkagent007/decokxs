package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AssociateSoftwareTokenOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AuthenticatorDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ResultStorageDescriptor implements BB<AuthenticatorDescription> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AuthenticatorDescription> continuation) throws java.lang.Throwable {
        AssociateSoftwareTokenOperationDeserializer$deserialize$1 associateSoftwareTokenOperationDeserializer$deserialize$1;
        AuthenticatorDescription.Application application;
        byte[] bArr;
        if (continuation instanceof AssociateSoftwareTokenOperationDeserializer$deserialize$1) {
            associateSoftwareTokenOperationDeserializer$deserialize$1 = (AssociateSoftwareTokenOperationDeserializer$deserialize$1) continuation;
            int i = associateSoftwareTokenOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                associateSoftwareTokenOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                associateSoftwareTokenOperationDeserializer$deserialize$1 = new AssociateSoftwareTokenOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = associateSoftwareTokenOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = associateSoftwareTokenOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (AuthenticatorDescription.Application) associateSoftwareTokenOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                ScanResult.AEQbTJ(application, bArr);
            }
            application.KWHzl();
            return application.EZpvd();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            associateSoftwareTokenOperationDeserializer$deserialize$1.label = 1;
            if (ScanResult.copydefault(dt, c58859zS, associateSoftwareTokenOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new AuthenticatorDescription.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        associateSoftwareTokenOperationDeserializer$deserialize$1.L$0 = application;
        associateSoftwareTokenOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, associateSoftwareTokenOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.KWHzl();
        return application.EZpvd();
    }
}
