package o;

import aws.sdk.kotlin.services.rekognition.model.RekognitionException;
import aws.sdk.kotlin.services.rekognition.serde.CompareFacesOperationDeserializerKt$throwCompareFacesError$1;
import kotlin.coroutines.Continuation;
import o.AbsSeekBar;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13834da {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [66=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        CompareFacesOperationDeserializerKt$throwCompareFacesError$1 compareFacesOperationDeserializerKt$throwCompareFacesError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        RekognitionException rekognitionException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof CompareFacesOperationDeserializerKt$throwCompareFacesError$1) {
            compareFacesOperationDeserializerKt$throwCompareFacesError$1 = (CompareFacesOperationDeserializerKt$throwCompareFacesError$1) continuation;
            int i = compareFacesOperationDeserializerKt$throwCompareFacesError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = i - Integer.MIN_VALUE;
            } else {
                compareFacesOperationDeserializerKt$throwCompareFacesError$1 = new CompareFacesOperationDeserializerKt$throwCompareFacesError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = compareFacesOperationDeserializerKt$throwCompareFacesError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (compareFacesOperationDeserializerKt$throwCompareFacesError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = dt;
                compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c58859zS;
                compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = interfaceC5039CjEZpvd;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c56239xzCopydefault;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 3;
                                    objCopydefault = c21806hN.AEQbTJ(dt, c58859zSCopy$default, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = interfaceC5039CjEZpvd;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c56239xzCopydefault;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 8;
                                    objCopydefault = c21482hB.AEQbTJ(dt, c58859zSCopy$default, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = interfaceC5039CjEZpvd;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c56239xzCopydefault;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 4;
                                    objCopydefault = c27537jx.AEQbTJ(dt, c58859zSCopy$default, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = interfaceC5039CjEZpvd;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c56239xzCopydefault;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 7;
                                    objCopydefault = c23164ht.AEQbTJ(dt, c58859zSCopy$default, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = interfaceC5039CjEZpvd;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c56239xzCopydefault;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 5;
                                    objCopydefault = c32385mb.AEQbTJ(dt, c58859zSCopy$default, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = interfaceC5039CjEZpvd;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c56239xzCopydefault;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 6;
                                    objCopydefault = c11297cJ.AEQbTJ(dt, c58859zSCopy$default, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = interfaceC5039CjEZpvd;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c56239xzCopydefault;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 2;
                                    objCopydefault = c21698hJ.AEQbTJ(dt, c58859zSCopy$default, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0 = interfaceC5039CjEZpvd;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1 = c56239xzCopydefault;
                                    compareFacesOperationDeserializerKt$throwCompareFacesError$1.label = 9;
                                    objCopydefault = c21563hE.AEQbTJ(dt, c58859zSCopy$default, compareFacesOperationDeserializerKt$throwCompareFacesError$1);
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
                c58859zS = (C58859zS) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                dt = (DT) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
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
                c56239xz = (C56239xz) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 3:
                c56239xz = (C56239xz) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 4:
                c56239xz = (C56239xz) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 5:
                c56239xz = (C56239xz) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 6:
                c56239xz = (C56239xz) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 7:
                c56239xz = (C56239xz) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 8:
                c56239xz = (C56239xz) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                rekognitionException = (RekognitionException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(rekognitionException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw rekognitionException;
            case 9:
                c56239xz = (C56239xz) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) compareFacesOperationDeserializerKt$throwCompareFacesError$1.L$0;
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

    public static final void copydefault(AbsSeekBar.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("FaceMatches"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("SourceImageFace"));
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et3 = new C5101Et(stateListAnimator, new EX("SourceImageOrientationCorrection"));
        C5101Et c5101Et4 = new C5101Et(stateListAnimator, new EX("TargetImageOrientationCorrection"));
        C5101Et c5101Et5 = new C5101Et(fragment, new EX("UnmatchedFaces"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
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
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.copydefault(C14099df.KWHzl(el));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        application.OLrzqt(AbstractC7503al.AEQbTJ.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            application.AEQbTJ(AbstractC7503al.AEQbTJ.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et5);
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                while (actionBarKWHzl.EZpvd()) {
                                    if (!actionBarKWHzl.copydefault()) {
                                        actionBarKWHzl.gEmmrt();
                                    } else {
                                        arrayList.add(C14046de.AEQbTJ(el));
                                    }
                                }
                                application.KWHzl(arrayList);
                            } else if (numOLrzqt == null) {
                                return;
                            } else {
                                stateListAnimatorEZpvd.copydefault();
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
                        arrayList2.add(C13887db.copydefault(el));
                    }
                }
                application.EZpvd(arrayList2);
            }
        }
    }
}
