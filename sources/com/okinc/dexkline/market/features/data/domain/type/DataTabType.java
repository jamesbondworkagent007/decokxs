package com.okinc.dexkline.market.features.data.domain.type;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class DataTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DataTabType[] $VALUES;
    public static final DataTabType HOLDERS_CHANGE = new DataTabType("HOLDERS_CHANGE", 0);
    public static final DataTabType HOLDING_7D = new DataTabType("HOLDING_7D", 1);
    public static final DataTabType LIQUIDITY_INFO = new DataTabType("LIQUIDITY_INFO", 2);
    public static final DataTabType POOL_INFO = new DataTabType("POOL_INFO", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DataTabType[] $values() {
        return new DataTabType[]{HOLDERS_CHANGE, HOLDING_7D, LIQUIDITY_INFO, POOL_INFO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DataTabType> getEntries() {
        return $ENTRIES;
    }

    private DataTabType(String str, int i) {
    }

    static {
        DataTabType[] dataTabTypeArr$values = $values();
        $VALUES = dataTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dataTabTypeArr$values);
    }

    public static DataTabType valueOf(String str) {
        return (DataTabType) Enum.valueOf(DataTabType.class, str);
    }

    public static DataTabType[] values() {
        return (DataTabType[]) $VALUES.clone();
    }
}
