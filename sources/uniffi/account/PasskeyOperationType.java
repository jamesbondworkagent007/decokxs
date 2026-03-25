package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class PasskeyOperationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyOperationType[] $VALUES;
    public static final PasskeyOperationType REGISTER = new PasskeyOperationType("REGISTER", 0);
    public static final PasskeyOperationType REMOVE = new PasskeyOperationType("REMOVE", 1);
    public static final PasskeyOperationType RESET = new PasskeyOperationType("RESET", 2);
    public static final PasskeyOperationType RESET_NO_REBIND = new PasskeyOperationType("RESET_NO_REBIND", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyOperationType[] $values() {
        return new PasskeyOperationType[]{REGISTER, REMOVE, RESET, RESET_NO_REBIND};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyOperationType> getEntries() {
        return $ENTRIES;
    }

    private PasskeyOperationType(String str, int i) {
    }

    static {
        PasskeyOperationType[] passkeyOperationTypeArr$values = $values();
        $VALUES = passkeyOperationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyOperationTypeArr$values);
    }

    public static PasskeyOperationType valueOf(String str) {
        return (PasskeyOperationType) Enum.valueOf(PasskeyOperationType.class, str);
    }

    public static PasskeyOperationType[] values() {
        return (PasskeyOperationType[]) $VALUES.clone();
    }
}
