package o;

import aws.sdk.kotlin.services.rekognition.model.RekognitionException;
import aws.sdk.kotlin.services.rekognition.serde.SearchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C6845aX;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C28877kj {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [65=9] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        SearchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1 searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        RekognitionException rekognitionException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof SearchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1) {
            searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1 = (SearchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1) continuation;
            int i = searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = i - Integer.MIN_VALUE;
            } else {
                searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1 = new SearchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = dt;
                searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c58859zS;
                searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 3;
                                    objCopydefault = c21806hN.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 9;
                                    objCopydefault = c21482hB.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 4;
                                    objCopydefault = c27537jx.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                            case -98036275:
                                if (strOLrzqt.equals("ImageTooLargeException")) {
                                    C23164ht c23164ht = new C23164ht();
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 8;
                                    objCopydefault = c23164ht.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 6;
                                    objCopydefault = c32385mb.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 7;
                                    objCopydefault = c11297cJ.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 2;
                                    objCopydefault = c21698hJ.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                            case 1788098484:
                                if (strOLrzqt.equals("InvalidImageFormatException")) {
                                    C21563hE c21563hE = new C21563hE();
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 10;
                                    objCopydefault = c21563hE.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0 = interfaceC5039CjEZpvd;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1 = c56239xzCopydefault;
                                    searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.label = 5;
                                    objCopydefault = c26021jP.AEQbTJ(dt, c58859zSCopy$default, searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1);
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
                c58859zS = (C58859zS) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                dt = (DT) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
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
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 3:
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 4:
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 5:
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 6:
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 7:
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 8:
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 9:
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 10:
                c56239xz = (C56239xz) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) searchUsersByImageOperationDeserializerKt$throwSearchUsersByImageError$1.L$0;
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

    public static final void EZpvd(C6845aX.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("FaceModelVersion"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("SearchedFace"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("UnsearchedFaces"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("UserMatches"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.EZpvd(C29036km.EZpvd(el));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            while (actionBarKWHzl.EZpvd()) {
                                if (!actionBarKWHzl.copydefault()) {
                                    actionBarKWHzl.gEmmrt();
                                } else {
                                    arrayList.add(C33523my.OLrzqt(el));
                                }
                            }
                            actionBar.EZpvd(arrayList);
                        } else if (numOLrzqt == null) {
                            return;
                        } else {
                            stateListAnimatorEZpvd.copydefault();
                        }
                    } else {
                        InterfaceC5095En.ActionBar actionBarKWHzl2 = el.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        while (actionBarKWHzl2.EZpvd()) {
                            if (!actionBarKWHzl2.copydefault()) {
                                actionBarKWHzl2.gEmmrt();
                            } else {
                                arrayList2.add(C32622mh.AEQbTJ(el));
                            }
                        }
                        actionBar.KWHzl(arrayList2);
                    }
                }
            }
        }
    }
}
