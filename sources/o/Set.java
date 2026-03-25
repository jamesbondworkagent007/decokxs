package o;

import aws.sdk.kotlin.services.cognitoidentity.model.CognitoIdentityException;
import aws.sdk.kotlin.services.cognitoidentity.serde.UnlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class Set {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        UnlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1 unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityException cognitoIdentityException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof UnlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1) {
            unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1 = (UnlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1) continuation;
            int i = unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = i - Integer.MIN_VALUE;
            } else {
                unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1 = new UnlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0 = dt;
                unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1 = c58859zS;
                unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1);
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
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0 = interfaceC5039CjEZpvd;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1 = c56239xzCopydefault;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = 8;
                                    objCopydefault = invalidKeySpecException.AEQbTJ(dt, c58859zSCopy$default, unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1);
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
                            case -1327318235:
                                if (strOLrzqt.equals("ExternalServiceException")) {
                                    Array array = new Array();
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0 = interfaceC5039CjEZpvd;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1 = c56239xzCopydefault;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = 3;
                                    objCopydefault = array.AEQbTJ(dt, c58859zSCopy$default, unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1);
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
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0 = interfaceC5039CjEZpvd;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1 = c56239xzCopydefault;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = 4;
                                    objCopydefault = mGF1ParameterSpec.AEQbTJ(dt, c58859zSCopy$default, unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1);
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
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0 = interfaceC5039CjEZpvd;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1 = c56239xzCopydefault;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = 6;
                                    objCopydefault = watchable.AEQbTJ(dt, c58859zSCopy$default, unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1);
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
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0 = interfaceC5039CjEZpvd;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1 = c56239xzCopydefault;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = 2;
                                    objCopydefault = hashMap.AEQbTJ(dt, c58859zSCopy$default, unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1);
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
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0 = interfaceC5039CjEZpvd;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1 = c56239xzCopydefault;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = 7;
                                    objCopydefault = generalSecurityException.AEQbTJ(dt, c58859zSCopy$default, unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1);
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
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0 = interfaceC5039CjEZpvd;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1 = c56239xzCopydefault;
                                    unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.label = 5;
                                    objCopydefault = rSAOtherPrimeInfo.AEQbTJ(dt, c58859zSCopy$default, unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1);
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
                c58859zS = (C58859zS) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1;
                dt = (DT) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0;
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
                c56239xz = (C56239xz) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 3:
                c56239xz = (C56239xz) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 4:
                c56239xz = (C56239xz) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 5:
                c56239xz = (C56239xz) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 6:
                c56239xz = (C56239xz) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 7:
                c56239xz = (C56239xz) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityException = (CognitoIdentityException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityException;
            case 8:
                c56239xz = (C56239xz) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) unlinkIdentityOperationDeserializerKt$throwUnlinkIdentityError$1.L$0;
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
}
