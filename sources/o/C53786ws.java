package o;

import aws.sdk.kotlin.services.translate.model.TranslateException;
import aws.sdk.kotlin.services.translate.serde.TranslateTextOperationDeserializerKt$throwTranslateTextError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C48776uc;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C53786ws {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [64=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        TranslateTextOperationDeserializerKt$throwTranslateTextError$1 translateTextOperationDeserializerKt$throwTranslateTextError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TranslateException translateException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof TranslateTextOperationDeserializerKt$throwTranslateTextError$1) {
            translateTextOperationDeserializerKt$throwTranslateTextError$1 = (TranslateTextOperationDeserializerKt$throwTranslateTextError$1) continuation;
            int i = translateTextOperationDeserializerKt$throwTranslateTextError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                translateTextOperationDeserializerKt$throwTranslateTextError$1.label = i - Integer.MIN_VALUE;
            } else {
                translateTextOperationDeserializerKt$throwTranslateTextError$1 = new TranslateTextOperationDeserializerKt$throwTranslateTextError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = translateTextOperationDeserializerKt$throwTranslateTextError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (translateTextOperationDeserializerKt$throwTranslateTextError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = dt;
                translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c58859zS;
                translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                            case -1545607148:
                                if (strOLrzqt.equals("ServiceUnavailableException")) {
                                    C50481vQ c50481vQ = new C50481vQ();
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = interfaceC5039CjEZpvd;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c56239xzCopydefault;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 3;
                                    objCopydefault = c50481vQ.AEQbTJ(dt, c58859zSCopy$default, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                            case 588566607:
                                if (strOLrzqt.equals("TextSizeLimitExceededException")) {
                                    C53309wj c53309wj = new C53309wj();
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = interfaceC5039CjEZpvd;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c56239xzCopydefault;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 7;
                                    objCopydefault = c53309wj.AEQbTJ(dt, c58859zSCopy$default, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = interfaceC5039CjEZpvd;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c56239xzCopydefault;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 2;
                                    objCopydefault = c48616uY.AEQbTJ(dt, c58859zSCopy$default, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = interfaceC5039CjEZpvd;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c56239xzCopydefault;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 5;
                                    objCopydefault = c52184wC.AEQbTJ(dt, c58859zSCopy$default, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = interfaceC5039CjEZpvd;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c56239xzCopydefault;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 6;
                                    objCopydefault = c50910vd.AEQbTJ(dt, c58859zSCopy$default, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = interfaceC5039CjEZpvd;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c56239xzCopydefault;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 4;
                                    objCopydefault = c53150wg.AEQbTJ(dt, c58859zSCopy$default, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                            case 1411765675:
                                if (strOLrzqt.equals("DetectedLanguageLowConfidenceException")) {
                                    C48155uH c48155uH = new C48155uH();
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = interfaceC5039CjEZpvd;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c56239xzCopydefault;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 9;
                                    objCopydefault = c48155uH.AEQbTJ(dt, c58859zSCopy$default, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0 = interfaceC5039CjEZpvd;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1 = c56239xzCopydefault;
                                    translateTextOperationDeserializerKt$throwTranslateTextError$1.label = 8;
                                    objCopydefault = c50265vI.AEQbTJ(dt, c58859zSCopy$default, translateTextOperationDeserializerKt$throwTranslateTextError$1);
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
                c58859zS = (C58859zS) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                dt = (DT) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
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
                c56239xz = (C56239xz) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 3:
                c56239xz = (C56239xz) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 4:
                c56239xz = (C56239xz) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 5:
                c56239xz = (C56239xz) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 6:
                c56239xz = (C56239xz) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 7:
                c56239xz = (C56239xz) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 8:
                c56239xz = (C56239xz) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 9:
                c56239xz = (C56239xz) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) translateTextOperationDeserializerKt$throwTranslateTextError$1.L$0;
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

    public static final void copydefault(C48776uc.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("AppliedSettings"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("AppliedTerminologies"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("SourceLanguageCode"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("TargetLanguageCode"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("TranslatedText"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(C53998ww.OLrzqt(el));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            taskDescription.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else if (numOLrzqt == null) {
                                return;
                            } else {
                                stateListAnimatorEZpvd.copydefault();
                            }
                        }
                    }
                } else {
                    InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (actionBarKWHzl.EZpvd()) {
                        if (!actionBarKWHzl.copydefault()) {
                            actionBarKWHzl.gEmmrt();
                        } else {
                            arrayList.add(C49200uk.KWHzl(el));
                        }
                    }
                    taskDescription.OLrzqt(arrayList);
                }
            }
        }
    }
}
