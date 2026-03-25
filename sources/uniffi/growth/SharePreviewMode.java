package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class SharePreviewMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SharePreviewMode[] $VALUES;
    private final int value;
    public static final SharePreviewMode DEFAULT = new SharePreviewMode("DEFAULT", 0, 0);
    public static final SharePreviewMode CUSTOM = new SharePreviewMode("CUSTOM", 1, 1);
    public static final SharePreviewMode CUSTOM_LUA = new SharePreviewMode("CUSTOM_LUA", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SharePreviewMode[] $values() {
        return new SharePreviewMode[]{DEFAULT, CUSTOM, CUSTOM_LUA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SharePreviewMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SharePreviewMode(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SharePreviewMode[] sharePreviewModeArr$values = $values();
        $VALUES = sharePreviewModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sharePreviewModeArr$values);
    }

    public static SharePreviewMode valueOf(String str) {
        return (SharePreviewMode) Enum.valueOf(SharePreviewMode.class, str);
    }

    public static SharePreviewMode[] values() {
        return (SharePreviewMode[]) $VALUES.clone();
    }
}
