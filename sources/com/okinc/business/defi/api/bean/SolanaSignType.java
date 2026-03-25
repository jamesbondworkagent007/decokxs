package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SolanaSignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SolanaSignType[] $VALUES;
    public static final SolanaSignType NORMAL = new SolanaSignType("NORMAL", 0);
    public static final SolanaSignType FAST = new SolanaSignType("FAST", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SolanaSignType[] $values() {
        return new SolanaSignType[]{NORMAL, FAST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SolanaSignType> getEntries() {
        return $ENTRIES;
    }

    private SolanaSignType(String str, int i) {
    }

    static {
        SolanaSignType[] solanaSignTypeArr$values = $values();
        $VALUES = solanaSignTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(solanaSignTypeArr$values);
    }

    public static SolanaSignType valueOf(String str) {
        return (SolanaSignType) Enum.valueOf(SolanaSignType.class, str);
    }

    public static SolanaSignType[] values() {
        return (SolanaSignType[]) $VALUES.clone();
    }
}
