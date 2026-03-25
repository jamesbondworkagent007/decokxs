package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SendCodeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SendCodeType[] $VALUES;
    private final int value;
    public static final SendCodeType SMS = new SendCodeType("SMS", 0, 0);
    public static final SendCodeType PHONE_CALL = new SendCodeType("PHONE_CALL", 1, 1);
    public static final SendCodeType EMAIL = new SendCodeType("EMAIL", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SendCodeType[] $values() {
        return new SendCodeType[]{SMS, PHONE_CALL, EMAIL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SendCodeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SendCodeType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SendCodeType[] sendCodeTypeArr$values = $values();
        $VALUES = sendCodeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sendCodeTypeArr$values);
    }

    public static SendCodeType valueOf(String str) {
        return (SendCodeType) Enum.valueOf(SendCodeType.class, str);
    }

    public static SendCodeType[] values() {
        return (SendCodeType[]) $VALUES.clone();
    }
}
