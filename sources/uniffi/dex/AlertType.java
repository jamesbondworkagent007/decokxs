package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AlertType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlertType[] $VALUES;
    private final int value;
    public static final AlertType PRICE = new AlertType("PRICE", 0, 0);
    public static final AlertType MARKET_CAP = new AlertType("MARKET_CAP", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlertType[] $values() {
        return new AlertType[]{PRICE, MARKET_CAP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlertType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AlertType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AlertType[] alertTypeArr$values = $values();
        $VALUES = alertTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alertTypeArr$values);
    }

    public static AlertType valueOf(String str) {
        return (AlertType) Enum.valueOf(AlertType.class, str);
    }

    public static AlertType[] values() {
        return (AlertType[]) $VALUES.clone();
    }
}
