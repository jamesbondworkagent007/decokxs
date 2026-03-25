package com.okinc.lib.monitor;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class FragmentLifecycleState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FragmentLifecycleState[] $VALUES;
    private final String state;
    public static final FragmentLifecycleState ATTACHED = new FragmentLifecycleState("ATTACHED", 0, "attached");
    public static final FragmentLifecycleState SAVE_INSTANCE_STATE = new FragmentLifecycleState("SAVE_INSTANCE_STATE", 1, "save instance state");
    public static final FragmentLifecycleState CREATED = new FragmentLifecycleState(DebugCoroutineInfoImplKt.CREATED, 2, "created");
    public static final FragmentLifecycleState VIEW_CREATED = new FragmentLifecycleState("VIEW_CREATED", 3, "view created");
    public static final FragmentLifecycleState STARTED = new FragmentLifecycleState("STARTED", 4, "started");
    public static final FragmentLifecycleState RESUMED = new FragmentLifecycleState("RESUMED", 5, "resumed");
    public static final FragmentLifecycleState PAUSED = new FragmentLifecycleState("PAUSED", 6, "paused");
    public static final FragmentLifecycleState STOPPED = new FragmentLifecycleState("STOPPED", 7, "stopped");
    public static final FragmentLifecycleState VIEW_DESTROYED = new FragmentLifecycleState("VIEW_DESTROYED", 8, "view destroyed");
    public static final FragmentLifecycleState DESTROYED = new FragmentLifecycleState("DESTROYED", 9, "destroyed");
    public static final FragmentLifecycleState DETACHED = new FragmentLifecycleState("DETACHED", 10, "detached");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FragmentLifecycleState[] $values() {
        return new FragmentLifecycleState[]{ATTACHED, SAVE_INSTANCE_STATE, CREATED, VIEW_CREATED, STARTED, RESUMED, PAUSED, STOPPED, VIEW_DESTROYED, DESTROYED, DETACHED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FragmentLifecycleState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState$OKAPM_monitor() {
        return this.state;
    }

    private FragmentLifecycleState(String str, int i, String str2) {
        this.state = str2;
    }

    static {
        FragmentLifecycleState[] fragmentLifecycleStateArr$values = $values();
        $VALUES = fragmentLifecycleStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fragmentLifecycleStateArr$values);
    }

    public static FragmentLifecycleState valueOf(String str) {
        return (FragmentLifecycleState) Enum.valueOf(FragmentLifecycleState.class, str);
    }

    public static FragmentLifecycleState[] values() {
        return (FragmentLifecycleState[]) $VALUES.clone();
    }
}
