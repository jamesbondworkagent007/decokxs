package com.okinc.network.okg.dns;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class DohTypeEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DohTypeEnum[] $VALUES;
    private final String type;
    public static final DohTypeEnum HTTP = new DohTypeEnum("HTTP", 0, "http");
    public static final DohTypeEnum V5 = new DohTypeEnum("V5", 1, "v5");
    public static final DohTypeEnum DEXPRI = new DohTypeEnum("DEXPRI", 2, "dexPri");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DohTypeEnum[] $values() {
        return new DohTypeEnum[]{HTTP, V5, DEXPRI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DohTypeEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private DohTypeEnum(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        DohTypeEnum[] dohTypeEnumArr$values = $values();
        $VALUES = dohTypeEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dohTypeEnumArr$values);
    }

    public static DohTypeEnum valueOf(String str) {
        return (DohTypeEnum) Enum.valueOf(DohTypeEnum.class, str);
    }

    public static DohTypeEnum[] values() {
        return (DohTypeEnum[]) $VALUES.clone();
    }
}
