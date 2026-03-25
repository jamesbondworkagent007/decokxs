package uniffi.dex;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AlertPromptType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlertPromptType[] $VALUES;
    private final int value;
    public static final AlertPromptType PRICE_MOVE_ABOVE = new AlertPromptType("PRICE_MOVE_ABOVE", 0, 1);
    public static final AlertPromptType PRICE_MOVE_BELOW = new AlertPromptType("PRICE_MOVE_BELOW", 1, 2);
    public static final AlertPromptType GAIN_EXCEEDS24H = new AlertPromptType("GAIN_EXCEEDS24H", 2, 3);
    public static final AlertPromptType LOSS_EXCEEDS24H = new AlertPromptType("LOSS_EXCEEDS24H", 3, 4);
    public static final AlertPromptType PRICE_REACHES = new AlertPromptType("PRICE_REACHES", 4, 5);
    public static final AlertPromptType GAIN_EXCEEDS5MIN = new AlertPromptType("GAIN_EXCEEDS5MIN", 5, 7);
    public static final AlertPromptType LOSS_EXCEEDS5MIN = new AlertPromptType("LOSS_EXCEEDS5MIN", 6, 8);
    public static final AlertPromptType GAIN_EXCEEDS1H = new AlertPromptType("GAIN_EXCEEDS1H", 7, 9);
    public static final AlertPromptType LOSS_EXCEEDS1H = new AlertPromptType("LOSS_EXCEEDS1H", 8, 10);
    public static final AlertPromptType GAIN_EXCEEDS4H = new AlertPromptType("GAIN_EXCEEDS4H", 9, 11);
    public static final AlertPromptType LOSS_EXCEEDS4H = new AlertPromptType("LOSS_EXCEEDS4H", 10, 12);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlertPromptType[] $values() {
        return new AlertPromptType[]{PRICE_MOVE_ABOVE, PRICE_MOVE_BELOW, GAIN_EXCEEDS24H, LOSS_EXCEEDS24H, PRICE_REACHES, GAIN_EXCEEDS5MIN, LOSS_EXCEEDS5MIN, GAIN_EXCEEDS1H, LOSS_EXCEEDS1H, GAIN_EXCEEDS4H, LOSS_EXCEEDS4H};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlertPromptType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AlertPromptType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AlertPromptType[] alertPromptTypeArr$values = $values();
        $VALUES = alertPromptTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alertPromptTypeArr$values);
    }

    public static AlertPromptType valueOf(String str) {
        return (AlertPromptType) Enum.valueOf(AlertPromptType.class, str);
    }

    public static AlertPromptType[] values() {
        return (AlertPromptType[]) $VALUES.clone();
    }
}
