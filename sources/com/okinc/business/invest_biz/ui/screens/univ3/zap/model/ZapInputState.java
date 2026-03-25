package com.okinc.business.invest_biz.ui.screens.univ3.zap.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ZapInputState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ZapInputState[] $VALUES;
    public static final ZapInputState EMPTY = new ZapInputState("EMPTY", 0);
    public static final ZapInputState HAS_INPUT = new ZapInputState("HAS_INPUT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ZapInputState[] $values() {
        return new ZapInputState[]{EMPTY, HAS_INPUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ZapInputState> getEntries() {
        return $ENTRIES;
    }

    private ZapInputState(String str, int i) {
    }

    static {
        ZapInputState[] zapInputStateArr$values = $values();
        $VALUES = zapInputStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(zapInputStateArr$values);
    }

    public static ZapInputState valueOf(String str) {
        return (ZapInputState) Enum.valueOf(ZapInputState.class, str);
    }

    public static ZapInputState[] values() {
        return (ZapInputState[]) $VALUES.clone();
    }
}
