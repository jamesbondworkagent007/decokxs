package com.okinc.wallet.core.other;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TokenType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenType[] $VALUES;
    public static final TokenType TypeUnknown = new TokenType("TypeUnknown", 0);
    public static final TokenType TypeERC20 = new TokenType("TypeERC20", 1);
    public static final TokenType TypeERC721 = new TokenType("TypeERC721", 2);
    public static final TokenType TypeTRC20 = new TokenType("TypeTRC20", 3);
    public static final TokenType TypeTRC721 = new TokenType("TypeTRC721", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenType[] $values() {
        return new TokenType[]{TypeUnknown, TypeERC20, TypeERC721, TypeTRC20, TypeTRC721};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenType> getEntries() {
        return $ENTRIES;
    }

    private TokenType(String str, int i) {
    }

    static {
        TokenType[] tokenTypeArr$values = $values();
        $VALUES = tokenTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenTypeArr$values);
    }

    public static TokenType valueOf(String str) {
        return (TokenType) Enum.valueOf(TokenType.class, str);
    }

    public static TokenType[] values() {
        return (TokenType[]) $VALUES.clone();
    }
}
