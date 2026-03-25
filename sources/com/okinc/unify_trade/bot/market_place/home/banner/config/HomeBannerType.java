package com.okinc.unify_trade.bot.market_place.home.banner.config;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class HomeBannerType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomeBannerType[] $VALUES;
    private final String type;
    public static final HomeBannerType NORMAL = new HomeBannerType("NORMAL", 0, "normal");
    public static final HomeBannerType LOSS_INSURANCE = new HomeBannerType("LOSS_INSURANCE", 1, "loss_insurance");
    public static final HomeBannerType GRID_CARD = new HomeBannerType("GRID_CARD", 2, "grid_card");
    public static final HomeBannerType ARBITRAGE_CARD = new HomeBannerType("ARBITRAGE_CARD", 3, "arbitrage_card");
    public static final HomeBannerType SMART_PORTFOLIO = new HomeBannerType("SMART_PORTFOLIO", 4, "smart_portfolio");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomeBannerType[] $values() {
        return new HomeBannerType[]{NORMAL, LOSS_INSURANCE, GRID_CARD, ARBITRAGE_CARD, SMART_PORTFOLIO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomeBannerType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private HomeBannerType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        HomeBannerType[] homeBannerTypeArr$values = $values();
        $VALUES = homeBannerTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homeBannerTypeArr$values);
    }

    public static HomeBannerType valueOf(String str) {
        return (HomeBannerType) Enum.valueOf(HomeBannerType.class, str);
    }

    public static HomeBannerType[] values() {
        return (HomeBannerType[]) $VALUES.clone();
    }
}
