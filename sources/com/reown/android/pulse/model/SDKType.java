package com.reown.android.pulse.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SDKType {
    public static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    public static final /* synthetic */ SDKType[] $VALUES;
    public static final SDKType APPKIT = new SDKType("APPKIT", 0, "appkit");
    public static final SDKType EVENTS = new SDKType("EVENTS", 1, "events_sdk");
    public final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ SDKType[] $values() {
        return new SDKType[]{APPKIT, EVENTS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SDKType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SDKType valueOf(String str) {
        return (SDKType) Enum.valueOf(SDKType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static SDKType[] values() {
        return (SDKType[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    public SDKType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        SDKType[] sDKTypeArr$values = $values();
        $VALUES = sDKTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sDKTypeArr$values);
    }
}
