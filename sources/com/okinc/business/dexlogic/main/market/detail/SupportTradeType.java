package com.okinc.business.dexlogic.main.market.detail;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SupportTradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SupportTradeType[] $VALUES;
    public static final SupportTradeType OnlySwap = new SupportTradeType("OnlySwap", 0);
    public static final SupportTradeType OnlyMeme = new SupportTradeType("OnlyMeme", 1);
    public static final SupportTradeType SwapAndMeme = new SupportTradeType("SwapAndMeme", 2);
    public static final SupportTradeType SwapAdvancedMeme = new SupportTradeType("SwapAdvancedMeme", 3);
    public static final SupportTradeType SwapAndAdvanced = new SupportTradeType("SwapAndAdvanced", 4);
    public static final SupportTradeType DAppRedDirectAndMeme = new SupportTradeType("DAppRedDirectAndMeme", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SupportTradeType[] $values() {
        return new SupportTradeType[]{OnlySwap, OnlyMeme, SwapAndMeme, SwapAdvancedMeme, SwapAndAdvanced, DAppRedDirectAndMeme};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SupportTradeType> getEntries() {
        return $ENTRIES;
    }

    private SupportTradeType(String str, int i) {
    }

    static {
        SupportTradeType[] supportTradeTypeArr$values = $values();
        $VALUES = supportTradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(supportTradeTypeArr$values);
    }

    public static SupportTradeType valueOf(String str) {
        return (SupportTradeType) Enum.valueOf(SupportTradeType.class, str);
    }

    public static SupportTradeType[] values() {
        return (SupportTradeType[]) $VALUES.clone();
    }
}
