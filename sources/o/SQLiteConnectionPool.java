package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.GetUserAttributeVerificationCodeOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AlertDialog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SQLiteConnectionPool implements BB<AlertDialog> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AlertDialog> continuation) throws java.lang.Throwable {
        GetUserAttributeVerificationCodeOperationDeserializer$deserialize$1 getUserAttributeVerificationCodeOperationDeserializer$deserialize$1;
        AlertDialog.Application application;
        byte[] bArr;
        if (continuation instanceof GetUserAttributeVerificationCodeOperationDeserializer$deserialize$1) {
            getUserAttributeVerificationCodeOperationDeserializer$deserialize$1 = (GetUserAttributeVerificationCodeOperationDeserializer$deserialize$1) continuation;
            int i = getUserAttributeVerificationCodeOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUserAttributeVerificationCodeOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getUserAttributeVerificationCodeOperationDeserializer$deserialize$1 = new GetUserAttributeVerificationCodeOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getUserAttributeVerificationCodeOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getUserAttributeVerificationCodeOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application = (AlertDialog.Application) getUserAttributeVerificationCodeOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SQLiteCursor.OLrzqt(application, bArr);
            }
            application.EZpvd();
            return application.KWHzl();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getUserAttributeVerificationCodeOperationDeserializer$deserialize$1.label = 1;
            if (SQLiteCursor.KWHzl(dt, c58859zS, getUserAttributeVerificationCodeOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        application = new AlertDialog.Application();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getUserAttributeVerificationCodeOperationDeserializer$deserialize$1.L$0 = application;
        getUserAttributeVerificationCodeOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getUserAttributeVerificationCodeOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        application.EZpvd();
        return application.KWHzl();
    }
}
