package com.okinc.business.dex.trade.common.reminder;

import com.google.common.net.HttpHeaders;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ReminderShowType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReminderShowType[] $VALUES;
    public static final ReminderShowType Info = new ReminderShowType("Info", 0);
    public static final ReminderShowType Warning = new ReminderShowType(HttpHeaders.WARNING, 1);
    public static final ReminderShowType Critical = new ReminderShowType("Critical", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReminderShowType[] $values() {
        return new ReminderShowType[]{Info, Warning, Critical};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReminderShowType> getEntries() {
        return $ENTRIES;
    }

    private ReminderShowType(String str, int i) {
    }

    static {
        ReminderShowType[] reminderShowTypeArr$values = $values();
        $VALUES = reminderShowTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(reminderShowTypeArr$values);
    }

    public static ReminderShowType valueOf(String str) {
        return (ReminderShowType) Enum.valueOf(ReminderShowType.class, str);
    }

    public static ReminderShowType[] values() {
        return (ReminderShowType[]) $VALUES.clone();
    }
}
