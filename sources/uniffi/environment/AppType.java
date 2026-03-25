package uniffi.environment;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AppType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppType[] $VALUES;
    public static final AppType OKX = new AppType("OKX", 0);
    public static final AppType OKXTR = new AppType("OKXTR", 1);
    public static final AppType OK_WALLET = new AppType("OK_WALLET", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppType[] $values() {
        return new AppType[]{OKX, OKXTR, OK_WALLET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppType> getEntries() {
        return $ENTRIES;
    }

    private AppType(String str, int i) {
    }

    static {
        AppType[] appTypeArr$values = $values();
        $VALUES = appTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appTypeArr$values);
    }

    public static AppType valueOf(String str) {
        return (AppType) Enum.valueOf(AppType.class, str);
    }

    public static AppType[] values() {
        return (AppType[]) $VALUES.clone();
    }
}
