package uniffi.network;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class MobileType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MobileType[] $VALUES;
    public static final MobileType G2 = new MobileType("G2", 0);
    public static final MobileType G3 = new MobileType("G3", 1);
    public static final MobileType G4 = new MobileType("G4", 2);
    public static final MobileType G5 = new MobileType("G5", 3);
    public static final MobileType OTHER = new MobileType("OTHER", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MobileType[] $values() {
        return new MobileType[]{G2, G3, G4, G5, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MobileType> getEntries() {
        return $ENTRIES;
    }

    private MobileType(String str, int i) {
    }

    static {
        MobileType[] mobileTypeArr$values = $values();
        $VALUES = mobileTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mobileTypeArr$values);
    }

    public static MobileType valueOf(String str) {
        return (MobileType) Enum.valueOf(MobileType.class, str);
    }

    public static MobileType[] values() {
        return (MobileType[]) $VALUES.clone();
    }
}
