package com.okinc.core.ktx;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class MatchPattern {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MatchPattern[] $VALUES;
    public static final MatchPattern FIRST_ONLY = new MatchPattern("FIRST_ONLY", 0);
    public static final MatchPattern LAST_ONLY = new MatchPattern("LAST_ONLY", 1);
    public static final MatchPattern CONTAINS = new MatchPattern("CONTAINS", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MatchPattern[] $values() {
        return new MatchPattern[]{FIRST_ONLY, LAST_ONLY, CONTAINS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MatchPattern> getEntries() {
        return $ENTRIES;
    }

    private MatchPattern(String str, int i) {
    }

    static {
        MatchPattern[] matchPatternArr$values = $values();
        $VALUES = matchPatternArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(matchPatternArr$values);
    }

    public static MatchPattern valueOf(String str) {
        return (MatchPattern) Enum.valueOf(MatchPattern.class, str);
    }

    public static MatchPattern[] values() {
        return (MatchPattern[]) $VALUES.clone();
    }
}
