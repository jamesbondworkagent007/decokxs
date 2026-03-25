package com.okinc.business.dexlogic.track.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DexSwapFullClick {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexSwapFullClick[] $VALUES;
    private final String value;
    public static final DexSwapFullClick LIMIT = new DexSwapFullClick("LIMIT", 0, "limit");
    public static final DexSwapFullClick FROM_TO_REVERT = new DexSwapFullClick("FROM_TO_REVERT", 1, "from_to_revert");
    public static final DexSwapFullClick ADD_FUNDS = new DexSwapFullClick("ADD_FUNDS", 2, "add_funds");
    public static final DexSwapFullClick SELECT_FROM_TOKEN = new DexSwapFullClick("SELECT_FROM_TOKEN", 3, "select_from_token");
    public static final DexSwapFullClick SELECT_TO_TOKEN = new DexSwapFullClick("SELECT_TO_TOKEN", 4, "select_to_token");
    public static final DexSwapFullClick SELECT_FROM_CHAIN = new DexSwapFullClick("SELECT_FROM_CHAIN", 5, "select_from_chain");
    public static final DexSwapFullClick SELECT_TO_CHAIN = new DexSwapFullClick("SELECT_TO_CHAIN", 6, "select_to_chain");
    public static final DexSwapFullClick VALUE_DIFFERENCE = new DexSwapFullClick("VALUE_DIFFERENCE", 7, "value_difference");
    public static final DexSwapFullClick TOOLTIP_SLIPPAGE = new DexSwapFullClick("TOOLTIP_SLIPPAGE", 8, "tooltip_slippage");
    public static final DexSwapFullClick TOOLTIP_RATE = new DexSwapFullClick("TOOLTIP_RATE", 9, "tooltip_rate");
    public static final DexSwapFullClick TOOLTIP_XROUTING = new DexSwapFullClick("TOOLTIP_XROUTING", 10, "tooltip_xrouting");
    public static final DexSwapFullClick TOOLTIP_YOU_SAVE = new DexSwapFullClick("TOOLTIP_YOU_SAVE", 11, "tooltip_yousave");
    public static final DexSwapFullClick YOU_SAVE = new DexSwapFullClick("YOU_SAVE", 12, "yousave");
    public static final DexSwapFullClick SLIPPAGE = new DexSwapFullClick("SLIPPAGE", 13, "slippage");
    public static final DexSwapFullClick MORE = new DexSwapFullClick("MORE", 14, "more");
    public static final DexSwapFullClick ORDER_HISTORY = new DexSwapFullClick("ORDER_HISTORY", 15, "order_history");
    public static final DexSwapFullClick LIQUIDITY_SOURCES = new DexSwapFullClick("LIQUIDITY_SOURCES", 16, "liquidity_sources");
    public static final DexSwapFullClick FAQ = new DexSwapFullClick("FAQ", 17, "faq");
    public static final DexSwapFullClick RATE = new DexSwapFullClick("RATE", 18, "rate");
    public static final DexSwapFullClick MAX = new DexSwapFullClick("MAX", 19, "max");
    public static final DexSwapFullClick MODIFY_FROM_AMOUNT = new DexSwapFullClick("MODIFY_FROM_AMOUNT", 20, "modify_from_amount");
    public static final DexSwapFullClick MODIFY_TO_AMOUNT = new DexSwapFullClick("MODIFY_TO_AMOUNT", 21, "modify_to_amount");
    public static final DexSwapFullClick PROVIDERLIST = new DexSwapFullClick("PROVIDERLIST", 22, "providerlist");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexSwapFullClick[] $values() {
        return new DexSwapFullClick[]{LIMIT, FROM_TO_REVERT, ADD_FUNDS, SELECT_FROM_TOKEN, SELECT_TO_TOKEN, SELECT_FROM_CHAIN, SELECT_TO_CHAIN, VALUE_DIFFERENCE, TOOLTIP_SLIPPAGE, TOOLTIP_RATE, TOOLTIP_XROUTING, TOOLTIP_YOU_SAVE, YOU_SAVE, SLIPPAGE, MORE, ORDER_HISTORY, LIQUIDITY_SOURCES, FAQ, RATE, MAX, MODIFY_FROM_AMOUNT, MODIFY_TO_AMOUNT, PROVIDERLIST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexSwapFullClick> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private DexSwapFullClick(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        DexSwapFullClick[] dexSwapFullClickArr$values = $values();
        $VALUES = dexSwapFullClickArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexSwapFullClickArr$values);
    }

    public static DexSwapFullClick valueOf(String str) {
        return (DexSwapFullClick) Enum.valueOf(DexSwapFullClick.class, str);
    }

    public static DexSwapFullClick[] values() {
        return (DexSwapFullClick[]) $VALUES.clone();
    }
}
