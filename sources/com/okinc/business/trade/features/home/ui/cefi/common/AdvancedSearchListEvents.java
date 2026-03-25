package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC30619lea;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedSearchListEvents implements InterfaceC30619lea {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedSearchListEvents[] $VALUES;
    public static final AdvancedSearchListEvents All = new AdvancedSearchListEvents("All", 0, "all");
    public static final AdvancedSearchListEvents TokenSelect = new AdvancedSearchListEvents("TokenSelect", 1, "token_select");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedSearchListEvents[] $values() {
        return new AdvancedSearchListEvents[]{All, TokenSelect};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedSearchListEvents> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30619lea
    public String getValue() {
        return this.value;
    }

    private AdvancedSearchListEvents(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        AdvancedSearchListEvents[] advancedSearchListEventsArr$values = $values();
        $VALUES = advancedSearchListEventsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedSearchListEventsArr$values);
    }

    public static AdvancedSearchListEvents valueOf(String str) {
        return (AdvancedSearchListEvents) Enum.valueOf(AdvancedSearchListEvents.class, str);
    }

    public static AdvancedSearchListEvents[] values() {
        return (AdvancedSearchListEvents[]) $VALUES.clone();
    }
}
