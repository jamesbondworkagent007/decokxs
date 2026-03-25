package com.okinc.business.market.data.model.alert;

import androidx.annotation.StringRes;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class AlertTimeFrame {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlertTimeFrame[] $VALUES;
    private final int titleResId;
    public static final AlertTimeFrame FIVE_MINUTES = new AlertTimeFrame("FIVE_MINUTES", 0, C23274hvD.Fragment.DuQ);
    public static final AlertTimeFrame ONE_HOUR = new AlertTimeFrame("ONE_HOUR", 1, C23274hvD.Fragment.sSi);
    public static final AlertTimeFrame FOUR_HOURS = new AlertTimeFrame("FOUR_HOURS", 2, C23274hvD.Fragment.ZGRCNj);
    public static final AlertTimeFrame TWENTY_FOUR_HOURS = new AlertTimeFrame("TWENTY_FOUR_HOURS", 3, C23274hvD.Fragment.ZNPcth);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlertTimeFrame[] $values() {
        return new AlertTimeFrame[]{FIVE_MINUTES, ONE_HOUR, FOUR_HOURS, TWENTY_FOUR_HOURS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlertTimeFrame> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    private AlertTimeFrame(@StringRes String str, int i, int i2) {
        this.titleResId = i2;
    }

    static {
        AlertTimeFrame[] alertTimeFrameArr$values = $values();
        $VALUES = alertTimeFrameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alertTimeFrameArr$values);
    }

    public static AlertTimeFrame valueOf(String str) {
        return (AlertTimeFrame) Enum.valueOf(AlertTimeFrame.class, str);
    }

    public static AlertTimeFrame[] values() {
        return (AlertTimeFrame[]) $VALUES.clone();
    }
}
