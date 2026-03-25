package com.okinc.tradingbot.impl.botList.domain.model;

import o.C48033uCm;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SignalType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalType[] $VALUES;
    public static final SignalType AI_BACKTESTS = new SignalType("AI_BACKTESTS", 0, C48033uCm.Fragment.AxsJAY);
    public static final SignalType BOT_SIGNALS = new SignalType("BOT_SIGNALS", 1, C48033uCm.Fragment.zuBGHE);
    private final int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalType[] $values() {
        return new SignalType[]{AI_BACKTESTS, BOT_SIGNALS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLabel() {
        return this.label;
    }

    private SignalType(String str, int i, int i2) {
        this.label = i2;
    }

    static {
        SignalType[] signalTypeArr$values = $values();
        $VALUES = signalTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalTypeArr$values);
    }

    public static SignalType valueOf(String str) {
        return (SignalType) Enum.valueOf(SignalType.class, str);
    }

    public static SignalType[] values() {
        return (SignalType[]) $VALUES.clone();
    }
}
