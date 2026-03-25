package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class RedirectBehavior {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RedirectBehavior[] $VALUES;
    private final int value;
    public static final RedirectBehavior UNKNOWN = new RedirectBehavior("UNKNOWN", 0, 0);
    public static final RedirectBehavior DEFAULT = new RedirectBehavior("DEFAULT", 1, 1);
    public static final RedirectBehavior BIZ_PAGE = new RedirectBehavior("BIZ_PAGE", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RedirectBehavior[] $values() {
        return new RedirectBehavior[]{UNKNOWN, DEFAULT, BIZ_PAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RedirectBehavior> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private RedirectBehavior(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RedirectBehavior[] redirectBehaviorArr$values = $values();
        $VALUES = redirectBehaviorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(redirectBehaviorArr$values);
    }

    public static RedirectBehavior valueOf(String str) {
        return (RedirectBehavior) Enum.valueOf(RedirectBehavior.class, str);
    }

    public static RedirectBehavior[] values() {
        return (RedirectBehavior[]) $VALUES.clone();
    }
}
