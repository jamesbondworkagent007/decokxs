package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.events.AuthEvent;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.DeleteUserEvent;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthEnvironmentKt {
    public static final AuthEvent.EventType isAuthEvent(@NotNull StateMachineEvent stateMachineEvent) {
        Intrinsics.checkNotNullParameter(stateMachineEvent, "");
        AuthEvent authEvent = stateMachineEvent instanceof AuthEvent ? (AuthEvent) stateMachineEvent : null;
        if (authEvent != null) {
            return authEvent.getEventType();
        }
        return null;
    }

    public static final AuthenticationEvent.EventType isAuthenticationEvent(@NotNull StateMachineEvent stateMachineEvent) {
        Intrinsics.checkNotNullParameter(stateMachineEvent, "");
        AuthenticationEvent authenticationEvent = stateMachineEvent instanceof AuthenticationEvent ? (AuthenticationEvent) stateMachineEvent : null;
        if (authenticationEvent != null) {
            return authenticationEvent.getEventType();
        }
        return null;
    }

    public static final AuthorizationEvent.EventType isAuthorizationEvent(@NotNull StateMachineEvent stateMachineEvent) {
        Intrinsics.checkNotNullParameter(stateMachineEvent, "");
        AuthorizationEvent authorizationEvent = stateMachineEvent instanceof AuthorizationEvent ? (AuthorizationEvent) stateMachineEvent : null;
        if (authorizationEvent != null) {
            return authorizationEvent.getEventType();
        }
        return null;
    }

    public static final SignOutEvent.EventType isSignOutEvent(@NotNull StateMachineEvent stateMachineEvent) {
        Intrinsics.checkNotNullParameter(stateMachineEvent, "");
        SignOutEvent signOutEvent = stateMachineEvent instanceof SignOutEvent ? (SignOutEvent) stateMachineEvent : null;
        if (signOutEvent != null) {
            return signOutEvent.getEventType();
        }
        return null;
    }

    public static final DeleteUserEvent.EventType isDeleteUserEvent(@NotNull StateMachineEvent stateMachineEvent) {
        Intrinsics.checkNotNullParameter(stateMachineEvent, "");
        DeleteUserEvent deleteUserEvent = stateMachineEvent instanceof DeleteUserEvent ? (DeleteUserEvent) stateMachineEvent : null;
        if (deleteUserEvent != null) {
            return deleteUserEvent.getEventType();
        }
        return null;
    }
}
