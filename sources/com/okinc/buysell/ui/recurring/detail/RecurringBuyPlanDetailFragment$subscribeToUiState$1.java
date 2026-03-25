package com.okinc.buysell.ui.recurring.detail;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
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
import o.C33546myW;
import o.C3819AtD;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import uniffi.buy_sell.RecurringBuyPlanDetailContentStateVariant;

/* JADX INFO: loaded from: classes23.dex */
public final class RecurringBuyPlanDetailFragment$subscribeToUiState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RecurringBuyPlanDetailFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanDetailFragment$subscribeToUiState$1(RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment, Continuation<? super RecurringBuyPlanDetailFragment$subscribeToUiState$1> continuation) {
        super(2, continuation);
        this.this$0 = recurringBuyPlanDetailFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanDetailFragment$subscribeToUiState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanDetailFragment$subscribeToUiState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$subscribeToUiState$1$1, reason: invalid class name */
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
                StateFlow<C3819AtD> stateFlowKWHzl = this.this$0.AhwBna().KWHzl();
                final RecurringBuyPlanDetailFragment recurringBuyPlanDetailFragment = this.this$0;
                FlowCollector<? super C3819AtD> flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment.subscribeToUiState.1.1.5

                    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.detail.RecurringBuyPlanDetailFragment$subscribeToUiState$1$1$5$StateListAnimator */
                    public final /* synthetic */ class StateListAnimator {
                        public static final /* synthetic */ int[] EZpvd;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        static {
                            int[] iArr = new int[RecurringBuyPlanDetailContentStateVariant.values().length];
                            try {
                                iArr[RecurringBuyPlanDetailContentStateVariant.IDLE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[RecurringBuyPlanDetailContentStateVariant.LOADING.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[RecurringBuyPlanDetailContentStateVariant.LOADED.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[RecurringBuyPlanDetailContentStateVariant.ERROR.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            EZpvd = iArr;
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C3819AtD c3819AtD, Continuation<? super Unit> continuation) {
                        if (c3819AtD == null) {
                            return Unit.INSTANCE;
                        }
                        int i2 = StateListAnimator.EZpvd[c3819AtD.EZpvd().EZpvd().ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            C55113xdn c55113xdn = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).AkhnZx;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                            c55113xdn.setVisibility(0);
                            C33546myW c33546myW = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).djBIcL;
                            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                            c33546myW.setVisibility(8);
                            C55173xeu c55173xeu = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).AhwBna;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                            c55173xeu.setVisibility(8);
                        } else if (i2 == 3) {
                            C33546myW c33546myW2 = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).djBIcL;
                            Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
                            c33546myW2.setVisibility(0);
                            C55113xdn c55113xdn2 = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).AkhnZx;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                            c55113xdn2.setVisibility(8);
                            C55173xeu c55173xeu2 = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).AhwBna;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                            c55173xeu2.setVisibility(8);
                            recurringBuyPlanDetailFragment.KWHzl(c3819AtD.EZpvd().KWHzl());
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C55173xeu c55173xeu3 = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).AhwBna;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                            c55173xeu3.setVisibility(0);
                            C33546myW c33546myW3 = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).djBIcL;
                            Intrinsics.checkNotNullExpressionValue(c33546myW3, "");
                            c33546myW3.setVisibility(8);
                            C55113xdn c55113xdn3 = RecurringBuyPlanDetailFragment.KWHzl(recurringBuyPlanDetailFragment).AkhnZx;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                            c55113xdn3.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
