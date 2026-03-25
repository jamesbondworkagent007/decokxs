package com.okinc.buysell.data;

import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class Icon {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Icon[] $VALUES;
    public static final Icon CLOSE = new Icon(InvestButtonAction.ACTION_CALLBACK_CLOSE, 0);
    public static final Icon FAQ = new Icon("FAQ", 1);
    public static final Icon HISTORY = new Icon("HISTORY", 2);
    public static final Icon NO_ICON = new Icon("NO_ICON", 3);
    public static final Icon BACK = new Icon("BACK", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Icon[] $values() {
        return new Icon[]{CLOSE, FAQ, HISTORY, NO_ICON, BACK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Icon> getEntries() {
        return $ENTRIES;
    }

    private Icon(String str, int i) {
    }

    static {
        Icon[] iconArr$values = $values();
        $VALUES = iconArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iconArr$values);
    }

    public static Icon valueOf(String str) {
        return (Icon) Enum.valueOf(Icon.class, str);
    }

    public static Icon[] values() {
        return (Icon[]) $VALUES.clone();
    }
}
