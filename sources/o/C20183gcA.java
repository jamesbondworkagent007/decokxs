package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20183gcA extends C20150gbU<AbstractC8601bFm<?, ?>> {
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<AbstractC8601bFm<?, ?>>.ActionBar actionBar, boolean z) {
        ExposureInfo exposureInfo;
        java.lang.String urlOnlyHost;
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmApprove;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        int i = C13754dXa.FragmentManager.GVpNrsfQMcgE;
        java.lang.String strWlaJM = ((AbstractC8601bFm) ejfBZ()).wlaJM();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl);
        if (strWlaJM == null || strWlaJM.length() == 0) {
            strWlaJM = strAYXKKw;
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("dappname", strWlaJM)));
        PlatformItem dapp = ((AbstractC8601bFm) ejfBZ()).OJuSTm().getDapp();
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strCopydefault, null, (dapp == null || (urlOnlyHost = dapp.getUrlOnlyHost()) == null) ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        actionBar.OLrzqt(RcXXUw());
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(EZpvd());
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ((AbstractC8601bFm) ejfBZ()).ab_();
        java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAb_ != null ? kYSPreTxCheckInfoAb_.getExposures() : null;
        actionBar.OLrzqt(copydefault((exposures == null || (exposureInfo = (ExposureInfo) CollectionsKt___CollectionsKt.firstOrNull(exposures)) == null) ? null : exposureInfo.getSpenderKey()));
        actionBar.OLrzqt(AbstractC20102gaZ.walletUsedView$default(this, null, null, 3, null));
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gcz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20183gcA.AEQbTJ(this.EZpvd, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    public static final Unit AEQbTJ(C20183gcA c20183gcA, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.EZpvd(c20183gcA.dvKsVJ());
        c20183gcA.valueOf(actionBar);
        Unit unit = Unit.INSTANCE;
        actionBar.KWHzl(unit);
        return unit;
    }

    @Override // o.C20150gbU, o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        iwGUEr();
    }
}
