package com.okinc.business.defi.wallet.tee.common.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class TeeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TeeType[] $VALUES;
    public static final TeeType PRIVATE_TEE = new TeeType("PRIVATE_TEE", 0, 1);
    public static final TeeType SEED_TEE = new TeeType("SEED_TEE", 1, 2);
    private final int typeCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TeeType[] $values() {
        return new TeeType[]{PRIVATE_TEE, SEED_TEE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TeeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTypeCode() {
        return this.typeCode;
    }

    private TeeType(String str, int i, int i2) {
        this.typeCode = i2;
    }

    static {
        TeeType[] teeTypeArr$values = $values();
        $VALUES = teeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(teeTypeArr$values);
    }

    public static TeeType valueOf(String str) {
        return (TeeType) Enum.valueOf(TeeType.class, str);
    }

    public static TeeType[] values() {
        return (TeeType[]) $VALUES.clone();
    }
}
