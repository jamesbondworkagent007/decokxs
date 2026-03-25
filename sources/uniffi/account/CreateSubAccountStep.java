package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class CreateSubAccountStep {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CreateSubAccountStep[] $VALUES;
    public static final CreateSubAccountStep CHECK_EXISTENCE = new CreateSubAccountStep("CHECK_EXISTENCE", 0);
    public static final CreateSubAccountStep INITIATE = new CreateSubAccountStep("INITIATE", 1);
    public static final CreateSubAccountStep MFA_VERIFICATION = new CreateSubAccountStep("MFA_VERIFICATION", 2);
    public static final CreateSubAccountStep CREATE_SUB_ACCOUNT = new CreateSubAccountStep("CREATE_SUB_ACCOUNT", 3);
    public static final CreateSubAccountStep SUCCESS = new CreateSubAccountStep("SUCCESS", 4);
    public static final CreateSubAccountStep UNKNOWN = new CreateSubAccountStep("UNKNOWN", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CreateSubAccountStep[] $values() {
        return new CreateSubAccountStep[]{CHECK_EXISTENCE, INITIATE, MFA_VERIFICATION, CREATE_SUB_ACCOUNT, SUCCESS, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CreateSubAccountStep> getEntries() {
        return $ENTRIES;
    }

    private CreateSubAccountStep(String str, int i) {
    }

    static {
        CreateSubAccountStep[] createSubAccountStepArr$values = $values();
        $VALUES = createSubAccountStepArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(createSubAccountStepArr$values);
    }

    public static CreateSubAccountStep valueOf(String str) {
        return (CreateSubAccountStep) Enum.valueOf(CreateSubAccountStep.class, str);
    }

    public static CreateSubAccountStep[] values() {
        return (CreateSubAccountStep[]) $VALUES.clone();
    }
}
