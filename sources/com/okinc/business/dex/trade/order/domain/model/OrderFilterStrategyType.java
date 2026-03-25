package com.okinc.business.dex.trade.order.domain.model;

import java.util.List;
import o.C23274hvD;
import o.C56402yEa;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class OrderFilterStrategyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderFilterStrategyType[] $VALUES;
    private final boolean onlySupportTee;
    private final int textRes;
    private final String trackValue;
    private final List<OrderStrategyType> types;
    public static final OrderFilterStrategyType Market = new OrderFilterStrategyType("Market", 0, C56402yEa.EZpvd(OrderStrategyType.Market), false, C23274hvD.Fragment.sendState, "market");
    public static final OrderFilterStrategyType Limit = new OrderFilterStrategyType("Limit", 1, yDY.gEmmrt(OrderStrategyType.Limit, OrderStrategyType.Tp, OrderStrategyType.Sl), false, C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBase1, "limit");
    public static final OrderFilterStrategyType CoptTrading = new OrderFilterStrategyType("CoptTrading", 2, C56402yEa.EZpvd(OrderStrategyType.CopyTrade), false, C23274hvD.Fragment.DXd, "copytrading");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderFilterStrategyType[] $values() {
        return new OrderFilterStrategyType[]{Market, Limit, CoptTrading};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderFilterStrategyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOnlySupportTee() {
        return this.onlySupportTee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTextRes() {
        return this.textRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackValue() {
        return this.trackValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OrderStrategyType> getTypes() {
        return this.types;
    }

    private OrderFilterStrategyType(String str, int i, List list, boolean z, int i2, String str2) {
        this.types = list;
        this.onlySupportTee = z;
        this.textRes = i2;
        this.trackValue = str2;
    }

    static {
        OrderFilterStrategyType[] orderFilterStrategyTypeArr$values = $values();
        $VALUES = orderFilterStrategyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderFilterStrategyTypeArr$values);
    }

    public static OrderFilterStrategyType valueOf(String str) {
        return (OrderFilterStrategyType) Enum.valueOf(OrderFilterStrategyType.class, str);
    }

    public static OrderFilterStrategyType[] values() {
        return (OrderFilterStrategyType[]) $VALUES.clone();
    }
}
