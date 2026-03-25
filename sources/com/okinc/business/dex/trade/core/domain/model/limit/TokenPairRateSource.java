package com.okinc.business.dex.trade.core.domain.model.limit;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TokenPairRateSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenPairRateSource[] $VALUES;
    public static final TokenPairRateSource UNKNOWN = new TokenPairRateSource("UNKNOWN", 0);
    public static final TokenPairRateSource V1 = new TokenPairRateSource("V1", 1);
    public static final TokenPairRateSource V2 = new TokenPairRateSource("V2", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenPairRateSource[] $values() {
        return new TokenPairRateSource[]{UNKNOWN, V1, V2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenPairRateSource> getEntries() {
        return $ENTRIES;
    }

    private TokenPairRateSource(String str, int i) {
    }

    static {
        TokenPairRateSource[] tokenPairRateSourceArr$values = $values();
        $VALUES = tokenPairRateSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenPairRateSourceArr$values);
    }

    public static TokenPairRateSource valueOf(String str) {
        return (TokenPairRateSource) Enum.valueOf(TokenPairRateSource.class, str);
    }

    public static TokenPairRateSource[] values() {
        return (TokenPairRateSource[]) $VALUES.clone();
    }
}
