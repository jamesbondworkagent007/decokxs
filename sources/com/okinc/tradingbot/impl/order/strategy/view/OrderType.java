package com.okinc.tradingbot.impl.order.strategy.view;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class OrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;
    public static final OrderType LEFT = new OrderType("LEFT", 0);
    public static final OrderType RIGHT = new OrderType("RIGHT", 1);
    public static final OrderType BOTH = new OrderType("BOTH", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderType[] $values() {
        return new OrderType[]{LEFT, RIGHT, BOTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderType> getEntries() {
        return $ENTRIES;
    }

    private OrderType(String str, int i) {
    }

    static {
        OrderType[] orderTypeArr$values = $values();
        $VALUES = orderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderTypeArr$values);
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }
}
