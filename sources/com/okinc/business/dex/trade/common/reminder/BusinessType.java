package com.okinc.business.dex.trade.common.reminder;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class BusinessType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BusinessType[] $VALUES;
    public static final BusinessType AdvancedModeBuy = new BusinessType("AdvancedModeBuy", 0);
    public static final BusinessType AdvancedModeSell = new BusinessType("AdvancedModeSell", 1);
    public static final BusinessType AdvancedModeLimitBuy = new BusinessType("AdvancedModeLimitBuy", 2);
    public static final BusinessType AdvancedModeLimitSell = new BusinessType("AdvancedModeLimitSell", 3);
    public static final BusinessType SwapMarket = new BusinessType("SwapMarket", 4);
    public static final BusinessType SwapLimit = new BusinessType("SwapLimit", 5);
    public static final BusinessType MemeModeBuy = new BusinessType("MemeModeBuy", 6);
    public static final BusinessType MemeModeSell = new BusinessType("MemeModeSell", 7);
    public static final BusinessType Other = new BusinessType("Other", 8);

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.AdvancedModeBuy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BusinessType.AdvancedModeSell.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BusinessType.AdvancedModeLimitBuy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BusinessType.AdvancedModeLimitSell.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BusinessType.SwapMarket.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BusinessType.SwapLimit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BusinessType[] $values() {
        return new BusinessType[]{AdvancedModeBuy, AdvancedModeSell, AdvancedModeLimitBuy, AdvancedModeLimitSell, SwapMarket, SwapLimit, MemeModeBuy, MemeModeSell, Other};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BusinessType> getEntries() {
        return $ENTRIES;
    }

    private BusinessType(String str, int i) {
    }

    static {
        BusinessType[] businessTypeArr$values = $values();
        $VALUES = businessTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(businessTypeArr$values);
    }

    public final boolean isAdvanced() {
        int i = TaskDescription.KWHzl[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean isSwapMode() {
        int i = TaskDescription.KWHzl[ordinal()];
        return i == 5 || i == 6;
    }

    public final boolean isLimit() {
        int i = TaskDescription.KWHzl[ordinal()];
        return i == 3 || i == 4 || i == 6;
    }

    public static BusinessType valueOf(String str) {
        return (BusinessType) Enum.valueOf(BusinessType.class, str);
    }

    public static BusinessType[] values() {
        return (BusinessType[]) $VALUES.clone();
    }
}
