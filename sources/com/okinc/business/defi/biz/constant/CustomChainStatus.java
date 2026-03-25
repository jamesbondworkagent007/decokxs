package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CustomChainStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CustomChainStatus[] $VALUES;
    private final int value;
    public static final CustomChainStatus NotEdit = new CustomChainStatus("NotEdit", 0, 0);
    public static final CustomChainStatus Edit = new CustomChainStatus("Edit", 1, 1);
    public static final CustomChainStatus Delete = new CustomChainStatus("Delete", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CustomChainStatus[] $values() {
        return new CustomChainStatus[]{NotEdit, Edit, Delete};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CustomChainStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private CustomChainStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        CustomChainStatus[] customChainStatusArr$values = $values();
        $VALUES = customChainStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(customChainStatusArr$values);
    }

    public static CustomChainStatus valueOf(String str) {
        return (CustomChainStatus) Enum.valueOf(CustomChainStatus.class, str);
    }

    public static CustomChainStatus[] values() {
        return (CustomChainStatus[]) $VALUES.clone();
    }
}
