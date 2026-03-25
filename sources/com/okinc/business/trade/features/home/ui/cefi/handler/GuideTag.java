package com.okinc.business.trade.features.home.ui.cefi.handler;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class GuideTag {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GuideTag[] $VALUES;
    public static final GuideTag MiniKLine = new GuideTag("MiniKLine", 0);
    public static final GuideTag TokenSearch = new GuideTag("TokenSearch", 1);
    public static final GuideTag BuySell = new GuideTag("BuySell", 2);
    public static final GuideTag OrderTypes = new GuideTag("OrderTypes", 3);
    public static final GuideTag AutoSell = new GuideTag("AutoSell", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GuideTag[] $values() {
        return new GuideTag[]{MiniKLine, TokenSearch, BuySell, OrderTypes, AutoSell};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GuideTag> getEntries() {
        return $ENTRIES;
    }

    private GuideTag(String str, int i) {
    }

    static {
        GuideTag[] guideTagArr$values = $values();
        $VALUES = guideTagArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(guideTagArr$values);
    }

    public static GuideTag valueOf(String str) {
        return (GuideTag) Enum.valueOf(GuideTag.class, str);
    }

    public static GuideTag[] values() {
        return (GuideTag[]) $VALUES.clone();
    }
}
