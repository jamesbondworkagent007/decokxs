package com.okinc.network.okg.encrypt;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class EncryptStrategy {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EncryptStrategy[] $VALUES;
    public static final EncryptStrategy NONE = new EncryptStrategy("NONE", 0);
    public static final EncryptStrategy TIME = new EncryptStrategy("TIME", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EncryptStrategy[] $values() {
        return new EncryptStrategy[]{NONE, TIME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EncryptStrategy> getEntries() {
        return $ENTRIES;
    }

    private EncryptStrategy(String str, int i) {
    }

    static {
        EncryptStrategy[] encryptStrategyArr$values = $values();
        $VALUES = encryptStrategyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(encryptStrategyArr$values);
    }

    public static EncryptStrategy valueOf(String str) {
        return (EncryptStrategy) Enum.valueOf(EncryptStrategy.class, str);
    }

    public static EncryptStrategy[] values() {
        return (EncryptStrategy[]) $VALUES.clone();
    }
}
