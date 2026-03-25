package com.okinc.kline.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class KlineTimeAnchorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KlineTimeAnchorType[] $VALUES;
    public static final KlineTimeAnchorType AnchorLeft = new KlineTimeAnchorType("AnchorLeft", 0);
    public static final KlineTimeAnchorType AnchorCenter = new KlineTimeAnchorType("AnchorCenter", 1);
    public static final KlineTimeAnchorType AnchorRight = new KlineTimeAnchorType("AnchorRight", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KlineTimeAnchorType[] $values() {
        return new KlineTimeAnchorType[]{AnchorLeft, AnchorCenter, AnchorRight};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KlineTimeAnchorType> getEntries() {
        return $ENTRIES;
    }

    private KlineTimeAnchorType(String str, int i) {
    }

    static {
        KlineTimeAnchorType[] klineTimeAnchorTypeArr$values = $values();
        $VALUES = klineTimeAnchorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(klineTimeAnchorTypeArr$values);
    }

    public static KlineTimeAnchorType valueOf(String str) {
        return (KlineTimeAnchorType) Enum.valueOf(KlineTimeAnchorType.class, str);
    }

    public static KlineTimeAnchorType[] values() {
        return (KlineTimeAnchorType[]) $VALUES.clone();
    }
}
