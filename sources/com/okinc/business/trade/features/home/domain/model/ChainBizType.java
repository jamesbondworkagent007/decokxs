package com.okinc.business.trade.features.home.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ChainBizType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChainBizType[] $VALUES;
    private final String type;
    public static final ChainBizType AllSupported = new ChainBizType("AllSupported", 0, "AllSupported");
    public static final ChainBizType Single = new ChainBizType("Single", 1, "Single");
    public static final ChainBizType Limit = new ChainBizType("Limit", 2, "Limit");
    public static final ChainBizType Bridge = new ChainBizType("Bridge", 3, "Bridge");
    public static final ChainBizType CopyTrading = new ChainBizType("CopyTrading", 4, "Bridge");
    public static final ChainBizType Market = new ChainBizType("Market", 5, "Market");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChainBizType[] $values() {
        return new ChainBizType[]{AllSupported, Single, Limit, Bridge, CopyTrading, Market};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChainBizType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private ChainBizType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        ChainBizType[] chainBizTypeArr$values = $values();
        $VALUES = chainBizTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chainBizTypeArr$values);
    }

    public static ChainBizType valueOf(String str) {
        return (ChainBizType) Enum.valueOf(ChainBizType.class, str);
    }

    public static ChainBizType[] values() {
        return (ChainBizType[]) $VALUES.clone();
    }
}
