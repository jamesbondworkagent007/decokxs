package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C23732iHg;
import o.C27137jpX;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3SubscribeActivity$initChartControl$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$initChartControl$4(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super InvestUniv3SubscribeActivity$initChartControl$4> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$initChartControl$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$initChartControl$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity$initChartControl$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<InvestUniv3SubscribeViewModel.ChartLoadingStatus, InvestUniv3SubscribeViewModel.ChartLoadingStatus, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ InvestUniv3SubscribeActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = investUniv3SubscribeActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus, InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus2, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = chartLoadingStatus;
            anonymousClass1.L$1 = chartLoadingStatus2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus = (InvestUniv3SubscribeViewModel.ChartLoadingStatus) this.L$0;
                InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus2 = (InvestUniv3SubscribeViewModel.ChartLoadingStatus) this.L$1;
                InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus3 = InvestUniv3SubscribeViewModel.ChartLoadingStatus.Loading;
                C23732iHg c23732iHg = null;
                if (chartLoadingStatus == chartLoadingStatus3 || chartLoadingStatus2 == chartLoadingStatus3) {
                    C23732iHg c23732iHg2 = this.this$0.AhwBna;
                    if (c23732iHg2 == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg2 = null;
                    }
                    C55113xdn.showLoading$default(c23732iHg2.DbNXlk, 0L, 1, null);
                    C23732iHg c23732iHg3 = this.this$0.AhwBna;
                    if (c23732iHg3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c23732iHg = c23732iHg3;
                    }
                    C27137jpX c27137jpX = c23732iHg.wlaJM;
                    Intrinsics.checkNotNullExpressionValue(c27137jpX, "");
                    c27137jpX.setVisibility(8);
                } else {
                    InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus4 = InvestUniv3SubscribeViewModel.ChartLoadingStatus.Error;
                    if ((chartLoadingStatus != chartLoadingStatus4 || !Intrinsics.EZpvd((Object) this.this$0.gEmmrt, (Object) "CHART_TYPE_DEPTH")) && (chartLoadingStatus2 != chartLoadingStatus4 || !Intrinsics.EZpvd((Object) this.this$0.gEmmrt, (Object) "CHART_TYPE_PRICE"))) {
                        C23732iHg c23732iHg4 = this.this$0.AhwBna;
                        if (c23732iHg4 == null) {
                            Intrinsics.gEmmrt("");
                            c23732iHg4 = null;
                        }
                        c23732iHg4.DbNXlk.copydefault();
                        C23732iHg c23732iHg5 = this.this$0.AhwBna;
                        if (c23732iHg5 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c23732iHg = c23732iHg5;
                        }
                        C27137jpX c27137jpX2 = c23732iHg.wlaJM;
                        Intrinsics.checkNotNullExpressionValue(c27137jpX2, "");
                        c27137jpX2.setVisibility(8);
                    } else {
                        C23732iHg c23732iHg6 = this.this$0.AhwBna;
                        if (c23732iHg6 == null) {
                            Intrinsics.gEmmrt("");
                            c23732iHg6 = null;
                        }
                        c23732iHg6.DbNXlk.copydefault();
                        C23732iHg c23732iHg7 = this.this$0.AhwBna;
                        if (c23732iHg7 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c23732iHg = c23732iHg7;
                        }
                        C27137jpX c27137jpX3 = c23732iHg.wlaJM;
                        Intrinsics.checkNotNullExpressionValue(c27137jpX3, "");
                        c27137jpX3.setVisibility(0);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFlowCombine = FlowKt.flowCombine(this.this$0.isConnected().hDKMBd(), this.this$0.isConnected().RJOkX(), new AnonymousClass1(this.this$0, null));
            this.label = 1;
            if (FlowKt.collect(flowFlowCombine, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
