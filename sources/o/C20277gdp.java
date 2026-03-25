package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.web3Uilib.bean.TransferAssetInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8601bFm;
import o.C13754dXa;
import o.C8475bDS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C20277gdp<T extends AbstractC8601bFm<?, ?>> extends C20150gbU<T> {
    public C57435yiP fARcdN;
    public final InterfaceC56387yDm zuBGHE = C56392yDr.copydefault(new Function0() { // from class: o.gdq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C20277gdp.EZpvd(this.copydefault);
        }
    });

    public final AbstractC17039evK QbewEr() {
        return (AbstractC17039evK) this.zuBGHE.getValue();
    }

    public static final AbstractC17039evK EZpvd(C20277gdp c20277gdp) {
        return AbstractC17039evK.KWHzl(c20277gdp.getLayoutInflater());
    }

    @Override // o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmTransfer;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        PlatformItem dapp = ejfBZ().OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        if (actionBar.OLrzqt(QUSxYX()) != null) {
            actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(djSkpj());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ejfBZ().RlQdEF())) {
            OLrzqt(ejfBZ().RlQdEF());
            actionBar.KWHzl(Unit.INSTANCE);
        }
    }

    public final android.view.View QUSxYX() {
        TransferAssetInfoBean transferAssetInfoBeanQVAiDq = QVAiDq();
        if (transferAssetInfoBeanQVAiDq == null) {
            return null;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57435yiP c57435yiP = new C57435yiP(contextRequireContext, null, 0, 6, null);
        this.fARcdN = c57435yiP;
        c57435yiP.setViewDataBean(transferAssetInfoBeanQVAiDq);
        return c57435yiP;
    }

    @Override // o.C20150gbU, o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        if (ejfBZ().QUSxYX() || this.fARcdN == null) {
            return;
        }
        ejfBZ().DarRvM().OLrzqt(new StateListAnimator(this));
    }

    /* JADX INFO: renamed from: o.gdp$StateListAnimator */
    public static final class StateListAnimator implements C8475bDS.ActionBar {
        public final /* synthetic */ C20277gdp<T> AEQbTJ;

        public StateListAnimator(C20277gdp<T> c20277gdp) {
            this.AEQbTJ = c20277gdp;
        }

        @Override // o.C8475bDS.ActionBar
        public void OLrzqt(java.util.List<WalletTickerManager.CoinPrice> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ.fFgQHt();
        }
    }

    public final void fFgQHt() {
        C57435yiP c57435yiP;
        TransferAssetInfoBean transferAssetInfoBeanQVAiDq = QVAiDq();
        if (transferAssetInfoBeanQVAiDq == null || (c57435yiP = this.fARcdN) == null) {
            return;
        }
        c57435yiP.setViewDataBean(transferAssetInfoBeanQVAiDq);
    }

    public final TransferAssetInfoBean QVAiDq() {
        java.util.List<AbstractC8601bFm<Fee, SignData>.Activity> listOLrzqt = ejfBZ().OLrzqt(true);
        AbstractC8601bFm.Activity activity = listOLrzqt != null ? (AbstractC8601bFm.Activity) CollectionsKt___CollectionsKt.firstOrNull(listOLrzqt) : null;
        if (activity != null) {
            return new TransferAssetInfoBean(null, null, 0, 0, activity.AEQbTJ(), activity.KWHzl(), null, activity.OLrzqt(), null, false, 847, null);
        }
        return null;
    }
}
