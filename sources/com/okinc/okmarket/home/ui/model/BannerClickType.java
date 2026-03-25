package com.okinc.okmarket.home.ui.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class BannerClickType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BannerClickType[] $VALUES;
    public static final BannerClickType TRADE = new BannerClickType("TRADE", 0);
    public static final BannerClickType KLINE = new BannerClickType("KLINE", 1);
    public static final BannerClickType DEEPLINK = new BannerClickType("DEEPLINK", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BannerClickType[] $values() {
        return new BannerClickType[]{TRADE, KLINE, DEEPLINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BannerClickType> getEntries() {
        return $ENTRIES;
    }

    private BannerClickType(String str, int i) {
    }

    static {
        BannerClickType[] bannerClickTypeArr$values = $values();
        $VALUES = bannerClickTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bannerClickTypeArr$values);
    }

    public static BannerClickType valueOf(String str) {
        return (BannerClickType) Enum.valueOf(BannerClickType.class, str);
    }

    public static BannerClickType[] values() {
        return (BannerClickType[]) $VALUES.clone();
    }
}
