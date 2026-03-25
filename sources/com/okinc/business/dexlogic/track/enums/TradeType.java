package com.okinc.business.dexlogic.track.enums;

import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeType[] $VALUES;
    private final String value;
    public static final TradeType SWAP = new TradeType("SWAP", 0, "Swap");
    public static final TradeType BRIDGE = new TradeType("BRIDGE", 1, TabTitleInfo.KEY_BRIDGE);
    public static final TradeType MEME = new TradeType("MEME", 2, TabTitleInfo.KEY_MEME);
    public static final TradeType ADVANCED = new TradeType("ADVANCED", 3, "advanced");
    public static final TradeType DAPP = new TradeType("DAPP", 4, "dapp");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeType[] $values() {
        return new TradeType[]{SWAP, BRIDGE, MEME, ADVANCED, DAPP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private TradeType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TradeType[] tradeTypeArr$values = $values();
        $VALUES = tradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeTypeArr$values);
    }

    public static TradeType valueOf(String str) {
        return (TradeType) Enum.valueOf(TradeType.class, str);
    }

    public static TradeType[] values() {
        return (TradeType[]) $VALUES.clone();
    }
}
