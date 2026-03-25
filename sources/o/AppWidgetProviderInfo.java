package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.AdminGetUserOperationDeserializerKt$throwAdminGetUserError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.SecretKeyFactorySpi;

/* JADX INFO: loaded from: classes20.dex */
public final class AppWidgetProviderInfo {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [66=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        AdminGetUserOperationDeserializerKt$throwAdminGetUserError$1 adminGetUserOperationDeserializerKt$throwAdminGetUserError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof AdminGetUserOperationDeserializerKt$throwAdminGetUserError$1) {
            adminGetUserOperationDeserializerKt$throwAdminGetUserError$1 = (AdminGetUserOperationDeserializerKt$throwAdminGetUserError$1) continuation;
            int i = adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label = i - Integer.MIN_VALUE;
            } else {
                adminGetUserOperationDeserializerKt$throwAdminGetUserError$1 = new AdminGetUserOperationDeserializerKt$throwAdminGetUserError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0 = dt;
                adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1 = c58859zS;
                adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, adminGetUserOperationDeserializerKt$throwAdminGetUserError$1);
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
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1 = c56239xzCopydefault;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label = 6;
                                    objCopydefault = captureResultExtras.AEQbTJ(dt, c58859zSCopy$default, adminGetUserOperationDeserializerKt$throwAdminGetUserError$1);
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
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1 = c56239xzCopydefault;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label = 3;
                                    objCopydefault = keyboard.AEQbTJ(dt, c58859zSCopy$default, adminGetUserOperationDeserializerKt$throwAdminGetUserError$1);
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
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1 = c56239xzCopydefault;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label = 5;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, adminGetUserOperationDeserializerKt$throwAdminGetUserError$1);
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
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1 = c56239xzCopydefault;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label = 7;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, adminGetUserOperationDeserializerKt$throwAdminGetUserError$1);
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
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1 = c56239xzCopydefault;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label = 2;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, adminGetUserOperationDeserializerKt$throwAdminGetUserError$1);
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
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0 = interfaceC5039CjEZpvd;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1 = c56239xzCopydefault;
                                    adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.label = 4;
                                    objCopydefault = requestQueue.AEQbTJ(dt, c58859zSCopy$default, adminGetUserOperationDeserializerKt$throwAdminGetUserError$1);
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
                c58859zS = (C58859zS) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1;
                dt = (DT) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0;
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
                c56239xz = (C56239xz) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) adminGetUserOperationDeserializerKt$throwAdminGetUserError$1.L$0;
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

    public static final void AEQbTJ(SecretKeyFactorySpi.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("Enabled"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et2 = new C5101Et(fragment, new EX("MFAOptions"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("PreferredMfaSetting"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("UserAttributes"));
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et5 = new C5101Et(sharedElementCallback, new EX("UserCreateDate"));
        C5101Et c5101Et6 = new C5101Et(sharedElementCallback, new EX("UserLastModifiedDate"));
        C5101Et c5101Et7 = new C5101Et(fragment, new EX("UserMFASettingList"));
        C5101Et c5101Et8 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("UserStatus"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EX("Username"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        activity.EZpvd(c5101Et9);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.OLrzqt(stateListAnimatorEZpvd.AEQbTJ());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                actionBar.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    actionBar.KWHzl(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault7) {
                                        int iCopydefault8 = c5101Et8.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            actionBar.EZpvd(JobParameters.copydefault.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                                        } else {
                                            int iCopydefault9 = c5101Et9.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                actionBar.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                            } else if (numOLrzqt == null) {
                                                return;
                                            } else {
                                                stateListAnimatorEZpvd.copydefault();
                                            }
                                        }
                                    } else {
                                        InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et7);
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        while (actionBarKWHzl.EZpvd()) {
                                            if (!actionBarKWHzl.copydefault()) {
                                                actionBarKWHzl.gEmmrt();
                                            } else {
                                                arrayList.add(actionBarKWHzl.fetchVPNInfo());
                                            }
                                        }
                                        actionBar.KWHzl(arrayList);
                                    }
                                }
                            }
                        } else {
                            InterfaceC5095En.ActionBar actionBarKWHzl2 = el.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (actionBarKWHzl2.EZpvd()) {
                                if (!actionBarKWHzl2.copydefault()) {
                                    actionBarKWHzl2.gEmmrt();
                                } else {
                                    arrayList2.add(ScanRecord.AEQbTJ(el));
                                }
                            }
                            actionBar.OLrzqt(arrayList2);
                        }
                    }
                } else {
                    InterfaceC5095En.ActionBar actionBarKWHzl3 = el.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (actionBarKWHzl3.EZpvd()) {
                        if (!actionBarKWHzl3.copydefault()) {
                            actionBarKWHzl3.gEmmrt();
                        } else {
                            arrayList3.add(PhysicalCaptureResultInfo.EZpvd(el));
                        }
                    }
                    actionBar.EZpvd(arrayList3);
                }
            }
        }
    }
}
