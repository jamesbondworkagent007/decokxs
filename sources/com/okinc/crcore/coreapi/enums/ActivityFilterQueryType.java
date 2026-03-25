package com.okinc.crcore.coreapi.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityFilterQueryType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ActivityFilterQueryType[] $VALUES;
    public static final ActivityFilterQueryType BUYSELL = new ActivityFilterQueryType("BUYSELL", 0, 3);
    public static final ActivityFilterQueryType OTHER = new ActivityFilterQueryType("OTHER", 1, 4);
    private final int queryType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ActivityFilterQueryType[] $values() {
        return new ActivityFilterQueryType[]{BUYSELL, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ActivityFilterQueryType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getQueryType() {
        return this.queryType;
    }

    private ActivityFilterQueryType(String str, int i, int i2) {
        this.queryType = i2;
    }

    static {
        ActivityFilterQueryType[] activityFilterQueryTypeArr$values = $values();
        $VALUES = activityFilterQueryTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(activityFilterQueryTypeArr$values);
    }

    public static ActivityFilterQueryType valueOf(String str) {
        return (ActivityFilterQueryType) Enum.valueOf(ActivityFilterQueryType.class, str);
    }

    public static ActivityFilterQueryType[] values() {
        return (ActivityFilterQueryType[]) $VALUES.clone();
    }
}
