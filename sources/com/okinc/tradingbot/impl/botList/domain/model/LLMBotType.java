package com.okinc.tradingbot.impl.botList.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class LLMBotType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LLMBotType[] $VALUES;
    public static final LLMBotType LLM = new LLMBotType("LLM", 0);
    public static final LLMBotType Backtest = new LLMBotType("Backtest", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LLMBotType[] $values() {
        return new LLMBotType[]{LLM, Backtest};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LLMBotType> getEntries() {
        return $ENTRIES;
    }

    private LLMBotType(String str, int i) {
    }

    static {
        LLMBotType[] lLMBotTypeArr$values = $values();
        $VALUES = lLMBotTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(lLMBotTypeArr$values);
    }

    public static LLMBotType valueOf(String str) {
        return (LLMBotType) Enum.valueOf(LLMBotType.class, str);
    }

    public static LLMBotType[] values() {
        return (LLMBotType[]) $VALUES.clone();
    }
}
