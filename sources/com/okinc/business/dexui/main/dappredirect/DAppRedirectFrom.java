package com.okinc.business.dexui.main.dappredirect;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DAppRedirectFrom {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DAppRedirectFrom[] $VALUES;
    public static final DAppRedirectFrom MARKET = new DAppRedirectFrom("MARKET", 0);
    public static final DAppRedirectFrom SWAP = new DAppRedirectFrom("SWAP", 1);
    public static final DAppRedirectFrom BRIDGE = new DAppRedirectFrom("BRIDGE", 2);
    public static final DAppRedirectFrom LIMIT = new DAppRedirectFrom("LIMIT", 3);
    public static final DAppRedirectFrom MEME = new DAppRedirectFrom("MEME", 4);
    public static final DAppRedirectFrom QUICK = new DAppRedirectFrom("QUICK", 5);
    public static final DAppRedirectFrom EASY = new DAppRedirectFrom("EASY", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DAppRedirectFrom[] $values() {
        return new DAppRedirectFrom[]{MARKET, SWAP, BRIDGE, LIMIT, MEME, QUICK, EASY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DAppRedirectFrom> getEntries() {
        return $ENTRIES;
    }

    private DAppRedirectFrom(String str, int i) {
    }

    static {
        DAppRedirectFrom[] dAppRedirectFromArr$values = $values();
        $VALUES = dAppRedirectFromArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dAppRedirectFromArr$values);
    }

    public static DAppRedirectFrom valueOf(String str) {
        return (DAppRedirectFrom) Enum.valueOf(DAppRedirectFrom.class, str);
    }

    public static DAppRedirectFrom[] values() {
        return (DAppRedirectFrom[]) $VALUES.clone();
    }
}
