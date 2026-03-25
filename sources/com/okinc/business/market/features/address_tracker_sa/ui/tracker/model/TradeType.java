package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeType[] $VALUES;
    public static final ActionBar Companion;
    private final int value;
    public static final TradeType NEWLY_HOLD = new TradeType("NEWLY_HOLD", 0, 1);
    public static final TradeType BUY_MORE = new TradeType("BUY_MORE", 1, 2);
    public static final TradeType SELL_PART = new TradeType("SELL_PART", 2, 3);
    public static final TradeType SELL_ALL = new TradeType("SELL_ALL", 3, 4);
    public static final TradeType BUY = new TradeType("BUY", 4, 5);
    public static final TradeType SELL = new TradeType("SELL", 5, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeType[] $values() {
        return new TradeType[]{NEWLY_HOLD, BUY_MORE, SELL_PART, SELL_ALL, BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TradeType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TradeType[] tradeTypeArr$values = $values();
        $VALUES = tradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TradeType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final TradeType copydefault(int i) {
            for (TradeType tradeType : TradeType.values()) {
                if (tradeType.getValue() == i) {
                    return tradeType;
                }
            }
            return null;
        }
    }

    public static TradeType valueOf(String str) {
        return (TradeType) Enum.valueOf(TradeType.class, str);
    }

    public static TradeType[] values() {
        return (TradeType[]) $VALUES.clone();
    }
}
