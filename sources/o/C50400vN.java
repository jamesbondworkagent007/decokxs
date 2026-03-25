package o;

import aws.sdk.kotlin.services.translate.model.TranslateException;
import aws.sdk.kotlin.services.translate.serde.StartTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C46267tO;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.vN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50400vN {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        StartTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1 startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TranslateException translateException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof StartTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1) {
            startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1 = (StartTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1) continuation;
            int i = startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label = i - Integer.MIN_VALUE;
            } else {
                startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1 = new StartTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0 = dt;
                startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1 = c58859zS;
                startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1);
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
                            case 218496528:
                                if (strOLrzqt.equals("InvalidParameterValueException")) {
                                    C50751va c50751va = new C50751va();
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1 = c56239xzCopydefault;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label = 5;
                                    objCopydefault = c50751va.AEQbTJ(dt, c58859zSCopy$default, startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 734598063:
                                if (strOLrzqt.equals("InternalServerException")) {
                                    C48616uY c48616uY = new C48616uY();
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1 = c56239xzCopydefault;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label = 2;
                                    objCopydefault = c48616uY.AEQbTJ(dt, c58859zSCopy$default, startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 774046472:
                                if (strOLrzqt.equals("UnsupportedLanguagePairException")) {
                                    C52184wC c52184wC = new C52184wC();
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1 = c56239xzCopydefault;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label = 4;
                                    objCopydefault = c52184wC.AEQbTJ(dt, c58859zSCopy$default, startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 1148038775:
                                if (strOLrzqt.equals("InvalidRequestException")) {
                                    C50910vd c50910vd = new C50910vd();
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1 = c56239xzCopydefault;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label = 6;
                                    objCopydefault = c50910vd.AEQbTJ(dt, c58859zSCopy$default, startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 1384808312:
                                if (strOLrzqt.equals("TooManyRequestsException")) {
                                    C53150wg c53150wg = new C53150wg();
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1 = c56239xzCopydefault;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label = 3;
                                    objCopydefault = c53150wg.AEQbTJ(dt, c58859zSCopy$default, startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                            case 1821306386:
                                if (strOLrzqt.equals("ResourceNotFoundException")) {
                                    C50265vI c50265vI = new C50265vI();
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1 = c56239xzCopydefault;
                                    startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.label = 7;
                                    objCopydefault = c50265vI.AEQbTJ(dt, c58859zSCopy$default, startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    translateException = (TranslateException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw translateException;
                                }
                                break;
                        }
                    }
                    translateException = new TranslateException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw translateException;
                } catch (java.lang.Exception e) {
                    TranslateException translateException2 = new TranslateException("Failed to parse response as 'awsJson1_1' error", e);
                    C54211xA.EZpvd(translateException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw translateException2;
                }
            case 1:
                c58859zS = (C58859zS) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1;
                dt = (DT) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                translateException = new TranslateException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 2:
                c56239xz = (C56239xz) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 3:
                c56239xz = (C56239xz) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 4:
                c56239xz = (C56239xz) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 5:
                c56239xz = (C56239xz) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 6:
                c56239xz = (C56239xz) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 7:
                c56239xz = (C56239xz) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startTextTranslationJobOperationDeserializerKt$throwStartTextTranslationJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void copydefault(C46267tO.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("JobId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("JobStatus"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.KWHzl(AbstractC47594tt.KWHzl.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else if (numOLrzqt == null) {
                    return;
                } else {
                    stateListAnimatorEZpvd.copydefault();
                }
            }
        }
    }
}
