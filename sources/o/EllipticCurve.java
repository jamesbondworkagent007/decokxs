package o;

import aws.sdk.kotlin.services.cognitoidentity.model.CognitoIdentityException;
import aws.sdk.kotlin.services.cognitoidentity.serde.MergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.NumberFormatException;

/* JADX INFO: loaded from: classes20.dex */
public final class EllipticCurve {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [61=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        MergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1 mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityException cognitoIdentityException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof MergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1) {
            mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1 = (MergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1) continuation;
            int i = mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label = i - Integer.MIN_VALUE;
            } else {
                mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1 = new MergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0 = dt;
                mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1 = c58859zS;
                mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1);
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
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1 = c56239xzCopydefault;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label = 7;
                                    objCopydefault = invalidKeySpecException.AEQbTJ(dt, c58859zSCopy$default, mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1);
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
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1 = c56239xzCopydefault;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label = 3;
                                    objCopydefault = mGF1ParameterSpec.AEQbTJ(dt, c58859zSCopy$default, mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1);
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
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1 = c56239xzCopydefault;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label = 5;
                                    objCopydefault = watchable.AEQbTJ(dt, c58859zSCopy$default, mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1);
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
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1 = c56239xzCopydefault;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label = 2;
                                    objCopydefault = hashMap.AEQbTJ(dt, c58859zSCopy$default, mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1);
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
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1 = c56239xzCopydefault;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label = 6;
                                    objCopydefault = generalSecurityException.AEQbTJ(dt, c58859zSCopy$default, mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1);
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
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0 = interfaceC5039CjEZpvd;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1 = c56239xzCopydefault;
                                    mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.label = 4;
                                    objCopydefault = rSAOtherPrimeInfo.AEQbTJ(dt, c58859zSCopy$default, mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1);
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
                c58859zS = (C58859zS) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1;
                dt = (DT) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0;
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
                c56239xz = (C56239xz) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 3:
                c56239xz = (C56239xz) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 4:
                c56239xz = (C56239xz) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 5:
                c56239xz = (C56239xz) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 6:
                c56239xz = (C56239xz) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 7:
                c56239xz = (C56239xz) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) mergeDeveloperIdentitiesOperationDeserializerKt$throwMergeDeveloperIdentitiesError$1.L$0;
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

    public static final void OLrzqt(NumberFormatException.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("IdentityId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
