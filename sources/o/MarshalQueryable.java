package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.RespondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.RecoverableSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class MarshalQueryable {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [64=21] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        RespondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1 respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof RespondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1) {
            respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1 = (RespondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1) continuation;
            int i = respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = i - Integer.MIN_VALUE;
            } else {
                respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1 = new RespondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = dt;
                respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c58859zS;
                respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                            case -1572556067:
                                if (strOLrzqt.equals("InvalidPasswordException")) {
                                    DdmHandleThread ddmHandleThread = new DdmHandleThread();
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 19;
                                    objCopydefault = ddmHandleThread.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 5;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 6;
                                    objCopydefault = ddmHandleHeap.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 14;
                                    objCopydefault = gesture.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 10;
                                    objCopydefault = gesturePoint.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                            case -631599401:
                                if (strOLrzqt.equals("MFAMethodNotFoundException")) {
                                    CameraDeviceImpl cameraDeviceImpl = new CameraDeviceImpl();
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 8;
                                    objCopydefault = cameraDeviceImpl.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 12;
                                    objCopydefault = resourcesImpl.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 17;
                                    objCopydefault = keyboard.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 3;
                                    objCopydefault = extractEditText.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 4;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 22;
                                    objCopydefault = uncheckedThrow.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 15;
                                    objCopydefault = xmlBlock.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 18;
                                    objCopydefault = iInputMethodWrapper.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 2;
                                    objCopydefault = hdmiTimerRecordSources.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 9;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 13;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 20;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 21;
                                    objCopydefault = clipboardManager.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 16;
                                    objCopydefault = cameraDeviceUserShim.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 11;
                                    objCopydefault = periodicAdvertisingReport.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0 = interfaceC5039CjEZpvd;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1 = c56239xzCopydefault;
                                    respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.label = 7;
                                    objCopydefault = gestureStore.AEQbTJ(dt, c58859zSCopy$default, respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1);
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
                c58859zS = (C58859zS) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                dt = (DT) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
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
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 9:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 10:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 11:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 12:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 13:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 14:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 15:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 16:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 17:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 18:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 19:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 20:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 21:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 22:
                c56239xz = (C56239xz) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) respondToAuthChallengeOperationDeserializerKt$throwRespondToAuthChallengeError$1.L$0;
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

    public static final void OLrzqt(RecoverableSecurityException.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("AuthenticationResult"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("ChallengeName"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("ChallengeParameters"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Session"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(AssociationRequest.KWHzl(el));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.copydefault(GrantCredentialsPermissionActivity.copydefault.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            taskDescription.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else if (numOLrzqt == null) {
                            return;
                        } else {
                            stateListAnimatorEZpvd.copydefault();
                        }
                    } else {
                        InterfaceC5095En.Activity activityAEQbTJ = el.AEQbTJ(c5101Et3);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (activityAEQbTJ.OLrzqt()) {
                            java.lang.String strKWHzl = activityAEQbTJ.KWHzl();
                            if (!activityAEQbTJ.copydefault()) {
                                activityAEQbTJ.gEmmrt();
                            } else {
                                linkedHashMap.put(strKWHzl, activityAEQbTJ.fetchVPNInfo());
                            }
                        }
                        taskDescription.KWHzl(linkedHashMap);
                    }
                }
            }
        }
    }
}
