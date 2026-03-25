package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.market.discover.features.markets.sub.overview.domain.GetMarketDiscoverOverviewCalendarUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.data.po.TradingCalendarPo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qfb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40843qfb extends AbstractC49400uno<C41085qkE, java.util.List<? extends MarketDiscoverOverviewTradeCalendarVo>> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C40889qgU AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C40843qfb(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40889qgU c40889qgU) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40889qgU, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = c40889qgU;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qfc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40843qfb.KWHzl();
            }
        });
    }

    /* JADX INFO: renamed from: o.qfb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qfb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final C54536xML OLrzqt() {
        return (C54536xML) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C54536xML KWHzl() {
        return new C54536xML();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41085qkE c41085qkE, @NotNull Continuation<? super java.util.List<MarketDiscoverOverviewTradeCalendarVo>> continuation) throws java.lang.Throwable {
        GetMarketDiscoverOverviewCalendarUseCase$onExecute$1 getMarketDiscoverOverviewCalendarUseCase$onExecute$1;
        C40843qfb c40843qfb;
        java.lang.String strCopydefault;
        int i;
        if (continuation instanceof GetMarketDiscoverOverviewCalendarUseCase$onExecute$1) {
            getMarketDiscoverOverviewCalendarUseCase$onExecute$1 = (GetMarketDiscoverOverviewCalendarUseCase$onExecute$1) continuation;
            int i2 = getMarketDiscoverOverviewCalendarUseCase$onExecute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverOverviewCalendarUseCase$onExecute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverOverviewCalendarUseCase$onExecute$1 = new GetMarketDiscoverOverviewCalendarUseCase$onExecute$1(this, continuation);
            }
        }
        GetMarketDiscoverOverviewCalendarUseCase$onExecute$1 getMarketDiscoverOverviewCalendarUseCase$onExecute$12 = getMarketDiscoverOverviewCalendarUseCase$onExecute$1;
        java.lang.Object objOLrzqt = getMarketDiscoverOverviewCalendarUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getMarketDiscoverOverviewCalendarUseCase$onExecute$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C40889qgU c40889qgU = this.AEQbTJ;
            java.lang.String strCopydefault2 = c41085qkE.copydefault();
            getMarketDiscoverOverviewCalendarUseCase$onExecute$12.L$0 = this;
            getMarketDiscoverOverviewCalendarUseCase$onExecute$12.label = 1;
            objOLrzqt = c40889qgU.OLrzqt(strCopydefault2, "3", "", "", getMarketDiscoverOverviewCalendarUseCase$onExecute$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c40843qfb = this;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c40843qfb = (C40843qfb) getMarketDiscoverOverviewCalendarUseCase$onExecute$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        java.util.List list = (java.util.List) objOLrzqt;
        if (list == null || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char c = 0;
        int i4 = 0;
        for (java.lang.Object obj : list) {
            if (i4 < 0) {
                yDY.AYXKKw();
            }
            TradingCalendarPo tradingCalendarPo = (TradingCalendarPo) obj;
            java.lang.String type = tradingCalendarPo.getType();
            TradingCalendarType tradingCalendarType = TradingCalendarType.ECONOMIC;
            strCopydefault = "--";
            if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) tradingCalendarType.getRequestValue())) {
                if (tradingCalendarPo.getEconomicData() == null || !C33129mqd.OLrzqt((java.lang.CharSequence) tradingCalendarPo.getEconomicData().valueOf())) {
                    i = i4;
                } else {
                    C40888qgT economicData = tradingCalendarPo.getEconomicData();
                    java.lang.String requestValue = tradingCalendarType.getRequestValue();
                    java.lang.String strAEQbTJ = economicData.AEQbTJ();
                    java.lang.String str = strAEQbTJ == null ? "" : strAEQbTJ;
                    java.lang.String strEZpvd = economicData.EZpvd();
                    java.lang.String str2 = strEZpvd == null ? "--" : strEZpvd;
                    java.lang.String strValueOf = economicData.valueOf();
                    java.lang.String str3 = strValueOf == null ? "" : strValueOf;
                    java.lang.String strEZpvd2 = c40843qfb.EZpvd(economicData.OLrzqt());
                    java.lang.String strEZpvd3 = c40843qfb.EZpvd(economicData.AYXKKw());
                    java.lang.String strEZpvd4 = c40843qfb.EZpvd(economicData.copydefault());
                    int i5 = qZH.PendingIntent.invokespecialaGOrKO;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    java.lang.String strEZpvd5 = economicData.EZpvd();
                    pairArr[c] = C56390yDp.OLrzqt("event", strEZpvd5 != null ? strEZpvd5 : "--");
                    i = i4;
                    pairArr[1] = C56390yDp.OLrzqt("date", pTA.formatDate$default(new Date(C33129mqd.valueOf(economicData.valueOf())), OKDateEnum.DATE_FORMAT_STANDARD_MD, null, null, 6, null));
                    java.lang.String strCopydefault3 = C33069mpW.copydefault(i5, C56424yEw.gEmmrt(pairArr));
                    java.lang.String strKWHzl = economicData.KWHzl();
                    arrayList.add(new MarketDiscoverOverviewTradeCalendarVo(i, requestValue, new MarketDiscoverOverviewTradeCalendarVo.EconomicVo(str, str2, str3, strEZpvd2, strEZpvd3, strEZpvd4, strCopydefault3, strKWHzl == null ? "" : strKWHzl, false, 0L, 768, null), null, 8, null));
                }
            } else {
                i = i4;
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
                    java.lang.String str6 = C33129mqd.gEmmrt(c40843qfb.OLrzqt(C33129mqd.EZpvd(tradingCalendarPo.getTokenUnlockData().copydefault()))) + "/" + c40843qfb.OLrzqt(tradingCalendarPo.getTokenUnlockData().AhwBna());
                    java.lang.String strAYXKKw = tokenUnlockData.AYXKKw();
                    arrayList.add(new MarketDiscoverOverviewTradeCalendarVo(i, requestValue2, null, new MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo(str4, str5, str6, strAYXKKw == null ? "" : strAYXKKw, c40843qfb.KWHzl(tokenUnlockData.valueOf()), c40843qfb.OLrzqt(tokenUnlockData.gEmmrt()), c40843qfb.copydefault(tokenUnlockData.gEmmrt()), c40843qfb.KWHzl(tokenUnlockData.copydefault()), c40843qfb.OLrzqt(tokenUnlockData.AhwBna()), c40843qfb.copydefault(tokenUnlockData.gEmmrt()) + c40843qfb.copydefault(tokenUnlockData.AhwBna()), c40843qfb.KWHzl(tokenUnlockData.EZpvd()), c40843qfb.OLrzqt(tokenUnlockData.KWHzl())), 4, null));
                }
            }
            i4 = i + 1;
            c = 0;
        }
        return arrayList;
    }

    private final java.lang.String KWHzl(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : pTB.formatICUCompact$default(C33129mqd.EZpvd(str), RoundingMode.HALF_UP, null, null, null, 14, null);
    }

    private final java.lang.String EZpvd(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : str;
    }

    private final java.lang.String OLrzqt(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.EZpvd(str), null, null, null, java.lang.Double.valueOf(100.0d), null, 46, null);
    }

    private final float copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 0.0f;
        }
        return java.lang.Float.parseFloat(str);
    }

    private final java.lang.CharSequence OLrzqt(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        C54536xML c54536xMLOLrzqt = OLrzqt();
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return c54536xMLOLrzqt.OLrzqt(plainString);
    }
}
