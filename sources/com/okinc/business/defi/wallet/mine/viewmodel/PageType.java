package com.okinc.business.defi.wallet.mine.viewmodel;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class PageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PageType[] $VALUES;
    private final String trackingValue;
    public static final PageType PRE_LOGIN = new PageType("PRE_LOGIN", 0, "pre_login");
    public static final PageType LOGIN_EOA = new PageType("LOGIN_EOA", 1, "login_eoa");
    public static final PageType LOGIN_AA = new PageType("LOGIN_AA", 2, "login_aa");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PageType[] $values() {
        return new PageType[]{PRE_LOGIN, LOGIN_EOA, LOGIN_AA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PageType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    private PageType(String str, int i, String str2) {
        this.trackingValue = str2;
    }

    static {
        PageType[] pageTypeArr$values = $values();
        $VALUES = pageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pageTypeArr$values);
    }

    public static PageType valueOf(String str) {
        return (PageType) Enum.valueOf(PageType.class, str);
    }

    public static PageType[] values() {
        return (PageType[]) $VALUES.clone();
    }
}
