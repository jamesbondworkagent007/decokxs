package com.okinc.business.dex.trade.common.reminder.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class PreCheckOrderWarning {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreCheckOrderWarning[] $VALUES;
    private final int type;
    public static final PreCheckOrderWarning PRE_CHECK_TYPE_NONE = new PreCheckOrderWarning("PRE_CHECK_TYPE_NONE", 0, -1);
    public static final PreCheckOrderWarning PRE_CHECK_TYPE_WARNING = new PreCheckOrderWarning("PRE_CHECK_TYPE_WARNING", 1, 1);
    public static final PreCheckOrderWarning PRE_CHECK_TYPE_ERROR = new PreCheckOrderWarning("PRE_CHECK_TYPE_ERROR", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreCheckOrderWarning[] $values() {
        return new PreCheckOrderWarning[]{PRE_CHECK_TYPE_NONE, PRE_CHECK_TYPE_WARNING, PRE_CHECK_TYPE_ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreCheckOrderWarning> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private PreCheckOrderWarning(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        PreCheckOrderWarning[] preCheckOrderWarningArr$values = $values();
        $VALUES = preCheckOrderWarningArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(preCheckOrderWarningArr$values);
    }

    public static PreCheckOrderWarning valueOf(String str) {
        return (PreCheckOrderWarning) Enum.valueOf(PreCheckOrderWarning.class, str);
    }

    public static PreCheckOrderWarning[] values() {
        return (PreCheckOrderWarning[]) $VALUES.clone();
    }
}
