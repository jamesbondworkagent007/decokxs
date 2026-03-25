package com.okinc.tradeuilib.imgs;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class RemoteSupportedScaleType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RemoteSupportedScaleType[] $VALUES;
    public static final RemoteSupportedScaleType CENTER_CROP = new RemoteSupportedScaleType("CENTER_CROP", 0);
    public static final RemoteSupportedScaleType CENTER_INSIDE = new RemoteSupportedScaleType("CENTER_INSIDE", 1);
    public static final RemoteSupportedScaleType FIT_CENTER = new RemoteSupportedScaleType("FIT_CENTER", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RemoteSupportedScaleType[] $values() {
        return new RemoteSupportedScaleType[]{CENTER_CROP, CENTER_INSIDE, FIT_CENTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RemoteSupportedScaleType> getEntries() {
        return $ENTRIES;
    }

    private RemoteSupportedScaleType(String str, int i) {
    }

    static {
        RemoteSupportedScaleType[] remoteSupportedScaleTypeArr$values = $values();
        $VALUES = remoteSupportedScaleTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(remoteSupportedScaleTypeArr$values);
    }

    public static RemoteSupportedScaleType valueOf(String str) {
        return (RemoteSupportedScaleType) Enum.valueOf(RemoteSupportedScaleType.class, str);
    }

    public static RemoteSupportedScaleType[] values() {
        return (RemoteSupportedScaleType[]) $VALUES.clone();
    }
}
