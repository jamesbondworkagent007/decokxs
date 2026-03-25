package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34945nly extends AbstractC49400uno<java.util.List<? extends TradingCalendarPo>, java.util.List<? extends MarketDiscoverOverviewTradeCalendarVo>> {
    public final InterfaceC56387yDm AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.util.List<TradingCalendarPo>) obj, (Continuation<? super java.util.List<MarketDiscoverOverviewTradeCalendarVo>>) continuation);
    }

    @yCM
    public C34945nly(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nlx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34945nly.OLrzqt();
            }
        });
    }

    private final C54536xML copydefault() {
        return (C54536xML) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C54536xML OLrzqt() {
        return new C54536xML();
    }

    public java.lang.Object KWHzl(java.util.List<TradingCalendarPo> list, @NotNull Continuation<? super java.util.List<MarketDiscoverOverviewTradeCalendarVo>> continuation) {
        java.lang.String strCopydefault;
        if (list == null || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char c = 0;
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            TradingCalendarPo tradingCalendarPo = (TradingCalendarPo) obj;
            java.lang.String type = tradingCalendarPo.getType();
            TradingCalendarType tradingCalendarType = TradingCalendarType.ECONOMIC;
            strCopydefault = "--";
            if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) tradingCalendarType.getRequestValue())) {
                if (tradingCalendarPo.getEconomicData() != null && C33129mqd.OLrzqt((java.lang.CharSequence) tradingCalendarPo.getEconomicData().valueOf())) {
                    C40888qgT economicData = tradingCalendarPo.getEconomicData();
                    java.lang.String requestValue = tradingCalendarType.getRequestValue();
                    java.lang.String strAEQbTJ = economicData.AEQbTJ();
                    java.lang.String str = strAEQbTJ == null ? "" : strAEQbTJ;
                    java.lang.String strEZpvd = economicData.EZpvd();
                    java.lang.String str2 = strEZpvd == null ? "--" : strEZpvd;
                    java.lang.String strValueOf = economicData.valueOf();
                    java.lang.String str3 = strValueOf == null ? "" : strValueOf;
                    java.lang.String strEZpvd2 = EZpvd(economicData.OLrzqt());
                    java.lang.String strEZpvd3 = EZpvd(economicData.AYXKKw());
                    java.lang.String strEZpvd4 = EZpvd(economicData.copydefault());
                    int i2 = qZH.PendingIntent.invokespecialaGOrKO;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    java.lang.String strEZpvd5 = economicData.EZpvd();
                    pairArr[c] = C56390yDp.OLrzqt("event", strEZpvd5 != null ? strEZpvd5 : "--");
                    pairArr[1] = C56390yDp.OLrzqt("date", pTA.formatDate$default(new Date(C33129mqd.valueOf(economicData.valueOf())), OKDateEnum.DATE_FORMAT_STANDARD_MD, null, null, 6, null));
                    java.lang.String strCopydefault2 = C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr));
                    java.lang.String strKWHzl = economicData.KWHzl();
                    arrayList.add(new MarketDiscoverOverviewTradeCalendarVo(i, requestValue, new MarketDiscoverOverviewTradeCalendarVo.EconomicVo(str, str2, str3, strEZpvd2, strEZpvd3, strEZpvd4, strCopydefault2, strKWHzl == null ? "" : strKWHzl, false, 0L, 768, null), null, 8, null));
                }
            } else {
                TradingCalendarType tradingCalendarType2 = TradingCalendarType.TOKEN_UNLOCK;
                if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) tradingCalendarType2.getRequestValue()) && tradingCalendarPo.getTokenUnlockData() != null && C33129mqd.OLrzqt((java.lang.CharSequence) tradingCalendarPo.getTokenUnlockData().AYXKKw())) {
                    C40885qgQ tokenUnlockData = tradingCalendarPo.getTokenUnlockData();
                    java.lang.String requestValue2 = tradingCalendarType2.getRequestValue();
                    java.lang.String strAEQbTJ2 = tokenUnlockData.AEQbTJ();
                    java.lang.String str4 = strAEQbTJ2 == null ? "" : strAEQbTJ2;
                    java.lang.String strOLrzqt = tokenUnlockData.OLrzqt();
                    if (strOLrzqt != null && strOLrzqt.length() != 0) {
                        strCopydefault = C33069mpW.copydefault(qZH.PendingIntent.DcMfJKDGTeJD, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", tokenUnlockData.OLrzqt())));
                    }
                    java.lang.String str5 = strCopydefault;
                    java.lang.String str6 = C33129mqd.gEmmrt(AEQbTJ(C33129mqd.EZpvd(tradingCalendarPo.getTokenUnlockData().copydefault()))) + "/" + OLrzqt(tradingCalendarPo.getTokenUnlockData().AhwBna());
                    java.lang.String strAYXKKw = tokenUnlockData.AYXKKw();
                    arrayList.add(new MarketDiscoverOverviewTradeCalendarVo(i, requestValue2, null, new MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo(str4, str5, str6, strAYXKKw == null ? "" : strAYXKKw, AEQbTJ(tokenUnlockData.valueOf()), OLrzqt(tokenUnlockData.gEmmrt()), copydefault(tokenUnlockData.gEmmrt()), AEQbTJ(tokenUnlockData.copydefault()), OLrzqt(tokenUnlockData.AhwBna()), copydefault(tokenUnlockData.gEmmrt()) + copydefault(tokenUnlockData.AhwBna()), AEQbTJ(tokenUnlockData.EZpvd()), OLrzqt(tokenUnlockData.KWHzl())), 4, null));
                }
            }
            i++;
            c = 0;
        }
        return arrayList;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : pTB.formatICUCompact$default(C33129mqd.EZpvd(str), RoundingMode.HALF_UP, null, null, null, 14, null);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : str;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.EZpvd(str), null, null, null, java.lang.Double.valueOf(100.0d), null, 46, null);
    }

    public final float copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 0.0f;
        }
        return java.lang.Float.parseFloat(str);
    }

    private final java.lang.CharSequence AEQbTJ(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        C54536xML c54536xMLCopydefault = copydefault();
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return c54536xMLCopydefault.OLrzqt(plainString);
    }
}
