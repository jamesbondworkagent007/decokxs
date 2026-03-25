package com.okinc.tradingbot.impl.widget.compose;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class BotIconStacksStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotIconStacksStyle[] $VALUES;
    public static final BotIconStacksStyle COMPACT = new BotIconStacksStyle("COMPACT", 0);
    public static final BotIconStacksStyle SPACIOUS = new BotIconStacksStyle("SPACIOUS", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotIconStacksStyle[] $values() {
        return new BotIconStacksStyle[]{COMPACT, SPACIOUS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotIconStacksStyle> getEntries() {
        return $ENTRIES;
    }

    private BotIconStacksStyle(String str, int i) {
    }

    static {
        BotIconStacksStyle[] botIconStacksStyleArr$values = $values();
        $VALUES = botIconStacksStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botIconStacksStyleArr$values);
    }

    public static BotIconStacksStyle valueOf(String str) {
        return (BotIconStacksStyle) Enum.valueOf(BotIconStacksStyle.class, str);
    }

    public static BotIconStacksStyle[] values() {
        return (BotIconStacksStyle[]) $VALUES.clone();
    }
}
