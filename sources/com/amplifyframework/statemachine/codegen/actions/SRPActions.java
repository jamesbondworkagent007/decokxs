package com.amplifyframework.statemachine.codegen.actions;

import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SRPActions {
    Action initiateSRPAuthAction(@NotNull SRPEvent.EventType.InitiateSRP initiateSRP);

    Action initiateSRPWithCustomAuthAction(@NotNull SRPEvent.EventType.InitiateSRPWithCustom initiateSRPWithCustom);

    Action verifyPasswordSRPAction(@NotNull Map<String, String> map, @NotNull Map<String, String> map2, String str);
}
