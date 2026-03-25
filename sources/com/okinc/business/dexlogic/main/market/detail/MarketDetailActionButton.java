package com.okinc.business.dexlogic.main.market.detail;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class MarketDetailActionButton {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketDetailActionButton[] $VALUES;
    public static final MarketDetailActionButton OnlySwap = new MarketDetailActionButton("OnlySwap", 0);
    public static final MarketDetailActionButton OnlyDAppRedirect = new MarketDetailActionButton("OnlyDAppRedirect", 1);
    public static final MarketDetailActionButton None = new MarketDetailActionButton("None", 2);
    public static final MarketDetailActionButton OnlyMeme = new MarketDetailActionButton("OnlyMeme", 3);
    public static final MarketDetailActionButton SwapAndMeme = new MarketDetailActionButton("SwapAndMeme", 4);
    public static final MarketDetailActionButton SwapAdvancedMeme = new MarketDetailActionButton("SwapAdvancedMeme", 5);
    public static final MarketDetailActionButton DAppRedDirectAndMeme = new MarketDetailActionButton("DAppRedDirectAndMeme", 6);
    public static final MarketDetailActionButton SwapAdvanced = new MarketDetailActionButton("SwapAdvanced", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketDetailActionButton[] $values() {
        return new MarketDetailActionButton[]{OnlySwap, OnlyDAppRedirect, None, OnlyMeme, SwapAndMeme, SwapAdvancedMeme, DAppRedDirectAndMeme, SwapAdvanced};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketDetailActionButton> getEntries() {
        return $ENTRIES;
    }

    private MarketDetailActionButton(String str, int i) {
    }

    static {
        MarketDetailActionButton[] marketDetailActionButtonArr$values = $values();
        $VALUES = marketDetailActionButtonArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketDetailActionButtonArr$values);
    }

    public static MarketDetailActionButton valueOf(String str) {
        return (MarketDetailActionButton) Enum.valueOf(MarketDetailActionButton.class, str);
    }

    public static MarketDetailActionButton[] values() {
        return (MarketDetailActionButton[]) $VALUES.clone();
    }
}
