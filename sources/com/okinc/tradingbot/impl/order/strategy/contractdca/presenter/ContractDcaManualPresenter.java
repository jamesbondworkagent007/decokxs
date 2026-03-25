package com.okinc.tradingbot.impl.order.strategy.contractdca.presenter;

import android.app.Application;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.BotOrderItem;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.order.strategy.contractdca.model.ContractDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaManualPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.ContractDcaLiqPxResult;
import com.okinc.unify_trade.biz.ContractLeverTierLimitResult;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.DcaLeadShareMode;
import com.okinc.unify_trade.bot.config.SpotDcaInvestTypeData;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.util.dca.DcaPreviewData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C47988uAv;
import o.C48033uCm;
import o.C53467wlz;
import o.C54149wys;
import o.C54507xKz;
import o.C54782xVc;
import o.C55688xof;
import o.C55886xsR;
import o.C56045xvR;
import o.C56111xwe;
import o.C56153xxT;
import o.C56181xxv;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.InterfaceC54501xKt;
import o.InterfaceC55881xsM;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.pUU;
import o.wTJ;
import o.xKK;
import o.xMJ;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ContractDcaManualPresenter extends ContractDcaBasePresenter {
    public final TradeLiveData<String> AYXKKw;
    public final TradeLiveData<Boolean> AkhnZx;
    public final MediatorLiveData<Unit> AuCTel;
    public final TradeLiveData<String> DbNXlk;
    public final TradeLiveData<Boolean> ejfBZ;
    public final TradeLiveData<String> fARcdN;
    public final TradeLiveData<String> fIwbmz;
    public final TradeLiveData<Triple<String, Boolean, Boolean>> fJNWhG;
    public final C56181xxv fetchVPNInfo;
    public final C56153xxT isConnected;
    public final TradeLiveData<ContractLeverTierLimitResult> iwGUEr;
    public final C56111xwe<Boolean> valueOf;
    public final MediatorLiveData<Unit> values;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> AubY() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> ejfBZ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Triple<String, Boolean, Boolean>> getFieldNames() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> getNewProxyInstance() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<Unit> hDKMBd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56181xxv iwGUEr() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ContractLeverTierLimitResult> sSMYrx() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> uzCIH() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<Boolean> values() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<Unit> wlaJM() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> zLjUOn() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> zsXlph() {
        return this.ejfBZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDcaManualPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.fARcdN = new TradeLiveData<>();
        this.fIwbmz = new TradeLiveData<>();
        this.ejfBZ = new TradeLiveData<>();
        this.valueOf = new C56111xwe<>();
        this.AYXKKw = new TradeLiveData<>();
        this.AkhnZx = new TradeLiveData<>();
        this.fetchVPNInfo = new C56181xxv();
        this.fJNWhG = new TradeLiveData<>();
        this.isConnected = new C56153xxT();
        this.iwGUEr = new TradeLiveData<>();
        this.DbNXlk = new TradeLiveData<>();
        final MediatorLiveData<Unit> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(C54782xVc.AEQbTJ.AhwBna(), new StateListAnimator(new Function1() { // from class: o.vCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractDcaManualPresenter.AEQbTJ(mediatorLiveData, (xMJ.Application) obj);
            }
        }));
        mediatorLiveData.addSource(valueOf(), new StateListAnimator(new Function1() { // from class: o.vCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractDcaManualPresenter.KWHzl(mediatorLiveData, (StrategyConfigInfo) obj);
            }
        }));
        this.AuCTel = mediatorLiveData;
        final MediatorLiveData<Unit> mediatorLiveData2 = new MediatorLiveData<>();
        mediatorLiveData2.addSource(mediatorLiveData, new StateListAnimator(new Function1() { // from class: o.vCf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractDcaManualPresenter.copydefault(mediatorLiveData2, (Unit) obj);
            }
        }));
        mediatorLiveData2.addSource(AYXKKw(), new StateListAnimator(new Function1() { // from class: o.vCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractDcaManualPresenter.OLrzqt(mediatorLiveData2, (LimitPriceData) obj);
            }
        }));
        this.values = mediatorLiveData2;
    }

    public final void EZpvd(@NotNull ContractDcaAdvancedParams contractDcaAdvancedParams) {
        Intrinsics.checkNotNullParameter(contractDcaAdvancedParams, "");
        copydefault().setValue(contractDcaAdvancedParams);
    }

    public final ContractDcaAdvancedParams AkhnZx() {
        return copydefault().getValue();
    }

    public final String zuBGHE() {
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
        if (contractDcaAdvancedParamsAkhnZx != null) {
            return contractDcaAdvancedParamsAkhnZx.valueOf();
        }
        return null;
    }

    public final String AuCTelauCTel() {
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
        if (contractDcaAdvancedParamsAkhnZx != null) {
            return contractDcaAdvancedParamsAkhnZx.KWHzl();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ContractDcaAdvancedParams EZpvd(DcaOrderReq dcaOrderReq) {
        BotRangeConfig slPct;
        String slPct2;
        String str;
        BotRangeConfig volMult;
        String volMult2;
        String str2;
        BotRangeConfig pxStepsMult;
        String pxStepsMult2;
        String str3;
        DcaTriggerParam dcaTriggerParamAuCTel;
        DcaTriggerParam dcaTriggerParamFJNWhG;
        List<DcaTriggerParam> triggerParams;
        Object next;
        List<DcaTriggerParam> triggerParams2;
        Object next2;
        if (C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getSlPct() : null, 0)) {
            if (dcaOrderReq != null) {
                slPct2 = dcaOrderReq.getSlPct();
                str = slPct2;
            }
            str = null;
        } else {
            StrategyConfigInfo value = valueOf().getValue();
            if (value != null && (slPct = value.getSlPct()) != null) {
                slPct2 = slPct.getDefault();
                str = slPct2;
            }
            str = null;
        }
        if (C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getVolMult() : null, 0)) {
            if (dcaOrderReq != null) {
                volMult2 = dcaOrderReq.getVolMult();
                str2 = volMult2;
            }
            str2 = null;
        } else {
            StrategyConfigInfo value2 = valueOf().getValue();
            if (value2 != null && (volMult = value2.getVolMult()) != null) {
                volMult2 = volMult.getDefault();
                str2 = volMult2;
            }
            str2 = null;
        }
        if (C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getPxStepsMult() : null, 0)) {
            if (dcaOrderReq != null) {
                pxStepsMult2 = dcaOrderReq.getPxStepsMult();
                str3 = pxStepsMult2;
            }
            str3 = null;
        } else {
            StrategyConfigInfo value3 = valueOf().getValue();
            if (value3 != null && (pxStepsMult = value3.getPxStepsMult()) != null) {
                pxStepsMult2 = pxStepsMult.getDefault();
                str3 = pxStepsMult2;
            }
            str3 = null;
        }
        if (dcaOrderReq == null || (triggerParams2 = dcaOrderReq.getTriggerParams()) == null) {
            dcaTriggerParamAuCTel = AuCTel();
        } else {
            Iterator<T> it = triggerParams2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) next2;
                if (Intrinsics.EZpvd((Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerAction() : null), (Object) TtmlNode.START)) {
                    break;
                }
            }
            DcaTriggerParam dcaTriggerParamEZpvd = (DcaTriggerParam) next2;
            if (dcaTriggerParamEZpvd != null) {
                if (Intrinsics.EZpvd((Object) dcaTriggerParamEZpvd.getTriggerStrategy(), (Object) "--")) {
                    ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
                    dcaTriggerParamEZpvd = contractDcaAdvancedParamsAkhnZx != null ? contractDcaAdvancedParamsAkhnZx.EZpvd() : null;
                }
                if (dcaTriggerParamEZpvd != null) {
                    dcaTriggerParamAuCTel = dcaTriggerParamEZpvd;
                }
            }
        }
        if (dcaOrderReq == null || (triggerParams = dcaOrderReq.getTriggerParams()) == null) {
            dcaTriggerParamFJNWhG = fJNWhG();
        } else {
            Iterator<T> it2 = triggerParams.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
                if (Intrinsics.EZpvd((Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerAction() : null), (Object) "stop")) {
                    break;
                }
            }
            DcaTriggerParam dcaTriggerParamAYXKKw = (DcaTriggerParam) next;
            if (dcaTriggerParamAYXKKw != null) {
                if (Intrinsics.EZpvd((Object) dcaTriggerParamAYXKKw.getTriggerStrategy(), (Object) "--")) {
                    ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx2 = AkhnZx();
                    dcaTriggerParamAYXKKw = contractDcaAdvancedParamsAkhnZx2 != null ? contractDcaAdvancedParamsAkhnZx2.AYXKKw() : null;
                }
                if (dcaTriggerParamAYXKKw != null) {
                    dcaTriggerParamFJNWhG = dcaTriggerParamAYXKKw;
                }
            }
        }
        String slMode = dcaOrderReq != null ? dcaOrderReq.getSlMode() : null;
        return new ContractDcaAdvancedParams(dcaTriggerParamAuCTel, dcaTriggerParamFJNWhG, str, str2, str3, (slMode == null || slMode.length() == 0) ? ContractDcaStopLossType.MARKET.getMode() : slMode, dcaOrderReq != null ? Boolean.valueOf(dcaOrderReq.isToManual()) : null);
    }

    public final DcaTriggerParam fARcdN() {
        StrategyConfigInfo value;
        BotRangeConfig rsiOverboughtThold;
        StrategyConfigInfo value2;
        BotRangeConfig rsiOverboughtThold2;
        StrategyConfigInfo value3;
        StrategyConfigInfo value4;
        String mode = ContractDcaTriggerType.RSI.getMode();
        String str = (!Intrinsics.EZpvd((Object) OLrzqt().getValue(), (Object) "long") ? !((value = valueOf().getValue()) == null || (rsiOverboughtThold = value.getRsiOverboughtThold()) == null) : !((value4 = valueOf().getValue()) == null || (rsiOverboughtThold = value4.getRsiOversoldThold()) == null)) ? null : rsiOverboughtThold.getDefault();
        String warning = (!Intrinsics.EZpvd((Object) OLrzqt().getValue(), (Object) "long") ? !((value2 = valueOf().getValue()) == null || (rsiOverboughtThold2 = value2.getRsiOverboughtThold()) == null) : !((value3 = valueOf().getValue()) == null || (rsiOverboughtThold2 = value3.getRsiOversoldThold()) == null)) ? null : rsiOverboughtThold2.getWarning();
        StrategyConfigInfo value5 = valueOf().getValue();
        return new DcaTriggerParam(TtmlNode.START, mode, (Intrinsics.EZpvd((Object) OLrzqt().getValue(), (Object) "long") ? TriggerCond.CROSS_DOWN : TriggerCond.CROSS_UP).getMode(), (String) null, str, warning, "14", value5 != null ? value5.getDefaultKlineTimeframe() : null, (String) null, (String) null, 776, (DefaultConstructorMarker) null);
    }

    public final DcaTriggerParam AuCTel() {
        return new DcaTriggerParam(TtmlNode.START, ContractDcaTriggerType.INSTANT.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null);
    }

    public final DcaTriggerParam fJNWhG() {
        return new DcaTriggerParam("stop", ContractDcaStopConditionType.DEFAULT.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null);
    }

    public static final Unit AEQbTJ(MediatorLiveData mediatorLiveData, xMJ.Application application) {
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.setValue(unit);
        return unit;
    }

    public static final Unit KWHzl(MediatorLiveData mediatorLiveData, StrategyConfigInfo strategyConfigInfo) {
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.setValue(unit);
        return unit;
    }

    public static final Unit copydefault(MediatorLiveData mediatorLiveData, Unit unit) {
        Unit unit2 = Unit.INSTANCE;
        mediatorLiveData.setValue(unit2);
        return unit2;
    }

    public static final Unit OLrzqt(MediatorLiveData mediatorLiveData, LimitPriceData limitPriceData) {
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.setValue(unit);
        return unit;
    }

    public final void gHZMYf() {
        this.valueOf.setValue(Boolean.TRUE);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt().setValue(str);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.setValue(str);
    }

    public final List<TradeMenuItemBean> AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DcaLeadShareMode[] dcaLeadShareModeArrValues = DcaLeadShareMode.values();
        ArrayList arrayList = new ArrayList(dcaLeadShareModeArrValues.length);
        for (DcaLeadShareMode dcaLeadShareMode : dcaLeadShareModeArrValues) {
            arrayList.add(new TradeMenuItemBean(C33070mpX.AYXKKw(dcaLeadShareMode.getShowMode()), Intrinsics.EZpvd((Object) dcaLeadShareMode.getMode(), (Object) str), dcaLeadShareMode.getMode(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, boolean z, String str8, boolean z2, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (fetchVPNInfo() && DbNXlk()) {
            String hundredQuot$default = C33129mqd.AEQbTJ(str, 0) ? xMR.formatHundredQuot$default(xMR.copydefault, str, 0, false, null, 14, null) : "";
            if (AEQbTJ(hundredQuot$default, str5)) {
                C56111xwe<Boolean> c56111xwe = this.valueOf;
                Boolean bool = Boolean.TRUE;
                c56111xwe.postValue(bool);
                pUU.KWHzl("BotOrder", "ContractDca 手动下单 Start Order");
                String strGEmmrt = fvQaOB().gEmmrt();
                String strAuCTelauCTel = AuCTelauCTel();
                String strZuBGHE = zuBGHE();
                String hundredQuot$default2 = xMR.formatHundredQuot$default(xMR.copydefault, str2, 0, false, null, 14, null);
                ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
                String strOLrzqt = contractDcaAdvancedParamsAkhnZx != null ? contractDcaAdvancedParamsAkhnZx.OLrzqt() : null;
                String value = OLrzqt().getValue();
                String mode = SpotDcaInvestTypeData.MANUAL.getMode();
                String value2 = this.AYXKKw.getValue();
                String value3 = this.DbNXlk.getValue();
                ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx2 = AkhnZx();
                EZpvd(new DcaOrderReq(strGEmmrt, str3, bool, str4, str5, hundredQuot$default, strAuCTelauCTel, strZuBGHE, hundredQuot$default2, strOLrzqt, value, mode, value2, (String) null, (String) null, value3, contractDcaAdvancedParamsAkhnZx2 != null ? contractDcaAdvancedParamsAkhnZx2.AEQbTJ() : null, (List) isConnected(), (String) null, copydefault(str7), copydefault(str6), (String) null, String.valueOf(z2), false, z, str8, (String) null, "SWAP", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, C54149wys.AEQbTJ.EZpvd(valueOf().getValue()), -190554112, 7, (DefaultConstructorMarker) null), fragmentManager);
            }
        }
    }

    public final wTJ AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        String strGEmmrt = fvQaOB().gEmmrt();
        String strDivS$default = C33129mqd.AEQbTJ(str4, 0) ? C33129mqd.divS$default(str3, 100, null, null, null, 14, null) : null;
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
        String strKWHzl = contractDcaAdvancedParamsAkhnZx != null ? contractDcaAdvancedParamsAkhnZx.KWHzl() : null;
        String str6 = strKWHzl == null ? "" : strKWHzl;
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx2 = AkhnZx();
        String strValueOf = contractDcaAdvancedParamsAkhnZx2 != null ? contractDcaAdvancedParamsAkhnZx2.valueOf() : null;
        String str7 = strValueOf == null ? "" : strValueOf;
        String strDivS$default2 = C33129mqd.divS$default(str5, 100, null, null, null, 14, null);
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx3 = AkhnZx();
        String strOLrzqt = contractDcaAdvancedParamsAkhnZx3 != null ? contractDcaAdvancedParamsAkhnZx3.OLrzqt() : null;
        return new wTJ("contract_dca", strGEmmrt, str, str2, str4, strDivS$default, str6, str7, strDivS$default2, strOLrzqt == null ? "" : strOLrzqt, OLrzqt().getValue(), this.DbNXlk.getValue());
    }

    public final Triple<BotOrderItem, ArrayList<BotOrderItem>, DcaPreviewData> EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C53467wlz.copydefault.EZpvd(KWHzl(str, str2, str3, str4, str5));
    }

    public final List<DcaPreviewData> KWHzl(String str, String str2, String str3, String str4, String str5) {
        String strAYXKKw;
        String hundredQuot$default = C33129mqd.AEQbTJ(str3, 0) ? xMR.formatHundredQuot$default(xMR.copydefault, str3, 0, false, null, 14, null) : "";
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
        DcaTriggerParam dcaTriggerParamEZpvd = contractDcaAdvancedParamsAkhnZx != null ? contractDcaAdvancedParamsAkhnZx.EZpvd() : null;
        if (Intrinsics.EZpvd((Object) (dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerStrategy() : null), (Object) ContractDcaTriggerType.PRICE.getMode())) {
            strAYXKKw = dcaTriggerParamEZpvd.getTriggerPx();
        } else {
            xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
            strAYXKKw = value != null ? value.AYXKKw() : null;
        }
        C56045xvR c56045xvR = C56045xvR.KWHzl;
        boolean zEZpvd = Intrinsics.EZpvd((Object) OLrzqt().getValue(), (Object) "short");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strAYXKKw);
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(str);
        BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(str2);
        BigDecimal bigDecimalEZpvd4 = C33129mqd.EZpvd(hundredQuot$default);
        int iAhwBna = C33129mqd.AhwBna(str4);
        BigDecimal bigDecimalEZpvd5 = C33129mqd.EZpvd(str5);
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx2 = AkhnZx();
        BigDecimal bigDecimalEZpvd6 = C33129mqd.EZpvd(contractDcaAdvancedParamsAkhnZx2 != null ? contractDcaAdvancedParamsAkhnZx2.KWHzl() : null);
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx3 = AkhnZx();
        return c56045xvR.copydefault(zEZpvd, bigDecimalEZpvd, bigDecimalEZpvd2, bigDecimalEZpvd3, bigDecimalEZpvd4, iAhwBna, bigDecimalEZpvd5, bigDecimalEZpvd6, C33129mqd.EZpvd(contractDcaAdvancedParamsAkhnZx3 != null ? contractDcaAdvancedParamsAkhnZx3.valueOf() : null));
    }

    private final boolean AEQbTJ(String str, String str2) {
        String strEZpvd = C56045xvR.KWHzl.EZpvd(str, str2, AuCTelauCTel());
        if (Intrinsics.EZpvd((Object) OLrzqt().getValue(), (Object) "long") && C33129mqd.copydefault((Object) strEZpvd, (Object) 1)) {
            this.fARcdN.postValue(C33069mpW.copydefault(C55688xof.Application.fVjYLc, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xMR.copydefault, strEZpvd, 0, null, 6, null)))));
            this.valueOf.postValue(Boolean.FALSE);
            return false;
        }
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
        String strOLrzqt = contractDcaAdvancedParamsAkhnZx != null ? contractDcaAdvancedParamsAkhnZx.OLrzqt() : null;
        if (!C33129mqd.AEQbTJ(strOLrzqt, 0) || !C33129mqd.valueOf(strOLrzqt, strEZpvd)) {
            return true;
        }
        this.fIwbmz.postValue(C33069mpW.copydefault(C55688xof.Application.dbwnZN, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xMR.copydefault, strEZpvd, 0, null, 6, null)))));
        this.valueOf.postValue(Boolean.FALSE);
        return false;
    }

    public final String copydefault(String str) {
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault == null || !interfaceC55881xsMCopydefault.OLrzqt(fvQaOB().ejfBZ(), "contract_dca")) {
            return null;
        }
        return str;
    }

    public final List<DcaTriggerParam> isConnected() {
        DcaTriggerParam[] dcaTriggerParamArr = new DcaTriggerParam[2];
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
        dcaTriggerParamArr[0] = contractDcaAdvancedParamsAkhnZx != null ? contractDcaAdvancedParamsAkhnZx.EZpvd() : null;
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx2 = AkhnZx();
        dcaTriggerParamArr[1] = contractDcaAdvancedParamsAkhnZx2 != null ? contractDcaAdvancedParamsAkhnZx2.AYXKKw() : null;
        List listGEmmrt = yDY.gEmmrt(dcaTriggerParamArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listGEmmrt) {
            DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) obj;
            if (C33129mqd.OLrzqt((CharSequence) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String strZuBGHE = zuBGHE();
        if (strZuBGHE == null) {
            strZuBGHE = "";
        }
        String strEZpvd = EZpvd(str, str2, str3, strZuBGHE);
        if (!C33129mqd.AEQbTJ(str2, 0)) {
            strEZpvd = AEQbTJ(str, str3, str2);
        }
        String str6 = strEZpvd;
        this.AYXKKw.postValue(str6);
        if (C33129mqd.OLrzqt((CharSequence) str6) && C33129mqd.OLrzqt((CharSequence) str5)) {
            this.AkhnZx.postValue(Boolean.valueOf(C33129mqd.AEQbTJ(str6, str5)));
        }
        String strZuBGHE2 = zuBGHE();
        String str7 = strZuBGHE2 == null ? "" : strZuBGHE2;
        String strAuCTelauCTel = AuCTelauCTel();
        OLrzqt(str6, str, str2, str3, str7, str4, strAuCTelauCTel == null ? "" : strAuCTelauCTel);
    }

    public final String KWHzl(String str, String str2, String str3) {
        String hundredQuot$default = "";
        if (C33129mqd.AEQbTJ(str, 0)) {
            hundredQuot$default = xMR.formatHundredQuot$default(xMR.copydefault, str == null ? "" : str, 0, false, null, 14, null);
        }
        return super.KWHzl(hundredQuot$default, AuCTelauCTel(), str2, zuBGHE(), str3, OLrzqt().getValue());
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaBasePresenter.handlePrecisionAmt$default(com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaBasePresenter, java.lang.String, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    public final String AEQbTJ(String str, String str2, String str3) {
        if (StringsKt__StringsKt.fARcdN((CharSequence) str3)) {
            return "";
        }
        if (C33129mqd.OLrzqt((Object) str3, (Object) 0)) {
            str2 = "0";
        }
        return ContractDcaBasePresenter.handlePrecisionAmt$default(this, C33129mqd.addS$default(str, str2, null, null, null, 14, null), null, 2, null);
    }

    public final String EZpvd(String str, String str2, String str3, String str4) {
        BotRangeConfig volMult;
        BotRangeConfig maxSafetyOrds;
        if (C33129mqd.valueOf(str2, 0)) {
            return "";
        }
        StrategyConfigInfo value = valueOf().getValue();
        if (!C33129mqd.AEQbTJ(str2, (value == null || (maxSafetyOrds = value.getMaxSafetyOrds()) == null) ? null : maxSafetyOrds.getMax())) {
            StrategyConfigInfo value2 = valueOf().getValue();
            if (!C33129mqd.AEQbTJ(str4, (value2 == null || (volMult = value2.getVolMult()) == null) ? null : volMult.getMax())) {
                return ContractDcaBasePresenter.handlePrecisionAmt$default(this, C33129mqd.addS$default(str, C56045xvR.KWHzl.copydefault(str3, str2, str4), null, null, null, 14, null), null, 2, null);
            }
        }
        return "";
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, boolean z, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (C33129mqd.valueOf(str, 0) || str3.length() == 0 || ((C33129mqd.AEQbTJ(str3, 0) && (C33129mqd.valueOf(str4, 0) || C33129mqd.valueOf(str2, 0))) || (C33129mqd.AEQbTJ(str3, 1) && C33129mqd.valueOf(str5, 0)))) {
            this.fJNWhG.postValue(new Triple<>("", Boolean.FALSE, Boolean.valueOf(z)));
            return;
        }
        C56181xxv c56181xxv = this.fetchVPNInfo;
        c56181xxv.copydefault(fvQaOB().gEmmrt(), str, str2, str3, str4, str5, str6, str7, str8, z ? null : AxsJAY());
        c56181xxv.djBIcL();
        c56181xxv.OLrzqt(this.fJNWhG, new TaskDescription(str3, str4, str5, str7, z));
        c56181xxv.OLrzqt(300L);
    }

    public static final class TaskDescription implements InterfaceC54501xKt<List<? extends ContractDcaLiqPxResult>, Triple<? extends String, ? extends Boolean, ? extends Boolean>> {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ String copydefault;

        public TaskDescription(String str, String str2, String str3, String str4, boolean z) {
            this.KWHzl = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.AEQbTJ = str4;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Triple<String, Boolean, Boolean> KWHzl(List<ContractDcaLiqPxResult> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ContractDcaLiqPxResult contractDcaLiqPxResult = (ContractDcaLiqPxResult) CollectionsKt___CollectionsKt.firstOrNull(list);
            String liqPx = contractDcaLiqPxResult != null ? contractDcaLiqPxResult.getLiqPx() : null;
            ContractDcaManualPresenter contractDcaManualPresenter = ContractDcaManualPresenter.this;
            String str = this.KWHzl;
            String str2 = this.copydefault;
            String str3 = this.OLrzqt;
            return new Triple<>(liqPx, Boolean.valueOf(contractDcaManualPresenter.copydefault(liqPx, str, str2, str3 == null ? "" : str3, this.AEQbTJ)), Boolean.valueOf(this.EZpvd));
        }
    }

    public final boolean copydefault(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (C33129mqd.valueOf(str, 0)) {
            return false;
        }
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        String strAYXKKw = value != null ? value.AYXKKw() : null;
        String strEZpvd = C56045xvR.KWHzl.EZpvd(str3, str2, str4);
        if (Intrinsics.EZpvd((Object) str5, (Object) "long")) {
            if (C33129mqd.AEQbTJ(str, C33129mqd.mulS$default(strAYXKKw, C33129mqd.subS$default(1, strEZpvd, null, null, null, 14, null), null, null, null, 14, null))) {
                return true;
            }
        } else if (C33129mqd.gEmmrt(str, C33129mqd.mulS$default(strAYXKKw, C33129mqd.addS$default(1, strEZpvd, null, null, null, 14, null), null, null, null, 14, null))) {
            return true;
        }
        return false;
    }

    public final void OLrzqt(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        String strAYXKKw = value != null ? value.AYXKKw() : null;
        if (C33129mqd.valueOf(str2, 0) || C33129mqd.valueOf(str, 0) || C33129mqd.valueOf(strAYXKKw, 0) || C33129mqd.valueOf(str4, 0)) {
            return;
        }
        String hundredQuot$default = C33129mqd.AEQbTJ(str6, 0) ? xMR.formatHundredQuot$default(xMR.copydefault, str6, 0, false, null, 14, null) : "";
        C56153xxT c56153xxT = this.isConnected;
        c56153xxT.AEQbTJ(fvQaOB().gEmmrt(), str2, str4, str3, hundredQuot$default, str7, str5, OLrzqt().getValue(), this.DbNXlk.getValue(), Boolean.TRUE);
        c56153xxT.OLrzqt(this.iwGUEr, new C54507xKz());
        c56153xxT.OLrzqt(300L);
    }

    public final boolean fetchVPNInfo() {
        ContractLeverTierLimitResult value = this.iwGUEr.getValue();
        if ((value != null ? value.getMaxLever() : null) == null) {
            return true;
        }
        ContractLeverTierLimitResult value2 = this.iwGUEr.getValue();
        return C33129mqd.copydefault(value2 != null ? value2.getMaxLever() : null, this.DbNXlk.getValue());
    }

    /* JADX DEBUG: Possible override for method com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaBasePresenter.DbNXlk()Ljava/lang/String; */
    public final boolean DbNXlk() {
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
        DcaTriggerParam dcaTriggerParamEZpvd = contractDcaAdvancedParamsAkhnZx != null ? contractDcaAdvancedParamsAkhnZx.EZpvd() : null;
        if (Intrinsics.EZpvd((Object) (dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerStrategy() : null), (Object) ContractDcaTriggerType.PRICE.getMode())) {
            return C33129mqd.AEQbTJ(dcaTriggerParamEZpvd.getTriggerPx(), 0);
        }
        return true;
    }

    public final String AxsJAY() {
        ContractDcaAdvancedParams contractDcaAdvancedParamsAkhnZx = AkhnZx();
        DcaTriggerParam dcaTriggerParamEZpvd = contractDcaAdvancedParamsAkhnZx != null ? contractDcaAdvancedParamsAkhnZx.EZpvd() : null;
        if (Intrinsics.EZpvd((Object) (dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTriggerStrategy() : null), (Object) ContractDcaTriggerType.PRICE.getMode())) {
            return dcaTriggerParamEZpvd.getTriggerPx();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull C47988uAv c47988uAv, BotRangeConfig botRangeConfig, String str, Function1<? super String, String> function1, @NotNull Function1<? super String, String> function12) {
        String min;
        String str2;
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Intrinsics.checkNotNullParameter(function12, "");
        int i = C48033uCm.Application.setSplitBackgroundDrawable;
        if (str == null) {
            min = botRangeConfig != null ? botRangeConfig.getMin() : null;
        } else {
            min = str;
        }
        c47988uAv.setTag(i, min);
        c47988uAv.setTag(C48033uCm.Application.setNavigationMode, botRangeConfig != null ? botRangeConfig.getMax() : null);
        String max = botRangeConfig != null ? botRangeConfig.getMax() : null;
        if (max == null || max.length() == 0) {
            String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invalidateMenu);
            String strInvoke = function12.invoke(str);
            if (strInvoke == null) {
                strInvoke = function12.invoke(botRangeConfig != null ? botRangeConfig.getMin() : null);
            }
            c47988uAv.setInputHint(strAYXKKw + " " + strInvoke);
        } else {
            if (!C33129mqd.gEmmrt(botRangeConfig != null ? botRangeConfig.getMax() : null, botRangeConfig != null ? botRangeConfig.getMin() : null)) {
                String strInvoke2 = function12.invoke(str);
                if (strInvoke2 == null) {
                    strInvoke2 = function12.invoke(botRangeConfig != null ? botRangeConfig.getMin() : null);
                }
                c47988uAv.setInputHint(strInvoke2 + "-" + ((Object) function12.invoke(botRangeConfig != null ? botRangeConfig.getMax() : null)));
            }
        }
        if (C33129mqd.AEQbTJ(botRangeConfig != null ? botRangeConfig.getDefault() : null, 0)) {
            if (function1 == null) {
                str2 = botRangeConfig != null ? botRangeConfig.getDefault() : null;
            } else {
                String strInvoke3 = function1.invoke(botRangeConfig != null ? botRangeConfig.getDefault() : null);
                if (strInvoke3 != null) {
                    str2 = strInvoke3;
                }
            }
            C47988uAv.setInputContent$default(c47988uAv, str2, false, false, 6, null);
        }
    }

    public final void EZpvd(@NotNull C47988uAv c47988uAv, @NotNull String str) {
        String strCopydefault = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strGEmmrt = C33129mqd.gEmmrt(c47988uAv.getTag(C48033uCm.Application.setSplitBackgroundDrawable));
        String strGEmmrt2 = C33129mqd.gEmmrt(c47988uAv.getTag(C48033uCm.Application.setNavigationMode));
        String strAkhnZx = c47988uAv.AkhnZx();
        if (C33129mqd.AEQbTJ(strGEmmrt2, 0) && C33129mqd.AEQbTJ(strAkhnZx, strGEmmrt2)) {
            strCopydefault = C33069mpW.copydefault(EZpvd(str, true), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", c47988uAv.values()), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(strGEmmrt2)), C56390yDp.OLrzqt("unit", c47988uAv.fARcdN())));
        } else if (strAkhnZx.length() == 0 || C33129mqd.gEmmrt(strAkhnZx, strGEmmrt)) {
            strCopydefault = C33069mpW.copydefault(EZpvd(str, false), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", c47988uAv.values()), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(strGEmmrt)), C56390yDp.OLrzqt("unit", c47988uAv.fARcdN())));
        }
        if (strCopydefault.length() == 0 || c47988uAv.isConnected() == InputLayoutState.GREY_UN_CLICKABLE) {
            c47988uAv.copydefault();
        } else {
            c47988uAv.setInputErrorMsg(strCopydefault);
        }
    }

    public final int EZpvd(String str, boolean z) {
        return Intrinsics.EZpvd((Object) str, (Object) "%") ? z ? C55688xof.Application.QCjLjM : C55688xof.Application.USBtdM : Intrinsics.EZpvd((Object) str, (Object) "") ? z ? C55688xof.Application.QSLkRj : C55688xof.Application.QwvEab : z ? C55688xof.Application.OJuSTm : C55688xof.Application.UlJrfe;
    }

    public final boolean AwvSrB() {
        return SPUtils.getBoolean("contract_dca_auto_margin", false);
    }

    public final void OLrzqt(boolean z) {
        SPUtils.put("contract_dca_auto_margin", Boolean.valueOf(z));
    }

    public final ArrayList<ExplainItemModel> fIwbmz() {
        return yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.DzkRMH), C33070mpX.AYXKKw(C55688xof.Application.iUnTnt)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.FHvxmb), C33070mpX.AYXKKw(C55688xof.Application.DDjfYY)));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(KWHzl(), AhwBna(), this.fetchVPNInfo, djBIcL(), this.isConnected);
    }
}
