package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class CrossAuthorizationSyncClick {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CrossAuthorizationSyncClick[] $VALUES;
    public static final CrossAuthorizationSyncClick APP_YES = new CrossAuthorizationSyncClick("APP_YES", 0);
    public static final CrossAuthorizationSyncClick APP_NO = new CrossAuthorizationSyncClick("APP_NO", 1);
    public static final CrossAuthorizationSyncClick WEB = new CrossAuthorizationSyncClick("WEB", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CrossAuthorizationSyncClick[] $values() {
        return new CrossAuthorizationSyncClick[]{APP_YES, APP_NO, WEB};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CrossAuthorizationSyncClick> getEntries() {
        return $ENTRIES;
    }

    private CrossAuthorizationSyncClick(String str, int i) {
    }

    static {
        CrossAuthorizationSyncClick[] crossAuthorizationSyncClickArr$values = $values();
        $VALUES = crossAuthorizationSyncClickArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(crossAuthorizationSyncClickArr$values);
    }

    public static CrossAuthorizationSyncClick valueOf(String str) {
        return (CrossAuthorizationSyncClick) Enum.valueOf(CrossAuthorizationSyncClick.class, str);
    }

    public static CrossAuthorizationSyncClick[] values() {
        return (CrossAuthorizationSyncClick[]) $VALUES.clone();
    }
}
