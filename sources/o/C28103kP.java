package o;

import aws.sdk.kotlin.services.rekognition.model.RekognitionException;
import aws.sdk.kotlin.services.rekognition.serde.StartMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C10470bp;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.kP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28103kP {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [61=11] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        StartMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1 startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        RekognitionException rekognitionException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof StartMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1) {
            startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1 = (StartMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1) continuation;
            int i = startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = i - Integer.MIN_VALUE;
            } else {
                startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1 = new StartMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = dt;
                startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c58859zS;
                startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
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
                                    C21806hN c21806hN = new C21806hN();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 3;
                                    objCopydefault = c21806hN.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case -1943616152:
                                if (strOLrzqt.equals("InternalServerError")) {
                                    C21482hB c21482hB = new C21482hB();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 12;
                                    objCopydefault = c21482hB.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case -1818544159:
                                if (strOLrzqt.equals("LimitExceededException")) {
                                    C24344ic c24344ic = new C24344ic();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 8;
                                    objCopydefault = c24344ic.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case -768866871:
                                if (strOLrzqt.equals("InvalidManifestException")) {
                                    C21617hG c21617hG = new C21617hG();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 6;
                                    objCopydefault = c21617hG.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case -727499650:
                                if (strOLrzqt.equals("ProvisionedThroughputExceededException")) {
                                    C27537jx c27537jx = new C27537jx();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 4;
                                    objCopydefault = c27537jx.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case -72198520:
                                if (strOLrzqt.equals("ThrottlingException")) {
                                    C32385mb c32385mb = new C32385mb();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 9;
                                    objCopydefault = c32385mb.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case 122859728:
                                if (strOLrzqt.equals("AccessDeniedException")) {
                                    C11297cJ c11297cJ = new C11297cJ();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 10;
                                    objCopydefault = c11297cJ.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case 1359773969:
                                if (strOLrzqt.equals("ResourceNotReadyException")) {
                                    C26048jQ c26048jQ = new C26048jQ();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 5;
                                    objCopydefault = c26048jQ.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case 1674340573:
                                if (strOLrzqt.equals("InvalidParameterException")) {
                                    C21698hJ c21698hJ = new C21698hJ();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 2;
                                    objCopydefault = c21698hJ.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case 1762275249:
                                if (strOLrzqt.equals("IdempotentParameterMismatchException")) {
                                    C23058hr c23058hr = new C23058hr();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 11;
                                    objCopydefault = c23058hr.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                            case 1821306386:
                                if (strOLrzqt.equals("ResourceNotFoundException")) {
                                    C26021jP c26021jP = new C26021jP();
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0 = interfaceC5039CjEZpvd;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1 = c56239xzCopydefault;
                                    startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.label = 7;
                                    objCopydefault = c26021jP.AEQbTJ(dt, c58859zSCopy$default, startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    rekognitionException = (RekognitionException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw rekognitionException;
                                }
                                break;
                        }
                    }
                    rekognitionException = new RekognitionException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw rekognitionException;
                } catch (java.lang.Exception e) {
                    RekognitionException rekognitionException2 = new RekognitionException("Failed to parse response as 'awsJson1_1' error", e);
                    C54211xA.EZpvd(rekognitionException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw rekognitionException2;
                }
            case 1:
                c58859zS = (C58859zS) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                dt = (DT) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                rekognitionException = new RekognitionException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 2:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 3:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 4:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 5:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 6:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 7:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 8:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 9:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 10:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 11:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 12:
                c56239xz = (C56239xz) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) startMediaAnalysisJobOperationDeserializerKt$throwStartMediaAnalysisJobError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void AEQbTJ(C10470bp.TaskDescription taskDescription, byte[] bArr) {
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
                taskDescription.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
