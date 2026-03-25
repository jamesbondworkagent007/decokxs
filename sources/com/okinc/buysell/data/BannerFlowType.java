package com.okinc.buysell.data;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class BannerFlowType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BannerFlowType[] $VALUES;
    public static final BannerFlowType BUY = new BannerFlowType("BUY", 0);
    public static final BannerFlowType SELL = new BannerFlowType("SELL", 1);
    public static final BannerFlowType DEPOSIT = new BannerFlowType("DEPOSIT", 2);
    public static final BannerFlowType WITHDRAW = new BannerFlowType("WITHDRAW", 3);
    public static final BannerFlowType MERGE = new BannerFlowType("MERGE", 4);
    public static final BannerFlowType TOPUP = new BannerFlowType("TOPUP", 5);
    public static final BannerFlowType UNKNOWN = new BannerFlowType("UNKNOWN", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BannerFlowType[] $values() {
        return new BannerFlowType[]{BUY, SELL, DEPOSIT, WITHDRAW, MERGE, TOPUP, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BannerFlowType> getEntries() {
        return $ENTRIES;
    }

    private BannerFlowType(String str, int i) {
    }

    static {
        BannerFlowType[] bannerFlowTypeArr$values = $values();
        $VALUES = bannerFlowTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bannerFlowTypeArr$values);
    }

    public final String getFlowName() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static BannerFlowType valueOf(String str) {
        return (BannerFlowType) Enum.valueOf(BannerFlowType.class, str);
    }

    public static BannerFlowType[] values() {
        return (BannerFlowType[]) $VALUES.clone();
    }
}
