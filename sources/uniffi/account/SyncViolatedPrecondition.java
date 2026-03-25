package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class SyncViolatedPrecondition {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SyncViolatedPrecondition[] $VALUES;
    public static final SyncViolatedPrecondition NONE = new SyncViolatedPrecondition("NONE", 0);
    public static final SyncViolatedPrecondition RESET_PASSKEY = new SyncViolatedPrecondition("RESET_PASSKEY", 1);
    public static final SyncViolatedPrecondition WALLET_RECOVERY = new SyncViolatedPrecondition("WALLET_RECOVERY", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SyncViolatedPrecondition[] $values() {
        return new SyncViolatedPrecondition[]{NONE, RESET_PASSKEY, WALLET_RECOVERY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SyncViolatedPrecondition> getEntries() {
        return $ENTRIES;
    }

    private SyncViolatedPrecondition(String str, int i) {
    }

    static {
        SyncViolatedPrecondition[] syncViolatedPreconditionArr$values = $values();
        $VALUES = syncViolatedPreconditionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(syncViolatedPreconditionArr$values);
    }

    public static SyncViolatedPrecondition valueOf(String str) {
        return (SyncViolatedPrecondition) Enum.valueOf(SyncViolatedPrecondition.class, str);
    }

    public static SyncViolatedPrecondition[] values() {
        return (SyncViolatedPrecondition[]) $VALUES.clone();
    }
}
