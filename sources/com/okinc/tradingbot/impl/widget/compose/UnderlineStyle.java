package com.okinc.tradingbot.impl.widget.compose;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class UnderlineStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UnderlineStyle[] $VALUES;
    public static final UnderlineStyle Dotted = new UnderlineStyle("Dotted", 0, 0);
    public static final UnderlineStyle Solid = new UnderlineStyle("Solid", 1, 1);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UnderlineStyle[] $values() {
        return new UnderlineStyle[]{Dotted, Solid};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UnderlineStyle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private UnderlineStyle(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        UnderlineStyle[] underlineStyleArr$values = $values();
        $VALUES = underlineStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(underlineStyleArr$values);
    }

    public static UnderlineStyle valueOf(String str) {
        return (UnderlineStyle) Enum.valueOf(UnderlineStyle.class, str);
    }

    public static UnderlineStyle[] values() {
        return (UnderlineStyle[]) $VALUES.clone();
    }
}
