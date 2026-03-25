package com.okinc.tradingbot.impl.order.strategy;

import com.okinc.tradeapi.bean.ParamBuilder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC52122vzt;
import o.C52478wMx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class BotTradeActivity$subscribeOnUIChange$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ParamBuilder $it;
    int label;
    final /* synthetic */ ActivityC52122vzt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotTradeActivity$subscribeOnUIChange$3$1(ActivityC52122vzt activityC52122vzt, ParamBuilder paramBuilder, Continuation<? super BotTradeActivity$subscribeOnUIChange$3$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC52122vzt;
        this.$it = paramBuilder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotTradeActivity$subscribeOnUIChange$3$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotTradeActivity$subscribeOnUIChange$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C52478wMx c52478wMxAkhnZx = ActivityC52122vzt.AEQbTJ(this.this$0).AkhnZx();
            ParamBuilder paramBuilder = this.$it;
            this.label = 1;
            if (c52478wMxAkhnZx.KWHzl(paramBuilder, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
