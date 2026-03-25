package com.okinc.business.defi.wallet.metricsmonitor;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class AddOrRemoveType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddOrRemoveType[] $VALUES;
    public static final AddOrRemoveType ADD = new AddOrRemoveType("ADD", 0, "add");
    public static final AddOrRemoveType REMOVE = new AddOrRemoveType("REMOVE", 1, "remove");
    private final String stringValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddOrRemoveType[] $values() {
        return new AddOrRemoveType[]{ADD, REMOVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddOrRemoveType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStringValue() {
        return this.stringValue;
    }

    private AddOrRemoveType(String str, int i, String str2) {
        this.stringValue = str2;
    }

    static {
        AddOrRemoveType[] addOrRemoveTypeArr$values = $values();
        $VALUES = addOrRemoveTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addOrRemoveTypeArr$values);
    }

    public static AddOrRemoveType valueOf(String str) {
        return (AddOrRemoveType) Enum.valueOf(AddOrRemoveType.class, str);
    }

    public static AddOrRemoveType[] values() {
        return (AddOrRemoveType[]) $VALUES.clone();
    }
}
