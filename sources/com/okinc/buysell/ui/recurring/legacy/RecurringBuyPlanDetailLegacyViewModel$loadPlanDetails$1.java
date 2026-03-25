package com.okinc.buysell.ui.recurring.legacy;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30234lQv;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class RecurringBuyPlanDetailLegacyViewModel$loadPlanDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $showLoading;
    int label;
    final /* synthetic */ RecurringBuyPlanDetailLegacyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanDetailLegacyViewModel$loadPlanDetails$1(boolean z, RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel, Continuation<? super RecurringBuyPlanDetailLegacyViewModel$loadPlanDetails$1> continuation) {
        super(2, continuation);
        this.$showLoading = z;
        this.this$0 = recurringBuyPlanDetailLegacyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanDetailLegacyViewModel$loadPlanDetails$1(this.$showLoading, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanDetailLegacyViewModel$loadPlanDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$showLoading) {
                mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, InterfaceC30234lQv.Application.AEQbTJ);
            }
            RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel = this.this$0;
            recurringBuyPlanDetailLegacyViewModel.copydefault(recurringBuyPlanDetailLegacyViewModel.copydefault());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
