package o;

import aws.sdk.kotlin.services.cognitoidentity.model.CognitoIdentityException;
import aws.sdk.kotlin.services.cognitoidentity.serde.ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.NoClassDefFoundError;

/* JADX INFO: loaded from: classes20.dex */
public final class DSAPublicKeySpec {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1 listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityException cognitoIdentityException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1) {
            listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1 = (ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1) continuation;
            int i = listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = i - Integer.MIN_VALUE;
            } else {
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1 = new ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = dt;
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c58859zS;
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c56239xzCopydefault;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 6;
                                    objCopydefault = invalidKeySpecException.AEQbTJ(dt, c58859zSCopy$default, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c56239xzCopydefault;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 4;
                                    objCopydefault = watchable.AEQbTJ(dt, c58859zSCopy$default, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c56239xzCopydefault;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 2;
                                    objCopydefault = hashMap.AEQbTJ(dt, c58859zSCopy$default, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c56239xzCopydefault;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 5;
                                    objCopydefault = generalSecurityException.AEQbTJ(dt, c58859zSCopy$default, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = interfaceC5039CjEZpvd;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c56239xzCopydefault;
                                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 3;
                                    objCopydefault = rSAOtherPrimeInfo.AEQbTJ(dt, c58859zSCopy$default, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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
                c58859zS = (C58859zS) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                dt = (DT) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
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
                c56239xz = (C56239xz) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 3:
                c56239xz = (C56239xz) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 4:
                c56239xz = (C56239xz) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 5:
                c56239xz = (C56239xz) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 6:
                c56239xz = (C56239xz) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
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

    public static final void copydefault(NoClassDefFoundError.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("Tags"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                InterfaceC5095En.Activity activityAEQbTJ = el.AEQbTJ(c5101Et);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (activityAEQbTJ.OLrzqt()) {
                    java.lang.String strKWHzl = activityAEQbTJ.KWHzl();
                    if (!activityAEQbTJ.copydefault()) {
                        activityAEQbTJ.gEmmrt();
                    } else {
                        linkedHashMap.put(strKWHzl, activityAEQbTJ.fetchVPNInfo());
                    }
                }
                application.AEQbTJ(linkedHashMap);
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
