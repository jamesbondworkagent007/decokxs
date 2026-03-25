package com.amplifyframework.statemachine;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C56442yFn;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BasicAction implements Action {
    private final yHO<EventDispatcher, Environment, Continuation<? super Unit>, Object> block;
    private String id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<EventDispatcher, Environment, Continuation<? super Unit>, Object> getBlock() {
        return this.block;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super com.amplifyframework.statemachine.EventDispatcher, ? super com.amplifyframework.statemachine.Environment, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicAction(@NotNull String str, @NotNull yHO<? super EventDispatcher, ? super Environment, ? super Continuation<? super Unit>, ? extends Object> yho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        this.id = str;
        this.block = yho;
    }

    @Override // com.amplifyframework.statemachine.Action
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
        Object objInvoke = this.block.invoke(eventDispatcher, environment, continuation);
        return objInvoke == C56442yFn.copydefault() ? objInvoke : Unit.INSTANCE;
    }
}
