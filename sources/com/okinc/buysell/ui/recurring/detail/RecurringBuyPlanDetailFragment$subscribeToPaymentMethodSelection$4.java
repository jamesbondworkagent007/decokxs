package com.okinc.buysell.ui.recurring.detail;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.lMD;

/* JADX INFO: loaded from: classes23.dex */
public final class RecurringBuyPlanDetailFragment$subscribeToPaymentMethodSelection$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RecurringBuyPlanDetailFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanDetailFragment$subscribeToPaymentMethodSelection$4(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, Continuation<? super RecurringBuyPlanDetailFragment$subscribeToPaymentMethodSelection$4> continuation) {
        super(2, continuation);
        this.this$0 = recurringBuyPlanDetailFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanDetailFragment$subscribeToPaymentMethodSelection$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanDetailFragment$subscribeToPaymentMethodSelection$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$subscribeToPaymentMethodSelection$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RecurringBuyPlanDetailFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = recurringBuyPlanDetailFragment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Pair<Channel, lMD<PaymentMethod, Exception>>> sharedFlowOLrzqt = this.this$0.AhwBna().OLrzqt();
                final RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment = this.this$0;
                FlowCollector<? super Pair<Channel, lMD<PaymentMethod, Exception>>> flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment.subscribeToPaymentMethodSelection.4.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Pair<Channel, ? extends lMD<PaymentMethod, ? extends Exception>> pair, Continuation<? super Unit> continuation) {
                        recurringBuyPlanDetailFragment.OLrzqt(pair.component1(), (lMD<PaymentMethod, ? extends Exception>) pair.component2());
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(recurringBuyPlanDetailFragment, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(recurringBuyPlanDetailFragment, state, anonymousClass1, this) == objCopydefault) {
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
