package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.VerifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.ActivityRelaunchItem;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes2.dex */
public final class KeepalivePacketData {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=13] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        VerifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1 verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof VerifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1) {
            verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1 = (VerifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1) continuation;
            int i = verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = i - Integer.MIN_VALUE;
            } else {
                verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1 = new VerifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = dt;
                verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c58859zS;
                verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 4;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 7;
                                    objCopydefault = resourcesImpl.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 10;
                                    objCopydefault = keyboard.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 2;
                                    objCopydefault = extractEditText.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 3;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                            case 668921642:
                                if (strOLrzqt.equals("SoftwareTokenMFANotFoundException")) {
                                    UncheckedThrow uncheckedThrow = new UncheckedThrow();
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 14;
                                    objCopydefault = uncheckedThrow.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 6;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                            case 1603580054:
                                if (strOLrzqt.equals("EnableSoftwareTokenMFAException")) {
                                    ObbInfo obbInfo = new ObbInfo();
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 13;
                                    objCopydefault = obbInfo.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 8;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 11;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                            case 1852399508:
                                if (strOLrzqt.equals("CodeMismatchException")) {
                                    ClipboardManager clipboardManager = new ClipboardManager();
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 12;
                                    objCopydefault = clipboardManager.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 9;
                                    objCopydefault = cameraDeviceUserShim.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                            case 2130594583:
                                if (strOLrzqt.equals("InvalidUserPoolConfigurationException")) {
                                    GestureStore gestureStore = new GestureStore();
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1 = c56239xzCopydefault;
                                    verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.label = 5;
                                    objCopydefault = gestureStore.AEQbTJ(dt, c58859zSCopy$default, verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1);
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
                c58859zS = (C58859zS) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                dt = (DT) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
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
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 9:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 10:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 11:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 12:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 13:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 14:
                c56239xz = (C56239xz) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) verifySoftwareTokenOperationDeserializerKt$throwVerifySoftwareTokenError$1.L$0;
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

    public static final void copydefault(ActivityRelaunchItem.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Session"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Status"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.copydefault(ActivityLifecycleItem.EZpvd.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else if (numOLrzqt == null) {
                    return;
                } else {
                    stateListAnimatorEZpvd.copydefault();
                }
            }
        }
    }
}
