package com.okinc.buysell.ui.recurring.list;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import o.C31351lsQ;
import o.C33070mpX;
import o.C3871AuC;
import o.C43316rmw;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.lRV;
import uniffi.buy_sell.RecurringBuyPlanListContentStateVariant;

/* JADX INFO: loaded from: classes23.dex */
public final class RecurringBuyPlanListFragment$subscribeToUiState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ lRV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanListFragment$subscribeToUiState$1(lRV lrv, Continuation<? super RecurringBuyPlanListFragment$subscribeToUiState$1> continuation) {
        super(2, continuation);
        this.this$0 = lrv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanListFragment$subscribeToUiState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanListFragment$subscribeToUiState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.list.RecurringBuyPlanListFragment$subscribeToUiState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ lRV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lRV lrv, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lrv;
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
                StateFlow<C3871AuC> stateFlowKWHzl = this.this$0.AYXKKw().KWHzl();
                final lRV lrv = this.this$0;
                FlowCollector<? super C3871AuC> flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.recurring.list.RecurringBuyPlanListFragment.subscribeToUiState.1.1.3

                    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.list.RecurringBuyPlanListFragment$subscribeToUiState$1$1$3$Activity */
                    public final /* synthetic */ class Activity {
                        public static final /* synthetic */ int[] AEQbTJ;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        static {
                            int[] iArr = new int[RecurringBuyPlanListContentStateVariant.values().length];
                            try {
                                iArr[RecurringBuyPlanListContentStateVariant.IDLE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[RecurringBuyPlanListContentStateVariant.LOADING.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[RecurringBuyPlanListContentStateVariant.LOADED.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[RecurringBuyPlanListContentStateVariant.EMPTY.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[RecurringBuyPlanListContentStateVariant.ERROR.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            AEQbTJ = iArr;
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C3871AuC c3871AuC, Continuation<? super Unit> continuation) {
                        if (c3871AuC == null) {
                            return Unit.INSTANCE;
                        }
                        int i2 = Activity.AEQbTJ[c3871AuC.copydefault().copydefault().ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            C55113xdn c55113xdn = lRV.OLrzqt(lrv).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                            c55113xdn.setVisibility(0);
                            ConstraintLayout constraintLayout = lRV.OLrzqt(lrv).copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                            constraintLayout.setVisibility(8);
                            C55173xeu c55173xeu = lRV.OLrzqt(lrv).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                            c55173xeu.setVisibility(8);
                        } else if (i2 == 3) {
                            ConstraintLayout constraintLayout2 = lRV.OLrzqt(lrv).copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                            constraintLayout2.setVisibility(0);
                            C55113xdn c55113xdn2 = lRV.OLrzqt(lrv).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                            c55113xdn2.setVisibility(8);
                            C55173xeu c55173xeu2 = lRV.OLrzqt(lrv).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                            c55173xeu2.setVisibility(8);
                            C43316rmw c43316rmw = lrv.AYXKKw;
                            c43316rmw.setItems(c3871AuC.copydefault().OLrzqt());
                            c43316rmw.notifyDataSetChanged();
                            if (lrv.djBIcL) {
                                lrv.fetchVPNInfo();
                            }
                        } else if (i2 == 4) {
                            ConstraintLayout constraintLayout3 = lRV.OLrzqt(lrv).copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                            constraintLayout3.setVisibility(0);
                            C55113xdn c55113xdn3 = lRV.OLrzqt(lrv).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                            c55113xdn3.setVisibility(8);
                            C55173xeu c55173xeu3 = lRV.OLrzqt(lrv).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                            c55173xeu3.setVisibility(8);
                            if (lrv.djBIcL) {
                                lrv.fetchVPNInfo();
                            }
                        } else {
                            if (i2 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C55173xeu c55173xeu4 = lRV.OLrzqt(lrv).OLrzqt;
                            Intrinsics.copydefault(c55173xeu4);
                            c55173xeu4.setVisibility(0);
                            c55173xeu4.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.AxsJAYaxsJAY));
                            c55173xeu4.setSubTitle((CharSequence) c3871AuC.copydefault().KWHzl());
                            c55173xeu4.setEmptyTypeImage(8);
                            ConstraintLayout constraintLayout4 = lRV.OLrzqt(lrv).copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                            constraintLayout4.setVisibility(8);
                            C55113xdn c55113xdn4 = lRV.OLrzqt(lrv).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                            c55113xdn4.setVisibility(8);
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
            lRV lrv = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lrv, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lrv, state, anonymousClass1, this) == objCopydefault) {
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
