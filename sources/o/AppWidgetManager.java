package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.SealedObject;

/* JADX INFO: loaded from: classes20.dex */
public final class AppWidgetManager {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        AdminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1 adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof AdminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1) {
            adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1 = (AdminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1) continuation;
            int i = adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label = i - Integer.MIN_VALUE;
            } else {
                adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1 = new AdminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0 = dt;
                adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1 = c58859zS;
                adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1);
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
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1 = c56239xzCopydefault;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label = 5;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1);
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
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1 = c56239xzCopydefault;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label = 4;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1);
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
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1 = c56239xzCopydefault;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label = 7;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1);
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
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1 = c56239xzCopydefault;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label = 2;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1);
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
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1 = c56239xzCopydefault;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label = 3;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1);
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
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1 = c56239xzCopydefault;
                                    adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.label = 6;
                                    objCopydefault = gestureStore.AEQbTJ(dt, c58859zSCopy$default, adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1);
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
                c58859zS = (C58859zS) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1;
                dt = (DT) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0;
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
                c56239xz = (C56239xz) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetDeviceOperationDeserializerKt$throwAdminGetDeviceError$1.L$0;
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

    public static final void KWHzl(SealedObject.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Device"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                application.EZpvd(ConstantState.AEQbTJ(el));
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
