package com.okinc.okex.lite.onboarding.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class WelcomeDataType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ WelcomeDataType[] $VALUES;
    public static final WelcomeDataType HEADER = new WelcomeDataType("HEADER", 0, 0);
    public static final WelcomeDataType STEP = new WelcomeDataType("STEP", 1, 1);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ WelcomeDataType[] $values() {
        return new WelcomeDataType[]{HEADER, STEP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<WelcomeDataType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private WelcomeDataType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        WelcomeDataType[] welcomeDataTypeArr$values = $values();
        $VALUES = welcomeDataTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(welcomeDataTypeArr$values);
    }

    public static WelcomeDataType valueOf(String str) {
        return (WelcomeDataType) Enum.valueOf(WelcomeDataType.class, str);
    }

    public static WelcomeDataType[] values() {
        return (WelcomeDataType[]) $VALUES.clone();
    }
}
