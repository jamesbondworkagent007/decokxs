package com.okinc.okapm.okqpl;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class QPLType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QPLType[] $VALUES;
    private final String value;
    public static final QPLType LIFE_CYCLE = new QPLType("LIFE_CYCLE", 0, "life_cycle");
    public static final QPLType NETWORK = new QPLType("NETWORK", 1, "network-dep");
    public static final QPLType TAP = new QPLType("TAP", 2, "tap");
    public static final QPLType CUSTOM = new QPLType("CUSTOM", 3, "custom");
    public static final QPLType WS = new QPLType("WS", 4, "ws");
    public static final QPLType NETWORKV2 = new QPLType("NETWORKV2", 5, "network");
    public static final QPLType MODULE_LAUNCH_TIME = new QPLType("MODULE_LAUNCH_TIME", 6, "module_launch_time");
    public static final QPLType APP_LAUNCH_TIME = new QPLType("APP_LAUNCH_TIME", 7, "app_launch_time");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QPLType[] $values() {
        return new QPLType[]{LIFE_CYCLE, NETWORK, TAP, CUSTOM, WS, NETWORKV2, MODULE_LAUNCH_TIME, APP_LAUNCH_TIME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QPLType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private QPLType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        QPLType[] qPLTypeArr$values = $values();
        $VALUES = qPLTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(qPLTypeArr$values);
    }

    public static QPLType valueOf(String str) {
        return (QPLType) Enum.valueOf(QPLType.class, str);
    }

    public static QPLType[] values() {
        return (QPLType[]) $VALUES.clone();
    }
}
