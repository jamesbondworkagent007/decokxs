package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface DeviceSRPSignInActions {
    Action respondDevicePasswordVerifier(@NotNull DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier respondDevicePasswordVerifier);

    Action respondDeviceSRP(@NotNull DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge respondDeviceSRPChallenge);
}
