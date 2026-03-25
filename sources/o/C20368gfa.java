package o;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.api.model.tx.signdata.CeDefiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.web3Uilib.bean.TransactionNetworkFeeBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import com.okinc.web3Uilib.bean.TransferAssetInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gfa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20368gfa extends AbstractC20102gaZ<AbstractC8727bIF<?>> {
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<AbstractC8727bIF<?>>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.OLrzqt;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.TxConfirmTransfer;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.lang.String strKWHzl = cDNSourceManager.KWHzl(imageSource, contextRequireContext);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkZNMa);
        PlatformItem dapp = ((AbstractC8727bIF) ejfBZ()).OJuSTm().getDapp();
        java.lang.String urlOnlyHost = dapp != null ? dapp.getUrlOnlyHost() : null;
        actionBar.OLrzqt(AbstractC20102gaZ.titleInfoView$default(this, strKWHzl, strAYXKKw, null, urlOnlyHost == null ? "" : urlOnlyHost, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
        actionBar.OLrzqt(KWHzl());
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null));
        actionBar.OLrzqt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        actionBar.OLrzqt(AEQbTJ());
        actionBar.OLrzqt(copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final android.view.View KWHzl() {
        CeDefiTransferSignData ceDefiTransferSignData = (CeDefiTransferSignData) ((AbstractC8727bIF) ejfBZ()).QVsKAR();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57435yiP c57435yiP = new C57435yiP(contextRequireContext, null, 0, 6, null);
        c57435yiP.setViewDataBean(new TransferAssetInfoBean(null, null, 0, 2, C54870xYj.EZpvd(ceDefiTransferSignData.getTokenAmount(), ceDefiTransferSignData.getDecimalNum(), ceDefiTransferSignData.getDisplayPrecision(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), ceDefiTransferSignData.getSymbol(), "", ((AbstractC8727bIF) ejfBZ()).OLrzqt(ceDefiTransferSignData.getUsdValue(), true), "", false, 7, null));
        return c57435yiP;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final C57429yiJ AEQbTJ() {
        java.lang.String str;
        java.lang.String strEZpvd;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57429yiJ c57429yiJ = new C57429yiJ(contextRequireContext, null, 0, 6, null);
        c57429yiJ.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        AbstractC8744bIW abstractC8744bIW = (AbstractC8744bIW) ((AbstractC8727bIF) ejfBZ()).QKudOq();
        if (((AbstractC8727bIF) ejfBZ()).UlJrfe().copydefault(C56524yIo.AEQbTJ(C9868bdh.class))) {
            c57429yiJ.setViewDataBean(new TransactionNetworkFeeBean(null, null, C33069mpW.copydefault(C13754dXa.FragmentManager.bypassDispatchKeyEvent, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", ((AbstractC8727bIF) ejfBZ()).dHguZz().djBIcL()))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCreateActionMode), null, null, null, null, null, null, false, null, null, 8179, null));
        } else {
            java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.bypassDispatchKeyEvent, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", ((AbstractC8727bIF) ejfBZ()).dHguZz().djBIcL())));
            if (abstractC8744bIW.fJNWhG()) {
                strEZpvd = "";
            } else {
                java.lang.String feeAmount = abstractC8744bIW.KWHzl().getFeeAmount();
                pTF ptf = pTF.KWHzl;
                java.lang.String toFeeCoinAmount$default = AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8744bIW, feeAmount, false, false, true, 6, null);
                java.lang.String toFeeCurrencyAmount$default = AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8744bIW, feeAmount, false, false, false, 14, null);
                if (toFeeCurrencyAmount$default.length() > 0) {
                    str = " " + toFeeCurrencyAmount$default;
                } else {
                    str = "";
                }
                strEZpvd = ptf.EZpvd(toFeeCoinAmount$default + ((java.lang.Object) str));
            }
            c57429yiJ.setViewDataBean(new TransactionNetworkFeeBean(null, null, strCopydefault, "", strEZpvd, "", null, null, null, null, false, "", abstractC8744bIW.fJNWhG() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta_densityDpi) : "", 1475, null));
        }
        return c57429yiJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    private final android.view.View copydefault() {
        return AbstractC20102gaZ.addressView$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.generateConfigDelta_locale), ((AbstractC8727bIF) ejfBZ()).zLjUOn(), null, null, ((CeDefiTransferSignData) ((AbstractC8727bIF) ejfBZ()).QVsKAR()).getDisplayName(), null, true, null, false, null, 940, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r15v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r15v13, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        if (Intrinsics.EZpvd(abstractC9832bcy, C9863bdc.EZpvd) || abstractC9832bcy == null) {
            KWHzl((TransactionTopReminderInfoBean) null);
            return;
        }
        if (abstractC9832bcy instanceof C9784bcC) {
            final AbstractC8744bIW abstractC8744bIW = (AbstractC8744bIW) ((AbstractC8727bIF) ejfBZ()).QKudOq();
            final C10854bwM c10854bwMAYXKKw = abstractC8744bIW.AYXKKw();
            final java.lang.String strFJNWhG = c10854bwMAYXKKw.fJNWhG();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33069mpW.copydefault(C13754dXa.FragmentManager.onFitSystemWindows, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strFJNWhG))), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strFJNWhG))), new Function0() { // from class: o.geZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20368gfa.OLrzqt(this.AEQbTJ, abstractC8744bIW, strFJNWhG, c10854bwMAYXKKw);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9808bca) {
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQMcgE), C33069mpW.copydefault(C13754dXa.FragmentManager.fcfzuX, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", ((CeDefiTransferSignData) ((AbstractC8727bIF) ejfBZ()).QVsKAR()).getSymbol()))), new Function0() { // from class: o.geY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C20368gfa.EZpvd(this.copydefault);
                }
            }, (java.lang.CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
        } else if (abstractC9832bcy instanceof C9868bdh) {
            java.lang.String strAEQbTJ = ((C9868bdh) abstractC9832bcy).AEQbTJ();
            KWHzl(new TransactionTopReminderInfoBean((java.lang.String) null, strAEQbTJ == null ? "" : strAEQbTJ, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C20368gfa c20368gfa, AbstractC8744bIW abstractC8744bIW, java.lang.String str, C10854bwM c10854bwM) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        CeDefiTransferSignData ceDefiTransferSignData = (CeDefiTransferSignData) ((AbstractC8727bIF) c20368gfa.ejfBZ()).QVsKAR();
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.OLrzqt(!abstractC8744bIW.DbNXlk(), ((AbstractC8727bIF) c20368gfa.ejfBZ()).dHguZz().fetchVPNInfo(), ceDefiTransferSignData.getFromAddress(), ceDefiTransferSignData.getTokenAddress(), str, c10854bwM.DbNXlk()));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(c20368gfa.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C20368gfa c20368gfa) {
        DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
        CeDefiTransferSignData ceDefiTransferSignData = (CeDefiTransferSignData) ((AbstractC8727bIF) c20368gfa.ejfBZ()).QVsKAR();
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(ViewOnClickListenerC20995grR.Companion.OLrzqt(ceDefiTransferSignData.isToken(), ((AbstractC8727bIF) c20368gfa.ejfBZ()).dHguZz().fetchVPNInfo(), ceDefiTransferSignData.getFromAddress(), ceDefiTransferSignData.getTokenAddress(), ceDefiTransferSignData.getSymbol(), ceDefiTransferSignData.getImgUrl()));
        dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(c20368gfa.getChildFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        C55326xho.toastWithSuccessfulIcon$default(C13754dXa.FragmentManager.QOjuYg, 0, 1, (java.lang.Object) null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }
}
