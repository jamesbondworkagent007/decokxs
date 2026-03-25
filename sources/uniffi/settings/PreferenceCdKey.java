package uniffi.settings;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class PreferenceCdKey {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreferenceCdKey[] $VALUES;
    public static final PreferenceCdKey PR_ACCOUNT_COMMON_TOAST_LANG_UPDATE_ERROR = new PreferenceCdKey("PR_ACCOUNT_COMMON_TOAST_LANG_UPDATE_ERROR", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreferenceCdKey[] $values() {
        return new PreferenceCdKey[]{PR_ACCOUNT_COMMON_TOAST_LANG_UPDATE_ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreferenceCdKey> getEntries() {
        return $ENTRIES;
    }

    private PreferenceCdKey(String str, int i) {
    }

    static {
        PreferenceCdKey[] preferenceCdKeyArr$values = $values();
        $VALUES = preferenceCdKeyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(preferenceCdKeyArr$values);
    }

    public static PreferenceCdKey valueOf(String str) {
        return (PreferenceCdKey) Enum.valueOf(PreferenceCdKey.class, str);
    }

    public static PreferenceCdKey[] values() {
        return (PreferenceCdKey[]) $VALUES.clone();
    }
}
