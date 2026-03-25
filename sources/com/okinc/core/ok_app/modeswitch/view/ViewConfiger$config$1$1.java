package com.okinc.core.ok_app.modeswitch.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewConfiger$config$1$1<T> extends SuspendLambda implements yHO<CoroutineScope, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<T, Unit> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewConfiger$config$1$1(Function1<? super T, Unit> function1, Continuation<? super ViewConfiger$config$1$1> continuation) {
        super(3, continuation);
        this.$block = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, T t, Continuation<? super Unit> continuation) {
        ViewConfiger$config$1$1 viewConfiger$config$1$1 = new ViewConfiger$config$1$1(this.$block, continuation);
        viewConfiger$config$1$1.L$0 = t;
        return viewConfiger$config$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.$block.invoke((T) this.L$0);
        return Unit.INSTANCE;
    }
}
