package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.AbstractC8601bFm;
import o.C13754dXa;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20207gcY<T extends AbstractC8601bFm<?, ?> & InterfaceC9730bbB> extends C20150gbU<T> {
    @Override // o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        java.lang.String urlOnlyHost;
        Intrinsics.checkNotNullParameter(actionBar, "");
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = ejfBZ().EZpvd();
        if (stateListAnimatorEZpvd == null) {
            return;
        }
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmCancelApprove;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        int i = C13754dXa.FragmentManager.fXG;
        java.lang.String strWlaJM = ((AbstractC8601bFm) ejfBZ()).wlaJM();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
        if (strWlaJM == null || strWlaJM.length() == 0) {
            strWlaJM = strAYXKKw;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("dapp", strWlaJM)));
        PlatformItem dapp = ((AbstractC8601bFm) ejfBZ()).OJuSTm().getDapp();
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strCopydefault, null, (dapp == null || (urlOnlyHost = dapp.getUrlOnlyHost()) == null) ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver2Default);
        java.lang.String strEZpvd = stateListAnimatorEZpvd.EZpvd();
        java.lang.String strAYXKKw3 = stateListAnimatorEZpvd.AYXKKw();
        if (strAYXKKw3.length() == 0) {
            strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
        }
        actionBar.OLrzqt(OLrzqt(strAYXKKw2, "", null, null, strEZpvd, strAYXKKw3));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(QbewEr());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gcW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20207gcY.AEQbTJ(this.KWHzl, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    public static final Unit AEQbTJ(C20207gcY c20207gcY, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.OLrzqt(c20207gcY.QVAiDq());
        c20207gcY.valueOf(actionBar);
        Unit unit = Unit.INSTANCE;
        actionBar.KWHzl(unit);
        return unit;
    }

    public final android.view.View QbewEr() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        final java.lang.String strOLrzqt = ejfBZ().OLrzqt();
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dESsmu), strOLrzqt, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.gcV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20207gcY.AhwBna(c57457yil, strOLrzqt);
            }
        }, (java.lang.String) null, false, (Function0) null, 460, (DefaultConstructorMarker) null));
        return c57457yil;
    }

    public static final Unit AhwBna(C57457yil c57457yil, java.lang.String str) {
        java.lang.Object systemService = c57457yil.getContext().getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return Unit.INSTANCE;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), str).KWHzl(c57457yil.getContext());
        return Unit.INSTANCE;
    }

    private final android.view.View QVAiDq() {
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = ejfBZ().EZpvd();
        if (stateListAnimatorEZpvd == null) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final C57457yil c57457yil = new C57457yil(contextRequireContext, null, 0, 6, null);
        java.lang.String strAYXKKw = stateListAnimatorEZpvd.AYXKKw();
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
        if (strAYXKKw == null || strAYXKKw.length() == 0) {
            strAYXKKw = strAYXKKw2;
        }
        final java.lang.String strKWHzl = stateListAnimatorEZpvd.KWHzl();
        c57457yil.setViewDataBean(new TransactionAddressInfoBean(C33069mpW.copydefault(C13754dXa.FragmentManager.sGvRiA, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strAYXKKw))), strKWHzl, (java.lang.String) null, (java.lang.String) null, true, new Function0() { // from class: o.gcX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20207gcY.AYXKKw(c57457yil, strKWHzl);
            }
        }, (java.lang.String) null, false, (Function0) null, 460, (DefaultConstructorMarker) null));
        return c57457yil;
    }

    public static final Unit AYXKKw(C57457yil c57457yil, java.lang.String str) {
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
