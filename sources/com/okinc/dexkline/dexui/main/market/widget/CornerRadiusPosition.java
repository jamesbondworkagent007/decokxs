package com.okinc.dexkline.dexui.main.market.widget;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class CornerRadiusPosition {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CornerRadiusPosition[] $VALUES;
    public static final CornerRadiusPosition START = new CornerRadiusPosition("START", 0);
    public static final CornerRadiusPosition END = new CornerRadiusPosition("END", 1);
    public static final CornerRadiusPosition DEFAULT = new CornerRadiusPosition("DEFAULT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CornerRadiusPosition[] $values() {
        return new CornerRadiusPosition[]{START, END, DEFAULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CornerRadiusPosition> getEntries() {
        return $ENTRIES;
    }

    private CornerRadiusPosition(String str, int i) {
    }

    static {
        CornerRadiusPosition[] cornerRadiusPositionArr$values = $values();
        $VALUES = cornerRadiusPositionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cornerRadiusPositionArr$values);
    }

    public static CornerRadiusPosition valueOf(String str) {
        return (CornerRadiusPosition) Enum.valueOf(CornerRadiusPosition.class, str);
    }

    public static CornerRadiusPosition[] values() {
        return (CornerRadiusPosition[]) $VALUES.clone();
    }
}
