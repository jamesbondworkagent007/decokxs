package o;

import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC9737bbI;
import o.iVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iWd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24134iWd {
    public final InterfaceC23916iOb KWHzl;

    @yCM
    public C24134iWd(@NotNull InterfaceC23916iOb interfaceC23916iOb) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        this.KWHzl = interfaceC23916iOb;
    }

    public final java.util.List<iVX> KWHzl(@NotNull InvestOrderDetailsInfoVo investOrderDetailsInfoVo) {
        java.lang.String tipContent;
        Intrinsics.checkNotNullParameter(investOrderDetailsInfoVo, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        InvestTipInfoVo topBannerTip = investOrderDetailsInfoVo.getTopBannerTip();
        boolean z = false;
        if (topBannerTip != null && (tipContent = topBannerTip.getTipContent()) != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tipContent)) {
            listOLrzqt.add(new iVX.AssistContent(tipContent));
            listOLrzqt.add(new iVX.Activity(0, 0));
        }
        java.util.List<InvestOrderDetailsInfoVo.InvestTxInfo> investTxData = investOrderDetailsInfoVo.getInvestTxData();
        if (investTxData != null && !investTxData.isEmpty()) {
            java.util.List<InvestOrderDetailsInfoVo.InvestTxInfo> investTxData2 = investOrderDetailsInfoVo.getInvestTxData();
            java.lang.Integer orderStatus = investOrderDetailsInfoVo.getOrderStatus();
            if (orderStatus != null && orderStatus.intValue() == 2) {
                z = true;
            }
            listOLrzqt.addAll(EZpvd(investTxData2, z));
        }
        java.util.List<java.util.List<InvestOrderDetailsInfoVo.InvestLineInfo>> lineInfos = investOrderDetailsInfoVo.getLineInfos();
        if (lineInfos != null && !lineInfos.isEmpty()) {
            listOLrzqt.addAll(KWHzl(investOrderDetailsInfoVo.getLineInfos(), investOrderDetailsInfoVo.getChainId()));
        }
        listOLrzqt.addAll(OLrzqt(investOrderDetailsInfoVo.getExplorerUrl(), investOrderDetailsInfoVo.getViewInWallet()));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final java.util.List<iVX> EZpvd(java.util.List<InvestOrderDetailsInfoVo.InvestTxInfo> list, boolean z) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.util.Iterator<InvestOrderDetailsInfoVo.InvestTxInfo> it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            InvestOrderDetailsInfoVo.InvestTxInfo next = it.next();
            java.lang.String title = next.getTitle();
            if (title != null && title.length() != 0) {
                listOLrzqt.add(new iVX.Dialog(next.getTitle(), next.getTitleTip()));
            }
            if (next.getInvestmentInfo() != null) {
                listOLrzqt.add(new iVX.Application(next.getInvestmentInfo(), next.getRightCoinInfo()));
                java.util.List<InvestOrderDetailsInfoVo.InvestCoinInfo> investTokenInfo = next.getInvestTokenInfo();
                if (investTokenInfo != null && !investTokenInfo.isEmpty()) {
                    java.util.Iterator<InvestOrderDetailsInfoVo.InvestCoinInfo> it2 = next.getInvestTokenInfo().iterator();
                    while (it2.hasNext()) {
                        listOLrzqt.add(new iVX.TaskDescription(it2.next()));
                    }
                }
            } else {
                java.util.List<InvestOrderDetailsInfoVo.InvestCoinInfo> investTokenInfo2 = next.getInvestTokenInfo();
                if (investTokenInfo2 != null && !investTokenInfo2.isEmpty()) {
                    for (java.lang.Object obj : next.getInvestTokenInfo()) {
                        if (i < 0) {
                            yDY.AYXKKw();
                        }
                        InvestOrderDetailsInfoVo.InvestCoinInfo investCoinInfo = (InvestOrderDetailsInfoVo.InvestCoinInfo) obj;
                        if (i != 0) {
                            listOLrzqt.add(iVX.FragmentManager.EZpvd);
                        }
                        listOLrzqt.add(new iVX.StateListAnimator(investCoinInfo, z));
                        i++;
                    }
                }
            }
        }
        if (!listOLrzqt.isEmpty()) {
            listOLrzqt.add(new iVX.Activity(0, 0, 2, null));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final java.util.List<iVX> KWHzl(java.util.List<? extends java.util.List<InvestOrderDetailsInfoVo.InvestLineInfo>> list, java.lang.Long l) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.util.Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.util.List listDjBIcL = (java.util.List) it.next();
            if (!listDjBIcL.isEmpty()) {
                if (i == 0 && (!listDjBIcL.isEmpty()) && l != null) {
                    InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo = (InvestOrderDetailsInfoVo.InvestLineInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(listDjBIcL);
                    java.lang.String strAEQbTJ = AEQbTJ(investLineInfo.getValue(), l.longValue());
                    listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(InvestOrderDetailsInfoVo.InvestLineInfo.copy$default(investLineInfo, strAEQbTJ, null, null, null, null, strAEQbTJ, 30, null)), (java.lang.Iterable) CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listDjBIcL, 1));
                }
                if (listDjBIcL.size() == 1) {
                    listOLrzqt.add(new iVX.LoaderManager((InvestOrderDetailsInfoVo.InvestLineInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(listDjBIcL), listOLrzqt.isEmpty() ? 18 : 24));
                } else {
                    listOLrzqt.add(new iVX.Activity(0, 0, 3, null));
                    listOLrzqt.add(new iVX.PendingIntent((InvestOrderDetailsInfoVo.InvestLineInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(listDjBIcL), (InvestOrderDetailsInfoVo.InvestLineInfo) CollectionsKt___CollectionsKt.AkhnZx(listDjBIcL, 1)));
                }
            }
            i++;
        }
        if (!listOLrzqt.isEmpty()) {
            listOLrzqt.add(new iVX.Activity(0, 0, 3, null));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, long j) {
        InterfaceC9731bbC chainMetaWithRealChainId$default;
        return (str == null || str.length() == 0 || (chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(this.KWHzl.copydefault(), j, false, 2, null)) == null) ? str : chainMetaWithRealChainId$default.KWHzl(str);
    }

    public final java.util.List<iVX.ActionBar> OLrzqt(java.lang.String str, InvestOrderDetailsInfoVo.InvestViewInWallet investViewInWallet) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (str != null && str.length() != 0) {
            listOLrzqt.add(new iVX.VoiceInteractor(str, listOLrzqt.isEmpty() ? 24 : 16));
        }
        if (investViewInWallet != null && Intrinsics.EZpvd(investViewInWallet.isShow(), java.lang.Boolean.TRUE) && investViewInWallet.getAnalysisPlatformId() != null && investViewInWallet.getChainId() != null) {
            listOLrzqt.add(new iVX.Fragment(investViewInWallet.getAnalysisPlatformId().longValue(), investViewInWallet.getChainId().longValue(), listOLrzqt.isEmpty() ? 24 : 16));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }
}
