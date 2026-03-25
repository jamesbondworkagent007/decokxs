package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.data.TacticsListLabelRoleData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC56005xue;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vTF implements InterfaceC56005xue {
    public final MutableLiveData<java.util.List<Distribution>> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean AhwBna;
    public final java.lang.String EZpvd;
    public GridProfitRateResp KWHzl;
    public final C56236xyx OLrzqt;
    public final StrategyReqGroup copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public final BotOrderConfirmPresenter.VoucherTagDisplayInfo valueOf;

    public static final class StateListAnimator implements InterfaceC54501xKt<java.util.List<? extends Distribution>, java.util.List<? extends Distribution>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.util.List<Distribution> KWHzl(java.util.List<Distribution> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return list;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(GridProfitRateResp gridProfitRateResp) {
        this.KWHzl = gridProfitRateResp;
    }

    @Override // o.InterfaceC56005xue
    public void EZpvd(@NotNull java.lang.Object obj) {
        InterfaceC56005xue.ActionBar.AEQbTJ(this, obj);
    }

    public vTF(@NotNull java.lang.String str, @NotNull java.lang.String str2, StrategyReqGroup strategyReqGroup, boolean z, BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo, GridProfitRateResp gridProfitRateResp) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.copydefault = strategyReqGroup;
        this.AhwBna = z;
        this.valueOf = voucherTagDisplayInfo;
        this.KWHzl = gridProfitRateResp;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.vTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vTF.OLrzqt(this.KWHzl);
            }
        });
        this.OLrzqt = new C56236xyx();
        this.AEQbTJ = new MutableLiveData<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 com.okinc.unify_trade.biz.StrategyReqGroup)
  (r11v0 boolean)
  (r12v0 com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter$VoucherTagDisplayInfo)
  (wrap:com.okinc.unify_trade.biz.GridProfitRateResp:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.GridProfitRateResp) : (r13v0 com.okinc.unify_trade.biz.GridProfitRateResp))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.StrategyReqGroup, boolean, com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter$VoucherTagDisplayInfo, com.okinc.unify_trade.biz.GridProfitRateResp):void (m)] (LINE:55) call: o.vTF.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.StrategyReqGroup, boolean, com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter$VoucherTagDisplayInfo, com.okinc.unify_trade.biz.GridProfitRateResp):void type: THIS */
    public /* synthetic */ vTF(java.lang.String str, java.lang.String str2, StrategyReqGroup strategyReqGroup, boolean z, BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo, GridProfitRateResp gridProfitRateResp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, strategyReqGroup, z, voucherTagDisplayInfo, (i & 32) != 0 ? null : gridProfitRateResp);
    }

    private final C55887xsS AhwBna() {
        return (C55887xsS) this.gEmmrt.getValue();
    }

    public static final C55887xsS OLrzqt(vTF vtf) {
        GridReq gridReq;
        C55887xsS c55887xsS = new C55887xsS(vtf.AYXKKw, vtf.EZpvd);
        StrategyReqGroup strategyReqGroup = vtf.copydefault;
        c55887xsS.gEmmrt((strategyReqGroup == null || (gridReq = strategyReqGroup.getGridReq()) == null) ? null : gridReq.getTradeQuoteCcy());
        return c55887xsS;
    }

    @Override // o.InterfaceC56005xue
    public java.util.List<java.lang.Object> AEQbTJ() {
        GridReq gridReq;
        java.util.List<java.lang.Object> listKWHzl;
        StrategyReqGroup strategyReqGroup = this.copydefault;
        return (strategyReqGroup == null || (gridReq = strategyReqGroup.getGridReq()) == null || (listKWHzl = KWHzl(gridReq)) == null) ? yDY.AhwBna() : listKWHzl;
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String EZpvd() {
        GridReq gridReq;
        StrategyReqGroup strategyReqGroup = this.copydefault;
        java.lang.String sourceCcy = (strategyReqGroup == null || (gridReq = strategyReqGroup.getGridReq()) == null) ? null : gridReq.getSourceCcy();
        java.lang.String strCopydefault = AhwBna().copydefault("grid");
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return (sourceCcy == null || sourceCcy.length() == 0) ? strCopydefault : sourceCcy;
    }

    public final boolean copydefault() {
        StrategyReqGroup strategyReqGroup;
        GridReq gridReq;
        java.lang.String sourceCcy;
        BizInstrument bizInstrumentAhwBna = AhwBna().AhwBna();
        return (bizInstrumentAhwBna == null || (strategyReqGroup = this.copydefault) == null || (gridReq = strategyReqGroup.getGridReq()) == null || (sourceCcy = gridReq.getSourceCcy()) == null || Intrinsics.EZpvd((java.lang.Object) sourceCcy, (java.lang.Object) bizInstrumentAhwBna.getQuoteSymbol()) || Intrinsics.EZpvd((java.lang.Object) sourceCcy, (java.lang.Object) bizInstrumentAhwBna.getTradeSymbol())) ? false : true;
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String KWHzl() {
        GridReq gridReq;
        java.lang.String tradeSymbol;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        StrategyReqGroup strategyReqGroup = this.copydefault;
        if (strategyReqGroup == null || (gridReq = strategyReqGroup.getGridReq()) == null) {
            return "";
        }
        java.lang.String quoteSz = gridReq.getQuoteSz();
        java.lang.String baseSz = gridReq.getBaseSz();
        java.lang.String sourceCcySz = gridReq.getSourceCcySz();
        java.lang.String sourceCcy = gridReq.getSourceCcy();
        java.lang.String safeString$default = null;
        if (quoteSz != null && quoteSz.length() != 0 && baseSz != null && baseSz.length() != 0) {
            return EZpvd(this, quoteSz, true) + " + " + getInvestValue$formatAmount$default(this, baseSz, false, 4, null);
        }
        if (quoteSz != null && quoteSz.length() != 0) {
            return EZpvd(this, quoteSz, true);
        }
        if (baseSz != null && baseSz.length() != 0) {
            return getInvestValue$formatAmount$default(this, baseSz, false, 4, null);
        }
        if (sourceCcySz == null || sourceCcySz.length() == 0 || sourceCcy == null || sourceCcy.length() == 0 || !copydefault()) {
            return "";
        }
        BizInstrument bizInstrumentAhwBna = AhwBna().AhwBna();
        if (bizInstrumentAhwBna == null || (tradeSymbol = bizInstrumentAhwBna.getTradeSymbol()) == null) {
            tradeSymbol = "BTC";
        }
        java.lang.String str = tradeSymbol + "-" + sourceCcy;
        C54797xVr c54797xVr = C54797xVr.copydefault;
        java.lang.String instType = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getInstType() : null;
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(c54797xVr, str, instType == null ? "" : instType, null, true, null, 20, null);
        if (c54571xNhCreateAmtConvertor$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvertor$default.AYXKKw(sourceCcySz)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return safeString$default == null ? "" : safeString$default;
    }

    public static /* synthetic */ java.lang.String getInvestValue$formatAmount$default(vTF vtf, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return EZpvd(vtf, str, z);
    }

    public static final java.lang.String EZpvd(vTF vtf, java.lang.String str, boolean z) {
        C54571xNh c54571xNhCreateAmtConvert$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default = null;
        if (z) {
            c54571xNhCreateAmtConvert$default = vtf.AhwBna().EZpvd(vtf.AhwBna().copydefault("grid"));
        } else {
            c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(vtf.AhwBna(), null, false, 3, null);
        }
        if (c54571xNhCreateAmtConvert$default != null) {
            if (str == null) {
                str = "";
            }
            C54536xML c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(str);
            if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
            }
        }
        return safeString$default == null ? "" : safeString$default;
    }

    public final java.lang.String KWHzl(GridProfitRateResp gridProfitRateResp) {
        java.lang.String profitCcy;
        StrategyReqGroup strategyReqGroup;
        GridReq gridReq;
        GridReq gridReq2;
        xMR xmr = xMR.copydefault;
        java.lang.String perMinProfitRate = gridProfitRateResp.getPerMinProfitRate();
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String percent$default = xMR.formatPercent$default(xmr, perMinProfitRate, 0, roundingMode, 2, null);
        java.lang.String percent$default2 = xMR.formatPercent$default(xmr, gridProfitRateResp.getPerMaxProfitRate(), 0, roundingMode, 2, null);
        if (!Intrinsics.EZpvd((java.lang.Object) percent$default, (java.lang.Object) percent$default2)) {
            percent$default = percent$default + " - " + percent$default2;
        } else if (percent$default == null || percent$default.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) percent$default)) {
            percent$default = "";
        }
        java.lang.String str = percent$default;
        StrategyReqGroup strategyReqGroup2 = this.copydefault;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((strategyReqGroup2 == null || (gridReq2 = strategyReqGroup2.getGridReq()) == null) ? null : gridReq2.getTradeQuoteCcy())) || (strategyReqGroup = this.copydefault) == null || (gridReq = strategyReqGroup.getGridReq()) == null || (profitCcy = gridReq.getTradeQuoteCcy()) == null) {
            profitCcy = gridProfitRateResp.getProfitCcy();
        }
        return C56033xvF.copydefault(this.EZpvd, this.AYXKKw, str, gridProfitRateResp.getPerMinProfitAmt(), gridProfitRateResp.getPerMaxProfitAmt(), profitCcy, "--", true, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.Object> KWHzl(GridReq gridReq) {
        java.util.List<AutoEarnStakingConfig> listAhwBna;
        java.util.List<AutoEarnStakingConfig> listAhwBna2;
        AutoVipProfitInfo vipProfit;
        AutoVipProfitInfo vipProfit2;
        AutoVipProfitInfo vipProfit3;
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        java.lang.String strAYXKKw;
        TpSlTriggerParam tpSlTriggerParam;
        java.lang.String regionDisplay;
        AutoVipProfitInfo vipProfit4;
        AutoVipProfitInfo vipProfit5;
        java.lang.String strOLrzqt;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity22);
        xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(this.EZpvd, this.AYXKKw);
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ContextAwareKtwithContextAvailable2listener1), C56033xvF.getCoinTitle$default(gridReq.getInstType(), gridReq.getInstId(), false, null, null, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.clearAvailableContext);
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairEZpvd = EZpvd(gridReq);
        boolean zBooleanValue = pairEZpvd.component1().booleanValue();
        java.lang.String strComponent2 = pairEZpvd.component2();
        if (zBooleanValue) {
            listOLrzqt2.add(new TacticsListLabelData(strComponent2, false, 0, 0, 0, 30, null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) gridReq.getProfitSharingRatio())) {
            listOLrzqt2.add(new TacticsListLabelRoleData(C33070mpX.AYXKKw(C55688xof.Application.onPlayFromMediaId), false, 0, 0, 0, 30, null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) gridReq.getVoucherId())) {
            xMR xmr = xMR.copydefault;
            BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo = this.valueOf;
            java.lang.String strAEQbTJ = voucherTagDisplayInfo != null ? voucherTagDisplayInfo.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            java.lang.String strCopydefault = xmr.copydefault(strAEQbTJ);
            BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo2 = this.valueOf;
            if (voucherTagDisplayInfo2 == null || (strOLrzqt = voucherTagDisplayInfo2.OLrzqt()) == null) {
                strOLrzqt = "USDT";
            }
            listOLrzqt2.add(new TacticsListLabelVoucherData(strCopydefault + " " + strOLrzqt, false, 0, 0, 0, null, 62, null));
        }
        Unit unit = Unit.INSTANCE;
        listOLrzqt.add(new TacticsInsideItemData(strAYXKKw3, strAYXKKw2, null, 0, 0, 0, 0, 0, null, null, null, null, C56402yEa.fARcdN(listOLrzqt2), null, null, null, null, 126972, null));
        listOLrzqt.add(new TacticsInsideLineItemData(0, 0, 0, 4, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setPlaybackState), EZpvd(xmsAEQbTJ, gridReq.getMinPx()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowCustomEnabled), EZpvd(xmsAEQbTJ, gridReq.getMaxPx()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.getCallerInput);
        xMR xmr2 = xMR.copydefault;
        listOLrzqt.add(new TacticsInsideItemData(strAYXKKw4, xmr2.copydefault(gridReq.getGridNum()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) gridReq.getProfitSharingRatio())) {
            listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2), xMR.formatPercent$default(xmr2, gridReq.getProfitSharingRatio(), 0, null, 4, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        GridProfitRateResp gridProfitRateResp = this.KWHzl;
        if (gridProfitRateResp != null) {
            listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setQueueTitle), KWHzl(gridProfitRateResp), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        StrategyReqGroup strategyReqGroup = this.copydefault;
        if (C33129mqd.KWHzl((java.util.Collection) ((strategyReqGroup == null || (vipProfit5 = strategyReqGroup.getVipProfit()) == null) ? null : vipProfit5.getAutoStake()))) {
            StrategyReqGroup strategyReqGroup2 = this.copydefault;
            if (strategyReqGroup2 == null || (vipProfit3 = strategyReqGroup2.getVipProfit()) == null || (listAhwBna = vipProfit3.getAutoStake()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List<AutoEarnStakingConfig> list = listAhwBna;
            StrategyReqGroup strategyReqGroup3 = this.copydefault;
            if (strategyReqGroup3 == null || (vipProfit2 = strategyReqGroup3.getVipProfit()) == null || (listAhwBna2 = vipProfit2.getAutoEarn()) == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            java.util.List<AutoEarnStakingConfig> list2 = listAhwBna2;
            StrategyReqGroup strategyReqGroup4 = this.copydefault;
            listOLrzqt.add(new AutoVipProfitInfo((java.util.List) list2, (java.util.List) list, (strategyReqGroup4 == null || (vipProfit = strategyReqGroup4.getVipProfit()) == null) ? null : vipProfit.getVipLevel(), false, false, 24, (DefaultConstructorMarker) null));
        } else {
            StrategyReqGroup strategyReqGroup5 = this.copydefault;
            if (C33129mqd.KWHzl((java.util.Collection) ((strategyReqGroup5 == null || (vipProfit4 = strategyReqGroup5.getVipProfit()) == null) ? null : vipProfit4.getAutoEarn()))) {
            }
        }
        if (!this.AhwBna) {
            listOLrzqt.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat3), 8.0f, 0.0f, 0, 0, 16, 24, (DefaultConstructorMarker) null));
            java.lang.String strKWHzl = AhwBna().KWHzl("grid");
            if (strKWHzl != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl))) {
                TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1));
                tacticsInsideItemData.setText(strKWHzl);
                listOLrzqt.add(tacticsInsideItemData);
            }
            SmartEarnRequestParam earnParam = gridReq.getEarnParam();
            if (earnParam != null && (regionDisplay = earnParam.getRegionDisplay()) != null) {
                listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isThumbUp), regionDisplay, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            TrailingConfig trailingUpConfig = gridReq.getTrailingUpConfig();
            if (trailingUpConfig == null || !trailingUpConfig.getEnabled()) {
                pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setRepeatMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24), EZpvd(trailingUpConfig.getStopPx()));
            }
            listOLrzqt.add(new TacticsInsideItemData((java.lang.String) pairOLrzqt.getFirst(), (java.lang.String) pairOLrzqt.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            TrailingConfig trailingDownConfig = gridReq.getTrailingDownConfig();
            if (trailingDownConfig == null || !trailingDownConfig.getEnabled()) {
                pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setShuffleMode), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23));
            } else {
                pairOLrzqt2 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi23CallbackProxy), EZpvd(trailingDownConfig.getStopPx()));
            }
            listOLrzqt.add(new TacticsInsideItemData((java.lang.String) pairOLrzqt2.getFirst(), (java.lang.String) pairOLrzqt2.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), copydefault(gridReq.getSignParams()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved), AEQbTJ(gridReq.getSignParams()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickContact);
            AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(gridReq.getSignParams());
            if (Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSign != null ? advancedTriggerSign.getStopType() : null), (java.lang.Object) "1")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.binderDied);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.unregisterCallback);
            }
            listOLrzqt.add(new TacticsInsideItemData(strAYXKKw5, strAYXKKw, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            C55850xri c55850xri = new C55850xri(this.AYXKKw, this.EZpvd, gridReq.getSourceCcy(), gridReq.getTradeQuoteCcy());
            TpSlTriggerParamReqResp tpslTriggerParamReq = gridReq.getTpslTriggerParamReq();
            if (tpslTriggerParamReq == null || (tpSlTriggerParam = C55765xqC.OLrzqt(tpslTriggerParamReq)) == null) {
                tpSlTriggerParam = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
            }
            if (tpSlTriggerParam.getTp().getValue() != null) {
                java.lang.String strFetchVPNInfo = c55850xri.fetchVPNInfo(tpSlTriggerParam);
                listOLrzqt.add(new TacticsInsideItemData(strFetchVPNInfo == null ? "" : strFetchVPNInfo, c55850xri.values(tpSlTriggerParam), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            if (tpSlTriggerParam.getSl().getValue() != null) {
                java.lang.String strIsConnected = c55850xri.isConnected(tpSlTriggerParam);
                listOLrzqt.add(new TacticsInsideItemData(strIsConnected == null ? "" : strIsConnected, c55850xri.valueOf(tpSlTriggerParam), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            if (tpSlTriggerParam.getDelaySeconds() != null) {
                listOLrzqt.add(new TacticsInsideItemData(c55850xri.copydefault(), c55850xri.djBIcL(tpSlTriggerParam), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParam.getTp().getValue()) || C33129mqd.OLrzqt((java.lang.CharSequence) tpSlTriggerParam.getSl().getValue())) {
                java.lang.String strGEmmrt = c55850xri.gEmmrt();
                java.lang.String strDbNXlk = c55850xri.DbNXlk(tpSlTriggerParam);
                listOLrzqt.add(new TacticsInsideItemData(strGEmmrt, strDbNXlk == null ? "" : strDbNXlk, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener);
            java.lang.String runType = gridReq.getRunType();
            java.lang.String strAYXKKw7 = (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1") && Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) ? C33070mpX.AYXKKw(C55688xof.Application.setQueue) : C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
            listOLrzqt.add(new TacticsInsideItemData(strAYXKKw6, strAYXKKw7, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            listOLrzqt.add(new BotRemindData(C33069mpW.copydefault(C55688xof.Application.dispatchMenuVisibilityChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", strAYXKKw2))), 0, 0, null, 14, null));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static final java.lang.String EZpvd(xMS xms, java.lang.String str) {
        C54536xML c54536xMLKWHzl;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        if (str == null || str.length() == 0) {
            return "--";
        }
        java.lang.String safeString$default = null;
        if (xms != null && (c54536xMLKWHzl = xms.KWHzl(str)) != null && (c54536xMLDjBIcL = c54536xMLKWHzl.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
        }
        return safeString$default == null ? "" : safeString$default;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(this.EZpvd, this.AYXKKw);
        return (str == null || str.length() == 0 || xmsAEQbTJ == null) ? "--" : C54536xML.toSafeString$default(xmsAEQbTJ.KWHzl(str).djBIcL().fetchVPNInfo(), false, 1, null);
    }

    private final java.lang.String copydefault(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        java.lang.String botPrice$default = "--";
        if (advancedTriggerSign == null) {
            return "--";
        }
        if (Intrinsics.EZpvd((java.lang.Object) advancedTriggerSign.getIndicator(), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) advancedTriggerSign.getTriggerPx())) {
                java.lang.String str = this.AYXKKw;
                java.lang.String str2 = this.EZpvd;
                java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
                if (triggerPx == null) {
                    triggerPx = "";
                }
                botPrice$default = C56033xvF.getBotPrice$default(str, str2, triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
            return GridStartTriggerType.Companion.copydefault(advancedTriggerSign.getIndicator()) + " | " + botPrice$default;
        }
        return GridStartTriggerType.Companion.copydefault(advancedTriggerSign.getIndicator());
    }

    private final java.lang.String AEQbTJ(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        java.lang.String botPrice$default = "--";
        if (advancedTriggerSign == null) {
            return "--";
        }
        if (Intrinsics.EZpvd((java.lang.Object) advancedTriggerSign.getIndicator(), (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) advancedTriggerSign.getTriggerPx())) {
                java.lang.String str = this.AYXKKw;
                java.lang.String str2 = this.EZpvd;
                java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
                if (triggerPx == null) {
                    triggerPx = "";
                }
                botPrice$default = C56033xvF.getBotPrice$default(str, str2, triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
            return GridStopTriggerType.Companion.EZpvd(advancedTriggerSign.getIndicator()) + " | " + botPrice$default;
        }
        return GridStopTriggerType.Companion.EZpvd(advancedTriggerSign.getIndicator());
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> EZpvd(GridReq gridReq) {
        TrailingConfig trailingUpConfig;
        TrailingConfig trailingDownConfig;
        TrailingConfig trailingDownConfig2;
        TrailingConfig trailingUpConfig2 = gridReq.getTrailingUpConfig();
        if (trailingUpConfig2 != null && trailingUpConfig2.getEnabled() && (trailingDownConfig2 = gridReq.getTrailingDownConfig()) != null && trailingDownConfig2.getEnabled()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.max));
        }
        TrailingConfig trailingUpConfig3 = gridReq.getTrailingUpConfig();
        if (trailingUpConfig3 != null && trailingUpConfig3.getEnabled() && ((trailingDownConfig = gridReq.getTrailingDownConfig()) == null || !trailingDownConfig.getEnabled())) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.StringDef));
        }
        TrailingConfig trailingDownConfig3 = gridReq.getTrailingDownConfig();
        if (trailingDownConfig3 != null && trailingDownConfig3.getEnabled() && ((trailingUpConfig = gridReq.getTrailingUpConfig()) == null || !trailingUpConfig.getEnabled())) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.Size));
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }

    @Override // o.InterfaceC56005xue
    public LiveData<java.util.List<Distribution>> OLrzqt() {
        GridReq gridReq;
        java.lang.String runType;
        java.lang.Object next;
        StrategyReqGroup strategyReqGroup = this.copydefault;
        if ((strategyReqGroup != null ? strategyReqGroup.getGridReq() : null) == null || !Intrinsics.EZpvd((java.lang.Object) "grid", (java.lang.Object) this.copydefault.getBaseReq().getOrdType()) || (gridReq = this.copydefault.getGridReq()) == null || gridReq.getMaxPx().length() == 0 || gridReq.getMinPx().length() == 0 || gridReq.getGridNum().length() == 0 || (runType = gridReq.getRunType()) == null || runType.length() == 0) {
            return null;
        }
        C56236xyx c56236xyx = this.OLrzqt;
        c56236xyx.copydefault(this.EZpvd);
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(gridReq.getGridNum());
        c56236xyx.AEQbTJ(intOrNull != null ? intOrNull.intValue() : 0);
        c56236xyx.EZpvd(gridReq.getMaxPx());
        c56236xyx.KWHzl(gridReq.getMinPx());
        java.lang.String runType2 = gridReq.getRunType();
        if (runType2 == null) {
            runType2 = "";
        }
        c56236xyx.AYXKKw(runType2);
        c56236xyx.AEQbTJ(this.copydefault.getBaseReq().getOrdType());
        c56236xyx.OLrzqt(gridReq.getBaseSz());
        c56236xyx.gEmmrt(gridReq.getQuoteSz());
        if (C33129mqd.AhwBna(gridReq.getSourceCcySz(), "0") && C33129mqd.OLrzqt((java.lang.CharSequence) gridReq.getSourceCcy())) {
            c56236xyx.AhwBna(gridReq.getSourceCcySz());
            c56236xyx.valueOf(gridReq.getSourceCcy());
        }
        java.util.Iterator<T> it = gridReq.getSignParams().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((AdvancedTriggerSign) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                break;
            }
        }
        AdvancedTriggerSign advancedTriggerSign = (AdvancedTriggerSign) next;
        c56236xyx.fetchVPNInfo(advancedTriggerSign != null ? advancedTriggerSign.getIndicator() : null);
        if (Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSign != null ? advancedTriggerSign.getIndicator() : null), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            c56236xyx.values(advancedTriggerSign.getTriggerPx());
        } else {
            c56236xyx.values(null);
        }
        c56236xyx.djBIcL(gridReq.getTradeQuoteCcy());
        c56236xyx.djBIcL();
        c56236xyx.OLrzqt(this.AEQbTJ, new StateListAnimator());
        xKK.Activity.execute$default(c56236xyx, 0L, 1, null);
        return this.AEQbTJ;
    }
}
