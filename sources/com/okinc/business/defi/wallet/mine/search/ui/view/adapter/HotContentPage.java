package com.okinc.business.defi.wallet.mine.search.ui.view.adapter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class HotContentPage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HotContentPage[] $VALUES;
    public static final HotContentPage TOKENS = new HotContentPage("TOKENS", 0);
    public static final HotContentPage DAPPS = new HotContentPage("DAPPS", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HotContentPage[] $values() {
        return new HotContentPage[]{TOKENS, DAPPS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HotContentPage> getEntries() {
        return $ENTRIES;
    }

    private HotContentPage(String str, int i) {
    }

    static {
        HotContentPage[] hotContentPageArr$values = $values();
        $VALUES = hotContentPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(hotContentPageArr$values);
    }

    public static HotContentPage valueOf(String str) {
        return (HotContentPage) Enum.valueOf(HotContentPage.class, str);
    }

    public static HotContentPage[] values() {
        return (HotContentPage[]) $VALUES.clone();
    }
}
