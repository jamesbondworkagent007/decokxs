package com.okinc.okimcore.model.im;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class OKGetMessageDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKGetMessageDirection[] $VALUES;
    public static final OKGetMessageDirection BEHIND = new OKGetMessageDirection("BEHIND", 0, 0);
    public static final OKGetMessageDirection FRONT = new OKGetMessageDirection("FRONT", 1, 1);
    private int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKGetMessageDirection[] $values() {
        return new OKGetMessageDirection[]{BEHIND, FRONT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKGetMessageDirection> getEntries() {
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

    private OKGetMessageDirection(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        OKGetMessageDirection[] oKGetMessageDirectionArr$values = $values();
        $VALUES = oKGetMessageDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKGetMessageDirectionArr$values);
    }

    public static OKGetMessageDirection valueOf(String str) {
        return (OKGetMessageDirection) Enum.valueOf(OKGetMessageDirection.class, str);
    }

    public static OKGetMessageDirection[] values() {
        return (OKGetMessageDirection[]) $VALUES.clone();
    }
}
