package o;

import com.okinc.biz.TacticsType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.strategy.bean.DefaultTag;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem;
import com.okinc.tradingbot.impl.strategy.bean.TagConfig;
import com.okinc.tradingbot.impl.strategy.bean.VoucherTag;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.GridStatistics;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53811wsY implements InterfaceC54501xKt<BotAggregatedInfoBean, GuideHeaderCard> {
    public final InterfaceC55792xqd KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.wsY$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsVoucherType.values().length];
            try {
                iArr[TacticsVoucherType.STRATEGY_COMPENSATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsVoucherType.AIRDROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public C53811wsY(@NotNull InterfaceC55792xqd interfaceC55792xqd) {
        Intrinsics.checkNotNullParameter(interfaceC55792xqd, "");
        this.KWHzl = interfaceC55792xqd;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wsX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53811wsY.EZpvd(this.OLrzqt);
            }
        });
    }

    public final java.util.List<TacticsVoucherType> OLrzqt() {
        return (java.util.List) this.copydefault.getValue();
    }

    public static final java.util.List EZpvd(C53811wsY c53811wsY) {
        InterfaceC55792xqd interfaceC55792xqd = c53811wsY.KWHzl;
        if (interfaceC55792xqd instanceof ContractGridReq) {
            return TacticsType.Companion.AEQbTJ(TacticsType.TACTICS_CONTRACT_GRID);
        }
        if (interfaceC55792xqd instanceof GridReq) {
            return TacticsType.Companion.AEQbTJ(TacticsType.TACTICS_GRDE);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // o.InterfaceC54501xKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GuideHeaderCard KWHzl(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        boolean z;
        java.lang.String tradeSymbol;
        java.lang.String quoteSymbol;
        java.lang.String str;
        java.lang.String strAYXKKw;
        kotlin.Pair pair;
        java.lang.String strCopydefault;
        java.lang.String iCUCompact$default;
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        java.lang.String totalAssets;
        java.lang.String totalUserCount;
        java.lang.String str2;
        java.lang.String voucherCcy;
        java.lang.String strCopydefault2;
        java.lang.String voucherValue;
        java.lang.String str3;
        java.lang.String voucherCcy2;
        java.lang.String voucherValue2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        GridStatistics strategyStatistics = botAggregatedInfoBean.getStrategyStatistics();
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        if (voucherInformation == null || !voucherInformation.getVoucherVisible()) {
            z = false;
        } else {
            java.util.List<TacticsVoucherType> listOLrzqt = OLrzqt();
            LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends TacticsVoucherType>) ((java.lang.Iterable<? extends java.lang.Object>) listOLrzqt), voucherInformation2 != null ? voucherInformation2.getVoucherType() : null)) {
                z = true;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument bizInstrumentValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.KWHzl.getInstType())) == null) ? null : abstractC54531xLwOLrzqt.valueOf(this.KWHzl.getInstId());
        if (bizInstrumentValueOf == null || (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) == null) {
            tradeSymbol = "";
        }
        if (bizInstrumentValueOf == null || (quoteSymbol = bizInstrumentValueOf.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        java.lang.String iCUCompact$default2 = "--";
        if (z) {
            LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
            TacticsVoucherType voucherType = voucherInformation3 != null ? voucherInformation3.getVoucherType() : null;
            int i = voucherType == null ? -1 : Application.EZpvd[voucherType.ordinal()];
            if (i == 1) {
                int i2 = C55688xof.Application.QSusPL;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                xMR xmr = xMR.copydefault;
                LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
                if (voucherInformation4 == null || (voucherValue = voucherInformation4.getVoucherValue()) == null) {
                    str = "";
                    str2 = "--";
                } else {
                    str = "";
                    str2 = voucherValue;
                }
                pairArr[0] = C56390yDp.OLrzqt("num", xmr.copydefault(str2));
                LossInsuranceBean voucherInformation5 = botAggregatedInfoBean.getVoucherInformation();
                if (voucherInformation5 == null || (voucherCcy = voucherInformation5.getVoucherCcy()) == null) {
                    voucherCcy = "USDT";
                }
                pairArr[1] = C56390yDp.OLrzqt("ccy", voucherCcy);
                strCopydefault2 = C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr));
            } else if (i != 2) {
                str = "";
                str3 = str;
                arrayList.add(new VoucherTag(str3, 0, 0, 6, null));
            } else {
                int i3 = C55688xof.Application.QTtQrx;
                xMR xmr2 = xMR.copydefault;
                LossInsuranceBean voucherInformation6 = botAggregatedInfoBean.getVoucherInformation();
                java.lang.String strCopydefault3 = xmr2.copydefault((voucherInformation6 == null || (voucherValue2 = voucherInformation6.getVoucherValue()) == null) ? "--" : voucherValue2);
                LossInsuranceBean voucherInformation7 = botAggregatedInfoBean.getVoucherInformation();
                if (voucherInformation7 == null || (voucherCcy2 = voucherInformation7.getVoucherCcy()) == null) {
                    voucherCcy2 = "USDT";
                }
                strCopydefault2 = C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strCopydefault3 + " " + voucherCcy2)));
                str = "";
            }
            str3 = strCopydefault2;
            arrayList.add(new VoucherTag(str3, 0, 0, 6, null));
        } else {
            str = "";
            InterfaceC55792xqd interfaceC55792xqd = this.KWHzl;
            if (interfaceC55792xqd instanceof ContractGridReq) {
                arrayList.add(new DefaultTag(C33070mpX.AYXKKw(C55688xof.Application.getCallbacks), new TagConfig(0, 6, 1, null)));
            } else {
                if (!(interfaceC55792xqd instanceof GridReq)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) "USDT") || Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) "USDC")) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getCallbacks);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.isCurrent);
                }
                arrayList.add(new DefaultTag(strAYXKKw, null, 2, null));
            }
        }
        InterfaceC55792xqd interfaceC55792xqd2 = this.KWHzl;
        if (interfaceC55792xqd2 instanceof ContractGridReq) {
            java.lang.String direction = ((ContractGridReq) interfaceC55792xqd2).getDirection();
            if (direction == null) {
                direction = str;
            }
            java.lang.String strAhwBna = C56033xvF.AhwBna(direction);
            java.lang.String direction2 = ((ContractGridReq) this.KWHzl).getDirection();
            if (direction2 == null) {
                direction2 = str;
            }
            arrayList.add(new DefaultTag(strAhwBna, new TagConfig(-4, C56033xvF.valueOf(direction2))));
        }
        arrayList.add(new DefaultTag(C33070mpX.AYXKKw(C55688xof.Application.getCallback), new TagConfig(-4, 0, 2, null)));
        InterfaceC55792xqd interfaceC55792xqd3 = this.KWHzl;
        if (interfaceC55792xqd3 instanceof ContractGridReq) {
            java.lang.String annualizedRate = ((ContractGridReq) interfaceC55792xqd3).getAnnualizedRate();
            xMR xmr3 = xMR.copydefault;
            java.lang.String annualizedRate2 = ((ContractGridReq) this.KWHzl).getAnnualizedRate();
            pair = C56390yDp.OLrzqt(annualizedRate, xMR.formatPercentWithSymbol$default(xmr3, annualizedRate2 == null ? "--" : annualizedRate2, 0, 0, RoundingMode.DOWN, 6, null));
        } else if (interfaceC55792xqd3 instanceof GridReq) {
            java.lang.String annualizedRate3 = ((GridReq) interfaceC55792xqd3).getAnnualizedRate();
            xMR xmr4 = xMR.copydefault;
            java.lang.String annualizedRate4 = ((GridReq) this.KWHzl).getAnnualizedRate();
            pair = C56390yDp.OLrzqt(annualizedRate3, xMR.formatPercentWithSymbol$default(xmr4, annualizedRate4 == null ? "--" : annualizedRate4, 0, 0, RoundingMode.DOWN, 6, null));
        } else {
            pair = new kotlin.Pair("--", "--");
        }
        java.lang.String str4 = (java.lang.String) pair.component1();
        java.lang.String str5 = (java.lang.String) pair.component2();
        InterfaceC55792xqd interfaceC55792xqd4 = this.KWHzl;
        if (interfaceC55792xqd4 instanceof ContractGridReq) {
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.fsw, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", tradeSymbol)));
        } else {
            strCopydefault = interfaceC55792xqd4 instanceof GridReq ? C33069mpW.copydefault(C55688xof.Application.isBrowsable, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, tradeSymbol))) : str;
        }
        java.lang.String totalUserCount2 = strategyStatistics != null ? strategyStatistics.getTotalUserCount() : null;
        if (totalUserCount2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalUserCount2)) {
            iCUCompact$default = "--";
        } else {
            iCUCompact$default = xMR.formatICUCompact$default(xMR.copydefault, (strategyStatistics == null || (totalUserCount = strategyStatistics.getTotalUserCount()) == null) ? str : totalUserCount, null, C38307pTy.Companion.AEQbTJ(2), null, null, 26, null);
        }
        java.lang.String totalAssets2 = strategyStatistics != null ? strategyStatistics.getTotalAssets() : null;
        if (totalAssets2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalAssets2)) {
            iCUCompact$default2 = xMR.formatICUCompact$default(xMR.copydefault, (strategyStatistics == null || (totalAssets = strategyStatistics.getTotalAssets()) == null) ? str : totalAssets, null, C38307pTy.Companion.AEQbTJ(2), null, null, 26, null);
        }
        boolean zEZpvd = bizInstrumentValueOf != null ? Intrinsics.EZpvd(bizInstrumentValueOf.isNegativeContract(), java.lang.Boolean.TRUE) : false;
        java.lang.String str6 = (interfaceC54581xNrOLrzqt == null || (strValueOf2 = interfaceC54581xNrOLrzqt.valueOf(tradeSymbol)) == null) ? str : strValueOf2;
        java.lang.String str7 = (interfaceC54581xNrOLrzqt == null || (strValueOf = interfaceC54581xNrOLrzqt.valueOf(quoteSymbol)) == null) ? str : strValueOf;
        GuideHeaderItem guideHeaderItem = new GuideHeaderItem(C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1), str5, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) str4)));
        GuideHeaderItem guideHeaderItem2 = new GuideHeaderItem(C33070mpX.AYXKKw(C55688xof.Application.OtZEmZ), iCUCompact$default, null, 4, null);
        if (zEZpvd) {
            guideHeaderItem2 = null;
        }
        return new GuideHeaderCard(strCopydefault, arrayList, str6, str7, guideHeaderItem, guideHeaderItem2, zEZpvd ? null : new GuideHeaderItem(C33069mpW.copydefault(C55688xof.Application.unregisterCallbackMessenger, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", "USDT"))), iCUCompact$default2, null, 4, null), false, 128, null);
    }
}
