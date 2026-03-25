package com.okinc.okimcore.model.im;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ChangeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChangeType[] $VALUES;
    public static final ChangeType NONE = new ChangeType("NONE", 0);
    public static final ChangeType ENABLE = new ChangeType("ENABLE", 1);
    public static final ChangeType DISABLE = new ChangeType("DISABLE", 2);
    public static final ChangeType UPDATE = new ChangeType("UPDATE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChangeType[] $values() {
        return new ChangeType[]{NONE, ENABLE, DISABLE, UPDATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChangeType> getEntries() {
        return $ENTRIES;
    }

    private ChangeType(String str, int i) {
    }

    static {
        ChangeType[] changeTypeArr$values = $values();
        $VALUES = changeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(changeTypeArr$values);
    }

    public static ChangeType valueOf(String str) {
        return (ChangeType) Enum.valueOf(ChangeType.class, str);
    }

    public static ChangeType[] values() {
        return (ChangeType[]) $VALUES.clone();
    }
}
