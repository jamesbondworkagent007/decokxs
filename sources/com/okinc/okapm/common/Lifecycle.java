package com.okinc.okapm.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Lifecycle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Lifecycle[] $VALUES;
    public static final Lifecycle Background = new Lifecycle("Background", 0);
    public static final Lifecycle Foreground = new Lifecycle("Foreground", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Lifecycle[] $values() {
        return new Lifecycle[]{Background, Foreground};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Lifecycle> getEntries() {
        return $ENTRIES;
    }

    static {
        Lifecycle[] lifecycleArr$values = $values();
        $VALUES = lifecycleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(lifecycleArr$values);
    }

    private Lifecycle(String str, int i) {
    }

    public static Lifecycle valueOf(String str) {
        return (Lifecycle) Enum.valueOf(Lifecycle.class, str);
    }

    public static Lifecycle[] values() {
        return (Lifecycle[]) $VALUES.clone();
    }
}
