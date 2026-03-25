package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import com.okinc.business.dexlogic.error.SignCancelException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28231kTt;
import o.C30565ldZ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedOrderSubmissionDelegate$handleFailure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C28231kTt.ActionBar $callback;
    final /* synthetic */ Function1<Boolean, Unit> $retryOrderSubmit;
    final /* synthetic */ Throwable $throwable;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedOrderSubmissionDelegate$handleFailure$1(C28231kTt.ActionBar actionBar, Throwable th, Function1<? super Boolean, Unit> function1, Continuation<? super AdvancedOrderSubmissionDelegate$handleFailure$1> continuation) {
        super(2, continuation);
        this.$callback = actionBar;
        this.$throwable = th;
        this.$retryOrderSubmit = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedOrderSubmissionDelegate$handleFailure$1(this.$callback, this.$throwable, this.$retryOrderSubmit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedOrderSubmissionDelegate$handleFailure$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$callback.EZpvd(false);
            this.$callback.EZpvd();
            Throwable th = this.$throwable;
            if (!(th instanceof SignCancelException)) {
                this.$callback.copydefault(new InterfaceC30595leC.ComponentCallbacks2(C30565ldZ.EZpvd(th), C30565ldZ.AEQbTJ(this.$throwable), this.$throwable, this.$retryOrderSubmit));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
