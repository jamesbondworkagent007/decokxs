package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class CrossChainType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CrossChainType[] $VALUES;
    public static final CrossChainType EVM = new CrossChainType("EVM", 0);
    public static final CrossChainType TRON = new CrossChainType("TRON", 1);
    public static final CrossChainType SOLANA = new CrossChainType("SOLANA", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CrossChainType[] $values() {
        return new CrossChainType[]{EVM, TRON, SOLANA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CrossChainType> getEntries() {
        return $ENTRIES;
    }

    private CrossChainType(String str, int i) {
    }

    static {
        CrossChainType[] crossChainTypeArr$values = $values();
        $VALUES = crossChainTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(crossChainTypeArr$values);
    }

    public static CrossChainType valueOf(String str) {
        return (CrossChainType) Enum.valueOf(CrossChainType.class, str);
    }

    public static CrossChainType[] values() {
        return (CrossChainType[]) $VALUES.clone();
    }
}
