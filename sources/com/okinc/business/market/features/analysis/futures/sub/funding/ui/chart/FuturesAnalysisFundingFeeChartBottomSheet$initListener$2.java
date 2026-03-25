package com.okinc.business.market.features.analysis.futures.sub.funding.ui.chart;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25887jKa;
import o.C25905jKs;
import o.C42781rcr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisFundingFeeChartBottomSheet$initListener$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends C25905jKs>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C25887jKa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisFundingFeeChartBottomSheet$initListener$2(C25887jKa c25887jKa, Continuation<? super FuturesAnalysisFundingFeeChartBottomSheet$initListener$2> continuation) {
        super(2, continuation);
        this.this$0 = c25887jKa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisFundingFeeChartBottomSheet$initListener$2 futuresAnalysisFundingFeeChartBottomSheet$initListener$2 = new FuturesAnalysisFundingFeeChartBottomSheet$initListener$2(this.this$0, continuation);
        futuresAnalysisFundingFeeChartBottomSheet$initListener$2.L$0 = obj;
        return futuresAnalysisFundingFeeChartBottomSheet$initListener$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends C25905jKs> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<C25905jKs>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<C25905jKs> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisFundingFeeChartBottomSheet$initListener$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49371unL interfaceC49371unL = (InterfaceC49371unL) this.L$0;
            C42781rcr c42781rcr = this.this$0.copydefault;
            if (c42781rcr != null) {
                this.this$0.OLrzqt(c42781rcr, interfaceC49371unL);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
