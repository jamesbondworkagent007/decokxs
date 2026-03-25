package com.okinc.kline.ui;

import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39014pkM;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC38857phO;

/* JADX INFO: loaded from: classes23.dex */
public final class MarketKlinePortraitFragment$coinInfoUpdated$2$1$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ViewOnClickListenerC38857phO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlinePortraitFragment$coinInfoUpdated$2$1$4(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, Continuation<? super MarketKlinePortraitFragment$coinInfoUpdated$2$1$4> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38857phO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketKlinePortraitFragment$coinInfoUpdated$2$1$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketKlinePortraitFragment$coinInfoUpdated$2$1$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        KlineQuoteDataComponent klineQuoteDataComponentDbNXlk;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C39014pkM c39014pkMValues = this.this$0.values();
            if (c39014pkMValues != null && (klineQuoteDataComponentDbNXlk = c39014pkMValues.DbNXlk()) != null) {
                klineQuoteDataComponentDbNXlk.EZpvd();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
