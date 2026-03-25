package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MpcSignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MpcSignType[] $VALUES;
    public static final MpcSignType NORMAL = new MpcSignType("NORMAL", 0);
    public static final MpcSignType SHARE2 = new MpcSignType("SHARE2", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MpcSignType[] $values() {
        return new MpcSignType[]{NORMAL, SHARE2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MpcSignType> getEntries() {
        return $ENTRIES;
    }

    private MpcSignType(String str, int i) {
    }

    static {
        MpcSignType[] mpcSignTypeArr$values = $values();
        $VALUES = mpcSignTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mpcSignTypeArr$values);
    }

    public static MpcSignType valueOf(String str) {
        return (MpcSignType) Enum.valueOf(MpcSignType.class, str);
    }

    public static MpcSignType[] values() {
        return (MpcSignType[]) $VALUES.clone();
    }
}
