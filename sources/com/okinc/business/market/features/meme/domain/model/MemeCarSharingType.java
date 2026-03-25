package com.okinc.business.market.features.meme.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeCarSharingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeCarSharingType[] $VALUES;
    public static final MemeCarSharingType SMART_MONEY = new MemeCarSharingType("SMART_MONEY", 0);
    public static final MemeCarSharingType KOL = new MemeCarSharingType("KOL", 1);
    public static final MemeCarSharingType FOLLOWING = new MemeCarSharingType("FOLLOWING", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeCarSharingType[] $values() {
        return new MemeCarSharingType[]{SMART_MONEY, KOL, FOLLOWING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeCarSharingType> getEntries() {
        return $ENTRIES;
    }

    private MemeCarSharingType(String str, int i) {
    }

    static {
        MemeCarSharingType[] memeCarSharingTypeArr$values = $values();
        $VALUES = memeCarSharingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeCarSharingTypeArr$values);
    }

    public static MemeCarSharingType valueOf(String str) {
        return (MemeCarSharingType) Enum.valueOf(MemeCarSharingType.class, str);
    }

    public static MemeCarSharingType[] values() {
        return (MemeCarSharingType[]) $VALUES.clone();
    }
}
