package com.okinc.okimcore.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SetGroupRolesKeys {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SetGroupRolesKeys[] $VALUES;
    public static final SetGroupRolesKeys Admin = new SetGroupRolesKeys("Admin", 0, 1);
    public static final SetGroupRolesKeys Normal = new SetGroupRolesKeys("Normal", 1, 2);
    private final long value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SetGroupRolesKeys[] $values() {
        return new SetGroupRolesKeys[]{Admin, Normal};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SetGroupRolesKeys> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getValue() {
        return this.value;
    }

    private SetGroupRolesKeys(String str, int i, long j) {
        this.value = j;
    }

    static {
        SetGroupRolesKeys[] setGroupRolesKeysArr$values = $values();
        $VALUES = setGroupRolesKeysArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(setGroupRolesKeysArr$values);
    }

    public static SetGroupRolesKeys valueOf(String str) {
        return (SetGroupRolesKeys) Enum.valueOf(SetGroupRolesKeys.class, str);
    }

    public static SetGroupRolesKeys[] values() {
        return (SetGroupRolesKeys[]) $VALUES.clone();
    }
}
