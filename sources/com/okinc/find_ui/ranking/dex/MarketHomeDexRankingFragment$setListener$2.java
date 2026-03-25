package com.okinc.find_ui.ranking.dex;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C34953nmF;
import o.C34964nmQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC40516qYt;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeDexRankingFragment$setListener$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends C34964nmQ>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34953nmF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeDexRankingFragment$setListener$2(C34953nmF c34953nmF, Continuation<? super MarketHomeDexRankingFragment$setListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c34953nmF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeDexRankingFragment$setListener$2 marketHomeDexRankingFragment$setListener$2 = new MarketHomeDexRankingFragment$setListener$2(this.this$0, continuation);
        marketHomeDexRankingFragment$setListener$2.L$0 = obj;
        return marketHomeDexRankingFragment$setListener$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends C34964nmQ>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends List<C34964nmQ>>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends List<C34964nmQ>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((MarketHomeDexRankingFragment$setListener$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault((InterfaceC49371unL<? extends List<? extends InterfaceC40516qYt>>) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
