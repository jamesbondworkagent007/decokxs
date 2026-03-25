package uniffi.localization;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class AppModeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppModeType[] $VALUES;
    public static final AppModeType CE_FI = new AppModeType("CE_FI", 0);
    public static final AppModeType OTHERS = new AppModeType("OTHERS", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppModeType[] $values() {
        return new AppModeType[]{CE_FI, OTHERS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppModeType> getEntries() {
        return $ENTRIES;
    }

    private AppModeType(String str, int i) {
    }

    static {
        AppModeType[] appModeTypeArr$values = $values();
        $VALUES = appModeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appModeTypeArr$values);
    }

    public static AppModeType valueOf(String str) {
        return (AppModeType) Enum.valueOf(AppModeType.class, str);
    }

    public static AppModeType[] values() {
        return (AppModeType[]) $VALUES.clone();
    }
}
