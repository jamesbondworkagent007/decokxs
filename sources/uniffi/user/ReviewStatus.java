package uniffi.user;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class ReviewStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ReviewStatus[] $VALUES;
    private final int value;
    public static final ReviewStatus NONE = new ReviewStatus("NONE", 0, 0);
    public static final ReviewStatus PENDING = new ReviewStatus(CardSyncResponse.PENDING, 1, 1);
    public static final ReviewStatus PASS = new ReviewStatus("PASS", 2, 2);
    public static final ReviewStatus REJECTED = new ReviewStatus("REJECTED", 3, 3);
    public static final ReviewStatus FROZEN = new ReviewStatus("FROZEN", 4, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ReviewStatus[] $values() {
        return new ReviewStatus[]{NONE, PENDING, PASS, REJECTED, FROZEN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ReviewStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ReviewStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ReviewStatus[] reviewStatusArr$values = $values();
        $VALUES = reviewStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(reviewStatusArr$values);
    }

    public static ReviewStatus valueOf(String str) {
        return (ReviewStatus) Enum.valueOf(ReviewStatus.class, str);
    }

    public static ReviewStatus[] values() {
        return (ReviewStatus[]) $VALUES.clone();
    }
}
