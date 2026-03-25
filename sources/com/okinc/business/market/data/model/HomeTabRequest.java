package com.okinc.business.market.data.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class HomeTabRequest {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomeTabRequest[] $VALUES;
    public static final HomeTabRequest EOA = new HomeTabRequest("EOA", 0, 1);
    public static final HomeTabRequest SA = new HomeTabRequest("SA", 1, 2);
    private final int accountType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomeTabRequest[] $values() {
        return new HomeTabRequest[]{EOA, SA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomeTabRequest> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
    }

    private HomeTabRequest(String str, int i, int i2) {
        this.accountType = i2;
    }

    static {
        HomeTabRequest[] homeTabRequestArr$values = $values();
        $VALUES = homeTabRequestArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homeTabRequestArr$values);
    }

    public static HomeTabRequest valueOf(String str) {
        return (HomeTabRequest) Enum.valueOf(HomeTabRequest.class, str);
    }

    public static HomeTabRequest[] values() {
        return (HomeTabRequest[]) $VALUES.clone();
    }
}
