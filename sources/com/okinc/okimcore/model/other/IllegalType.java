package com.okinc.okimcore.model.other;

import com.google.common.net.HttpHeaders;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class IllegalType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IllegalType[] $VALUES;
    public static final IllegalType Legality = new IllegalType("Legality", 0);
    public static final IllegalType Link = new IllegalType(HttpHeaders.LINK, 1);
    public static final IllegalType Sensitive_Keywords = new IllegalType("Sensitive_Keywords", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IllegalType[] $values() {
        return new IllegalType[]{Legality, Link, Sensitive_Keywords};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IllegalType> getEntries() {
        return $ENTRIES;
    }

    private IllegalType(String str, int i) {
    }

    static {
        IllegalType[] illegalTypeArr$values = $values();
        $VALUES = illegalTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(illegalTypeArr$values);
    }

    public static IllegalType valueOf(String str) {
        return (IllegalType) Enum.valueOf(IllegalType.class, str);
    }

    public static IllegalType[] values() {
        return (IllegalType[]) $VALUES.clone();
    }
}
