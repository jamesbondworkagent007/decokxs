package com.okinc.business.invest_biz.ui.screens.univ3.zap.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class YieldState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ YieldState[] $VALUES;
    public static final YieldState DASH = new YieldState("DASH", 0);
    public static final YieldState FILLED = new YieldState("FILLED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ YieldState[] $values() {
        return new YieldState[]{DASH, FILLED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<YieldState> getEntries() {
        return $ENTRIES;
    }

    private YieldState(String str, int i) {
    }

    static {
        YieldState[] yieldStateArr$values = $values();
        $VALUES = yieldStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(yieldStateArr$values);
    }

    public static YieldState valueOf(String str) {
        return (YieldState) Enum.valueOf(YieldState.class, str);
    }

    public static YieldState[] values() {
        return (YieldState[]) $VALUES.clone();
    }
}
