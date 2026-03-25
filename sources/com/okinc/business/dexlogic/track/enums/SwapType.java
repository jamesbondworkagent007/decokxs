package com.okinc.business.dexlogic.track.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class SwapType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SwapType[] $VALUES;
    private final String value;
    public static final SwapType SWAP = new SwapType("SWAP", 0, "swap");
    public static final SwapType CROSS_CHAIN_SWAP = new SwapType("CROSS_CHAIN_SWAP", 1, "cross_chain_swap");
    public static final SwapType DISCOVER_SWAP = new SwapType("DISCOVER_SWAP", 2, "discover_swap");
    public static final SwapType DISCOVER_CROSS_CHAIN_SWAP = new SwapType("DISCOVER_CROSS_CHAIN_SWAP", 3, "discover_cross_chain_swap");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SwapType[] $values() {
        return new SwapType[]{SWAP, CROSS_CHAIN_SWAP, DISCOVER_SWAP, DISCOVER_CROSS_CHAIN_SWAP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SwapType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private SwapType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        SwapType[] swapTypeArr$values = $values();
        $VALUES = swapTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(swapTypeArr$values);
    }

    public static SwapType valueOf(String str) {
        return (SwapType) Enum.valueOf(SwapType.class, str);
    }

    public static SwapType[] values() {
        return (SwapType[]) $VALUES.clone();
    }
}
