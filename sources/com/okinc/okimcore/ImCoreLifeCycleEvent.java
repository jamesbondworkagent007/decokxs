package com.okinc.okimcore;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ImCoreLifeCycleEvent {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ImCoreLifeCycleEvent[] $VALUES;
    public static final ImCoreLifeCycleEvent Login = new ImCoreLifeCycleEvent("Login", 0);
    public static final ImCoreLifeCycleEvent Logout = new ImCoreLifeCycleEvent("Logout", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ImCoreLifeCycleEvent[] $values() {
        return new ImCoreLifeCycleEvent[]{Login, Logout};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ImCoreLifeCycleEvent> getEntries() {
        return $ENTRIES;
    }

    private ImCoreLifeCycleEvent(String str, int i) {
    }

    static {
        ImCoreLifeCycleEvent[] imCoreLifeCycleEventArr$values = $values();
        $VALUES = imCoreLifeCycleEventArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(imCoreLifeCycleEventArr$values);
    }

    public static ImCoreLifeCycleEvent valueOf(String str) {
        return (ImCoreLifeCycleEvent) Enum.valueOf(ImCoreLifeCycleEvent.class, str);
    }

    public static ImCoreLifeCycleEvent[] values() {
        return (ImCoreLifeCycleEvent[]) $VALUES.clone();
    }
}
