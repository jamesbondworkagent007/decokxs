package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SheetType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SheetType[] $VALUES;
    public static final SheetType BONUS = new SheetType("BONUS", 0);
    public static final SheetType POSITION = new SheetType("POSITION", 1);
    public static final SheetType COMMON_REARDS = new SheetType("COMMON_REARDS", 2);
    public static final SheetType ALL_BONUS = new SheetType("ALL_BONUS", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SheetType[] $values() {
        return new SheetType[]{BONUS, POSITION, COMMON_REARDS, ALL_BONUS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SheetType> getEntries() {
        return $ENTRIES;
    }

    private SheetType(String str, int i) {
    }

    static {
        SheetType[] sheetTypeArr$values = $values();
        $VALUES = sheetTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sheetTypeArr$values);
    }

    public static SheetType valueOf(String str) {
        return (SheetType) Enum.valueOf(SheetType.class, str);
    }

    public static SheetType[] values() {
        return (SheetType[]) $VALUES.clone();
    }
}
