package o;

import aws.sdk.kotlin.services.cognitoidentity.model.CognitoIdentityException;
import aws.sdk.kotlin.services.cognitoidentity.serde.CreateIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.Comparable;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes20.dex */
public final class System {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [64=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        CreateIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1 createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityException cognitoIdentityException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof CreateIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1) {
            createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1 = (CreateIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1) continuation;
            int i = createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label = i - Integer.MIN_VALUE;
            } else {
                createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1 = new CreateIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0 = dt;
                createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1 = c58859zS;
                createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1);
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
                                    NoSuchAlgorithmException noSuchAlgorithmException = new NoSuchAlgorithmException();
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0 = interfaceC5039CjEZpvd;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1 = c56239xzCopydefault;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label = 7;
                                    objCopydefault = noSuchAlgorithmException.AEQbTJ(dt, c58859zSCopy$default, createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw cognitoIdentityException;
                                }
                                break;
                            case -1416998079:
                                if (strOLrzqt.equals("NotAuthorizedException")) {
                                    InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0 = interfaceC5039CjEZpvd;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1 = c56239xzCopydefault;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label = 6;
                                    objCopydefault = invalidKeySpecException.AEQbTJ(dt, c58859zSCopy$default, createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw cognitoIdentityException;
                                }
                                break;
                            case -859985393:
                                if (strOLrzqt.equals("ResourceConflictException")) {
                                    MGF1ParameterSpec mGF1ParameterSpec = new MGF1ParameterSpec();
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0 = interfaceC5039CjEZpvd;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1 = c56239xzCopydefault;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label = 3;
                                    objCopydefault = mGF1ParameterSpec.AEQbTJ(dt, c58859zSCopy$default, createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw cognitoIdentityException;
                                }
                                break;
                            case 504305508:
                                if (strOLrzqt.equals("InternalErrorException")) {
                                    Watchable watchable = new Watchable();
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0 = interfaceC5039CjEZpvd;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1 = c56239xzCopydefault;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label = 4;
                                    objCopydefault = watchable.AEQbTJ(dt, c58859zSCopy$default, createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw cognitoIdentityException;
                                }
                                break;
                            case 1384808312:
                                if (strOLrzqt.equals("TooManyRequestsException")) {
                                    HashMap hashMap = new HashMap();
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0 = interfaceC5039CjEZpvd;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1 = c56239xzCopydefault;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label = 2;
                                    objCopydefault = hashMap.AEQbTJ(dt, c58859zSCopy$default, createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw cognitoIdentityException;
                                }
                                break;
                            case 1674340573:
                                if (strOLrzqt.equals("InvalidParameterException")) {
                                    GeneralSecurityException generalSecurityException = new GeneralSecurityException();
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0 = interfaceC5039CjEZpvd;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1 = c56239xzCopydefault;
                                    createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.label = 5;
                                    objCopydefault = generalSecurityException.AEQbTJ(dt, c58859zSCopy$default, createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw cognitoIdentityException;
                                }
                                break;
                        }
                    }
                    cognitoIdentityException = new CognitoIdentityException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw cognitoIdentityException;
                } catch (java.lang.Exception e) {
                    CognitoIdentityException cognitoIdentityException2 = new CognitoIdentityException("Failed to parse response as 'awsJson1_1' error", e);
                    C54211xA.EZpvd(cognitoIdentityException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw cognitoIdentityException2;
                }
            case 1:
                c58859zS = (C58859zS) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1;
                dt = (DT) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                cognitoIdentityException = new CognitoIdentityException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 2:
                c56239xz = (C56239xz) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 3:
                c56239xz = (C56239xz) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 4:
                c56239xz = (C56239xz) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 5:
                c56239xz = (C56239xz) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 6:
                c56239xz = (C56239xz) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 7:
                c56239xz = (C56239xz) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createIdentityPoolOperationDeserializerKt$throwCreateIdentityPoolError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void copydefault(Comparable.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et = new C5101Et(taskDescription, new EX("AllowClassicFlow"));
        C5101Et c5101Et2 = new C5101Et(taskDescription, new EX("AllowUnauthenticatedIdentities"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("CognitoIdentityProviders"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("DeveloperProviderName"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("IdentityPoolId"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("IdentityPoolName"));
        AbstractC5105Ex.Dialog dialog = AbstractC5105Ex.Dialog.KWHzl;
        C5101Et c5101Et7 = new C5101Et(dialog, new EX("IdentityPoolTags"));
        C5101Et c5101Et8 = new C5101Et(fragment, new EX("OpenIdConnectProviderARNs"));
        C5101Et c5101Et9 = new C5101Et(fragment, new EX("SamlProviderARNs"));
        C5101Et c5101Et10 = new C5101Et(dialog, new EX("SupportedLoginProviders"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
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
        activity.EZpvd(c5101Et10);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.EZpvd(java.lang.Boolean.valueOf(stateListAnimatorEZpvd.AEQbTJ()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.OLrzqt(stateListAnimatorEZpvd.AEQbTJ());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            actionBar.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                actionBar.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    actionBar.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault7) {
                                        C5101Et c5101Et11 = c5101Et;
                                        int iCopydefault8 = c5101Et8.copydefault();
                                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault8) {
                                            int iCopydefault9 = c5101Et9.copydefault();
                                            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault9) {
                                                int iCopydefault10 = c5101Et10.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    InterfaceC5095En.Activity activityAEQbTJ = el.AEQbTJ(c5101Et10);
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    while (activityAEQbTJ.OLrzqt()) {
                                                        java.lang.String strKWHzl = activityAEQbTJ.KWHzl();
                                                        if (!activityAEQbTJ.copydefault()) {
                                                            activityAEQbTJ.gEmmrt();
                                                        } else {
                                                            linkedHashMap.put(strKWHzl, activityAEQbTJ.fetchVPNInfo());
                                                        }
                                                    }
                                                    actionBar.OLrzqt(linkedHashMap);
                                                } else if (numOLrzqt == null) {
                                                    return;
                                                } else {
                                                    stateListAnimatorEZpvd.copydefault();
                                                }
                                            } else {
                                                InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et9);
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
                                        } else {
                                            InterfaceC5095En.ActionBar actionBarKWHzl2 = el.KWHzl(c5101Et8);
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            while (actionBarKWHzl2.EZpvd()) {
                                                if (!actionBarKWHzl2.copydefault()) {
                                                    actionBarKWHzl2.gEmmrt();
                                                } else {
                                                    arrayList2.add(actionBarKWHzl2.fetchVPNInfo());
                                                }
                                            }
                                            actionBar.OLrzqt(arrayList2);
                                        }
                                        c5101Et = c5101Et11;
                                    } else {
                                        InterfaceC5095En.Activity activityAEQbTJ2 = el.AEQbTJ(c5101Et7);
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        while (activityAEQbTJ2.OLrzqt()) {
                                            java.lang.String strKWHzl2 = activityAEQbTJ2.KWHzl();
                                            C5101Et c5101Et12 = c5101Et;
                                            if (!activityAEQbTJ2.copydefault()) {
                                                activityAEQbTJ2.gEmmrt();
                                            } else {
                                                linkedHashMap2.put(strKWHzl2, activityAEQbTJ2.fetchVPNInfo());
                                                c5101Et = c5101Et12;
                                            }
                                        }
                                        actionBar.AEQbTJ(linkedHashMap2);
                                    }
                                }
                            }
                        }
                    } else {
                        InterfaceC5095En.ActionBar actionBarKWHzl3 = el.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        while (actionBarKWHzl3.EZpvd()) {
                            if (!actionBarKWHzl3.copydefault()) {
                                actionBarKWHzl3.gEmmrt();
                            } else {
                                arrayList3.add(StrictMath.copydefault(el));
                            }
                        }
                        actionBar.EZpvd(arrayList3);
                    }
                }
            }
        }
    }
}
