package com.okinc.business.dex.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderStatus[] $VALUES;
    private final int status;
    public static final OrderStatus Cancelling = new OrderStatus("Cancelling", 0, -4);
    public static final OrderStatus Pending = new OrderStatus("Pending", 1, 0);
    public static final OrderStatus Creating = new OrderStatus("Creating", 2, 2);
    public static final OrderStatus Open = new OrderStatus("Open", 3, 3);
    public static final OrderStatus Suspended = new OrderStatus("Suspended", 4, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderStatus[] $values() {
        return new OrderStatus[]{Cancelling, Pending, Creating, Open, Suspended};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private OrderStatus(String str, int i, int i2) {
        this.status = i2;
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
