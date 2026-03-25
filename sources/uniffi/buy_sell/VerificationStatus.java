package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class VerificationStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VerificationStatus[] $VALUES;
    public static final VerificationStatus PRE_LOGIN = new VerificationStatus("PRE_LOGIN", 0);
    public static final VerificationStatus PRE_KYC = new VerificationStatus("PRE_KYC", 1);
    public static final VerificationStatus VALID = new VerificationStatus("VALID", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VerificationStatus[] $values() {
        return new VerificationStatus[]{PRE_LOGIN, PRE_KYC, VALID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VerificationStatus> getEntries() {
        return $ENTRIES;
    }

    private VerificationStatus(String str, int i) {
    }

    static {
        VerificationStatus[] verificationStatusArr$values = $values();
        $VALUES = verificationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(verificationStatusArr$values);
    }

    public static VerificationStatus valueOf(String str) {
        return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
    }

    public static VerificationStatus[] values() {
        return (VerificationStatus[]) $VALUES.clone();
    }
}
