package o;

import com.okinc.biz.TacticsType;
import com.okinc.tradingbot.impl.strategy.bean.DefaultTag;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem;
import com.okinc.tradingbot.impl.strategy.bean.TagConfig;
import com.okinc.tradingbot.impl.strategy.bean.VoucherTag;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.GridStatistics;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53808wsV implements InterfaceC54501xKt<BotAggregatedInfoBean, GuideHeaderCard> {
    public static final int OLrzqt = DcaOrderReq.$stable;
    public final DcaOrderReq EZpvd;

    public C53808wsV(@NotNull DcaOrderReq dcaOrderReq) {
        Intrinsics.checkNotNullParameter(dcaOrderReq, "");
        this.EZpvd = dcaOrderReq;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GuideHeaderCard KWHzl(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        boolean z;
        BizInstrument bizInstrumentValueOf;
        java.lang.String tradeSymbol;
        java.lang.String quoteSymbol;
        java.lang.String percentWithSymbol$default;
        java.lang.String iCUCompact$default;
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        java.lang.String totalAssets;
        java.lang.String totalUserCount;
        java.lang.String voucherCcy;
        java.lang.String voucherValue;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        GridStatistics strategyStatistics = botAggregatedInfoBean.getStrategyStatistics();
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation == null || !voucherInformation.getVoucherVisible()) {
            z = false;
        } else {
            java.util.List<TacticsVoucherType> listAEQbTJ = TacticsType.Companion.AEQbTJ(TacticsType.TACTICS_CONTRACT_DCA);
            LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends TacticsVoucherType>) ((java.lang.Iterable<? extends java.lang.Object>) listAEQbTJ), voucherInformation2 != null ? voucherInformation2.getVoucherType() : null)) {
                z = true;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            bizInstrumentValueOf = null;
        } else {
            java.lang.String instType = this.EZpvd.getInstType();
            if (instType == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                java.lang.String instId = this.EZpvd.getInstId();
                if (instId == null) {
                    instId = "";
                }
                bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(instId);
            }
        }
        if (bizInstrumentValueOf == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        if (bizInstrumentValueOf == null || (quoteSymbol = bizInstrumentValueOf.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        java.lang.String iCUCompact$default2 = "--";
        if (z) {
            int i = C55688xof.Application.QSusPL;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            xMR xmr = xMR.copydefault;
            LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
            pairArr[0] = C56390yDp.OLrzqt("num", xmr.copydefault((voucherInformation3 == null || (voucherValue = voucherInformation3.getVoucherValue()) == null) ? "--" : voucherValue));
            LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
            if (voucherInformation4 == null || (voucherCcy = voucherInformation4.getVoucherCcy()) == null) {
                voucherCcy = "USDT";
            }
            pairArr[1] = C56390yDp.OLrzqt("ccy", voucherCcy);
            arrayList.add(new VoucherTag(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)), 0, 0, 6, null));
        }
        arrayList.add(new DefaultTag(C33070mpX.AYXKKw(C48033uCm.Fragment.swzYdv), new TagConfig(-4, 6)));
        java.lang.String direction = this.EZpvd.getDirection();
        if (direction == null) {
            direction = "";
        }
        java.lang.String strAhwBna = C56033xvF.AhwBna(direction);
        java.lang.String direction2 = this.EZpvd.getDirection();
        if (direction2 == null) {
            direction2 = "";
        }
        arrayList.add(new DefaultTag(strAhwBna, new TagConfig(-4, C56033xvF.valueOf(direction2))));
        java.lang.String annualizedRate = this.EZpvd.getAnnualizedRate();
        if (annualizedRate == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) annualizedRate)) {
            percentWithSymbol$default = "--";
        } else {
            xMR xmr2 = xMR.copydefault;
            java.lang.String annualizedRate2 = this.EZpvd.getAnnualizedRate();
            Intrinsics.copydefault((java.lang.Object) annualizedRate2);
            percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xmr2, annualizedRate2, 0, 0, RoundingMode.DOWN, 6, null);
        }
        java.lang.String totalUserCount2 = strategyStatistics != null ? strategyStatistics.getTotalUserCount() : null;
        if (totalUserCount2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalUserCount2)) {
            iCUCompact$default = "--";
        } else {
            iCUCompact$default = xMR.formatICUCompact$default(xMR.copydefault, (strategyStatistics == null || (totalUserCount = strategyStatistics.getTotalUserCount()) == null) ? "" : totalUserCount, null, C38307pTy.Companion.AEQbTJ(2), null, null, 26, null);
        }
        java.lang.String totalAssets2 = strategyStatistics != null ? strategyStatistics.getTotalAssets() : null;
        if (totalAssets2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalAssets2)) {
            iCUCompact$default2 = xMR.formatICUCompact$default(xMR.copydefault, (strategyStatistics == null || (totalAssets = strategyStatistics.getTotalAssets()) == null) ? "" : totalAssets, null, C38307pTy.Companion.AEQbTJ(2), null, null, 26, null);
        }
        java.lang.String strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.hvKCwS, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", tradeSymbol)));
        java.lang.String str2 = (interfaceC54581xNrOLrzqt == null || (strValueOf2 = interfaceC54581xNrOLrzqt.valueOf(tradeSymbol)) == null) ? "" : strValueOf2;
        if (interfaceC54581xNrOLrzqt != null && (strValueOf = interfaceC54581xNrOLrzqt.valueOf(quoteSymbol)) != null) {
            str = strValueOf;
        }
        return new GuideHeaderCard(strCopydefault, arrayList, str2, str, new GuideHeaderItem(C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1), percentWithSymbol$default, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) this.EZpvd.getAnnualizedRate()))), new GuideHeaderItem(C33070mpX.AYXKKw(C55688xof.Application.OtZEmZ), iCUCompact$default, null, 4, null), new GuideHeaderItem(C33069mpW.copydefault(C55688xof.Application.unregisterCallbackMessenger, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", "USDT"))), iCUCompact$default2, null, 4, null), false, 128, null);
    }
}
