package com.amplifyframework.statemachine;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface EventDispatcher {
    void send(@NotNull StateMachineEvent stateMachineEvent);
}
