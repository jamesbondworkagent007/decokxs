package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class ShareType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShareType[] $VALUES;
    private final int value;
    public static final ShareType SHARE_TEXT = new ShareType("SHARE_TEXT", 0, 1);
    public static final ShareType SHARE_IMAGE = new ShareType("SHARE_IMAGE", 1, 2);
    public static final ShareType SHARE_WEBPAGE = new ShareType("SHARE_WEBPAGE", 2, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShareType[] $values() {
        return new ShareType[]{SHARE_TEXT, SHARE_IMAGE, SHARE_WEBPAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShareType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ShareType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ShareType[] shareTypeArr$values = $values();
        $VALUES = shareTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shareTypeArr$values);
    }

    public static ShareType valueOf(String str) {
        return (ShareType) Enum.valueOf(ShareType.class, str);
    }

    public static ShareType[] values() {
        return (ShareType[]) $VALUES.clone();
    }
}
