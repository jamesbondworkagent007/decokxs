package com.okinc.tradingbot.impl.strategy.fragment.detail;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.ActivityC52272wFg;
import o.C33070mpX;
import o.C55326xho;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC52662wTs;

/* JADX INFO: loaded from: classes19.dex */
public final class TacticsDetailsActivity$initListener$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC52272wFg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TacticsDetailsActivity$initListener$4(ActivityC52272wFg activityC52272wFg, Continuation<? super TacticsDetailsActivity$initListener$4> continuation) {
        super(2, continuation);
        this.this$0 = activityC52272wFg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TacticsDetailsActivity$initListener$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TacticsDetailsActivity$initListener$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailsActivity$initListener$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC52272wFg this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC52272wFg activityC52272wFg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC52272wFg;
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
                SharedFlow<TacticsDetailPresenter.Activity> sharedFlowWlaJM = ActivityC52272wFg.OLrzqt(this.this$0).wlaJM();
                final ActivityC52272wFg activityC52272wFg = this.this$0;
                FlowCollector<? super TacticsDetailPresenter.Activity> flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailsActivity.initListener.4.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(TacticsDetailPresenter.Activity activity, Continuation<? super Unit> continuation) {
                        if (activity instanceof TacticsDetailPresenter.Activity.Application) {
                            activityC52272wFg.QVAiDq();
                        } else if (activity instanceof TacticsDetailPresenter.Activity.StateListAnimator) {
                            InterfaceC52662wTs.TaskDescription.showSnackbar$default(activityC52272wFg, C33070mpX.AYXKKw(C55688xof.Application.DfrfUJ), 3, false, 4, null);
                        } else if (activity instanceof TacticsDetailPresenter.Activity.TaskDescription) {
                            InterfaceC52662wTs.TaskDescription.showSnackbar$default(activityC52272wFg, C33070mpX.AYXKKw(C55688xof.Application.getAdvertisingId), 3, false, 4, null);
                        } else if (activity instanceof TacticsDetailPresenter.Activity.ActionBar) {
                            C55326xho.toastWithFailedIcon$default(((TacticsDetailPresenter.Activity.ActionBar) activity).EZpvd(), 0, 1, (Object) null);
                        } else {
                            if (!(activity instanceof TacticsDetailPresenter.Activity.C0673Activity)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            activityC52272wFg.releaseLoading();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowWlaJM.collect(flowCollector, this) == objCopydefault) {
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
            ActivityC52272wFg activityC52272wFg = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC52272wFg, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC52272wFg, state, anonymousClass1, this) == objCopydefault) {
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
