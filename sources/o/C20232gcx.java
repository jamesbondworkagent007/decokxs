package o;

import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.Intention;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20232gcx extends C20150gbU<AbstractC8601bFm<?, ?>> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    @Override // o.C20150gbU, o.AbstractC20082gaF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull AbstractC20082gaF<AbstractC8601bFm<?, ?>>.ActionBar actionBar, boolean z) {
        java.lang.String intentionTypeIconUrlDay;
        ExposureInfo exposureInfo;
        Intrinsics.checkNotNullParameter(actionBar, "");
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ((AbstractC8601bFm) ejfBZ()).ab_();
        Intention contractIntention = kYSPreTxCheckInfoAb_ != null ? kYSPreTxCheckInfoAb_.getContractIntention() : null;
        if (C33492mxV.OLrzqt()) {
            intentionTypeIconUrlDay = contractIntention != null ? contractIntention.getIntentionTypeIconUrlNight() : null;
        } else if (contractIntention != null) {
            intentionTypeIconUrlDay = contractIntention.getIntentionTypeIconUrlDay();
        }
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C13754dXa.Activity.ixgjPv);
        java.lang.String intentionTypeLanguageText = contractIntention != null ? contractIntention.getIntentionTypeLanguageText() : null;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoTimeNightModeManager);
        if (intentionTypeLanguageText == null || intentionTypeLanguageText.length() == 0) {
            intentionTypeLanguageText = strAYXKKw;
        }
        PlatformItem dapp = ((AbstractC8601bFm) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        C57431yiL c57431yiLTitleInfoView$default = AbstractC20102gaZ.titleInfoView$default(this, intentionTypeIconUrlDay, intentionTypeLanguageText, null, urlOnlyHost == null ? "" : urlOnlyHost, null, drawableKWHzl, null, 84, null);
        actionBar.OLrzqt(c57431yiLTitleInfoView$default);
        int iEZpvd = actionBar.EZpvd();
        final boolean zAl_ = ((AbstractC8601bFm) ejfBZ()).al_();
        if (zAl_) {
            actionBar.OLrzqt(RcXXUw());
        }
        actionBar.OLrzqt(finit());
        actionBar.OLrzqt(dxcTrN());
        if (actionBar.EZpvd() > iEZpvd) {
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        } else if (kYSPreTxCheckInfoAb_ == null) {
            c57431yiLTitleInfoView$default.setSubChildTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.doInvalidatePanelMenu));
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) (contractIntention != null ? contractIntention.getSupportIntentionFlag() : null), (java.lang.Object) "UNKNOWN")) {
            }
        }
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        if (zAl_) {
            java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAb_ != null ? kYSPreTxCheckInfoAb_.getExposures() : null;
            actionBar.OLrzqt(copydefault((exposures == null || (exposureInfo = (ExposureInfo) CollectionsKt___CollectionsKt.firstOrNull(exposures)) == null) ? null : exposureInfo.getSpenderKey()));
        }
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        if (((AbstractC8601bFm) ejfBZ()).QwvEab() != 2 && ((AbstractC8601bFm) ejfBZ()).aUsmxb() != OKWBaseTransaction.TransactionType.SolanaMultiSign) {
            actionBar.OLrzqt(djSkpj());
        }
        final boolean z2 = ((AbstractC8601bFm) ejfBZ()).QwvEab() != 4;
        if (z2 || zAl_) {
            actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gcD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20232gcx.OLrzqt(zAl_, this, z2, (AbstractC20082gaF.ActionBar) obj);
                }
            }, 3, null));
        }
    }

    public static final Unit OLrzqt(boolean z, C20232gcx c20232gcx, boolean z2, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (z) {
            actionBar.EZpvd(c20232gcx.dvKsVJ());
        }
        if (z2) {
            c20232gcx.valueOf(actionBar);
            actionBar.KWHzl(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
