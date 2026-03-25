package com.okinc.unify_trade.core.ws;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotUserSummaryReq;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import com.okinc.unify_trade.biz.subscribe.ExchangeRateResponse;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C54326xEg;
import o.C55942xtU;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.xAF;

/* JADX INFO: loaded from: classes12.dex */
public final class BotUserSummaryTask$queryMultiCupTickers$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<StrategyUserSummaryData> $data;
    final /* synthetic */ Deferred<ExchangeRateResponse> $exchangeRateAsync;
    final /* synthetic */ ResponseData<List<TickersData>> $it;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C54326xEg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotUserSummaryTask$queryMultiCupTickers$2$1$1$1(ResponseData<List<TickersData>> responseData, C54326xEg c54326xEg, List<StrategyUserSummaryData> list, Deferred<ExchangeRateResponse> deferred, Continuation<? super BotUserSummaryTask$queryMultiCupTickers$2$1$1$1> continuation) {
        super(2, continuation);
        this.$it = responseData;
        this.this$0 = c54326xEg;
        this.$data = list;
        this.$exchangeRateAsync = deferred;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotUserSummaryTask$queryMultiCupTickers$2$1$1$1(this.$it, this.this$0, this.$data, this.$exchangeRateAsync, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotUserSummaryTask$queryMultiCupTickers$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String last;
        xAF xaf;
        C55942xtU c55942xtUDjBIcL;
        List<StrategyUserSummaryData> list;
        TickersData tickersData;
        xAF xaf2;
        BotUserSummaryReq botUserSummaryReqEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ResponseData<List<TickersData>> responseData = this.$it;
            if (responseData.getCode() != 0 || responseData.getData() == null) {
                xAF xaf3 = this.this$0.AYXKKw;
                if (xaf3 != null) {
                    xaf3.copydefault(this.$it.getMsg());
                }
            } else {
                C55942xtU c55942xtUDjBIcL2 = this.this$0.djBIcL();
                List<TickersData> data = this.$it.getData();
                if (data == null || (tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(data)) == null || (last = tickersData.getLast()) == null) {
                    last = "0";
                }
                c55942xtUDjBIcL2.AEQbTJ(last);
                xaf = this.this$0.AYXKKw;
                if (xaf != null) {
                    c55942xtUDjBIcL = this.this$0.djBIcL();
                    List<StrategyUserSummaryData> list2 = this.$data;
                    Deferred<ExchangeRateResponse> deferred = this.$exchangeRateAsync;
                    this.L$0 = xaf;
                    this.L$1 = c55942xtUDjBIcL;
                    this.L$2 = list2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    list = list2;
                    obj = objAwait;
                }
            }
            xaf2 = this.this$0.AYXKKw;
            if (xaf2 != null && (botUserSummaryReqEZpvd = xaf2.EZpvd()) != null && botUserSummaryReqEZpvd.isNeedWs()) {
                this.this$0.gEmmrt();
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) this.L$2;
        c55942xtUDjBIcL = (C55942xtU) this.L$1;
        xaf = (xAF) this.L$0;
        C56391yDq.AEQbTJ(obj);
        xaf.KWHzl(c55942xtUDjBIcL.KWHzl2(C56390yDp.OLrzqt(list, obj)));
        xaf2 = this.this$0.AYXKKw;
        if (xaf2 != null) {
            this.this$0.gEmmrt();
        }
        return Unit.INSTANCE;
    }
}
