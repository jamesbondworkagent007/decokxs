package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import android.app.Application;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.kline.api.bean.BotOrderItem;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamRep;
import com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.SpotDcaInvestTypeData;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.data.TacticsData;
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
import o.C33129mqd;
import o.C53467wlz;
import o.C53873wth;
import o.C54149wys;
import o.C54507xKz;
import o.C54782xVc;
import o.C55688xof;
import o.C56045xvR;
import o.C56071xvr;
import o.C56111xwe;
import o.C56244xzE;
import o.C56390yDp;
import o.C56402yEa;
import o.C56423yEv;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.pUU;
import o.wTJ;
import o.xKK;
import o.xMJ;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaManualPresenter extends SpotDcaBasePresenter {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public C56244xzE AYXKKw;
    public final TradeLiveData<SpotDcaAdditionalFundParamResp> AhwBna;
    public TradeLiveData<Boolean> AkhnZx;
    public String AuCTel;
    public final MediatorLiveData<String> DbNXlk;
    public final TradeLiveData<SpotDcaAdvancedParams> djBIcL;
    public final TradeLiveData<String> ejfBZ;
    public final TradeLiveData<String> fARcdN;
    public String fIwbmz;
    public final C53873wth fJNWhG;
    public TradeLiveData<String> fetchVPNInfo;
    public C56111xwe<Boolean> gEmmrt;
    public TacticsData getFieldNames;
    public TradeLiveData<String> isConnected;
    public TradeLiveData<Boolean> values;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.AuCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SpotDcaAdditionalFundParamResp> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56244xzE AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData AuCTel() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(String str) {
        this.fIwbmz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(TacticsData tacticsData) {
        this.getFieldNames = tacticsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<Boolean> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> ejfBZ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediatorLiveData<String> fIwbmz() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<SpotDcaAdvancedParams> valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> values() {
        return this.isConnected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaManualPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.ejfBZ = new TradeLiveData<>();
        this.fARcdN = new TradeLiveData<>();
        this.gEmmrt = new C56111xwe<>();
        this.AkhnZx = new TradeLiveData<>(Boolean.TRUE);
        this.fetchVPNInfo = new TradeLiveData<>();
        this.isConnected = new TradeLiveData<>();
        this.values = new TradeLiveData<>();
        this.djBIcL = new TradeLiveData<>();
        this.AYXKKw = new C56244xzE();
        this.AhwBna = new TradeLiveData<>();
        this.fJNWhG = new C53873wth(null, 1, 0 == true ? 1 : 0);
        final MediatorLiveData<String> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(C54782xVc.AEQbTJ.AhwBna(), new TaskDescription(new Function1() { // from class: o.wka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SpotDcaManualPresenter.EZpvd(this.AEQbTJ, mediatorLiveData, (xMJ.Application) obj);
            }
        }));
        mediatorLiveData.addSource(KWHzl(), new TaskDescription(new Function1() { // from class: o.wkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SpotDcaManualPresenter.OLrzqt(this.KWHzl, mediatorLiveData, (StrategyConfigInfo) obj);
            }
        }));
        this.DbNXlk = mediatorLiveData;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AEQbTJ(@NotNull SpotDcaAdvancedParams spotDcaAdvancedParams) {
        Intrinsics.checkNotNullParameter(spotDcaAdvancedParams, "");
        this.djBIcL.setValue(spotDcaAdvancedParams);
    }

    public final SpotDcaAdvancedParams gEmmrt() {
        return this.djBIcL.getValue();
    }

    private final String getNewProxyInstance() {
        SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt = gEmmrt();
        if (spotDcaAdvancedParamsGEmmrt != null) {
            return spotDcaAdvancedParamsGEmmrt.AhwBna();
        }
        return null;
    }

    private final String uzCIH() {
        SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt = gEmmrt();
        if (spotDcaAdvancedParamsGEmmrt != null) {
            return spotDcaAdvancedParamsGEmmrt.OLrzqt();
        }
        return null;
    }

    private final List<DcaTriggerParam> hDKMBd() {
        return C56402yEa.EZpvd(new DcaTriggerParam(TtmlNode.START, ContractDcaTriggerType.INSTANT.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpotDcaAdvancedParams copydefault(DcaOrderReq dcaOrderReq) {
        GridStartTriggerType gridStartTriggerType;
        BotRangeConfig slPct;
        String slPct2;
        String str;
        String str2;
        BotRangeConfig volMult;
        String volMult2;
        String str3;
        BotRangeConfig pxStepsMult;
        String pxStepsMult2;
        DcaTriggerParam dcaTriggerParamIsConnected;
        List<DcaTriggerParam> triggerParams;
        Object next;
        BotRangeConfig rsiOversoldThold;
        List<DcaTriggerParam> triggerParams2;
        DcaTriggerParam dcaTriggerParam;
        String triggerStrategy = (dcaOrderReq == null || (triggerParams2 = dcaOrderReq.getTriggerParams()) == null || (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams2)) == null) ? null : dcaTriggerParam.getTriggerStrategy();
        if (triggerStrategy == null || StringsKt__StringsKt.fARcdN((CharSequence) triggerStrategy)) {
            gridStartTriggerType = GridStartTriggerType.INSTANT;
        } else {
            GridStartTriggerType[] gridStartTriggerTypeArrValues = GridStartTriggerType.values();
            int length = gridStartTriggerTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gridStartTriggerType = null;
                    break;
                }
                gridStartTriggerType = gridStartTriggerTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) gridStartTriggerType.getMode(), (Object) triggerStrategy)) {
                    break;
                }
                i++;
            }
        }
        if (gridStartTriggerType == null) {
            gridStartTriggerType = GridStartTriggerType.INSTANT;
        }
        GridStartTriggerType gridStartTriggerType2 = gridStartTriggerType;
        if (C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getSlPct() : null, 0)) {
            if (dcaOrderReq != null) {
                slPct2 = dcaOrderReq.getSlPct();
                str = slPct2;
            }
            str = null;
        } else {
            StrategyConfigInfo value = KWHzl().getValue();
            if (value != null && (slPct = value.getSlPct()) != null) {
                slPct2 = slPct.getDefault();
                str = slPct2;
            }
            str = null;
        }
        if (!C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getVolMult() : null, 0)) {
            StrategyConfigInfo value2 = KWHzl().getValue();
            str2 = (value2 == null || (volMult = value2.getVolMult()) == null || (volMult2 = volMult.getDefault()) == null) ? "1" : volMult2;
        } else if (dcaOrderReq != null) {
            volMult2 = dcaOrderReq.getVolMult();
        } else {
            str2 = null;
        }
        if (!C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getPxStepsMult() : null, 0)) {
            StrategyConfigInfo value3 = KWHzl().getValue();
            str3 = (value3 == null || (pxStepsMult = value3.getPxStepsMult()) == null || (pxStepsMult2 = pxStepsMult.getDefault()) == null) ? "1" : pxStepsMult2;
        } else if (dcaOrderReq != null) {
            pxStepsMult2 = dcaOrderReq.getPxStepsMult();
        } else {
            str3 = null;
        }
        if (dcaOrderReq != null && (triggerParams = dcaOrderReq.getTriggerParams()) != null) {
            Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
                if (Intrinsics.EZpvd((Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerStrategy() : null), (Object) GridStartTriggerType.RSI_14.getMode())) {
                    break;
                }
            }
            dcaTriggerParamIsConnected = (DcaTriggerParam) next;
            if (dcaTriggerParamIsConnected != null) {
                StrategyConfigInfo value4 = KWHzl().getValue();
                dcaTriggerParamIsConnected.setTholdWarning((value4 == null || (rsiOversoldThold = value4.getRsiOversoldThold()) == null) ? null : rsiOversoldThold.getWarning());
                StrategyConfigInfo value5 = KWHzl().getValue();
                dcaTriggerParamIsConnected.setKlinePeriod(value5 != null ? value5.getKlinePeriod() : null);
            }
        } else if (C56071xvr.gEmmrt.uzCIH()) {
            dcaTriggerParamIsConnected = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(hDKMBd());
        } else {
            dcaTriggerParamIsConnected = isConnected();
        }
        return new SpotDcaAdvancedParams(gridStartTriggerType2, str, str2, str3, C56402yEa.EZpvd(dcaTriggerParamIsConnected), dcaOrderReq != null ? Boolean.valueOf(dcaOrderReq.isToManual()) : null, null, 64, null);
    }

    public final DcaTriggerParam isConnected() {
        BotRangeConfig rsiOversoldThold;
        BotRangeConfig rsiOversoldThold2;
        String mode = GridStartTriggerType.RSI_14.getMode();
        String mode2 = TriggerCond.CROSS_DOWN.getMode();
        StrategyConfigInfo value = KWHzl().getValue();
        String str = (value == null || (rsiOversoldThold2 = value.getRsiOversoldThold()) == null) ? null : rsiOversoldThold2.getDefault();
        StrategyConfigInfo value2 = KWHzl().getValue();
        String warning = (value2 == null || (rsiOversoldThold = value2.getRsiOversoldThold()) == null) ? null : rsiOversoldThold.getWarning();
        StrategyConfigInfo value3 = KWHzl().getValue();
        String defaultKlineTimeframe = value3 != null ? value3.getDefaultKlineTimeframe() : null;
        StrategyConfigInfo value4 = KWHzl().getValue();
        return new DcaTriggerParam(TtmlNode.START, mode, mode2, (String) null, str, warning, "14", defaultKlineTimeframe, (String) null, value4 != null ? value4.getKlinePeriod() : null, 264, (DefaultConstructorMarker) null);
    }

    public static final Unit EZpvd(SpotDcaManualPresenter spotDcaManualPresenter, MediatorLiveData mediatorLiveData, xMJ.Application application) {
        if (application != null && application.AYXKKw() != null) {
            spotDcaManualPresenter.fJNWhG.copydefault(application);
            mediatorLiveData.setValue(spotDcaManualPresenter.fJNWhG.KWHzl(spotDcaManualPresenter.KWHzl().getValue()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SpotDcaManualPresenter spotDcaManualPresenter, MediatorLiveData mediatorLiveData, StrategyConfigInfo strategyConfigInfo) {
        spotDcaManualPresenter.fJNWhG.copydefault(C54782xVc.AEQbTJ.AhwBna().getValue());
        mediatorLiveData.setValue(spotDcaManualPresenter.fJNWhG.KWHzl(strategyConfigInfo));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull FragmentManager fragmentManager) {
        GridStartTriggerType gridStartTriggerTypeAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        String hundredQuot$default = C33129mqd.AEQbTJ(str, 0) ? xMR.formatHundredQuot$default(xMR.copydefault, str, 0, false, null, 14, null) : "";
        if (EZpvd(hundredQuot$default, str5)) {
            SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt = gEmmrt();
            List<DcaTriggerParam> listAYXKKw = Intrinsics.EZpvd((Object) ((spotDcaAdvancedParamsGEmmrt == null || (gridStartTriggerTypeAEQbTJ = spotDcaAdvancedParamsGEmmrt.AEQbTJ()) == null) ? null : gridStartTriggerTypeAEQbTJ.getMode()), (Object) GridStartTriggerType.RSI_14.getMode()) ? spotDcaAdvancedParamsGEmmrt.AYXKKw() : hDKMBd();
            this.gEmmrt.postValue(Boolean.TRUE);
            pUU.KWHzl("Order", "SpotDcaManualFragment Order 手动下单");
            String strGEmmrt = fvQaOB().gEmmrt();
            String strUzCIH = uzCIH();
            String newProxyInstance = getNewProxyInstance();
            String hundredQuot$default2 = xMR.formatHundredQuot$default(xMR.copydefault, str2, 0, false, null, 14, null);
            SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt2 = gEmmrt();
            AEQbTJ(new DcaOrderReq(strGEmmrt, str3, Boolean.valueOf(z), str4, str5, hundredQuot$default, strUzCIH, newProxyInstance, hundredQuot$default2, spotDcaAdvancedParamsGEmmrt2 != null ? spotDcaAdvancedParamsGEmmrt2.EZpvd() : null, "long", SpotDcaInvestTypeData.MANUAL.getMode(), this.isConnected.getValue(), (String) null, (String) null, (String) null, (String) null, (List) listAYXKKw, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, "SPOT", (String) null, "spot_dca", this.AuCTel, this.fIwbmz, (String) null, (String) null, fvQaOB().AEQbTJ("spot_dca"), C54149wys.AEQbTJ.EZpvd(KWHzl().getValue()), 402513920, 3, (DefaultConstructorMarker) null), fragmentManager);
        }
    }

    public final wTJ copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        String strGEmmrt = fvQaOB().gEmmrt();
        String strDivS$default = C33129mqd.AEQbTJ(str4, 0) ? C33129mqd.divS$default(str3, 100, null, null, null, 14, null) : null;
        SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt = gEmmrt();
        String strOLrzqt = spotDcaAdvancedParamsGEmmrt != null ? spotDcaAdvancedParamsGEmmrt.OLrzqt() : null;
        String str6 = strOLrzqt == null ? "" : strOLrzqt;
        SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt2 = gEmmrt();
        String strAhwBna = spotDcaAdvancedParamsGEmmrt2 != null ? spotDcaAdvancedParamsGEmmrt2.AhwBna() : null;
        String str7 = strAhwBna == null ? "" : strAhwBna;
        String strDivS$default2 = C33129mqd.divS$default(str5, 100, null, null, null, 14, null);
        SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt3 = gEmmrt();
        String strEZpvd = spotDcaAdvancedParamsGEmmrt3 != null ? spotDcaAdvancedParamsGEmmrt3.EZpvd() : null;
        return new wTJ("spot_dca", strGEmmrt, str, str2, str4, strDivS$default, str6, str7, strDivS$default2, strEZpvd == null ? "" : strEZpvd, null, null, 3072, null);
    }

    public final Triple<BotOrderItem, ArrayList<BotOrderItem>, DcaPreviewData> EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return C53467wlz.copydefault.EZpvd(OLrzqt(str, str2, str3, str4, str5));
    }

    private final List<DcaPreviewData> OLrzqt(String str, String str2, String str3, String str4, String str5) {
        String hundredQuot$default = C33129mqd.AEQbTJ(str3, 0) ? xMR.formatHundredQuot$default(xMR.copydefault, str3, 0, false, null, 14, null) : "";
        C56045xvR c56045xvR = C56045xvR.KWHzl;
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(value != null ? value.AYXKKw() : null);
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(str);
        BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(str2);
        BigDecimal bigDecimalEZpvd4 = C33129mqd.EZpvd(hundredQuot$default);
        int iAhwBna = C33129mqd.AhwBna(str4);
        BigDecimal bigDecimalEZpvd5 = C33129mqd.EZpvd(str5);
        SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt = gEmmrt();
        BigDecimal bigDecimalEZpvd6 = C33129mqd.EZpvd(spotDcaAdvancedParamsGEmmrt != null ? spotDcaAdvancedParamsGEmmrt.OLrzqt() : null);
        SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt2 = gEmmrt();
        return c56045xvR.copydefault(false, bigDecimalEZpvd, bigDecimalEZpvd2, bigDecimalEZpvd3, bigDecimalEZpvd4, iAhwBna, bigDecimalEZpvd5, bigDecimalEZpvd6, C33129mqd.EZpvd(spotDcaAdvancedParamsGEmmrt2 != null ? spotDcaAdvancedParamsGEmmrt2.AhwBna() : null));
    }

    public final boolean EZpvd(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strEZpvd = C56045xvR.KWHzl.EZpvd(str, str2, uzCIH());
        if (C33129mqd.copydefault((Object) strEZpvd, (Object) 1)) {
            this.ejfBZ.postValue(C33069mpW.copydefault(C55688xof.Application.aUsmxb, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xMR.copydefault, strEZpvd, 0, null, 6, null)))));
            this.gEmmrt.postValue(Boolean.FALSE);
            return false;
        }
        SpotDcaAdvancedParams spotDcaAdvancedParamsGEmmrt = gEmmrt();
        String strEZpvd2 = spotDcaAdvancedParamsGEmmrt != null ? spotDcaAdvancedParamsGEmmrt.EZpvd() : null;
        if (!C33129mqd.AEQbTJ(strEZpvd2, 0) || !C33129mqd.valueOf(strEZpvd2, strEZpvd)) {
            return true;
        }
        this.fARcdN.postValue(C33069mpW.copydefault(C55688xof.Application.dUDNAs, C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", xMR.formatPercent$default(xMR.copydefault, strEZpvd, 0, null, 6, null)))));
        this.gEmmrt.postValue(Boolean.FALSE);
        return false;
    }

    public final void getFieldNames() {
        this.gEmmrt.setValue(Boolean.TRUE);
    }

    public final void copydefault(boolean z) {
        this.AkhnZx.setValue(Boolean.valueOf(z));
    }

    public final String AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String newProxyInstance = getNewProxyInstance();
        return (z && C33129mqd.AEQbTJ(str2, 0)) ? KWHzl(str, str2, str3, newProxyInstance != null ? newProxyInstance : "") : OLrzqt(str, str3, str2);
    }

    public final String AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String newProxyInstance = getNewProxyInstance();
        return KWHzl(str, str2, str3, newProxyInstance != null ? newProxyInstance : "");
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String newProxyInstance = getNewProxyInstance();
        String strKWHzl = KWHzl(str, str2, str3, newProxyInstance != null ? newProxyInstance : "");
        String strOLrzqt = (Intrinsics.EZpvd(this.AkhnZx.getValue(), Boolean.TRUE) && C33129mqd.AEQbTJ(str2, 0)) ? strKWHzl : OLrzqt(str, str3, str2);
        this.fetchVPNInfo.postValue(strKWHzl);
        this.isConnected.postValue(strOLrzqt);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String newProxyInstance = getNewProxyInstance();
        String strKWHzl = KWHzl(str, str2, str3, newProxyInstance != null ? newProxyInstance : "");
        String strOLrzqt = (Intrinsics.EZpvd(this.AkhnZx.getValue(), Boolean.TRUE) && C33129mqd.AEQbTJ(str2, 0)) ? strKWHzl : OLrzqt(str, str3, str2);
        this.fetchVPNInfo.postValue(strKWHzl);
        this.isConnected.postValue(strOLrzqt);
        if (C33129mqd.OLrzqt((CharSequence) strOLrzqt) && C33129mqd.OLrzqt((CharSequence) str4)) {
            this.values.postValue(Boolean.valueOf(C33129mqd.AEQbTJ(strOLrzqt, str4)));
        }
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((CharSequence) str)) {
            this.values.postValue(Boolean.valueOf(C33129mqd.AEQbTJ(str, "0")));
        }
    }

    public final boolean fJNWhG() {
        return !C33129mqd.OLrzqt((CharSequence) (C54782xVc.AEQbTJ.AhwBna().getValue() != null ? r0.AYXKKw() : null));
    }

    public static /* synthetic */ String calculateMinSafetyOrder$default(SpotDcaManualPresenter spotDcaManualPresenter, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = spotDcaManualPresenter.getNewProxyInstance();
        }
        return spotDcaManualPresenter.copydefault(str, str2);
    }

    public final String copydefault(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.gEmmrt(Double.valueOf(Math.max(C33129mqd.AEQbTJ(this.DbNXlk.getValue()), C33129mqd.AEQbTJ(C33129mqd.divS$default(this.DbNXlk.getValue(), Double.valueOf(Math.pow(C33129mqd.AEQbTJ(str2), C33129mqd.AhwBna(str) - 1)), null, null, null, 14, null)))));
    }

    private final String OLrzqt(String str, String str2, String str3) {
        if (StringsKt__StringsKt.fARcdN((CharSequence) str3)) {
            return "";
        }
        if (C33129mqd.OLrzqt((Object) str3, (Object) 0)) {
            str2 = "0";
        }
        return SpotDcaBasePresenter.handlePrecisionAmt$default(this, C33129mqd.addS$default(str, str2, null, null, null, 14, null), null, 2, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaBasePresenter.handlePrecisionAmt$default(com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaBasePresenter, java.lang.String, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    private final String KWHzl(String str, String str2, String str3, String str4) {
        BotRangeConfig volMult;
        BotRangeConfig maxSafetyOrds;
        if (C33129mqd.valueOf(str2, 0)) {
            return "";
        }
        StrategyConfigInfo value = KWHzl().getValue();
        if (!C33129mqd.AEQbTJ(str2, (value == null || (maxSafetyOrds = value.getMaxSafetyOrds()) == null) ? null : maxSafetyOrds.getMax())) {
            StrategyConfigInfo value2 = KWHzl().getValue();
            if (!C33129mqd.AEQbTJ(str4, (value2 == null || (volMult = value2.getVolMult()) == null) ? null : volMult.getMax())) {
                return SpotDcaBasePresenter.handlePrecisionAmt$default(this, C33129mqd.addS$default(str, C56045xvR.KWHzl.copydefault(str3, str2, str4), null, null, null, 14, null), null, 2, null);
            }
        }
        return "";
    }

    public final void KWHzl(@NotNull SpotDcaAdditionalFundParamRep spotDcaAdditionalFundParamRep) {
        Intrinsics.checkNotNullParameter(spotDcaAdditionalFundParamRep, "");
        C56244xzE c56244xzE = this.AYXKKw;
        c56244xzE.KWHzl(spotDcaAdditionalFundParamRep);
        c56244xzE.OLrzqt(this.AhwBna, new C54507xKz());
        xKK.Activity.execute$default(c56244xzE, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(AEQbTJ(), EZpvd(), this.AYXKKw);
    }
}
