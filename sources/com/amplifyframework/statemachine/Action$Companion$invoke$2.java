package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.Action;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56442yFn;
import o.C56518yIi;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Action$Companion$invoke$2 implements Action {
    final /* synthetic */ yHT<EnvType, String, EventDispatcher, Continuation<? super Unit>, Object> $block;
    private final String id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHT<? super EnvType, ? super java.lang.String, ? super com.amplifyframework.statemachine.EventDispatcher, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public Action$Companion$invoke$2(String str, yHT<? super EnvType, ? super String, ? super EventDispatcher, ? super Continuation<? super Unit>, ? extends Object> yht) {
        this.$block = yht;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.amplifyframework.statemachine.Action
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
        Intrinsics.copydefault(environment, "");
        Object objInvoke = this.$block.invoke((EnvType) environment, getId(), eventDispatcher, continuation);
        return objInvoke == C56442yFn.copydefault() ? objInvoke : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public Object execute$$forInline(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull final Continuation<? super Unit> continuation) {
        C56518yIi.AEQbTJ(4);
        new ContinuationImpl(continuation) { // from class: com.amplifyframework.statemachine.Action$Companion$invoke$2$execute$1
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
        Intrinsics.copydefault(environment, "");
        this.$block.invoke((EnvType) environment, getId(), eventDispatcher, continuation);
        return Unit.INSTANCE;
    }
}
