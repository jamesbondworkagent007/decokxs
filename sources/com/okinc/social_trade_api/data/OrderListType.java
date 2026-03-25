package com.okinc.social_trade_api.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class OrderListType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderListType[] $VALUES;
    public static final Activity Companion;
    public static final OrderListType All = new OrderListType("All", 0);
    public static final OrderListType Swap = new OrderListType("Swap", 1);
    public static final OrderListType Spot = new OrderListType("Spot", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderListType[] $values() {
        return new OrderListType[]{All, Swap, Spot};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderListType> getEntries() {
        return $ENTRIES;
    }

    private OrderListType(String str, int i) {
    }

    static {
        OrderListType[] orderListTypeArr$values = $values();
        $VALUES = orderListTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderListTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.OrderListType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static OrderListType valueOf(String str) {
        return (OrderListType) Enum.valueOf(OrderListType.class, str);
    }

    public static OrderListType[] values() {
        return (OrderListType[]) $VALUES.clone();
    }
}
