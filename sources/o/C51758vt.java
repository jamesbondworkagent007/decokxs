package o;

import aws.sdk.kotlin.services.translate.model.TranslateException;
import aws.sdk.kotlin.services.translate.serde.ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C47912tz;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C51758vt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1 listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        TranslateException translateException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1) {
            listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1 = (ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1) continuation;
            int i = listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = i - Integer.MIN_VALUE;
            } else {
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1 = new ListTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = dt;
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c58859zS;
                listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        translateException = (TranslateException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw translateException;
                    }
                    if (i2 == 3) {
                        c56239xz = (C56239xz) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
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
                    c56239xz = (C56239xz) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    translateException = (TranslateException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(translateException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw translateException;
                }
                c58859zS = (C58859zS) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1;
                dt = (DT) listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (strOLrzqt != null) {
                int iHashCode = strOLrzqt.hashCode();
                if (iHashCode != 218496528) {
                    if (iHashCode != 734598063) {
                        if (iHashCode == 1821306386 && strOLrzqt.equals("ResourceNotFoundException")) {
                            C50265vI c50265vI = new C50265vI();
                            listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = interfaceC5039CjEZpvd;
                            listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c56239xzCopydefault;
                            listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 4;
                            objCopydefault = c50265vI.AEQbTJ(dt, c58859zSCopy$default, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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
                        listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = interfaceC5039CjEZpvd;
                        listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c56239xzCopydefault;
                        listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 2;
                        objCopydefault = c48616uY.AEQbTJ(dt, c58859zSCopy$default, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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
                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$0 = interfaceC5039CjEZpvd;
                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.L$1 = c56239xzCopydefault;
                    listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1.label = 3;
                    objCopydefault = c50751va.AEQbTJ(dt, c58859zSCopy$default, listTagsForResourceOperationDeserializerKt$throwListTagsForResourceError$1);
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

    public static final void EZpvd(C47912tz.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Tags"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (actionBarKWHzl.EZpvd()) {
                    if (!actionBarKWHzl.copydefault()) {
                        actionBarKWHzl.gEmmrt();
                    } else {
                        arrayList.add(C50724vZ.AEQbTJ(el));
                    }
                }
                activity.OLrzqt(arrayList);
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
