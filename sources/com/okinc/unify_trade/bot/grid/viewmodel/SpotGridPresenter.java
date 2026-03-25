package com.okinc.unify_trade.bot.grid.viewmodel;

import android.app.Application;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AdditionalInvest;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestPreCheckResponse;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.ProfitAutoReinvestParam;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TicketEligibility;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingDownReq;
import com.okinc.unify_trade.biz.TrailingPxReq;
import com.okinc.unify_trade.biz.TrailingPxResp;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridPresenter;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.Flow;
import o.AbstractC54531xLw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C54219xAh;
import o.C54504xKw;
import o.C54506xKy;
import o.C54507xKz;
import o.C54536xML;
import o.C54566xNc;
import o.C54571xNh;
import o.C54589xNz;
import o.C54782xVc;
import o.C55688xof;
import o.C55697xoo;
import o.C55765xqC;
import o.C55886xsR;
import o.C56033xvF;
import o.C56111xwe;
import o.C56155xxV;
import o.C56189xyC;
import o.C56196xyJ;
import o.C56208xyV;
import o.C56222xyj;
import o.C56225xym;
import o.C56235xyw;
import o.C56237xyy;
import o.C56238xyz;
import o.C56280xzo;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C59449zhJ;
import o.InterfaceC54581xNr;
import o.InterfaceC55881xsM;
import o.InterfaceC56387yDm;
import o.xKK;
import o.xMJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SpotGridPresenter extends BaseBotOrderPresenter {
    public final C56155xxV AEQbTJ;
    public final TradeLiveData<TicketEligibility> AYXKKw;
    public final C56280xzo AhwBna;
    public final C56225xym AkhnZx;
    public String AuCTel;
    public final C54219xAh AuCTelauCTel;
    public final C56196xyJ AubY;
    public final C56189xyC DbNXlk;
    public final TradeLiveData<AdditionalInvest> EZpvd;
    public StrategyConfigInfo KWHzl;
    public final TradeLiveData<StrategyConfigInfo> OLrzqt;
    public final MutableLiveData<List<GridProfitAutoReinvestPreCheckResponse>> copydefault;
    public final C56235xyw djBIcL;
    public GridReq ejfBZ;
    public final TradeLiveData<GridProfitRateResp> fARcdN;
    public String fIwbmz;
    public boolean fJNWhG;
    public final C56237xyy fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public String getFieldNames;
    public String getNewProxyInstance;
    public final C56111xwe<MinInvestResp> hDKMBd;
    public final TradeLiveData<GridNumRangeBean> isConnected;
    public final TradeLiveData<StrategyResponse> iwGUEr;
    public boolean uzCIH;
    public final C56111xwe<List<SmartRecommendResp>> valueOf;
    public final C56238xyz values;
    public final InterfaceC56387yDm wlaJM;
    public final TradeLiveData<TrailingPxResp> zLjUOn;
    public final Flow<List<GridProfitAutoReinvestPreCheckResponse>> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getNewProxyInstance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AdditionalInvest> AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTelauCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AubY() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<List<SmartRecommendResp>> DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull GridReq gridReq) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        this.ejfBZ = gridReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(StrategyConfigInfo strategyConfigInfo) {
        this.KWHzl = strategyConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.uzCIH = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<List<GridProfitAutoReinvestPreCheckResponse>> QKVWgx() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TrailingPxResp> QfsBiF() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(String str, String str2, String str3) {
        if (this.fJNWhG) {
            return;
        }
        this.fIwbmz = str;
        this.AuCTel = str2;
        this.getFieldNames = str3;
        this.fJNWhG = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean dNCPSb() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyConfigInfo djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void dxcTrN() {
        this.fJNWhG = false;
        this.fIwbmz = null;
        this.AuCTel = null;
        this.getFieldNames = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<TicketEligibility> fIwbmz() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw fJNWhG() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyConfigInfo> fetchVPNInfo() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<StrategyResponse> gHZMYf() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56225xym getNewProxyInstance() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<GridNumRangeBean> hDKMBd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56237xyy iwGUEr() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54219xAh sSMYrx() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56189xyC uzCIH() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56155xxV valueOf() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridReq wlaJM() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<GridProfitRateResp> zsXlph() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<MinInvestResp> zuBGHE() {
        return this.hDKMBd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotGridPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AuCTelauCTel = new C54219xAh();
        this.iwGUEr = new TradeLiveData<>();
        this.values = new C56238xyz();
        this.hDKMBd = new C56111xwe<>();
        this.fetchVPNInfo = new C56237xyy();
        this.fARcdN = new TradeLiveData<>();
        this.djBIcL = new C56235xyw();
        this.OLrzqt = new TradeLiveData<>();
        this.AkhnZx = new C56225xym();
        this.zLjUOn = new TradeLiveData<>();
        this.AEQbTJ = new C56155xxV();
        this.EZpvd = new TradeLiveData<>();
        this.DbNXlk = new C56189xyC();
        this.isConnected = new TradeLiveData<>();
        this.AubY = new C56196xyJ();
        this.AYXKKw = new TradeLiveData<>();
        this.AhwBna = new C56280xzo();
        this.valueOf = new C56111xwe<>();
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.xsB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotGridPresenter.giSNqX();
            }
        });
        this.wlaJM = C56392yDr.copydefault(new Function0() { // from class: o.xsI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SpotGridPresenter.copydefault();
            }
        });
        MutableLiveData<List<GridProfitAutoReinvestPreCheckResponse>> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.zsXlph = FlowLiveDataConversions.asFlow(mutableLiveData);
        this.getNewProxyInstance = "";
        this.uzCIH = true;
        this.ejfBZ = new GridReq((String) null, (String) null, (String) null, "1", (String) null, (String) null, "2", (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (TrailingConfig) null, (TrailingConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, "grid", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnRequestParam) null, (String) null, (String) null, (String) null, (ProfitAutoReinvestParam) null, -4194377, 15, (DefaultConstructorMarker) null);
    }

    private final C56208xyV gGvvIC() {
        return (C56208xyV) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C56208xyV giSNqX() {
        return new C56208xyV();
    }

    public final C56222xyj DTwDnp() {
        return (C56222xyj) this.wlaJM.getValue();
    }

    public static final C56222xyj copydefault() {
        return new C56222xyj();
    }

    public final void dvKsVJ() {
        C56208xyV c56208xyVGGvvIC = gGvvIC();
        c56208xyVGGvvIC.KWHzl(new Function1() { // from class: o.xsC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SpotGridPresenter.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56208xyVGGvvIC, 0L, 1, null);
    }

    public final void RcXXUw() {
        StrategyBaseReq strategyBaseReq = new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (TradeType) null, (String) null, (Boolean) null, 2047, (DefaultConstructorMarker) null);
        strategyBaseReq.setInstId(fvQaOB().gEmmrt());
        strategyBaseReq.setTdMode("cash");
        strategyBaseReq.setOrdType("grid");
        C54219xAh c54219xAh = this.AuCTelauCTel;
        c54219xAh.EZpvd(strategyBaseReq);
        c54219xAh.copydefault(this.ejfBZ);
        c54219xAh.OLrzqt(this.iwGUEr, new C54507xKz());
        xKK.Activity.execute$default(c54219xAh, 0L, 1, null);
    }

    public final void djSkpj() {
        if (!iZzfmt() || C33129mqd.OLrzqt((Object) this.ejfBZ.getGridNum(), (Object) 0) || C33129mqd.OLrzqt((Object) this.ejfBZ.getMaxPx(), (Object) 0) || C33129mqd.OLrzqt((Object) this.ejfBZ.getMinPx(), (Object) 0)) {
            this.values.AYXKKw();
            this.hDKMBd.postValue(new MinInvestResp((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null));
            return;
        }
        C56238xyz c56238xyz = this.values;
        c56238xyz.AEQbTJ(fvQaOB().gEmmrt());
        c56238xyz.KWHzl(this.ejfBZ.getGridNum());
        c56238xyz.AYXKKw(this.ejfBZ.getMaxPx());
        c56238xyz.djBIcL(this.ejfBZ.getMinPx());
        c56238xyz.KWHzl(C33129mqd.AhwBna(this.ejfBZ.getRunType()));
        TrailingConfig trailingUpConfig = this.ejfBZ.getTrailingUpConfig();
        c56238xyz.fetchVPNInfo(trailingUpConfig != null ? trailingUpConfig.getStopPx() : null);
        TrailingConfig trailingDownConfig = this.ejfBZ.getTrailingDownConfig();
        c56238xyz.DbNXlk(trailingDownConfig != null ? trailingDownConfig.getStopPx() : null);
        AdvancedTriggerSign advancedTriggerSignHUfVAv = hUfVAv();
        c56238xyz.isConnected(advancedTriggerSignHUfVAv != null ? advancedTriggerSignHUfVAv.getIndicator() : null);
        c56238xyz.gEmmrt(Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) "default_usdt") ? "USDT" : "");
        AdvancedTriggerSign advancedTriggerSignHUfVAv2 = hUfVAv();
        if (advancedTriggerSignHUfVAv2 != null && Intrinsics.EZpvd((Object) advancedTriggerSignHUfVAv2.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode())) {
            c56238xyz.values(advancedTriggerSignHUfVAv2.getTriggerPx());
        }
        c56238xyz.djBIcL();
        c56238xyz.OLrzqt(this.hDKMBd, new C54507xKz());
        c56238xyz.OLrzqt(400L);
    }

    private final AdvancedTriggerSign hUfVAv() {
        Object next;
        Iterator<T> it = this.ejfBZ.getSignParams().iterator();
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

    public static /* synthetic */ void getGridProfitRate$default(SpotGridPresenter spotGridPresenter, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 400;
        }
        if ((i & 2) != 0) {
            str = spotGridPresenter.fvQaOB().gEmmrt();
        }
        spotGridPresenter.KWHzl(j, str);
    }

    public final void KWHzl(long j, @NotNull String str) {
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (!OLrzqt(this.ejfBZ.getMaxPx()) || !OLrzqt(this.ejfBZ.getMinPx()) || !Intrinsics.EZpvd(QVAiDq(), Boolean.TRUE) || !OLrzqt(this.ejfBZ.getGridNum()) || !iZzfmt()) {
            this.fetchVPNInfo.AYXKKw();
            this.fARcdN.postValue(null);
            return;
        }
        String sourceCcy = Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) "default_usdt") ? "USDT" : this.ejfBZ.getSourceCcy();
        String sourceCcySz = (C33129mqd.AEQbTJ(this.ejfBZ.getSourceCcySz(), "0") && C33129mqd.OLrzqt((CharSequence) this.ejfBZ.getSourceCcy())) ? this.ejfBZ.getSourceCcySz() : "";
        if (C33129mqd.AEQbTJ(this.ejfBZ.getSourceCcySz(), "0") && C33129mqd.OLrzqt((CharSequence) this.ejfBZ.getSourceCcy())) {
            str2 = sourceCcy;
        }
        C56237xyy c56237xyy = this.fetchVPNInfo;
        c56237xyy.AhwBna(this.ejfBZ.getMaxPx());
        c56237xyy.djBIcL(this.ejfBZ.getMinPx());
        String runType = this.ejfBZ.getRunType();
        Intrinsics.copydefault((Object) runType);
        c56237xyy.AYXKKw(runType);
        c56237xyy.EZpvd(str);
        c56237xyy.OLrzqt(this.ejfBZ.getGridNum());
        c56237xyy.AEQbTJ("grid");
        c56237xyy.KWHzl(this.ejfBZ.getBaseSz());
        c56237xyy.valueOf(this.ejfBZ.getQuoteSz());
        c56237xyy.isConnected(sourceCcySz);
        c56237xyy.gEmmrt(str2);
        AdvancedTriggerSign advancedTriggerSignHUfVAv = hUfVAv();
        if (advancedTriggerSignHUfVAv != null && Intrinsics.EZpvd((Object) advancedTriggerSignHUfVAv.getIndicator(), (Object) GridStartTriggerType.PRICE.getMode())) {
            c56237xyy.values(advancedTriggerSignHUfVAv.getTriggerPx());
        }
        c56237xyy.djBIcL();
        c56237xyy.OLrzqt(this.fARcdN, new C54506xKy());
        c56237xyy.OLrzqt(j);
    }

    public static /* synthetic */ void getGridConfigInfo$default(SpotGridPresenter spotGridPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotGridPresenter.fvQaOB().gEmmrt();
        }
        spotGridPresenter.copydefault(str);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56235xyw c56235xyw = this.djBIcL;
        c56235xyw.KWHzl("grid");
        c56235xyw.AEQbTJ(str);
        c56235xyw.OLrzqt(fvQaOB().AEQbTJ("grid"));
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.OLrzqt, new C54507xKz());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void fZBcTu() {
        TpSlTriggerParam tpSlTriggerParam;
        if (!OLrzqt(this.ejfBZ.getMaxPx()) || !OLrzqt(this.ejfBZ.getMinPx()) || !Intrinsics.EZpvd(QVAiDq(), Boolean.TRUE) || !OLrzqt(this.ejfBZ.getGridNum()) || !iZzfmt() || !C55697xoo.OLrzqt.isConnected()) {
            this.AkhnZx.AYXKKw();
            this.zLjUOn.postValue(null);
            return;
        }
        TpSlTriggerParamReqResp tpslTriggerParamReq = this.ejfBZ.getTpslTriggerParamReq();
        if (tpslTriggerParamReq == null || (tpSlTriggerParam = C55765xqC.OLrzqt(tpslTriggerParamReq)) == null) {
            tpSlTriggerParam = new TpSlTriggerParam((String) null, (String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
        }
        String strGEmmrt = fvQaOB().gEmmrt();
        String maxPx = this.ejfBZ.getMaxPx();
        String minPx = this.ejfBZ.getMinPx();
        String gridNum = this.ejfBZ.getGridNum();
        String runType = this.ejfBZ.getRunType();
        String value = tpSlTriggerParam.getTp().getValue();
        String indicator = tpSlTriggerParam.getTp().getIndicator();
        SpotTpSlTypeConfigData spotTpSlTypeConfigData = SpotTpSlTypeConfigData.PRICE;
        TrailingPxReq trailingPxReq = new TrailingPxReq(strGEmmrt, "grid", maxPx, minPx, gridNum, runType, Intrinsics.EZpvd((Object) indicator, (Object) spotTpSlTypeConfigData.getType()) ? value : null, Intrinsics.EZpvd((Object) tpSlTriggerParam.getSl().getIndicator(), (Object) spotTpSlTypeConfigData.getType()) ? tpSlTriggerParam.getSl().getValue() : null);
        C56225xym c56225xym = this.AkhnZx;
        c56225xym.OLrzqt(trailingPxReq);
        c56225xym.gEmmrt();
        c56225xym.OLrzqt(this.zLjUOn, new C54506xKy());
        c56225xym.OLrzqt(400L);
    }

    public final boolean RJOkX() {
        boolean z = C33129mqd.AEQbTJ(this.ejfBZ.getMaxPx(), 0) && C33129mqd.AEQbTJ(this.ejfBZ.getMinPx(), 0) && iZzfmt();
        boolean z2 = C33129mqd.AEQbTJ(this.ejfBZ.getQuoteSz(), 0) || C33129mqd.AEQbTJ(this.ejfBZ.getBaseSz(), 0);
        TrailingConfig trailingDownConfig = this.ejfBZ.getTrailingDownConfig();
        return z && z2 && C33129mqd.AEQbTJ(trailingDownConfig != null ? trailingDownConfig.getStopPx() : null, 0);
    }

    public final void UeEOUB() {
        if (!RJOkX()) {
            this.AEQbTJ.AYXKKw();
            this.EZpvd.postValue(new AdditionalInvest((String) null, 1, (DefaultConstructorMarker) null));
            return;
        }
        String strGEmmrt = fvQaOB().gEmmrt();
        String maxPx = this.ejfBZ.getMaxPx();
        String minPx = this.ejfBZ.getMinPx();
        String gridNum = this.ejfBZ.getGridNum();
        String runType = this.ejfBZ.getRunType();
        String quoteSz = this.ejfBZ.getQuoteSz();
        String str = quoteSz == null ? "0" : quoteSz;
        String baseSz = this.ejfBZ.getBaseSz();
        String str2 = baseSz == null ? "0" : baseSz;
        TrailingConfig trailingDownConfig = this.ejfBZ.getTrailingDownConfig();
        String stopPx = trailingDownConfig != null ? trailingDownConfig.getStopPx() : null;
        TrailingConfig trailingUpConfig = this.ejfBZ.getTrailingUpConfig();
        TrailingDownReq trailingDownReq = new TrailingDownReq((String) null, strGEmmrt, "grid", maxPx, minPx, gridNum, runType, str, str2, stopPx, trailingUpConfig != null ? trailingUpConfig.getStopPx() : null, 1, (DefaultConstructorMarker) null);
        C56155xxV c56155xxV = this.AEQbTJ;
        c56155xxV.copydefault(trailingDownReq);
        c56155xxV.djBIcL();
        c56155xxV.OLrzqt(this.EZpvd, new C54507xKz());
        c56155xxV.OLrzqt(400L);
    }

    public final void getFieldNames() {
        if (!OLrzqt(this.ejfBZ.getMaxPx()) || !OLrzqt(this.ejfBZ.getMinPx()) || !Intrinsics.EZpvd(QVAiDq(), Boolean.TRUE)) {
            this.DbNXlk.AYXKKw();
            this.isConnected.setValue(null);
            return;
        }
        C56189xyC c56189xyC = this.DbNXlk;
        c56189xyC.KWHzl(this.ejfBZ.getOrdType());
        String instId = this.ejfBZ.getInstId();
        if (instId.length() == 0) {
            instId = fvQaOB().gEmmrt();
        }
        c56189xyC.AEQbTJ(instId);
        c56189xyC.EZpvd(this.ejfBZ.getMaxPx());
        c56189xyC.copydefault(this.ejfBZ.getMinPx());
        String runType = this.ejfBZ.getRunType();
        if (runType == null) {
            runType = "";
        }
        c56189xyC.gEmmrt(runType);
        c56189xyC.OLrzqt(this.isConnected, new C54506xKy());
        c56189xyC.OLrzqt(400L);
    }

    public final void AxsJAY() {
        C56196xyJ c56196xyJ = this.AubY;
        c56196xyJ.AEQbTJ("loss_insurance_voucher");
        c56196xyJ.EZpvd("grid");
        c56196xyJ.KWHzl(fvQaOB().gEmmrt());
        c56196xyJ.OLrzqt(this.AYXKKw, new C54506xKy());
        xKK.Activity.execute$default(c56196xyJ, 0L, 1, null);
    }

    public final Boolean QVAiDq() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) this.ejfBZ.getMaxPx()) || StringsKt__StringsKt.fARcdN((CharSequence) this.ejfBZ.getMinPx())) {
            return null;
        }
        return Boolean.valueOf(C33129mqd.AEQbTJ(this.ejfBZ.getMaxPx(), this.ejfBZ.getMinPx()));
    }

    private final boolean OLrzqt(String str) {
        return (StringsKt__StringsKt.fARcdN((CharSequence) str) || C33129mqd.OLrzqt((Object) str, (Object) 0) || C59449zhJ.endsWith$default(str, JwtUtilsKt.JWT_DELIMITER, false, 2, null)) ? false : true;
    }

    public static /* synthetic */ String converterSz$default(SpotGridPresenter spotGridPresenter, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return spotGridPresenter.KWHzl(str, str2, str3);
    }

    public final String KWHzl(String str, String str2, String str3) {
        C54536xML c54536xMLAuCTel;
        String safeString$default;
        if (str2 == null && (str2 = fvQaOB().valueOf()) == null) {
            str2 = "";
        }
        C54571xNh c54571xNhOLrzqt = C54566xNc.OLrzqt("SPOT", str2, str3);
        if (c54571xNhOLrzqt == null) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        C54536xML c54536xMLDjBIcL = c54571xNhOLrzqt.djBIcL(str);
        return (c54536xMLDjBIcL == null || (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static /* synthetic */ Pair checkMinInvestment$default(SpotGridPresenter spotGridPresenter, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return spotGridPresenter.OLrzqt(str, str2, z);
    }

    public final Pair<Boolean, String> OLrzqt(@NotNull String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            return new Pair<>(Boolean.TRUE, "");
        }
        String strAEQbTJ = AEQbTJ(z);
        boolean zAEQbTJ = C33129mqd.AEQbTJ(str, strAEQbTJ);
        int i = C55688xof.Application.ActivityResultContractsPickVisualMedia;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2));
        pairArr[1] = C56390yDp.OLrzqt("minValue", strAEQbTJ);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("unit", str2);
        return new Pair<>(Boolean.valueOf(zAEQbTJ), C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
    }

    public final Pair<Boolean, String> QUSxYX() {
        TrailingConfig trailingUpConfig;
        TrailingConfig trailingDownConfig;
        TrailingConfig trailingDownConfig2;
        TrailingConfig trailingUpConfig2 = this.ejfBZ.getTrailingUpConfig();
        if (trailingUpConfig2 != null && trailingUpConfig2.getEnabled() && (trailingDownConfig2 = this.ejfBZ.getTrailingDownConfig()) != null && trailingDownConfig2.getEnabled()) {
            return C56390yDp.OLrzqt(Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.max));
        }
        TrailingConfig trailingUpConfig3 = this.ejfBZ.getTrailingUpConfig();
        if (trailingUpConfig3 != null && trailingUpConfig3.getEnabled() && ((trailingDownConfig = this.ejfBZ.getTrailingDownConfig()) == null || !trailingDownConfig.getEnabled())) {
            return C56390yDp.OLrzqt(Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.StringDef));
        }
        TrailingConfig trailingDownConfig3 = this.ejfBZ.getTrailingDownConfig();
        if (trailingDownConfig3 != null && trailingDownConfig3.getEnabled() && ((trailingUpConfig = this.ejfBZ.getTrailingUpConfig()) == null || !trailingUpConfig.getEnabled())) {
            return C56390yDp.OLrzqt(Boolean.TRUE, C33070mpX.AYXKKw(C55688xof.Application.Size));
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, "");
    }

    public final boolean aKErDB() {
        TrailingConfig trailingDownConfig = this.ejfBZ.getTrailingDownConfig();
        return trailingDownConfig != null && trailingDownConfig.getEnabled() && C33129mqd.AEQbTJ(trailingDownConfig.getStopPx(), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [469=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String copydefault(@NotNull String str, @NotNull String str2) {
        Boolean boolValueOf;
        String additionalQuoteInvestment;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AdditionalInvest value = this.EZpvd.getValue();
        String str3 = (value == null || (additionalQuoteInvestment = value.getAdditionalQuoteInvestment()) == null) ? "0" : additionalQuoteInvestment;
        String quoteSz = this.ejfBZ.getQuoteSz();
        String str4 = quoteSz == null ? "0" : quoteSz;
        String baseSz = this.ejfBZ.getBaseSz();
        if (baseSz == null) {
            baseSz = "0";
        }
        String sourceCcySz = this.ejfBZ.getSourceCcySz();
        String str5 = sourceCcySz != null ? sourceCcySz : "0";
        String str6 = this.getNewProxyInstance;
        boolean zAEQbTJ = true;
        boolean z = false;
        switch (str6.hashCode()) {
            case -650211604:
                boolValueOf = !str6.equals("default_usdt") ? null : Boolean.valueOf(C33129mqd.AEQbTJ(str5, str));
                break;
            case 3016401:
                if (str6.equals(TtmlNode.RUBY_BASE)) {
                    if (!Intrinsics.EZpvd(this.ejfBZ.getReserveFunds(), Boolean.TRUE)) {
                        zAEQbTJ = C33129mqd.AEQbTJ(baseSz, str2);
                    } else if (!C33129mqd.AEQbTJ(baseSz, str2)) {
                        zAEQbTJ = C33129mqd.AEQbTJ(str3, str);
                        z = zAEQbTJ;
                    }
                    boolValueOf = Boolean.valueOf(zAEQbTJ);
                    break;
                }
                break;
            case 3094652:
                if (str6.equals("dual")) {
                    if (!Intrinsics.EZpvd(this.ejfBZ.getReserveFunds(), Boolean.TRUE) ? !(C33129mqd.AEQbTJ(str4, str) || C33129mqd.AEQbTJ(baseSz, str2)) : !(C33129mqd.AEQbTJ(C33129mqd.addS$default(str4, str3, null, null, null, 14, null), str) || C33129mqd.AEQbTJ(baseSz, str2))) {
                        zAEQbTJ = false;
                    }
                    boolValueOf = Boolean.valueOf(zAEQbTJ);
                    break;
                }
                break;
            case 107953788:
                if (str6.equals("quote")) {
                    boolValueOf = Boolean.valueOf(Intrinsics.EZpvd(this.ejfBZ.getReserveFunds(), Boolean.TRUE) ? C33129mqd.AEQbTJ(C33129mqd.addS$default(str4, str3, null, null, null, 14, null), str) : C33129mqd.AEQbTJ(str4, str));
                    break;
                }
                break;
        }
        return Intrinsics.EZpvd(boolValueOf, Boolean.TRUE) ? z ? C33069mpW.copydefault(C55688xof.Application.enforcement, C56423yEv.EZpvd(C56390yDp.OLrzqt("quoteCurrency", AkhnZx()))) : C33070mpX.AYXKKw(C55688xof.Application.fERRXa) : "";
    }

    public final String AkhnZx() {
        return Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) "default_usdt") ? "USDT" : AuCTel();
    }

    public final String AuCTel() {
        return fvQaOB().copydefault("grid");
    }

    public final String fARcdN() {
        return fvQaOB().AEQbTJ("grid");
    }

    public final String ejfBZ() {
        BotUserConfigInfo botUserConfigInfoCopydefault;
        String profitSharingRatio = this.ejfBZ.getProfitSharingRatio();
        if (!StringsKt__StringsKt.fARcdN((CharSequence) profitSharingRatio)) {
            return profitSharingRatio;
        }
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault == null || (botUserConfigInfoCopydefault = interfaceC55881xsMCopydefault.copydefault()) == null) {
            return null;
        }
        return botUserConfigInfoCopydefault.getDefaultProfitSharingRatio();
    }

    private final String flVtFt() {
        String strAYXKKw;
        String strAddS$default = C33129mqd.AEQbTJ(this.ejfBZ.getQuoteSz(), 0) ? C33129mqd.addS$default("0", this.ejfBZ.getQuoteSz(), null, null, null, 14, null) : "0";
        if (C33129mqd.AEQbTJ(this.ejfBZ.getSourceCcySz(), 0)) {
            strAddS$default = C33129mqd.addS$default(strAddS$default, this.ejfBZ.getSourceCcySz(), null, null, null, 14, null);
        }
        String str = strAddS$default;
        if (!C33129mqd.AEQbTJ(this.ejfBZ.getBaseSz(), 0)) {
            return str;
        }
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        return C33129mqd.addS$default(str, C33129mqd.mulS$default(this.ejfBZ.getBaseSz(), (value == null || (strAYXKKw = value.AYXKKw()) == null) ? "0" : strAYXKKw, null, null, null, 14, null), null, null, null, 14, null);
    }

    public final String KWHzl(AdditionalInvest additionalInvest) {
        String additionalQuoteInvestment;
        String instId;
        String instType;
        if (additionalInvest != null && (additionalQuoteInvestment = additionalInvest.getAdditionalQuoteInvestment()) != null) {
            String strAddS$default = C33129mqd.addS$default(additionalQuoteInvestment, flVtFt(), null, null, null, 14, null);
            BizInstrument bizInstrumentQOLQEE = QOLQEE();
            if (!C33129mqd.OLrzqt((Object) strAddS$default, (Object) 0)) {
                return C56033xvF.getBotPrice$default((bizInstrumentQOLQEE == null || (instType = bizInstrumentQOLQEE.getInstType()) == null) ? "" : instType, (bizInstrumentQOLQEE == null || (instId = bizInstrumentQOLQEE.getInstId()) == null) ? "" : instId, strAddS$default, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            }
        }
        return "--";
    }

    public final String values() {
        String additionalQuoteInvestment;
        if (Intrinsics.EZpvd(this.ejfBZ.getReserveFunds(), Boolean.TRUE)) {
            String strFlVtFt = flVtFt();
            AdditionalInvest value = this.EZpvd.getValue();
            if (value == null || (additionalQuoteInvestment = value.getAdditionalQuoteInvestment()) == null) {
                additionalQuoteInvestment = "0";
            }
            return C33129mqd.addS$default(strFlVtFt, additionalQuoteInvestment, null, null, null, 14, null);
        }
        return flVtFt();
    }

    public final String isConnected() {
        C54571xNh c54571xNhEZpvd;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLCopydefault;
        String safeString$default;
        String strValues = values();
        QOLQEE();
        return (C33129mqd.OLrzqt((Object) strValues, (Object) 0) || (c54571xNhEZpvd = fvQaOB().EZpvd(fvQaOB().copydefault("grid"))) == null || (c54536xMLAYXKKw = c54571xNhEZpvd.AYXKKw(strValues)) == null || (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (c54536xMLCopydefault = c54536xMLFetchVPNInfo.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "--" : safeString$default;
    }

    public final void fFgQHt() {
        this.ejfBZ.setInvestType("1");
    }

    public final void gasjUx() {
        this.ejfBZ.setInvestType("2");
    }

    private final boolean iZzfmt() {
        String maxGridNum;
        StrategyConfigInfo value = this.OLrzqt.getValue();
        GridNumRangeBean value2 = this.isConnected.getValue();
        if (value2 == null || (maxGridNum = value2.getMaxGridNum()) == null) {
            maxGridNum = value != null ? value.getMaxGridNum() : null;
        }
        return C33129mqd.copydefault(this.ejfBZ.getGridNum(), value != null ? value.getMinGridNum() : null) && C33129mqd.valueOf(this.ejfBZ.getGridNum(), maxGridNum);
    }

    public final boolean AEQbTJ() {
        TrailingConfig trailingDownConfig = this.ejfBZ.getTrailingDownConfig();
        if (trailingDownConfig != null && trailingDownConfig.getEnabled()) {
            AdvancedTriggerSign advancedTriggerSignHUfVAv = hUfVAv();
            if (!Intrinsics.EZpvd((Object) (advancedTriggerSignHUfVAv != null ? advancedTriggerSignHUfVAv.getIndicator() : null), (Object) GridStartTriggerType.INSTANT.getMode())) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<AdvancedTriggerSign> gEmmrt() {
        return yDY.copydefault(new AdvancedTriggerSign(TtmlNode.START, GridStartTriggerType.INSTANT.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4092, (DefaultConstructorMarker) null), new AdvancedTriggerSign("stop", GridStopTriggerType.MANUAL_STOP.getMode(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "1", (String) null, 3068, (DefaultConstructorMarker) null));
    }

    public final BizInstrument AhwBna() {
        if (Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) "default_usdt")) {
            return QOLQEE();
        }
        return null;
    }

    public final String ORxRYg() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        String instFamily;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt("SPOT")) != null) {
            BizInstrument bizInstrumentQOLQEE = QOLQEE();
            if (bizInstrumentQOLQEE == null || (instFamily = bizInstrumentQOLQEE.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                return idxConfigAkhnZx.getQuoteDig();
            }
        }
        return null;
    }

    public final BizInstrument QOLQEE() {
        String tradeSymbol;
        BizInstrument bizInstrumentAhwBna = fvQaOB().AhwBna();
        if (!Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) "default_usdt")) {
            return bizInstrumentAhwBna;
        }
        if (bizInstrumentAhwBna == null || (tradeSymbol = bizInstrumentAhwBna.getTradeSymbol()) == null) {
            tradeSymbol = "BTC";
        }
        String str = tradeSymbol + "-USDT";
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SPOT", str, null, null, 12, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AEQbTJ(boolean z) {
        String minQuoteSz;
        if (z) {
            BizInstrument bizInstrumentQOLQEE = QOLQEE();
            if (Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) "default_usdt")) {
                MinInvestResp value = this.hDKMBd.getValue();
                minQuoteSz = value != null ? value.getMinSourceSz() : null;
            } else {
                MinInvestResp value2 = this.hDKMBd.getValue();
                if (value2 != null) {
                    minQuoteSz = value2.getMinQuoteSz();
                }
            }
            return KWHzl(minQuoteSz, bizInstrumentQOLQEE != null ? bizInstrumentQOLQEE.getInstFamily() : null, bizInstrumentQOLQEE != null ? bizInstrumentQOLQEE.getQuoteSymbol() : null);
        }
        MinInvestResp value3 = this.hDKMBd.getValue();
        return converterSz$default(this, value3 != null ? value3.getMinBaseSz() : null, null, null, 6, null);
    }

    public static /* synthetic */ void setQuoteAmt$default(SpotGridPresenter spotGridPresenter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        spotGridPresenter.EZpvd(str);
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) this.getNewProxyInstance, (Object) "default_usdt")) {
            this.ejfBZ.setSourceCcySz(str);
            this.ejfBZ.setSourceCcy("USDT");
            this.ejfBZ.setQuoteSz(null);
        } else {
            this.ejfBZ.setSourceCcySz(null);
            this.ejfBZ.setSourceCcy(null);
            this.ejfBZ.setQuoteSz(str);
        }
    }

    public final void EZpvd() {
        this.ejfBZ.setInstType(fvQaOB().djBIcL());
        this.ejfBZ.setInstId(fvQaOB().gEmmrt());
    }

    public final void KWHzl(boolean z) {
        this.ejfBZ.setProfitAutoReinvestParam(new ProfitAutoReinvestParam(z));
    }

    public final void finit() {
        this.ejfBZ.setProfitAutoReinvestParam(null);
    }

    public final String QbewEr() {
        String strOLrzqt = fvQaOB().OLrzqt();
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public final String OcIXYQ() {
        return fvQaOB().ejfBZ();
    }

    public final void AwvSrB() {
        C56222xyj c56222xyjDTwDnp = DTwDnp();
        c56222xyjDTwDnp.AEQbTJ(this.copydefault);
        c56222xyjDTwDnp.AEQbTJ(new C56222xyj.Application(this.ejfBZ.getOrdType(), this.ejfBZ.getSourceCcy(), this.ejfBZ.getTrailingDownConfig(), this.ejfBZ.getReserveFunds()));
        xKK.Activity.execute$default(c56222xyjDTwDnp, 0L, 1, null);
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.AuCTelauCTel, this.values, this.fetchVPNInfo, this.djBIcL, this.AkhnZx, this.AEQbTJ, this.AubY, this.DbNXlk, this.AhwBna, gGvvIC());
    }

    public static final Unit OLrzqt(SpotGridPresenter spotGridPresenter, ResponseData responseData) {
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && (interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault()) != null) {
            List list = (List) responseData.getData();
            interfaceC55881xsMCopydefault.AEQbTJ(list != null ? (BotUserConfigInfo) CollectionsKt___CollectionsKt.AkhnZx(list, 0) : null);
        }
        C56280xzo c56280xzo = spotGridPresenter.AhwBna;
        c56280xzo.EZpvd(spotGridPresenter.fvQaOB().gEmmrt(), "official", "grid", (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? null : null, (56 & 32) != 0 ? null : null);
        c56280xzo.OLrzqt(spotGridPresenter.valueOf, new C54504xKw());
        xKK.Activity.execute$default(c56280xzo, 0L, 1, null);
        return Unit.INSTANCE;
    }
}
