package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SetupTOTPCognitoActions implements SetupTOTPActions {
    public static final SetupTOTPCognitoActions INSTANCE = new SetupTOTPCognitoActions();
    private static final String KEY_DEVICE_KEY = "DEVICE_KEY";

    private SetupTOTPCognitoActions() {
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action initiateTOTPSetup(@NotNull SetupTOTPEvent.EventType.SetupTOTP setupTOTP) {
        Intrinsics.checkNotNullParameter(setupTOTP, "");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$initiateTOTPSetup$$inlined$invoke$1("InitiateTOTPSetup", setupTOTP);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action verifyChallengeAnswer(@NotNull SetupTOTPEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer) {
        Intrinsics.checkNotNullParameter(verifyChallengeAnswer, "");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$verifyChallengeAnswer$$inlined$invoke$1("verifyChallengeAnswer", verifyChallengeAnswer);
    }

    @Override // com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions
    public Action respondToAuthChallenge(@NotNull SetupTOTPEvent.EventType.RespondToAuthChallenge respondToAuthChallenge) {
        Intrinsics.checkNotNullParameter(respondToAuthChallenge, "");
        Action.Companion companion = Action.Companion;
        return new SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1("RespondToAuthChallenge", respondToAuthChallenge);
    }
}
