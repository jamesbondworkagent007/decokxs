package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.GetUserOperationDeserializerKt$throwGetUserError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.ApplicationErrorReport;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class SQLiteDebug {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [64=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        GetUserOperationDeserializerKt$throwGetUserError$1 getUserOperationDeserializerKt$throwGetUserError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof GetUserOperationDeserializerKt$throwGetUserError$1) {
            getUserOperationDeserializerKt$throwGetUserError$1 = (GetUserOperationDeserializerKt$throwGetUserError$1) continuation;
            int i = getUserOperationDeserializerKt$throwGetUserError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUserOperationDeserializerKt$throwGetUserError$1.label = i - Integer.MIN_VALUE;
            } else {
                getUserOperationDeserializerKt$throwGetUserError$1 = new GetUserOperationDeserializerKt$throwGetUserError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = getUserOperationDeserializerKt$throwGetUserError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (getUserOperationDeserializerKt$throwGetUserError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                getUserOperationDeserializerKt$throwGetUserError$1.L$0 = dt;
                getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c58859zS;
                getUserOperationDeserializerKt$throwGetUserError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 9;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 2;
                                    objCopydefault = resourcesImpl.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 5;
                                    objCopydefault = keyboard.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 7;
                                    objCopydefault = extractEditText.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 8;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 10;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 3;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 6;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    getUserOperationDeserializerKt$throwGetUserError$1.L$1 = c56239xzCopydefault;
                                    getUserOperationDeserializerKt$throwGetUserError$1.label = 4;
                                    objCopydefault = cameraDeviceUserShim.AEQbTJ(dt, c58859zSCopy$default, getUserOperationDeserializerKt$throwGetUserError$1);
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
                c58859zS = (C58859zS) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                dt = (DT) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
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
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 9:
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 10:
                c56239xz = (C56239xz) getUserOperationDeserializerKt$throwGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getUserOperationDeserializerKt$throwGetUserError$1.L$0;
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

    public static final void EZpvd(ApplicationErrorReport.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("MFAOptions"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("PreferredMfaSetting"));
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("UserAttributes"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("UserMFASettingList"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("Username"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else if (numOLrzqt == null) {
                                return;
                            } else {
                                stateListAnimatorEZpvd.copydefault();
                            }
                        } else {
                            InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            while (actionBarKWHzl.EZpvd()) {
                                if (!actionBarKWHzl.copydefault()) {
                                    actionBarKWHzl.gEmmrt();
                                } else {
                                    arrayList.add(actionBarKWHzl.fetchVPNInfo());
                                }
                            }
                            activity.EZpvd(arrayList);
                        }
                    } else {
                        InterfaceC5095En.ActionBar actionBarKWHzl2 = el.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        while (actionBarKWHzl2.EZpvd()) {
                            if (!actionBarKWHzl2.copydefault()) {
                                actionBarKWHzl2.gEmmrt();
                            } else {
                                arrayList2.add(ScanRecord.AEQbTJ(el));
                            }
                        }
                        activity.KWHzl(arrayList2);
                    }
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl3 = el.KWHzl(c5101Et);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (actionBarKWHzl3.EZpvd()) {
                    if (!actionBarKWHzl3.copydefault()) {
                        actionBarKWHzl3.gEmmrt();
                    } else {
                        arrayList3.add(PhysicalCaptureResultInfo.EZpvd(el));
                    }
                }
                activity.OLrzqt(arrayList3);
            }
        }
    }
}
