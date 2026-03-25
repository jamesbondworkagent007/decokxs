package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.MigrateAuthActions;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MigrateAuthCognitoActions implements MigrateAuthActions {
    public static final MigrateAuthCognitoActions INSTANCE = new MigrateAuthCognitoActions();
    private static final String KEY_PASSWORD = "PASSWORD";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String KEY_USERNAME = "USERNAME";

    private MigrateAuthCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.MigrateAuthActions
    public Action initiateMigrateAuthAction(@NotNull SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth) {
        Intrinsics.checkNotNullParameter(initiateMigrateAuth, "");
        Action.Companion companion = Action.Companion;
        return new MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1("InitMigrateAuth", initiateMigrateAuth);
    }
}
