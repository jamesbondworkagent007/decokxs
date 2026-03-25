package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class PathPermission {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DeleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1 deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DeleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1) {
            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1 = (DeleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1) continuation;
            int i = deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1 = new DeleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0 = dt;
                deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1 = c58859zS;
                deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityProviderException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityProviderException;
                    }
                    if (i2 == 4) {
                        c56239xz = (C56239xz) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw cognitoIdentityProviderException;
                    }
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw cognitoIdentityProviderException;
                }
                c58859zS = (C58859zS) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1;
                dt = (DT) deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                switch (strOLrzqt.hashCode()) {
                    case -1416998079:
                        if (strOLrzqt.equals("NotAuthorizedException")) {
                            CaptureResultExtras captureResultExtras = new CaptureResultExtras();
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0 = interfaceC5039CjEZpvd;
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1 = c56239xzCopydefault;
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.label = 5;
                            objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityProviderException;
                        }
                        break;
                    case 504305508:
                        if (strOLrzqt.equals("InternalErrorException")) {
                            SQLiteTableLockedException sQLiteTableLockedException = new SQLiteTableLockedException();
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0 = interfaceC5039CjEZpvd;
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1 = c56239xzCopydefault;
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.label = 4;
                            objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityProviderException;
                        }
                        break;
                    case 1674340573:
                        if (strOLrzqt.equals("InvalidParameterException")) {
                            DdmRegister ddmRegister = new DdmRegister();
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0 = interfaceC5039CjEZpvd;
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1 = c56239xzCopydefault;
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.label = 2;
                            objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityProviderException;
                        }
                        break;
                    case 1821306386:
                        if (strOLrzqt.equals("ResourceNotFoundException")) {
                            RequestQueue requestQueue = new RequestQueue();
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$0 = interfaceC5039CjEZpvd;
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.L$1 = c56239xzCopydefault;
                            deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1.label = 3;
                            objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, deleteUserPoolDomainOperationDeserializerKt$throwDeleteUserPoolDomainError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw cognitoIdentityProviderException;
                        }
                        break;
                }
            }
            cognitoIdentityProviderException = new CognitoIdentityProviderException(c56239xzCopydefault.copydefault());
            C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
            throw cognitoIdentityProviderException;
        } catch (java.lang.Exception e) {
            CognitoIdentityProviderException cognitoIdentityProviderException2 = new CognitoIdentityProviderException("Failed to parse response as 'awsJson1_1' error", e);
            C54211xA.EZpvd(cognitoIdentityProviderException2, c58859zSCopy$default.AEQbTJ(), null);
            throw cognitoIdentityProviderException2;
        }
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }
}
