package o;

import aws.sdk.kotlin.services.textract.model.TextractException;
import aws.sdk.kotlin.services.textract.serde.GetDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C34116nS;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C41769qx {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [66=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        GetDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1 getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TextractException textractException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof GetDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1) {
            getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1 = (GetDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1) continuation;
            int i = getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = i - Integer.MIN_VALUE;
            } else {
                getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1 = new GetDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = dt;
                getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c58859zS;
                getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                            case -1961891719:
                                if (strOLrzqt.equals("InvalidS3ObjectException")) {
                                    C42843re c42843re = new C42843re();
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c56239xzCopydefault;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 7;
                                    objCopydefault = c42843re.AEQbTJ(dt, c58859zSCopy$default, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                            case -1943616152:
                                if (strOLrzqt.equals("InternalServerError")) {
                                    C42631ra c42631ra = new C42631ra();
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c56239xzCopydefault;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 9;
                                    objCopydefault = c42631ra.AEQbTJ(dt, c58859zSCopy$default, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c56239xzCopydefault;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 5;
                                    objCopydefault = c42064rF.AEQbTJ(dt, c58859zSCopy$default, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c56239xzCopydefault;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 4;
                                    objCopydefault = c45545ss.AEQbTJ(dt, c58859zSCopy$default, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c56239xzCopydefault;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 2;
                                    objCopydefault = c38471pa.AEQbTJ(dt, c58859zSCopy$default, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c56239xzCopydefault;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 8;
                                    objCopydefault = c42737rc.AEQbTJ(dt, c58859zSCopy$default, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                            case 1707181870:
                                if (strOLrzqt.equals("InvalidJobIdException")) {
                                    C40442qW c40442qW = new C40442qW();
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c56239xzCopydefault;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 3;
                                    objCopydefault = c40442qW.AEQbTJ(dt, c58859zSCopy$default, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                            case 1970073546:
                                if (strOLrzqt.equals("InvalidKMSKeyException")) {
                                    C42684rb c42684rb = new C42684rb();
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0 = interfaceC5039CjEZpvd;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1 = c56239xzCopydefault;
                                    getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.label = 6;
                                    objCopydefault = c42684rb.AEQbTJ(dt, c58859zSCopy$default, getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1);
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
                c58859zS = (C58859zS) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                dt = (DT) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
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
                c56239xz = (C56239xz) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 3:
                c56239xz = (C56239xz) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 4:
                c56239xz = (C56239xz) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 5:
                c56239xz = (C56239xz) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 6:
                c56239xz = (C56239xz) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 7:
                c56239xz = (C56239xz) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 8:
                c56239xz = (C56239xz) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 9:
                c56239xz = (C56239xz) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getDocumentTextDetectionOperationDeserializerKt$throwGetDocumentTextDetectionError$1.L$0;
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

    public static final void copydefault(C34116nS.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("Blocks"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DetectDocumentTextModelVersion"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("DocumentMetadata"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("JobStatus"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("NextToken"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("StatusMessage"));
        C5101Et c5101Et7 = new C5101Et(fragment, new EX("Warnings"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        activity2.EZpvd(c5101Et6);
        activity2.EZpvd(c5101Et7);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.copydefault(C40656qc.AEQbTJ(el));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.copydefault(AbstractC36549od.copydefault.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else {
                                    int iCopydefault7 = c5101Et7.copydefault();
                                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault7) {
                                        InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et7);
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        while (actionBarKWHzl.EZpvd()) {
                                            if (!actionBarKWHzl.copydefault()) {
                                                actionBarKWHzl.gEmmrt();
                                            } else {
                                                arrayList.add(C44200sH.AEQbTJ(el));
                                            }
                                        }
                                        activity.copydefault(arrayList);
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
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl2 = el.KWHzl(c5101Et);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (actionBarKWHzl2.EZpvd()) {
                    if (!actionBarKWHzl2.copydefault()) {
                        actionBarKWHzl2.gEmmrt();
                    } else {
                        arrayList2.add(C39688px.KWHzl(el));
                    }
                }
                activity.AEQbTJ(arrayList2);
            }
        }
    }
}
