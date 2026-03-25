package com.okinc.cruilib.compose.library.revealswipe;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class RevealDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RevealDirection[] $VALUES;
    public static final RevealDirection StartToEnd = new RevealDirection("StartToEnd", 0);
    public static final RevealDirection EndToStart = new RevealDirection("EndToStart", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RevealDirection[] $values() {
        return new RevealDirection[]{StartToEnd, EndToStart};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RevealDirection> getEntries() {
        return $ENTRIES;
    }

    private RevealDirection(String str, int i) {
    }

    static {
        RevealDirection[] revealDirectionArr$values = $values();
        $VALUES = revealDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(revealDirectionArr$values);
    }

    public static RevealDirection valueOf(String str) {
        return (RevealDirection) Enum.valueOf(RevealDirection.class, str);
    }

    public static RevealDirection[] values() {
        return (RevealDirection[]) $VALUES.clone();
    }
}
