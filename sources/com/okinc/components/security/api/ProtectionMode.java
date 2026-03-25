package com.okinc.components.security.api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ProtectionMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ProtectionMode[] $VALUES;
    public static final ProtectionMode DISABLED = new ProtectionMode("DISABLED", 0);
    public static final ProtectionMode DETECTION_ONLY = new ProtectionMode("DETECTION_ONLY", 1);
    public static final ProtectionMode BLOCKING = new ProtectionMode("BLOCKING", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ProtectionMode[] $values() {
        return new ProtectionMode[]{DISABLED, DETECTION_ONLY, BLOCKING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ProtectionMode> getEntries() {
        return $ENTRIES;
    }

    private ProtectionMode(String str, int i) {
    }

    static {
        ProtectionMode[] protectionModeArr$values = $values();
        $VALUES = protectionModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(protectionModeArr$values);
    }

    public static ProtectionMode valueOf(String str) {
        return (ProtectionMode) Enum.valueOf(ProtectionMode.class, str);
    }

    public static ProtectionMode[] values() {
        return (ProtectionMode[]) $VALUES.clone();
    }
}
