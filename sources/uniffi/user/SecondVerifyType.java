package uniffi.user;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class SecondVerifyType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SecondVerifyType[] $VALUES;
    private final int value;
    public static final SecondVerifyType NONE = new SecondVerifyType("NONE", 0, 0);
    public static final SecondVerifyType GOOGLE_CODE = new SecondVerifyType("GOOGLE_CODE", 1, 1);
    public static final SecondVerifyType SMS = new SecondVerifyType("SMS", 2, 2);
    public static final SecondVerifyType ALL = new SecondVerifyType("ALL", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SecondVerifyType[] $values() {
        return new SecondVerifyType[]{NONE, GOOGLE_CODE, SMS, ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SecondVerifyType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SecondVerifyType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SecondVerifyType[] secondVerifyTypeArr$values = $values();
        $VALUES = secondVerifyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(secondVerifyTypeArr$values);
    }

    public static SecondVerifyType valueOf(String str) {
        return (SecondVerifyType) Enum.valueOf(SecondVerifyType.class, str);
    }

    public static SecondVerifyType[] values() {
        return (SecondVerifyType[]) $VALUES.clone();
    }
}
