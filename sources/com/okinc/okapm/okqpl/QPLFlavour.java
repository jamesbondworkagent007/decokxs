package com.okinc.okapm.okqpl;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class QPLFlavour {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QPLFlavour[] $VALUES;
    public static final QPLFlavour FRAGMENT = new QPLFlavour("FRAGMENT", 0);
    public static final QPLFlavour DEFAULT = new QPLFlavour("DEFAULT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QPLFlavour[] $values() {
        return new QPLFlavour[]{FRAGMENT, DEFAULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QPLFlavour> getEntries() {
        return $ENTRIES;
    }

    private QPLFlavour(String str, int i) {
    }

    static {
        QPLFlavour[] qPLFlavourArr$values = $values();
        $VALUES = qPLFlavourArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(qPLFlavourArr$values);
    }

    public static QPLFlavour valueOf(String str) {
        return (QPLFlavour) Enum.valueOf(QPLFlavour.class, str);
    }

    public static QPLFlavour[] values() {
        return (QPLFlavour[]) $VALUES.clone();
    }
}
