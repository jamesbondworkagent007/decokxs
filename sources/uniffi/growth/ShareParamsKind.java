package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class ShareParamsKind {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShareParamsKind[] $VALUES;
    private final int value;
    public static final ShareParamsKind TEXT = new ShareParamsKind("TEXT", 0, 1);
    public static final ShareParamsKind IMAGE = new ShareParamsKind("IMAGE", 1, 2);
    public static final ShareParamsKind LINK = new ShareParamsKind("LINK", 2, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShareParamsKind[] $values() {
        return new ShareParamsKind[]{TEXT, IMAGE, LINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShareParamsKind> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ShareParamsKind(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ShareParamsKind[] shareParamsKindArr$values = $values();
        $VALUES = shareParamsKindArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shareParamsKindArr$values);
    }

    public static ShareParamsKind valueOf(String str) {
        return (ShareParamsKind) Enum.valueOf(ShareParamsKind.class, str);
    }

    public static ShareParamsKind[] values() {
        return (ShareParamsKind[]) $VALUES.clone();
    }
}
