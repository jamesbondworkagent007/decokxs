package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ext.UpDownColor;
import com.okinc.market.ranking.core.engine.domain.GetRankTabConfigUseCase$onExecute$1;
import com.okinc.market.ranking.core.model.RankingTabPo;
import com.okinc.market.ranking.core.model.RankingTabsVo;
import com.okinc.market.ranking.core.model.po.RankingTabsPo;
import com.okinc.market.ranking.core.model.po.TabsItemVo;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41621quK extends AbstractC49400uno<C41622quL, RankingTabsPo> {
    public final CoroutineDispatcher EZpvd;
    public final C41662quz KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C41622quL) obj, (Continuation<? super RankingTabsPo>) continuation);
    }

    @yCM
    public C41621quK(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c41662quz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C41622quL c41622quL, @NotNull Continuation<? super RankingTabsPo> continuation) throws java.lang.Throwable {
        GetRankTabConfigUseCase$onExecute$1 getRankTabConfigUseCase$onExecute$1;
        C41621quK c41621quK;
        RankingTabsPo rankingTabsPoKWHzl;
        if (continuation instanceof GetRankTabConfigUseCase$onExecute$1) {
            getRankTabConfigUseCase$onExecute$1 = (GetRankTabConfigUseCase$onExecute$1) continuation;
            int i = getRankTabConfigUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRankTabConfigUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getRankTabConfigUseCase$onExecute$1 = new GetRankTabConfigUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = getRankTabConfigUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRankTabConfigUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objDjBIcL);
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", c41622quL.copydefault()), C56390yDp.OLrzqt("zone", c41622quL.gEmmrt()));
            C41662quz c41662quz = this.KWHzl;
            getRankTabConfigUseCase$onExecute$1.L$0 = this;
            getRankTabConfigUseCase$onExecute$1.label = 1;
            objDjBIcL = c41662quz.djBIcL(mapGEmmrt, getRankTabConfigUseCase$onExecute$1);
            if (objDjBIcL == objCopydefault) {
                return objCopydefault;
            }
            c41621quK = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41621quK = (C41621quK) getRankTabConfigUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objDjBIcL);
        }
        RankingTabsVo rankingTabsVo = (RankingTabsVo) objDjBIcL;
        return (rankingTabsVo == null || (rankingTabsPoKWHzl = c41621quK.KWHzl(rankingTabsVo)) == null) ? new RankingTabsPo(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : rankingTabsPoKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RankingTabsPo KWHzl(RankingTabsVo rankingTabsVo) {
        UpDownColor upDownColorAEQbTJ;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String turnOver;
        java.lang.String changePer;
        UpDownColor upDownColorAEQbTJ2;
        java.lang.String changePer2;
        BigDecimal bigDecimalEZpvd;
        java.lang.String iCUPercent$default;
        java.lang.String changePer3;
        UpDownColor upDownColorAEQbTJ3;
        java.lang.String changePer4;
        BigDecimal bigDecimalEZpvd2;
        java.lang.String iCUPercent$default2;
        java.lang.String searchCount;
        java.lang.String strOLrzqt;
        java.lang.String onlineTs;
        java.lang.String sellerCount;
        java.lang.String strOLrzqt2;
        java.lang.String buyerCount;
        java.lang.String strOLrzqt3;
        java.lang.String marketCap;
        java.lang.String changePer5;
        java.lang.String changePer6;
        BigDecimal bigDecimalEZpvd3;
        java.lang.String iCUPercent$default3;
        RankingTabPo hotRank = rankingTabsVo.getHotRank();
        java.lang.String icon = hotRank != null ? hotRank.getIcon() : null;
        java.lang.String str4 = icon == null ? "" : icon;
        RankingTabPo hotRank2 = rankingTabsVo.getHotRank();
        java.lang.String str5 = (hotRank2 == null || (changePer6 = hotRank2.getChangePer()) == null || (bigDecimalEZpvd3 = C33129mqd.EZpvd(changePer6)) == null || (iCUPercent$default3 = pTB.formatICUPercent$default(bigDecimalEZpvd3, null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null)) == null) ? "--" : iCUPercent$default3;
        RankingTabPo hotRank3 = rankingTabsVo.getHotRank();
        if (hotRank3 == null || (changePer5 = hotRank3.getChangePer()) == null || (upDownColorAEQbTJ = UpDownColor.Companion.AEQbTJ(changePer5)) == null) {
            upDownColorAEQbTJ = UpDownColor.NEUTRAL;
        }
        TabsItemVo tabsItemVo = new TabsItemVo(str5, str4, null, null, upDownColorAEQbTJ, 12, null);
        RankingTabPo marketCapRank = rankingTabsVo.getMarketCapRank();
        java.lang.String icon2 = marketCapRank != null ? marketCapRank.getIcon() : null;
        java.lang.String str6 = icon2 == null ? "" : icon2;
        RankingTabPo marketCapRank2 = rankingTabsVo.getMarketCapRank();
        java.lang.String str7 = (marketCapRank2 == null || (marketCap = marketCapRank2.getMarketCap()) == null) ? "" : marketCap;
        UpDownColor upDownColor = UpDownColor.NEUTRAL;
        RankingTabPo marketCapRank3 = rankingTabsVo.getMarketCapRank();
        java.lang.String ccy = marketCapRank3 != null ? marketCapRank3.getCcy() : null;
        java.lang.String str8 = ccy == null ? "" : ccy;
        RankingTabPo marketCapRank4 = rankingTabsVo.getMarketCapRank();
        java.lang.String instId = marketCapRank4 != null ? marketCapRank4.getInstId() : null;
        if (instId == null) {
            instId = "";
        }
        TabsItemVo tabsItemVo2 = new TabsItemVo(str7, str6, str8, C41786qxQ.KWHzl(instId), upDownColor);
        RankingTabPo mostBuyers = rankingTabsVo.getMostBuyers();
        java.lang.String icon3 = mostBuyers != null ? mostBuyers.getIcon() : null;
        java.lang.String str9 = icon3 == null ? "" : icon3;
        RankingTabPo mostBuyers2 = rankingTabsVo.getMostBuyers();
        if (mostBuyers2 == null || (buyerCount = mostBuyers2.getBuyerCount()) == null) {
            str = "--";
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) buyerCount)) {
                buyerCount = null;
            }
            if (buyerCount != null && (strOLrzqt3 = C33069mpW.OLrzqt(C33070mpX.AYXKKw(qZH.PendingIntent.scanPackages), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatICUCompact$default(C33129mqd.EZpvd(buyerCount), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null))))) != null) {
                str = strOLrzqt3;
            }
        }
        TabsItemVo tabsItemVo3 = new TabsItemVo(str, str9, null, null, upDownColor, 12, null);
        RankingTabPo mostSellers = rankingTabsVo.getMostSellers();
        java.lang.String icon4 = mostSellers != null ? mostSellers.getIcon() : null;
        java.lang.String str10 = icon4 == null ? "" : icon4;
        RankingTabPo mostSellers2 = rankingTabsVo.getMostSellers();
        if (mostSellers2 == null || (sellerCount = mostSellers2.getSellerCount()) == null) {
            str2 = "--";
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) sellerCount)) {
                sellerCount = null;
            }
            if (sellerCount != null && (strOLrzqt2 = C33069mpW.OLrzqt(C33070mpX.AYXKKw(qZH.PendingIntent.DcMfJKDCKfqPDCfLja), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatICUCompact$default(C33129mqd.EZpvd(sellerCount), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null))))) != null) {
                str2 = strOLrzqt2;
            }
        }
        TabsItemVo tabsItemVo4 = new TabsItemVo(str2, str10, null, null, upDownColor, 12, null);
        RankingTabPo newCoinRank = rankingTabsVo.getNewCoinRank();
        java.lang.String icon5 = newCoinRank != null ? newCoinRank.getIcon() : null;
        java.lang.String str11 = icon5 == null ? "" : icon5;
        RankingTabPo newCoinRank2 = rankingTabsVo.getNewCoinRank();
        TabsItemVo tabsItemVo5 = new TabsItemVo((newCoinRank2 == null || (onlineTs = newCoinRank2.getOnlineTs()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) onlineTs)) ? "--" : pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(rankingTabsVo.getNewCoinRank().getOnlineTs())), null, 1, null), str11, null, null, upDownColor, 12, null);
        RankingTabPo popularSearches = rankingTabsVo.getPopularSearches();
        java.lang.String icon6 = popularSearches != null ? popularSearches.getIcon() : null;
        java.lang.String str12 = icon6 == null ? "" : icon6;
        RankingTabPo popularSearches2 = rankingTabsVo.getPopularSearches();
        if (popularSearches2 == null || (searchCount = popularSearches2.getSearchCount()) == null) {
            str3 = "--";
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) searchCount)) {
                searchCount = null;
            }
            if (searchCount != null && (strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(qZH.PendingIntent.siEkQe), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatICUCompact$default(C33129mqd.EZpvd(searchCount), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null))))) != null) {
                str3 = strOLrzqt;
            }
        }
        TabsItemVo tabsItemVo6 = new TabsItemVo(str3, str12, null, null, upDownColor, 12, null);
        RankingTabPo topGainers = rankingTabsVo.getTopGainers();
        java.lang.String icon7 = topGainers != null ? topGainers.getIcon() : null;
        java.lang.String str13 = icon7 == null ? "" : icon7;
        RankingTabPo topGainers2 = rankingTabsVo.getTopGainers();
        java.lang.String str14 = (topGainers2 == null || (changePer4 = topGainers2.getChangePer()) == null || (bigDecimalEZpvd2 = C33129mqd.EZpvd(changePer4)) == null || (iCUPercent$default2 = pTB.formatICUPercent$default(bigDecimalEZpvd2, null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null)) == null) ? "--" : iCUPercent$default2;
        RankingTabPo topGainers3 = rankingTabsVo.getTopGainers();
        TabsItemVo tabsItemVo7 = new TabsItemVo(str14, str13, null, null, (topGainers3 == null || (changePer3 = topGainers3.getChangePer()) == null || (upDownColorAEQbTJ3 = UpDownColor.Companion.AEQbTJ(changePer3)) == null) ? upDownColor : upDownColorAEQbTJ3, 12, null);
        RankingTabPo topLosers = rankingTabsVo.getTopLosers();
        java.lang.String icon8 = topLosers != null ? topLosers.getIcon() : null;
        java.lang.String str15 = icon8 == null ? "" : icon8;
        RankingTabPo topLosers2 = rankingTabsVo.getTopLosers();
        java.lang.String str16 = (topLosers2 == null || (changePer2 = topLosers2.getChangePer()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(changePer2)) == null || (iCUPercent$default = pTB.formatICUPercent$default(bigDecimalEZpvd, null, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 19, null)) == null) ? "--" : iCUPercent$default;
        RankingTabPo topLosers3 = rankingTabsVo.getTopLosers();
        TabsItemVo tabsItemVo8 = new TabsItemVo(str16, str15, null, null, (topLosers3 == null || (changePer = topLosers3.getChangePer()) == null || (upDownColorAEQbTJ2 = UpDownColor.Companion.AEQbTJ(changePer)) == null) ? upDownColor : upDownColorAEQbTJ2, 12, null);
        RankingTabPo turnOverRank = rankingTabsVo.getTurnOverRank();
        java.lang.String icon9 = turnOverRank != null ? turnOverRank.getIcon() : null;
        java.lang.String str17 = icon9 == null ? "" : icon9;
        RankingTabPo turnOverRank2 = rankingTabsVo.getTurnOverRank();
        java.lang.String str18 = (turnOverRank2 == null || (turnOver = turnOverRank2.getTurnOver()) == null) ? "" : turnOver;
        RankingTabPo turnOverRank3 = rankingTabsVo.getTurnOverRank();
        java.lang.String ccy2 = turnOverRank3 != null ? turnOverRank3.getCcy() : null;
        java.lang.String str19 = ccy2 == null ? "" : ccy2;
        RankingTabPo turnOverRank4 = rankingTabsVo.getTurnOverRank();
        java.lang.String instId2 = turnOverRank4 != null ? turnOverRank4.getInstId() : null;
        return new RankingTabsPo(tabsItemVo, tabsItemVo2, tabsItemVo3, tabsItemVo4, tabsItemVo5, tabsItemVo6, tabsItemVo7, tabsItemVo8, new TabsItemVo(str18, str17, str19, C41786qxQ.KWHzl(instId2 != null ? instId2 : ""), upDownColor));
    }
}
