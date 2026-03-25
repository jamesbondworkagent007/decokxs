package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class TokenAuthType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenAuthType[] $VALUES;
    public static final TokenAuthType UNKNOWN = new TokenAuthType("UNKNOWN", 0);
    public static final TokenAuthType AUTHENTICATED = new TokenAuthType("AUTHENTICATED", 1);
    public static final TokenAuthType NOT_AUTHENTICATED = new TokenAuthType("NOT_AUTHENTICATED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenAuthType[] $values() {
        return new TokenAuthType[]{UNKNOWN, AUTHENTICATED, NOT_AUTHENTICATED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenAuthType> getEntries() {
        return $ENTRIES;
    }

    private TokenAuthType(String str, int i) {
    }

    static {
        TokenAuthType[] tokenAuthTypeArr$values = $values();
        $VALUES = tokenAuthTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenAuthTypeArr$values);
    }

    public static TokenAuthType valueOf(String str) {
        return (TokenAuthType) Enum.valueOf(TokenAuthType.class, str);
    }

    public static TokenAuthType[] values() {
        return (TokenAuthType[]) $VALUES.clone();
    }
}
