package com.okinc.tradingbot.impl.order.strategy.dialog;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.order.strategy.dialog.EditStrategyNameViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C50404vNd;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.uPH;
import o.wYF;

/* JADX INFO: loaded from: classes11.dex */
public final class BottomEditStrategyNameDialog$observeEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C50404vNd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomEditStrategyNameDialog$observeEvents$1(C50404vNd c50404vNd, Continuation<? super BottomEditStrategyNameDialog$observeEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = c50404vNd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BottomEditStrategyNameDialog$observeEvents$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BottomEditStrategyNameDialog$observeEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.dialog.BottomEditStrategyNameDialog$observeEvents$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C50404vNd this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C50404vNd c50404vNd, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c50404vNd;
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

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.dialog.BottomEditStrategyNameDialog$observeEvents$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06471 extends SuspendLambda implements Function2<EditStrategyNameViewModel.TaskDescription, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C50404vNd this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06471(C50404vNd c50404vNd, Continuation<? super C06471> continuation) {
                super(2, continuation);
                this.this$0 = c50404vNd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06471 c06471 = new C06471(this.this$0, continuation);
                c06471.L$0 = obj;
                return c06471;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EditStrategyNameViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                return ((C06471) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                wYF wyf;
                C52794wYp c52794wYpCopydefault;
                wYF wyf2;
                C52794wYp c52794wYpCopydefault2;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    EditStrategyNameViewModel.TaskDescription taskDescription = (EditStrategyNameViewModel.TaskDescription) this.L$0;
                    if (taskDescription instanceof EditStrategyNameViewModel.TaskDescription.ActionBar) {
                        uPH uph = this.this$0.KWHzl;
                        if (uph != null && (wyf2 = uph.EZpvd) != null && (c52794wYpCopydefault2 = wyf2.copydefault()) != null) {
                            c52794wYpCopydefault2.setEnabled(false);
                        }
                    } else if (taskDescription instanceof EditStrategyNameViewModel.TaskDescription.Activity) {
                        Function2<String, Boolean, Unit> function2AEQbTJ = this.this$0.AEQbTJ();
                        if (function2AEQbTJ != null) {
                            EditStrategyNameViewModel.TaskDescription.Activity activity = (EditStrategyNameViewModel.TaskDescription.Activity) taskDescription;
                            function2AEQbTJ.invoke(activity.EZpvd(), C56443yFo.KWHzl(activity.OLrzqt()));
                        }
                        this.this$0.DbNXlk();
                    } else if (taskDescription instanceof EditStrategyNameViewModel.TaskDescription.StateListAnimator) {
                        this.this$0.KWHzl(((EditStrategyNameViewModel.TaskDescription.StateListAnimator) taskDescription).AEQbTJ());
                        uPH uph2 = this.this$0.KWHzl;
                        if (uph2 != null && (wyf = uph2.EZpvd) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                            c52794wYpCopydefault.setEnabled(true);
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
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
                SharedFlow<EditStrategyNameViewModel.TaskDescription> sharedFlowFJNWhG = this.this$0.OLrzqt().fJNWhG();
                C06471 c06471 = new C06471(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowFJNWhG, c06471, this) == objCopydefault) {
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C50404vNd c50404vNd = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c50404vNd, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c50404vNd, state, anonymousClass1, this) == objCopydefault) {
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
