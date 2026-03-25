package com.okinc.business.dexlogic.main.limmitorder.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class LimitOrderCancelStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LimitOrderCancelStatus[] $VALUES;
    public static final LimitOrderCancelStatus Cancellable = new LimitOrderCancelStatus("Cancellable", 0, 1);
    public static final LimitOrderCancelStatus NonCancellable = new LimitOrderCancelStatus("NonCancellable", 1, 0);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LimitOrderCancelStatus[] $values() {
        return new LimitOrderCancelStatus[]{Cancellable, NonCancellable};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LimitOrderCancelStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private LimitOrderCancelStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        LimitOrderCancelStatus[] limitOrderCancelStatusArr$values = $values();
        $VALUES = limitOrderCancelStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(limitOrderCancelStatusArr$values);
    }

    public static LimitOrderCancelStatus valueOf(String str) {
        return (LimitOrderCancelStatus) Enum.valueOf(LimitOrderCancelStatus.class, str);
    }

    public static LimitOrderCancelStatus[] values() {
        return (LimitOrderCancelStatus[]) $VALUES.clone();
    }
}
