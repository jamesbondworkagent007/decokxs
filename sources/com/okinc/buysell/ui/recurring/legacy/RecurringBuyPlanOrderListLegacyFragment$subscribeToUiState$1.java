package com.okinc.buysell.ui.recurring.legacy;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C43316rmw;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30284lSr;
import o.lRJ;

/* JADX INFO: loaded from: classes18.dex */
public final class RecurringBuyPlanOrderListLegacyFragment$subscribeToUiState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ lRJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanOrderListLegacyFragment$subscribeToUiState$1(lRJ lrj, Continuation<? super RecurringBuyPlanOrderListLegacyFragment$subscribeToUiState$1> continuation) {
        super(2, continuation);
        this.this$0 = lrj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanOrderListLegacyFragment$subscribeToUiState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanOrderListLegacyFragment$subscribeToUiState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanOrderListLegacyFragment$subscribeToUiState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ lRJ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lRJ lrj, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lrj;
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
                StateFlow<InterfaceC30284lSr> stateFlowEZpvd = this.this$0.valueOf().EZpvd();
                final lRJ lrj = this.this$0;
                FlowCollector<? super InterfaceC30284lSr> flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanOrderListLegacyFragment.subscribeToUiState.1.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC30284lSr interfaceC30284lSr, Continuation<? super Unit> continuation) {
                        if (interfaceC30284lSr instanceof InterfaceC30284lSr.Activity) {
                            RecyclerView recyclerView = lRJ.KWHzl(lrj).KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                            recyclerView.setVisibility(0);
                            C55173xeu c55173xeu = lRJ.KWHzl(lrj).AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                            c55173xeu.setVisibility(8);
                            C55113xdn c55113xdn = lRJ.KWHzl(lrj).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                            c55113xdn.setVisibility(8);
                            C43316rmw c43316rmw = lrj.djBIcL;
                            c43316rmw.setItems(((InterfaceC30284lSr.Activity) interfaceC30284lSr).OLrzqt());
                            c43316rmw.notifyDataSetChanged();
                        } else if (Intrinsics.EZpvd(interfaceC30284lSr, InterfaceC30284lSr.Application.EZpvd)) {
                            RecyclerView recyclerView2 = lRJ.KWHzl(lrj).KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                            recyclerView2.setVisibility(8);
                            C55173xeu c55173xeu2 = lRJ.KWHzl(lrj).AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                            c55173xeu2.setVisibility(0);
                            C55113xdn c55113xdn2 = lRJ.KWHzl(lrj).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                            c55113xdn2.setVisibility(8);
                        } else {
                            if (!Intrinsics.EZpvd(interfaceC30284lSr, InterfaceC30284lSr.TaskDescription.KWHzl)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            RecyclerView recyclerView3 = lRJ.KWHzl(lrj).KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                            recyclerView3.setVisibility(8);
                            C55173xeu c55173xeu3 = lRJ.KWHzl(lrj).AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                            c55173xeu3.setVisibility(8);
                            C55113xdn c55113xdn3 = lRJ.KWHzl(lrj).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                            c55113xdn3.setVisibility(0);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
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
            lRJ lrj = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lrj, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lrj, state, anonymousClass1, this) == objCopydefault) {
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
