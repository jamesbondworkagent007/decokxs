package com.okinc.assets.api.utils;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class PnlState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PnlState[] $VALUES;
    public static final PnlState Neutral = new PnlState("Neutral", 0);
    public static final PnlState Rise = new PnlState("Rise", 1);
    public static final PnlState Fall = new PnlState("Fall", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PnlState[] $values() {
        return new PnlState[]{Neutral, Rise, Fall};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PnlState> getEntries() {
        return $ENTRIES;
    }

    static {
        PnlState[] pnlStateArr$values = $values();
        $VALUES = pnlStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pnlStateArr$values);
    }

    private PnlState(String str, int i) {
    }

    public static PnlState valueOf(String str) {
        return (PnlState) Enum.valueOf(PnlState.class, str);
    }

    public static PnlState[] values() {
        return (PnlState[]) $VALUES.clone();
    }
}
