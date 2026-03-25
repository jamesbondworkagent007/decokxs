package com.okinc.unify_trade.bot.dcd.presenter;

import android.app.Application;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.biz.TradeType;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdBotQuotesDetail;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.DcdQuotesReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.DcdPnlChartData;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.bot.dcd.config.DcdTpMode;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import o.C54226xAo;
import o.C54235xAx;
import o.C54507xKz;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdProductDetailPresenter extends AbsPresenter {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final TradeLiveData<Boolean> AEQbTJ;
    public ProductItemResp AYXKKw;
    public final C54226xAo EZpvd;
    public final TradeLiveData<List<StrategyResponse>> KWHzl;
    public Job copydefault;
    public DcdProductListReq djBIcL;
    public final TradeLiveData<DcdBotQuotesDetail> gEmmrt;
    public final C54235xAx valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(DcdProductListReq dcdProductListReq) {
        this.djBIcL = dcdProductListReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdProductListReq EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54226xAo KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(ProductItemResp productItemResp) {
        this.AYXKKw = productItemResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<StrategyResponse>> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54235xAx copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<DcdBotQuotesDetail> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcdProductDetailPresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.valueOf = new C54235xAx();
        this.gEmmrt = new TradeLiveData<>();
        this.EZpvd = new C54226xAo();
        this.KWHzl = new TradeLiveData<>();
        this.AEQbTJ = new TradeLiveData<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.dcd.presenter.DcdProductDetailPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void fetchQuotes$default(DcdProductDetailPresenter dcdProductDetailPresenter, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        dcdProductDetailPresenter.EZpvd(str, z, z2);
    }

    public final void EZpvd(String str, boolean z, boolean z2) {
        C54235xAx c54235xAx = this.valueOf;
        c54235xAx.KWHzl(OLrzqt(str));
        c54235xAx.djBIcL();
        c54235xAx.OLrzqt(this.gEmmrt, new C54507xKz());
        c54235xAx.OLrzqt(z ? 300L : 0L);
        if (z2) {
            EZpvd(str);
        }
    }

    public final DcdQuotesReq OLrzqt(String str) {
        String dcdOptionType;
        ProductItemResp productItemResp = this.AYXKKw;
        String currency = productItemResp != null ? productItemResp.getCurrency() : null;
        ProductItemResp productItemResp2 = this.AYXKKw;
        String alternativeCurrency = productItemResp2 != null ? productItemResp2.getAlternativeCurrency() : null;
        ProductItemResp productItemResp3 = this.AYXKKw;
        String symbol = productItemResp3 != null ? productItemResp3.getSymbol() : null;
        ProductItemResp productItemResp4 = this.AYXKKw;
        String underlyingIndex = productItemResp4 != null ? productItemResp4.getUnderlyingIndex() : null;
        DcdProductListReq dcdProductListReq = this.djBIcL;
        if (dcdProductListReq == null || (dcdOptionType = dcdProductListReq.getDcdOptionType()) == null) {
            dcdOptionType = "";
        }
        String str2 = dcdOptionType;
        ProductItemResp productItemResp5 = this.AYXKKw;
        String strike = productItemResp5 != null ? productItemResp5.getStrike() : null;
        ProductItemResp productItemResp6 = this.AYXKKw;
        String launchTime = productItemResp6 != null ? productItemResp6.getLaunchTime() : null;
        ProductItemResp productItemResp7 = this.AYXKKw;
        String expiryTime = productItemResp7 != null ? productItemResp7.getExpiryTime() : null;
        ProductItemResp productItemResp8 = this.AYXKKw;
        return new DcdQuotesReq(currency, alternativeCurrency, symbol, underlyingIndex, str2, "Sell", strike, launchTime, expiryTime, productItemResp8 != null ? productItemResp8.getSettlementTime() : null, str);
    }

    public final StrategyReqGroup OLrzqt(@NotNull String str, @NotNull Map<DcdTpMode, String> map) {
        String quoteId;
        String alternativeCurrency;
        String currency;
        String alternativeCurrency2;
        String dcdOptionType;
        String strike;
        String strike2;
        String minAnnualYieldPercentage;
        String maxSettlementDay;
        String annualYieldPercentage;
        String settlementTime;
        String term;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        DcdBotQuotesDetail value = this.gEmmrt.getValue();
        StrategyBaseReq strategyBaseReq = new StrategyBaseReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, "dcd_bot", (TradeType) null, (String) null, (Boolean) null, 1919, (DefaultConstructorMarker) null);
        if (value == null || (quoteId = value.getQuoteId()) == null) {
            quoteId = "";
        }
        if (value == null || (alternativeCurrency = value.getAlternativeCurrency()) == null) {
            alternativeCurrency = "";
        }
        if (value == null || (currency = value.getCurrency()) == null) {
            currency = "";
        }
        if (value == null || (alternativeCurrency2 = value.getAlternativeCurrency()) == null) {
            alternativeCurrency2 = "";
        }
        DcdProductListReq dcdProductListReq = this.djBIcL;
        if (dcdProductListReq == null || (dcdOptionType = dcdProductListReq.getDcdOptionType()) == null) {
            dcdOptionType = "";
        }
        DcdProductListReq dcdProductListReq2 = this.djBIcL;
        if (dcdProductListReq2 == null || (strike = dcdProductListReq2.getStrike()) == null) {
            strike = "";
        }
        if (value == null || (strike2 = value.getStrike()) == null) {
            strike2 = "";
        }
        DcdProductListReq dcdProductListReq3 = this.djBIcL;
        String strikePercentage = dcdProductListReq3 != null ? dcdProductListReq3.getStrikePercentage() : null;
        DcdProductListReq dcdProductListReq4 = this.djBIcL;
        if (dcdProductListReq4 == null || (minAnnualYieldPercentage = dcdProductListReq4.getMinAnnualYieldPercentage()) == null) {
            minAnnualYieldPercentage = "";
        }
        DcdProductListReq dcdProductListReq5 = this.djBIcL;
        if (dcdProductListReq5 == null || (maxSettlementDay = dcdProductListReq5.getMaxSettlementDay()) == null) {
            maxSettlementDay = "";
        }
        String str2 = map.get(DcdTpMode.CUSTOM_PRICE);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = map.get(DcdTpMode.DECIMAL);
        return new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, new DcdOrderReq(quoteId, str, alternativeCurrency, currency, alternativeCurrency2, dcdOptionType, strike, strike2, strikePercentage, minAnnualYieldPercentage, maxSettlementDay, str2, str3 == null ? "" : str3, (String) null, (value == null || (term = value.getTerm()) == null) ? "" : term, (value == null || (settlementTime = value.getSettlementTime()) == null) ? "" : settlementTime, (value == null || (annualYieldPercentage = value.getAnnualYieldPercentage()) == null) ? "" : annualYieldPercentage, 8192, (DefaultConstructorMarker) null), false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 31742, (DefaultConstructorMarker) null);
    }

    public final DcdPnlChartData KWHzl(@NotNull String str) {
        String settlementTime;
        String strike;
        String absYieldPercentage;
        String currency;
        String alternativeCurrency;
        String instId;
        Intrinsics.checkNotNullParameter(str, "");
        DcdProductListReq dcdProductListReq = this.djBIcL;
        String str2 = (dcdProductListReq == null || (instId = dcdProductListReq.getInstId()) == null) ? "" : instId;
        ProductItemResp productItemResp = this.AYXKKw;
        String str3 = (productItemResp == null || (alternativeCurrency = productItemResp.getAlternativeCurrency()) == null) ? "" : alternativeCurrency;
        ProductItemResp productItemResp2 = this.AYXKKw;
        String str4 = (productItemResp2 == null || (currency = productItemResp2.getCurrency()) == null) ? "" : currency;
        ProductItemResp productItemResp3 = this.AYXKKw;
        String str5 = (productItemResp3 == null || (absYieldPercentage = productItemResp3.getAbsYieldPercentage()) == null) ? "" : absYieldPercentage;
        ProductItemResp productItemResp4 = this.AYXKKw;
        String str6 = (productItemResp4 == null || (strike = productItemResp4.getStrike()) == null) ? "" : strike;
        ProductItemResp productItemResp5 = this.AYXKKw;
        return new DcdPnlChartData(str2, "dip_snipping", str, str3, "", str4, str5, str6, (productItemResp5 == null || (settlementTime = productItemResp5.getSettlementTime()) == null) ? "" : settlementTime, null, 512, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull Map<DcdTpMode, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C54226xAo c54226xAo = this.EZpvd;
        DcdOrderReq dcdReq = OLrzqt(str, map).getDcdReq();
        if (dcdReq == null) {
            return;
        }
        c54226xAo.AEQbTJ(dcdReq);
        c54226xAo.AEQbTJ(this.KWHzl);
        xKK.Activity.execute$default(c54226xAo, 0L, 1, null);
    }

    public final void EZpvd(String str) {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.copydefault = FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.onEach(FlowKt.flowOn(FlowKt.flow(new DcdProductDetailPresenter$startPollingQuotes$1(null)), Dispatchers.getMain()), new DcdProductDetailPresenter$startPollingQuotes$2(this, str, null)), new DcdProductDetailPresenter$startPollingQuotes$3(this, null)), new DcdProductDetailPresenter$startPollingQuotes$4(null)), ViewModelKt.getViewModelScope(this));
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onPause(lifecycleOwner);
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.valueOf, this.EZpvd);
    }
}
