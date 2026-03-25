package com.okinc.business.market.features.scanner.surge.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
final class DragDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DragDirection[] $VALUES;
    public static final DragDirection Undecided = new DragDirection("Undecided", 0);
    public static final DragDirection Horizontal = new DragDirection("Horizontal", 1);
    public static final DragDirection Vertical = new DragDirection("Vertical", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DragDirection[] $values() {
        return new DragDirection[]{Undecided, Horizontal, Vertical};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DragDirection> getEntries() {
        return $ENTRIES;
    }

    static {
        DragDirection[] dragDirectionArr$values = $values();
        $VALUES = dragDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dragDirectionArr$values);
    }

    private DragDirection(String str, int i) {
    }

    public static DragDirection valueOf(String str) {
        return (DragDirection) Enum.valueOf(DragDirection.class, str);
    }

    public static DragDirection[] values() {
        return (DragDirection[]) $VALUES.clone();
    }
}
