package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface CustomSignInActions {
    Action initiateCustomSignInAuthAction(@NotNull CustomSignInEvent.EventType.InitiateCustomSignIn initiateCustomSignIn);
}
