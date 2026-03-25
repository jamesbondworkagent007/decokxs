package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.codegen.actions.DeleteUserActions;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DeleteUserCognitoActions implements DeleteUserActions {
    public static final DeleteUserCognitoActions INSTANCE = new DeleteUserCognitoActions();

    private DeleteUserCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeleteUserActions
    public Action initDeleteUserAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Action.Companion companion = Action.Companion;
        return new DeleteUserCognitoActions$initDeleteUserAction$$inlined$invoke$1("DeleteUser", str);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.DeleteUserActions
    public Action initiateSignOut() {
        Action.Companion companion = Action.Companion;
        final String str = "Sign Out Deleted User";
        return new Action(str) { // from class: com.amplifyframework.auth.cognito.actions.DeleteUserCognitoActions$initiateSignOut$$inlined$invoke$1
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.amplifyframework.statemachine.Action
            public String getId() {
                return this.id;
            }

            {
                this.id = str == null ? Action.DefaultImpls.getId(this) : str;
            }

            @Override // com.amplifyframework.statemachine.Action
            public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.copydefault(environment, "");
                String id = getId();
                AuthEnvironment authEnvironment = (AuthEnvironment) environment;
                authEnvironment.getLogger().verbose(id + " Starting execution");
                AuthorizationEvent authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.UserDeleted(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                AuthenticationEvent authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignOutRequested(new SignOutData(true, null, true, 2, null)), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + authorizationEvent.getType());
                eventDispatcher.send(authorizationEvent);
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher.send(authenticationEvent);
                return Unit.INSTANCE;
            }
        };
    }
}
