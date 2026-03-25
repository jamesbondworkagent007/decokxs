package o;

import o.C13754dXa;
import o.C52761wXj;

/* JADX INFO: renamed from: o.bew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9936bew extends AbstractC33073mpa {
    public boolean EZpvd;
    public C10854bwM KWHzl;
    public final java.util.ArrayList<C9983bfq> copydefault = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<C9983bfq> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.EZpvd = true;
    }

    public final void EZpvd(long j) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
        if (c10854bwMKWHzl != null) {
            this.KWHzl = c10854bwMKWHzl;
            java.util.ArrayList<C9983bfq> arrayListKWHzl = c10854bwMKWHzl.QCjLjM() ? KWHzl(c10854bwMKWHzl.djBIcL()) : AEQbTJ(c10854bwMKWHzl.djBIcL());
            this.copydefault.clear();
            this.copydefault.addAll(arrayListKWHzl);
        }
    }

    public final void AEQbTJ(long j) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        if (c10854bwMCopydefault != null) {
            this.KWHzl = c10854bwMCopydefault;
            java.util.ArrayList<C9983bfq> arrayListKWHzl = c10854bwMCopydefault.QCjLjM() ? KWHzl(c10854bwMCopydefault.djBIcL()) : AEQbTJ(c10854bwMCopydefault.djBIcL());
            this.copydefault.clear();
            this.copydefault.addAll(arrayListKWHzl);
        }
    }

    public final java.util.ArrayList<C9983bfq> AEQbTJ(java.lang.String str) {
        return yDY.copydefault(new C9983bfq(C33070mpX.KWHzl(C52761wXj.TaskDescription.QOLQEE), C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcherOnBackPressedCancellable), C33069mpW.copydefault(C13754dXa.FragmentManager.OnBackPressedDispatcherOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", str)))), new C9983bfq(C33070mpX.KWHzl(C52761wXj.TaskDescription.DRuYWY), C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcherLifecycleOnBackPressedCancellable), C33069mpW.copydefault(C13754dXa.FragmentManager.PipHintTrackerKt, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", str)))), new C9983bfq(C33070mpX.KWHzl(C52761wXj.TaskDescription.ibnZAm), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onBackInvoked), C33069mpW.copydefault(C13754dXa.FragmentManager.createOnBackInvokedCallbacklambda0, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", str)))), new C9983bfq(C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPdNQGVJ), C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregisterOnBackInvokedCallback), C33069mpW.copydefault(C13754dXa.FragmentManager.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", str)))));
    }

    public final java.util.ArrayList<C9983bfq> KWHzl(java.lang.String str) {
        return yDY.copydefault(new C9983bfq(C33070mpX.KWHzl(C52761wXj.TaskDescription.QOLQEE), C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcherOnBackPressedCancellable), C33069mpW.copydefault(C13754dXa.FragmentManager.DTg, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", str)))), new C9983bfq(C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPdNQGVJ), C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregisterOnBackInvokedCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getPriority)), new C9983bfq(C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPOZOJIj), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLabel), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIOvDItG)));
    }
}
