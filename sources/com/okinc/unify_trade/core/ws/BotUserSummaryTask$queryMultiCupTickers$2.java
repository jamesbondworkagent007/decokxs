package com.okinc.unify_trade.core.ws;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyUserSummaryData;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.core.ws.BotUserSummaryTask$queryMultiCupTickers$2;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C54289xCx;
import o.C54326xEg;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.xKK;

/* JADX INFO: loaded from: classes12.dex */
public final class BotUserSummaryTask$queryMultiCupTickers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<StrategyUserSummaryData> $data;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C54326xEg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotUserSummaryTask$queryMultiCupTickers$2(C54326xEg c54326xEg, List<StrategyUserSummaryData> list, Continuation<? super BotUserSummaryTask$queryMultiCupTickers$2> continuation) {
        super(2, continuation);
        this.this$0 = c54326xEg;
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotUserSummaryTask$queryMultiCupTickers$2 botUserSummaryTask$queryMultiCupTickers$2 = new BotUserSummaryTask$queryMultiCupTickers$2(this.this$0, this.$data, continuation);
        botUserSummaryTask$queryMultiCupTickers$2.L$0 = obj;
        return botUserSummaryTask$queryMultiCupTickers$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotUserSummaryTask$queryMultiCupTickers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String ccy;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, null, null, new BotUserSummaryTask$queryMultiCupTickers$2$exchangeRateAsync$1(this.this$0, null), 3, null);
            C54289xCx c54289xCxCopydefault = this.this$0.copydefault();
            final List<StrategyUserSummaryData> list = this.$data;
            final C54326xEg c54326xEg = this.this$0;
            StrategyUserSummaryData strategyUserSummaryData = (StrategyUserSummaryData) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (strategyUserSummaryData == null || (ccy = strategyUserSummaryData.getCcy()) == null) {
                ccy = "USDT";
            }
            c54289xCxCopydefault.OLrzqt(new TickerCupReq(C56402yEa.EZpvd(ccy)));
            c54289xCxCopydefault.KWHzl(new Function1() { // from class: o.xEo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return BotUserSummaryTask$queryMultiCupTickers$2.invokeSuspend$lambda$1$lambda$0(c54326xEg, list, deferredAsync$default, (ResponseData) obj2);
                }
            });
            xKK.Activity.execute$default(c54289xCxCopydefault, 0L, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(C54326xEg c54326xEg, List list, Deferred deferred, ResponseData responseData) {
        BuildersKt__Builders_commonKt.launch$default(c54326xEg.KWHzl(), c54326xEg.valueOf(), null, new BotUserSummaryTask$queryMultiCupTickers$2$1$1$1(responseData, c54326xEg, list, deferred, null), 2, null);
        return Unit.INSTANCE;
    }
}
