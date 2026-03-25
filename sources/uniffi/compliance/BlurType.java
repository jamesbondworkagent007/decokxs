package uniffi.compliance;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class BlurType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BlurType[] $VALUES;
    public static final BlurType NONE = new BlurType("NONE", 0);
    public static final BlurType DEFOCUS = new BlurType("DEFOCUS", 1);
    public static final BlurType MOTION = new BlurType("MOTION", 2);
    public static final BlurType COMBINED = new BlurType("COMBINED", 3);
    public static final BlurType UNKNOWN = new BlurType("UNKNOWN", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BlurType[] $values() {
        return new BlurType[]{NONE, DEFOCUS, MOTION, COMBINED, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BlurType> getEntries() {
        return $ENTRIES;
    }

    private BlurType(String str, int i) {
    }

    static {
        BlurType[] blurTypeArr$values = $values();
        $VALUES = blurTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(blurTypeArr$values);
    }

    public static BlurType valueOf(String str) {
        return (BlurType) Enum.valueOf(BlurType.class, str);
    }

    public static BlurType[] values() {
        return (BlurType[]) $VALUES.clone();
    }
}
