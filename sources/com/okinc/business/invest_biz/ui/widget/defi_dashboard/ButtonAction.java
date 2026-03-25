package com.okinc.business.invest_biz.ui.widget.defi_dashboard;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ButtonAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ButtonAction[] $VALUES;
    public static final ButtonAction CLAIM = new ButtonAction("CLAIM", 0);
    public static final ButtonAction ADD_LIQUIDITY = new ButtonAction("ADD_LIQUIDITY", 1);
    public static final ButtonAction COLLECT_FEES = new ButtonAction("COLLECT_FEES", 2);
    public static final ButtonAction CLAIM_ALL = new ButtonAction("CLAIM_ALL", 3);
    public static final ButtonAction ASSETS_ITEM_CLICK = new ButtonAction("ASSETS_ITEM_CLICK", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ButtonAction[] $values() {
        return new ButtonAction[]{CLAIM, ADD_LIQUIDITY, COLLECT_FEES, CLAIM_ALL, ASSETS_ITEM_CLICK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ButtonAction> getEntries() {
        return $ENTRIES;
    }

    private ButtonAction(String str, int i) {
    }

    static {
        ButtonAction[] buttonActionArr$values = $values();
        $VALUES = buttonActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buttonActionArr$values);
    }

    public static ButtonAction valueOf(String str) {
        return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
    }

    public static ButtonAction[] values() {
        return (ButtonAction[]) $VALUES.clone();
    }
}
