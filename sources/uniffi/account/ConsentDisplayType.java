package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class ConsentDisplayType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConsentDisplayType[] $VALUES;
    public static final ConsentDisplayType CHECKBOX = new ConsentDisplayType("CHECKBOX", 0);
    public static final ConsentDisplayType PLAIN = new ConsentDisplayType("PLAIN", 1);
    public static final ConsentDisplayType UNKNOWN = new ConsentDisplayType("UNKNOWN", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConsentDisplayType[] $values() {
        return new ConsentDisplayType[]{CHECKBOX, PLAIN, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConsentDisplayType> getEntries() {
        return $ENTRIES;
    }

    private ConsentDisplayType(String str, int i) {
    }

    static {
        ConsentDisplayType[] consentDisplayTypeArr$values = $values();
        $VALUES = consentDisplayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(consentDisplayTypeArr$values);
    }

    public static ConsentDisplayType valueOf(String str) {
        return (ConsentDisplayType) Enum.valueOf(ConsentDisplayType.class, str);
    }

    public static ConsentDisplayType[] values() {
        return (ConsentDisplayType[]) $VALUES.clone();
    }
}
