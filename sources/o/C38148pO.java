package o;

import aws.sdk.kotlin.services.textract.model.TextractException;
import aws.sdk.kotlin.services.textract.serde.DeleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: o.pO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38148pO {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        DeleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1 deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TextractException textractException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof DeleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1) {
            deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1 = (DeleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1) continuation;
            int i = deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1 = new DeleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = dt;
                deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c58859zS;
                deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 9;
                                    objCopydefault = c42631ra.AEQbTJ(dt, c58859zSCopy$default, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 7;
                                    objCopydefault = c42064rF.AEQbTJ(dt, c58859zSCopy$default, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 6;
                                    objCopydefault = c45545ss.AEQbTJ(dt, c58859zSCopy$default, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 2;
                                    objCopydefault = c38471pa.AEQbTJ(dt, c58859zSCopy$default, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 3;
                                    objCopydefault = c44118sE.AEQbTJ(dt, c58859zSCopy$default, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 4;
                                    objCopydefault = c39794pz.AEQbTJ(dt, c58859zSCopy$default, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 8;
                                    objCopydefault = c42737rc.AEQbTJ(dt, c58859zSCopy$default, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0 = interfaceC5039CjEZpvd;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1 = c56239xzCopydefault;
                                    deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.label = 5;
                                    objCopydefault = c42442rT.AEQbTJ(dt, c58859zSCopy$default, deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1);
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
                c58859zS = (C58859zS) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                dt = (DT) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
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
                c56239xz = (C56239xz) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 3:
                c56239xz = (C56239xz) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 4:
                c56239xz = (C56239xz) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 5:
                c56239xz = (C56239xz) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 6:
                c56239xz = (C56239xz) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 7:
                c56239xz = (C56239xz) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 8:
                c56239xz = (C56239xz) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 9:
                c56239xz = (C56239xz) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) deleteAdapterVersionOperationDeserializerKt$throwDeleteAdapterVersionError$1.L$0;
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
}
