package com.okinc.business.dexlogic.main.limmitorder.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ShowRateFluctuation {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShowRateFluctuation[] $VALUES;
    public static final ShowRateFluctuation DoNotShowTips = new ShowRateFluctuation("DoNotShowTips", 0, 0);
    public static final ShowRateFluctuation ShowTips = new ShowRateFluctuation("ShowTips", 1, 1);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShowRateFluctuation[] $values() {
        return new ShowRateFluctuation[]{DoNotShowTips, ShowTips};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShowRateFluctuation> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private ShowRateFluctuation(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ShowRateFluctuation[] showRateFluctuationArr$values = $values();
        $VALUES = showRateFluctuationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(showRateFluctuationArr$values);
    }

    public static ShowRateFluctuation valueOf(String str) {
        return (ShowRateFluctuation) Enum.valueOf(ShowRateFluctuation.class, str);
    }

    public static ShowRateFluctuation[] values() {
        return (ShowRateFluctuation[]) $VALUES.clone();
    }
}
