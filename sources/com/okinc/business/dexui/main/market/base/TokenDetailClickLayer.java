package com.okinc.business.dexui.main.market.base;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TokenDetailClickLayer {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenDetailClickLayer[] $VALUES;
    private final String trackingValue;
    public static final TokenDetailClickLayer GLOBAL = new TokenDetailClickLayer("GLOBAL", 0, "global");
    public static final TokenDetailClickLayer TOP_TAB = new TokenDetailClickLayer("TOP_TAB", 1, "top_tab");
    public static final TokenDetailClickLayer INNER_TAB = new TokenDetailClickLayer("INNER_TAB", 2, "inner_tab");
    public static final TokenDetailClickLayer COMPONENTS = new TokenDetailClickLayer("COMPONENTS", 3, "components");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenDetailClickLayer[] $values() {
        return new TokenDetailClickLayer[]{GLOBAL, TOP_TAB, INNER_TAB, COMPONENTS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenDetailClickLayer> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    private TokenDetailClickLayer(String str, int i, String str2) {
        this.trackingValue = str2;
    }

    static {
        TokenDetailClickLayer[] tokenDetailClickLayerArr$values = $values();
        $VALUES = tokenDetailClickLayerArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenDetailClickLayerArr$values);
    }

    public static TokenDetailClickLayer valueOf(String str) {
        return (TokenDetailClickLayer) Enum.valueOf(TokenDetailClickLayer.class, str);
    }

    public static TokenDetailClickLayer[] values() {
        return (TokenDetailClickLayer[]) $VALUES.clone();
    }
}
