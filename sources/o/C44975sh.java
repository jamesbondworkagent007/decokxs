package o;

import aws.sdk.kotlin.services.textract.model.TextractException;
import aws.sdk.kotlin.services.textract.serde.StartExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C35985oL;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44975sh {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [61=12] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        StartExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1 startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TextractException textractException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof StartExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1) {
            startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1 = (StartExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1) continuation;
            int i = startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = i - Integer.MIN_VALUE;
            } else {
                startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1 = new StartExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = dt;
                startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c58859zS;
                startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 7;
                                    objCopydefault = c42843re.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 9;
                                    objCopydefault = c42631ra.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                            case -1818544159:
                                if (strOLrzqt.equals("LimitExceededException")) {
                                    C43267rm c43267rm = new C43267rm();
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 10;
                                    objCopydefault = c43267rm.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                            case -1514639393:
                                if (strOLrzqt.equals("UnsupportedDocumentException")) {
                                    C45781sx c45781sx = new C45781sx();
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 13;
                                    objCopydefault = c45781sx.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                            case -1240985585:
                                if (strOLrzqt.equals("BadDocumentException")) {
                                    C39741py c39741py = new C39741py();
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 4;
                                    objCopydefault = c39741py.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 11;
                                    objCopydefault = c42064rF.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                            case -292546099:
                                if (strOLrzqt.equals("DocumentTooLargeException")) {
                                    C38417pY c38417pY = new C38417pY();
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 12;
                                    objCopydefault = c38417pY.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 5;
                                    objCopydefault = c45545ss.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 2;
                                    objCopydefault = c38471pa.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 8;
                                    objCopydefault = c42737rc.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                            case 1762275249:
                                if (strOLrzqt.equals("IdempotentParameterMismatchException")) {
                                    C40361qT c40361qT = new C40361qT();
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 3;
                                    objCopydefault = c40361qT.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0 = interfaceC5039CjEZpvd;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1 = c56239xzCopydefault;
                                    startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.label = 6;
                                    objCopydefault = c42684rb.AEQbTJ(dt, c58859zSCopy$default, startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1);
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
                c58859zS = (C58859zS) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                dt = (DT) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
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
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 3:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 4:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 5:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 6:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 7:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 8:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 9:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 10:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 11:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 12:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 13:
                c56239xz = (C56239xz) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startExpenseAnalysisOperationDeserializerKt$throwStartExpenseAnalysisError$1.L$0;
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

    public static final void OLrzqt(C35985oL.TaskDescription taskDescription, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("JobId"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
