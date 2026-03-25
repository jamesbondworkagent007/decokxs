package com.okinc.okpaymentapi.data.remote.model.management;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class KycType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KycType[] $VALUES;
    private final int type;
    public static final KycType RETAIL = new KycType("RETAIL", 0, 0);
    public static final KycType INSTITUTIONAL = new KycType("INSTITUTIONAL", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KycType[] $values() {
        return new KycType[]{RETAIL, INSTITUTIONAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KycType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private KycType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        KycType[] kycTypeArr$values = $values();
        $VALUES = kycTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kycTypeArr$values);
    }

    public static KycType valueOf(String str) {
        return (KycType) Enum.valueOf(KycType.class, str);
    }

    public static KycType[] values() {
        return (KycType[]) $VALUES.clone();
    }
}
