package o;

import androidx.lifecycle.LiveData;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vTG implements InterfaceC56005xue {
    public final boolean AEQbTJ;
    public final AutoVipProfitInfo AYXKKw;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C55887xsS copydefault;
    public final BotOrderConfirmPresenter.VoucherTagDisplayInfo djBIcL;
    public final ContractGridReq gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        this.copydefault = c55887xsS;
    }

    public java.lang.Void AYXKKw() {
        return null;
    }

    @Override // o.InterfaceC56005xue
    public /* synthetic */ LiveData OLrzqt() {
        return (LiveData) AYXKKw();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vTG(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ContractGridReq contractGridReq, boolean z, AutoVipProfitInfo autoVipProfitInfo, BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo) {
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        this.KWHzl = str;
        this.valueOf = str2;
        this.gEmmrt = contractGridReq;
        this.AEQbTJ = z;
        this.AYXKKw = autoVipProfitInfo;
        this.djBIcL = voucherTagDisplayInfo;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vTG.OLrzqt(this.KWHzl);
            }
        });
        java.lang.String tpTriggerPx = contractGridReq != null ? contractGridReq.getTpTriggerPx() : null;
        if (tpTriggerPx == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpTriggerPx)) {
            java.lang.String slTriggerPx = contractGridReq != null ? contractGridReq.getSlTriggerPx() : null;
            if (slTriggerPx == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slTriggerPx)) {
                java.lang.String tpRatio = contractGridReq != null ? contractGridReq.getTpRatio() : null;
                if (tpRatio == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpRatio)) {
                    java.lang.String slRatio = contractGridReq != null ? contractGridReq.getSlRatio() : null;
                    z2 = slRatio == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slRatio);
                }
            }
        }
        this.EZpvd = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 com.okinc.unify_trade.biz.ContractGridReq)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:com.okinc.unify_trade.biz.AutoVipProfitInfo:?: TERNARY null = ((wrap:int:0x0009: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  false
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.util.List, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:51) call: com.okinc.unify_trade.biz.AutoVipProfitInfo.<init>(java.util.List, java.util.List, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.unify_trade.biz.AutoVipProfitInfo))
  (r20v0 com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter$VoucherTagDisplayInfo)
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ContractGridReq, boolean, com.okinc.unify_trade.biz.AutoVipProfitInfo, com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter$VoucherTagDisplayInfo):void (m)] (LINE:46) call: o.vTG.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ContractGridReq, boolean, com.okinc.unify_trade.biz.AutoVipProfitInfo, com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter$VoucherTagDisplayInfo):void type: THIS */
    public /* synthetic */ vTG(java.lang.String str, java.lang.String str2, ContractGridReq contractGridReq, boolean z, AutoVipProfitInfo autoVipProfitInfo, BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, contractGridReq, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null) : autoVipProfitInfo, voucherTagDisplayInfo);
    }

    public final C55887xsS valueOf() {
        C55887xsS c55887xsS = this.copydefault;
        if (c55887xsS != null) {
            return c55887xsS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.lang.String copydefault() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String OLrzqt(vTG vtg) {
        java.lang.String tradeSymbol;
        BizInstrument bizInstrumentAhwBna = new C55887xsS(vtg.valueOf, vtg.KWHzl).AhwBna();
        if (bizInstrumentAhwBna != null) {
            tradeSymbol = Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), java.lang.Boolean.TRUE) ? bizInstrumentAhwBna.getTradeSymbol() : bizInstrumentAhwBna.getQuoteSymbol();
        } else {
            tradeSymbol = null;
        }
        return tradeSymbol == null ? "" : tradeSymbol;
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String EZpvd() {
        return copydefault();
    }

    @Override // o.InterfaceC56005xue
    public java.lang.String KWHzl() {
        return C56033xvF.fmtBotValueBySymbol$default(copydefault(), this.gEmmrt.getSz(), null, true, null, false, null, null, null, null, null, 2036, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x025c  */
    @Override // o.InterfaceC56005xue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<android.os.Parcelable> AEQbTJ() {
        vTG vtg;
        java.lang.String strGEmmrt;
        java.lang.String strAYXKKw;
        java.lang.String tpTriggerPx;
        java.lang.String tpRatio;
        java.lang.String slTriggerPx;
        java.lang.String slRatio;
        java.util.ArrayList<AdvancedTriggerSign> signParams;
        AdvancedTriggerSign advancedTriggerSign;
        java.lang.String strOLrzqt;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ContextAwareKtwithContextAvailable2listener1), C56033xvF.getCoinTitle$default(this.valueOf, this.gEmmrt.getInstId(), false, null, null, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.onContextAvailable);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.clearAvailableContext);
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        java.lang.String direction = this.gEmmrt.getDirection();
        if (direction == null) {
            direction = "";
        }
        int iValueOf = C56033xvF.valueOf(direction);
        listOLrzqt2.add(new TacticsListLabelData(C56033xvF.AhwBna(direction), false, iValueOf, 0, 0, 26, null));
        listOLrzqt2.add(new TacticsListLabelData(C56033xvF.getBotLever$default(this.gEmmrt.getLever(), false, 2, null), false, iValueOf, 0, 0, 26, null));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.gEmmrt.getVoucherId())) {
            xMR xmr = xMR.copydefault;
            BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo = this.djBIcL;
            java.lang.String strAEQbTJ = voucherTagDisplayInfo != null ? voucherTagDisplayInfo.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            java.lang.String strCopydefault = xmr.copydefault(strAEQbTJ);
            BotOrderConfirmPresenter.VoucherTagDisplayInfo voucherTagDisplayInfo2 = this.djBIcL;
            if (voucherTagDisplayInfo2 == null || (strOLrzqt = voucherTagDisplayInfo2.OLrzqt()) == null) {
                strOLrzqt = "USDT";
            }
            listOLrzqt2.add(new TacticsListLabelVoucherData(strCopydefault + " " + strOLrzqt, false, 0, 0, 0, null, 62, null));
        }
        Unit unit = Unit.INSTANCE;
        listOLrzqt.add(new TacticsInsideItemData(strAYXKKw3, strAYXKKw2, null, 0, 0, 0, 0, 0, null, null, null, null, C56402yEa.fARcdN(listOLrzqt2), null, null, null, null, 126972, null));
        xMS xmsOLrzqt = C56059xvf.EZpvd.OLrzqt();
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.setPlaybackState);
        if (xmsOLrzqt != null) {
            vtg = this;
            strGEmmrt = xmsOLrzqt.gEmmrt(vtg.gEmmrt.getMinPx());
        } else {
            vtg = this;
            strGEmmrt = null;
        }
        listOLrzqt.add(new TacticsInsideItemData(strAYXKKw4, xVG.KWHzl(strGEmmrt), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowCustomEnabled), xVG.KWHzl(xmsOLrzqt != null ? xmsOLrzqt.gEmmrt(vtg.gEmmrt.getMaxPx()) : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.getCallerInput);
        xMR xmr2 = xMR.copydefault;
        listOLrzqt.add(new TacticsInsideItemData(strAYXKKw5, xmr2.copydefault(vtg.gEmmrt.getGridNum()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        vtg.AEQbTJ(new C55887xsS(vtg.valueOf, vtg.KWHzl));
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt(valueOf().ejfBZ(), "contract_grid")) {
            ContractGridReq contractGridReq = vtg.gEmmrt;
            java.lang.String profitSharingRatio = contractGridReq != null ? contractGridReq.getProfitSharingRatio() : null;
            java.lang.String str = C33129mqd.OLrzqt((java.lang.CharSequence) profitSharingRatio) ? profitSharingRatio : null;
            if (str != null) {
                listOLrzqt.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2), xMR.formatPercent$default(xmr2, str, 0, null, 4, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
        }
        AutoVipProfitInfo autoVipProfitInfo = vtg.AYXKKw;
        if (C33129mqd.KWHzl((java.util.Collection) (autoVipProfitInfo != null ? autoVipProfitInfo.getAutoStake() : null))) {
            AutoVipProfitInfo autoVipProfitInfo2 = vtg.AYXKKw;
            java.util.List<AutoEarnStakingConfig> autoEarn = autoVipProfitInfo2 != null ? autoVipProfitInfo2.getAutoEarn() : null;
            AutoVipProfitInfo autoVipProfitInfo3 = vtg.AYXKKw;
            java.util.List<AutoEarnStakingConfig> autoStake = autoVipProfitInfo3 != null ? autoVipProfitInfo3.getAutoStake() : null;
            AutoVipProfitInfo autoVipProfitInfo4 = vtg.AYXKKw;
            listOLrzqt.add(new AutoVipProfitInfo((java.util.List) autoEarn, (java.util.List) autoStake, autoVipProfitInfo4 != null ? autoVipProfitInfo4.getVipLevel() : null, false, false, 24, (DefaultConstructorMarker) null));
        } else {
            AutoVipProfitInfo autoVipProfitInfo5 = vtg.AYXKKw;
            if (C33129mqd.KWHzl((java.util.Collection) (autoVipProfitInfo5 != null ? autoVipProfitInfo5.getAutoEarn() : null))) {
            }
        }
        if (!vtg.AEQbTJ) {
            listOLrzqt.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat3), 8.0f, 0.0f, 0, 0, 16, 24, (DefaultConstructorMarker) null));
            ContractGridReq contractGridReq2 = vtg.gEmmrt;
            java.lang.String openPosSlippage = contractGridReq2 != null ? contractGridReq2.getOpenPosSlippage() : null;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) openPosSlippage) || !C33129mqd.AEQbTJ(openPosSlippage, "0")) {
                openPosSlippage = null;
            }
            if (openPosSlippage != null) {
                java.lang.String strEZpvd = xmr2.EZpvd(openPosSlippage, 4, 0, RoundingMode.FLOOR);
                java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.onSessionDestroyed);
                ContractGridReq contractGridReq3 = vtg.gEmmrt;
                if (contractGridReq3 != null && Intrinsics.EZpvd(contractGridReq3.getOpenPosSlippageDefault(), java.lang.Boolean.TRUE)) {
                    strEZpvd = C33069mpW.copydefault(C55688xof.Application.onShuffleModeChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("slippagePct", strEZpvd)));
                }
                listOLrzqt.add(new TacticsInsideItemData(strAYXKKw6, strEZpvd, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton);
            ContractGridReq contractGridReq4 = vtg.gEmmrt;
            listOLrzqt.add(new TacticsInsideItemData(strAYXKKw7, vtg.OLrzqt(contractGridReq4 != null ? contractGridReq4.getSignParams() : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            ContractGridReq contractGridReq5 = vtg.gEmmrt;
            if (!Intrinsics.EZpvd((java.lang.Object) (contractGridReq5 != null ? contractGridReq5.getDirection() : null), (java.lang.Object) "neutral")) {
                TacticsInsideItemData tacticsInsideItemData = new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131071, null);
                tacticsInsideItemData.setTitle(C33070mpX.AYXKKw(C55688xof.Application.onCreatePanelMenu));
                ContractGridReq contractGridReq6 = vtg.gEmmrt;
                tacticsInsideItemData.setText((contractGridReq6 == null || !Intrinsics.EZpvd(contractGridReq6.getBasePos(), java.lang.Boolean.TRUE)) ? C33070mpX.AYXKKw(C55688xof.Application.isSessionReady) : C33070mpX.AYXKKw(C55688xof.Application.registerCallback));
                listOLrzqt.add(tacticsInsideItemData);
            }
            java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved);
            ContractGridReq contractGridReq7 = vtg.gEmmrt;
            listOLrzqt.add(new TacticsInsideItemData(strAYXKKw8, vtg.copydefault(contractGridReq7 != null ? contractGridReq7.getSignParams() : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C55688xof.Application.isEnabled);
            ContractGridReq contractGridReq8 = vtg.gEmmrt;
            if (Intrinsics.EZpvd((java.lang.Object) ((contractGridReq8 == null || (signParams = contractGridReq8.getSignParams()) == null || (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(signParams)) == null) ? null : advancedTriggerSign.getStopType()), (java.lang.Object) "1")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getSessionActivity);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatCallback);
            }
            listOLrzqt.add(new TacticsInsideItemData(strAYXKKw9, strAYXKKw, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            if (!vtg.EZpvd) {
                java.lang.String str2 = vtg.valueOf;
                java.lang.String str3 = vtg.KWHzl;
                ContractGridReq contractGridReq9 = vtg.gEmmrt;
                if (contractGridReq9 == null || (tpTriggerPx = contractGridReq9.getTpTriggerPx()) == null) {
                    tpTriggerPx = "";
                }
                ContractGridReq contractGridReq10 = vtg.gEmmrt;
                if (contractGridReq10 == null || (tpRatio = contractGridReq10.getTpRatio()) == null) {
                    tpRatio = "";
                }
                kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = C56037xvJ.OLrzqt(str2, str3, tpTriggerPx, tpRatio);
                java.lang.String str4 = vtg.valueOf;
                java.lang.String str5 = vtg.KWHzl;
                ContractGridReq contractGridReq11 = vtg.gEmmrt;
                if (contractGridReq11 == null || (slTriggerPx = contractGridReq11.getSlTriggerPx()) == null) {
                    slTriggerPx = "";
                }
                ContractGridReq contractGridReq12 = vtg.gEmmrt;
                if (contractGridReq12 == null || (slRatio = contractGridReq12.getSlRatio()) == null) {
                    slRatio = "";
                }
                kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = C56037xvJ.KWHzl(str4, str5, slTriggerPx, slRatio);
                listOLrzqt.add(new TacticsInsideItemData(pairOLrzqt.getFirst(), pairOLrzqt.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                listOLrzqt.add(new TacticsInsideItemData(pairKWHzl.getFirst(), pairKWHzl.getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            }
            java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C55688xof.Application.removeOnMenuVisibilityListener);
            ContractGridReq contractGridReq13 = vtg.gEmmrt;
            java.lang.String runType = contractGridReq13 != null ? contractGridReq13.getRunType() : null;
            java.lang.String strAYXKKw11 = (!Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "1") && Intrinsics.EZpvd((java.lang.Object) runType, (java.lang.Object) "2")) ? C33070mpX.AYXKKw(C55688xof.Application.setQueue) : C33070mpX.AYXKKw(C55688xof.Application.setPlaybackToRemote);
            listOLrzqt.add(new TacticsInsideItemData(strAYXKKw10, strAYXKKw11, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        listOLrzqt.add(new TacticsInsideLineItemData(0, 0, 0, 4, null));
        listOLrzqt.add(new BotRemindData(C33070mpX.AYXKKw(C55688xof.Application.MediaDescriptionCompatBuilder) + "\n" + C33069mpW.copydefault(C55688xof.Application.dispatchMenuVisibilityChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", strAYXKKw2))), 0, 0, null, 14, null));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final java.lang.String OLrzqt(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        AdvancedTriggerSign advancedTriggerSign;
        java.lang.String botPrice$default;
        java.lang.String triggerPx;
        java.lang.String triggerPx2;
        AdvancedTriggerSign advancedTriggerSign2;
        if (Intrinsics.EZpvd((java.lang.Object) ((arrayList == null || (advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) == null) ? null : advancedTriggerSign2.getIndicator()), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            AdvancedTriggerSign advancedTriggerSign3 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            if (advancedTriggerSign3 == null || (triggerPx = advancedTriggerSign3.getTriggerPx()) == null || !C33129mqd.OLrzqt((java.lang.CharSequence) triggerPx)) {
                botPrice$default = "--";
            } else {
                java.lang.String str = this.valueOf;
                java.lang.String str2 = this.KWHzl;
                AdvancedTriggerSign advancedTriggerSign4 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                if (advancedTriggerSign4 == null || (triggerPx2 = advancedTriggerSign4.getTriggerPx()) == null) {
                    triggerPx2 = "";
                }
                botPrice$default = C56033xvF.getBotPrice$default(str, str2, triggerPx2, true, false, RoundingMode.HALF_UP, null, 80, null);
            }
            GridStartTriggerType.Application application = GridStartTriggerType.Companion;
            AdvancedTriggerSign advancedTriggerSign5 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            return application.copydefault(advancedTriggerSign5 != null ? advancedTriggerSign5.getIndicator() : null) + " | " + botPrice$default;
        }
        GridStartTriggerType.Application application2 = GridStartTriggerType.Companion;
        if (arrayList != null && (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(arrayList)) != null) {
            indicator = advancedTriggerSign.getIndicator();
        }
        return application2.copydefault(indicator);
    }

    public final java.lang.String copydefault(java.util.ArrayList<AdvancedTriggerSign> arrayList) {
        AdvancedTriggerSign advancedTriggerSign;
        java.lang.String botPrice$default;
        java.lang.String triggerPx;
        AdvancedTriggerSign advancedTriggerSign2;
        if (Intrinsics.EZpvd((java.lang.Object) ((arrayList == null || (advancedTriggerSign2 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList)) == null) ? null : advancedTriggerSign2.getIndicator()), (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
            AdvancedTriggerSign advancedTriggerSign3 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (advancedTriggerSign3 != null ? advancedTriggerSign3.getTriggerPx() : null))) {
                java.lang.String str = this.valueOf;
                java.lang.String str2 = this.KWHzl;
                AdvancedTriggerSign advancedTriggerSign4 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                if (advancedTriggerSign4 == null || (triggerPx = advancedTriggerSign4.getTriggerPx()) == null) {
                    triggerPx = "";
                }
                botPrice$default = C56033xvF.getBotPrice$default(str, str2, triggerPx, true, false, RoundingMode.HALF_UP, null, 80, null);
            } else {
                botPrice$default = "--";
            }
            GridStopTriggerType.StateListAnimator stateListAnimator = GridStopTriggerType.Companion;
            AdvancedTriggerSign advancedTriggerSign5 = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList);
            return stateListAnimator.EZpvd(advancedTriggerSign5 != null ? advancedTriggerSign5.getIndicator() : null) + " | " + botPrice$default;
        }
        GridStopTriggerType.StateListAnimator stateListAnimator2 = GridStopTriggerType.Companion;
        if (arrayList != null && (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.wlaJM(arrayList)) != null) {
            indicator = advancedTriggerSign.getIndicator();
        }
        return stateListAnimator2.EZpvd(indicator);
    }

    @Override // o.InterfaceC56005xue
    public void EZpvd(@NotNull java.lang.Object obj) {
        java.lang.String runType;
        Intrinsics.checkNotNullParameter(obj, "");
        if (!Intrinsics.EZpvd((java.lang.Object) "contract_grid", (java.lang.Object) this.gEmmrt.getOrdType()) || this.gEmmrt.getMaxPx().length() == 0 || this.gEmmrt.getMinPx().length() == 0 || this.gEmmrt.getGridNum().length() == 0 || (runType = this.gEmmrt.getRunType()) == null || runType.length() == 0) {
            return;
        }
        vTC vtc = obj instanceof vTC ? (vTC) obj : null;
        if (vtc != null) {
            vtc.KWHzl(this.KWHzl, this.gEmmrt);
        }
    }
}
