package com.okinc.okimcore.feature.message.utility;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import o.C44157sFk;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.sMQ;
import o.sMV;

/* JADX INFO: loaded from: classes10.dex */
public final class PriorityTaskQueue$enqueueSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ TaskPriority $priority;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ sMV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PriorityTaskQueue$enqueueSuspend$2(sMV smv, TaskPriority taskPriority, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super PriorityTaskQueue$enqueueSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = smv;
        this.$priority = taskPriority;
        this.$block = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PriorityTaskQueue$enqueueSuspend$2(this.this$0, this.$priority, this.$block, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((PriorityTaskQueue$enqueueSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CompletableDeferred completableDeferredCompletableDeferred$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            sMV smv = this.this$0;
            TaskPriority taskPriority = this.$priority;
            Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
            this.L$0 = completableDeferredCompletableDeferred$default;
            this.L$1 = smv;
            this.L$2 = taskPriority;
            this.L$3 = function2;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            CoroutineScope coroutineScopeEZpvd = C44157sFk.EZpvd(smv.valueOf, smv.gEmmrt);
            sMQ smq = new sMQ(taskPriority, smv.EZpvd.incrementAndGet(), completableDeferredCompletableDeferred$default, cancellableContinuationImpl, new PriorityTaskQueue$enqueueSuspend$2$1$prioritizedTask$1(function2, null));
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineScopeEZpvd.getCoroutineContext()), smv.copydefault, null, new PriorityTaskQueue$enqueueSuspend$2$1$1(smv, smq, null), 2, null);
            cancellableContinuationImpl.invokeOnCancellation(new ActionBar(coroutineScopeEZpvd, smv, smq));
            Object result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (result == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableDeferredCompletableDeferred$default = (CompletableDeferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        obj = completableDeferredCompletableDeferred$default.await(this);
        return obj == objCopydefault ? objCopydefault : obj;
    }

    public static final class ActionBar implements Function1<Throwable, Unit> {
        public final /* synthetic */ sMQ AEQbTJ;
        public final /* synthetic */ sMV KWHzl;
        public final /* synthetic */ CoroutineScope copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(CoroutineScope coroutineScope, sMV smv, sMQ smq) {
            this.copydefault = coroutineScope;
            this.KWHzl = smv;
            this.AEQbTJ = smq;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            EZpvd(th);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Throwable th) {
            BuildersKt__Builders_commonKt.launch$default(this.copydefault, this.KWHzl.AEQbTJ, null, new PriorityTaskQueue$enqueueSuspend$2$1$2$1(this.KWHzl, this.AEQbTJ, null), 2, null);
        }
    }
}
