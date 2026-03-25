package o;

import aws.sdk.kotlin.services.textract.model.TextractException;
import aws.sdk.kotlin.services.textract.serde.CreateAdapterOperationDeserializerKt$throwCreateAdapterError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C34894nl;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.pC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C37823pC {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [61=10] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        CreateAdapterOperationDeserializerKt$throwCreateAdapterError$1 createAdapterOperationDeserializerKt$throwCreateAdapterError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TextractException textractException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof CreateAdapterOperationDeserializerKt$throwCreateAdapterError$1) {
            createAdapterOperationDeserializerKt$throwCreateAdapterError$1 = (CreateAdapterOperationDeserializerKt$throwCreateAdapterError$1) continuation;
            int i = createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = i - Integer.MIN_VALUE;
            } else {
                createAdapterOperationDeserializerKt$throwCreateAdapterError$1 = new CreateAdapterOperationDeserializerKt$throwCreateAdapterError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = createAdapterOperationDeserializerKt$throwCreateAdapterError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = dt;
                createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c58859zS;
                createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 11;
                                    objCopydefault = c42631ra.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 6;
                                    objCopydefault = c43267rm.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                            case -1815771239:
                                if (strOLrzqt.equals("ServiceQuotaExceededException")) {
                                    C42334rP c42334rP = new C42334rP();
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 9;
                                    objCopydefault = c42334rP.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 8;
                                    objCopydefault = c42064rF.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 7;
                                    objCopydefault = c45545ss.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 2;
                                    objCopydefault = c38471pa.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 4;
                                    objCopydefault = c44118sE.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                            case 1643655293:
                                if (strOLrzqt.equals("ConflictException")) {
                                    C39794pz c39794pz = new C39794pz();
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 5;
                                    objCopydefault = c39794pz.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 10;
                                    objCopydefault = c42737rc.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1 = c56239xzCopydefault;
                                    createAdapterOperationDeserializerKt$throwCreateAdapterError$1.label = 3;
                                    objCopydefault = c40361qT.AEQbTJ(dt, c58859zSCopy$default, createAdapterOperationDeserializerKt$throwCreateAdapterError$1);
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
                c58859zS = (C58859zS) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                dt = (DT) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
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
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 3:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 4:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 5:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 6:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 7:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 8:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 9:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 10:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 11:
                c56239xz = (C56239xz) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) createAdapterOperationDeserializerKt$throwCreateAdapterError$1.L$0;
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

    public static final void OLrzqt(C34894nl.StateListAnimator stateListAnimator, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("AdapterId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
