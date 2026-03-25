package o;

import androidx.fragment.app.FragmentActivity;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fXW {
    public Function0<Unit> AEQbTJ;
    public int KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.fXW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void dealKYSErrors$default(fXW fxw, FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection collection, OKWBaseTransaction.TransactionType transactionType, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            function0 = null;
        }
        fxw.AEQbTJ(fragmentActivity, fragmentManager, (java.util.Collection<? extends AbstractC9832bcy>) collection, transactionType, z2, (Function0<Unit>) function0);
    }

    public final void AEQbTJ(FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection, @NotNull OKWBaseTransaction.TransactionType transactionType, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        if (fragmentActivity == null || collection == null) {
            return;
        }
        this.AEQbTJ = function0;
        KWHzl(fragmentActivity, fragmentManager, collection, z);
        AEQbTJ(fragmentActivity, fragmentManager, collection, transactionType, true, z);
        AhwBna(fragmentActivity, fragmentManager, collection);
        valueOf(fragmentActivity, fragmentManager, collection);
        isConnected(fragmentActivity, fragmentManager, collection);
        DbNXlk(fragmentActivity, fragmentManager, collection);
        copydefault(fragmentActivity, fragmentManager, collection);
        EZpvd(fragmentActivity, fragmentManager, collection);
        djBIcL(fragmentActivity, fragmentManager, collection);
        dealPreExecutionRiskyAddressErrorStatus$default(this, fragmentActivity, fragmentManager, collection, transactionType, false, false, 32, null);
        values(fragmentActivity, fragmentManager, collection);
        fetchVPNInfo(fragmentActivity, fragmentManager, collection);
        fARcdN(fragmentActivity, fragmentManager, collection);
        AYXKKw(fragmentActivity, fragmentManager, collection);
        gEmmrt(fragmentActivity, fragmentManager, collection);
        OLrzqt(fragmentActivity, fragmentManager, collection);
        KWHzl(fragmentActivity, fragmentManager, collection);
        AkhnZx(fragmentActivity, fragmentManager, collection);
        AEQbTJ(fragmentActivity, fragmentManager, collection);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dfc.generateCommonRiskSubTitle$default(o.dfc, android.content.Context, android.content.res.Resources, int, java.lang.String, java.util.Map, o.bcH, int, java.lang.Object):java.lang.CharSequence */
    public final void AEQbTJ(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9820bcm) {
                arrayList.add(obj);
            }
        }
        if (((C9820bcm) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController4);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c57445yiZ.copydefault(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.MediaControllerCompatApi24TransportControls, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
        this.KWHzl++;
    }

    public final void AkhnZx(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9883bdw) {
                arrayList.add(obj);
            }
        }
        C9883bdw c9883bdw = (C9883bdw) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9883bdw == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C17944fYb.showSafeRiskTipProcess$default(C17944fYb.AEQbTJ, fragmentActivity, fragmentManager, C13754dXa.ActionBar.DfrfUJ, new RiskPageInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.sJqpAA), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsGetContent), null, null, null, null, null, true, 996, null), c9883bdw, null, 32, null);
        this.KWHzl++;
    }

    public final void KWHzl(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9812bce) {
                arrayList.add(obj);
            }
        }
        C9812bce c9812bce = (C9812bce) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9812bce == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendSocketRequest);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        C17944fYb.showSafeRiskTipProcess$default(c17944fYb, fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.FdcJU, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : c9812bce), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), c9812bce, null, 32, null);
        this.KWHzl++;
    }

    public final void EZpvd(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9814bcg) {
                arrayList.add(obj);
            }
        }
        C9814bcg c9814bcg = (C9814bcg) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9814bcg == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallbackStubApi24);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        C17944fYb.showSafeRiskTipProcess$default(c17944fYb, fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, c9814bcg.OLrzqt(), c9814bcg), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallbackStubApi24), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaControllerCompatApi21TransportControls), null, false, 1540, null), c9814bcg, null, 32, null);
        this.KWHzl++;
    }

    public final void djBIcL(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9830bcw) {
                arrayList.add(obj);
            }
        }
        if (((C9830bcw) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C57445yiZ.copydefault.copydefault(fragmentActivity, fragmentManager, C13754dXa.ActionBar.DfrfUJ, new RiskPageInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner2), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
        this.KWHzl++;
    }

    public final void valueOf(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9831bcx) {
                arrayList.add(obj);
            }
        }
        C9831bcx c9831bcx = (C9831bcx) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9831bcx == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c17944fYb.OLrzqt(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.setText, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : c9831bcx), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, null, null, null, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface), false, 1524, null), c9831bcx, this.AEQbTJ);
        this.KWHzl++;
    }

    public final void AYXKKw(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9833bcz) {
                arrayList.add(obj);
            }
        }
        if (((C9833bcz) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c57445yiZ.copydefault(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.onActionItemClicked, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
        this.KWHzl++;
    }

    public final void values(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9871bdk) {
                arrayList.add(obj);
            }
        }
        C9871bdk c9871bdk = (C9871bdk) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9871bdk == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        C17944fYb.showSafeRiskTipProcess$default(c17944fYb, fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.ActionBarDrawerToggle, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : c9871bdk), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), c9871bdk, null, 32, null);
        this.KWHzl++;
    }

    public final void gEmmrt(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9794bcM) {
                arrayList.add(obj);
            }
        }
        if (((C9794bcM) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c57445yiZ.copydefault(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.updateForNightMode, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
        this.KWHzl++;
    }

    public static /* synthetic */ void dealFromAddressRisk$default(fXW fxw, FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection collection, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        fxw.KWHzl(fragmentActivity, fragmentManager, collection, z);
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.Collection<? extends AbstractC9832bcy> collection, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9788bcG) {
                arrayList.add(obj);
            }
        }
        C9788bcG c9788bcG = (C9788bcG) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9788bcG == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        C17944fYb.AEQbTJ.OLrzqt(fragmentActivity, fragmentManager, C13754dXa.ActionBar.DfrfUJ, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.ViewTreeOnBackPressedDispatcherOwner, "case", null, c9788bcG), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), null, null, null, null, null, z ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface) : "", false, 1524, null), c9788bcG, this.AEQbTJ);
        this.KWHzl++;
    }

    public static /* synthetic */ void dealPreExecutionRiskyAddressErrorStatus$default(fXW fxw, FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection collection, OKWBaseTransaction.TransactionType transactionType, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z2 = true;
        }
        fxw.AEQbTJ(fragmentActivity, fragmentManager, (java.util.Collection<? extends AbstractC9832bcy>) collection, transactionType, z, z2);
    }

    public final void AEQbTJ(final FragmentActivity fragmentActivity, final androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection, OKWBaseTransaction.TransactionType transactionType, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        java.lang.String strJoinToString$default;
        RiskPageInfoBean riskPageInfoBean;
        java.util.Collection<? extends AbstractC9832bcy> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection2) {
            if (obj instanceof C9870bdj) {
                arrayList.add(obj);
            }
        }
        C9870bdj c9870bdj = (C9870bdj) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9870bdj == null) {
            return;
        }
        boolean zGEmmrt = c9870bdj.gEmmrt();
        boolean z5 = (c9870bdj.OLrzqt().isEmpty() ^ true) && !c9870bdj.gEmmrt();
        boolean zAEQbTJ = c9870bdj.AEQbTJ();
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        if (z5 || zAEQbTJ) {
            z3 = z;
            z4 = true;
        } else {
            z3 = z;
            z4 = false;
        }
        if (z3 == z4) {
            java.util.List<java.lang.String> listOLrzqt = c9870bdj.OLrzqt();
            if (listOLrzqt.isEmpty()) {
                strJoinToString$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, c9870bdj.copydefault(), false, 2, null);
            } else if (listOLrzqt.size() == 1) {
                strJoinToString$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(listOLrzqt), false, 2, null);
            } else {
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOLrzqt, "、", null, null, 0, null, new Function1() { // from class: o.fXV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return fXW.AEQbTJ((java.lang.String) obj2);
                    }
                }, 30, null);
            }
            if (zAEQbTJ) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
                C14128dfc c14128dfc = C14128dfc.KWHzl;
                android.content.res.Resources resources = fragmentActivity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                riskPageInfoBean = new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.iluEmO, "case", C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, strJoinToString$default)), c9870bdj), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, null, null, null, null, z2 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface) : "", false, 1524, null);
            } else {
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
                C14128dfc c14128dfc2 = C14128dfc.KWHzl;
                android.content.res.Resources resources2 = fragmentActivity.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "");
                riskPageInfoBean = new RiskPageInfoBean(strAYXKKw2, c14128dfc2.copydefault(fragmentActivity, resources2, C13754dXa.FragmentManager.sWlOSi, "case", C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, strJoinToString$default)), c9870bdj), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), transactionType.isTransfer() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface) : "", false, MTPushConstants.Message.CODE_MESSAGE_OPENED, null);
            }
            C17944fYb.AEQbTJ.OLrzqt(fragmentActivity, fragmentManager, C13754dXa.ActionBar.DfrfUJ, riskPageInfoBean, c9870bdj, this.AEQbTJ);
            this.KWHzl++;
        }
        if (transactionType.isTransfer() && !C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : collection2) {
                if (obj2 instanceof C9874bdn) {
                    arrayList2.add(obj2);
                }
            }
            C9874bdn c9874bdn = (C9874bdn) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
            if (c9874bdn != null) {
                C17944fYb.showSafeRiskTipProcess$default(C17944fYb.AEQbTJ, fragmentActivity, fragmentManager, C13754dXa.ActionBar.DfrfUJ, new RiskPageInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPlayFromMediaId), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), c9874bdn, null, 32, null);
                this.KWHzl++;
            }
            if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.KWHzl), 0) && zGEmmrt) {
                fragmentManager.beginTransaction().add(C13754dXa.ActionBar.DfrfUJ, C20479ghf.Companion.KWHzl(c9870bdj.copydefault(), c9870bdj.KWHzl(), new Function0() { // from class: o.fXZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return fXW.AEQbTJ(fragmentManager);
                    }
                }, new Function0() { // from class: o.fYe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return fXW.EZpvd(fragmentActivity);
                    }
                }), "SimilarAddressTipFragment").commitAllowingStateLoss();
                this.KWHzl++;
            }
        }
    }

    public static final java.lang.CharSequence AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null);
    }

    public static final Unit AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("SimilarAddressTipFragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(FragmentActivity fragmentActivity) {
        fragmentActivity.finish();
        return Unit.INSTANCE;
    }

    public final void AhwBna(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9866bdf) {
                arrayList.add(obj);
            }
        }
        if (((C9866bdf) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c57445yiZ.copydefault(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.isListening, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, null, null, null, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface), false, 1524, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : this.AEQbTJ);
        this.KWHzl++;
    }

    public final void DbNXlk(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9875bdo) {
                arrayList.add(obj);
            }
        }
        if (((C9875bdo) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c57445yiZ.copydefault(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.cleanup, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, null, null, null, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPostMessage), false, 1524, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : this.AEQbTJ);
        this.KWHzl++;
    }

    public final void copydefault(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9824bcq) {
                arrayList.add(obj);
            }
        }
        if (((C9824bcq) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c57445yiZ.copydefault(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.createIntentFilterForBroadcastReceiver, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, null, null, null, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface), false, 1524, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : this.AEQbTJ);
        this.KWHzl++;
    }

    public final void OLrzqt(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9823bcp) {
                arrayList.add(obj);
            }
        }
        if (((C9823bcp) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c57445yiZ.copydefault(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.onChange, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
        this.KWHzl++;
    }

    public final void fetchVPNInfo(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9873bdm) {
                arrayList.add(obj);
            }
        }
        C9873bdm c9873bdm = (C9873bdm) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9873bdm == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        C17944fYb.showSafeRiskTipProcess$default(c17944fYb, fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.create, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : c9873bdm), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), c9873bdm, null, 32, null);
        this.KWHzl++;
    }

    public final void isConnected(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9877bdq) {
                arrayList.add(obj);
            }
        }
        C9877bdq c9877bdq = (C9877bdq) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9877bdq == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        c17944fYb.OLrzqt(fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.onScrollChanged, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : c9877bdq), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), "", null, null, null, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.asInterface), false, 1508, null), c9877bdq, this.AEQbTJ);
        this.KWHzl++;
    }

    public final void fARcdN(FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9839bdE) {
                arrayList.add(obj);
            }
        }
        C9839bdE c9839bdE = (C9839bdE) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9839bdE == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.KWHzl), 0)) {
            return;
        }
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        C17944fYb.showSafeRiskTipProcess$default(c17944fYb, fragmentActivity, fragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(fragmentActivity, resources, C13754dXa.FragmentManager.onLayoutChange, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : c9839bdE), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, null, null, null, null, null, false, 2036, null), c9839bdE, null, 32, null);
        this.KWHzl++;
    }
}
