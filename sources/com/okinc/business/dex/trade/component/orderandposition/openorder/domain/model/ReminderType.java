package com.okinc.business.dex.trade.component.orderandposition.openorder.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ReminderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReminderType[] $VALUES;
    public static final ReminderType None = new ReminderType("None", 0);
    public static final ReminderType NeedUpgradeSaVersion = new ReminderType("NeedUpgradeSaVersion", 1);
    public static final ReminderType NeedRenewal = new ReminderType("NeedRenewal", 2);
    public static final ReminderType Keep = new ReminderType("Keep", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReminderType[] $values() {
        return new ReminderType[]{None, NeedUpgradeSaVersion, NeedRenewal, Keep};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReminderType> getEntries() {
        return $ENTRIES;
    }

    private ReminderType(String str, int i) {
    }

    static {
        ReminderType[] reminderTypeArr$values = $values();
        $VALUES = reminderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(reminderTypeArr$values);
    }

    public static ReminderType valueOf(String str) {
        return (ReminderType) Enum.valueOf(ReminderType.class, str);
    }

    public static ReminderType[] values() {
        return (ReminderType[]) $VALUES.clone();
    }
}
