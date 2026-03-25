package com.okinc.okex.center.ui.displaymodels;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class Sign {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Sign[] $VALUES;
    public static final Sign Negative = new Sign("Negative", 0, -1);
    public static final Sign NoSign = new Sign("NoSign", 1, 0);
    public static final Sign Positive = new Sign("Positive", 2, 1);
    private int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Sign[] $values() {
        return new Sign[]{Negative, NoSign, Positive};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Sign> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(int i) {
        this.value = i;
    }

    private Sign(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        Sign[] signArr$values = $values();
        $VALUES = signArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signArr$values);
    }

    public static Sign valueOf(String str) {
        return (Sign) Enum.valueOf(Sign.class, str);
    }

    public static Sign[] values() {
        return (Sign[]) $VALUES.clone();
    }
}
