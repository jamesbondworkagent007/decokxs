package com.okinc.business.dexui.main.swap.trade.single.defiplatform;

import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DeFiPlatformSelectionSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DeFiPlatformSelectionSource[] $VALUES;
    private final String businessType;
    public static final DeFiPlatformSelectionSource SWAP_MODE = new DeFiPlatformSelectionSource("SWAP_MODE", 0, "swap");
    public static final DeFiPlatformSelectionSource ADVANCED_MODE_BUY = new DeFiPlatformSelectionSource("ADVANCED_MODE_BUY", 1, "advanced");
    public static final DeFiPlatformSelectionSource ADVANCED_MODE_SELL = new DeFiPlatformSelectionSource("ADVANCED_MODE_SELL", 2, "advanced");
    public static final DeFiPlatformSelectionSource MEME_MODE_BUY = new DeFiPlatformSelectionSource("MEME_MODE_BUY", 3, TabTitleInfo.KEY_MEME);
    public static final DeFiPlatformSelectionSource MEME_MODE_SELL = new DeFiPlatformSelectionSource("MEME_MODE_SELL", 4, TabTitleInfo.KEY_MEME);
    public static final DeFiPlatformSelectionSource UNKNOWN = new DeFiPlatformSelectionSource("UNKNOWN", 5, "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DeFiPlatformSelectionSource[] $values() {
        return new DeFiPlatformSelectionSource[]{SWAP_MODE, ADVANCED_MODE_BUY, ADVANCED_MODE_SELL, MEME_MODE_BUY, MEME_MODE_SELL, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DeFiPlatformSelectionSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessType() {
        return this.businessType;
    }

    private DeFiPlatformSelectionSource(String str, int i, String str2) {
        this.businessType = str2;
    }

    static {
        DeFiPlatformSelectionSource[] deFiPlatformSelectionSourceArr$values = $values();
        $VALUES = deFiPlatformSelectionSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(deFiPlatformSelectionSourceArr$values);
    }

    public static DeFiPlatformSelectionSource valueOf(String str) {
        return (DeFiPlatformSelectionSource) Enum.valueOf(DeFiPlatformSelectionSource.class, str);
    }

    public static DeFiPlatformSelectionSource[] values() {
        return (DeFiPlatformSelectionSource[]) $VALUES.clone();
    }
}
