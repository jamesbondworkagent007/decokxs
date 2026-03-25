package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.ForgotPasswordOperationDeserializerKt$throwForgotPasswordError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.UserIdInt;

/* JADX INFO: loaded from: classes21.dex */
public final class ContentObservable {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=15] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ForgotPasswordOperationDeserializerKt$throwForgotPasswordError$1 forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ForgotPasswordOperationDeserializerKt$throwForgotPasswordError$1) {
            forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1 = (ForgotPasswordOperationDeserializerKt$throwForgotPasswordError$1) continuation;
            int i = forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = i - Integer.MIN_VALUE;
            } else {
                forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1 = new ForgotPasswordOperationDeserializerKt$throwForgotPasswordError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = dt;
                forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c58859zS;
                forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                            case -1818544159:
                                if (strOLrzqt.equals("LimitExceededException")) {
                                    Learner learner = new Learner();
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 4;
                                    objCopydefault = learner.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                            case -1699379746:
                                if (strOLrzqt.equals("InvalidEmailRoleAccessPolicyException")) {
                                    DdmHandleAppName ddmHandleAppName = new DdmHandleAppName();
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 7;
                                    objCopydefault = ddmHandleAppName.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 6;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 8;
                                    objCopydefault = ddmHandleHeap.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 13;
                                    objCopydefault = gesture.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 10;
                                    objCopydefault = gesturePoint.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 11;
                                    objCopydefault = resourcesImpl.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 14;
                                    objCopydefault = keyboard.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 5;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 15;
                                    objCopydefault = iInputMethodWrapper.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 2;
                                    objCopydefault = hdmiTimerRecordSources.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 9;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 12;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 16;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0 = interfaceC5039CjEZpvd;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1 = c56239xzCopydefault;
                                    forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.label = 3;
                                    objCopydefault = activityNotFoundException.AEQbTJ(dt, c58859zSCopy$default, forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1);
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
                c58859zS = (C58859zS) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                dt = (DT) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
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
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 9:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 10:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 11:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 12:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 13:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 14:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 15:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 16:
                c56239xz = (C56239xz) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) forgotPasswordOperationDeserializerKt$throwForgotPasswordError$1.L$0;
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

    public static final void OLrzqt(UserIdInt.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("CodeDeliveryDetails"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                application.AEQbTJ(ClipDescription.KWHzl(el));
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
