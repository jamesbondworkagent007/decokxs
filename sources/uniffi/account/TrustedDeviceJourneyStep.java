package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class TrustedDeviceJourneyStep {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrustedDeviceJourneyStep[] $VALUES;
    public static final TrustedDeviceJourneyStep NEW_DEVICE_INFO = new TrustedDeviceJourneyStep("NEW_DEVICE_INFO", 0);
    public static final TrustedDeviceJourneyStep OTP = new TrustedDeviceJourneyStep("OTP", 1);
    public static final TrustedDeviceJourneyStep RISK = new TrustedDeviceJourneyStep("RISK", 2);
    public static final TrustedDeviceJourneyStep CHANGE_PASSWORD = new TrustedDeviceJourneyStep("CHANGE_PASSWORD", 3);
    public static final TrustedDeviceJourneyStep COMPLETED = new TrustedDeviceJourneyStep("COMPLETED", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrustedDeviceJourneyStep[] $values() {
        return new TrustedDeviceJourneyStep[]{NEW_DEVICE_INFO, OTP, RISK, CHANGE_PASSWORD, COMPLETED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrustedDeviceJourneyStep> getEntries() {
        return $ENTRIES;
    }

    private TrustedDeviceJourneyStep(String str, int i) {
    }

    static {
        TrustedDeviceJourneyStep[] trustedDeviceJourneyStepArr$values = $values();
        $VALUES = trustedDeviceJourneyStepArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trustedDeviceJourneyStepArr$values);
    }

    public static TrustedDeviceJourneyStep valueOf(String str) {
        return (TrustedDeviceJourneyStep) Enum.valueOf(TrustedDeviceJourneyStep.class, str);
    }

    public static TrustedDeviceJourneyStep[] values() {
        return (TrustedDeviceJourneyStep[]) $VALUES.clone();
    }
}
