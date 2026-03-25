package com.okinc.buysell.ui.recurring.legacy;

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
import o.C43316rmw;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30270lSd;
import o.lRD;

/* JADX INFO: loaded from: classes18.dex */
public final class RecurringBuyPlanListLegacyFragment$subscribeToUiState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ lRD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanListLegacyFragment$subscribeToUiState$1(lRD lrd, Continuation<? super RecurringBuyPlanListLegacyFragment$subscribeToUiState$1> continuation) {
        super(2, continuation);
        this.this$0 = lrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanListLegacyFragment$subscribeToUiState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanListLegacyFragment$subscribeToUiState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment$subscribeToUiState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ lRD this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(lRD lrd, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lrd;
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
                StateFlow<InterfaceC30270lSd> stateFlowOLrzqt = this.this$0.AkhnZx().OLrzqt();
                final lRD lrd = this.this$0;
                FlowCollector<? super InterfaceC30270lSd> flowCollector = new FlowCollector() { // from class: com.okinc.buysell.ui.recurring.legacy.RecurringBuyPlanListLegacyFragment.subscribeToUiState.1.1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC30270lSd interfaceC30270lSd, Continuation<? super Unit> continuation) {
                        if (interfaceC30270lSd instanceof InterfaceC30270lSd.TaskDescription) {
                            ConstraintLayout constraintLayout = lRD.OLrzqt(lrd).copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                            constraintLayout.setVisibility(0);
                            C55113xdn c55113xdn = lRD.OLrzqt(lrd).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                            c55113xdn.setVisibility(8);
                            C55173xeu c55173xeu = lRD.OLrzqt(lrd).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                            c55173xeu.setVisibility(8);
                            C43316rmw c43316rmw = lrd.AYXKKw;
                            c43316rmw.setItems(((InterfaceC30270lSd.TaskDescription) interfaceC30270lSd).copydefault());
                            c43316rmw.notifyDataSetChanged();
                            if (lrd.AhwBna) {
                                lrd.valueOf();
                            }
                        } else if (Intrinsics.EZpvd(interfaceC30270lSd, InterfaceC30270lSd.ActionBar.copydefault)) {
                            C55173xeu c55173xeu2 = lRD.OLrzqt(lrd).OLrzqt;
                            Intrinsics.copydefault(c55173xeu2);
                            c55173xeu2.setVisibility(0);
                            c55173xeu2.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.AxsJAYaxsJAY));
                            c55173xeu2.setSubTitle((CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.hUfVAv));
                            c55173xeu2.setEmptyTypeImage(8);
                            ConstraintLayout constraintLayout2 = lRD.OLrzqt(lrd).copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                            constraintLayout2.setVisibility(8);
                            C55113xdn c55113xdn2 = lRD.OLrzqt(lrd).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                            c55113xdn2.setVisibility(8);
                        } else if (Intrinsics.EZpvd(interfaceC30270lSd, InterfaceC30270lSd.StateListAnimator.EZpvd)) {
                            ConstraintLayout constraintLayout3 = lRD.OLrzqt(lrd).copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                            constraintLayout3.setVisibility(0);
                            C55113xdn c55113xdn3 = lRD.OLrzqt(lrd).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                            c55113xdn3.setVisibility(8);
                            C55173xeu c55173xeu3 = lRD.OLrzqt(lrd).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                            c55173xeu3.setVisibility(8);
                            if (lrd.AhwBna) {
                                lrd.valueOf();
                            }
                        } else {
                            if (!Intrinsics.EZpvd(interfaceC30270lSd, InterfaceC30270lSd.Application.EZpvd)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            C55113xdn c55113xdn4 = lRD.OLrzqt(lrd).EZpvd;
                            Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                            c55113xdn4.setVisibility(0);
                            ConstraintLayout constraintLayout4 = lRD.OLrzqt(lrd).copydefault;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                            constraintLayout4.setVisibility(8);
                            C55173xeu c55173xeu4 = lRD.OLrzqt(lrd).OLrzqt;
                            Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
                            c55173xeu4.setVisibility(8);
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
            lRD lrd = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(lrd, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lrd, state, anonymousClass1, this) == objCopydefault) {
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
