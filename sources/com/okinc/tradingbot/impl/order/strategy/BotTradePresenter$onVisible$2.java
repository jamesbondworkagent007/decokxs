package com.okinc.tradingbot.impl.order.strategy;

import com.okinc.tradeapi.bean.ParamBuilder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C52478wMx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class BotTradePresenter$onVisible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ParamBuilder $routeData;
    int label;
    final /* synthetic */ BotTradePresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotTradePresenter$onVisible$2(ParamBuilder paramBuilder, BotTradePresenter botTradePresenter, Continuation<? super BotTradePresenter$onVisible$2> continuation) {
        super(2, continuation);
        this.$routeData = paramBuilder;
        this.this$0 = botTradePresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotTradePresenter$onVisible$2(this.$routeData, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotTradePresenter$onVisible$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$routeData != null) {
                C52478wMx c52478wMxAkhnZx = this.this$0.AkhnZx();
                ParamBuilder paramBuilder = this.$routeData;
                this.label = 1;
                if (c52478wMxAkhnZx.OLrzqt(paramBuilder, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                C52478wMx c52478wMxAkhnZx2 = this.this$0.AkhnZx();
                this.label = 2;
                if (c52478wMxAkhnZx2.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
