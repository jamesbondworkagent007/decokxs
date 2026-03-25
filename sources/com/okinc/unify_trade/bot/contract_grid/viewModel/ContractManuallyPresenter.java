package com.okinc.unify_trade.bot.contract_grid.viewModel;

import android.app.Application;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.TradeType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.ExtraActualMarginResp;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.HedgingEstimatesResp;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractManuallyPresenter;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC54531xLw;
import o.AbstractC55740xpe;
import o.C33129mqd;
import o.C54219xAh;
import o.C54504xKw;
import o.C54506xKy;
import o.C54507xKz;
import o.C54536xML;
import o.C54566xNc;
import o.C54571xNh;
import o.C54589xNz;
import o.C55768xqF;
import o.C55886xsR;
import o.C56111xwe;
import o.C56188xyB;
import o.C56189xyC;
import o.C56191xyE;
import o.C56208xyV;
import o.C56235xyw;
import o.C56237xyy;
import o.C56238xyz;
import o.C56280xzo;
import o.C56288xzw;
import o.C56392yDr;
import o.C59449zhJ;
import o.InterfaceC54501xKt;
import o.InterfaceC54581xNr;
import o.InterfaceC55881xsM;
import o.InterfaceC56387yDm;
import o.xDM;
import o.xKK;
import o.xMR;
import o.xMS;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ContractManuallyPresenter extends BaseBotOrderPresenter {
    public xDM AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final TradeLiveData<ExtraActualMarginResp> AhwBna;
    public final C56237xyy AkhnZx;
    public final C56191xyE AuCTel;
    public final C54219xAh AuCTelauCTel;
    public final TradeLiveData<MinInvestResp> AubY;
    public final C56235xyw DbNXlk;
    public final TradeLiveData<MinInvestResp> EZpvd;
    public final C56280xzo KWHzl;
    public final MutableLiveData<List<SmartRecommendResp>> OLrzqt;
    public final TradeLiveData<StrategyConfigInfo> copydefault;
    public final C56238xyz djBIcL;
    public final C56111xwe<GridProfitRateResp> ejfBZ;
    public final TradeLiveData<Boolean> fARcdN;
    public ContractGridReq fIwbmz;
    public final TradeLiveData<HedgingEstimatesResp> fJNWhG;
    public final C56238xyz fetchVPNInfo;
    public final C56288xzw gEmmrt;
    public final TradeLiveData<String> getFieldNames;
    public final TradeLiveData<Boolean> getNewProxyInstance;
    public final C56111xwe<LiquidatePriceResponse> hDKMBd;
    public final C56189xyC isConnected;
    public final TradeLiveData<Boolean> iwGUEr;
    public final TradeLiveData<Boolean> uzCIH;
    public final C56188xyB valueOf;
    public final TradeLiveData<GridNumRangeBean> values;
    public AbstractC55740xpe zLjUOn;
    public final TradeLiveData<StrategyResponse> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        this.fIwbmz = contractGridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56238xyz AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56189xyC AuCTel() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54219xAh AubY() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> AxsJAY() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56237xyy DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xDM EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(xDM xdm) {
        this.AEQbTJ = xdm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> ORxRYg() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> OcIXYQ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<SmartRecommendResp>> djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<GridNumRangeBean> fARcdN() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<GridProfitRateResp> fJNWhG() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56188xyB fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MinInvestResp> gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> gHZMYf() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<LiquidatePriceResponse> getFieldNames() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56191xyE getNewProxyInstance() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<HedgingEstimatesResp> hDKMBd() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<ExtraActualMarginResp> isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractGridReq uzCIH() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56288xzw values() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> wlaJM() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<String> zLjUOn() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<MinInvestResp> zsXlph() {
        return this.AubY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractManuallyPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AuCTelauCTel = new C54219xAh();
        this.zsXlph = new TradeLiveData<>();
        this.AkhnZx = new C56237xyy();
        this.ejfBZ = new C56111xwe<>();
        this.gEmmrt = new C56288xzw();
        this.hDKMBd = new C56111xwe<>();
        this.DbNXlk = new C56235xyw();
        this.copydefault = new TradeLiveData<>();
        this.fetchVPNInfo = new C56238xyz();
        this.AubY = new TradeLiveData<>();
        this.djBIcL = new C56238xyz();
        this.EZpvd = new TradeLiveData<>();
        this.valueOf = new C56188xyB();
        this.AhwBna = new TradeLiveData<>();
        this.isConnected = new C56189xyC();
        this.values = new TradeLiveData<>();
        this.AuCTel = new C56191xyE();
        this.fJNWhG = new TradeLiveData<>();
        this.KWHzl = new C56280xzo();
        this.OLrzqt = new MutableLiveData<>();
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.xqJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ContractManuallyPresenter.RJOkX();
            }
        });
        this.getFieldNames = new TradeLiveData<>();
        this.getNewProxyInstance = new TradeLiveData<>();
        this.uzCIH = new TradeLiveData<>();
        this.iwGUEr = new TradeLiveData<>();
        this.fARcdN = new TradeLiveData<>();
        this.fIwbmz = new ContractGridReq((String) null, (String) null, (Boolean) null, (String) null, "2", (String) null, (String) null, (String) null, "1", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, "contract_grid", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, -1048849, 15, (DefaultConstructorMarker) null);
    }

    private final C56208xyV QbewEr() {
        return (C56208xyV) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C56208xyV RJOkX() {
        return new C56208xyV();
    }

    public final boolean AwvSrB() {
        return Intrinsics.EZpvd((Object) this.fIwbmz.getOrdVariant(), (Object) "segmented_hedging");
    }

    public static /* synthetic */ void queryRecommendList$default(ContractManuallyPresenter contractManuallyPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        contractManuallyPresenter.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        if (z) {
            return;
        }
        C56208xyV c56208xyVQbewEr = QbewEr();
        c56208xyVQbewEr.KWHzl(new Function1() { // from class: o.xqM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractManuallyPresenter.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56208xyVQbewEr, 0L, 1, null);
    }

    public static /* synthetic */ void order$default(ContractManuallyPresenter contractManuallyPresenter, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        contractManuallyPresenter.OLrzqt(z, z2);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        StrategyBaseReq strategyBaseReq = new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (TradeType) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
        strategyBaseReq.setInstId(fvQaOB().gEmmrt());
        strategyBaseReq.setOrdType("contract_grid");
        ContractGridReq contractGridReq = new ContractGridReq(this.fIwbmz.getInstId(), this.fIwbmz.getInstType(), this.fIwbmz.getBasePos(), this.fIwbmz.getGridNum(), this.fIwbmz.getInvestType(), this.fIwbmz.getMaxPx(), this.fIwbmz.getMinPx(), this.fIwbmz.getSz(), this.fIwbmz.getRunType(), this.fIwbmz.getSlTriggerPx(), this.fIwbmz.getTpTriggerPx(), this.fIwbmz.getTpRatio(), this.fIwbmz.getSlRatio(), this.fIwbmz.getTpOrdPx(), this.fIwbmz.getSlOrdPx(), this.fIwbmz.getDirection(), (String) null, this.fIwbmz.getLever(), new ArrayList(this.fIwbmz.getSignParams()), this.fIwbmz.getProfitSharingRatio(), this.fIwbmz.getOrdType(), this.fIwbmz.getAnnualizedRate(), this.fIwbmz.getAutoTransfer(), this.fIwbmz.getSystemSource(), this.fIwbmz.getNmpUnderlyingId(), this.fIwbmz.getBatchNo(), this.fIwbmz.getVoucherId(), this.fIwbmz.getAutoReserve(), this.fIwbmz.getActualMarginSz(), this.fIwbmz.getExtraMarginSz(), z2 ? "2" : null, this.fIwbmz.getOpenPosSlippage(), (Boolean) null, this.fIwbmz.getOrdVariant(), (String) null, (String) null, 65536, 13, (DefaultConstructorMarker) null);
        if (!z) {
            contractGridReq.setSz("");
        } else if (!z2) {
            contractGridReq.setActualMarginSz("");
            contractGridReq.setExtraMarginSz("");
        }
        C54219xAh c54219xAh = this.AuCTelauCTel;
        c54219xAh.EZpvd(strategyBaseReq);
        c54219xAh.OLrzqt(contractGridReq);
        c54219xAh.OLrzqt(this.zsXlph, new C54507xKz());
        xKK.Activity.execute$default(c54219xAh, 0L, 1, null);
    }

    public static /* synthetic */ void loadMinInvest$default(ContractManuallyPresenter contractManuallyPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        contractManuallyPresenter.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        if (!DTwDnp() || C33129mqd.OLrzqt((Object) this.fIwbmz.getGridNum(), (Object) 0) || C33129mqd.OLrzqt((Object) this.fIwbmz.getMaxPx(), (Object) 0) || C33129mqd.OLrzqt((Object) this.fIwbmz.getMinPx(), (Object) 0)) {
            this.fetchVPNInfo.AYXKKw();
            this.AubY.postValue(new MinInvestResp((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null));
            return;
        }
        C56238xyz c56238xyz = this.fetchVPNInfo;
        c56238xyz.AEQbTJ(fvQaOB().gEmmrt());
        c56238xyz.OLrzqt(this.fIwbmz.getDirection());
        c56238xyz.KWHzl(this.fIwbmz.getGridNum());
        c56238xyz.AYXKKw(this.fIwbmz.getMaxPx());
        c56238xyz.djBIcL(this.fIwbmz.getMinPx());
        c56238xyz.valueOf(this.fIwbmz.getLever());
        c56238xyz.KWHzl(C33129mqd.AhwBna(this.fIwbmz.getRunType()));
        c56238xyz.EZpvd(this.fIwbmz.getBasePos());
        AdvancedTriggerSign advancedTriggerSignRcXXUw = RcXXUw();
        c56238xyz.isConnected(advancedTriggerSignRcXXUw != null ? advancedTriggerSignRcXXUw.getIndicator() : null);
        c56238xyz.OLrzqt(this.fIwbmz.getAutoReserve());
        c56238xyz.EZpvd(Boolean.valueOf(z).booleanValue() ? "2" : null);
        AdvancedTriggerSign advancedTriggerSignRcXXUw2 = RcXXUw();
        if (advancedTriggerSignRcXXUw2 != null && Intrinsics.EZpvd((Object) advancedTriggerSignRcXXUw2.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(advancedTriggerSignRcXXUw2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(this.AubY, new C55768xqF());
        c56238xyz.OLrzqt(400L);
    }

    private final AdvancedTriggerSign RcXXUw() {
        Object next;
        Iterator<T> it = this.fIwbmz.getSignParams().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((AdvancedTriggerSign) next).getTriggerAction(), (Object) TtmlNode.START)) {
                break;
            }
        }
        return (AdvancedTriggerSign) next;
    }

    public static /* synthetic */ void checkMaxInvestWithMargin$default(ContractManuallyPresenter contractManuallyPresenter, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        contractManuallyPresenter.EZpvd(str, z);
    }

    public final void EZpvd(String str, boolean z) {
        if (!DTwDnp() || C33129mqd.OLrzqt((Object) this.fIwbmz.getGridNum(), (Object) 0) || C33129mqd.OLrzqt((Object) this.fIwbmz.getMaxPx(), (Object) 0) || C33129mqd.OLrzqt((Object) this.fIwbmz.getMinPx(), (Object) 0) || str == null) {
            this.djBIcL.AYXKKw();
            this.EZpvd.setValue(new MinInvestResp((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null));
            return;
        }
        C56238xyz c56238xyz = this.djBIcL;
        c56238xyz.AEQbTJ(fvQaOB().gEmmrt());
        c56238xyz.OLrzqt(this.fIwbmz.getDirection());
        c56238xyz.KWHzl(this.fIwbmz.getGridNum());
        c56238xyz.AYXKKw(this.fIwbmz.getMaxPx());
        c56238xyz.djBIcL(this.fIwbmz.getMinPx());
        c56238xyz.valueOf(this.fIwbmz.getLever());
        c56238xyz.KWHzl(C33129mqd.AhwBna(this.fIwbmz.getRunType()));
        c56238xyz.EZpvd(this.fIwbmz.getBasePos());
        c56238xyz.copydefault(str);
        AdvancedTriggerSign advancedTriggerSignRcXXUw = RcXXUw();
        c56238xyz.isConnected(advancedTriggerSignRcXXUw != null ? advancedTriggerSignRcXXUw.getIndicator() : null);
        c56238xyz.OLrzqt(this.fIwbmz.getAutoReserve());
        c56238xyz.EZpvd(Boolean.valueOf(z).booleanValue() ? "2" : null);
        AdvancedTriggerSign advancedTriggerSignRcXXUw2 = RcXXUw();
        if (advancedTriggerSignRcXXUw2 != null && Intrinsics.EZpvd((Object) advancedTriggerSignRcXXUw2.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(advancedTriggerSignRcXXUw2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(this.EZpvd, new Activity());
        c56238xyz.OLrzqt(400L);
    }

    public static final class Activity implements InterfaceC54501xKt<List<? extends MinInvestResp>, MinInvestResp> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public MinInvestResp KWHzl(List<MinInvestResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return ContractManuallyPresenter.this.EZpvd(list);
        }
    }

    public static /* synthetic */ void getActualExtraMargin$default(ContractManuallyPresenter contractManuallyPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        contractManuallyPresenter.copydefault(z);
    }

    public final void copydefault(boolean z) {
        if (fvQaOB().gEmmrt().length() == 0 || C33129mqd.valueOf(this.fIwbmz.getSz(), 0)) {
            this.AhwBna.postValue(new ExtraActualMarginResp("", ""));
            return;
        }
        C56188xyB c56188xyB = this.valueOf;
        c56188xyB.copydefault(fvQaOB().gEmmrt());
        c56188xyB.AYXKKw(this.fIwbmz.getSz());
        if (z) {
            c56188xyB.EZpvd("2");
            c56188xyB.gEmmrt(this.fIwbmz.getMinPx());
            c56188xyB.djBIcL(this.fIwbmz.getMaxPx());
            c56188xyB.OLrzqt(this.fIwbmz.getGridNum());
            c56188xyB.KWHzl(this.fIwbmz.getDirection());
            c56188xyB.copydefault(this.fIwbmz.getBasePos());
            c56188xyB.AhwBna(this.fIwbmz.getLever());
            AdvancedTriggerSign advancedTriggerSignRcXXUw = RcXXUw();
            c56188xyB.valueOf(advancedTriggerSignRcXXUw != null ? advancedTriggerSignRcXXUw.getIndicator() : null);
            c56188xyB.AEQbTJ((String) null);
        }
        c56188xyB.djBIcL();
        c56188xyB.OLrzqt(this.AhwBna, new StateListAnimator());
        c56188xyB.OLrzqt(!z ? 0L : 400L);
    }

    public static final class StateListAnimator implements InterfaceC54501xKt<List<? extends ExtraActualMarginResp>, ExtraActualMarginResp> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public ExtraActualMarginResp KWHzl(List<ExtraActualMarginResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return ContractManuallyPresenter.this.KWHzl(list);
        }
    }

    public final void fIwbmz() {
        C56235xyw c56235xyw = this.DbNXlk;
        c56235xyw.KWHzl("contract_grid");
        c56235xyw.AEQbTJ(fvQaOB().gEmmrt());
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.copydefault, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public static /* synthetic */ void requestLiqPrice$default(ContractManuallyPresenter contractManuallyPresenter, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        contractManuallyPresenter.OLrzqt(z, z2, z3, z4);
    }

    public final void OLrzqt(boolean z, boolean z2, boolean z3, boolean z4) {
        String runType;
        String direction = this.fIwbmz.getDirection();
        if (direction == null || direction.length() == 0 || fvQaOB().gEmmrt().length() == 0 || !DTwDnp() || this.fIwbmz.getMaxPx().length() == 0 || this.fIwbmz.getMinPx().length() == 0 || ((z2 && C33129mqd.valueOf(this.fIwbmz.getSz(), 0)) || this.fIwbmz.getLever().length() == 0 || (runType = this.fIwbmz.getRunType()) == null || runType.length() == 0)) {
            this.hDKMBd.postValue(new LiquidatePriceResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 124, (DefaultConstructorMarker) null));
            return;
        }
        ContractGridReq contractGridReq = new ContractGridReq(this.fIwbmz.getInstId(), this.fIwbmz.getInstType(), this.fIwbmz.getBasePos(), this.fIwbmz.getGridNum(), this.fIwbmz.getInvestType(), this.fIwbmz.getMaxPx(), this.fIwbmz.getMinPx(), this.fIwbmz.getSz(), this.fIwbmz.getRunType(), this.fIwbmz.getSlTriggerPx(), this.fIwbmz.getTpTriggerPx(), this.fIwbmz.getTpRatio(), this.fIwbmz.getSlRatio(), this.fIwbmz.getTpOrdPx(), this.fIwbmz.getSlOrdPx(), this.fIwbmz.getDirection(), (String) null, this.fIwbmz.getLever(), new ArrayList(this.fIwbmz.getSignParams()), this.fIwbmz.getProfitSharingRatio(), this.fIwbmz.getOrdType(), this.fIwbmz.getAnnualizedRate(), this.fIwbmz.getAutoTransfer(), this.fIwbmz.getSystemSource(), this.fIwbmz.getNmpUnderlyingId(), this.fIwbmz.getBatchNo(), this.fIwbmz.getVoucherId(), this.fIwbmz.getAutoReserve(), this.fIwbmz.getActualMarginSz(), this.fIwbmz.getExtraMarginSz(), (String) null, this.fIwbmz.getOpenPosSlippage(), (Boolean) null, this.fIwbmz.getOrdVariant(), (String) null, this.fIwbmz.getTopupActualMarginSz(), 1073807360, 5, (DefaultConstructorMarker) null);
        if (!z4) {
            if (z) {
                contractGridReq.setActualMarginSz("");
                contractGridReq.setExtraMarginSz("");
            } else {
                contractGridReq.setSz("");
                if (Intrinsics.EZpvd((Object) contractGridReq.getOrdVariant(), (Object) "segmented_hedging")) {
                    contractGridReq.setExtraMarginSz("0");
                }
            }
        }
        C56288xzw c56288xzw = this.gEmmrt;
        String direction2 = contractGridReq.getDirection();
        if (direction2 == null) {
            direction2 = "";
        }
        c56288xzw.KWHzl(direction2);
        c56288xzw.AYXKKw(contractGridReq.getInstId());
        c56288xzw.gEmmrt(contractGridReq.getGridNum());
        c56288xzw.djBIcL(contractGridReq.getMaxPx());
        c56288xzw.values(contractGridReq.getMinPx());
        c56288xzw.AhwBna(contractGridReq.getLever());
        c56288xzw.EZpvd(Integer.valueOf(C33129mqd.AhwBna(contractGridReq.getRunType())));
        AdvancedTriggerSign advancedTriggerSignRcXXUw = RcXXUw();
        c56288xzw.DbNXlk(advancedTriggerSignRcXXUw != null ? advancedTriggerSignRcXXUw.getIndicator() : null);
        c56288xzw.EZpvd(contractGridReq.getBasePos());
        if (!z3) {
            c56288xzw.OLrzqt(Boolean.valueOf(z4).booleanValue() ? "2" : null);
            c56288xzw.fetchVPNInfo(contractGridReq.getSz());
            String actualMarginSz = contractGridReq.getActualMarginSz();
            if (actualMarginSz == null) {
                actualMarginSz = "";
            }
            c56288xzw.EZpvd(actualMarginSz);
            String extraMarginSz = contractGridReq.getExtraMarginSz();
            c56288xzw.valueOf(extraMarginSz != null ? extraMarginSz : "");
        } else {
            c56288xzw.AEQbTJ(this.fIwbmz.getAlgoId());
            c56288xzw.copydefault(this.fIwbmz.getTopupActualMarginSz());
        }
        c56288xzw.OLrzqt(this.hDKMBd, new C54507xKz());
        c56288xzw.OLrzqt(z3 ? 0L : 400L);
    }

    public final boolean DTwDnp() {
        String maxGridNum;
        StrategyConfigInfo value = this.copydefault.getValue();
        GridNumRangeBean value2 = this.values.getValue();
        if (value2 == null || (maxGridNum = value2.getMaxGridNum()) == null) {
            maxGridNum = value != null ? value.getMaxGridNum() : null;
        }
        return C33129mqd.copydefault(this.fIwbmz.getGridNum(), value != null ? value.getMinGridNum() : null) && C33129mqd.valueOf(this.fIwbmz.getGridNum(), maxGridNum);
    }

    public final void QUSxYX() {
        if (copydefault(this.fIwbmz.getMaxPx()) && copydefault(this.fIwbmz.getMinPx()) && Intrinsics.EZpvd(sSMYrx(), Boolean.TRUE)) {
            String runType = this.fIwbmz.getRunType();
            if (runType == null) {
                runType = "";
            }
            if (copydefault(runType) && copydefault(this.fIwbmz.getGridNum()) && copydefault(this.fIwbmz.getLever()) && DTwDnp()) {
                C56237xyy c56237xyy = this.AkhnZx;
                c56237xyy.AhwBna(this.fIwbmz.getMaxPx());
                c56237xyy.djBIcL(this.fIwbmz.getMinPx());
                String runType2 = this.fIwbmz.getRunType();
                c56237xyy.AYXKKw(runType2 != null ? runType2 : "");
                c56237xyy.EZpvd(fvQaOB().gEmmrt());
                c56237xyy.OLrzqt(this.fIwbmz.getGridNum());
                c56237xyy.copydefault(this.fIwbmz.getLever());
                c56237xyy.AEQbTJ("contract_grid");
                c56237xyy.djBIcL();
                c56237xyy.OLrzqt(this.ejfBZ, new C54506xKy());
                c56237xyy.OLrzqt(400L);
                return;
            }
        }
        this.AkhnZx.AYXKKw();
        this.ejfBZ.postValue(null);
    }

    public final void ejfBZ() {
        if (!copydefault(this.fIwbmz.getMaxPx()) || !copydefault(this.fIwbmz.getMinPx()) || !Intrinsics.EZpvd(sSMYrx(), Boolean.TRUE)) {
            this.isConnected.AYXKKw();
            this.values.setValue(null);
            return;
        }
        C56189xyC c56189xyC = this.isConnected;
        c56189xyC.KWHzl(this.fIwbmz.getOrdType());
        c56189xyC.AEQbTJ(this.fIwbmz.getInstId());
        c56189xyC.EZpvd(this.fIwbmz.getMaxPx());
        c56189xyC.copydefault(this.fIwbmz.getMinPx());
        String runType = this.fIwbmz.getRunType();
        if (runType == null) {
            runType = "";
        }
        c56189xyC.gEmmrt(runType);
        c56189xyC.OLrzqt(this.fIwbmz.getLever());
        c56189xyC.OLrzqt(this.values, new C54506xKy());
        c56189xyC.OLrzqt(400L);
    }

    public final void iwGUEr() {
        if (copydefault(this.fIwbmz.getMaxPx()) && copydefault(this.fIwbmz.getMinPx()) && Intrinsics.EZpvd(sSMYrx(), Boolean.TRUE)) {
            String runType = this.fIwbmz.getRunType();
            if (runType == null) {
                runType = "";
            }
            if (copydefault(runType) && copydefault(this.fIwbmz.getGridNum()) && DTwDnp()) {
                C56191xyE c56191xyE = this.AuCTel;
                c56191xyE.EZpvd(this.fIwbmz.getInstId());
                c56191xyE.AEQbTJ(this.fIwbmz.getMaxPx());
                c56191xyE.OLrzqt(this.fIwbmz.getMinPx());
                String runType2 = this.fIwbmz.getRunType();
                if (runType2 == null) {
                    runType2 = "";
                }
                c56191xyE.copydefault(runType2);
                c56191xyE.KWHzl(this.fIwbmz.getGridNum());
                AdvancedTriggerSign advancedTriggerSignRcXXUw = RcXXUw();
                String indicator = advancedTriggerSignRcXXUw != null ? advancedTriggerSignRcXXUw.getIndicator() : null;
                c56191xyE.valueOf(indicator != null ? indicator : "");
                c56191xyE.OLrzqt(this.fJNWhG, new C54506xKy());
                c56191xyE.OLrzqt(400L);
                return;
            }
        }
        this.AuCTel.AYXKKw();
        this.fJNWhG.postValue(null);
    }

    public static final class TaskDescription extends AbstractC55740xpe {
        public TaskDescription(String str, String str2, String str3, String str4) {
            super(null, null, str2, str, null, null, str3, null, null, str4, "1", null, null, null, null, null, null, null, null, null, 1046963, null);
        }

        @Override // o.AbstractC55740xpe
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            BizInstrument bizInstrumentAhwBna = ContractManuallyPresenter.this.fvQaOB().AhwBna();
            if (bizInstrumentAhwBna != null && Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), Boolean.TRUE)) {
                ContractManuallyPresenter.this.zLjUOn().postValue(maxAvailableResp != null ? maxAvailableResp.getBaseMax() : null);
            } else {
                ContractManuallyPresenter.this.zLjUOn().postValue(maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null);
            }
            ContractManuallyPresenter.this.KWHzl(xdm);
        }
    }

    public final void QKVWgx() {
        TaskDescription taskDescription = new TaskDescription(fvQaOB().gEmmrt(), fvQaOB().djBIcL(), "cross", "net_mode");
        this.zLjUOn = taskDescription;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(yDY.copydefault(taskDescription));
        }
    }

    public final void QOLQEE() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC55740xpe abstractC55740xpe = this.zLjUOn;
        if (abstractC55740xpe == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(yDY.copydefault(abstractC55740xpe));
    }

    public final String AYXKKw() {
        BotUserConfigInfo botUserConfigInfoCopydefault;
        String profitSharingRatio = this.fIwbmz.getProfitSharingRatio();
        if (!StringsKt__StringsKt.fARcdN((CharSequence) profitSharingRatio)) {
            return profitSharingRatio;
        }
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault == null || (botUserConfigInfoCopydefault = interfaceC55881xsMCopydefault.copydefault()) == null) {
            return null;
        }
        return botUserConfigInfoCopydefault.getDefaultProfitSharingRatio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MinInvestResp EZpvd(List<MinInvestResp> list) {
        String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        String minInvestment = C33129mqd.AEQbTJ(Integer.valueOf(list.size()), 0) ? list.get(0).getMinInvestment() : "";
        if (!C33129mqd.AEQbTJ(Integer.valueOf(list.size()), 0) || C33129mqd.OLrzqt((Object) list.get(0).getSingleAmt(), (Object) 0)) {
            safeString$default = "--";
        } else {
            String strDjBIcL = fvQaOB().djBIcL();
            String strValueOf = fvQaOB().valueOf();
            C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(strDjBIcL, strValueOf != null ? strValueOf : "", null, 4, null);
            if (c54571xNhCreateStrategyTradeConverter$default == null || (c54536xMLDjBIcL = c54571xNhCreateStrategyTradeConverter$default.djBIcL(list.get(0).getSingleAmt())) == null || (c54536xMLCopydefault = c54536xMLDjBIcL.copydefault()) == null || (c54536xMLDjBIcL2 = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            }
        }
        return new MinInvestResp(minInvestment, (String) null, (String) null, safeString$default, (String) null, 22, (DefaultConstructorMarker) null);
    }

    public final ExtraActualMarginResp KWHzl(List<ExtraActualMarginResp> list) {
        return C33129mqd.AEQbTJ(Integer.valueOf(list.size()), 0) ? list.get(0) : new ExtraActualMarginResp((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public final LiquidatePriceResponse EZpvd(@NotNull LiquidatePriceResponse liquidatePriceResponse) {
        String str;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        String safeString$default;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLFetchVPNInfo3;
        String safeString$default2;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLFetchVPNInfo4;
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        String longLiqPx = liquidatePriceResponse.getLongLiqPx();
        String str2 = null;
        if (longLiqPx == null || longLiqPx.length() == 0) {
            str = "--";
        } else if (C33129mqd.valueOf(liquidatePriceResponse.getLongLiqPx(), "0")) {
            xMS xmsCopydefault = fvQaOB().copydefault();
            if (xmsCopydefault != null && (c54536xMLAYXKKw2 = xmsCopydefault.AYXKKw("0")) != null && (c54536xMLDjBIcL4 = c54536xMLAYXKKw2.djBIcL()) != null && (c54536xMLFetchVPNInfo4 = c54536xMLDjBIcL4.fetchVPNInfo()) != null) {
                safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo4, false, 1, null);
                str = safeString$default2;
            }
            str = null;
        } else {
            xMS xmsCopydefault2 = fvQaOB().copydefault();
            if (xmsCopydefault2 != null) {
                String longLiqPx2 = liquidatePriceResponse.getLongLiqPx();
                if (longLiqPx2 == null) {
                    longLiqPx2 = "";
                }
                C54536xML c54536xMLAYXKKw3 = xmsCopydefault2.AYXKKw(longLiqPx2);
                if (c54536xMLAYXKKw3 != null && (c54536xMLDjBIcL3 = c54536xMLAYXKKw3.djBIcL()) != null && (c54536xMLFetchVPNInfo3 = c54536xMLDjBIcL3.fetchVPNInfo()) != null) {
                    safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo3, false, 1, null);
                    str = safeString$default2;
                }
            }
            str = null;
        }
        String shortLiqPx = liquidatePriceResponse.getShortLiqPx();
        if (shortLiqPx == null || shortLiqPx.length() == 0) {
            str2 = "--";
        } else if (C33129mqd.valueOf(liquidatePriceResponse.getShortLiqPx(), "0")) {
            xMS xmsCopydefault3 = fvQaOB().copydefault();
            if (xmsCopydefault3 != null && (c54536xMLAYXKKw = xmsCopydefault3.AYXKKw("0")) != null && (c54536xMLDjBIcL2 = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null);
                str2 = safeString$default;
            }
        } else {
            xMS xmsCopydefault4 = fvQaOB().copydefault();
            if (xmsCopydefault4 != null) {
                String shortLiqPx2 = liquidatePriceResponse.getShortLiqPx();
                C54536xML c54536xMLAYXKKw4 = xmsCopydefault4.AYXKKw(shortLiqPx2 != null ? shortLiqPx2 : "");
                if (c54536xMLAYXKKw4 != null && (c54536xMLDjBIcL = c54536xMLAYXKKw4.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
                    str2 = safeString$default;
                }
            }
        }
        return new LiquidatePriceResponse(str, str2, (String) null, (String) null, (String) null, (String) null, false, 124, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(LiquidatePriceResponse liquidatePriceResponse) {
        String strValueOf;
        int iHashCode;
        String strValueOf2;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = fvQaOB().AEQbTJ();
        String str = "";
        if (abstractC54531xLwAEQbTJ == null) {
            strValueOf = "";
        } else {
            String strValueOf3 = fvQaOB().valueOf();
            if (strValueOf3 == null) {
                strValueOf3 = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf3);
            if (xmsGEmmrt == null || (strValueOf = xmsGEmmrt.valueOf(this.fIwbmz.getMaxPx())) == null) {
            }
        }
        if (abstractC54531xLwAEQbTJ != null) {
            String strValueOf4 = fvQaOB().valueOf();
            if (strValueOf4 == null) {
                strValueOf4 = "";
            }
            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf4);
            if (xmsGEmmrt2 != null && (strValueOf2 = xmsGEmmrt2.valueOf(this.fIwbmz.getMinPx())) != null) {
                str = strValueOf2;
            }
        }
        String longLiqPx = liquidatePriceResponse != null ? liquidatePriceResponse.getLongLiqPx() : null;
        String shortLiqPx = liquidatePriceResponse != null ? liquidatePriceResponse.getShortLiqPx() : null;
        String direction = this.fIwbmz.getDirection();
        return direction != null && ((iHashCode = direction.hashCode()) == 3327612 ? direction.equals("long") && (longLiqPx == null || longLiqPx.length() == 0 || strValueOf.length() == 0 || str.length() == 0 || C33129mqd.AEQbTJ(longLiqPx, strValueOf) || C33129mqd.gEmmrt(longLiqPx, str)) : !(iHashCode == 109413500 ? !(direction.equals("short") && (longLiqPx == null || longLiqPx.length() == 0 || strValueOf.length() == 0 || str.length() == 0 || C33129mqd.AEQbTJ(shortLiqPx, strValueOf) || C33129mqd.gEmmrt(shortLiqPx, str))) : !(iHashCode == 1844321735 && direction.equals("neutral") && (((longLiqPx == null || longLiqPx.length() == 0) && (shortLiqPx == null || shortLiqPx.length() == 0)) || strValueOf.length() == 0 || str.length() == 0 || ((C33129mqd.AEQbTJ(longLiqPx, strValueOf) || C33129mqd.gEmmrt(longLiqPx, str)) && (C33129mqd.AEQbTJ(shortLiqPx, strValueOf) || C33129mqd.gEmmrt(shortLiqPx, str)))))));
    }

    public final String AEQbTJ(String str, String str2) {
        if (!C33129mqd.AEQbTJ(str, "0") || !C33129mqd.AEQbTJ(str2, "0")) {
            return "--";
        }
        String strEZpvd = xMR.copydefault.EZpvd(C33129mqd.mulS$default(str, str2, null, null, null, 14, null), AuCTelauCTel(), RoundingMode.UP);
        BizInstrument bizInstrumentAhwBna = fvQaOB().AhwBna();
        return strEZpvd + " " + (bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null);
    }

    public final boolean copydefault(String str) {
        return (StringsKt__StringsKt.fARcdN((CharSequence) str) || C33129mqd.OLrzqt((Object) str, (Object) 0) || C59449zhJ.endsWith$default(str, JwtUtilsKt.JWT_DELIMITER, false, 2, null)) ? false : true;
    }

    public final void QfsBiF() {
        this.fIwbmz.setInvestType("1");
    }

    public final void QVAiDq() {
        this.fIwbmz.setInvestType("2");
    }

    public final void AEQbTJ() {
        this.fIwbmz.setInstType(fvQaOB().djBIcL());
        this.fIwbmz.setInstId(fvQaOB().gEmmrt());
    }

    public static /* synthetic */ void setAutoReserve$default(ContractManuallyPresenter contractManuallyPresenter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        contractManuallyPresenter.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        this.fIwbmz.setAutoReserve(Boolean.valueOf(z));
    }

    public final String zuBGHE() {
        return fvQaOB().ejfBZ();
    }

    public final int AuCTelauCTel() {
        String strFJNWhG;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(this.fIwbmz.getInstType())) == null) {
            strFJNWhG = null;
        } else {
            String strValueOf = fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            strFJNWhG = abstractC54531xLwOLrzqt.fJNWhG(strValueOf);
        }
        if (strFJNWhG == null || StringsKt__StringsKt.fARcdN((CharSequence) strFJNWhG)) {
            return 2;
        }
        return C33129mqd.AhwBna(strFJNWhG);
    }

    public final ArrayList<AdvancedTriggerSign> KWHzl() {
        return yDY.copydefault(new AdvancedTriggerSign(TtmlNode.START, GridStartTriggerType.INSTANT.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4092, (DefaultConstructorMarker) null), new AdvancedTriggerSign("stop", GridStopTriggerType.MANUAL_STOP.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "1", (String) null, 3068, (DefaultConstructorMarker) null));
    }

    public final Boolean sSMYrx() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.fIwbmz.getMaxPx()) || StringsKt__StringsKt.fARcdN((CharSequence) this.fIwbmz.getMinPx())) {
            return null;
        }
        return Boolean.valueOf(C33129mqd.AEQbTJ(this.fIwbmz.getMaxPx(), this.fIwbmz.getMinPx()));
    }

    public final String valueOf() {
        String tradeSymbol;
        BizInstrument bizInstrumentAhwBna = fvQaOB().AhwBna();
        if (bizInstrumentAhwBna != null) {
            tradeSymbol = Intrinsics.EZpvd(bizInstrumentAhwBna.isNegativeContract(), Boolean.TRUE) ? bizInstrumentAhwBna.getTradeSymbol() : bizInstrumentAhwBna.getQuoteSymbol();
        } else {
            tradeSymbol = null;
        }
        return tradeSymbol == null ? "" : tradeSymbol;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AuCTelauCTel, this.AkhnZx, this.gEmmrt, this.DbNXlk, this.fetchVPNInfo, this.djBIcL, this.isConnected, this.AuCTel, this.valueOf, this.KWHzl, QbewEr());
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
        QOLQEE();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xzo.queryWith$default(o.xzo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public static final Unit AEQbTJ(ContractManuallyPresenter contractManuallyPresenter, ResponseData responseData) {
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && (interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault()) != null) {
            List list = (List) responseData.getData();
            interfaceC55881xsMCopydefault.AEQbTJ(list != null ? (BotUserConfigInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0) : null);
        }
        C56280xzo c56280xzo = contractManuallyPresenter.KWHzl;
        c56280xzo.EZpvd(contractManuallyPresenter.fvQaOB().gEmmrt(), "official", "contract_grid", (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : null, (56 & 32) != 0 ? null : null);
        c56280xzo.OLrzqt(contractManuallyPresenter.OLrzqt, new C54504xKw());
        xKK.Activity.execute$default(c56280xzo, 0L, 1, null);
        return Unit.INSTANCE;
    }
}
