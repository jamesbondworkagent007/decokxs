package o;

import aws.sdk.kotlin.services.polly.model.PollyException;
import aws.sdk.kotlin.services.polly.serde.ListLexiconsOperationDeserializerKt$throwListLexiconsError$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.AnticipateInterpolator;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes21.dex */
public final class SuggestionsInfo {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(DT dt, C58859zS c58859zS, Continuation<?> continuation) throws java.lang.Throwable {
        ListLexiconsOperationDeserializerKt$throwListLexiconsError$1 listLexiconsOperationDeserializerKt$throwListLexiconsError$1;
        byte[] bArr;
        InterfaceC5039Cj interfaceC5039CjEZpvd;
        C58859zS c58859zSCopy$default;
        C56239xz c56239xzCopydefault;
        PollyException pollyException;
        C56239xz c56239xz;
        InterfaceC5039Cj interfaceC5039Cj;
        if (continuation instanceof ListLexiconsOperationDeserializerKt$throwListLexiconsError$1) {
            listLexiconsOperationDeserializerKt$throwListLexiconsError$1 = (ListLexiconsOperationDeserializerKt$throwListLexiconsError$1) continuation;
            int i = listLexiconsOperationDeserializerKt$throwListLexiconsError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                listLexiconsOperationDeserializerKt$throwListLexiconsError$1.label = i - Integer.MIN_VALUE;
            } else {
                listLexiconsOperationDeserializerKt$throwListLexiconsError$1 = new ListLexiconsOperationDeserializerKt$throwListLexiconsError$1(continuation);
            }
        }
        java.lang.Object objCopydefault = listLexiconsOperationDeserializerKt$throwListLexiconsError$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = listLexiconsOperationDeserializerKt$throwListLexiconsError$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                zP zPVarEZpvd = c58859zS.AEQbTJ().EZpvd();
                listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$0 = dt;
                listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$1 = c58859zS;
                listLexiconsOperationDeserializerKt$throwListLexiconsError$1.label = 1;
                objCopydefault = C58752zO.copydefault(zPVarEZpvd, listLexiconsOperationDeserializerKt$throwListLexiconsError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c56239xz = (C56239xz) listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$1;
                        interfaceC5039Cj = (InterfaceC5039Cj) listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$0;
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
                    c56239xz = (C56239xz) listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$1;
                    interfaceC5039Cj = (InterfaceC5039Cj) listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    pollyException = (PollyException) objCopydefault;
                    interfaceC5039CjEZpvd = interfaceC5039Cj;
                    c56239xzCopydefault = c56239xz;
                    C54211xA.EZpvd(pollyException, interfaceC5039CjEZpvd, c56239xzCopydefault);
                    throw pollyException;
                }
                c58859zS = (C58859zS) listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$1;
                dt = (DT) listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            c56239xzCopydefault = C54319xE.AEQbTJ.copydefault(c58859zS.AEQbTJ().AEQbTJ(), bArr);
            java.lang.String strOLrzqt = c56239xzCopydefault.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "ServiceFailureException")) {
                MimeTypeMap mimeTypeMap = new MimeTypeMap();
                listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$0 = interfaceC5039CjEZpvd;
                listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$1 = c56239xzCopydefault;
                listLexiconsOperationDeserializerKt$throwListLexiconsError$1.label = 2;
                objCopydefault = mimeTypeMap.AEQbTJ(dt, c58859zSCopy$default, listLexiconsOperationDeserializerKt$throwListLexiconsError$1);
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
            listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$0 = interfaceC5039CjEZpvd;
            listLexiconsOperationDeserializerKt$throwListLexiconsError$1.L$1 = c56239xzCopydefault;
            listLexiconsOperationDeserializerKt$throwListLexiconsError$1.label = 3;
            objCopydefault = generateLinksLogger.AEQbTJ(dt, c58859zSCopy$default, listLexiconsOperationDeserializerKt$throwListLexiconsError$1);
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

    public static final void EZpvd(AnticipateInterpolator.Application application, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Lexicons"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("NextToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
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
                        arrayList.add(TextLinksParams.copydefault(el));
                    }
                }
                application.AEQbTJ(arrayList);
            }
        }
    }
}
