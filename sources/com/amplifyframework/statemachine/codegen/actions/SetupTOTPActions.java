package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SetupTOTPActions {
    Action initiateTOTPSetup(@NotNull SetupTOTPEvent.EventType.SetupTOTP setupTOTP);

    Action respondToAuthChallenge(@NotNull SetupTOTPEvent.EventType.RespondToAuthChallenge respondToAuthChallenge);

    Action verifyChallengeAnswer(@NotNull SetupTOTPEvent.EventType.VerifyChallengeAnswer verifyChallengeAnswer);
}
