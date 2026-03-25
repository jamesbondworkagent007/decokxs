package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28231kTt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ C28231kTt.ActionBar $callback;
    final /* synthetic */ boolean $forceManual;
    final /* synthetic */ C28231kTt.Activity $snapshot;
    int label;
    final /* synthetic */ C28231kTt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$3$1$1(C28231kTt c28231kTt, FragmentActivity fragmentActivity, C28231kTt.Activity activity, C28231kTt.ActionBar actionBar, boolean z, Continuation<? super AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$3$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c28231kTt;
        this.$activity = fragmentActivity;
        this.$snapshot = activity;
        this.$callback = actionBar;
        this.$forceManual = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$3$1$1(this.this$0, this.$activity, this.$snapshot, this.$callback, this.$forceManual, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedOrderSubmissionDelegate$submitTeeLimitOrder$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28231kTt c28231kTt = this.this$0;
            FragmentActivity fragmentActivity = this.$activity;
            C28231kTt.Activity activity = this.$snapshot;
            C28231kTt.ActionBar actionBar = this.$callback;
            boolean z = this.$forceManual;
            this.label = 1;
            if (c28231kTt.EZpvd(fragmentActivity, activity, actionBar, z, (Continuation<? super Unit>) this) == objCopydefault) {
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
