package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class PasskeyReminderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyReminderType[] $VALUES;
    public static final PasskeyReminderType NONE = new PasskeyReminderType("NONE", 0);
    public static final PasskeyReminderType HAS_REVIEW_TICKET = new PasskeyReminderType("HAS_REVIEW_TICKET", 1);
    public static final PasskeyReminderType DEVICE_NOT_SUPPORTED = new PasskeyReminderType("DEVICE_NOT_SUPPORTED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyReminderType[] $values() {
        return new PasskeyReminderType[]{NONE, HAS_REVIEW_TICKET, DEVICE_NOT_SUPPORTED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyReminderType> getEntries() {
        return $ENTRIES;
    }

    private PasskeyReminderType(String str, int i) {
    }

    static {
        PasskeyReminderType[] passkeyReminderTypeArr$values = $values();
        $VALUES = passkeyReminderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyReminderTypeArr$values);
    }

    public static PasskeyReminderType valueOf(String str) {
        return (PasskeyReminderType) Enum.valueOf(PasskeyReminderType.class, str);
    }

    public static PasskeyReminderType[] values() {
        return (PasskeyReminderType[]) $VALUES.clone();
    }
}
