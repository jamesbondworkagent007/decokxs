package com.okinc.tradingbot.impl.botList.ui.backtest;

import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.tradingbot.impl.botList.domain.model.BacktestFilter;
import com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListViewModel;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC56429yFa;
import o.C48234uJy;
import o.C48235uJz;
import o.C55804xqp;
import o.C55930xtI;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC56387yDm;
import o.pUU;
import o.uJO;
import o.uLN;
import o.uLU;
import o.wUL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BacktestListViewModel extends uLN<Object> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final Map<String, BizTradeStrategyInfo> AhwBna;
    public final C48234uJy EZpvd;
    public BacktestFilter KWHzl;
    public final MutableStateFlow<uLU<Activity>> OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final StateFlow<uLU<Activity>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLU<Activity>> KWHzl() {
        return this.gEmmrt;
    }

    @yCM
    public BacktestListViewModel(@NotNull C48234uJy c48234uJy, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c48234uJy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c48234uJy;
        this.AEQbTJ = coroutineDispatcher;
        MutableStateFlow<uLU<Activity>> MutableStateFlow = StateFlowKt.MutableStateFlow(uLU.Companion.EZpvd(true));
        this.OLrzqt = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        this.KWHzl = BacktestFilter.ALL;
        this.AhwBna = new LinkedHashMap();
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uKf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BacktestListViewModel.EZpvd();
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ BacktestListViewModel OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(CoroutineExceptionHandler.Key key, BacktestListViewModel backtestListViewModel) {
            super(key);
            this.OLrzqt = backtestListViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            pUU.AEQbTJ("BacktestListViewModel", "Failed to load backtests", th);
            this.OLrzqt.OLrzqt.setValue(uLU.Companion.KWHzl(th));
        }
    }

    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ BacktestListViewModel copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, BacktestListViewModel backtestListViewModel) {
            super(key);
            this.copydefault = backtestListViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            Object value;
            Object objCopydefault;
            pUU.AEQbTJ("BacktestListViewModel", "Failed to load more backtests", th);
            MutableStateFlow mutableStateFlow = this.copydefault.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
                objCopydefault = (uLU) value;
                if (objCopydefault instanceof uLU.ActionBar) {
                    uLU.ActionBar actionBar = (uLU.ActionBar) objCopydefault;
                    objCopydefault = actionBar.copydefault(Activity.copy$default((Activity) actionBar.KWHzl(), null, false, null, false, 7, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, objCopydefault));
        }
    }

    public static final C55930xtI EZpvd() {
        return new C55930xtI(false, 1, null);
    }

    public final C55930xtI OLrzqt() {
        return (C55930xtI) this.djBIcL.getValue();
    }

    public final void OLrzqt(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (stateListAnimator instanceof StateListAnimator.C0639StateListAnimator) {
            AEQbTJ(true);
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.Application) {
            AEQbTJ(true);
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.ActionBar) {
            AEQbTJ(false);
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.TaskDescription) {
            copydefault();
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.Activity) {
            this.KWHzl = ((StateListAnimator.Activity) stateListAnimator).copydefault();
            AEQbTJ(true);
        } else {
            if (!(stateListAnimator instanceof StateListAnimator.LoaderManager)) {
                throw new NoWhenBranchMatchedException();
            }
            StateListAnimator.LoaderManager loaderManager = (StateListAnimator.LoaderManager) stateListAnimator;
            AEQbTJ(loaderManager.KWHzl(), loaderManager.EZpvd());
        }
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            this.OLrzqt.setValue(uLU.Companion.EZpvd(true));
            this.AhwBna.clear();
        }
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AEQbTJ.plus(new Application(CoroutineExceptionHandler.Key, this)), null, new BacktestListViewModel$loadBacktests$2(this, null), 2, null);
    }

    public final void AEQbTJ(String str, String str2) {
        uLU<Activity> value;
        uLU<Activity> uluCopydefault;
        EZpvd(str, str2);
        MutableStateFlow<uLU<Activity>> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
            uluCopydefault = value;
            if (uluCopydefault instanceof uLU.ActionBar) {
                uLU.ActionBar actionBar = (uLU.ActionBar) uluCopydefault;
                Activity activity = (Activity) actionBar.KWHzl();
                List<uJO> listOLrzqt = ((Activity) actionBar.KWHzl()).OLrzqt();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (uJO ujoEZpvd : listOLrzqt) {
                    if (Intrinsics.EZpvd((Object) ujoEZpvd.AkhnZx(), (Object) str)) {
                        ujoEZpvd = ujoEZpvd.EZpvd(((-33) & 1) != 0 ? ujoEZpvd.fetchVPNInfo : null, ((-33) & 2) != 0 ? ujoEZpvd.KWHzl : null, ((-33) & 4) != 0 ? ujoEZpvd.fIwbmz : null, ((-33) & 8) != 0 ? ujoEZpvd.valueOf : null, ((-33) & 16) != 0 ? ujoEZpvd.AuCTel : false, ((-33) & 32) != 0 ? ujoEZpvd.djBIcL : str2.length() == 0 ? C48235uJz.resolveDisplayName$default(C48235uJz.EZpvd, ujoEZpvd.fJNWhG(), null, ujoEZpvd.AEQbTJ(), 2, null) : str2, ((-33) & 64) != 0 ? ujoEZpvd.values : null, ((-33) & 128) != 0 ? ujoEZpvd.OcIXYQ : null, ((-33) & 256) != 0 ? ujoEZpvd.isConnected : null, ((-33) & 512) != 0 ? ujoEZpvd.fJNWhG : false, ((-33) & 1024) != 0 ? ujoEZpvd.DbNXlk : false, ((-33) & 2048) != 0 ? ujoEZpvd.zsXlph : null, ((-33) & 4096) != 0 ? ujoEZpvd.AuCTelauCTel : null, ((-33) & 8192) != 0 ? ujoEZpvd.AubY : null, ((-33) & 16384) != 0 ? ujoEZpvd.copydefault : null, ((-33) & 32768) != 0 ? ujoEZpvd.ejfBZ : null, ((-33) & 65536) != 0 ? ujoEZpvd.AkhnZx : null, ((-33) & 131072) != 0 ? ujoEZpvd.AxsJAY : null, ((-33) & 262144) != 0 ? ujoEZpvd.hDKMBd : null, ((-33) & 524288) != 0 ? ujoEZpvd.getNewProxyInstance : null, ((-33) & 1048576) != 0 ? ujoEZpvd.zuBGHE : null, ((-33) & 2097152) != 0 ? ujoEZpvd.gHZMYf : null, ((-33) & 4194304) != 0 ? ujoEZpvd.sSMYrx : null, ((-33) & 8388608) != 0 ? ujoEZpvd.QOLQEE : null, ((-33) & 16777216) != 0 ? ujoEZpvd.uzCIH : null, ((-33) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? ujoEZpvd.fARcdN : null, ((-33) & 67108864) != 0 ? ujoEZpvd.wlaJM : null, ((-33) & 134217728) != 0 ? ujoEZpvd.OLrzqt : null, ((-33) & 268435456) != 0 ? ujoEZpvd.AYXKKw : null, ((-33) & 536870912) != 0 ? ujoEZpvd.AwvSrB : null, ((-33) & 1073741824) != 0 ? ujoEZpvd.AhwBna : null, ((-33) & Integer.MIN_VALUE) != 0 ? ujoEZpvd.zLjUOn : false, (15 & 1) != 0 ? ujoEZpvd.iwGUEr : null, (15 & 2) != 0 ? ujoEZpvd.gEmmrt : null, (15 & 4) != 0 ? ujoEZpvd.getFieldNames : null, (15 & 8) != 0 ? ujoEZpvd.AEQbTJ : null);
                    }
                    arrayList.add(ujoEZpvd);
                }
                uluCopydefault = actionBar.copydefault(Activity.copy$default(activity, arrayList, false, null, false, 14, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, uluCopydefault));
    }

    public final void EZpvd(String str, String str2) {
        BotVo bot;
        BotCommon common;
        BizTradeStrategyInfo bizTradeStrategyInfo = this.AhwBna.get(str);
        StrategyPendingListResp strategyPendingListResp = bizTradeStrategyInfo instanceof StrategyPendingListResp ? (StrategyPendingListResp) bizTradeStrategyInfo : null;
        if (strategyPendingListResp == null || (bot = strategyPendingListResp.getBot()) == null || (common = bot.getCommon()) == null) {
            return;
        }
        BotCommon botCommonCopy$default = BotCommon.copy$default(common, null, null, null, null, false, str2.length() == 0 ? null : str2, 31, null);
        BotVo bot2 = strategyPendingListResp.getBot();
        this.AhwBna.put(str, strategyPendingListResp.copy(((-1) & 1) != 0 ? strategyPendingListResp.instType : null, ((-1) & 2) != 0 ? strategyPendingListResp.instId : null, ((-1) & 4) != 0 ? strategyPendingListResp.ccy : null, ((-1) & 8) != 0 ? strategyPendingListResp.ordId : null, ((-1) & 16) != 0 ? strategyPendingListResp.algoId : null, ((-1) & 32) != 0 ? strategyPendingListResp.ordType : null, ((-1) & 64) != 0 ? strategyPendingListResp.tdMode : null, ((-1) & 128) != 0 ? strategyPendingListResp.lever : null, ((-1) & 256) != 0 ? strategyPendingListResp.state : null, ((-1) & 512) != 0 ? strategyPendingListResp.triggerTime : null, ((-1) & 1024) != 0 ? strategyPendingListResp.cTime : null, ((-1) & 2048) != 0 ? strategyPendingListResp.pxVar : null, ((-1) & 4096) != 0 ? strategyPendingListResp.pxSpread : null, ((-1) & 8192) != 0 ? strategyPendingListResp.szLimit : null, ((-1) & 16384) != 0 ? strategyPendingListResp.pxLimit : null, ((-1) & 32768) != 0 ? strategyPendingListResp.actualSz : null, ((-1) & 65536) != 0 ? strategyPendingListResp.totalCycleProfit : null, ((-1) & 131072) != 0 ? strategyPendingListResp.arbitragePnl : null, ((-1) & 262144) != 0 ? strategyPendingListResp.arbitrageProfitRate : null, ((-1) & 524288) != 0 ? strategyPendingListResp.totalCycleProfitRate : null, ((-1) & 1048576) != 0 ? strategyPendingListResp.sz : null, ((-1) & 2097152) != 0 ? strategyPendingListResp.side : null, ((-1) & 4194304) != 0 ? strategyPendingListResp.posSide : null, ((-1) & 8388608) != 0 ? strategyPendingListResp.timeInterval : null, ((-1) & 16777216) != 0 ? strategyPendingListResp.maxPx : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyPendingListResp.minPx : null, ((-1) & 67108864) != 0 ? strategyPendingListResp.gridNum : null, ((-1) & 134217728) != 0 ? strategyPendingListResp.runType : null, ((-1) & 268435456) != 0 ? strategyPendingListResp.runPx : null, ((-1) & 536870912) != 0 ? strategyPendingListResp.quoteSz : null, ((-1) & 1073741824) != 0 ? strategyPendingListResp.baseSz : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyPendingListResp.tpRatio : null, ((-1) & 1) != 0 ? strategyPendingListResp.slRatio : null, ((-1) & 2) != 0 ? strategyPendingListResp.tpOrderPx : null, ((-1) & 4) != 0 ? strategyPendingListResp.slOrderPx : null, ((-1) & 8) != 0 ? strategyPendingListResp.tradeNum : null, ((-1) & 16) != 0 ? strategyPendingListResp.totalPnl : null, ((-1) & 32) != 0 ? strategyPendingListResp.pnlRatio : null, ((-1) & 64) != 0 ? strategyPendingListResp.arbApy : null, ((-1) & 128) != 0 ? strategyPendingListResp.investment : null, ((-1) & 256) != 0 ? strategyPendingListResp.cancelType : null, ((-1) & 512) != 0 ? strategyPendingListResp.notionalUsd : null, ((-1) & 1024) != 0 ? strategyPendingListResp.count : null, ((-1) & 2048) != 0 ? strategyPendingListResp.stopResult : null, ((-1) & 4096) != 0 ? strategyPendingListResp.profitNum : null, ((-1) & 8192) != 0 ? strategyPendingListResp.avgDailyArbitrageNum : null, ((-1) & 16384) != 0 ? strategyPendingListResp.arbitrageNum : null, ((-1) & 32768) != 0 ? strategyPendingListResp.tgtCcy : null, ((-1) & 65536) != 0 ? strategyPendingListResp.callbackRatio : null, ((-1) & 131072) != 0 ? strategyPendingListResp.callbackSpread : null, ((-1) & 262144) != 0 ? strategyPendingListResp.activePx : null, ((-1) & 524288) != 0 ? strategyPendingListResp.activePxType : null, ((-1) & 1048576) != 0 ? strategyPendingListResp.moveTriggerPx : null, ((-1) & 2097152) != 0 ? strategyPendingListResp.last : null, ((-1) & 4194304) != 0 ? strategyPendingListResp.uTime : null, ((-1) & 8388608) != 0 ? strategyPendingListResp.direction : null, ((-1) & 16777216) != 0 ? strategyPendingListResp.basePos : false, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyPendingListResp.noClosePositionId : null, ((-1) & 67108864) != 0 ? strategyPendingListResp.actualLever : null, ((-1) & 134217728) != 0 ? strategyPendingListResp.actualMarginSz : null, ((-1) & 268435456) != 0 ? strategyPendingListResp.extraMarginSz : null, ((-1) & 536870912) != 0 ? strategyPendingListResp.availEq : null, ((-1) & 1073741824) != 0 ? strategyPendingListResp.liqPx : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyPendingListResp.floatProfit : null, ((-1) & 1) != 0 ? strategyPendingListResp.floatProfitInSourceCcy : null, ((-1) & 2) != 0 ? strategyPendingListResp.floatProfitRate : null, ((-1) & 4) != 0 ? strategyPendingListResp.arbitrageApy : null, ((-1) & 8) != 0 ? strategyPendingListResp.eq : null, ((-1) & 16) != 0 ? strategyPendingListResp.gridProfit : null, ((-1) & 32) != 0 ? strategyPendingListResp.gridProfitInSourceCcy : null, ((-1) & 64) != 0 ? strategyPendingListResp.gridProfitRate : null, ((-1) & 128) != 0 ? strategyPendingListResp.algoOrdType : null, ((-1) & 256) != 0 ? strategyPendingListResp.instList : null, ((-1) & 512) != 0 ? strategyPendingListResp.associate : null, ((-1) & 1024) != 0 ? strategyPendingListResp.stgyName : null, ((-1) & 2048) != 0 ? strategyPendingListResp.amt : null, ((-1) & 4096) != 0 ? strategyPendingListResp.recurringList : null, ((-1) & 8192) != 0 ? strategyPendingListResp.period : null, ((-1) & 16384) != 0 ? strategyPendingListResp.recurringDay : null, ((-1) & 32768) != 0 ? strategyPendingListResp.nextInvestTime : null, ((-1) & 65536) != 0 ? strategyPendingListResp.recurringHour : null, ((-1) & 131072) != 0 ? strategyPendingListResp.investCcy : null, ((-1) & 262144) != 0 ? strategyPendingListResp.recurringTime : null, ((-1) & 524288) != 0 ? strategyPendingListResp.cycles : null, ((-1) & 1048576) != 0 ? strategyPendingListResp.investAmt : null, ((-1) & 2097152) != 0 ? strategyPendingListResp.duration : null, ((-1) & 4194304) != 0 ? strategyPendingListResp.investType : null, ((-1) & 8388608) != 0 ? strategyPendingListResp.portfolioList : null, ((-1) & 16777216) != 0 ? strategyPendingListResp.balType : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyPendingListResp.deltaRatio : null, ((-1) & 67108864) != 0 ? strategyPendingListResp.interval : null, ((-1) & 134217728) != 0 ? strategyPendingListResp.balNum : null, ((-1) & 268435456) != 0 ? strategyPendingListResp.uly : null, ((-1) & 536870912) != 0 ? strategyPendingListResp.quickMgnType : null, ((-1) & 1073741824) != 0 ? strategyPendingListResp.ordSource : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyPendingListResp.triggerType : null, ((-1) & 1) != 0 ? strategyPendingListResp.maxSafetyOrds : null, ((-1) & 2) != 0 ? strategyPendingListResp.fillSafetyOrds : null, ((-1) & 4) != 0 ? strategyPendingListResp.avgPx : null, ((-1) & 8) != 0 ? strategyPendingListResp.tpPx : null, ((-1) & 16) != 0 ? strategyPendingListResp.slPx : null, ((-1) & 32) != 0 ? strategyPendingListResp.slMode : null, ((-1) & 64) != 0 ? strategyPendingListResp.completedCycles : null, ((-1) & 128) != 0 ? strategyPendingListResp.pxSteps : null, ((-1) & 256) != 0 ? strategyPendingListResp.pxStepsMult : null, ((-1) & 512) != 0 ? strategyPendingListResp.volMult : null, ((-1) & 1024) != 0 ? strategyPendingListResp.tpPct : null, ((-1) & 2048) != 0 ? strategyPendingListResp.slPct : null, ((-1) & 4096) != 0 ? strategyPendingListResp.investmentCcy : null, ((-1) & 8192) != 0 ? strategyPendingListResp.investmentAmt : null, ((-1) & 16384) != 0 ? strategyPendingListResp.maxBotUsage : null, ((-1) & 32768) != 0 ? strategyPendingListResp.closeFraction : null, ((-1) & 65536) != 0 ? strategyPendingListResp.signParams : null, ((-1) & 131072) != 0 ? strategyPendingListResp.profit : null, ((-1) & 262144) != 0 ? strategyPendingListResp.triggerParams : null, ((-1) & 524288) != 0 ? strategyPendingListResp.sourceAlgoId : null, ((-1) & 1048576) != 0 ? strategyPendingListResp.stopType : null, ((-1) & 2097152) != 0 ? strategyPendingListResp.initPx : null, ((-1) & 4194304) != 0 ? strategyPendingListResp.perGridProfitRatio : null, ((-1) & 8388608) != 0 ? strategyPendingListResp.tpPriceRange : null, ((-1) & 16777216) != 0 ? strategyPendingListResp.reserveFunds : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyPendingListResp.trailingUpConfig : null, ((-1) & 67108864) != 0 ? strategyPendingListResp.trailingDownConfig : null, ((-1) & 134217728) != 0 ? strategyPendingListResp.trailingDownFund : null, ((-1) & 268435456) != 0 ? strategyPendingListResp.gridStatus : null, ((-1) & 536870912) != 0 ? strategyPendingListResp.lmtOrderNumber : null, ((-1) & 1073741824) != 0 ? strategyPendingListResp.aggressiveness : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyPendingListResp.profitSharingRatio : null, ((-1) & 1) != 0 ? strategyPendingListResp.copyType : null, ((-1) & 2) != 0 ? strategyPendingListResp.mktCap : null, ((-1) & 4) != 0 ? strategyPendingListResp.instIds : null, ((-1) & 8) != 0 ? strategyPendingListResp.totalAmt : null, ((-1) & 16) != 0 ? strategyPendingListResp.signalChanId : null, ((-1) & 32) != 0 ? strategyPendingListResp.signalChanName : null, ((-1) & 64) != 0 ? strategyPendingListResp.floatingPnl : null, ((-1) & 128) != 0 ? strategyPendingListResp.availableMargin : null, ((-1) & 256) != 0 ? strategyPendingListResp.totalPnlRatio : null, ((-1) & 512) != 0 ? strategyPendingListResp.signalCount : null, ((-1) & 1024) != 0 ? strategyPendingListResp.triggerLast : null, ((-1) & 2048) != 0 ? strategyPendingListResp.reduceOnly : null, ((-1) & 4096) != 0 ? strategyPendingListResp.alternativeCurrency : null, ((-1) & 8192) != 0 ? strategyPendingListResp.currency : null, ((-1) & 16384) != 0 ? strategyPendingListResp.createTime : null, ((-1) & 32768) != 0 ? strategyPendingListResp.expiryTime : null, ((-1) & 65536) != 0 ? strategyPendingListResp.notionalAmount : null, ((-1) & 131072) != 0 ? strategyPendingListResp.notionalCurrency : null, ((-1) & 262144) != 0 ? strategyPendingListResp.participationRatio : null, ((-1) & 524288) != 0 ? strategyPendingListResp.settlementAmount : null, ((-1) & 1048576) != 0 ? strategyPendingListResp.status : null, ((-1) & 2097152) != 0 ? strategyPendingListResp.strike : null, ((-1) & 4194304) != 0 ? strategyPendingListResp.tradeId : null, ((-1) & 8388608) != 0 ? strategyPendingListResp.tradeSide : null, ((-1) & 16777216) != 0 ? strategyPendingListResp.timeLeft : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyPendingListResp.notionalAmountPrecision : null, ((-1) & 67108864) != 0 ? strategyPendingListResp.sizePrecision : null, ((-1) & 134217728) != 0 ? strategyPendingListResp.strikePrecision : null, ((-1) & 268435456) != 0 ? strategyPendingListResp.settlementPricePrecision : null, ((-1) & 536870912) != 0 ? strategyPendingListResp.endStatusFlag : false, ((-1) & 1073741824) != 0 ? strategyPendingListResp.estimateProfit : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyPendingListResp.earlyFilledTime : null, ((-1) & 1) != 0 ? strategyPendingListResp.earlyFillAmount : null, ((-1) & 2) != 0 ? strategyPendingListResp.earlyFillCurrency : null, ((-1) & 4) != 0 ? strategyPendingListResp.earlyFillSettleTime : null, ((-1) & 8) != 0 ? strategyPendingListResp.earlyFillPrice : null, ((-1) & 16) != 0 ? strategyPendingListResp.turnoverRatio : null, ((-1) & 32) != 0 ? strategyPendingListResp.supportEarlyFill : false, ((-1) & 64) != 0 ? strategyPendingListResp.isStoped : false, ((-1) & 128) != 0 ? strategyPendingListResp.symbolsNumber : null, ((-1) & 256) != 0 ? strategyPendingListResp.sourceCcy : null, ((-1) & 512) != 0 ? strategyPendingListResp.sourceCcySz : null, ((-1) & 1024) != 0 ? strategyPendingListResp.outOfRange : false, ((-1) & 2048) != 0 ? strategyPendingListResp.autoMarginReloadSwitch : false, ((-1) & 4096) != 0 ? strategyPendingListResp.autoMarginReloadMaxAmount : null, ((-1) & 8192) != 0 ? strategyPendingListResp.extendedBusinessInfo : null, ((-1) & 16384) != 0 ? strategyPendingListResp.arbPnl : null, ((-1) & 32768) != 0 ? strategyPendingListResp.instFamily : null, ((-1) & 65536) != 0 ? strategyPendingListResp.fundingFeeRatio : null, ((-1) & 131072) != 0 ? strategyPendingListResp.fundingFeeTime : null, ((-1) & 262144) != 0 ? strategyPendingListResp.arbList : null, ((-1) & 524288) != 0 ? strategyPendingListResp.totalFundingFeeRatio : null, ((-1) & 1048576) != 0 ? strategyPendingListResp.perMinProfitRate : null, ((-1) & 2097152) != 0 ? strategyPendingListResp.perMaxProfitRate : null, ((-1) & 4194304) != 0 ? strategyPendingListResp.curQuoteSz : null, ((-1) & 8388608) != 0 ? strategyPendingListResp.curBaseSz : null, ((-1) & 16777216) != 0 ? strategyPendingListResp.pnlRatioInSourceCcy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyPendingListResp.totalPnlInSourceCcy : null, ((-1) & 67108864) != 0 ? strategyPendingListResp.isPostWarning : null, ((-1) & 134217728) != 0 ? strategyPendingListResp.isTradeBorrowMode : null, ((-1) & 268435456) != 0 ? strategyPendingListResp.lastPrice : null, ((-1) & 536870912) != 0 ? strategyPendingListResp.filledPercentage : null, ((-1) & 1073741824) != 0 ? strategyPendingListResp.needTWapTips : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyPendingListResp.strategyTags : null, ((-1) & 1) != 0 ? strategyPendingListResp.maturedApy : null, ((-1) & 2) != 0 ? strategyPendingListResp.signalOrderAmtParam : null, ((-1) & 4) != 0 ? strategyPendingListResp.signalBotOrderStopParam : null, ((-1) & 8) != 0 ? strategyPendingListResp.voucherInfo : null, ((-1) & 16) != 0 ? strategyPendingListResp.forbidden : null, ((-1) & 32) != 0 ? strategyPendingListResp.hiddenFeatures : null, ((-1) & 64) != 0 ? strategyPendingListResp.dcdState : null, ((-1) & 128) != 0 ? strategyPendingListResp.dcdPnl : null, ((-1) & 256) != 0 ? strategyPendingListResp.dcdPnlRatio : null, ((-1) & 512) != 0 ? strategyPendingListResp.notional : null, ((-1) & 1024) != 0 ? strategyPendingListResp.notionalCcy : null, ((-1) & 2048) != 0 ? strategyPendingListResp.cycle : null, ((-1) & 4096) != 0 ? strategyPendingListResp.currencyBal : null, ((-1) & 8192) != 0 ? strategyPendingListResp.alternateCurrency : null, ((-1) & 16384) != 0 ? strategyPendingListResp.avgCost : null, ((-1) & 32768) != 0 ? strategyPendingListResp.coinPnl : null, ((-1) & 65536) != 0 ? strategyPendingListResp.curStrike : null, ((-1) & 131072) != 0 ? strategyPendingListResp.reinvestment : false, ((-1) & 262144) != 0 ? strategyPendingListResp.settlementCcy : null, ((-1) & 524288) != 0 ? strategyPendingListResp.pTime : null, ((-1) & 1048576) != 0 ? strategyPendingListResp.lastTradeExpireTime : null, ((-1) & 2097152) != 0 ? strategyPendingListResp.lastSettlementSettledTime : null, ((-1) & 4194304) != 0 ? strategyPendingListResp.arbitrageStakingError : null, ((-1) & 8388608) != 0 ? strategyPendingListResp.subArbTypes : null, ((-1) & 16777216) != 0 ? strategyPendingListResp.absYieldPercentage : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyPendingListResp.tradeQuoteCcy : null, ((-1) & 67108864) != 0 ? strategyPendingListResp.displayId : null, ((-1) & 134217728) != 0 ? strategyPendingListResp.simpleEarn : null, ((-1) & 268435456) != 0 ? strategyPendingListResp.leveragePrincipal : null, ((-1) & 536870912) != 0 ? strategyPendingListResp.arbitrageTotalPnlInfo : null, ((-1) & 1073741824) != 0 ? strategyPendingListResp.numOfManualOrderInCycle : 0, ((-1) & Integer.MIN_VALUE) != 0 ? strategyPendingListResp.highestApyPeriod : null, (491519 & 1) != 0 ? strategyPendingListResp.displayMinPaybackDays : false, (491519 & 2) != 0 ? strategyPendingListResp.fundingFeeApyList : null, (491519 & 4) != 0 ? strategyPendingListResp.profitSnapshots : null, (491519 & 8) != 0 ? strategyPendingListResp.latestProfit : null, (491519 & 16) != 0 ? strategyPendingListResp.totalSpreadProfit : null, (491519 & 32) != 0 ? strategyPendingListResp.totalApy : null, (491519 & 64) != 0 ? strategyPendingListResp.fee : null, (491519 & 128) != 0 ? strategyPendingListResp.totalInterestAmt : null, (491519 & 256) != 0 ? strategyPendingListResp.debtCcy : null, (491519 & 512) != 0 ? strategyPendingListResp.arbitrageProfit : null, (491519 & 1024) != 0 ? strategyPendingListResp.stakingProfit : null, (491519 & 2048) != 0 ? strategyPendingListResp.initOrdAmt : null, (491519 & 4096) != 0 ? strategyPendingListResp.safetyOrdAmt : null, (491519 & 8192) != 0 ? strategyPendingListResp.effectiveEditParametersDetails : null, (491519 & 16384) != 0 ? strategyPendingListResp.balanceDetails : null, (491519 & 32768) != 0 ? strategyPendingListResp.bot : bot2 != null ? bot2.copy((PointerIconCompat.TYPE_GRABBING & 1) != 0 ? bot2.smartArbitrage : null, (PointerIconCompat.TYPE_GRABBING & 2) != 0 ? bot2.common : botCommonCopy$default, (PointerIconCompat.TYPE_GRABBING & 4) != 0 ? bot2.userInfo : null, (PointerIconCompat.TYPE_GRABBING & 8) != 0 ? bot2.compliancePauseDisplayType : null, (PointerIconCompat.TYPE_GRABBING & 16) != 0 ? bot2.spotGrid : null, (PointerIconCompat.TYPE_GRABBING & 32) != 0 ? bot2.ai : null, (PointerIconCompat.TYPE_GRABBING & 64) != 0 ? bot2.backtest : null, (PointerIconCompat.TYPE_GRABBING & 128) != 0 ? bot2.contractGrid : null, (PointerIconCompat.TYPE_GRABBING & 256) != 0 ? bot2.spotDca : null, (PointerIconCompat.TYPE_GRABBING & 512) != 0 ? bot2.recurring : null) : null, (491519 & 65536) != 0 ? strategyPendingListResp.tpTriggerRatio : null, (491519 & 131072) != 0 ? strategyPendingListResp.slTriggerRatio : null, (491519 & 262144) != 0 ? strategyPendingListResp.advanceOrdType : null));
    }

    public final void copydefault() {
        uLU<Activity> value;
        uLU<Activity> uluCopydefault;
        uLU<Activity> value2 = this.OLrzqt.getValue();
        if (value2 instanceof uLU.ActionBar) {
            Activity activity = (Activity) ((uLU.ActionBar) value2).KWHzl();
            if (!activity.EZpvd() || activity.copydefault()) {
                return;
            }
            MutableStateFlow<uLU<Activity>> mutableStateFlow = this.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
                uluCopydefault = value;
                if (uluCopydefault instanceof uLU.ActionBar) {
                    uLU.ActionBar actionBar = (uLU.ActionBar) uluCopydefault;
                    uluCopydefault = actionBar.copydefault(Activity.copy$default((Activity) actionBar.KWHzl(), null, false, null, true, 7, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, uluCopydefault));
            wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AEQbTJ.plus(new TaskDescription(CoroutineExceptionHandler.Key, this)), null, new BacktestListViewModel$loadMoreBacktests$3(this, activity, null), 2, null);
        }
    }

    public final TacticsData copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BizTradeStrategyInfo bizTradeStrategyInfo = this.AhwBna.get(str);
        if (bizTradeStrategyInfo == null) {
            return null;
        }
        try {
            Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(OLrzqt().OLrzqt(new C55804xqp<>("", C56402yEa.EZpvd(bizTradeStrategyInfo), null, null, 12, null)));
            if (objFirstOrNull instanceof TacticsData) {
                return (TacticsData) objFirstOrNull;
            }
            return null;
        } catch (Exception e) {
            pUU.AEQbTJ("BacktestListViewModel", "Failed to convert source data to TacticsData", e);
            return null;
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0639StateListAnimator implements StateListAnimator {
            public static final C0639StateListAnimator copydefault = new C0639StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0639StateListAnimator)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 113822020;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Init";
            }

            private C0639StateListAnimator() {
            }
        }

        public static final class Application implements StateListAnimator {
            public static final Application OLrzqt = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -758430476;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Retry";
            }

            private Application() {
            }
        }

        public static final class ActionBar implements StateListAnimator {
            public static final ActionBar OLrzqt = new ActionBar();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 616660969;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RefreshSilently";
            }

            private ActionBar() {
            }
        }

        public static final class TaskDescription implements StateListAnimator {
            public static final TaskDescription KWHzl = new TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -719275121;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "LoadMore";
            }

            private TaskDescription() {
            }
        }

        public static final class Activity implements StateListAnimator {
            public final BacktestFilter EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, BacktestFilter backtestFilter, int i, Object obj) {
                if ((i & 1) != 0) {
                    backtestFilter = activity.EZpvd;
                }
                return activity.KWHzl(backtestFilter);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull BacktestFilter backtestFilter) {
                Intrinsics.checkNotNullParameter(backtestFilter, "");
                return new Activity(backtestFilter);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final BacktestFilter copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.EZpvd == ((Activity) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SetFilter(filter=" + this.EZpvd + ")";
            }

            public Activity(@NotNull BacktestFilter backtestFilter) {
                Intrinsics.checkNotNullParameter(backtestFilter, "");
                this.EZpvd = backtestFilter;
            }
        }

        public static final class LoaderManager implements StateListAnimator {
            public final String OLrzqt;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loaderManager.copydefault;
                }
                if ((i & 2) != 0) {
                    str2 = loaderManager.OLrzqt;
                }
                return loaderManager.KWHzl(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager KWHzl(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new LoaderManager(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoaderManager)) {
                    return false;
                }
                LoaderManager loaderManager = (LoaderManager) obj;
                return Intrinsics.EZpvd((Object) this.copydefault, (Object) loaderManager.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) loaderManager.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UpdateBotName(algoId=" + this.copydefault + ", newName=" + this.OLrzqt + ")";
            }

            public LoaderManager(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.copydefault = str;
                this.OLrzqt = str2;
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public final boolean EZpvd;
        public final List<uJO> KWHzl;
        public final boolean OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, false, null, false, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListViewModel$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, List list, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                z = activity.OLrzqt;
            }
            if ((i & 4) != 0) {
                str = activity.copydefault;
            }
            if ((i & 8) != 0) {
                z2 = activity.EZpvd;
            }
            return activity.OLrzqt(list, z, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull List<uJO> list, boolean z, String str, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(list, z, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<uJO> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) activity.copydefault) && this.EZpvd == activity.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = Boolean.hashCode(this.OLrzqt);
            String str = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiState(backtests=" + this.KWHzl + ", hasMore=" + this.OLrzqt + ", lastShownAlgoId=" + this.copydefault + ", isLoadingMore=" + this.EZpvd + ")";
        }

        public Activity(@NotNull List<uJO> list, boolean z, String str, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.OLrzqt = z;
            this.copydefault = str;
            this.EZpvd = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:250)) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.util.List<o.uJO>, boolean, java.lang.String, boolean):void (m)] (LINE:249) call: com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListViewModel.Activity.<init>(java.util.List, boolean, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Activity(List list, boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2);
        }
    }
}
