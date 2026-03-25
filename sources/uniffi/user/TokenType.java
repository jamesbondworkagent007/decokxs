package uniffi.user;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class TokenType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenType[] $VALUES;
    public static final TokenType DEMO_TRADING = new TokenType("DEMO_TRADING", 0);
    public static final TokenType LIVE_TRADING = new TokenType("LIVE_TRADING", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenType[] $values() {
        return new TokenType[]{DEMO_TRADING, LIVE_TRADING};
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
