package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class ChangePasswordJourneyStep {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChangePasswordJourneyStep[] $VALUES;
    public static final ChangePasswordJourneyStep INITIAL_CONFIRMATION = new ChangePasswordJourneyStep("INITIAL_CONFIRMATION", 0);
    public static final ChangePasswordJourneyStep REQUIRED_NEW_PASSWORD = new ChangePasswordJourneyStep("REQUIRED_NEW_PASSWORD", 1);
    public static final ChangePasswordJourneyStep SUCCESS = new ChangePasswordJourneyStep("SUCCESS", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChangePasswordJourneyStep[] $values() {
        return new ChangePasswordJourneyStep[]{INITIAL_CONFIRMATION, REQUIRED_NEW_PASSWORD, SUCCESS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChangePasswordJourneyStep> getEntries() {
        return $ENTRIES;
    }

    private ChangePasswordJourneyStep(String str, int i) {
    }

    static {
        ChangePasswordJourneyStep[] changePasswordJourneyStepArr$values = $values();
        $VALUES = changePasswordJourneyStepArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(changePasswordJourneyStepArr$values);
    }

    public static ChangePasswordJourneyStep valueOf(String str) {
        return (ChangePasswordJourneyStep) Enum.valueOf(ChangePasswordJourneyStep.class, str);
    }

    public static ChangePasswordJourneyStep[] values() {
        return (ChangePasswordJourneyStep[]) $VALUES.clone();
    }
}
