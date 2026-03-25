package com.okinc.business.market.features.filter.ui.params;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TabPosition {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TabPosition[] $VALUES;
    private final int position;
    private final String tabName;
    public static final TabPosition RankTab = new TabPosition("RankTab", 0, 0, "sort");
    public static final TabPosition RangeTab = new TabPosition("RangeTab", 1, 1, "filters");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TabPosition[] $values() {
        return new TabPosition[]{RankTab, RangeTab};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TabPosition> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabName() {
        return this.tabName;
    }

    private TabPosition(String str, int i, int i2, String str2) {
        this.position = i2;
        this.tabName = str2;
    }

    static {
        TabPosition[] tabPositionArr$values = $values();
        $VALUES = tabPositionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tabPositionArr$values);
    }

    public static TabPosition valueOf(String str) {
        return (TabPosition) Enum.valueOf(TabPosition.class, str);
    }

    public static TabPosition[] values() {
        return (TabPosition[]) $VALUES.clone();
    }
}
