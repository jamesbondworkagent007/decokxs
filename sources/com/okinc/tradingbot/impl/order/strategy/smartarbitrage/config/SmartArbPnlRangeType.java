package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.config;

import androidx.annotation.StringRes;
import o.C48033uCm;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class SmartArbPnlRangeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SmartArbPnlRangeType[] $VALUES;
    private final int days;
    private final int titleRes;
    public static final SmartArbPnlRangeType THREE_DAYS = new SmartArbPnlRangeType("THREE_DAYS", 0, C48033uCm.Fragment.compare, 4);
    public static final SmartArbPnlRangeType THIRTY_DAYS = new SmartArbPnlRangeType("THIRTY_DAYS", 1, C48033uCm.Fragment.OmYuqg, 31);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SmartArbPnlRangeType[] $values() {
        return new SmartArbPnlRangeType[]{THREE_DAYS, THIRTY_DAYS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SmartArbPnlRangeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDays() {
        return this.days;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleRes() {
        return this.titleRes;
    }

    private SmartArbPnlRangeType(@StringRes String str, int i, int i2, int i3) {
        this.titleRes = i2;
        this.days = i3;
    }

    static {
        SmartArbPnlRangeType[] smartArbPnlRangeTypeArr$values = $values();
        $VALUES = smartArbPnlRangeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(smartArbPnlRangeTypeArr$values);
    }

    public static SmartArbPnlRangeType valueOf(String str) {
        return (SmartArbPnlRangeType) Enum.valueOf(SmartArbPnlRangeType.class, str);
    }

    public static SmartArbPnlRangeType[] values() {
        return (SmartArbPnlRangeType[]) $VALUES.clone();
    }
}
