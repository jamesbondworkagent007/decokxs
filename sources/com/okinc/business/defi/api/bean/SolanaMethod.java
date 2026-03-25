package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SolanaMethod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SolanaMethod[] $VALUES;
    public static final SolanaMethod SIGN_ALL_TRANSACTIONS = new SolanaMethod("SIGN_ALL_TRANSACTIONS", 0, "signAllTransactions");
    private final String method;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SolanaMethod[] $values() {
        return new SolanaMethod[]{SIGN_ALL_TRANSACTIONS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SolanaMethod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    private SolanaMethod(String str, int i, String str2) {
        this.method = str2;
    }

    static {
        SolanaMethod[] solanaMethodArr$values = $values();
        $VALUES = solanaMethodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(solanaMethodArr$values);
    }

    public static SolanaMethod valueOf(String str) {
        return (SolanaMethod) Enum.valueOf(SolanaMethod.class, str);
    }

    public static SolanaMethod[] values() {
        return (SolanaMethod[]) $VALUES.clone();
    }
}
