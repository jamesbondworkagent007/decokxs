package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class TokenSystemType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenSystemType[] $VALUES;
    public static final TokenSystemType NORMAL = new TokenSystemType("NORMAL", 0);
    public static final TokenSystemType NATIVE = new TokenSystemType("NATIVE", 1);
    public static final TokenSystemType WRAPPED = new TokenSystemType("WRAPPED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenSystemType[] $values() {
        return new TokenSystemType[]{NORMAL, NATIVE, WRAPPED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenSystemType> getEntries() {
        return $ENTRIES;
    }

    private TokenSystemType(String str, int i) {
    }

    static {
        TokenSystemType[] tokenSystemTypeArr$values = $values();
        $VALUES = tokenSystemTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenSystemTypeArr$values);
    }

    public static TokenSystemType valueOf(String str) {
        return (TokenSystemType) Enum.valueOf(TokenSystemType.class, str);
    }

    public static TokenSystemType[] values() {
        return (TokenSystemType[]) $VALUES.clone();
    }
}
