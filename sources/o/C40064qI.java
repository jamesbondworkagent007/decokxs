package o;

import aws.sdk.kotlin.services.textract.model.TextractException;
import aws.sdk.kotlin.services.textract.serde.GetLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C36390oa;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.qI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C40064qI {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [66=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        GetLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1 getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TextractException textractException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof GetLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1) {
            getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1 = (GetLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1) continuation;
            int i = getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = i - Integer.MIN_VALUE;
            } else {
                getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1 = new GetLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = dt;
                getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c58859zS;
                getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = interfaceC5039CjEZpvd;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c56239xzCopydefault;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 7;
                                    objCopydefault = c42843re.AEQbTJ(dt, c58859zSCopy$default, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = interfaceC5039CjEZpvd;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c56239xzCopydefault;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 9;
                                    objCopydefault = c42631ra.AEQbTJ(dt, c58859zSCopy$default, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = interfaceC5039CjEZpvd;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c56239xzCopydefault;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 5;
                                    objCopydefault = c42064rF.AEQbTJ(dt, c58859zSCopy$default, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = interfaceC5039CjEZpvd;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c56239xzCopydefault;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 4;
                                    objCopydefault = c45545ss.AEQbTJ(dt, c58859zSCopy$default, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = interfaceC5039CjEZpvd;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c56239xzCopydefault;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 2;
                                    objCopydefault = c38471pa.AEQbTJ(dt, c58859zSCopy$default, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = interfaceC5039CjEZpvd;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c56239xzCopydefault;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 8;
                                    objCopydefault = c42737rc.AEQbTJ(dt, c58859zSCopy$default, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = interfaceC5039CjEZpvd;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c56239xzCopydefault;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 3;
                                    objCopydefault = c40442qW.AEQbTJ(dt, c58859zSCopy$default, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0 = interfaceC5039CjEZpvd;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1 = c56239xzCopydefault;
                                    getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.label = 6;
                                    objCopydefault = c42684rb.AEQbTJ(dt, c58859zSCopy$default, getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1);
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
                c58859zS = (C58859zS) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                dt = (DT) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
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
                c56239xz = (C56239xz) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 3:
                c56239xz = (C56239xz) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 4:
                c56239xz = (C56239xz) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 5:
                c56239xz = (C56239xz) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 6:
                c56239xz = (C56239xz) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 7:
                c56239xz = (C56239xz) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 8:
                c56239xz = (C56239xz) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 9:
                c56239xz = (C56239xz) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) getLendingAnalysisSummaryOperationDeserializerKt$throwGetLendingAnalysisSummaryError$1.L$0;
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

    public static final void KWHzl(C36390oa.StateListAnimator stateListAnimator, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AnalyzeLendingModelVersion"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("DocumentMetadata"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("JobStatus"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("StatusMessage"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("Summary"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Warnings"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.OLrzqt(C40656qc.AEQbTJ(el));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.EZpvd(AbstractC36549od.copydefault.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            stateListAnimator.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                stateListAnimator.copydefault(C43426rp.AEQbTJ(el));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et6);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    while (actionBarKWHzl.EZpvd()) {
                                        if (!actionBarKWHzl.copydefault()) {
                                            actionBarKWHzl.gEmmrt();
                                        } else {
                                            arrayList.add(C44200sH.AEQbTJ(el));
                                        }
                                    }
                                    stateListAnimator.AEQbTJ(arrayList);
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
}
