package com.okinc.tradingbot.impl.order.strategy.spotdca.domain;

import com.okinc.tradingbot.impl.order.strategy.api.dto.spotdca.AvailableBalanceResponse;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o.C53201wgy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class FetchManualAddOrderUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C53201wgy.Application>, Object> {
    final /* synthetic */ C53201wgy.Activity $input;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C53201wgy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchManualAddOrderUseCase$execute$2(C53201wgy c53201wgy, C53201wgy.Activity activity, Continuation<? super FetchManualAddOrderUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c53201wgy;
        this.$input = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchManualAddOrderUseCase$execute$2 fetchManualAddOrderUseCase$execute$2 = new FetchManualAddOrderUseCase$execute$2(this.this$0, this.$input, continuation);
        fetchManualAddOrderUseCase$execute$2.L$0 = obj;
        return fetchManualAddOrderUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C53201wgy.Application> continuation) {
        return ((FetchManualAddOrderUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        Deferred deferredAsync$default2;
        Deferred deferredAsync$default3;
        Object objAwait;
        Deferred deferred;
        AvailableBalanceResponse availableBalanceResponse;
        Object objAwait2;
        Deferred deferred2;
        Deferred deferred3;
        MaxAvailableResp maxAvailableResp;
        Object objAwait3;
        AvailableBalanceResponse availableBalanceResponse2;
        Deferred deferred4;
        TickersData tickersData;
        Object objAwait4;
        MaxAvailableResp maxAvailableResp2;
        TickersData tickersData2;
        StrategyConfigInfo strategyConfigInfo;
        Object objAwait5;
        TickersData tickersData3;
        MaxAvailableResp maxAvailableResp3;
        StrategyConfigInfo strategyConfigInfo2;
        AvailableBalanceResponse availableBalanceResponse3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope, this.this$0.OLrzqt, null, new FetchManualAddOrderUseCase$execute$2$strategyConfigDeferred$1(this.this$0, this.$input, null), 2, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, this.this$0.OLrzqt, null, new FetchManualAddOrderUseCase$execute$2$tickerDeferred$1(this.this$0, this.$input, null), 2, null);
            deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, this.this$0.OLrzqt, null, new FetchManualAddOrderUseCase$execute$2$limitPriceDeferred$1(this.this$0, this.$input, null), 2, null);
            deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope, this.this$0.OLrzqt, null, new FetchManualAddOrderUseCase$execute$2$maxAvailableBalanceDeferred$1(this.this$0, this.$input, null), 2, null);
            Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope, this.this$0.OLrzqt, null, new FetchManualAddOrderUseCase$execute$2$availableBalanceDeferred$1(this.this$0, this.$input, null), 2, null);
            this.L$0 = deferredAsync$default4;
            this.L$1 = deferredAsync$default;
            this.L$2 = deferredAsync$default2;
            this.L$3 = deferredAsync$default3;
            this.label = 1;
            objAwait = deferredAsync$default5.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default4;
        } else if (i == 1) {
            deferredAsync$default3 = (Deferred) this.L$3;
            Deferred deferred5 = (Deferred) this.L$2;
            Deferred deferred6 = (Deferred) this.L$1;
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferredAsync$default2 = deferred5;
            deferredAsync$default = deferred6;
            objAwait = obj;
        } else if (i == 2) {
            AvailableBalanceResponse availableBalanceResponse4 = (AvailableBalanceResponse) this.L$3;
            deferred2 = (Deferred) this.L$2;
            Deferred deferred7 = (Deferred) this.L$1;
            deferred3 = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            deferredAsync$default = deferred7;
            availableBalanceResponse = availableBalanceResponse4;
            objAwait2 = obj;
            maxAvailableResp = (MaxAvailableResp) objAwait2;
            if (maxAvailableResp == null) {
                maxAvailableResp = new MaxAvailableResp((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
            }
            this.L$0 = deferred3;
            this.L$1 = deferred2;
            this.L$2 = availableBalanceResponse;
            this.L$3 = maxAvailableResp;
            this.label = 3;
            objAwait3 = deferredAsync$default.await(this);
            if (objAwait3 != objCopydefault) {
                return objCopydefault;
            }
            availableBalanceResponse2 = availableBalanceResponse;
            deferred4 = deferred3;
            tickersData = (TickersData) objAwait3;
            if (tickersData == null) {
            }
            this.L$0 = deferred2;
            this.L$1 = availableBalanceResponse2;
            this.L$2 = maxAvailableResp;
            this.L$3 = tickersData;
            this.label = 4;
            objAwait4 = deferred4.await(this);
            if (objAwait4 != objCopydefault) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    StrategyConfigInfo strategyConfigInfo3 = (StrategyConfigInfo) this.L$3;
                    TickersData tickersData4 = (TickersData) this.L$2;
                    MaxAvailableResp maxAvailableResp4 = (MaxAvailableResp) this.L$1;
                    AvailableBalanceResponse availableBalanceResponse5 = (AvailableBalanceResponse) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAwait5 = obj;
                    strategyConfigInfo2 = strategyConfigInfo3;
                    tickersData3 = tickersData4;
                    maxAvailableResp3 = maxAvailableResp4;
                    availableBalanceResponse3 = availableBalanceResponse5;
                    LimitPriceData limitPriceData = (LimitPriceData) objAwait5;
                    return new C53201wgy.Application(availableBalanceResponse3, maxAvailableResp3, tickersData3, strategyConfigInfo2, limitPriceData != null ? new LimitPriceData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : limitPriceData);
                }
                tickersData2 = (TickersData) this.L$3;
                MaxAvailableResp maxAvailableResp5 = (MaxAvailableResp) this.L$2;
                availableBalanceResponse2 = (AvailableBalanceResponse) this.L$1;
                deferred2 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                maxAvailableResp2 = maxAvailableResp5;
                objAwait4 = obj;
                strategyConfigInfo = (StrategyConfigInfo) objAwait4;
                if (strategyConfigInfo == null) {
                    strategyConfigInfo = new StrategyConfigInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (String) null, (String) null, (LmtOrderNumber) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnConfig) null, (String) null, (List) null, (List) null, (String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
                }
                this.L$0 = availableBalanceResponse2;
                this.L$1 = maxAvailableResp2;
                this.L$2 = tickersData2;
                this.L$3 = strategyConfigInfo;
                this.label = 5;
                objAwait5 = deferred2.await(this);
                if (objAwait5 != objCopydefault) {
                    return objCopydefault;
                }
                tickersData3 = tickersData2;
                maxAvailableResp3 = maxAvailableResp2;
                strategyConfigInfo2 = strategyConfigInfo;
                availableBalanceResponse3 = availableBalanceResponse2;
                LimitPriceData limitPriceData2 = (LimitPriceData) objAwait5;
                return new C53201wgy.Application(availableBalanceResponse3, maxAvailableResp3, tickersData3, strategyConfigInfo2, limitPriceData2 != null ? new LimitPriceData((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : limitPriceData2);
            }
            maxAvailableResp = (MaxAvailableResp) this.L$3;
            availableBalanceResponse2 = (AvailableBalanceResponse) this.L$2;
            deferred2 = (Deferred) this.L$1;
            deferred4 = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait3 = obj;
            tickersData = (TickersData) objAwait3;
            if (tickersData == null) {
                tickersData = new TickersData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
            }
            this.L$0 = deferred2;
            this.L$1 = availableBalanceResponse2;
            this.L$2 = maxAvailableResp;
            this.L$3 = tickersData;
            this.label = 4;
            objAwait4 = deferred4.await(this);
            if (objAwait4 != objCopydefault) {
                return objCopydefault;
            }
            TickersData tickersData5 = tickersData;
            maxAvailableResp2 = maxAvailableResp;
            tickersData2 = tickersData5;
            strategyConfigInfo = (StrategyConfigInfo) objAwait4;
            if (strategyConfigInfo == null) {
            }
            this.L$0 = availableBalanceResponse2;
            this.L$1 = maxAvailableResp2;
            this.L$2 = tickersData2;
            this.L$3 = strategyConfigInfo;
            this.label = 5;
            objAwait5 = deferred2.await(this);
            if (objAwait5 != objCopydefault) {
            }
        }
        availableBalanceResponse = (AvailableBalanceResponse) objAwait;
        if (availableBalanceResponse == null) {
            availableBalanceResponse = new AvailableBalanceResponse(null, null);
        }
        this.L$0 = deferred;
        this.L$1 = deferredAsync$default;
        this.L$2 = deferredAsync$default2;
        this.L$3 = availableBalanceResponse;
        this.label = 2;
        objAwait2 = deferredAsync$default3.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        deferred2 = deferredAsync$default2;
        deferred3 = deferred;
        maxAvailableResp = (MaxAvailableResp) objAwait2;
        if (maxAvailableResp == null) {
        }
        this.L$0 = deferred3;
        this.L$1 = deferred2;
        this.L$2 = availableBalanceResponse;
        this.L$3 = maxAvailableResp;
        this.label = 3;
        objAwait3 = deferredAsync$default.await(this);
        if (objAwait3 != objCopydefault) {
        }
    }
}
