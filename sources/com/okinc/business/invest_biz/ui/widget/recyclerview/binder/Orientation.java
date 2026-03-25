package com.okinc.business.invest_biz.ui.widget.recyclerview.binder;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class Orientation {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL", 0);
    public static final Orientation VERTICAL = new Orientation("VERTICAL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Orientation[] $values() {
        return new Orientation[]{HORIZONTAL, VERTICAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Orientation> getEntries() {
        return $ENTRIES;
    }

    private Orientation(String str, int i) {
    }

    static {
        Orientation[] orientationArr$values = $values();
        $VALUES = orientationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orientationArr$values);
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
