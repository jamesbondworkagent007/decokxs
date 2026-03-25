package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface MigrateAuthActions {
    Action initiateMigrateAuthAction(@NotNull SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth);
}
