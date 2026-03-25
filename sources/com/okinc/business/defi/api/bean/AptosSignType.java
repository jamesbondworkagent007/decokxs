package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AptosSignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AptosSignType[] $VALUES;
    public static final AptosSignType SIGN_PAYLOAD = new AptosSignType("SIGN_PAYLOAD", 0);
    public static final AptosSignType SIGN_SCRIPT = new AptosSignType("SIGN_SCRIPT", 1);
    public static final AptosSignType SIGN_RAW_SIMPLE = new AptosSignType("SIGN_RAW_SIMPLE", 2);
    public static final AptosSignType SIGN_RAW_MULTI_AGENT = new AptosSignType("SIGN_RAW_MULTI_AGENT", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AptosSignType[] $values() {
        return new AptosSignType[]{SIGN_PAYLOAD, SIGN_SCRIPT, SIGN_RAW_SIMPLE, SIGN_RAW_MULTI_AGENT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AptosSignType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSignRaw() {
        return this == SIGN_RAW_SIMPLE || this == SIGN_RAW_MULTI_AGENT;
    }

    private AptosSignType(String str, int i) {
    }

    static {
        AptosSignType[] aptosSignTypeArr$values = $values();
        $VALUES = aptosSignTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aptosSignTypeArr$values);
    }

    public static AptosSignType valueOf(String str) {
        return (AptosSignType) Enum.valueOf(AptosSignType.class, str);
    }

    public static AptosSignType[] values() {
        return (AptosSignType[]) $VALUES.clone();
    }
}
