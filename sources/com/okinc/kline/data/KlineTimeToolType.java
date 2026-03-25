package com.okinc.kline.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class KlineTimeToolType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KlineTimeToolType[] $VALUES;
    public static final KlineTimeToolType KLineJump = new KlineTimeToolType("KLineJump", 0);
    public static final KlineTimeToolType KLineTimeAnchor = new KlineTimeToolType("KLineTimeAnchor", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KlineTimeToolType[] $values() {
        return new KlineTimeToolType[]{KLineJump, KLineTimeAnchor};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KlineTimeToolType> getEntries() {
        return $ENTRIES;
    }

    private KlineTimeToolType(String str, int i) {
    }

    static {
        KlineTimeToolType[] klineTimeToolTypeArr$values = $values();
        $VALUES = klineTimeToolTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(klineTimeToolTypeArr$values);
    }

    public static KlineTimeToolType valueOf(String str) {
        return (KlineTimeToolType) Enum.valueOf(KlineTimeToolType.class, str);
    }

    public static KlineTimeToolType[] values() {
        return (KlineTimeToolType[]) $VALUES.clone();
    }
}
