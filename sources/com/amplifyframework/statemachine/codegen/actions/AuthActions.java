package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AuthActions {
    Action initializeAuthConfigurationAction(@NotNull AuthEvent.EventType.ConfigureAuth configureAuth);

    Action initializeAuthenticationConfigurationAction(@NotNull AuthEvent.EventType.ConfigureAuthentication configureAuthentication);

    Action initializeAuthorizationConfigurationAction(@NotNull AuthEvent.EventType eventType);
}
