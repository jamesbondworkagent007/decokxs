package com.okinc.business.defi.biz.core.tx.check;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ChainCheckType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChainCheckType[] $VALUES;
    public static final ChainCheckType CHECK_TRANSFER = new ChainCheckType("CHECK_TRANSFER", 0);
    public static final ChainCheckType CHECK_REGISTER = new ChainCheckType("CHECK_REGISTER", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChainCheckType[] $values() {
        return new ChainCheckType[]{CHECK_TRANSFER, CHECK_REGISTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChainCheckType> getEntries() {
        return $ENTRIES;
    }

    private ChainCheckType(String str, int i) {
    }

    static {
        ChainCheckType[] chainCheckTypeArr$values = $values();
        $VALUES = chainCheckTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chainCheckTypeArr$values);
    }

    public static ChainCheckType valueOf(String str) {
        return (ChainCheckType) Enum.valueOf(ChainCheckType.class, str);
    }

    public static ChainCheckType[] values() {
        return (ChainCheckType[]) $VALUES.clone();
    }
}
