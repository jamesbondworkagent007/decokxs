package com.okinc.business.dex.trade.common.reminder.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ReminderTierType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReminderTierType[] $VALUES;
    public static final ReminderTierType Blocking = new ReminderTierType("Blocking", 0);
    public static final ReminderTierType TokenAttribute = new ReminderTierType("TokenAttribute", 1);
    public static final ReminderTierType TradeFailure = new ReminderTierType("TradeFailure", 2);
    public static final ReminderTierType TradeRisk = new ReminderTierType("TradeRisk", 3);
    public static final ReminderTierType TradeRule = new ReminderTierType("TradeRule", 4);
    public static final ReminderTierType AccountStatus = new ReminderTierType("AccountStatus", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReminderTierType[] $values() {
        return new ReminderTierType[]{Blocking, TokenAttribute, TradeFailure, TradeRisk, TradeRule, AccountStatus};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReminderTierType> getEntries() {
        return $ENTRIES;
    }

    private ReminderTierType(String str, int i) {
    }

    static {
        ReminderTierType[] reminderTierTypeArr$values = $values();
        $VALUES = reminderTierTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(reminderTierTypeArr$values);
    }

    public static ReminderTierType valueOf(String str) {
        return (ReminderTierType) Enum.valueOf(ReminderTierType.class, str);
    }

    public static ReminderTierType[] values() {
        return (ReminderTierType[]) $VALUES.clone();
    }
}
