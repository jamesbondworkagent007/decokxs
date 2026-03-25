package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import androidx.annotation.StringRes;
import o.C56444yFp;
import o.C8195ayE;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class Period {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Period[] $VALUES;
    private final int periodText;
    public static final Period SEVEN_DAYS = new Period("SEVEN_DAYS", 0, C8195ayE.ActionBar.fIwbmz);
    public static final Period THIRTY_DAYS = new Period("THIRTY_DAYS", 1, C8195ayE.ActionBar.fJNWhG);
    public static final Period NINETY_DAYS = new Period("NINETY_DAYS", 2, C8195ayE.ActionBar.ejfBZ);
    public static final Period CUSTOM = new Period("CUSTOM", 3, C8195ayE.ActionBar.fetchVPNInfo);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Period[] $values() {
        return new Period[]{SEVEN_DAYS, THIRTY_DAYS, NINETY_DAYS, CUSTOM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Period> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPeriodText() {
        return this.periodText;
    }

    private Period(@StringRes String str, int i, int i2) {
        this.periodText = i2;
    }

    static {
        Period[] periodArr$values = $values();
        $VALUES = periodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(periodArr$values);
    }

    public static Period valueOf(String str) {
        return (Period) Enum.valueOf(Period.class, str);
    }

    public static Period[] values() {
        return (Period[]) $VALUES.clone();
    }
}
