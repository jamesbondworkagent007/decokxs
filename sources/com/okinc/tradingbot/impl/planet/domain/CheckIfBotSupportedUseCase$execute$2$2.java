package com.okinc.tradingbot.impl.planet.domain;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C53659wpf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.xOR;

/* JADX INFO: loaded from: classes11.dex */
public final class CheckIfBotSupportedUseCase$execute$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C53659wpf $this_runCatching;
    final /* synthetic */ InterfaceC54581xNr $trade;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckIfBotSupportedUseCase$execute$2$2(InterfaceC54581xNr interfaceC54581xNr, C53659wpf c53659wpf, Continuation<? super CheckIfBotSupportedUseCase$execute$2$2> continuation) {
        super(2, continuation);
        this.$trade = interfaceC54581xNr;
        this.$this_runCatching = c53659wpf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckIfBotSupportedUseCase$execute$2$2(this.$trade, this.$this_runCatching, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CheckIfBotSupportedUseCase$execute$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            xOR xorCopydefault = this.$trade.copydefault();
            if (xorCopydefault == null) {
                return null;
            }
            xorCopydefault.OLrzqt(this.$this_runCatching.OLrzqt);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
