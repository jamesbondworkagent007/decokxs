package com.okinc.business.market.features.meme.aped_together.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class KolType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KolType[] $VALUES;
    public static final KolType INFLUENCER = new KolType("INFLUENCER", 0);
    public static final KolType SMART_MONEY = new KolType("SMART_MONEY", 1);
    public static final KolType FOLLOWING = new KolType("FOLLOWING", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KolType[] $values() {
        return new KolType[]{INFLUENCER, SMART_MONEY, FOLLOWING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KolType> getEntries() {
        return $ENTRIES;
    }

    private KolType(String str, int i) {
    }

    static {
        KolType[] kolTypeArr$values = $values();
        $VALUES = kolTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kolTypeArr$values);
    }

    public static KolType valueOf(String str) {
        return (KolType) Enum.valueOf(KolType.class, str);
    }

    public static KolType[] values() {
        return (KolType[]) $VALUES.clone();
    }
}
