package com.okinc.kline.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class EntryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EntryType[] $VALUES;
    public static final EntryType PRO_PORTRAIT = new EntryType("PRO_PORTRAIT", 0);
    public static final EntryType PRO_PORTRAIT_TV = new EntryType("PRO_PORTRAIT_TV", 1);
    public static final EntryType PRO_FULL_SCREEN = new EntryType("PRO_FULL_SCREEN", 2);
    public static final EntryType PRO_LANDSCAPE = new EntryType("PRO_LANDSCAPE", 3);
    public static final EntryType PRO_FORMULA = new EntryType("PRO_FORMULA", 4);
    public static final EntryType LITE_PORTRAIT = new EntryType("LITE_PORTRAIT", 5);
    public static final EntryType LITE_LANDSCAPE = new EntryType("LITE_LANDSCAPE", 6);
    public static final EntryType CEDEFI_DEX = new EntryType("CEDEFI_DEX", 7);
    public static final EntryType OTHERS = new EntryType("OTHERS", 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EntryType[] $values() {
        return new EntryType[]{PRO_PORTRAIT, PRO_PORTRAIT_TV, PRO_FULL_SCREEN, PRO_LANDSCAPE, PRO_FORMULA, LITE_PORTRAIT, LITE_LANDSCAPE, CEDEFI_DEX, OTHERS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EntryType> getEntries() {
        return $ENTRIES;
    }

    private EntryType(String str, int i) {
    }

    static {
        EntryType[] entryTypeArr$values = $values();
        $VALUES = entryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(entryTypeArr$values);
    }

    public static EntryType valueOf(String str) {
        return (EntryType) Enum.valueOf(EntryType.class, str);
    }

    public static EntryType[] values() {
        return (EntryType[]) $VALUES.clone();
    }
}
