package o;

import aws.sdk.kotlin.services.textract.model.TextractException;
import aws.sdk.kotlin.services.textract.serde.GetAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C33981nN;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C41398qq {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [69=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        GetAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1 getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TextractException textractException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof GetAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1) {
            getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1 = (GetAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1) continuation;
            int i = getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = i - Integer.MIN_VALUE;
            } else {
                getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1 = new GetAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0 = dt;
                getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1 = c58859zS;
                getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1);
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
                            case -1943616152:
                                if (strOLrzqt.equals("InternalServerError")) {
                                    C42631ra c42631ra = new C42631ra();
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = 8;
                                    objCopydefault = c42631ra.AEQbTJ(dt, c58859zSCopy$default, getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    textractException = (TextractException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw textractException;
                                }
                                break;
                            case -727499650:
                                if (strOLrzqt.equals("ProvisionedThroughputExceededException")) {
                                    C42064rF c42064rF = new C42064rF();
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = 6;
                                    objCopydefault = c42064rF.AEQbTJ(dt, c58859zSCopy$default, getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    textractException = (TextractException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw textractException;
                                }
                                break;
                            case -72198520:
                                if (strOLrzqt.equals("ThrottlingException")) {
                                    C45545ss c45545ss = new C45545ss();
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = 5;
                                    objCopydefault = c45545ss.AEQbTJ(dt, c58859zSCopy$default, getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    textractException = (TextractException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw textractException;
                                }
                                break;
                            case 122859728:
                                if (strOLrzqt.equals("AccessDeniedException")) {
                                    C38471pa c38471pa = new C38471pa();
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = 2;
                                    objCopydefault = c38471pa.AEQbTJ(dt, c58859zSCopy$default, getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    textractException = (TextractException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw textractException;
                                }
                                break;
                            case 1601562550:
                                if (strOLrzqt.equals("ValidationException")) {
                                    C44118sE c44118sE = new C44118sE();
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = 3;
                                    objCopydefault = c44118sE.AEQbTJ(dt, c58859zSCopy$default, getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    textractException = (TextractException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw textractException;
                                }
                                break;
                            case 1674340573:
                                if (strOLrzqt.equals("InvalidParameterException")) {
                                    C42737rc c42737rc = new C42737rc();
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = 7;
                                    objCopydefault = c42737rc.AEQbTJ(dt, c58859zSCopy$default, getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    textractException = (TextractException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw textractException;
                                }
                                break;
                            case 1821306386:
                                if (strOLrzqt.equals("ResourceNotFoundException")) {
                                    C42442rT c42442rT = new C42442rT();
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.label = 4;
                                    objCopydefault = c42442rT.AEQbTJ(dt, c58859zSCopy$default, getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    textractException = (TextractException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw textractException;
                                }
                                break;
                        }
                    }
                    textractException = new TextractException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw textractException;
                } catch (java.lang.Exception e) {
                    TextractException textractException2 = new TextractException("Failed to parse response as 'awsJson1_1' error", e);
                    C54211xA.EZpvd(textractException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw textractException2;
                }
            case 1:
                c58859zS = (C58859zS) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1;
                dt = (DT) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                textractException = new TextractException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 2:
                c56239xz = (C56239xz) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 3:
                c56239xz = (C56239xz) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 4:
                c56239xz = (C56239xz) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 5:
                c56239xz = (C56239xz) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 6:
                c56239xz = (C56239xz) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 7:
                c56239xz = (C56239xz) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 8:
                c56239xz = (C56239xz) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getAdapterVersionOperationDeserializerKt$throwGetAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void KWHzl(C33981nN.Activity activity, byte[] bArr) {
        C5101Et c5101Et;
        EL el = new EL(bArr);
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("AdapterId"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("AdapterVersion"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("CreationTime"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("DatasetConfig"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et6 = new C5101Et(fragment, new EX("EvaluationMetrics"));
        C5101Et c5101Et7 = new C5101Et(fragment, new EX("FeatureTypes"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("KMSKeyId"));
        C5101Et c5101Et9 = new C5101Et(pictureInPictureParams, new EX("OutputConfig"));
        C5101Et c5101Et10 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Status"));
        C5101Et c5101Et11 = new C5101Et(loaderManager, new EX("StatusMessage"));
        C5101Et c5101Et12 = new C5101Et(AbstractC5105Ex.Dialog.KWHzl, new EX("Tags"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        activity2.EZpvd(c5101Et6);
        activity2.EZpvd(c5101Et7);
        activity2.EZpvd(c5101Et8);
        activity2.EZpvd(c5101Et9);
        activity2.EZpvd(c5101Et10);
        activity2.EZpvd(c5101Et11);
        activity2.EZpvd(c5101Et12);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et2.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et3.copydefault();
                C5101Et c5101Et13 = c5101Et2;
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et4.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.OLrzqt(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                    } else {
                        int iCopydefault4 = c5101Et5.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.EZpvd(C38577pc.OLrzqt(el));
                        } else {
                            int iCopydefault5 = c5101Et6.copydefault();
                            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault5) {
                                int iCopydefault6 = c5101Et7.copydefault();
                                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault6) {
                                    c5101Et = c5101Et3;
                                    int iCopydefault7 = c5101Et8.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                    } else {
                                        int iCopydefault8 = c5101Et9.copydefault();
                                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault8) {
                                            activity.KWHzl(C41929rA.OLrzqt(el));
                                        } else {
                                            int iCopydefault9 = c5101Et10.copydefault();
                                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault9) {
                                                activity.KWHzl(AbstractC32276mW.OLrzqt.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                                            } else {
                                                int iCopydefault10 = c5101Et11.copydefault();
                                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault10) {
                                                    activity.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                                } else {
                                                    int iCopydefault11 = c5101Et12.copydefault();
                                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault11) {
                                                        InterfaceC5095En.Activity activityAEQbTJ = el.AEQbTJ(c5101Et12);
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                        while (activityAEQbTJ.OLrzqt()) {
                                                            java.lang.String strKWHzl = activityAEQbTJ.KWHzl();
                                                            if (!activityAEQbTJ.copydefault()) {
                                                                activityAEQbTJ.gEmmrt();
                                                            } else {
                                                                linkedHashMap.put(strKWHzl, activityAEQbTJ.fetchVPNInfo());
                                                            }
                                                        }
                                                        activity.copydefault(linkedHashMap);
                                                    } else if (numOLrzqt == null) {
                                                        return;
                                                    } else {
                                                        stateListAnimatorEZpvd.copydefault();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et7);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    while (actionBarKWHzl.EZpvd()) {
                                        if (!actionBarKWHzl.copydefault()) {
                                            actionBarKWHzl.gEmmrt();
                                        } else {
                                            arrayList.add(AbstractC33846nI.EZpvd.copydefault(actionBarKWHzl.fetchVPNInfo()));
                                            c5101Et3 = c5101Et3;
                                        }
                                    }
                                    c5101Et = c5101Et3;
                                    activity.EZpvd(arrayList);
                                }
                                c5101Et2 = c5101Et13;
                                c5101Et3 = c5101Et;
                            } else {
                                InterfaceC5095En.ActionBar actionBarKWHzl2 = el.KWHzl(c5101Et6);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                while (actionBarKWHzl2.EZpvd()) {
                                    if (!actionBarKWHzl2.copydefault()) {
                                        actionBarKWHzl2.gEmmrt();
                                    } else {
                                        arrayList2.add(C38895pi.OLrzqt(el));
                                    }
                                }
                                activity.OLrzqt(arrayList2);
                            }
                        }
                    }
                }
                c5101Et = c5101Et3;
                c5101Et2 = c5101Et13;
                c5101Et3 = c5101Et;
            }
        }
    }
}
