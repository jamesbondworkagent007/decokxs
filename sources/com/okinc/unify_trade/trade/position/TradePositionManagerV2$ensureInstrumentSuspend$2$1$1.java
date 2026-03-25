package com.okinc.unify_trade.trade.position;

import com.okinc.trade.manager.common.position.TradePositionManager;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C54582xNs;
import o.C56391yDq;
import o.C56442yFn;
import o.xOE;

/* JADX INFO: loaded from: classes24.dex */
public final class TradePositionManagerV2$ensureInstrumentSuspend$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC54531xLw $it;
    final /* synthetic */ AtomicInteger $reference;
    int label;
    final /* synthetic */ xOE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradePositionManagerV2$ensureInstrumentSuspend$2$1$1(xOE xoe, AbstractC54531xLw abstractC54531xLw, AtomicInteger atomicInteger, Continuation<? super TradePositionManagerV2$ensureInstrumentSuspend$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = xoe;
        this.$it = abstractC54531xLw;
        this.$reference = atomicInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradePositionManagerV2$ensureInstrumentSuspend$2$1$1(this.this$0, this.$it, this.$reference, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradePositionManagerV2$ensureInstrumentSuspend$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TradePositionManager.Companion.AEQbTJ("trade.loadBiz");
            C54582xNs c54582xNsCopydefault = this.this$0.copydefault();
            String strAYXKKw = this.$it.AYXKKw();
            this.label = 1;
            if (c54582xNsCopydefault.EZpvd(strAYXKKw, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (this.$reference.decrementAndGet() == 0) {
            TradePositionManager.Companion.AEQbTJ("reference.decrementAndGet() == 0");
        }
        return Unit.INSTANCE;
    }
}
