package o;

import aws.sdk.kotlin.services.polly.model.PollyException;
import aws.sdk.kotlin.services.polly.serde.ListSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.AnticipateOvershootInterpolator;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class TextServicesManager {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ListSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1 listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        PollyException pollyException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ListSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1) {
            listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1 = (ListSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1) continuation;
            int i = listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.label = i - Integer.MIN_VALUE;
            } else {
                listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1 = new ListSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$0 = dt;
                listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$1 = c58859zS;
                listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        pollyException = (PollyException) objCopydefault;
                        interfaceC5039CjEZpvd = interfaceC5039Cj;
                        c56239xzCopydefault = c56239xz;
                        C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                        throw pollyException;
                    }
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c56239xz = (C56239xz) listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    pollyException = (PollyException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw pollyException;
                }
                c58859zS = (C58859zS) listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$1;
                dt = (DT) listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "ServiceFailureException")) {
                MimeTypeMap mimeTypeMap = new MimeTypeMap();
                listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$0 = interfaceC5039CjEZpvd;
                listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$1 = c56239xzCopydefault;
                listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.label = 2;
                objCopydefault = mimeTypeMap.AEQbTJ(dt, c58859zSCopy$default, listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c56239xz = c56239xzCopydefault;
                interfaceC5039Cj = interfaceC5039CjEZpvd;
                pollyException = (PollyException) objCopydefault;
                interfaceC5039CjEZpvd = interfaceC5039Cj;
                c56239xzCopydefault = c56239xz;
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "InvalidNextTokenException")) {
                pollyException = new PollyException(c56239xzCopydefault.copydefault());
                C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                throw pollyException;
            }
            GenerateLinksLogger generateLinksLogger = new GenerateLinksLogger();
            listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$0 = interfaceC5039CjEZpvd;
            listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.L$1 = c56239xzCopydefault;
            listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1.label = 3;
            objCopydefault = generateLinksLogger.AEQbTJ(dt, c58859zSCopy$default, listSpeechSynthesisTasksOperationDeserializerKt$throwListSpeechSynthesisTasksError$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c56239xz = c56239xzCopydefault;
            interfaceC5039Cj = interfaceC5039CjEZpvd;
            pollyException = (PollyException) objCopydefault;
            interfaceC5039CjEZpvd = interfaceC5039Cj;
            c56239xzCopydefault = c56239xz;
            C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
            throw pollyException;
        } catch (java.lang.Exception e) {
            PollyException pollyException2 = new PollyException("Failed to parse response as 'restJson1' error", e);
            C54211xA.EZpvd(pollyException2, c58859zSCopy$default.AEQbTJ(), null);
            throw pollyException2;
        }
        bArr = (byte[]) objCopydefault;
        interfaceC5039CjEZpvd = C54346xF.EZpvd(c58859zS.AEQbTJ(), bArr);
        c58859zSCopy$default = C58859zS.copy$default(c58859zS, null, interfaceC5039CjEZpvd, 1, null);
    }

    public static final void EZpvd(AnticipateOvershootInterpolator.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("SynthesisTasks"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                application.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    InterfaceC5095En.ActionBar actionBarKWHzl = el.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (actionBarKWHzl.EZpvd()) {
                        if (!actionBarKWHzl.copydefault()) {
                            actionBarKWHzl.gEmmrt();
                        } else {
                            arrayList.add(PermissionRequest.EZpvd(el));
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
