package com.amplifyframework.statemachine;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface EffectExecutor {
    void execute(@NotNull List<? extends Action> list, @NotNull EventDispatcher eventDispatcher, @NotNull Environment environment);
}
