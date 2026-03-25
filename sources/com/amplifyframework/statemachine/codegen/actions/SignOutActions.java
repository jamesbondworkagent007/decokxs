package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignOutEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SignOutActions {
    Action buildRevokeTokenErrorAction(@NotNull SignOutEvent.EventType.SignOutGloballyError signOutGloballyError);

    Action globalSignOutAction(@NotNull SignOutEvent.EventType.SignOutGlobally signOutGlobally);

    Action hostedUISignOutAction(@NotNull SignOutEvent.EventType.InvokeHostedUISignOut invokeHostedUISignOut);

    Action localSignOutAction(@NotNull SignOutEvent.EventType.SignOutLocally signOutLocally);

    Action revokeTokenAction(@NotNull SignOutEvent.EventType.RevokeToken revokeToken);

    Action userCancelledAction(@NotNull SignOutEvent.EventType.UserCancelled userCancelled);
}
