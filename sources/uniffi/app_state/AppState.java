package uniffi.app_state;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AppState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppState[] $VALUES;
    public static final AppState ACTIVE = new AppState("ACTIVE", 0);
    public static final AppState BACKGROUND = new AppState("BACKGROUND", 1);
    public static final AppState INACTIVE = new AppState("INACTIVE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppState[] $values() {
        return new AppState[]{ACTIVE, BACKGROUND, INACTIVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppState> getEntries() {
        return $ENTRIES;
    }

    private AppState(String str, int i) {
    }

    static {
        AppState[] appStateArr$values = $values();
        $VALUES = appStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appStateArr$values);
    }

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) $VALUES.clone();
    }
}
