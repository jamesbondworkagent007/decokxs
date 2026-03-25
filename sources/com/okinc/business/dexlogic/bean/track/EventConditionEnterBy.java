package com.okinc.business.dexlogic.bean.track;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EventConditionEnterBy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EventConditionEnterBy[] $VALUES;
    public static final EventConditionEnterBy Manual = new EventConditionEnterBy("Manual", 0, "manual");
    public static final EventConditionEnterBy Quick_button = new EventConditionEnterBy("Quick_button", 1, "quick_button");
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EventConditionEnterBy[] $values() {
        return new EventConditionEnterBy[]{Manual, Quick_button};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EventConditionEnterBy> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private EventConditionEnterBy(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        EventConditionEnterBy[] eventConditionEnterByArr$values = $values();
        $VALUES = eventConditionEnterByArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(eventConditionEnterByArr$values);
    }

    public static EventConditionEnterBy valueOf(String str) {
        return (EventConditionEnterBy) Enum.valueOf(EventConditionEnterBy.class, str);
    }

    public static EventConditionEnterBy[] values() {
        return (EventConditionEnterBy[]) $VALUES.clone();
    }
}
