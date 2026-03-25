package com.okinc.business.dex.trade.order.domain.model;

import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderStatus[] $VALUES;
    private final int textRes;
    public static final OrderStatus OpenOrders = new OrderStatus("OpenOrders", 0, C23274hvD.Fragment.OeZisf);
    public static final OrderStatus History = new OrderStatus("History", 1, C23274hvD.Fragment.QYNZmZ);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderStatus[] $values() {
        return new OrderStatus[]{OpenOrders, History};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextRes() {
        return this.textRes;
    }

    private OrderStatus(String str, int i, int i2) {
        this.textRes = i2;
    }

    static {
        OrderStatus[] orderStatusArr$values = $values();
        $VALUES = orderStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderStatusArr$values);
    }

    public static OrderStatus valueOf(String str) {
        return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
    }

    public static OrderStatus[] values() {
        return (OrderStatus[]) $VALUES.clone();
    }
}
