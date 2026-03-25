package com.okinc.unify_trade.trade.position;

import com.okinc.trade.manager.common.position.TradePositionManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC54531xLw;
import o.C56391yDq;
import o.C56442yFn;
import o.xOE;

/* JADX INFO: loaded from: classes24.dex */
public final class TradePositionManagerV2$ensureInstrumentSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AbstractC54531xLw> $needUnBizSet;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xOE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.xLw> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradePositionManagerV2$ensureInstrumentSuspend$2(List<? extends AbstractC54531xLw> list, xOE xoe, Continuation<? super TradePositionManagerV2$ensureInstrumentSuspend$2> continuation) {
        super(2, continuation);
        this.$needUnBizSet = list;
        this.this$0 = xoe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradePositionManagerV2$ensureInstrumentSuspend$2 tradePositionManagerV2$ensureInstrumentSuspend$2 = new TradePositionManagerV2$ensureInstrumentSuspend$2(this.$needUnBizSet, this.this$0, continuation);
        tradePositionManagerV2$ensureInstrumentSuspend$2.L$0 = obj;
        return tradePositionManagerV2$ensureInstrumentSuspend$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradePositionManagerV2$ensureInstrumentSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(this.$needUnBizSet.size());
            List<AbstractC54531xLw> list = this.$needUnBizSet;
            xOE xoe = this.this$0;
            for (AbstractC54531xLw abstractC54531xLw : list) {
                TradePositionManager.Companion.AEQbTJ("scope.launch");
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain().getImmediate(), null, new TradePositionManagerV2$ensureInstrumentSuspend$2$1$1(xoe, abstractC54531xLw, atomicInteger, null), 2, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
