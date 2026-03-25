package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class MfaStep {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MfaStep[] $VALUES;
    public static final MfaStep NONE = new MfaStep("NONE", 0);
    public static final MfaStep INITIATE = new MfaStep("INITIATE", 1);
    public static final MfaStep FACE_VERIFY = new MfaStep("FACE_VERIFY", 2);
    public static final MfaStep CREATE_TICKET = new MfaStep("CREATE_TICKET", 3);
    public static final MfaStep TICKET_CREATED = new MfaStep("TICKET_CREATED", 4);
    public static final MfaStep PASSKEY = new MfaStep("PASSKEY", 5);
    public static final MfaStep PASSWORD = new MfaStep("PASSWORD", 6);
    public static final MfaStep EMAIL = new MfaStep("EMAIL", 7);
    public static final MfaStep PHONE = new MfaStep("PHONE", 8);
    public static final MfaStep VOICE = new MfaStep("VOICE", 9);
    public static final MfaStep AUTHENTICATOR = new MfaStep("AUTHENTICATOR", 10);
    public static final MfaStep SUCCESS = new MfaStep("SUCCESS", 11);
    public static final MfaStep UNKNOWN = new MfaStep("UNKNOWN", 12);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MfaStep[] $values() {
        return new MfaStep[]{NONE, INITIATE, FACE_VERIFY, CREATE_TICKET, TICKET_CREATED, PASSKEY, PASSWORD, EMAIL, PHONE, VOICE, AUTHENTICATOR, SUCCESS, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MfaStep> getEntries() {
        return $ENTRIES;
    }

    private MfaStep(String str, int i) {
    }

    static {
        MfaStep[] mfaStepArr$values = $values();
        $VALUES = mfaStepArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mfaStepArr$values);
    }

    public static MfaStep valueOf(String str) {
        return (MfaStep) Enum.valueOf(MfaStep.class, str);
    }

    public static MfaStep[] values() {
        return (MfaStep[]) $VALUES.clone();
    }
}
