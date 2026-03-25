package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class KycState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KycState[] $VALUES;
    private final int value;
    public static final KycState UNKNOWN = new KycState("UNKNOWN", 0, -1);
    public static final KycState UNVERIFIED = new KycState("UNVERIFIED", 1, 1);
    public static final KycState PENDING_LV2 = new KycState("PENDING_LV2", 2, 2);
    public static final KycState PENDING_LV3 = new KycState("PENDING_LV3", 3, 3);
    public static final KycState AUDITING = new KycState("AUDITING", 4, 4);
    public static final KycState VERIFIED = new KycState("VERIFIED", 5, 5);
    public static final KycState ACTION_REQUIRED = new KycState("ACTION_REQUIRED", 6, 6);
    public static final KycState ADDITIONAL_INFO_REQUIRED = new KycState("ADDITIONAL_INFO_REQUIRED", 7, 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KycState[] $values() {
        return new KycState[]{UNKNOWN, UNVERIFIED, PENDING_LV2, PENDING_LV3, AUDITING, VERIFIED, ACTION_REQUIRED, ADDITIONAL_INFO_REQUIRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KycState> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private KycState(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        KycState[] kycStateArr$values = $values();
        $VALUES = kycStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(kycStateArr$values);
    }

    public static KycState valueOf(String str) {
        return (KycState) Enum.valueOf(KycState.class, str);
    }

    public static KycState[] values() {
        return (KycState[]) $VALUES.clone();
    }
}
