package o;

import aws.sdk.kotlin.services.translate.model.TranslateException;
import aws.sdk.kotlin.services.translate.serde.ListTerminologiesOperationDeserializerKt$throwListTerminologiesError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C45888tA;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C52076vz {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ListTerminologiesOperationDeserializerKt$throwListTerminologiesError$1 listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        TranslateException translateException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ListTerminologiesOperationDeserializerKt$throwListTerminologiesError$1) {
            listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1 = (ListTerminologiesOperationDeserializerKt$throwListTerminologiesError$1) continuation;
            int i = listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.label = i - Integer.MIN_VALUE;
            } else {
                listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1 = new ListTerminologiesOperationDeserializerKt$throwListTerminologiesError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$0 = dt;
                listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$1 = c58859zS;
                listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        translateException = (TranslateException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw translateException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        translateException = (TranslateException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw translateException;
                    }
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    translateException = (TranslateException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw translateException;
                }
                c58859zS = (C58859zS) listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$1;
                dt = (DT) listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                int iHashCode = strOLrzqt.hashCode();
                if (iHashCode != 218496528) {
                    if (iHashCode != 734598063) {
                        if (iHashCode == 1384808312 && strOLrzqt.equals("TooManyRequestsException")) {
                            C53150wg c53150wg = new C53150wg();
                            listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$0 = interfaceC5039CjEZpvd;
                            listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$1 = c56239xzCopydefault;
                            listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.label = 3;
                            objCopydefault = c53150wg.AEQbTJ(dt, c58859zSCopy$default, listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            c56239xz = c56239xzCopydefault;
                            interfaceC5039Cj = interfaceC5039CjEZpvd;
                            translateException = (TranslateException) objCopydefault;
                            interfaceC5039CjEZpvd = interfaceC5039Cj;
                            c56239xzCopydefault = c56239xz;
                            C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                            throw translateException;
                        }
                    } else if (strOLrzqt.equals("InternalServerException")) {
                        C48616uY c48616uY = new C48616uY();
                        listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$0 = interfaceC5039CjEZpvd;
                        listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$1 = c56239xzCopydefault;
                        listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.label = 2;
                        objCopydefault = c48616uY.AEQbTJ(dt, c58859zSCopy$default, listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        c56239xz = c56239xzCopydefault;
                        interfaceC5039Cj = interfaceC5039CjEZpvd;
                        translateException = (TranslateException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw translateException;
                    }
                } else if (strOLrzqt.equals("InvalidParameterValueException")) {
                    C50751va c50751va = new C50751va();
                    listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$0 = interfaceC5039CjEZpvd;
                    listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.L$1 = c56239xzCopydefault;
                    listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1.label = 4;
                    objCopydefault = c50751va.AEQbTJ(dt, c58859zSCopy$default, listTerminologiesOperationDeserializerKt$throwListTerminologiesError$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    c56239xz = c56239xzCopydefault;
                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                    translateException = (TranslateException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw translateException;
                }
            }
            translateException = new TranslateException(c56239xzCopydefault.copydefault());
            C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
            throw translateException;
        } catch (java.lang.Exception e) {
            TranslateException translateException2 = new TranslateException("Failed to parse response as 'awsJson1_1' error", e);
            C54211xA.EZpvd(translateException2, c58859zSCopy$default.AEQbTJ(), null);
            throw translateException2;
        }
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }

    public static final void AEQbTJ(C45888tA.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("TerminologyPropertiesList"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (actionBarKWHzl.EZpvd()) {
                        if (!actionBarKWHzl.copydefault()) {
                            actionBarKWHzl.gEmmrt();
                        } else {
                            arrayList.add(C53097wf.EZpvd(el));
                        }
                    }
                    actionBar.copydefault(arrayList);
                } else if (numOLrzqt == null) {
                    return;
                } else {
                    stateListAnimatorEZpvd.copydefault();
                }
            }
        }
    }
}
