package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class OrderFilter {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderFilter[] $VALUES;
    public static final OrderFilter Amount = new OrderFilter("Amount", 0);
    public static final OrderFilter Volume = new OrderFilter("Volume", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderFilter[] $values() {
        return new OrderFilter[]{Amount, Volume};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderFilter> getEntries() {
        return $ENTRIES;
    }

    static {
        OrderFilter[] orderFilterArr$values = $values();
        $VALUES = orderFilterArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderFilterArr$values);
    }

    private OrderFilter(String str, int i) {
    }

    public static OrderFilter valueOf(String str) {
        return (OrderFilter) Enum.valueOf(OrderFilter.class, str);
    }

    public static OrderFilter[] values() {
        return (OrderFilter[]) $VALUES.clone();
    }
}
