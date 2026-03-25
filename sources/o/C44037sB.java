package o;

import aws.sdk.kotlin.services.textract.model.TextractException;
import aws.sdk.kotlin.services.textract.serde.UpdateAdapterOperationDeserializerKt$throwUpdateAdapterError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C36282oW;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.sB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C44037sB {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [65=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        UpdateAdapterOperationDeserializerKt$throwUpdateAdapterError$1 updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        TextractException textractException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof UpdateAdapterOperationDeserializerKt$throwUpdateAdapterError$1) {
            updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1 = (UpdateAdapterOperationDeserializerKt$throwUpdateAdapterError$1) continuation;
            int i = updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = i - Integer.MIN_VALUE;
            } else {
                updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1 = new UpdateAdapterOperationDeserializerKt$throwUpdateAdapterError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = dt;
                updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c58859zS;
                updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c56239xzCopydefault;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 9;
                                    objCopydefault = c42631ra.AEQbTJ(dt, c58859zSCopy$default, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c56239xzCopydefault;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 7;
                                    objCopydefault = c42064rF.AEQbTJ(dt, c58859zSCopy$default, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c56239xzCopydefault;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 6;
                                    objCopydefault = c45545ss.AEQbTJ(dt, c58859zSCopy$default, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c56239xzCopydefault;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 2;
                                    objCopydefault = c38471pa.AEQbTJ(dt, c58859zSCopy$default, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c56239xzCopydefault;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 3;
                                    objCopydefault = c44118sE.AEQbTJ(dt, c58859zSCopy$default, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c56239xzCopydefault;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 4;
                                    objCopydefault = c39794pz.AEQbTJ(dt, c58859zSCopy$default, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c56239xzCopydefault;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 8;
                                    objCopydefault = c42737rc.AEQbTJ(dt, c58859zSCopy$default, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0 = interfaceC5039CjEZpvd;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1 = c56239xzCopydefault;
                                    updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.label = 5;
                                    objCopydefault = c42442rT.AEQbTJ(dt, c58859zSCopy$default, updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1);
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
                c58859zS = (C58859zS) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                dt = (DT) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
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
                c56239xz = (C56239xz) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 3:
                c56239xz = (C56239xz) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 4:
                c56239xz = (C56239xz) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 5:
                c56239xz = (C56239xz) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 6:
                c56239xz = (C56239xz) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 7:
                c56239xz = (C56239xz) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 8:
                c56239xz = (C56239xz) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                textractException = (TextractException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(textractException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw textractException;
            case 9:
                c56239xz = (C56239xz) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) updateAdapterOperationDeserializerKt$throwUpdateAdapterError$1.L$0;
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

    public static final void OLrzqt(C36282oW.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AdapterId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("AdapterName"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("AutoUpdate"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("CreationTime"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("Description"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("FeatureTypes"));
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
                application.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        application.AEQbTJ(AbstractC34595nf.EZpvd.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            application.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                application.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et6);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    while (actionBarKWHzl.EZpvd()) {
                                        if (!actionBarKWHzl.copydefault()) {
                                            actionBarKWHzl.gEmmrt();
                                        } else {
                                            arrayList.add(AbstractC33846nI.EZpvd.copydefault(actionBarKWHzl.fetchVPNInfo()));
                                        }
                                    }
                                    application.copydefault(arrayList);
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
