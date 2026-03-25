package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.serde.GetUserPoolMfaConfigOperationDeserializer$deserialize$1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import o.AppOpsManagerInternal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SQLiteException implements BB<AppOpsManagerInternal> {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull DT dt, @NotNull C58859zS c58859zS, @NotNull Continuation<? super AppOpsManagerInternal> continuation) throws java.lang.Throwable {
        GetUserPoolMfaConfigOperationDeserializer$deserialize$1 getUserPoolMfaConfigOperationDeserializer$deserialize$1;
        AppOpsManagerInternal.ActionBar actionBar;
        byte[] bArr;
        if (continuation instanceof GetUserPoolMfaConfigOperationDeserializer$deserialize$1) {
            getUserPoolMfaConfigOperationDeserializer$deserialize$1 = (GetUserPoolMfaConfigOperationDeserializer$deserialize$1) continuation;
            int i = getUserPoolMfaConfigOperationDeserializer$deserialize$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUserPoolMfaConfigOperationDeserializer$deserialize$1.label = i - Integer.MIN_VALUE;
            } else {
                getUserPoolMfaConfigOperationDeserializer$deserialize$1 = new GetUserPoolMfaConfigOperationDeserializer$deserialize$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getUserPoolMfaConfigOperationDeserializer$deserialize$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getUserPoolMfaConfigOperationDeserializer$deserialize$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objCopydefault);
                throw new KotlinNothingValueException();
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            actionBar = (AppOpsManagerInternal.ActionBar) getUserPoolMfaConfigOperationDeserializer$deserialize$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            bArr = (byte[]) objCopydefault;
            if (bArr != null) {
                SQLiteDiskIOException.AEQbTJ(actionBar, bArr);
            }
            actionBar.OLrzqt();
            return actionBar.copydefault();
        }
        C56391yDq.AEQbTJ(objCopydefault);
        InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS.AEQbTJ();
        if (!zT.copydefault(interfaceC5039CjAEQbTJ.OLrzqt())) {
            getUserPoolMfaConfigOperationDeserializer$deserialize$1.label = 1;
            if (SQLiteDiskIOException.EZpvd(dt, c58859zS, getUserPoolMfaConfigOperationDeserializer$deserialize$1) == objCopydefault2) {
                return objCopydefault2;
            }
            throw new KotlinNothingValueException();
        }
        actionBar = new AppOpsManagerInternal.ActionBar();
        zP zPVarEZpvd = interfaceC5039CjAEQbTJ.EZpvd();
        getUserPoolMfaConfigOperationDeserializer$deserialize$1.L$0 = actionBar;
        getUserPoolMfaConfigOperationDeserializer$deserialize$1.label = 2;
        objCopydefault = C58752zO.copydefault(zPVarEZpvd, getUserPoolMfaConfigOperationDeserializer$deserialize$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        bArr = (byte[]) objCopydefault;
        if (bArr != null) {
        }
        actionBar.OLrzqt();
        return actionBar.copydefault();
    }
}
