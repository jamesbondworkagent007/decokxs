package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class PreferenceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PreferenceType[] $VALUES;
    public static final PreferenceType SELECT_LANG = new PreferenceType("SELECT_LANG", 0);
    public static final PreferenceType FIAT_SWITCH = new PreferenceType("FIAT_SWITCH", 1);
    public static final PreferenceType NIGHT_MODE = new PreferenceType("NIGHT_MODE", 2);
    public static final PreferenceType RICE_FALL_COLOR = new PreferenceType("RICE_FALL_COLOR", 3);
    public static final PreferenceType UP_DOWN_TIMEZONE = new PreferenceType("UP_DOWN_TIMEZONE", 4);
    public static final PreferenceType PRIVACY = new PreferenceType("PRIVACY", 5);
    public static final PreferenceType NOTIFICATIONS = new PreferenceType("NOTIFICATIONS", 6);
    public static final PreferenceType TOUCH_SWITCH = new PreferenceType("TOUCH_SWITCH", 7);
    public static final PreferenceType SCREENSHOT_SHARING = new PreferenceType("SCREENSHOT_SHARING", 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PreferenceType[] $values() {
        return new PreferenceType[]{SELECT_LANG, FIAT_SWITCH, NIGHT_MODE, RICE_FALL_COLOR, UP_DOWN_TIMEZONE, PRIVACY, NOTIFICATIONS, TOUCH_SWITCH, SCREENSHOT_SHARING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PreferenceType> getEntries() {
        return $ENTRIES;
    }

    private PreferenceType(String str, int i) {
    }

    static {
        PreferenceType[] preferenceTypeArr$values = $values();
        $VALUES = preferenceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(preferenceTypeArr$values);
    }

    public static PreferenceType valueOf(String str) {
        return (PreferenceType) Enum.valueOf(PreferenceType.class, str);
    }

    public static PreferenceType[] values() {
        return (PreferenceType[]) $VALUES.clone();
    }
}
