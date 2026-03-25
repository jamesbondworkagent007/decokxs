package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.DeleteUserOperationDeserializerKt$throwDeleteUserError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageParserCacheHelper {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DeleteUserOperationDeserializerKt$throwDeleteUserError$1 deleteUserOperationDeserializerKt$throwDeleteUserError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DeleteUserOperationDeserializerKt$throwDeleteUserError$1) {
            deleteUserOperationDeserializerKt$throwDeleteUserError$1 = (DeleteUserOperationDeserializerKt$throwDeleteUserError$1) continuation;
            int i = deleteUserOperationDeserializerKt$throwDeleteUserError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteUserOperationDeserializerKt$throwDeleteUserError$1 = new DeleteUserOperationDeserializerKt$throwDeleteUserError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = deleteUserOperationDeserializerKt$throwDeleteUserError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (deleteUserOperationDeserializerKt$throwDeleteUserError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = dt;
                deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c58859zS;
                deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                byte[] bArr = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
                C58859zS c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                try {
                    c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
                    strOLrzqt = c56239xzCopydefault.OLrzqt();
                    if (strOLrzqt != null) {
                        switch (strOLrzqt.hashCode()) {
                            case -1416998079:
                                if (strOLrzqt.equals("NotAuthorizedException")) {
                                    CaptureResultExtras captureResultExtras = new CaptureResultExtras();
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 9;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
                            case -392923018:
                                if (strOLrzqt.equals("ForbiddenException")) {
                                    ResourcesImpl resourcesImpl = new ResourcesImpl();
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 2;
                                    objCopydefault = resourcesImpl.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
                            case -344619019:
                                if (strOLrzqt.equals("UserNotFoundException")) {
                                    Keyboard keyboard = new Keyboard();
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 5;
                                    objCopydefault = keyboard.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
                            case -26861384:
                                if (strOLrzqt.equals("UserNotConfirmedException")) {
                                    ExtractEditText extractEditText = new ExtractEditText();
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 7;
                                    objCopydefault = extractEditText.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 8;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
                            case 1384808312:
                                if (strOLrzqt.equals("TooManyRequestsException")) {
                                    HdmiRecordListener hdmiRecordListener = new HdmiRecordListener();
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 10;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 3;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 6;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
                            case 1937518204:
                                if (strOLrzqt.equals("PasswordResetRequiredException")) {
                                    CameraDeviceUserShim cameraDeviceUserShim = new CameraDeviceUserShim();
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1 = c56239xzCopydefault;
                                    deleteUserOperationDeserializerKt$throwDeleteUserError$1.label = 4;
                                    objCopydefault = cameraDeviceUserShim.AEQbTJ(dt, c58859zSCopy$default, deleteUserOperationDeserializerKt$throwDeleteUserError$1);
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
            case 1:
                c58859zS = (C58859zS) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                dt = (DT) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                cognitoIdentityProviderException = new CognitoIdentityProviderException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 2:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 9:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 10:
                c56239xz = (C56239xz) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteUserOperationDeserializerKt$throwDeleteUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
