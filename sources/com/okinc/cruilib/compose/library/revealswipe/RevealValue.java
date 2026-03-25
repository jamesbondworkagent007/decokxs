package com.okinc.cruilib.compose.library.revealswipe;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class RevealValue {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RevealValue[] $VALUES;
    public static final RevealValue Default = new RevealValue("Default", 0);
    public static final RevealValue PartiallyRevealedEnd = new RevealValue("PartiallyRevealedEnd", 1);
    public static final RevealValue PartiallyRevealedStart = new RevealValue("PartiallyRevealedStart", 2);
    public static final RevealValue FullyRevealedEnd = new RevealValue("FullyRevealedEnd", 3);
    public static final RevealValue FullyRevealedStart = new RevealValue("FullyRevealedStart", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RevealValue[] $values() {
        return new RevealValue[]{Default, PartiallyRevealedEnd, PartiallyRevealedStart, FullyRevealedEnd, FullyRevealedStart};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RevealValue> getEntries() {
        return $ENTRIES;
    }

    private RevealValue(String str, int i) {
    }

    static {
        RevealValue[] revealValueArr$values = $values();
        $VALUES = revealValueArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(revealValueArr$values);
    }

    public static RevealValue valueOf(String str) {
        return (RevealValue) Enum.valueOf(RevealValue.class, str);
    }

    public static RevealValue[] values() {
        return (RevealValue[]) $VALUES.clone();
    }
}
