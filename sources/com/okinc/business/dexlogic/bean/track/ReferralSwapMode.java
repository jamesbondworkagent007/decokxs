package com.okinc.business.dexlogic.bean.track;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ReferralSwapMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReferralSwapMode[] $VALUES;
    private final String mode;
    public static final ReferralSwapMode SWAP_LIMIT = new ReferralSwapMode("SWAP_LIMIT", 0, "swap_limit");
    public static final ReferralSwapMode SWAP_MARKET = new ReferralSwapMode("SWAP_MARKET", 1, "swap_market");
    public static final ReferralSwapMode ADVANCED_MODE = new ReferralSwapMode("ADVANCED_MODE", 2, "advanced_mode");
    public static final ReferralSwapMode MEME_MODE = new ReferralSwapMode("MEME_MODE", 3, "meme_mode");
    public static final ReferralSwapMode QUICK_MODE = new ReferralSwapMode("QUICK_MODE", 4, "quick_buy");
    public static final ReferralSwapMode COPY_TRADE = new ReferralSwapMode("COPY_TRADE", 5, "copy_trade");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReferralSwapMode[] $values() {
        return new ReferralSwapMode[]{SWAP_LIMIT, SWAP_MARKET, ADVANCED_MODE, MEME_MODE, QUICK_MODE, COPY_TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReferralSwapMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    private ReferralSwapMode(String str, int i, String str2) {
        this.mode = str2;
    }

    static {
        ReferralSwapMode[] referralSwapModeArr$values = $values();
        $VALUES = referralSwapModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(referralSwapModeArr$values);
    }

    public static ReferralSwapMode valueOf(String str) {
        return (ReferralSwapMode) Enum.valueOf(ReferralSwapMode.class, str);
    }

    public static ReferralSwapMode[] values() {
        return (ReferralSwapMode[]) $VALUES.clone();
    }
}
