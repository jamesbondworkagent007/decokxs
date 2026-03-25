package com.okinc.tradingbot.impl.nmp.my_bot.presenter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class NmpTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NmpTabType[] $VALUES;
    public static final NmpTabType RUNNING_BOT = new NmpTabType("RUNNING_BOT", 0);
    public static final NmpTabType HISTORY_BOT = new NmpTabType("HISTORY_BOT", 1);
    public static final NmpTabType MY_SIGNAL = new NmpTabType("MY_SIGNAL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NmpTabType[] $values() {
        return new NmpTabType[]{RUNNING_BOT, HISTORY_BOT, MY_SIGNAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NmpTabType> getEntries() {
        return $ENTRIES;
    }

    static {
        NmpTabType[] nmpTabTypeArr$values = $values();
        $VALUES = nmpTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(nmpTabTypeArr$values);
    }

    private NmpTabType(String str, int i) {
    }

    public static NmpTabType valueOf(String str) {
        return (NmpTabType) Enum.valueOf(NmpTabType.class, str);
    }

    public static NmpTabType[] values() {
        return (NmpTabType[]) $VALUES.clone();
    }
}
