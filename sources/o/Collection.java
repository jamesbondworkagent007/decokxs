package o;

import aws.sdk.kotlin.services.cognitoidentity.model.CognitoIdentityException;
import aws.sdk.kotlin.services.cognitoidentity.serde.SetPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.Override;

/* JADX INFO: loaded from: classes20.dex */
public final class Collection {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        SetPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1 setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityException cognitoIdentityException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof SetPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1) {
            setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1 = (SetPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1) continuation;
            int i = setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label = i - Integer.MIN_VALUE;
            } else {
                setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1 = new SetPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0 = dt;
                setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1 = c58859zS;
                setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1);
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
                                    InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0 = interfaceC5039CjEZpvd;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1 = c56239xzCopydefault;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label = 6;
                                    objCopydefault = invalidKeySpecException.AEQbTJ(dt, c58859zSCopy$default, setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1);
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
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0 = interfaceC5039CjEZpvd;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1 = c56239xzCopydefault;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label = 4;
                                    objCopydefault = watchable.AEQbTJ(dt, c58859zSCopy$default, setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1);
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
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0 = interfaceC5039CjEZpvd;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1 = c56239xzCopydefault;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label = 2;
                                    objCopydefault = hashMap.AEQbTJ(dt, c58859zSCopy$default, setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1);
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
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0 = interfaceC5039CjEZpvd;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1 = c56239xzCopydefault;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label = 5;
                                    objCopydefault = generalSecurityException.AEQbTJ(dt, c58859zSCopy$default, setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1);
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
                            case 1821306386:
                                if (strOLrzqt.equals("ResourceNotFoundException")) {
                                    RSAOtherPrimeInfo rSAOtherPrimeInfo = new RSAOtherPrimeInfo();
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0 = interfaceC5039CjEZpvd;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1 = c56239xzCopydefault;
                                    setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.label = 3;
                                    objCopydefault = rSAOtherPrimeInfo.AEQbTJ(dt, c58859zSCopy$default, setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1);
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
                c58859zS = (C58859zS) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1;
                dt = (DT) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0;
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
                c56239xz = (C56239xz) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 3:
                c56239xz = (C56239xz) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 4:
                c56239xz = (C56239xz) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 5:
                c56239xz = (C56239xz) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 6:
                c56239xz = (C56239xz) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) setPrincipalTagAttributeMapOperationDeserializerKt$throwSetPrincipalTagAttributeMapError$1.L$0;
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

    public static final void OLrzqt(Override.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("IdentityPoolId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("IdentityProviderName"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("PrincipalTags"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("UseDefaults"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.EZpvd(java.lang.Boolean.valueOf(stateListAnimatorEZpvd.AEQbTJ()));
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
                        activity.KWHzl(linkedHashMap);
                    }
                }
            }
        }
    }
}
