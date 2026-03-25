package com.okinc.unify_trade.bot.market_place.home.list.config;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class HomeBotTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomeBotTabType[] $VALUES;
    public static final HomeBotTabType FAVORITE = new HomeBotTabType("FAVORITE", 0);
    public static final HomeBotTabType ALL = new HomeBotTabType("ALL", 1);
    public static final HomeBotTabType FOLLOW = new HomeBotTabType("FOLLOW", 2);
    public static final HomeBotTabType BOT = new HomeBotTabType("BOT", 3);
    public static final HomeBotTabType CR = new HomeBotTabType("CR", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomeBotTabType[] $values() {
        return new HomeBotTabType[]{FAVORITE, ALL, FOLLOW, BOT, CR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomeBotTabType> getEntries() {
        return $ENTRIES;
    }

    private HomeBotTabType(String str, int i) {
    }

    static {
        HomeBotTabType[] homeBotTabTypeArr$values = $values();
        $VALUES = homeBotTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homeBotTabTypeArr$values);
    }

    public static HomeBotTabType valueOf(String str) {
        return (HomeBotTabType) Enum.valueOf(HomeBotTabType.class, str);
    }

    public static HomeBotTabType[] values() {
        return (HomeBotTabType[]) $VALUES.clone();
    }
}
