package com.okinc.business.dexlogic.main.swap.coinlist.bean;

import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class NetworkSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NetworkSource[] $VALUES;
    private final String source;
    public static final NetworkSource All = new NetworkSource("All", 0, "all");
    public static final NetworkSource Single = new NetworkSource("Single", 1, "single");
    public static final NetworkSource Limit = new NetworkSource("Limit", 2, "limit");
    public static final NetworkSource Swap = new NetworkSource("Swap", 3, "swap");
    public static final NetworkSource Bridge = new NetworkSource("Bridge", 4, TabTitleInfo.KEY_BRIDGE);
    public static final NetworkSource CopyTrading = new NetworkSource("CopyTrading", 5, "copyTrading");
    public static final NetworkSource Market = new NetworkSource("Market", 6, "market");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NetworkSource[] $values() {
        return new NetworkSource[]{All, Single, Limit, Swap, Bridge, CopyTrading, Market};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NetworkSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    private NetworkSource(String str, int i, String str2) {
        this.source = str2;
    }

    static {
        NetworkSource[] networkSourceArr$values = $values();
        $VALUES = networkSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(networkSourceArr$values);
    }

    public static NetworkSource valueOf(String str) {
        return (NetworkSource) Enum.valueOf(NetworkSource.class, str);
    }

    public static NetworkSource[] values() {
        return (NetworkSource[]) $VALUES.clone();
    }
}
