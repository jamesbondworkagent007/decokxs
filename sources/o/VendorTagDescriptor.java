package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.SetUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.TabActivity;

/* JADX INFO: loaded from: classes21.dex */
public final class VendorTagDescriptor {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [64=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        SetUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1 setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof SetUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1) {
            setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1 = (SetUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1) continuation;
            int i = setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = i - Integer.MIN_VALUE;
            } else {
                setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1 = new SetUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0 = dt;
                setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1 = c58859zS;
                setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1);
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
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0 = interfaceC5039CjEZpvd;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1 = c56239xzCopydefault;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = 6;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1);
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
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0 = interfaceC5039CjEZpvd;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1 = c56239xzCopydefault;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = 3;
                                    objCopydefault = gesture.AEQbTJ(dt, c58859zSCopy$default, setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1);
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
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0 = interfaceC5039CjEZpvd;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1 = c56239xzCopydefault;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = 8;
                                    objCopydefault = gesturePoint.AEQbTJ(dt, c58859zSCopy$default, setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1);
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
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0 = interfaceC5039CjEZpvd;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1 = c56239xzCopydefault;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = 5;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1);
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
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0 = interfaceC5039CjEZpvd;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1 = c56239xzCopydefault;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = 7;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1);
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
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0 = interfaceC5039CjEZpvd;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1 = c56239xzCopydefault;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = 2;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1);
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
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0 = interfaceC5039CjEZpvd;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1 = c56239xzCopydefault;
                                    setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.label = 4;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1);
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
                c58859zS = (C58859zS) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1;
                dt = (DT) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0;
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
                c56239xz = (C56239xz) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setUserPoolMfaConfigOperationDeserializerKt$throwSetUserPoolMfaConfigError$1.L$0;
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

    public static final void copydefault(TabActivity.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("MfaConfiguration"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("SmsMfaConfiguration"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("SoftwareTokenMfaConfiguration"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.AEQbTJ(RestoreSession.OLrzqt.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.EZpvd(TaskDrainer.copydefault(el));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.KWHzl(TaskSingleDrainer.copydefault(el));
                    } else if (numOLrzqt == null) {
                        return;
                    } else {
                        stateListAnimatorEZpvd.copydefault();
                    }
                }
            }
        }
    }
}
