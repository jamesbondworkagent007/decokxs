package com.okinc.kline.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C39014pkM;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC38857phO;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketKlinePortraitFragment$coinInfoUpdated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $intId;
    final /* synthetic */ String $intType;
    int label;
    final /* synthetic */ ViewOnClickListenerC38857phO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketKlinePortraitFragment$coinInfoUpdated$1(ViewOnClickListenerC38857phO viewOnClickListenerC38857phO, String str, String str2, Continuation<? super MarketKlinePortraitFragment$coinInfoUpdated$1> continuation) {
        super(2, continuation);
        this.this$0 = viewOnClickListenerC38857phO;
        this.$intId = str;
        this.$intType = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketKlinePortraitFragment$coinInfoUpdated$1(this.this$0, this.$intId, this.$intType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketKlinePortraitFragment$coinInfoUpdated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C39014pkM c39014pkMValues = this.this$0.values();
            if (c39014pkMValues != null) {
                c39014pkMValues.EZpvd(this.$intId, this.$intType);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
