package com.okinc.business.market.common.constants;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class RankingSortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RankingSortType[] $VALUES;
    public static final RankingSortType CATEGORY = new RankingSortType("CATEGORY", 0);
    public static final RankingSortType DURATION = new RankingSortType("DURATION", 1);
    public static final RankingSortType RANKING = new RankingSortType("RANKING", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RankingSortType[] $values() {
        return new RankingSortType[]{CATEGORY, DURATION, RANKING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RankingSortType> getEntries() {
        return $ENTRIES;
    }

    private RankingSortType(String str, int i) {
    }

    static {
        RankingSortType[] rankingSortTypeArr$values = $values();
        $VALUES = rankingSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rankingSortTypeArr$values);
    }

    public static RankingSortType valueOf(String str) {
        return (RankingSortType) Enum.valueOf(RankingSortType.class, str);
    }

    public static RankingSortType[] values() {
        return (RankingSortType[]) $VALUES.clone();
    }
}
