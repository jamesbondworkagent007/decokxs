package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class TokenSourceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenSourceType[] $VALUES;
    public static final TokenSourceType PLATFORM = new TokenSourceType("PLATFORM", 0);
    public static final TokenSourceType CUSTOM = new TokenSourceType("CUSTOM", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenSourceType[] $values() {
        return new TokenSourceType[]{PLATFORM, CUSTOM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenSourceType> getEntries() {
        return $ENTRIES;
    }

    private TokenSourceType(String str, int i) {
    }

    static {
        TokenSourceType[] tokenSourceTypeArr$values = $values();
        $VALUES = tokenSourceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenSourceTypeArr$values);
    }

    public static TokenSourceType valueOf(String str) {
        return (TokenSourceType) Enum.valueOf(TokenSourceType.class, str);
    }

    public static TokenSourceType[] values() {
        return (TokenSourceType[]) $VALUES.clone();
    }
}
