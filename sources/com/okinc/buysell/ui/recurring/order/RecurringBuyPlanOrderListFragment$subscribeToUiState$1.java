package com.okinc.buysell.ui.recurring.order;

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
import o.C30275lSi;
import o.C3961Avp;
import o.C43316rmw;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import uniffi.buy_sell.RecurringBuyPlanOrderListContentStateVariant;

/* JADX INFO: loaded from: classes23.dex */
public final class RecurringBuyPlanOrderListFragment$subscribeToUiState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C30275lSi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanOrderListFragment$subscribeToUiState$1(C30275lSi c30275lSi, Continuation<? super RecurringBuyPlanOrderListFragment$subscribeToUiState$1> continuation) {
        super(2, continuation);
        this.this$0 = c30275lSi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanOrderListFragment$subscribeToUiState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanOrderListFragment$subscribeToUiState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.order.RecurringBuyPlanOrderListFragment$subscribeToUiState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C30275lSi this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C30275lSi c30275lSi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c30275lSi;
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
                StateFlow<C3961Avp> stateFlowOLrzqt = this.this$0.valueOf().OLrzqt();
                final C30275lSi c30275lSi = this.this$0;
                FlowCollector<? super C3961Avp> flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.recurring.order.RecurringBuyPlanOrderListFragment.subscribeToUiState.1.1.1

                    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.order.RecurringBuyPlanOrderListFragment$subscribeToUiState$1$1$1$TaskDescription */
                    public final /* synthetic */ class TaskDescription {
                        public static final /* synthetic */ int[] OLrzqt;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        static {
                            int[] iArr = new int[RecurringBuyPlanOrderListContentStateVariant.values().length];
                            try {
                                iArr[RecurringBuyPlanOrderListContentStateVariant.IDLE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[RecurringBuyPlanOrderListContentStateVariant.LOADING.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[RecurringBuyPlanOrderListContentStateVariant.LOADED.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[RecurringBuyPlanOrderListContentStateVariant.EMPTY.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[RecurringBuyPlanOrderListContentStateVariant.ERROR.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            OLrzqt = iArr;
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C3961Avp c3961Avp, Continuation<? super Unit> continuation) {
                        if (c3961Avp == null) {
                            return Unit.INSTANCE;
                        }
                        int i2 = TaskDescription.OLrzqt[c3961Avp.KWHzl().OLrzqt().ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            RecyclerView recyclerView = C30275lSi.copydefault(c30275lSi).KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                            recyclerView.setVisibility(8);
                            C55173xeu c55173xeu = C30275lSi.copydefault(c30275lSi).AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                            c55173xeu.setVisibility(8);
                            C55113xdn c55113xdn = C30275lSi.copydefault(c30275lSi).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                            c55113xdn.setVisibility(0);
                        } else if (i2 == 3) {
                            RecyclerView recyclerView2 = C30275lSi.copydefault(c30275lSi).KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                            recyclerView2.setVisibility(0);
                            C55173xeu c55173xeu2 = C30275lSi.copydefault(c30275lSi).AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                            c55173xeu2.setVisibility(8);
                            C55113xdn c55113xdn2 = C30275lSi.copydefault(c30275lSi).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                            c55113xdn2.setVisibility(8);
                            C43316rmw c43316rmw = c30275lSi.gEmmrt;
                            c43316rmw.setItems(c3961Avp.KWHzl().AEQbTJ());
                            c43316rmw.notifyDataSetChanged();
                        } else if (i2 == 4) {
                            RecyclerView recyclerView3 = C30275lSi.copydefault(c30275lSi).KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                            recyclerView3.setVisibility(0);
                            C55173xeu c55173xeu3 = C30275lSi.copydefault(c30275lSi).AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                            c55173xeu3.setVisibility(8);
                            C55113xdn c55113xdn3 = C30275lSi.copydefault(c30275lSi).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                            c55113xdn3.setVisibility(8);
                        } else {
                            if (i2 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            RecyclerView recyclerView4 = C30275lSi.copydefault(c30275lSi).KWHzl;
                            Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
                            recyclerView4.setVisibility(8);
                            C55173xeu c55173xeu4 = C30275lSi.copydefault(c30275lSi).AEQbTJ;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
                            c55173xeu4.setVisibility(0);
                            C55113xdn c55113xdn4 = C30275lSi.copydefault(c30275lSi).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                            c55113xdn4.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
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
            C30275lSi c30275lSi = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c30275lSi, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c30275lSi, state, anonymousClass1, this) == objCopydefault) {
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
