package uniffi.feature_restriction;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class AppMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppMode[] $VALUES;
    public static final AppMode CEFI = new AppMode("CEFI", 0);
    public static final AppMode WEB3 = new AppMode("WEB3", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppMode[] $values() {
        return new AppMode[]{CEFI, WEB3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppMode> getEntries() {
        return $ENTRIES;
    }

    private AppMode(String str, int i) {
    }

    static {
        AppMode[] appModeArr$values = $values();
        $VALUES = appModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appModeArr$values);
    }

    public static AppMode valueOf(String str) {
        return (AppMode) Enum.valueOf(AppMode.class, str);
    }

    public static AppMode[] values() {
        return (AppMode[]) $VALUES.clone();
    }
}
