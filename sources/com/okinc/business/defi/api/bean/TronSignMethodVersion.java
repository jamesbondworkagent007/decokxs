package com.okinc.business.defi.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TronSignMethodVersion {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TronSignMethodVersion[] $VALUES;
    public static final TronSignMethodVersion V1 = new TronSignMethodVersion("V1", 0, 1);
    public static final TronSignMethodVersion V2 = new TronSignMethodVersion("V2", 1, 2);
    private final int version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TronSignMethodVersion[] $values() {
        return new TronSignMethodVersion[]{V1, V2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TronSignMethodVersion> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVersion() {
        return this.version;
    }

    private TronSignMethodVersion(String str, int i, int i2) {
        this.version = i2;
    }

    static {
        TronSignMethodVersion[] tronSignMethodVersionArr$values = $values();
        $VALUES = tronSignMethodVersionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tronSignMethodVersionArr$values);
    }

    public static TronSignMethodVersion valueOf(String str) {
        return (TronSignMethodVersion) Enum.valueOf(TronSignMethodVersion.class, str);
    }

    public static TronSignMethodVersion[] values() {
        return (TronSignMethodVersion[]) $VALUES.clone();
    }
}
