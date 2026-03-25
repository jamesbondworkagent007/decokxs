package com.okinc.network.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C43458rpf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes9.dex */
public final class GroupTasksForDNS$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, T> $block;
    final /* synthetic */ int $index;
    final /* synthetic */ AtomicBoolean $isSuccess;
    final /* synthetic */ Function2<T, Integer, Unit> $onResult;
    final /* synthetic */ CoroutineScope $scope;
    int label;
    final /* synthetic */ C43458rpf<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupTasksForDNS$start$1(Function1<? super String, ? extends T> function1, C43458rpf<T> c43458rpf, AtomicBoolean atomicBoolean, Function2<? super T, ? super Integer, Unit> function2, int i, CoroutineScope coroutineScope, Continuation<? super GroupTasksForDNS$start$1> continuation) {
        super(2, continuation);
        this.$block = function1;
        this.this$0 = c43458rpf;
        this.$isSuccess = atomicBoolean;
        this.$onResult = function2;
        this.$index = i;
        this.$scope = coroutineScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupTasksForDNS$start$1(this.$block, this.this$0, this.$isSuccess, this.$onResult, this.$index, this.$scope, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupTasksForDNS$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Object objInvoke = this.$block.invoke(this.this$0.KWHzl);
            if (!this.$isSuccess.getAndSet(true)) {
                this.$onResult.invoke((T) objInvoke, C56443yFo.AEQbTJ(this.$index));
                CoroutineScopeKt.cancel$default(this.$scope, null, 1, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
