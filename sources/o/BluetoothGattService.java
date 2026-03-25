package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.PSpecified;

/* JADX INFO: loaded from: classes20.dex */
public final class BluetoothGattService {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        AdminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1 adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof AdminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1) {
            adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1 = (AdminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1) continuation;
            int i = adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = i - Integer.MIN_VALUE;
            } else {
                adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1 = new AdminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0 = dt;
                adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1 = c58859zS;
                adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1);
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
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1 = c56239xzCopydefault;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = 7;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1);
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
                            case -643116472:
                                if (strOLrzqt.equals("UserPoolAddOnNotEnabledException")) {
                                    SoftInputWindow softInputWindow = new SoftInputWindow();
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1 = c56239xzCopydefault;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = 5;
                                    objCopydefault = softInputWindow.AEQbTJ(dt, c58859zSCopy$default, adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1);
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
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1 = c56239xzCopydefault;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = 3;
                                    objCopydefault = keyboard.AEQbTJ(dt, c58859zSCopy$default, adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1);
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
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1 = c56239xzCopydefault;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = 6;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1);
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
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1 = c56239xzCopydefault;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = 8;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1);
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
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1 = c56239xzCopydefault;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = 2;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1);
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
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1 = c56239xzCopydefault;
                                    adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.label = 4;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1);
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
                c58859zS = (C58859zS) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1;
                dt = (DT) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0;
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
                c56239xz = (C56239xz) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminListUserAuthEventsOperationDeserializerKt$throwAdminListUserAuthEventsError$1.L$0;
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

    public static final void AEQbTJ(PSpecified.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("AuthEvents"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                } else if (numOLrzqt == null) {
                    return;
                } else {
                    stateListAnimatorEZpvd.copydefault();
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (actionBarKWHzl.EZpvd()) {
                    if (!actionBarKWHzl.copydefault()) {
                        actionBarKWHzl.gEmmrt();
                    } else {
                        arrayList.add(ScanSettings.EZpvd(el));
                    }
                }
                application.copydefault(arrayList);
            }
        }
    }
}
