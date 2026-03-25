package o;

import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.SsoOidcException;
import aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.serde.CreateTokenOperationDeserializerKt$throwCreateTokenError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.OnCapturedPointerListener;

/* JADX INFO: loaded from: classes.dex */
public final class OnHoverListener {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [61=11] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        CreateTokenOperationDeserializerKt$throwCreateTokenError$1 createTokenOperationDeserializerKt$throwCreateTokenError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        SsoOidcException ssoOidcException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof CreateTokenOperationDeserializerKt$throwCreateTokenError$1) {
            createTokenOperationDeserializerKt$throwCreateTokenError$1 = (CreateTokenOperationDeserializerKt$throwCreateTokenError$1) continuation;
            int i = createTokenOperationDeserializerKt$throwCreateTokenError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createTokenOperationDeserializerKt$throwCreateTokenError$1.label = i - Integer.MIN_VALUE;
            } else {
                createTokenOperationDeserializerKt$throwCreateTokenError$1 = new CreateTokenOperationDeserializerKt$throwCreateTokenError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = createTokenOperationDeserializerKt$throwCreateTokenError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (createTokenOperationDeserializerKt$throwCreateTokenError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = dt;
                createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c58859zS;
                createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, createTokenOperationDeserializerKt$throwCreateTokenError$1);
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
                            case -1190608143:
                                if (strOLrzqt.equals("AuthorizationPendingException")) {
                                    OnDragListener onDragListener = new OnDragListener();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 7;
                                    objCopydefault = onDragListener.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case -1101695507:
                                if (strOLrzqt.equals("InvalidClientException")) {
                                    OnUnhandledKeyEventListener onUnhandledKeyEventListener = new OnUnhandledKeyEventListener();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 12;
                                    objCopydefault = onUnhandledKeyEventListener.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case -608224069:
                                if (strOLrzqt.equals("ExpiredTokenException")) {
                                    OnTouchListener onTouchListener = new OnTouchListener();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 3;
                                    objCopydefault = onTouchListener.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case -213094100:
                                if (strOLrzqt.equals("SlowDownException")) {
                                    OnPreDrawListener onPreDrawListener = new OnPreDrawListener();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 4;
                                    objCopydefault = onPreDrawListener.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case 122859728:
                                if (strOLrzqt.equals("AccessDeniedException")) {
                                    OnCreateContextMenuListener onCreateContextMenuListener = new OnCreateContextMenuListener();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 11;
                                    objCopydefault = onCreateContextMenuListener.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case 369611024:
                                if (strOLrzqt.equals("UnauthorizedClientException")) {
                                    ViewParent viewParent = new ViewParent();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 5;
                                    objCopydefault = viewParent.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case 734598063:
                                if (strOLrzqt.equals("InternalServerException")) {
                                    OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener = new OnSystemUiVisibilityChangeListener();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 2;
                                    objCopydefault = onSystemUiVisibilityChangeListener.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case 797925906:
                                if (strOLrzqt.equals("InvalidScopeException")) {
                                    ViewPropertyAnimator viewPropertyAnimator = new ViewPropertyAnimator();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 9;
                                    objCopydefault = viewPropertyAnimator.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case 1148038775:
                                if (strOLrzqt.equals("InvalidRequestException")) {
                                    ViewOverlay viewOverlay = new ViewOverlay();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 8;
                                    objCopydefault = viewOverlay.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case 1302626378:
                                if (strOLrzqt.equals("InvalidGrantException")) {
                                    ViewGroup viewGroup = new ViewGroup();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 6;
                                    objCopydefault = viewGroup.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                            case 2022771054:
                                if (strOLrzqt.equals("UnsupportedGrantTypeException")) {
                                    AccessibilityEvent accessibilityEvent = new AccessibilityEvent();
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0 = interfaceC5039CjEZpvd;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1 = c56239xzCopydefault;
                                    createTokenOperationDeserializerKt$throwCreateTokenError$1.label = 10;
                                    objCopydefault = accessibilityEvent.AEQbTJ(dt, c58859zSCopy$default, createTokenOperationDeserializerKt$throwCreateTokenError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    ssoOidcException = (SsoOidcException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw ssoOidcException;
                                }
                                break;
                        }
                    }
                    ssoOidcException = new SsoOidcException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw ssoOidcException;
                } catch (java.lang.Exception e) {
                    SsoOidcException ssoOidcException2 = new SsoOidcException("Failed to parse response as 'restJson1' error", e);
                    C54211xA.EZpvd(ssoOidcException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw ssoOidcException2;
                }
            case 1:
                c58859zS = (C58859zS) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                dt = (DT) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                ssoOidcException = new SsoOidcException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 2:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 3:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 4:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 5:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 6:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 7:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 8:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 9:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 10:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 11:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            case 12:
                c56239xz = (C56239xz) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createTokenOperationDeserializerKt$throwCreateTokenError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                ssoOidcException = (SsoOidcException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(ssoOidcException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw ssoOidcException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void EZpvd(OnCapturedPointerListener.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("accessToken"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("expiresIn"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("idToken"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("refreshToken"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("tokenType"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.copydefault(stateListAnimatorEZpvd.djBIcL());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else if (numOLrzqt == null) {
                                return;
                            } else {
                                stateListAnimatorEZpvd.copydefault();
                            }
                        }
                    }
                }
            }
        }
    }
}
