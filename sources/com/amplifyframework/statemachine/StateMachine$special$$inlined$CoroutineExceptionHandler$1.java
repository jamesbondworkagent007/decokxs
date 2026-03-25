package com.amplifyframework.statemachine;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractC56429yFa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class StateMachine$special$$inlined$CoroutineExceptionHandler$1 extends AbstractC56429yFa implements CoroutineExceptionHandler {
    public StateMachine$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key) {
        super(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        System.out.println((Object) ("CoroutineExceptionHandler got " + th));
    }
}
