package com.okinc.business.dexlogic.bean.track;

import com.okinc.business.defi.biz.model.wallet.ExtJson;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ButtonType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    private final String type;
    public static final ButtonType GENERAL = new ButtonType("GENERAL", 0, "general");
    public static final ButtonType TRADE = new ButtonType("TRADE", 1, ExtJson.BRC20TYPE_TRADE);
    public static final ButtonType EXPLAIN = new ButtonType("EXPLAIN", 2, "explain");
    public static final ButtonType QUICK_BUTTON = new ButtonType("QUICK_BUTTON", 3, "quick_button");
    public static final ButtonType OTHERS = new ButtonType("OTHERS", 4, "others");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ButtonType[] $values() {
        return new ButtonType[]{GENERAL, TRADE, EXPLAIN, QUICK_BUTTON, OTHERS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ButtonType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private ButtonType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        ButtonType[] buttonTypeArr$values = $values();
        $VALUES = buttonTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buttonTypeArr$values);
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}
