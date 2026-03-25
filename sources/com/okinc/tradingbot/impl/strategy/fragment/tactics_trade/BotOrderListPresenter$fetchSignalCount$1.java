package com.okinc.tradingbot.impl.strategy.fragment.tactics_trade;

import com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.uJB;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOrderListPresenter$fetchSignalCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BotOrderListPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOrderListPresenter$fetchSignalCount$1(BotOrderListPresenter botOrderListPresenter, Continuation<? super BotOrderListPresenter$fetchSignalCount$1> continuation) {
        super(2, continuation);
        this.this$0 = botOrderListPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotOrderListPresenter$fetchSignalCount$1 botOrderListPresenter$fetchSignalCount$1 = new BotOrderListPresenter$fetchSignalCount$1(this.this$0, continuation);
        botOrderListPresenter$fetchSignalCount$1.L$0 = obj;
        return botOrderListPresenter$fetchSignalCount$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotOrderListPresenter$fetchSignalCount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BotOrderListPresenter botOrderListPresenter;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                BotOrderListPresenter botOrderListPresenter2 = this.this$0;
                Result.Application application = Result.Companion;
                uJB ujb = botOrderListPresenter2.EZpvd;
                Unit unit = Unit.INSTANCE;
                this.L$0 = botOrderListPresenter2;
                this.label = 1;
                Object objKWHzl = ujb.KWHzl(unit, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                botOrderListPresenter = botOrderListPresenter2;
                obj = objKWHzl;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                botOrderListPresenter = (BotOrderListPresenter) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            botOrderListPresenter.copydefault.setValue((BacktestListPreviewDto) obj);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
