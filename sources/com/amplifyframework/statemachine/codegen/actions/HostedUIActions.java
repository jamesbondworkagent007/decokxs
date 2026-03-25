package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.HostedUIEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface HostedUIActions {
    Action fetchHostedUISignInToken(@NotNull HostedUIEvent.EventType.FetchToken fetchToken, String str);

    Action showHostedUI(@NotNull HostedUIEvent.EventType.ShowHostedUI showHostedUI);
}
