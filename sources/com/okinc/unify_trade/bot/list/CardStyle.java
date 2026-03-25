package com.okinc.unify_trade.bot.list;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class CardStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CardStyle[] $VALUES;
    public static final CardStyle DETAILED = new CardStyle("DETAILED", 0);
    public static final CardStyle NO_IMAGE = new CardStyle("NO_IMAGE", 1);
    public static final CardStyle MINI = new CardStyle("MINI", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CardStyle[] $values() {
        return new CardStyle[]{DETAILED, NO_IMAGE, MINI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CardStyle> getEntries() {
        return $ENTRIES;
    }

    private CardStyle(String str, int i) {
    }

    static {
        CardStyle[] cardStyleArr$values = $values();
        $VALUES = cardStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(cardStyleArr$values);
    }

    public static CardStyle valueOf(String str) {
        return (CardStyle) Enum.valueOf(CardStyle.class, str);
    }

    public static CardStyle[] values() {
        return (CardStyle[]) $VALUES.clone();
    }
}
