package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import o.AbstractC33246mso;
import o.AbstractC33247msp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33397mvg {
    public final OKComplianceRestrictionService OLrzqt;

    public C33397mvg(@NotNull OKComplianceRestrictionService oKComplianceRestrictionService) {
        Intrinsics.checkNotNullParameter(oKComplianceRestrictionService, "");
        this.OLrzqt = oKComplianceRestrictionService;
    }

    public final boolean copydefault(@NotNull AbstractC33246mso abstractC33246mso) {
        Intrinsics.checkNotNullParameter(abstractC33246mso, "");
        if (Intrinsics.EZpvd(abstractC33246mso, AbstractC33246mso.StateListAnimator.OLrzqt)) {
            return this.OLrzqt.AuCTel().contains(OKComplianceRestrictionService.AppMode.CEFI.getModeName());
        }
        if (Intrinsics.EZpvd(abstractC33246mso, AbstractC33246mso.TaskDescription.OLrzqt)) {
            return this.OLrzqt.AuCTel().contains(OKComplianceRestrictionService.AppMode.WEB3.getModeName());
        }
        if (Intrinsics.EZpvd(abstractC33246mso, AbstractC33246mso.ActionBar.copydefault)) {
            return true;
        }
        if (Intrinsics.EZpvd(abstractC33246mso, AbstractC33246mso.Activity.copydefault)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean AEQbTJ(@NotNull AbstractC33247msp abstractC33247msp) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(abstractC33247msp, "");
        if (copydefault(abstractC33247msp.OLrzqt())) {
            if (Intrinsics.EZpvd(abstractC33247msp, AbstractC33247msp.Activity.AEQbTJ)) {
                zContains = this.OLrzqt.fIwbmz().contains(OKComplianceRestrictionService.CefiMode.PRO.getModeName());
            } else {
                if (Intrinsics.EZpvd(abstractC33247msp, AbstractC33247msp.StateListAnimator.AEQbTJ)) {
                    zContains = this.OLrzqt.fIwbmz().contains(OKComplianceRestrictionService.CefiMode.LITE.getModeName());
                }
                return true;
            }
            if (zContains) {
                return true;
            }
        }
        return false;
    }

    public final boolean EZpvd(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        return AEQbTJ(abstractC33244msm.KWHzl()) && (!Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Activity.KWHzl) ? (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.ActionBar.KWHzl) || Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Fragment.KWHzl)) && !(this.OLrzqt.dNCPSb() && this.OLrzqt.ejfBZ().contains(abstractC33244msm.EZpvd())) : this.OLrzqt.dNCPSb() && !this.OLrzqt.ejfBZ().isEmpty());
    }

    public final boolean KWHzl(AbstractC33244msm abstractC33244msm) {
        java.util.ArrayList arrayList;
        InterfaceC33208msC interfaceC33208msC;
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33208msC.class));
        if (listKWHzl != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                if (Intrinsics.EZpvd(((InterfaceC33208msC) obj).EZpvd(), abstractC33244msm)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || !C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), 1)) {
            return !((arrayList == null || (interfaceC33208msC = (InterfaceC33208msC) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || interfaceC33208msC.KWHzl()) ? false : true);
        }
        throw new java.lang.IllegalStateException("There should be only one OKAppModeVisibilityExtension with mode " + abstractC33244msm + ", but found " + arrayList.size());
    }

    public final boolean AEQbTJ(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        if (C34703nhO.copydefault()) {
            return Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl);
        }
        return EZpvd(abstractC33244msm) && KWHzl(abstractC33244msm);
    }

    public final java.util.List<AbstractC33244msm> OLrzqt(boolean z) {
        java.util.List<AbstractC33244msm> listAEQbTJ;
        java.util.List<AbstractC33246mso> listEZpvd = EZpvd();
        java.util.ArrayList<AbstractC33247msp> arrayList = new java.util.ArrayList();
        for (AbstractC33246mso abstractC33246mso : listEZpvd) {
            C56406yEe.KWHzl(arrayList, Intrinsics.EZpvd(abstractC33246mso, AbstractC33246mso.StateListAnimator.OLrzqt) ? copydefault() : abstractC33246mso.EZpvd());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (AbstractC33247msp abstractC33247msp : arrayList) {
            if (!Intrinsics.EZpvd(abstractC33247msp, AbstractC33247msp.StateListAnimator.AEQbTJ)) {
                listAEQbTJ = abstractC33247msp.AEQbTJ();
            } else if (z) {
                listAEQbTJ = abstractC33247msp.AEQbTJ();
            } else {
                listAEQbTJ = OLrzqt();
            }
            C56406yEe.KWHzl(arrayList2, listAEQbTJ);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            if (AEQbTJ((AbstractC33244msm) obj)) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public final java.util.List<AbstractC33246mso> EZpvd() {
        AbstractC33246mso abstractC33246mso;
        java.util.List<java.lang.String> listAuCTel = this.OLrzqt.AuCTel();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAuCTel, 10));
        for (java.lang.String str : listAuCTel) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) OKComplianceRestrictionService.AppMode.CEFI.getModeName())) {
                abstractC33246mso = AbstractC33246mso.StateListAnimator.OLrzqt;
            } else {
                abstractC33246mso = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) OKComplianceRestrictionService.AppMode.WEB3.getModeName()) ? AbstractC33246mso.TaskDescription.OLrzqt : null;
            }
            arrayList.add(abstractC33246mso);
        }
        return CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends AbstractC33246mso.ActionBar>) CollectionsKt___CollectionsKt.QfsBiF(arrayList), AbstractC33246mso.ActionBar.copydefault);
    }

    public final java.util.List<AbstractC33247msp> copydefault() {
        AbstractC33247msp abstractC33247msp;
        java.util.List<java.lang.String> listFIwbmz = this.OLrzqt.fIwbmz();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFIwbmz, 10));
        for (java.lang.String str : listFIwbmz) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) OKComplianceRestrictionService.CefiMode.PRO.getModeName())) {
                abstractC33247msp = AbstractC33247msp.Activity.AEQbTJ;
            } else {
                abstractC33247msp = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) OKComplianceRestrictionService.CefiMode.LITE.getModeName()) ? AbstractC33247msp.StateListAnimator.AEQbTJ : null;
            }
            arrayList.add(abstractC33247msp);
        }
        return CollectionsKt___CollectionsKt.QfsBiF(arrayList);
    }

    public final java.util.List<AbstractC33244msm> OLrzqt() {
        java.util.List<java.lang.String> listEjfBZ = this.OLrzqt.ejfBZ();
        if (listEjfBZ.isEmpty()) {
            return C56402yEa.EZpvd(AbstractC33244msm.Activity.KWHzl);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEjfBZ, 10));
        for (java.lang.String str : listEjfBZ) {
            AbstractC33244msm abstractC33244msm = AbstractC33244msm.Fragment.KWHzl;
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) abstractC33244msm.EZpvd())) {
                abstractC33244msm = AbstractC33244msm.ActionBar.KWHzl;
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) abstractC33244msm.EZpvd())) {
                    abstractC33244msm = null;
                }
            }
            arrayList.add(abstractC33244msm);
        }
        return CollectionsKt___CollectionsKt.QfsBiF(arrayList);
    }

    public final AbstractC33244msm AEQbTJ() {
        java.util.Iterator<T> it = EZpvd().iterator();
        while (it.hasNext()) {
            AbstractC33244msm abstractC33244msmAEQbTJ = AEQbTJ((AbstractC33246mso) it.next());
            if (abstractC33244msmAEQbTJ != null) {
                return abstractC33244msmAEQbTJ;
            }
        }
        return null;
    }

    public final AbstractC33247msp OLrzqt(@NotNull AbstractC33246mso abstractC33246mso) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(abstractC33246mso, "");
        java.util.Iterator<T> it = (Intrinsics.EZpvd(abstractC33246mso, AbstractC33246mso.StateListAnimator.OLrzqt) ? copydefault() : abstractC33246mso.EZpvd()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AEQbTJ((AbstractC33247msp) next)) {
                break;
            }
        }
        return (AbstractC33247msp) next;
    }

    public final AbstractC33244msm AEQbTJ(@NotNull AbstractC33246mso abstractC33246mso) {
        Intrinsics.checkNotNullParameter(abstractC33246mso, "");
        java.util.Iterator<T> it = (Intrinsics.EZpvd(abstractC33246mso, AbstractC33246mso.StateListAnimator.OLrzqt) ? copydefault() : abstractC33246mso.EZpvd()).iterator();
        while (it.hasNext()) {
            AbstractC33244msm abstractC33244msmCopydefault = copydefault((AbstractC33247msp) it.next());
            if (abstractC33244msmCopydefault != null) {
                return abstractC33244msmCopydefault;
            }
        }
        return null;
    }

    public final AbstractC33244msm copydefault(@NotNull AbstractC33247msp abstractC33247msp) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(abstractC33247msp, "");
        java.util.Iterator<T> it = (Intrinsics.EZpvd(abstractC33247msp, AbstractC33247msp.StateListAnimator.AEQbTJ) ? OLrzqt() : abstractC33247msp.AEQbTJ()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AEQbTJ((AbstractC33244msm) next)) {
                break;
            }
        }
        return (AbstractC33244msm) next;
    }
}
