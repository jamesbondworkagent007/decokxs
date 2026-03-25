package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AAMessageSignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AAMessageSignType[] $VALUES;
    public static final AAMessageSignType NORMAL = new AAMessageSignType("NORMAL", 0);
    public static final AAMessageSignType DIRECT = new AAMessageSignType("DIRECT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AAMessageSignType[] $values() {
        return new AAMessageSignType[]{NORMAL, DIRECT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AAMessageSignType> getEntries() {
        return $ENTRIES;
    }

    private AAMessageSignType(String str, int i) {
    }

    static {
        AAMessageSignType[] aAMessageSignTypeArr$values = $values();
        $VALUES = aAMessageSignTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aAMessageSignTypeArr$values);
    }

    public static AAMessageSignType valueOf(String str) {
        return (AAMessageSignType) Enum.valueOf(AAMessageSignType.class, str);
    }

    public static AAMessageSignType[] values() {
        return (AAMessageSignType[]) $VALUES.clone();
    }
}
