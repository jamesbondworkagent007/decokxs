package com.okinc.unify_trade.trade.core.config;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TradeSubsystem {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeSubsystem[] $VALUES;
    public static final TradeSubsystem CORE_TRADE = new TradeSubsystem("CORE_TRADE", 0);
    public static final TradeSubsystem DEX_TRADE = new TradeSubsystem("DEX_TRADE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeSubsystem[] $values() {
        return new TradeSubsystem[]{CORE_TRADE, DEX_TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeSubsystem> getEntries() {
        return $ENTRIES;
    }

    private TradeSubsystem(String str, int i) {
    }

    static {
        TradeSubsystem[] tradeSubsystemArr$values = $values();
        $VALUES = tradeSubsystemArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeSubsystemArr$values);
    }

    public static TradeSubsystem valueOf(String str) {
        return (TradeSubsystem) Enum.valueOf(TradeSubsystem.class, str);
    }

    public static TradeSubsystem[] values() {
        return (TradeSubsystem[]) $VALUES.clone();
    }
}
