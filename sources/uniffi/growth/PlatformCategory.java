package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class PlatformCategory {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlatformCategory[] $VALUES;
    private final int value;
    public static final PlatformCategory SOCIAL = new PlatformCategory("SOCIAL", 0, 1);
    public static final PlatformCategory INTERNAL = new PlatformCategory("INTERNAL", 1, 2);
    public static final PlatformCategory FUNCTION = new PlatformCategory("FUNCTION", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlatformCategory[] $values() {
        return new PlatformCategory[]{SOCIAL, INTERNAL, FUNCTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlatformCategory> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private PlatformCategory(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        PlatformCategory[] platformCategoryArr$values = $values();
        $VALUES = platformCategoryArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(platformCategoryArr$values);
    }

    public static PlatformCategory valueOf(String str) {
        return (PlatformCategory) Enum.valueOf(PlatformCategory.class, str);
    }

    public static PlatformCategory[] values() {
        return (PlatformCategory[]) $VALUES.clone();
    }
}
