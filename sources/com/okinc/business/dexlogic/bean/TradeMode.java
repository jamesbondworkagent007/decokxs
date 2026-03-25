package com.okinc.business.dexlogic.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TradeMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeMode[] $VALUES;
    private final int type;
    public static final TradeMode SimpleBuyMode = new TradeMode("SimpleBuyMode", 0, 0);
    public static final TradeMode SimpleSellMode = new TradeMode("SimpleSellMode", 1, 1);
    public static final TradeMode SwapMode = new TradeMode("SwapMode", 2, 2);
    public static final TradeMode AdvancedMode = new TradeMode("AdvancedMode", 3, 3);
    public static final TradeMode MemeMode = new TradeMode("MemeMode", 4, 4);
    public static final TradeMode QuickMode = new TradeMode("QuickMode", 5, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeMode[] $values() {
        return new TradeMode[]{SimpleBuyMode, SimpleSellMode, SwapMode, AdvancedMode, MemeMode, QuickMode};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private TradeMode(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        TradeMode[] tradeModeArr$values = $values();
        $VALUES = tradeModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeModeArr$values);
    }

    public static TradeMode valueOf(String str) {
        return (TradeMode) Enum.valueOf(TradeMode.class, str);
    }

    public static TradeMode[] values() {
        return (TradeMode[]) $VALUES.clone();
    }
}
