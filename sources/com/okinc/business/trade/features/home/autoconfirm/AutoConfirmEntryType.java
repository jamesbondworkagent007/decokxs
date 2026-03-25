package com.okinc.business.trade.features.home.autoconfirm;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AutoConfirmEntryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AutoConfirmEntryType[] $VALUES;
    public static final AutoConfirmEntryType MARKET = new AutoConfirmEntryType("MARKET", 0);
    public static final AutoConfirmEntryType STRATEGY = new AutoConfirmEntryType("STRATEGY", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AutoConfirmEntryType[] $values() {
        return new AutoConfirmEntryType[]{MARKET, STRATEGY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AutoConfirmEntryType> getEntries() {
        return $ENTRIES;
    }

    private AutoConfirmEntryType(String str, int i) {
    }

    static {
        AutoConfirmEntryType[] autoConfirmEntryTypeArr$values = $values();
        $VALUES = autoConfirmEntryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(autoConfirmEntryTypeArr$values);
    }

    public static AutoConfirmEntryType valueOf(String str) {
        return (AutoConfirmEntryType) Enum.valueOf(AutoConfirmEntryType.class, str);
    }

    public static AutoConfirmEntryType[] values() {
        return (AutoConfirmEntryType[]) $VALUES.clone();
    }
}
