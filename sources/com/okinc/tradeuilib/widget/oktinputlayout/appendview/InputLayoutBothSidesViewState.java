package com.okinc.tradeuilib.widget.oktinputlayout.appendview;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class InputLayoutBothSidesViewState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputLayoutBothSidesViewState[] $VALUES;
    public static final InputLayoutBothSidesViewState NORMAL = new InputLayoutBothSidesViewState("NORMAL", 0);
    public static final InputLayoutBothSidesViewState ACTIVE = new InputLayoutBothSidesViewState("ACTIVE", 1);
    public static final InputLayoutBothSidesViewState DISABLE = new InputLayoutBothSidesViewState("DISABLE", 2);
    public static final InputLayoutBothSidesViewState READ_ONLY = new InputLayoutBothSidesViewState("READ_ONLY", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputLayoutBothSidesViewState[] $values() {
        return new InputLayoutBothSidesViewState[]{NORMAL, ACTIVE, DISABLE, READ_ONLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputLayoutBothSidesViewState> getEntries() {
        return $ENTRIES;
    }

    private InputLayoutBothSidesViewState(String str, int i) {
    }

    static {
        InputLayoutBothSidesViewState[] inputLayoutBothSidesViewStateArr$values = $values();
        $VALUES = inputLayoutBothSidesViewStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputLayoutBothSidesViewStateArr$values);
    }

    public static InputLayoutBothSidesViewState valueOf(String str) {
        return (InputLayoutBothSidesViewState) Enum.valueOf(InputLayoutBothSidesViewState.class, str);
    }

    public static InputLayoutBothSidesViewState[] values() {
        return (InputLayoutBothSidesViewState[]) $VALUES.clone();
    }
}
