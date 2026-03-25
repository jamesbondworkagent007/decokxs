package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.Action;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.C56518yIi;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Action$Companion$invoke$1 implements Action {
    final /* synthetic */ yHO<EventDispatcher, Environment, Continuation<? super Unit>, Object> $block;
    private final String id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super com.amplifyframework.statemachine.EventDispatcher, ? super com.amplifyframework.statemachine.Environment, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public Action$Companion$invoke$1(String str, yHO<? super EventDispatcher, ? super Environment, ? super Continuation<? super Unit>, ? extends Object> yho) {
        this.$block = yho;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    @Override // com.amplifyframework.statemachine.Action
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
        Object objInvoke = this.$block.invoke(eventDispatcher, environment, continuation);
        return objInvoke == C56442yFn.copydefault() ? objInvoke : Unit.INSTANCE;
    }

    public Object execute$$forInline(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull final Continuation<? super Unit> continuation) {
        C56518yIi.AEQbTJ(4);
        new ContinuationImpl(continuation) { // from class: com.amplifyframework.statemachine.Action$Companion$invoke$1$execute$1
            int label;
            /* synthetic */ Object result;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.execute(null, null, this);
            }
        };
        C56518yIi.AEQbTJ(5);
        this.$block.invoke(eventDispatcher, environment, continuation);
        return Unit.INSTANCE;
    }
}
