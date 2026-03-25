package com.okinc.business.dex.trade.common.reminder;

import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class PreCheckStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreCheckStatus[] $VALUES;
    public static final PreCheckStatus None = new PreCheckStatus("None", 0);
    public static final PreCheckStatus ERROR = new PreCheckStatus(EventType.ERROR, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreCheckStatus[] $values() {
        return new PreCheckStatus[]{None, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreCheckStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        PreCheckStatus[] preCheckStatusArr$values = $values();
        $VALUES = preCheckStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(preCheckStatusArr$values);
    }

    private PreCheckStatus(String str, int i) {
    }

    public static PreCheckStatus valueOf(String str) {
        return (PreCheckStatus) Enum.valueOf(PreCheckStatus.class, str);
    }

    public static PreCheckStatus[] values() {
        return (PreCheckStatus[]) $VALUES.clone();
    }
}
