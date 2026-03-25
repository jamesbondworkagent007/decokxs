package com.okinc.buysell.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class AsyncHelperKt$executeApiTasks$2$deferredTasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<?, ? extends Exception>>, Object> {
    final /* synthetic */ Function1<Continuation<? super AbstractC43419rot<?, ? extends Exception>>, Object> $task;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super o.rot<?, ? extends java.lang.Exception>>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AsyncHelperKt$executeApiTasks$2$deferredTasks$1$1(Function1<? super Continuation<? super AbstractC43419rot<?, ? extends Exception>>, ? extends Object> function1, Continuation<? super AsyncHelperKt$executeApiTasks$2$deferredTasks$1$1> continuation) {
        super(2, continuation);
        this.$task = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsyncHelperKt$executeApiTasks$2$deferredTasks$1$1(this.$task, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<?, ? extends Exception>> continuation) {
        return ((AsyncHelperKt$executeApiTasks$2$deferredTasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Function1<Continuation<? super AbstractC43419rot<?, ? extends Exception>>, Object> function1 = this.$task;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return (AbstractC43419rot) obj;
        } catch (Exception e) {
            return new AbstractC43419rot.ActionBar(e);
        }
    }
}
