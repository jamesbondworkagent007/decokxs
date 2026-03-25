package o;

import com.okinc.im.usecase.messagelistmodel.LoadMessageListModelWithNavigationScenarioUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.oGG;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public final class oEY {
    public final oCC AEQbTJ;
    public final oGG EZpvd;
    public final oEH KWHzl;
    public final oGD OLrzqt;
    public final oGE copydefault;
    public final C35806oEj valueOf;

    @yCM
    public oEY(@NotNull C35806oEj c35806oEj, @NotNull oGD ogd, @NotNull oGE oge, @NotNull oCC occ, @NotNull oEH oeh, @NotNull oGG ogg) {
        Intrinsics.checkNotNullParameter(c35806oEj, "");
        Intrinsics.checkNotNullParameter(ogd, "");
        Intrinsics.checkNotNullParameter(oge, "");
        Intrinsics.checkNotNullParameter(occ, "");
        Intrinsics.checkNotNullParameter(oeh, "");
        Intrinsics.checkNotNullParameter(ogg, "");
        this.valueOf = c35806oEj;
        this.OLrzqt = ogd;
        this.copydefault = oge;
        this.AEQbTJ = occ;
        this.KWHzl = oeh;
        this.EZpvd = ogg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [23=5] */
    /* JADX WARN: Path cross not found for [B:10:0x002e, B:26:0x0112], limit reached: 102 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0351  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0232 -> B:76:0x0238). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x033b -> B:93:0x0344). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, long j, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        LoadMessageListModelWithNavigationScenarioUseCase$execute$1 loadMessageListModelWithNavigationScenarioUseCase$execute$1;
        java.util.List<C35254nrp> listAEQbTJ;
        java.lang.Long lDjBIcL;
        OKConversation oKConversationOLrzqt;
        java.lang.String targetId;
        C35254nrp c35254nrpEZpvd;
        int i;
        C36558odI c36558odI2;
        oEY oey;
        C35806oEj c35806oEj;
        OKMessage oKMessageOLrzqt;
        java.lang.Object objM7377constructorimpl;
        OKMessage oKMessage;
        java.lang.Long lKWHzl;
        int i2;
        java.lang.Object objEZpvd;
        java.lang.Long l;
        OKConversation oKConversation;
        java.lang.Long l2;
        oEY oey2;
        OKMessage oKMessage2;
        java.util.Iterator it;
        java.util.List list;
        java.util.Collection collection;
        C36558odI c36558odI3;
        boolean z;
        int i3;
        java.lang.Long l3;
        java.lang.Object objAEQbTJ;
        oEY oey3;
        OKMessage oKMessage3;
        java.util.Collection arrayList;
        java.util.Iterator it2;
        oEY oey4;
        C36558odI c36558odI4;
        java.util.List list2;
        java.lang.Long l4;
        long j2 = j;
        if (continuation instanceof LoadMessageListModelWithNavigationScenarioUseCase$execute$1) {
            loadMessageListModelWithNavigationScenarioUseCase$execute$1 = (LoadMessageListModelWithNavigationScenarioUseCase$execute$1) continuation;
            int i4 = loadMessageListModelWithNavigationScenarioUseCase$execute$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = i4 - Integer.MIN_VALUE;
            } else {
                loadMessageListModelWithNavigationScenarioUseCase$execute$1 = new LoadMessageListModelWithNavigationScenarioUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = loadMessageListModelWithNavigationScenarioUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = loadMessageListModelWithNavigationScenarioUseCase$execute$1.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            listAEQbTJ = c36558odI.AEQbTJ();
            lDjBIcL = c36558odI.djBIcL();
            oKConversationOLrzqt = c36558odI.OLrzqt();
            targetId = oKConversationOLrzqt.getTargetId();
            c35254nrpEZpvd = this.OLrzqt.EZpvd(listAEQbTJ, j2, null);
            int iAEQbTJ = this.copydefault.AEQbTJ(listAEQbTJ, j2, null);
            C35254nrp c35254nrp = (C35254nrp) CollectionsKt___CollectionsKt.firstOrNull(listAEQbTJ);
            boolean zEZpvd = Intrinsics.EZpvd((c35254nrp == null || (oKMessageOLrzqt = c35254nrp.OLrzqt()) == null) ? null : C56443yFo.KWHzl(oKMessageOLrzqt.getSeq()), lDjBIcL);
            if (iAEQbTJ - 20 >= 0) {
                zEZpvd = true;
            }
            i = (iAEQbTJ == -1 || !zEZpvd) ? 0 : 1;
            try {
                Result.Application application = Result.Companion;
                c35806oEj = this.valueOf;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = this;
                c36558odI2 = c36558odI;
            } catch (java.lang.Throwable th) {
                th = th;
                c36558odI2 = c36558odI;
            }
            try {
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = listAEQbTJ;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = lDjBIcL;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = oKConversationOLrzqt;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = targetId;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6 = c35254nrpEZpvd;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0 = j2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.I$0 = i;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 1;
                objOLrzqt = c35806oEj.OLrzqt(targetId, j2, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
            } catch (java.lang.Throwable th2) {
                th = th2;
                oey = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                oKMessage = (OKMessage) objM7377constructorimpl;
                if (oKMessage != null) {
                }
                if (c35254nrpEZpvd != null) {
                }
                i2 = 10;
                oCC occ = oey.AEQbTJ;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = oey;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = lDjBIcL;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = oKConversationOLrzqt;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = oKMessage;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = lKWHzl;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6 = null;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0 = j2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 2;
                objEZpvd = occ.EZpvd(targetId, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
                if (objEZpvd != objCopydefault) {
                }
            }
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            oey = this;
            objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objOLrzqt);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
            oKMessage = (OKMessage) objM7377constructorimpl;
            if (oKMessage != null) {
            }
            if (c35254nrpEZpvd != null) {
            }
            i2 = 10;
            oCC occ2 = oey.AEQbTJ;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = oey;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI2;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = lDjBIcL;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = oKConversationOLrzqt;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = oKMessage;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = lKWHzl;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6 = null;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0 = j2;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 2;
            objEZpvd = occ2.EZpvd(targetId, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
            if (objEZpvd != objCopydefault) {
            }
        } else if (i5 == 1) {
            int i6 = loadMessageListModelWithNavigationScenarioUseCase$execute$1.I$0;
            long j3 = loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0;
            C35254nrp c35254nrp2 = (C35254nrp) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6;
            targetId = (java.lang.String) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5;
            oKConversationOLrzqt = (OKConversation) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4;
            lDjBIcL = (java.lang.Long) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3;
            listAEQbTJ = (java.util.List) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2;
            C36558odI c36558odI5 = (C36558odI) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1;
            oey = (oEY) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                i = i6;
                c36558odI2 = c36558odI5;
                c35254nrpEZpvd = c35254nrp2;
                j2 = j3;
            } catch (java.lang.Throwable th3) {
                th = th3;
                i = i6;
                c36558odI2 = c36558odI5;
                c35254nrpEZpvd = c35254nrp2;
                j2 = j3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                oKMessage = (OKMessage) objM7377constructorimpl;
                if (oKMessage != null) {
                }
                if (c35254nrpEZpvd != null) {
                }
                i2 = 10;
                oCC occ22 = oey.AEQbTJ;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = oey;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = lDjBIcL;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = oKConversationOLrzqt;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = oKMessage;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = lKWHzl;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6 = null;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0 = j2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 2;
                objEZpvd = occ22.EZpvd(targetId, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
                if (objEZpvd != objCopydefault) {
                }
            }
            try {
                objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objOLrzqt);
            } catch (java.lang.Throwable th4) {
                th = th4;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            oKMessage = (OKMessage) objM7377constructorimpl;
            lKWHzl = oKMessage != null ? C56443yFo.KWHzl(oKMessage.getSeq()) : null;
            if (c35254nrpEZpvd != null || i == 0) {
                i2 = 10;
                oCC occ222 = oey.AEQbTJ;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = oey;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = lDjBIcL;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = oKConversationOLrzqt;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = oKMessage;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = lKWHzl;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6 = null;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0 = j2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 2;
                objEZpvd = occ222.EZpvd(targetId, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                l = lDjBIcL;
                oKConversation = oKConversationOLrzqt;
                l2 = lKWHzl;
                oey2 = oey;
                oKMessage2 = oKMessage;
                objOLrzqt = objEZpvd;
                long jLongValue = ((java.lang.Number) objOLrzqt).longValue();
                long jAbs = java.lang.Math.abs(jLongValue - j2);
                oEH oeh = oey2.KWHzl;
                java.lang.Long lKWHzl2 = C56443yFo.KWHzl(jLongValue);
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = oey2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = oKMessage2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = l2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = null;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = null;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 3;
                long j4 = jAbs + 50;
                oEY oey5 = oey2;
                java.lang.Long l5 = l;
                c36558odI3 = c36558odI2;
                z = true;
                OKMessage oKMessage4 = oKMessage2;
                i3 = i2;
                l3 = l2;
                objAEQbTJ = oeh.AEQbTJ(oKConversation, l2, lKWHzl2, l5, j4, true, false, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
                if (objAEQbTJ != objCopydefault) {
                }
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                java.util.Iterator<T> it3 = listAEQbTJ.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C35254nrp) it3.next()).OLrzqt());
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                it = listAEQbTJ.iterator();
                list = arrayList2;
                collection = arrayList3;
                if (it.hasNext()) {
                }
            }
        } else if (i5 == 2) {
            j2 = loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0;
            java.lang.Long l6 = (java.lang.Long) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5;
            OKMessage oKMessage5 = (OKMessage) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4;
            OKConversation oKConversation2 = (OKConversation) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3;
            java.lang.Long l7 = (java.lang.Long) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2;
            c36558odI2 = (C36558odI) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1;
            oEY oey6 = (oEY) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            oKMessage2 = oKMessage5;
            oKConversation = oKConversation2;
            l = l7;
            oey2 = oey6;
            i2 = 10;
            l2 = l6;
            long jLongValue2 = ((java.lang.Number) objOLrzqt).longValue();
            long jAbs2 = java.lang.Math.abs(jLongValue2 - j2);
            oEH oeh2 = oey2.KWHzl;
            java.lang.Long lKWHzl22 = C56443yFo.KWHzl(jLongValue2);
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = oey2;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI2;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = oKMessage2;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = l2;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = null;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = null;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 3;
            long j42 = jAbs2 + 50;
            oEY oey52 = oey2;
            java.lang.Long l52 = l;
            c36558odI3 = c36558odI2;
            z = true;
            OKMessage oKMessage42 = oKMessage2;
            i3 = i2;
            l3 = l2;
            objAEQbTJ = oeh2.AEQbTJ(oKConversation, l2, lKWHzl22, l52, j42, true, false, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
            if (objAEQbTJ != objCopydefault) {
                return objCopydefault;
            }
            oey3 = oey52;
            oKMessage3 = oKMessage42;
            objOLrzqt = objAEQbTJ;
            java.util.List list3 = (java.util.List) objOLrzqt;
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list3, i3));
            it2 = list3.iterator();
            oey4 = oey3;
            c36558odI4 = c36558odI3;
            list2 = list3;
            l4 = l3;
            if (!it2.hasNext()) {
            }
        } else if (i5 == 3) {
            java.lang.Long l8 = (java.lang.Long) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3;
            OKMessage oKMessage6 = (OKMessage) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2;
            C36558odI c36558odI6 = (C36558odI) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1;
            oey3 = (oEY) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            l3 = l8;
            c36558odI3 = c36558odI6;
            z = true;
            oKMessage3 = oKMessage6;
            i3 = 10;
            java.util.List list32 = (java.util.List) objOLrzqt;
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list32, i3));
            it2 = list32.iterator();
            oey4 = oey3;
            c36558odI4 = c36558odI3;
            list2 = list32;
            l4 = l3;
            if (!it2.hasNext()) {
            }
        } else if (i5 == 4) {
            java.util.Collection collection2 = (java.util.Collection) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$7;
            java.util.Iterator it4 = (java.util.Iterator) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6;
            java.util.Collection collection3 = (java.util.Collection) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5;
            list2 = (java.util.List) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4;
            java.lang.Long l9 = (java.lang.Long) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3;
            OKMessage oKMessage7 = (OKMessage) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2;
            C36558odI c36558odI7 = (C36558odI) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1;
            oEY oey7 = (oEY) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            oEY oey8 = oey7;
            C36558odI c36558odI8 = c36558odI7;
            java.util.Collection collection4 = collection3;
            LoadMessageListModelWithNavigationScenarioUseCase$execute$1 loadMessageListModelWithNavigationScenarioUseCase$execute$12 = loadMessageListModelWithNavigationScenarioUseCase$execute$1;
            java.util.Iterator it5 = it4;
            java.util.Collection collection5 = collection2;
            z = true;
            collection5.add((C35254nrp) objOLrzqt);
            it2 = it5;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1 = loadMessageListModelWithNavigationScenarioUseCase$execute$12;
            l4 = l9;
            oKMessage3 = oKMessage7;
            arrayList = collection4;
            c36558odI4 = c36558odI8;
            oey4 = oey8;
            if (!it2.hasNext()) {
                OKMessage oKMessage8 = (OKMessage) it2.next();
                oGG ogg = oey4.EZpvd;
                oGG.ActionBar actionBar = new oGG.ActionBar(l4);
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(z);
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = oey4;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI4;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = oKMessage3;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = l4;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = list2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = arrayList;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6 = it2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$7 = arrayList;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 4;
                java.lang.Object objAEQbTJ2 = ogg.AEQbTJ(c36558odI4, oKMessage8, list2, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : actionBar, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : boolKWHzl, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
                if (objAEQbTJ2 == objCopydefault) {
                    return objCopydefault;
                }
                oey8 = oey4;
                c36558odI8 = c36558odI4;
                oKMessage7 = oKMessage3;
                loadMessageListModelWithNavigationScenarioUseCase$execute$12 = loadMessageListModelWithNavigationScenarioUseCase$execute$1;
                it5 = it2;
                collection5 = arrayList;
                l9 = l4;
                objOLrzqt = objAEQbTJ2;
                collection4 = collection5;
                collection5.add((C35254nrp) objOLrzqt);
                it2 = it5;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1 = loadMessageListModelWithNavigationScenarioUseCase$execute$12;
                l4 = l9;
                oKMessage3 = oKMessage7;
                arrayList = collection4;
                c36558odI4 = c36558odI8;
                oey4 = oey8;
                if (!it2.hasNext()) {
                    C36558odI c36558odI9 = c36558odI4;
                    return c36558odI9.AEQbTJ((32318 & 1) != 0 ? c36558odI9.AhwBna : (java.util.List) arrayList, (32318 & 2) != 0 ? c36558odI9.KWHzl : null, (32318 & 4) != 0 ? c36558odI9.DbNXlk : oKMessage3, (32318 & 8) != 0 ? c36558odI9.AkhnZx : null, (32318 & 16) != 0 ? c36558odI9.isConnected : null, (32318 & 32) != 0 ? c36558odI9.djBIcL : null, (32318 & 64) != 0 ? c36558odI9.EZpvd : C33129mqd.KWHzl((java.util.Collection) list2), (32318 & 128) != 0 ? c36558odI9.OLrzqt : false, (32318 & 256) != 0 ? c36558odI9.values : null, (32318 & 512) != 0 ? c36558odI9.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI9.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI9.copydefault : null, (32318 & 4096) != 0 ? c36558odI9.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI9.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI9.valueOf : false);
                }
            }
        } else {
            if (i5 != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j5 = loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0;
            java.util.Collection collection6 = (java.util.Collection) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6;
            it = (java.util.Iterator) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5;
            java.util.Collection collection7 = (java.util.Collection) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4;
            list = (java.util.List) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3;
            OKMessage oKMessage9 = (OKMessage) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2;
            c36558odI2 = (C36558odI) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1;
            oey = (oEY) loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            LoadMessageListModelWithNavigationScenarioUseCase$execute$1 loadMessageListModelWithNavigationScenarioUseCase$execute$13 = loadMessageListModelWithNavigationScenarioUseCase$execute$1;
            long j6 = j5;
            OKMessage oKMessage10 = oKMessage9;
            java.util.Collection collection8 = collection6;
            collection8.add((C35254nrp) objOLrzqt);
            oKMessage = oKMessage10;
            j2 = j6;
            loadMessageListModelWithNavigationScenarioUseCase$execute$1 = loadMessageListModelWithNavigationScenarioUseCase$execute$13;
            collection = collection7;
            if (it.hasNext()) {
                C35254nrp c35254nrp3 = (C35254nrp) it.next();
                oGG ogg2 = oey.EZpvd;
                OKMessage oKMessageOLrzqt2 = c35254nrp3.OLrzqt();
                oGG.ActionBar actionBar2 = new oGG.ActionBar(C56443yFo.KWHzl(j2));
                java.lang.Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$0 = oey;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$1 = c36558odI2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$2 = oKMessage;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$3 = list;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$4 = collection;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$5 = it;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.L$6 = collection;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.J$0 = j2;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1.label = 5;
                java.lang.Object objAEQbTJ3 = ogg2.AEQbTJ(c36558odI2, oKMessageOLrzqt2, list, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? null : actionBar2, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : boolKWHzl2, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? null : null, loadMessageListModelWithNavigationScenarioUseCase$execute$1);
                if (objAEQbTJ3 == objCopydefault) {
                    return objCopydefault;
                }
                collection7 = collection;
                loadMessageListModelWithNavigationScenarioUseCase$execute$13 = loadMessageListModelWithNavigationScenarioUseCase$execute$1;
                j6 = j2;
                oKMessage10 = oKMessage;
                objOLrzqt = objAEQbTJ3;
                collection8 = collection7;
                collection8.add((C35254nrp) objOLrzqt);
                oKMessage = oKMessage10;
                j2 = j6;
                loadMessageListModelWithNavigationScenarioUseCase$execute$1 = loadMessageListModelWithNavigationScenarioUseCase$execute$13;
                collection = collection7;
                if (it.hasNext()) {
                    C36558odI c36558odI10 = c36558odI2;
                    return c36558odI10.AEQbTJ((32318 & 1) != 0 ? c36558odI10.AhwBna : (java.util.List) collection, (32318 & 2) != 0 ? c36558odI10.KWHzl : null, (32318 & 4) != 0 ? c36558odI10.DbNXlk : oKMessage, (32318 & 8) != 0 ? c36558odI10.AkhnZx : null, (32318 & 16) != 0 ? c36558odI10.isConnected : null, (32318 & 32) != 0 ? c36558odI10.djBIcL : null, (32318 & 64) != 0 ? c36558odI10.EZpvd : false, (32318 & 128) != 0 ? c36558odI10.OLrzqt : false, (32318 & 256) != 0 ? c36558odI10.values : null, (32318 & 512) != 0 ? c36558odI10.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI10.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI10.copydefault : null, (32318 & 4096) != 0 ? c36558odI10.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI10.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI10.valueOf : false);
                }
            }
        }
    }
}
