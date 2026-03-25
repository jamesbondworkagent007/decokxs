package uniffi.user;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class BioBackgroundReviewStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BioBackgroundReviewStatus[] $VALUES;
    private final int value;
    public static final BioBackgroundReviewStatus NOT_MODIFIED = new BioBackgroundReviewStatus("NOT_MODIFIED", 0, 0);
    public static final BioBackgroundReviewStatus PENDING_AUDIT = new BioBackgroundReviewStatus("PENDING_AUDIT", 1, 1);
    public static final BioBackgroundReviewStatus IN_AUDIT = new BioBackgroundReviewStatus("IN_AUDIT", 2, 2);
    public static final BioBackgroundReviewStatus MACHINE_AUDIT_PASSED = new BioBackgroundReviewStatus("MACHINE_AUDIT_PASSED", 3, 3);
    public static final BioBackgroundReviewStatus MACHINE_AUDIT_REJECTED = new BioBackgroundReviewStatus("MACHINE_AUDIT_REJECTED", 4, 4);
    public static final BioBackgroundReviewStatus HUMAN_AUDIT_PASSED = new BioBackgroundReviewStatus("HUMAN_AUDIT_PASSED", 5, 6);
    public static final BioBackgroundReviewStatus HUMAN_AUDIT_REJECTED = new BioBackgroundReviewStatus("HUMAN_AUDIT_REJECTED", 6, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BioBackgroundReviewStatus[] $values() {
        return new BioBackgroundReviewStatus[]{NOT_MODIFIED, PENDING_AUDIT, IN_AUDIT, MACHINE_AUDIT_PASSED, MACHINE_AUDIT_REJECTED, HUMAN_AUDIT_PASSED, HUMAN_AUDIT_REJECTED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BioBackgroundReviewStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private BioBackgroundReviewStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        BioBackgroundReviewStatus[] bioBackgroundReviewStatusArr$values = $values();
        $VALUES = bioBackgroundReviewStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bioBackgroundReviewStatusArr$values);
    }

    public static BioBackgroundReviewStatus valueOf(String str) {
        return (BioBackgroundReviewStatus) Enum.valueOf(BioBackgroundReviewStatus.class, str);
    }

    public static BioBackgroundReviewStatus[] values() {
        return (BioBackgroundReviewStatus[]) $VALUES.clone();
    }
}
