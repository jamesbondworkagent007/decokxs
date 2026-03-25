package com.okinc.dexkline.market.features.data.ui.holder;

import o.C35964oKf;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class HolderTimeframe {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HolderTimeframe[] $VALUES;
    public static final HolderTimeframe DAILY = new HolderTimeframe("DAILY", 0, C35964oKf.Fragment.DBxZfM);
    public static final HolderTimeframe WEEKLY = new HolderTimeframe("WEEKLY", 1, C35964oKf.Fragment.DGOPHZDGOPHZ);
    private final int resourceId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HolderTimeframe[] $values() {
        return new HolderTimeframe[]{DAILY, WEEKLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HolderTimeframe> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResourceId() {
        return this.resourceId;
    }

    private HolderTimeframe(String str, int i, int i2) {
        this.resourceId = i2;
    }

    static {
        HolderTimeframe[] holderTimeframeArr$values = $values();
        $VALUES = holderTimeframeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(holderTimeframeArr$values);
    }

    public static HolderTimeframe valueOf(String str) {
        return (HolderTimeframe) Enum.valueOf(HolderTimeframe.class, str);
    }

    public static HolderTimeframe[] values() {
        return (HolderTimeframe[]) $VALUES.clone();
    }
}
