package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.UpdateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.BackupManagerMonitor;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class TunerCallbackAdapter {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=19] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        UpdateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1 updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof UpdateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1) {
            updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1 = (UpdateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1) continuation;
            int i = updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = i - Integer.MIN_VALUE;
            } else {
                updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1 = new UpdateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = dt;
                updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c58859zS;
                updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case -1699379746:
                                if (strOLrzqt.equals("InvalidEmailRoleAccessPolicyException")) {
                                    DdmHandleAppName ddmHandleAppName = new DdmHandleAppName();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 7;
                                    objCopydefault = ddmHandleAppName.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case -1416998079:
                                if (strOLrzqt.equals("NotAuthorizedException")) {
                                    CaptureResultExtras captureResultExtras = new CaptureResultExtras();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 6;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case -1003072464:
                                if (strOLrzqt.equals("InvalidLambdaResponseException")) {
                                    DdmHandleHeap ddmHandleHeap = new DdmHandleHeap();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 8;
                                    objCopydefault = ddmHandleHeap.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case -828042111:
                                if (strOLrzqt.equals("InvalidSmsRoleAccessPolicyException")) {
                                    Gesture gesture = new Gesture();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 14;
                                    objCopydefault = gesture.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case -668746953:
                                if (strOLrzqt.equals("InvalidSmsRoleTrustRelationshipException")) {
                                    GesturePoint gesturePoint = new GesturePoint();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 10;
                                    objCopydefault = gesturePoint.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 12;
                                    objCopydefault = resourcesImpl.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 17;
                                    objCopydefault = keyboard.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 4;
                                    objCopydefault = extractEditText.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 5;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case 696704477:
                                if (strOLrzqt.equals("ExpiredCodeException")) {
                                    XmlBlock xmlBlock = new XmlBlock();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 15;
                                    objCopydefault = xmlBlock.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case 905283300:
                                if (strOLrzqt.equals("UserLambdaValidationException")) {
                                    IInputMethodWrapper iInputMethodWrapper = new IInputMethodWrapper();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 18;
                                    objCopydefault = iInputMethodWrapper.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case 1016859543:
                                if (strOLrzqt.equals("UnexpectedLambdaException")) {
                                    HdmiTimerRecordSources hdmiTimerRecordSources = new HdmiTimerRecordSources();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 2;
                                    objCopydefault = hdmiTimerRecordSources.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 9;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 13;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 19;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 20;
                                    objCopydefault = clipboardManager.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 16;
                                    objCopydefault = cameraDeviceUserShim.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case 1946878246:
                                if (strOLrzqt.equals("CodeDeliveryFailureException")) {
                                    ActivityNotFoundException activityNotFoundException = new ActivityNotFoundException();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 3;
                                    objCopydefault = activityNotFoundException.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                            case 2109214467:
                                if (strOLrzqt.equals("AliasExistsException")) {
                                    PeriodicAdvertisingReport periodicAdvertisingReport = new PeriodicAdvertisingReport();
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1 = c56239xzCopydefault;
                                    updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.label = 11;
                                    objCopydefault = periodicAdvertisingReport.AEQbTJ(dt, c58859zSCopy$default, updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1);
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
                c58859zS = (C58859zS) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                dt = (DT) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
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
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 9:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 10:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 11:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 12:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 13:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 14:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 15:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 16:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 17:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 18:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 19:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 20:
                c56239xz = (C56239xz) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateUserAttributesOperationDeserializerKt$throwUpdateUserAttributesError$1.L$0;
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

    public static final void OLrzqt(BackupManagerMonitor.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("CodeDeliveryDetailsList"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (actionBarKWHzl.EZpvd()) {
                    if (!actionBarKWHzl.copydefault()) {
                        actionBarKWHzl.gEmmrt();
                    } else {
                        arrayList.add(ClipDescription.KWHzl(el));
                    }
                }
                taskDescription.copydefault(arrayList);
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
