package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AuthenticationActions {
    Action configureAuthenticationAction(@NotNull AuthenticationEvent.EventType.Configure configure);

    Action initiateSignInAction(@NotNull AuthenticationEvent.EventType.SignInRequested signInRequested);

    Action initiateSignOutAction(@NotNull AuthenticationEvent.EventType.SignOutRequested signOutRequested, SignedInData signedInData);
}
