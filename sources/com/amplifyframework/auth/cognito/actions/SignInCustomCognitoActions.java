package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.CustomSignInActions;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInCustomCognitoActions implements CustomSignInActions {
    public static final SignInCustomCognitoActions INSTANCE = new SignInCustomCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";
    private static final String KEY_SECRET_HASH = "SECRET_HASH";
    private static final String KEY_USERID_FOR_SRP = "USER_ID_FOR_SRP";
    private static final String KEY_USERNAME = "USERNAME";

    private SignInCustomCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.CustomSignInActions
    public Action initiateCustomSignInAuthAction(@NotNull CustomSignInEvent.EventType.InitiateCustomSignIn initiateCustomSignIn) {
        Intrinsics.checkNotNullParameter(initiateCustomSignIn, "");
        Action.Companion companion = Action.Companion;
        return new SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1("InitCustomAuth", initiateCustomSignIn);
    }
}
