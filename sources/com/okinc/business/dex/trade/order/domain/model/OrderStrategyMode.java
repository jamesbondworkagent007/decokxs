package com.okinc.business.dex.trade.order.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderStrategyMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderStrategyMode[] $VALUES;
    private final int strategyMode;
    public static final OrderStrategyMode TEE_SA_USD_PEGGED_LIMIT_ORDER = new OrderStrategyMode("TEE_SA_USD_PEGGED_LIMIT_ORDER", 0, 7);
    public static final OrderStrategyMode TEE_SA_EXCHANGE_RATE_BASED_LIMIT_ORDER = new OrderStrategyMode("TEE_SA_EXCHANGE_RATE_BASED_LIMIT_ORDER", 1, 8);
    public static final OrderStrategyMode TEE_SA_USD_PEGGED_MARKET_ORDER = new OrderStrategyMode("TEE_SA_USD_PEGGED_MARKET_ORDER", 2, 9);
    public static final OrderStrategyMode TEE_SA_COPY_TRADE = new OrderStrategyMode("TEE_SA_COPY_TRADE", 3, 10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderStrategyMode[] $values() {
        return new OrderStrategyMode[]{TEE_SA_USD_PEGGED_LIMIT_ORDER, TEE_SA_EXCHANGE_RATE_BASED_LIMIT_ORDER, TEE_SA_USD_PEGGED_MARKET_ORDER, TEE_SA_COPY_TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderStrategyMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyMode() {
        return this.strategyMode;
    }

    private OrderStrategyMode(String str, int i, int i2) {
        this.strategyMode = i2;
    }

    static {
        OrderStrategyMode[] orderStrategyModeArr$values = $values();
        $VALUES = orderStrategyModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderStrategyModeArr$values);
    }

    public static OrderStrategyMode valueOf(String str) {
        return (OrderStrategyMode) Enum.valueOf(OrderStrategyMode.class, str);
    }

    public static OrderStrategyMode[] values() {
        return (OrderStrategyMode[]) $VALUES.clone();
    }
}
