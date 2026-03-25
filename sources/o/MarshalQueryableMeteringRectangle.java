package o;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.CognitoIdentityProviderException;
import aws.sdk.kotlin.services.cognitoidentityprovider.serde.RevokeTokenOperationDeserializerKt$throwRevokeTokenError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class MarshalQueryableMeteringRectangle {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        RevokeTokenOperationDeserializerKt$throwRevokeTokenError$1 revokeTokenOperationDeserializerKt$throwRevokeTokenError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        CognitoIdentityProviderException cognitoIdentityProviderException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof RevokeTokenOperationDeserializerKt$throwRevokeTokenError$1) {
            revokeTokenOperationDeserializerKt$throwRevokeTokenError$1 = (RevokeTokenOperationDeserializerKt$throwRevokeTokenError$1) continuation;
            int i = revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = i - Integer.MIN_VALUE;
            } else {
                revokeTokenOperationDeserializerKt$throwRevokeTokenError$1 = new RevokeTokenOperationDeserializerKt$throwRevokeTokenError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0 = dt;
                revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1 = c58859zS;
                revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, revokeTokenOperationDeserializerKt$throwRevokeTokenError$1);
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
                            case -1362904677:
                                if (strOLrzqt.equals("UnauthorizedException")) {
                                    InputManagerInternal inputManagerInternal = new InputManagerInternal();
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1 = c56239xzCopydefault;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = 5;
                                    objCopydefault = inputManagerInternal.AEQbTJ(dt, c58859zSCopy$default, revokeTokenOperationDeserializerKt$throwRevokeTokenError$1);
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
                            case -574283855:
                                if (strOLrzqt.equals("UnsupportedTokenTypeException")) {
                                    ContextHubClient contextHubClient = new ContextHubClient();
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1 = c56239xzCopydefault;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = 4;
                                    objCopydefault = contextHubClient.AEQbTJ(dt, c58859zSCopy$default, revokeTokenOperationDeserializerKt$throwRevokeTokenError$1);
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
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1 = c56239xzCopydefault;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = 2;
                                    objCopydefault = resourcesImpl.AEQbTJ(dt, c58859zSCopy$default, revokeTokenOperationDeserializerKt$throwRevokeTokenError$1);
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
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1 = c56239xzCopydefault;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = 6;
                                    objCopydefault = sQLiteTableLockedException.AEQbTJ(dt, c58859zSCopy$default, revokeTokenOperationDeserializerKt$throwRevokeTokenError$1);
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
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1 = c56239xzCopydefault;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = 7;
                                    objCopydefault = hdmiRecordListener.AEQbTJ(dt, c58859zSCopy$default, revokeTokenOperationDeserializerKt$throwRevokeTokenError$1);
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
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1 = c56239xzCopydefault;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = 3;
                                    objCopydefault = ddmRegister.AEQbTJ(dt, c58859zSCopy$default, revokeTokenOperationDeserializerKt$throwRevokeTokenError$1);
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
                            case 2097301917:
                                if (strOLrzqt.equals("UnsupportedOperationException")) {
                                    ActivityRecognitionHardware activityRecognitionHardware = new ActivityRecognitionHardware();
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1 = c56239xzCopydefault;
                                    revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.label = 8;
                                    objCopydefault = activityRecognitionHardware.AEQbTJ(dt, c58859zSCopy$default, revokeTokenOperationDeserializerKt$throwRevokeTokenError$1);
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
                c58859zS = (C58859zS) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1;
                dt = (DT) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0;
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
                c56239xz = (C56239xz) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 3:
                c56239xz = (C56239xz) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 4:
                c56239xz = (C56239xz) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 5:
                c56239xz = (C56239xz) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 6:
                c56239xz = (C56239xz) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 7:
                c56239xz = (C56239xz) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                cognitoIdentityProviderException = (CognitoIdentityProviderException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(cognitoIdentityProviderException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw cognitoIdentityProviderException;
            case 8:
                c56239xz = (C56239xz) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) revokeTokenOperationDeserializerKt$throwRevokeTokenError$1.L$0;
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
}
