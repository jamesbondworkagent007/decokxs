package com.okinc.kline.util;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class KlineTradeDragType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KlineTradeDragType[] $VALUES;
    public static final KlineTradeDragType CURRENT_ORDER = new KlineTradeDragType("CURRENT_ORDER", 0);
    public static final KlineTradeDragType CURRENT_ORDER_CLICK = new KlineTradeDragType("CURRENT_ORDER_CLICK", 1);
    public static final KlineTradeDragType ORDER_SL = new KlineTradeDragType("ORDER_SL", 2);
    public static final KlineTradeDragType ORDER_TP = new KlineTradeDragType("ORDER_TP", 3);
    public static final KlineTradeDragType ORDER_CANCEL = new KlineTradeDragType("ORDER_CANCEL", 4);
    public static final KlineTradeDragType COST_SL = new KlineTradeDragType("COST_SL", 5);
    public static final KlineTradeDragType COST_TP = new KlineTradeDragType("COST_TP", 6);
    public static final KlineTradeDragType COST_CANCEL = new KlineTradeDragType("COST_CANCEL", 7);
    public static final KlineTradeDragType COST_OPPOSITE = new KlineTradeDragType("COST_OPPOSITE", 8);
    public static final KlineTradeDragType CURRENT_COST = new KlineTradeDragType("CURRENT_COST", 9);
    public static final KlineTradeDragType NONE = new KlineTradeDragType("NONE", 10);
    public static final KlineTradeDragType SPOT_CANCEL = new KlineTradeDragType("SPOT_CANCEL", 11);
    public static final KlineTradeDragType SPOT_TP = new KlineTradeDragType("SPOT_TP", 12);
    public static final KlineTradeDragType SPOT_SL = new KlineTradeDragType("SPOT_SL", 13);
    public static final KlineTradeDragType SPOT_CLICK = new KlineTradeDragType("SPOT_CLICK", 14);
    public static final KlineTradeDragType COST_LIQ = new KlineTradeDragType("COST_LIQ", 15);
    public static final KlineTradeDragType COST_BE = new KlineTradeDragType("COST_BE", 16);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KlineTradeDragType[] $values() {
        return new KlineTradeDragType[]{CURRENT_ORDER, CURRENT_ORDER_CLICK, ORDER_SL, ORDER_TP, ORDER_CANCEL, COST_SL, COST_TP, COST_CANCEL, COST_OPPOSITE, CURRENT_COST, NONE, SPOT_CANCEL, SPOT_TP, SPOT_SL, SPOT_CLICK, COST_LIQ, COST_BE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KlineTradeDragType> getEntries() {
        return $ENTRIES;
    }

    private KlineTradeDragType(String str, int i) {
    }

    static {
        KlineTradeDragType[] klineTradeDragTypeArr$values = $values();
        $VALUES = klineTradeDragTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(klineTradeDragTypeArr$values);
    }

    public static KlineTradeDragType valueOf(String str) {
        return (KlineTradeDragType) Enum.valueOf(KlineTradeDragType.class, str);
    }

    public static KlineTradeDragType[] values() {
        return (KlineTradeDragType[]) $VALUES.clone();
    }
}
