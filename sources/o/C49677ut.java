package o;

import aws.sdk.kotlin.services.translate.model.TranslateException;
import aws.sdk.kotlin.services.translate.serde.CreateParallelDataOperationDeserializerKt$throwCreateParallelDataError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C44581sW;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.ut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C49677ut {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [62=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        CreateParallelDataOperationDeserializerKt$throwCreateParallelDataError$1 createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TranslateException translateException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof CreateParallelDataOperationDeserializerKt$throwCreateParallelDataError$1) {
            createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1 = (CreateParallelDataOperationDeserializerKt$throwCreateParallelDataError$1) continuation;
            int i = createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = i - Integer.MIN_VALUE;
            } else {
                createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1 = new CreateParallelDataOperationDeserializerKt$throwCreateParallelDataError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = dt;
                createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c58859zS;
                createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                            case -2005002116:
                                if (strOLrzqt.equals("ConcurrentModificationException")) {
                                    C49306um c49306um = new C49306um();
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = interfaceC5039CjEZpvd;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c56239xzCopydefault;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 8;
                                    objCopydefault = c49306um.AEQbTJ(dt, c58859zSCopy$default, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                            case -1818544159:
                                if (strOLrzqt.equals("LimitExceededException")) {
                                    C51175vi c51175vi = new C51175vi();
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = interfaceC5039CjEZpvd;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c56239xzCopydefault;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 9;
                                    objCopydefault = c51175vi.AEQbTJ(dt, c58859zSCopy$default, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                            case 218496528:
                                if (strOLrzqt.equals("InvalidParameterValueException")) {
                                    C50751va c50751va = new C50751va();
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = interfaceC5039CjEZpvd;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c56239xzCopydefault;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 5;
                                    objCopydefault = c50751va.AEQbTJ(dt, c58859zSCopy$default, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                            case 616958275:
                                if (strOLrzqt.equals("TooManyTagsException")) {
                                    C53521wn c53521wn = new C53521wn();
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = interfaceC5039CjEZpvd;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c56239xzCopydefault;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 7;
                                    objCopydefault = c53521wn.AEQbTJ(dt, c58859zSCopy$default, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = interfaceC5039CjEZpvd;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c56239xzCopydefault;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 2;
                                    objCopydefault = c48616uY.AEQbTJ(dt, c58859zSCopy$default, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = interfaceC5039CjEZpvd;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c56239xzCopydefault;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 6;
                                    objCopydefault = c50910vd.AEQbTJ(dt, c58859zSCopy$default, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = interfaceC5039CjEZpvd;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c56239xzCopydefault;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 3;
                                    objCopydefault = c53150wg.AEQbTJ(dt, c58859zSCopy$default, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                            case 1643655293:
                                if (strOLrzqt.equals("ConflictException")) {
                                    C49412uo c49412uo = new C49412uo();
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0 = interfaceC5039CjEZpvd;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1 = c56239xzCopydefault;
                                    createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.label = 4;
                                    objCopydefault = c49412uo.AEQbTJ(dt, c58859zSCopy$default, createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1);
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
                c58859zS = (C58859zS) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                dt = (DT) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
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
                c56239xz = (C56239xz) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 3:
                c56239xz = (C56239xz) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 4:
                c56239xz = (C56239xz) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 5:
                c56239xz = (C56239xz) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 6:
                c56239xz = (C56239xz) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 7:
                c56239xz = (C56239xz) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 8:
                c56239xz = (C56239xz) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                translateException = (TranslateException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw translateException;
            case 9:
                c56239xz = (C56239xz) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createParallelDataOperationDeserializerKt$throwCreateParallelDataError$1.L$0;
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

    public static final void OLrzqt(C44581sW.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Name"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Status"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                application.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.copydefault(AbstractC46078tH.KWHzl.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else if (numOLrzqt == null) {
                    return;
                } else {
                    stateListAnimatorEZpvd.copydefault();
                }
            }
        }
    }
}
