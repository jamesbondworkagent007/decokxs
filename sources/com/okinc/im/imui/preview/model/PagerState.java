package com.okinc.im.imui.preview.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class PagerState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PagerState[] $VALUES;
    public static final PagerState TRANSITION_PROXY = new PagerState("TRANSITION_PROXY", 0);
    public static final PagerState MAIN_CONTENT = new PagerState("MAIN_CONTENT", 1);
    public static final PagerState PREPARE_FOR_FINISH = new PagerState("PREPARE_FOR_FINISH", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PagerState[] $values() {
        return new PagerState[]{TRANSITION_PROXY, MAIN_CONTENT, PREPARE_FOR_FINISH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PagerState> getEntries() {
        return $ENTRIES;
    }

    private PagerState(String str, int i) {
    }

    static {
        PagerState[] pagerStateArr$values = $values();
        $VALUES = pagerStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pagerStateArr$values);
    }

    public static PagerState valueOf(String str) {
        return (PagerState) Enum.valueOf(PagerState.class, str);
    }

    public static PagerState[] values() {
        return (PagerState[]) $VALUES.clone();
    }
}
