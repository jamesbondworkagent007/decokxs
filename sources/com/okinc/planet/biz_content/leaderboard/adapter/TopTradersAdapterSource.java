package com.okinc.planet.biz_content.leaderboard.adapter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class TopTradersAdapterSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TopTradersAdapterSource[] $VALUES;
    public static final TopTradersAdapterSource FRAGMENT = new TopTradersAdapterSource("FRAGMENT", 0);
    public static final TopTradersAdapterSource ACTIVITY = new TopTradersAdapterSource("ACTIVITY", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TopTradersAdapterSource[] $values() {
        return new TopTradersAdapterSource[]{FRAGMENT, ACTIVITY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TopTradersAdapterSource> getEntries() {
        return $ENTRIES;
    }

    private TopTradersAdapterSource(String str, int i) {
    }

    static {
        TopTradersAdapterSource[] topTradersAdapterSourceArr$values = $values();
        $VALUES = topTradersAdapterSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(topTradersAdapterSourceArr$values);
    }

    public static TopTradersAdapterSource valueOf(String str) {
        return (TopTradersAdapterSource) Enum.valueOf(TopTradersAdapterSource.class, str);
    }

    public static TopTradersAdapterSource[] values() {
        return (TopTradersAdapterSource[]) $VALUES.clone();
    }
}
