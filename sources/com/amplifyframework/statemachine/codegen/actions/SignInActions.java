package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SignInActions {
    Action confirmDevice(@NotNull SignInEvent.EventType.ConfirmDevice confirmDevice);

    Action initResolveChallenge(@NotNull SignInEvent.EventType.ReceivedChallenge receivedChallenge);

    Action initiateTOTPSetupAction(@NotNull SignInEvent.EventType.InitiateTOTPSetup initiateTOTPSetup);

    Action startCustomAuthAction(@NotNull SignInEvent.EventType.InitiateSignInWithCustom initiateSignInWithCustom);

    Action startCustomAuthWithSRPAction(@NotNull SignInEvent.EventType.InitiateCustomSignInWithSRP initiateCustomSignInWithSRP);

    Action startDeviceSRPAuthAction(@NotNull SignInEvent.EventType.InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP);

    Action startHostedUIAuthAction(@NotNull SignInEvent.EventType.InitiateHostedUISignIn initiateHostedUISignIn);

    Action startMigrationAuthAction(@NotNull SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth);

    Action startSRPAuthAction(@NotNull SignInEvent.EventType.InitiateSignInWithSRP initiateSignInWithSRP);
}
