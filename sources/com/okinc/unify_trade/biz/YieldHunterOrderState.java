package com.okinc.unify_trade.biz;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class YieldHunterOrderState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ YieldHunterOrderState[] $VALUES;
    private final String type;
    public static final YieldHunterOrderState PLACE_ORDER_FAILED = new YieldHunterOrderState("PLACE_ORDER_FAILED", 0, "place_order_failed");
    public static final YieldHunterOrderState POSITION_OPEN = new YieldHunterOrderState("POSITION_OPEN", 1, "position_open");
    public static final YieldHunterOrderState CLOSE_POSITION_FAILED = new YieldHunterOrderState("CLOSE_POSITION_FAILED", 2, "close_position_failed");
    public static final YieldHunterOrderState LIQUIDATED = new YieldHunterOrderState("LIQUIDATED", 3, "liquidated");
    public static final YieldHunterOrderState POSITION_CLOSED = new YieldHunterOrderState("POSITION_CLOSED", 4, "position_closed");
    public static final YieldHunterOrderState DELIVERING = new YieldHunterOrderState("DELIVERING", 5, "delivering");
    public static final YieldHunterOrderState DELIVERED = new YieldHunterOrderState("DELIVERED", 6, "delivered");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ YieldHunterOrderState[] $values() {
        return new YieldHunterOrderState[]{PLACE_ORDER_FAILED, POSITION_OPEN, CLOSE_POSITION_FAILED, LIQUIDATED, POSITION_CLOSED, DELIVERING, DELIVERED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<YieldHunterOrderState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private YieldHunterOrderState(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        YieldHunterOrderState[] yieldHunterOrderStateArr$values = $values();
        $VALUES = yieldHunterOrderStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(yieldHunterOrderStateArr$values);
    }

    public static YieldHunterOrderState valueOf(String str) {
        return (YieldHunterOrderState) Enum.valueOf(YieldHunterOrderState.class, str);
    }

    public static YieldHunterOrderState[] values() {
        return (YieldHunterOrderState[]) $VALUES.clone();
    }
}
