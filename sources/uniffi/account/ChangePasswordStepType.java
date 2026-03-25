package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ChangePasswordStepType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChangePasswordStepType[] $VALUES;
    public static final ChangePasswordStepType MFA_VERIFICATION = new ChangePasswordStepType("MFA_VERIFICATION", 0);
    public static final ChangePasswordStepType REQUIRED_NEW_PASSWORD = new ChangePasswordStepType("REQUIRED_NEW_PASSWORD", 1);
    public static final ChangePasswordStepType SUCCESS = new ChangePasswordStepType("SUCCESS", 2);
    public static final ChangePasswordStepType UNKNOWN = new ChangePasswordStepType("UNKNOWN", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChangePasswordStepType[] $values() {
        return new ChangePasswordStepType[]{MFA_VERIFICATION, REQUIRED_NEW_PASSWORD, SUCCESS, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChangePasswordStepType> getEntries() {
        return $ENTRIES;
    }

    private ChangePasswordStepType(String str, int i) {
    }

    static {
        ChangePasswordStepType[] changePasswordStepTypeArr$values = $values();
        $VALUES = changePasswordStepTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(changePasswordStepTypeArr$values);
    }

    public static ChangePasswordStepType valueOf(String str) {
        return (ChangePasswordStepType) Enum.valueOf(ChangePasswordStepType.class, str);
    }

    public static ChangePasswordStepType[] values() {
        return (ChangePasswordStepType[]) $VALUES.clone();
    }
}
