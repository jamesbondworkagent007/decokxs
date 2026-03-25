package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.model.SsoException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.sso.serde.GetRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.AttributeSet;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMode {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        GetRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1 getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        SsoException ssoException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof GetRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1) {
            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1 = (GetRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1) continuation;
            int i = getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.label = i - Integer.MIN_VALUE;
            } else {
                getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1 = new GetRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0 = dt;
                getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1 = c58859zS;
                getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        ssoException = (SsoException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw ssoException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        ssoException = (SsoException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw ssoException;
                    }
                    if (i2 == 4) {
                        c56239xz = (C56239xz) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        ssoException = (SsoException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw ssoException;
                    }
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    ssoException = (SsoException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw ssoException;
                }
                c58859zS = (C58859zS) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1;
                dt = (DT) getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                switch (strOLrzqt.hashCode()) {
                    case -1362904677:
                        if (strOLrzqt.equals("UnauthorizedException")) {
                            LayoutInflater layoutInflater = new LayoutInflater();
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0 = interfaceC5039CjEZpvd;
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1 = c56239xzCopydefault;
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.label = 4;
                            objCopydefault = layoutInflater.AEQbTJ(dt, c58859zSCopy$default, getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            ssoException = (SsoException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw ssoException;
                        }
                        break;
                    case 1148038775:
                        if (strOLrzqt.equals("InvalidRequestException")) {
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper();
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0 = interfaceC5039CjEZpvd;
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1 = c56239xzCopydefault;
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.label = 3;
                            objCopydefault = contextThemeWrapper.AEQbTJ(dt, c58859zSCopy$default, getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            ssoException = (SsoException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw ssoException;
                        }
                        break;
                    case 1384808312:
                        if (strOLrzqt.equals("TooManyRequestsException")) {
                            KeyEvent keyEvent = new KeyEvent();
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0 = interfaceC5039CjEZpvd;
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1 = c56239xzCopydefault;
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.label = 5;
                            objCopydefault = keyEvent.AEQbTJ(dt, c58859zSCopy$default, getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            ssoException = (SsoException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw ssoException;
                        }
                        break;
                    case 1821306386:
                        if (strOLrzqt.equals("ResourceNotFoundException")) {
                            InputEvent inputEvent = new InputEvent();
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$0 = interfaceC5039CjEZpvd;
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.L$1 = c56239xzCopydefault;
                            getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1.label = 2;
                            objCopydefault = inputEvent.AEQbTJ(dt, c58859zSCopy$default, getRoleCredentialsOperationDeserializerKt$throwGetRoleCredentialsError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            ssoException = (SsoException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw ssoException;
                        }
                        break;
                }
            }
            ssoException = new SsoException(c56239xzCopydefault.copydefault());
            C54211xA.EZpvd(ssoException, interfaceC5039CjEZpvd, c56239xzCopydefault);
            throw ssoException;
        } catch (java.lang.Exception e) {
            SsoException ssoException2 = new SsoException("Failed to parse response as 'restJson1' error", e);
            C54211xA.EZpvd(ssoException2, c58859zSCopy$default.AEQbTJ(), null);
            throw ssoException2;
        }
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }

    public static final void EZpvd(AttributeSet.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("roleCredentials"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.KWHzl(DragEvent.EZpvd(el));
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
