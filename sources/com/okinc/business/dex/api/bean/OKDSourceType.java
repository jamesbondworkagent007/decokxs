package com.okinc.business.dex.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OKDSourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKDSourceType[] $VALUES;
    private final int srcType;
    public static final OKDSourceType WALLET_SOURCE = new OKDSourceType("WALLET_SOURCE", 0, 0);
    public static final OKDSourceType DEX_MARKET_SOURCE = new OKDSourceType("DEX_MARKET_SOURCE", 1, 1);
    public static final OKDSourceType DEX_SWAP_SOURCE = new OKDSourceType("DEX_SWAP_SOURCE", 2, 2);
    public static final OKDSourceType YIELD_SOURCE = new OKDSourceType("YIELD_SOURCE", 3, 3);
    public static final OKDSourceType NFT_SOURCE = new OKDSourceType("NFT_SOURCE", 4, 4);
    public static final OKDSourceType DAPP_SOURCE = new OKDSourceType("DAPP_SOURCE", 5, 5);
    public static final OKDSourceType CEFI_SOURCE = new OKDSourceType("CEFI_SOURCE", 6, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKDSourceType[] $values() {
        return new OKDSourceType[]{WALLET_SOURCE, DEX_MARKET_SOURCE, DEX_SWAP_SOURCE, YIELD_SOURCE, NFT_SOURCE, DAPP_SOURCE, CEFI_SOURCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKDSourceType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSrcType() {
        return this.srcType;
    }

    private OKDSourceType(String str, int i, int i2) {
        this.srcType = i2;
    }

    static {
        OKDSourceType[] oKDSourceTypeArr$values = $values();
        $VALUES = oKDSourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKDSourceTypeArr$values);
    }

    public static OKDSourceType valueOf(String str) {
        return (OKDSourceType) Enum.valueOf(OKDSourceType.class, str);
    }

    public static OKDSourceType[] values() {
        return (OKDSourceType[]) $VALUES.clone();
    }
}
