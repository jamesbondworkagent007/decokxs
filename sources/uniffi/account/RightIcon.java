package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class RightIcon {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RightIcon[] $VALUES;
    public static final RightIcon ARROW = new RightIcon("ARROW", 0);
    public static final RightIcon COPY = new RightIcon("COPY", 1);
    public static final RightIcon NONE = new RightIcon("NONE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RightIcon[] $values() {
        return new RightIcon[]{ARROW, COPY, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RightIcon> getEntries() {
        return $ENTRIES;
    }

    private RightIcon(String str, int i) {
    }

    static {
        RightIcon[] rightIconArr$values = $values();
        $VALUES = rightIconArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rightIconArr$values);
    }

    public static RightIcon valueOf(String str) {
        return (RightIcon) Enum.valueOf(RightIcon.class, str);
    }

    public static RightIcon[] values() {
        return (RightIcon[]) $VALUES.clone();
    }
}
