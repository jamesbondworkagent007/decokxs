package com.okinc.liveness.lca.manager;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class TimeoutType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TimeoutType[] $VALUES;
    public static final TimeoutType LIVENESS_TIMEOUT_TYPE = new TimeoutType("LIVENESS_TIMEOUT_TYPE", 0);
    public static final TimeoutType FLASH_TIMEOUT_TYPE = new TimeoutType("FLASH_TIMEOUT_TYPE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TimeoutType[] $values() {
        return new TimeoutType[]{LIVENESS_TIMEOUT_TYPE, FLASH_TIMEOUT_TYPE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TimeoutType> getEntries() {
        return $ENTRIES;
    }

    private TimeoutType(String str, int i) {
    }

    static {
        TimeoutType[] timeoutTypeArr$values = $values();
        $VALUES = timeoutTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(timeoutTypeArr$values);
    }

    public static TimeoutType valueOf(String str) {
        return (TimeoutType) Enum.valueOf(TimeoutType.class, str);
    }

    public static TimeoutType[] values() {
        return (TimeoutType[]) $VALUES.clone();
    }
}
