package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class Step2Type {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Step2Type[] $VALUES;
    private final int value;
    public static final Step2Type SKIP_VERIFY = new Step2Type("SKIP_VERIFY", 0, 0);
    public static final Step2Type GOOGLE_VERIFY = new Step2Type("GOOGLE_VERIFY", 1, 1);
    public static final Step2Type PHONE_VERIFY = new Step2Type("PHONE_VERIFY", 2, 2);
    public static final Step2Type EMAIL_VERIFY = new Step2Type("EMAIL_VERIFY", 3, 3);
    public static final Step2Type UNKNOWN = new Step2Type("UNKNOWN", 4, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Step2Type[] $values() {
        return new Step2Type[]{SKIP_VERIFY, GOOGLE_VERIFY, PHONE_VERIFY, EMAIL_VERIFY, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Step2Type> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private Step2Type(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        Step2Type[] step2TypeArr$values = $values();
        $VALUES = step2TypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(step2TypeArr$values);
    }

    public static Step2Type valueOf(String str) {
        return (Step2Type) Enum.valueOf(Step2Type.class, str);
    }

    public static Step2Type[] values() {
        return (Step2Type[]) $VALUES.clone();
    }
}
