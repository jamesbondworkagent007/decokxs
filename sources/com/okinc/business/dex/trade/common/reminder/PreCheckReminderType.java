package com.okinc.business.dex.trade.common.reminder;

import com.google.common.net.HttpHeaders;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class PreCheckReminderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreCheckReminderType[] $VALUES;
    public static final PreCheckReminderType Warning = new PreCheckReminderType(HttpHeaders.WARNING, 0);
    public static final PreCheckReminderType Error = new PreCheckReminderType("Error", 1);
    public static final PreCheckReminderType Info = new PreCheckReminderType("Info", 2);
    public static final PreCheckReminderType NONE = new PreCheckReminderType("NONE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreCheckReminderType[] $values() {
        return new PreCheckReminderType[]{Warning, Error, Info, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreCheckReminderType> getEntries() {
        return $ENTRIES;
    }

    static {
        PreCheckReminderType[] preCheckReminderTypeArr$values = $values();
        $VALUES = preCheckReminderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(preCheckReminderTypeArr$values);
    }

    private PreCheckReminderType(String str, int i) {
    }

    public static PreCheckReminderType valueOf(String str) {
        return (PreCheckReminderType) Enum.valueOf(PreCheckReminderType.class, str);
    }

    public static PreCheckReminderType[] values() {
        return (PreCheckReminderType[]) $VALUES.clone();
    }
}
