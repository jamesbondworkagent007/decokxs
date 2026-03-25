package o;

import aws.sdk.kotlin.services.comprehend.model.ComprehendException;
import aws.sdk.kotlin.services.comprehend.serde.ListDatasetsOperationDeserializerKt$throwListDatasetsError$1;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.SystemProperties;

/* JADX INFO: loaded from: classes21.dex */
public final class StyleSpan {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ListDatasetsOperationDeserializerKt$throwListDatasetsError$1 listDatasetsOperationDeserializerKt$throwListDatasetsError$1;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C56239xz c56239xzCopydefault;
        java.lang.String strOLrzqt;
        ComprehendException comprehendException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ListDatasetsOperationDeserializerKt$throwListDatasetsError$1) {
            listDatasetsOperationDeserializerKt$throwListDatasetsError$1 = (ListDatasetsOperationDeserializerKt$throwListDatasetsError$1) continuation;
            int i = listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label = i - Integer.MIN_VALUE;
            } else {
                listDatasetsOperationDeserializerKt$throwListDatasetsError$1 = new ListDatasetsOperationDeserializerKt$throwListDatasetsError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = listDatasetsOperationDeserializerKt$throwListDatasetsError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        switch (listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0 = dt;
                listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1 = c58859zS;
                listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, listDatasetsOperationDeserializerKt$throwListDatasetsError$1);
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
                            case 734598063:
                                if (strOLrzqt.equals("InternalServerException")) {
                                    LineBackgroundSpan lineBackgroundSpan = new LineBackgroundSpan();
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0 = interfaceC5039CjEZpvd;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1 = c56239xzCopydefault;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label = 3;
                                    objCopydefault = lineBackgroundSpan.AEQbTJ(dt, c58859zSCopy$default, listDatasetsOperationDeserializerKt$throwListDatasetsError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 1084420320:
                                if (strOLrzqt.equals("InvalidFilterException")) {
                                    ImageSpan imageSpan = new ImageSpan();
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0 = interfaceC5039CjEZpvd;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1 = c56239xzCopydefault;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label = 2;
                                    objCopydefault = imageSpan.AEQbTJ(dt, c58859zSCopy$default, listDatasetsOperationDeserializerKt$throwListDatasetsError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 1148038775:
                                if (strOLrzqt.equals("InvalidRequestException")) {
                                    RasterizerSpan rasterizerSpan = new RasterizerSpan();
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0 = interfaceC5039CjEZpvd;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1 = c56239xzCopydefault;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label = 5;
                                    objCopydefault = rasterizerSpan.AEQbTJ(dt, c58859zSCopy$default, listDatasetsOperationDeserializerKt$throwListDatasetsError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 1384808312:
                                if (strOLrzqt.equals("TooManyRequestsException")) {
                                    MagnificationSpec magnificationSpec = new MagnificationSpec();
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0 = interfaceC5039CjEZpvd;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1 = c56239xzCopydefault;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label = 4;
                                    objCopydefault = magnificationSpec.AEQbTJ(dt, c58859zSCopy$default, listDatasetsOperationDeserializerKt$throwListDatasetsError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                            case 1821306386:
                                if (strOLrzqt.equals("ResourceNotFoundException")) {
                                    MergedConfiguration mergedConfiguration = new MergedConfiguration();
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0 = interfaceC5039CjEZpvd;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1 = c56239xzCopydefault;
                                    listDatasetsOperationDeserializerKt$throwListDatasetsError$1.label = 6;
                                    objCopydefault = mergedConfiguration.AEQbTJ(dt, c58859zSCopy$default, listDatasetsOperationDeserializerKt$throwListDatasetsError$1);
                                    if (objCopydefault == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    c56239xz = c56239xzCopydefault;
                                    interfaceC5039Cj = interfaceC5039CjEZpvd;
                                    comprehendException = (ComprehendException) objCopydefault;
                                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                                    c56239xzCopydefault = c56239xz;
                                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                                    throw comprehendException;
                                }
                                break;
                        }
                    }
                    comprehendException = new ComprehendException(c56239xzCopydefault.copydefault());
                    C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw comprehendException;
                } catch (java.lang.Exception e) {
                    ComprehendException comprehendException2 = new ComprehendException("Failed to parse response as 'awsJson1_1' error", e);
                    C54211xA.EZpvd(comprehendException2, c58859zSCopy$default.AEQbTJ(), null);
                    throw comprehendException2;
                }
            case 1:
                c58859zS = (C58859zS) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1;
                dt = (DT) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                byte[] bArr2 = (byte[]) objCopydefault;
                interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr2);
                C58859zS c58859zSCopy$default2 = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
                c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr2);
                strOLrzqt = c56239xzCopydefault.OLrzqt();
                if (strOLrzqt != null) {
                }
                comprehendException = new ComprehendException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 2:
                c56239xz = (C56239xz) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 3:
                c56239xz = (C56239xz) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 4:
                c56239xz = (C56239xz) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 5:
                c56239xz = (C56239xz) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            case 6:
                c56239xz = (C56239xz) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$1;
                interfaceC5039Cj = (InterfaceC5039Cj) listDatasetsOperationDeserializerKt$throwListDatasetsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                comprehendException = (ComprehendException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(comprehendException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw comprehendException;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void KWHzl(SystemProperties.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("DatasetPropertiesList"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                } else if (numOLrzqt == null) {
                    return;
                } else {
                    stateListAnimatorEZpvd.copydefault();
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (actionBarKWHzl.EZpvd()) {
                    if (!actionBarKWHzl.copydefault()) {
                        actionBarKWHzl.gEmmrt();
                    } else {
                        arrayList.add(RootTrustManager.OLrzqt(el));
                    }
                }
                activity.EZpvd(arrayList);
            }
        }
    }
}
