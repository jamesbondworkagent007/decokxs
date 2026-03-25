package o;

import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.Intention;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20184gcB extends C20150gbU<OKWTronSignContract<?>> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    @Override // o.C20150gbU, o.AbstractC20082gaF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull AbstractC20082gaF<OKWTronSignContract<?>>.ActionBar actionBar, boolean z) {
        java.lang.String intentionTypeIconUrlNight;
        java.lang.String intentionTypeLanguageText;
        Intention contractIntention;
        ExposureInfo exposureInfo;
        Intention contractIntention2;
        Intention contractIntention3;
        Intrinsics.checkNotNullParameter(actionBar, "");
        boolean zAEQbTJ = ((OKWTronSignContract) ejfBZ()).UlJrfe().AEQbTJ(C56524yIo.AEQbTJ(C9838bdD.class));
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ((OKWTronSignContract) ejfBZ()).ab_();
        if (!zAEQbTJ) {
            if (C33492mxV.OLrzqt()) {
                intentionTypeIconUrlNight = (kYSPreTxCheckInfoAb_ == null || (contractIntention3 = kYSPreTxCheckInfoAb_.getContractIntention()) == null) ? null : contractIntention3.getIntentionTypeIconUrlNight();
            } else if (kYSPreTxCheckInfoAb_ != null && (contractIntention2 = kYSPreTxCheckInfoAb_.getContractIntention()) != null) {
                intentionTypeIconUrlNight = contractIntention2.getIntentionTypeIconUrlDay();
            }
        }
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C13754dXa.Activity.ixgjPv);
        if (zAEQbTJ) {
            intentionTypeLanguageText = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onProvideKeyboardShortcuts);
        } else {
            intentionTypeLanguageText = (kYSPreTxCheckInfoAb_ == null || (contractIntention = kYSPreTxCheckInfoAb_.getContractIntention()) == null) ? null : contractIntention.getIntentionTypeLanguageText();
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoTimeNightModeManager);
            if (intentionTypeLanguageText == null || intentionTypeLanguageText.length() == 0) {
                intentionTypeLanguageText = strAYXKKw;
            }
        }
        PlatformItem dapp = ((OKWTronSignContract) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        C57431yiL c57431yiLTitleInfoView$default = AbstractC20102gaZ.titleInfoView$default(this, intentionTypeIconUrlNight, intentionTypeLanguageText, null, urlOnlyHost == null ? "" : urlOnlyHost, null, drawableKWHzl, null, 84, null);
        actionBar.OLrzqt(c57431yiLTitleInfoView$default);
        int iEZpvd = actionBar.EZpvd();
        final boolean zAl_ = ((OKWTronSignContract) ejfBZ()).al_();
        if (zAl_) {
            actionBar.OLrzqt(RcXXUw());
        }
        actionBar.OLrzqt(finit());
        actionBar.OLrzqt(dxcTrN());
        if (actionBar.EZpvd() > iEZpvd) {
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        } else if (!zAEQbTJ) {
            if (kYSPreTxCheckInfoAb_ != null) {
                Intention contractIntention4 = kYSPreTxCheckInfoAb_.getContractIntention();
                if (Intrinsics.EZpvd((java.lang.Object) (contractIntention4 != null ? contractIntention4.getSupportIntentionFlag() : null), (java.lang.Object) "UNKNOWN")) {
                }
            } else {
                c57431yiLTitleInfoView$default.setSubChildTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.doInvalidatePanelMenu));
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
        actionBar.OLrzqt(QUSxYX());
        actionBar.OLrzqt(djSkpj());
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gcC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20184gcB.AEQbTJ(zAl_, this, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    public static final Unit AEQbTJ(boolean z, C20184gcB c20184gcB, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (z) {
            actionBar.EZpvd(c20184gcB.dvKsVJ());
        }
        c20184gcB.valueOf(actionBar);
        Unit unit = Unit.INSTANCE;
        actionBar.KWHzl(unit);
        return unit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View QUSxYX() throws java.io.IOException {
        java.util.HashSet<java.lang.String> hashSetDcqEDu = ((OKWTronSignContract) ejfBZ()).DcqEDu();
        if (hashSetDcqEDu.isEmpty()) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57453yih c57453yih = new C57453yih(contextRequireContext, null, 0, 6, null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i = 0;
        for (java.lang.Object obj : hashSetDcqEDu) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(pTD.copydefault(this, C13754dXa.FragmentManager.bypassOnContentChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i2))))));
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, spannableStringBuilder2.length(), 33);
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder((java.lang.String) obj);
            spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringBuilder3.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableStringBuilder2);
            spannableStringBuilder.append((java.lang.CharSequence) spannableStringBuilder3);
            if (i != hashSetDcqEDu.size() - 1) {
                spannableStringBuilder.append('\n');
            }
            c57453yih.setContentInfo(spannableStringBuilder);
            c57453yih.setHeaderTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.startAsSupportActionMode));
            i = i2;
        }
        return c57453yih;
    }
}
