package com.okinc.unify_trade.trade.core.init.access;

import com.okinc.unify_trade.trade.core.init.access.TradeTaskScheduler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.xNW;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeTaskScheduler$initializeDataSources$2$deferred$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isForce;
    final /* synthetic */ xNW $it;
    final /* synthetic */ String $traceId;
    int label;
    final /* synthetic */ TradeTaskScheduler this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeTaskScheduler$initializeDataSources$2$deferred$1$1(TradeTaskScheduler tradeTaskScheduler, xNW xnw, boolean z, String str, Continuation<? super TradeTaskScheduler$initializeDataSources$2$deferred$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeTaskScheduler;
        this.$it = xnw;
        this.$isForce = z;
        this.$traceId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeTaskScheduler$initializeDataSources$2$deferred$1$1(this.this$0, this.$it, this.$isForce, this.$traceId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeTaskScheduler$initializeDataSources$2$deferred$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TradeTaskScheduler tradeTaskScheduler = this.this$0;
            xNW xnw = this.$it;
            boolean z = this.$isForce;
            String str = this.$traceId;
            this.label = 1;
            obj = tradeTaskScheduler.KWHzl(xnw, z, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        TradeTaskScheduler.StateListAnimator stateListAnimator = (TradeTaskScheduler.StateListAnimator) obj;
        if (!stateListAnimator.copydefault()) {
            throw new TradeTaskScheduler.TradeTaskException(stateListAnimator);
        }
        return Unit.INSTANCE;
    }
}
