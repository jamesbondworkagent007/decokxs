package com.okinc.business.dex.trade.common.reminder.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class PreCheckOrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreCheckOrderStatus[] $VALUES;
    private final int value;
    public static final PreCheckOrderStatus PRE_CHECK_NORMAL = new PreCheckOrderStatus("PRE_CHECK_NORMAL", 0, 0);
    public static final PreCheckOrderStatus PRE_CHECK_BLACK_LIST = new PreCheckOrderStatus("PRE_CHECK_BLACK_LIST", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreCheckOrderStatus[] $values() {
        return new PreCheckOrderStatus[]{PRE_CHECK_NORMAL, PRE_CHECK_BLACK_LIST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreCheckOrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PreCheckOrderStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PreCheckOrderStatus[] preCheckOrderStatusArr$values = $values();
        $VALUES = preCheckOrderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(preCheckOrderStatusArr$values);
    }

    public static PreCheckOrderStatus valueOf(String str) {
        return (PreCheckOrderStatus) Enum.valueOf(PreCheckOrderStatus.class, str);
    }

    public static PreCheckOrderStatus[] values() {
        return (PreCheckOrderStatus[]) $VALUES.clone();
    }
}
