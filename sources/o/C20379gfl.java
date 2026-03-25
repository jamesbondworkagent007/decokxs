package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gfl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20379gfl extends C20446ggz<C8851bKX> {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.gfl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gfl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C20379gfl KWHzl(android.os.Bundle bundle) {
            C20379gfl c20379gfl = new C20379gfl();
            c20379gfl.setArguments(bundle);
            return c20379gfl;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20446ggz, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C8851bKX>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmTransfer;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        PlatformItem dapp = ((C8851bKX) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        actionBar.OLrzqt(fFgQHt());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.onPrepareActionMode), null, 2, null));
        actionBar.OLrzqt(gasjUx());
        actionBar.OLrzqt(QbewEr());
        actionBar.OLrzqt(fZBcTu());
        actionBar.OLrzqt(QUSxYX());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final android.view.View QbewEr() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57471yiz c57471yiz = new C57471yiz(contextRequireContext, null, 0, 6, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregister);
        java.lang.String strDjBIcL = ((C8851bKX) ejfBZ()).dHguZz().djBIcL();
        java.lang.String strAYXKKw2 = ((C8851bKX) ejfBZ()).dHguZz().AYXKKw();
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        android.content.Context context = c57471yiz.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c57471yiz.setViewDataBean(new TransactionGeneralInfoBean(strAYXKKw, false, strDjBIcL, null, null, strAYXKKw2, c14726dqr.OLrzqt(context), null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524186, null));
        return c57471yiz;
    }
}
