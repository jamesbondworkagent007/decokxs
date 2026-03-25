package com.okinc.tradeuilib.widget.oktinputlayout.core;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class InputLayoutState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputLayoutState[] $VALUES;
    public static final InputLayoutState NORMAL = new InputLayoutState("NORMAL", 0);
    public static final InputLayoutState NORMAL_UN_CLICKABLE = new InputLayoutState("NORMAL_UN_CLICKABLE", 1);
    public static final InputLayoutState GREY_CLICKABLE = new InputLayoutState("GREY_CLICKABLE", 2);
    public static final InputLayoutState GREY_UN_CLICKABLE = new InputLayoutState("GREY_UN_CLICKABLE", 3);
    public static final InputLayoutState JUST_READ = new InputLayoutState("JUST_READ", 4);
    public static final InputLayoutState JUST_READ_CLICKABLE = new InputLayoutState("JUST_READ_CLICKABLE", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputLayoutState[] $values() {
        return new InputLayoutState[]{NORMAL, NORMAL_UN_CLICKABLE, GREY_CLICKABLE, GREY_UN_CLICKABLE, JUST_READ, JUST_READ_CLICKABLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputLayoutState> getEntries() {
        return $ENTRIES;
    }

    private InputLayoutState(String str, int i) {
    }

    static {
        InputLayoutState[] inputLayoutStateArr$values = $values();
        $VALUES = inputLayoutStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputLayoutStateArr$values);
    }

    public static InputLayoutState valueOf(String str) {
        return (InputLayoutState) Enum.valueOf(InputLayoutState.class, str);
    }

    public static InputLayoutState[] values() {
        return (InputLayoutState[]) $VALUES.clone();
    }
}
