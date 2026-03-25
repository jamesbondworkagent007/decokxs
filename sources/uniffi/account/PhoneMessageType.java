package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class PhoneMessageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PhoneMessageType[] $VALUES;
    private final int value;
    public static final PhoneMessageType SMS = new PhoneMessageType("SMS", 0, 0);
    public static final PhoneMessageType VOICE = new PhoneMessageType("VOICE", 1, 1);
    public static final PhoneMessageType UNKNOWN = new PhoneMessageType("UNKNOWN", 2, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PhoneMessageType[] $values() {
        return new PhoneMessageType[]{SMS, VOICE, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PhoneMessageType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PhoneMessageType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PhoneMessageType[] phoneMessageTypeArr$values = $values();
        $VALUES = phoneMessageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(phoneMessageTypeArr$values);
    }

    public static PhoneMessageType valueOf(String str) {
        return (PhoneMessageType) Enum.valueOf(PhoneMessageType.class, str);
    }

    public static PhoneMessageType[] values() {
        return (PhoneMessageType[]) $VALUES.clone();
    }
}
