package com.okinc.okassetslite.api.assets_lite_api.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityCurrencySource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ActivityCurrencySource[] $VALUES;
    public static final ActivityCurrencySource CEFI = new ActivityCurrencySource("CEFI", 0, 1);
    public static final ActivityCurrencySource DEFI = new ActivityCurrencySource("DEFI", 1, 2);
    private final int source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ActivityCurrencySource[] $values() {
        return new ActivityCurrencySource[]{CEFI, DEFI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ActivityCurrencySource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSource() {
        return this.source;
    }

    private ActivityCurrencySource(String str, int i, int i2) {
        this.source = i2;
    }

    static {
        ActivityCurrencySource[] activityCurrencySourceArr$values = $values();
        $VALUES = activityCurrencySourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(activityCurrencySourceArr$values);
    }

    public static ActivityCurrencySource valueOf(String str) {
        return (ActivityCurrencySource) Enum.valueOf(ActivityCurrencySource.class, str);
    }

    public static ActivityCurrencySource[] values() {
        return (ActivityCurrencySource[]) $VALUES.clone();
    }
}
