package com.okinc.business.market.features.module.domain.type;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ModuleCategoryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ModuleCategoryType[] $VALUES;
    public static final ModuleCategoryType MEME_FUN = new ModuleCategoryType("MEME_FUN", 0);
    public static final ModuleCategoryType GENERAL = new ModuleCategoryType("GENERAL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ModuleCategoryType[] $values() {
        return new ModuleCategoryType[]{MEME_FUN, GENERAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ModuleCategoryType> getEntries() {
        return $ENTRIES;
    }

    private ModuleCategoryType(String str, int i) {
    }

    static {
        ModuleCategoryType[] moduleCategoryTypeArr$values = $values();
        $VALUES = moduleCategoryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(moduleCategoryTypeArr$values);
    }

    public static ModuleCategoryType valueOf(String str) {
        return (ModuleCategoryType) Enum.valueOf(ModuleCategoryType.class, str);
    }

    public static ModuleCategoryType[] values() {
        return (ModuleCategoryType[]) $VALUES.clone();
    }
}
