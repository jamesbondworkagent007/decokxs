package com.okinc.okex.lite.home.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PreLoginSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreLoginSource[] $VALUES;
    public static final PreLoginSource HOME = new PreLoginSource("HOME", 0);
    public static final PreLoginSource PORTFOLIO = new PreLoginSource("PORTFOLIO", 1);
    public static final PreLoginSource EXPLORE = new PreLoginSource("EXPLORE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreLoginSource[] $values() {
        return new PreLoginSource[]{HOME, PORTFOLIO, EXPLORE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreLoginSource> getEntries() {
        return $ENTRIES;
    }

    private PreLoginSource(String str, int i) {
    }

    static {
        PreLoginSource[] preLoginSourceArr$values = $values();
        $VALUES = preLoginSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(preLoginSourceArr$values);
    }

    public static PreLoginSource valueOf(String str) {
        return (PreLoginSource) Enum.valueOf(PreLoginSource.class, str);
    }

    public static PreLoginSource[] values() {
        return (PreLoginSource[]) $VALUES.clone();
    }
}
