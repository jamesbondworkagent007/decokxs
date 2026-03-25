package com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C52794wYp;
import o.C53613wom;
import o.C56391yDq;
import o.C56442yFn;
import o.wYF;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbWithdrawProfitsBottomSheet$initListeners$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C53613wom this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbWithdrawProfitsBottomSheet$initListeners$1(C53613wom c53613wom, Continuation<? super SmartArbWithdrawProfitsBottomSheet$initListeners$1> continuation) {
        super(2, continuation);
        this.this$0 = c53613wom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartArbWithdrawProfitsBottomSheet$initListeners$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartArbWithdrawProfitsBottomSheet$initListeners$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$initListeners$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C53613wom this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C53613wom c53613wom, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c53613wom;
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
                StateFlow<SmartArbWithdrawProfitsViewModel.PendingIntent> stateFlowAYXKKw = this.this$0.valueOf().AYXKKw();
                final C53613wom c53613wom = this.this$0;
                FlowCollector<? super SmartArbWithdrawProfitsViewModel.PendingIntent> flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet.initListeners.1.1.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(SmartArbWithdrawProfitsViewModel.PendingIntent pendingIntent, Continuation<? super Unit> continuation) {
                        C52794wYp c52794wYpCopydefault;
                        wYF wyf = c53613wom.AhwBna;
                        if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                            c52794wYpCopydefault.setEnabled(pendingIntent.AYXKKw());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowAYXKKw.collect(flowCollector, this) == objCopydefault) {
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
            C53613wom c53613wom = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c53613wom, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(c53613wom, state, anonymousClass1, this) == objCopydefault) {
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
