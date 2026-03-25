package o;

import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20299geK extends C20290geB<C11999cef> {
    public int copydefault;
    public C57431yiL fARcdN;

    /* JADX DEBUG: Multi-variable search result rejected for r15v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20290geB, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C11999cef>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmSignMessage;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strGEmmrt = ((C11999cef) ejfBZ()).gEmmrt();
        this.fARcdN = AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, (strGEmmrt == null || strGEmmrt.length() == 0) ? AhwBna() : strGEmmrt, null, "", null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        android.view.View viewQbewEr = QbewEr();
        actionBar.OLrzqt(this.fARcdN);
        actionBar.OLrzqt(viewQbewEr);
        if (viewQbewEr != null) {
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(djBIcL());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(copydefault());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((C11999cef) ejfBZ()).AEQbTJ(true))) {
            final java.lang.String strAEQbTJ = ((C11999cef) ejfBZ()).AEQbTJ(true);
            actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.geH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20299geK.copydefault(this.OLrzqt, strAEQbTJ, (AbstractC20082gaF.ActionBar) obj);
                }
            }, 3, null));
        }
    }

    public static final Unit copydefault(C20299geK c20299geK, java.lang.String str, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(c20299geK, null, str, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final android.view.View copydefault() throws java.io.IOException {
        java.util.HashSet<java.lang.String> hashSetAhwBna = ((C11999cef) ejfBZ()).AhwBna();
        if (hashSetAhwBna == null || hashSetAhwBna.isEmpty()) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57453yih c57453yih = new C57453yih(contextRequireContext, null, 0, 6, null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i = 0;
        for (java.lang.Object obj : hashSetAhwBna) {
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
            if (i != hashSetAhwBna.size() - 1) {
                spannableStringBuilder.append('\n');
            }
            c57453yih.setContentInfo(spannableStringBuilder);
            c57453yih.setHeaderTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.startAsSupportActionMode));
            i = i2;
        }
        return c57453yih;
    }

    @Override // o.C20290geB, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if (abstractC9832bcy instanceof C9837bdC) {
            KWHzl(collection);
            C57431yiL c57431yiL = this.fARcdN;
            if (c57431yiL != null) {
                c57431yiL.setHeaderTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.closeSocket));
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9838bdD) {
            KWHzl(collection);
            C57431yiL c57431yiL2 = this.fARcdN;
            if (c57431yiL2 != null) {
                c57431yiL2.setHeaderTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onProvideKeyboardShortcuts));
            }
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, ((C9838bdD) abstractC9832bcy).copydefault(), (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            return;
        }
        C57431yiL c57431yiL3 = this.fARcdN;
        if (c57431yiL3 != null) {
            c57431yiL3.setHeaderTitleInfo(C33070mpX.AYXKKw(C13754dXa.FragmentManager.closeSocket));
        }
        super.copydefault(collection);
    }

    public final void KWHzl(java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (obj instanceof C9839bdE) {
                arrayList.add(obj);
            }
        }
        C9839bdE c9839bdE = (C9839bdE) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c9839bdE == null || !C33129mqd.valueOf(java.lang.Integer.valueOf(this.copydefault), 0)) {
            return;
        }
        C17944fYb c17944fYb = C17944fYb.AEQbTJ;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        int i = C13754dXa.ActionBar.DfrfUJ;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt);
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            return;
        }
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        C17944fYb.showSafeRiskTipProcess$default(c17944fYb, activity, parentFragmentManager, i, new RiskPageInfoBean(strAYXKKw, c14128dfc.copydefault(activity2, resources, C13754dXa.FragmentManager.onLayoutChange, "case", (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : c9839bdE), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKt), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRemoteControlClient), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), null, false, 1540, null), c9839bdE, null, 32, null);
        this.copydefault++;
    }
}
