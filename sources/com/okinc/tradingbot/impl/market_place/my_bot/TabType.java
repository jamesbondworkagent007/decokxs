package com.okinc.tradingbot.impl.market_place.my_bot;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class TabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TabType[] $VALUES;
    private final boolean supportCR;
    public static final TabType RUNNING_BOT = new TabType("RUNNING_BOT", 0, true);
    public static final TabType HISTORY_BOT = new TabType("HISTORY_BOT", 1, true);
    public static final TabType MY_SIGNAL = new TabType("MY_SIGNAL", 2, false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TabType[] $values() {
        return new TabType[]{RUNNING_BOT, HISTORY_BOT, MY_SIGNAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TabType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportCR() {
        return this.supportCR;
    }

    private TabType(String str, int i, boolean z) {
        this.supportCR = z;
    }

    static {
        TabType[] tabTypeArr$values = $values();
        $VALUES = tabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tabTypeArr$values);
    }

    public static TabType valueOf(String str) {
        return (TabType) Enum.valueOf(TabType.class, str);
    }

    public static TabType[] values() {
        return (TabType[]) $VALUES.clone();
    }
}
