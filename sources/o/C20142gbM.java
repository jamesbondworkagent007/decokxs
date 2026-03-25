package o;

import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.net.bean.Intention;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.ActivityC20262gda;
import o.C13754dXa;
import o.C52761wXj;
import o.C9694baS;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gbM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20142gbM extends C20150gbU<C9100bPH> {
    public C57422yiC fARcdN;

    /* JADX DEBUG: Class process forced to load method for inline: o.gaZ.titleInfoView$default(o.gaZ, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function0, int, java.lang.Object):o.yiL */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    @Override // o.C20150gbU, o.AbstractC20082gaF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull AbstractC20082gaF<C9100bPH>.ActionBar actionBar, boolean z) {
        java.lang.String intentionTypeIconUrlDay;
        Intrinsics.checkNotNullParameter(actionBar, "");
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ((C9100bPH) ejfBZ()).ab_();
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
        PlatformItem dapp = ((C9100bPH) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        C57431yiL c57431yiLTitleInfoView$default = AbstractC20102gaZ.titleInfoView$default(this, intentionTypeIconUrlDay, intentionTypeLanguageText, null, urlOnlyHost == null ? "" : urlOnlyHost, null, drawableKWHzl, null, 84, null);
        actionBar.OLrzqt(c57431yiLTitleInfoView$default);
        int iEZpvd = actionBar.EZpvd();
        actionBar.OLrzqt(finit());
        actionBar.OLrzqt(dxcTrN());
        actionBar.OLrzqt(QbewEr());
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
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(djSkpj());
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gbR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20142gbM.OLrzqt(this.OLrzqt, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    public static final Unit OLrzqt(C20142gbM c20142gbM, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.EZpvd(c20142gbM.QUSxYX());
        c20142gbM.valueOf(actionBar);
        Unit unit = Unit.INSTANCE;
        actionBar.KWHzl(unit);
        return unit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View QbewEr() {
        if (!((C9100bPH) ejfBZ()).w_()) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57422yiC c57422yiC = new C57422yiC(contextRequireContext, null, 0, 6, null);
        this.fARcdN = c57422yiC;
        QVAiDq();
        return c57422yiC;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QVAiDq() {
        C57422yiC c57422yiC = this.fARcdN;
        if (c57422yiC == null) {
            Intrinsics.gEmmrt("");
            c57422yiC = null;
        }
        c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fVBECu), C59467zhb.zuBGHE(C59467zhb.wlaJM(C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(C56548yJl.AhwBna(0, ((C9100bPH) ejfBZ()).djBIcL())), new Function1() { // from class: o.gbJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20142gbM.AEQbTJ(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }))), false, null, null, null, null, 124, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final TransactionHeaderInfoBean.HeaderSimpleDataBean AEQbTJ(final C20142gbM c20142gbM, final int i) {
        android.text.SpannedString spannedString;
        InterfaceC9730bbB.StateListAnimator stateListAnimatorCopydefault = ((C9100bPH) c20142gbM.ejfBZ()).copydefault(i);
        if (stateListAnimatorCopydefault == null) {
            return null;
        }
        java.lang.String strEZpvd = stateListAnimatorCopydefault.EZpvd();
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context contextRequireContext = c20142gbM.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        android.graphics.drawable.Drawable drawableOLrzqt = c14726dqr.OLrzqt(contextRequireContext);
        if (Intrinsics.EZpvd((java.lang.Object) ((C9100bPH) c20142gbM.ejfBZ()).copydefault(i, false), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) strAYXKKw);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DTeKQX)), 0, strAYXKKw.length(), 17);
            spannedString = new android.text.SpannedString(spannableStringBuilder);
        } else {
            java.lang.String strCopydefault = ((C9100bPH) c20142gbM.ejfBZ()).copydefault(i, true);
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            spannableStringBuilder2.append((java.lang.CharSequence) strCopydefault);
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, strCopydefault.length(), 17);
            spannedString = new android.text.SpannedString(spannableStringBuilder2);
        }
        android.text.SpannedString spannedString2 = spannedString;
        java.lang.String strAYXKKw2 = stateListAnimatorCopydefault.AYXKKw();
        if (strAYXKKw2.length() == 0) {
            strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
        }
        android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
        spannableStringBuilder3.append((java.lang.CharSequence) strAYXKKw2);
        spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, strAYXKKw2.length(), 17);
        return new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, strEZpvd, null, drawableOLrzqt, null, spannedString2, new android.text.SpannedString(spannableStringBuilder3), false, null, C33070mpX.KWHzl(C52761wXj.TaskDescription.DPhTBN), null, 0, new Function0() { // from class: o.gbP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20142gbM.AYXKKw(this.KWHzl, i);
            }
        }, null, null, null, null, 1009838, null);
    }

    public static final Unit AYXKKw(C20142gbM c20142gbM, int i) {
        c20142gbM.EZpvd(i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction] */
    public final void EZpvd(int i) {
        C9694baS.Application application = C9694baS.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        ActivityC20262gda.TaskDescription taskDescription = ActivityC20262gda.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        application.KWHzl(childFragmentManager, ActivityC20262gda.TaskDescription.getIntent$default(taskDescription, contextRequireContext, ejfBZ(), i, null, false, 8, null), new Function2() { // from class: o.gbO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20142gbM.EZpvd(this.EZpvd, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final Unit EZpvd(C20142gbM c20142gbM, int i, android.content.Intent intent) {
        if (i == -1) {
            c20142gbM.QVAiDq();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<android.view.View> QUSxYX() {
        if (((C9100bPH) ejfBZ()).w_()) {
            return C59467zhb.zuBGHE(C59467zhb.wlaJM(C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(C56548yJl.AhwBna(0, ((C9100bPH) ejfBZ()).djBIcL())), new Function1() { // from class: o.gbN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20142gbM.KWHzl(this.OLrzqt, ((java.lang.Integer) obj).intValue());
                }
            })));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C57457yil KWHzl(C20142gbM c20142gbM, int i) {
        InterfaceC9730bbB.StateListAnimator stateListAnimatorCopydefault = ((C9100bPH) c20142gbM.ejfBZ()).copydefault(i);
        if (stateListAnimatorCopydefault == null) {
            return null;
        }
        android.content.Context contextRequireContext = c20142gbM.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        java.lang.String strAYXKKw = stateListAnimatorCopydefault.AYXKKw();
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
        if (strAYXKKw == null || strAYXKKw.length() == 0) {
            strAYXKKw = strAYXKKw2;
        }
        final java.lang.String strKWHzl = stateListAnimatorCopydefault.KWHzl();
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33069mpW.copydefault(C13754dXa.FragmentManager.sGvRiA, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strAYXKKw))), strKWHzl, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.gbQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20142gbM.KWHzl(c57457yil, strKWHzl);
            }
        }, (java.lang.String) null, false, (Function0) null, 460, (DefaultConstructorMarker) null));
        return c57457yil;
    }

    public static final Unit KWHzl(C57457yil c57457yil, java.lang.String str) {
        java.lang.Object systemService = c57457yil.getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57457yil.getContext());
        return Unit.INSTANCE;
    }
}
