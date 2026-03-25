package com.okinc.business.market.features.analysis.futures.sub.calendar.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25876jJq;
import o.C42777rcn;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.jIX;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisCalendarFragment$viewModelCollect$3 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C25876jJq>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jIX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisCalendarFragment$viewModelCollect$3(jIX jix, Continuation<? super FuturesAnalysisCalendarFragment$viewModelCollect$3> continuation) {
        super(2, continuation);
        this.this$0 = jix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisCalendarFragment$viewModelCollect$3 futuresAnalysisCalendarFragment$viewModelCollect$3 = new FuturesAnalysisCalendarFragment$viewModelCollect$3(this.this$0, continuation);
        futuresAnalysisCalendarFragment$viewModelCollect$3.L$0 = obj;
        return futuresAnalysisCalendarFragment$viewModelCollect$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C25876jJq> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<C25876jJq>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<C25876jJq> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisCalendarFragment$viewModelCollect$3) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            C42777rcn c42777rcn = this.this$0.OLrzqt;
            if (c42777rcn != null) {
                this.this$0.EZpvd(c42777rcn, (InterfaceC49371unL<C25876jJq>) interfaceC49371unL);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
