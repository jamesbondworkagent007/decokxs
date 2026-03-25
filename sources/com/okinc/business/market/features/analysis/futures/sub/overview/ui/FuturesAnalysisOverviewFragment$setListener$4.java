package com.okinc.business.market.features.analysis.futures.sub.overview.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25915jLb;
import o.C42782rcs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jKQ;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisOverviewFragment$setListener$4 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C25915jLb>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jKQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisOverviewFragment$setListener$4(jKQ jkq, Continuation<? super FuturesAnalysisOverviewFragment$setListener$4> continuation) {
        super(2, continuation);
        this.this$0 = jkq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisOverviewFragment$setListener$4 futuresAnalysisOverviewFragment$setListener$4 = new FuturesAnalysisOverviewFragment$setListener$4(this.this$0, continuation);
        futuresAnalysisOverviewFragment$setListener$4.L$0 = obj;
        return futuresAnalysisOverviewFragment$setListener$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C25915jLb> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<C25915jLb>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<C25915jLb> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisOverviewFragment$setListener$4) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            C42782rcs c42782rcs = this.this$0.AEQbTJ;
            if (c42782rcs != null) {
                this.this$0.KWHzl(c42782rcs, (InterfaceC49371unL<C25915jLb>) interfaceC49371unL);
            }
            this.this$0.gEmmrt().gEmmrt();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
