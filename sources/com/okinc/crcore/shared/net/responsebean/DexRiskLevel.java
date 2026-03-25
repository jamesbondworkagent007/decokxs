package com.okinc.crcore.shared.net.responsebean;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class DexRiskLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexRiskLevel[] $VALUES;
    private final String value;
    public static final DexRiskLevel LEVEL_ONE = new DexRiskLevel("LEVEL_ONE", 0, "1");
    public static final DexRiskLevel LEVEL_TWO = new DexRiskLevel("LEVEL_TWO", 1, "2");
    public static final DexRiskLevel LEVEL_THREE = new DexRiskLevel("LEVEL_THREE", 2, "3");
    public static final DexRiskLevel LEVEL_FOUR = new DexRiskLevel("LEVEL_FOUR", 3, "4");
    public static final DexRiskLevel LEVEL_FIVE = new DexRiskLevel("LEVEL_FIVE", 4, "5");
    public static final DexRiskLevel LEVEL_SIX = new DexRiskLevel("LEVEL_SIX", 5, OrderDetailListItem.SLIP_OUT);
    public static final DexRiskLevel LEVEL_SEVEN = new DexRiskLevel("LEVEL_SEVEN", 6, "7");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexRiskLevel[] $values() {
        return new DexRiskLevel[]{LEVEL_ONE, LEVEL_TWO, LEVEL_THREE, LEVEL_FOUR, LEVEL_FIVE, LEVEL_SIX, LEVEL_SEVEN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexRiskLevel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private DexRiskLevel(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        DexRiskLevel[] dexRiskLevelArr$values = $values();
        $VALUES = dexRiskLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexRiskLevelArr$values);
    }

    public final boolean isTradeable() {
        return Integer.parseInt(this.value) <= 4;
    }

    public static DexRiskLevel valueOf(String str) {
        return (DexRiskLevel) Enum.valueOf(DexRiskLevel.class, str);
    }

    public static DexRiskLevel[] values() {
        return (DexRiskLevel[]) $VALUES.clone();
    }
}
