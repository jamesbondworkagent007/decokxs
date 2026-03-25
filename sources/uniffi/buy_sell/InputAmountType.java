package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class InputAmountType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputAmountType[] $VALUES;
    public static final InputAmountType FIAT = new InputAmountType("FIAT", 0);
    public static final InputAmountType CRYPTO = new InputAmountType("CRYPTO", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputAmountType[] $values() {
        return new InputAmountType[]{FIAT, CRYPTO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputAmountType> getEntries() {
        return $ENTRIES;
    }

    private InputAmountType(String str, int i) {
    }

    static {
        InputAmountType[] inputAmountTypeArr$values = $values();
        $VALUES = inputAmountTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputAmountTypeArr$values);
    }

    public static InputAmountType valueOf(String str) {
        return (InputAmountType) Enum.valueOf(InputAmountType.class, str);
    }

    public static InputAmountType[] values() {
        return (InputAmountType[]) $VALUES.clone();
    }
}
