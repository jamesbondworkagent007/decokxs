package com.okinc.buysell.ui.pro.transaction.list;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class OrderRouteType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderRouteType[] $VALUES;
    public static final OrderRouteType WEBVIEW = new OrderRouteType("WEBVIEW", 0);
    public static final OrderRouteType NATIVE_DETAIL = new OrderRouteType("NATIVE_DETAIL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderRouteType[] $values() {
        return new OrderRouteType[]{WEBVIEW, NATIVE_DETAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderRouteType> getEntries() {
        return $ENTRIES;
    }

    private OrderRouteType(String str, int i) {
    }

    static {
        OrderRouteType[] orderRouteTypeArr$values = $values();
        $VALUES = orderRouteTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderRouteTypeArr$values);
    }

    public static OrderRouteType valueOf(String str) {
        return (OrderRouteType) Enum.valueOf(OrderRouteType.class, str);
    }

    public static OrderRouteType[] values() {
        return (OrderRouteType[]) $VALUES.clone();
    }
}
