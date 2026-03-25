package com.okinc.business.dexlogic.main.limmitorder.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class LimitOrderEditStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LimitOrderEditStatus[] $VALUES;
    public static final LimitOrderEditStatus Editable = new LimitOrderEditStatus("Editable", 0, 1);
    public static final LimitOrderEditStatus NonEditable = new LimitOrderEditStatus("NonEditable", 1, 0);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LimitOrderEditStatus[] $values() {
        return new LimitOrderEditStatus[]{Editable, NonEditable};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LimitOrderEditStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private LimitOrderEditStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        LimitOrderEditStatus[] limitOrderEditStatusArr$values = $values();
        $VALUES = limitOrderEditStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(limitOrderEditStatusArr$values);
    }

    public static LimitOrderEditStatus valueOf(String str) {
        return (LimitOrderEditStatus) Enum.valueOf(LimitOrderEditStatus.class, str);
    }

    public static LimitOrderEditStatus[] values() {
        return (LimitOrderEditStatus[]) $VALUES.clone();
    }
}
