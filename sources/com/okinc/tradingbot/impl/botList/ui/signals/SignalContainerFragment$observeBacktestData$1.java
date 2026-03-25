package com.okinc.tradingbot.impl.botList.ui.signals;

import com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.uLE;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalContainerFragment$observeBacktestData$1 extends SuspendLambda implements Function2<BacktestListPreviewDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uLE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalContainerFragment$observeBacktestData$1(uLE ule, Continuation<? super SignalContainerFragment$observeBacktestData$1> continuation) {
        super(2, continuation);
        this.this$0 = ule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalContainerFragment$observeBacktestData$1 signalContainerFragment$observeBacktestData$1 = new SignalContainerFragment$observeBacktestData$1(this.this$0, continuation);
        signalContainerFragment$observeBacktestData$1.L$0 = obj;
        return signalContainerFragment$observeBacktestData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BacktestListPreviewDto backtestListPreviewDto, Continuation<? super Unit> continuation) {
        return ((SignalContainerFragment$observeBacktestData$1) create(backtestListPreviewDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (((BacktestListPreviewDto) this.L$0) != null) {
                this.this$0.AkhnZx();
                this.this$0.DbNXlk();
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
