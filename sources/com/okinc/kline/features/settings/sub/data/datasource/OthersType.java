package com.okinc.kline.features.settings.sub.data.datasource;

import o.C56444yFp;
import o.InterfaceC36227oTz;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class OthersType implements InterfaceC36227oTz {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OthersType[] $VALUES;
    public static final OthersType SyncDrawing = new OthersType("SyncDrawing", 0);
    public static final OthersType RemoveDrawing = new OthersType("RemoveDrawing", 1);
    public static final OthersType FloatingWidget = new OthersType("FloatingWidget", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OthersType[] $values() {
        return new OthersType[]{SyncDrawing, RemoveDrawing, FloatingWidget};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OthersType> getEntries() {
        return $ENTRIES;
    }

    private OthersType(String str, int i) {
    }

    static {
        OthersType[] othersTypeArr$values = $values();
        $VALUES = othersTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(othersTypeArr$values);
    }

    public static OthersType valueOf(String str) {
        return (OthersType) Enum.valueOf(OthersType.class, str);
    }

    public static OthersType[] values() {
        return (OthersType[]) $VALUES.clone();
    }
}
