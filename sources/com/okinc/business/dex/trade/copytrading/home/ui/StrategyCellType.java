package com.okinc.business.dex.trade.copytrading.home.ui;

import com.google.common.net.HttpHeaders;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class StrategyCellType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ StrategyCellType[] $VALUES;
    public static final StrategyCellType PnL = new StrategyCellType("PnL", 0);
    public static final StrategyCellType Status = new StrategyCellType("Status", 1);
    public static final StrategyCellType Txns = new StrategyCellType("Txns", 2);
    public static final StrategyCellType BoughtSold = new StrategyCellType("BoughtSold", 3);
    public static final StrategyCellType Network = new StrategyCellType("Network", 4);
    public static final StrategyCellType From = new StrategyCellType(HttpHeaders.FROM, 5);
    public static final StrategyCellType CreateTime = new StrategyCellType("CreateTime", 6);
    public static final StrategyCellType ExpiresAfter = new StrategyCellType("ExpiresAfter", 7);
    public static final StrategyCellType EndsIn = new StrategyCellType("EndsIn", 8);
    public static final StrategyCellType ExpiredAt = new StrategyCellType("ExpiredAt", 9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ StrategyCellType[] $values() {
        return new StrategyCellType[]{PnL, Status, Txns, BoughtSold, Network, From, CreateTime, ExpiresAfter, EndsIn, ExpiredAt};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<StrategyCellType> getEntries() {
        return $ENTRIES;
    }

    private StrategyCellType(String str, int i) {
    }

    static {
        StrategyCellType[] strategyCellTypeArr$values = $values();
        $VALUES = strategyCellTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(strategyCellTypeArr$values);
    }

    public static StrategyCellType valueOf(String str) {
        return (StrategyCellType) Enum.valueOf(StrategyCellType.class, str);
    }

    public static StrategyCellType[] values() {
        return (StrategyCellType[]) $VALUES.clone();
    }
}
