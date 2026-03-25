package uniffi.settings;

import com.okinc.auth.impl.mfa.model.MfaResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SettingsErrorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SettingsErrorType[] $VALUES;
    private final int value;
    public static final SettingsErrorType CUSTOM_ERROR = new SettingsErrorType("CUSTOM_ERROR", 0, -3);
    public static final SettingsErrorType UNKNOWN = new SettingsErrorType("UNKNOWN", 1, -2);
    public static final SettingsErrorType GENERIC = new SettingsErrorType("GENERIC", 2, -1);
    public static final SettingsErrorType INVALID_TOKEN = new SettingsErrorType("INVALID_TOKEN", 3, 401);
    public static final SettingsErrorType SESSION_EXPIRED = new SettingsErrorType("SESSION_EXPIRED", 4, 3030);
    public static final SettingsErrorType TOO_MANY_REQUEST = new SettingsErrorType("TOO_MANY_REQUEST", 5, MfaResponse.TOO_MANY_OTP_REQUEST);
    public static final SettingsErrorType NETWORK_ISSUE = new SettingsErrorType("NETWORK_ISSUE", 6, 3950);
    public static final SettingsErrorType INVALID_SETTINGS = new SettingsErrorType("INVALID_SETTINGS", 7, 1001);
    public static final SettingsErrorType SETTINGS_NOT_FOUND = new SettingsErrorType("SETTINGS_NOT_FOUND", 8, 1002);
    public static final SettingsErrorType CACHE_ERROR = new SettingsErrorType("CACHE_ERROR", 9, 1003);
    public static final SettingsErrorType CURRENCY_NOT_FOUND = new SettingsErrorType("CURRENCY_NOT_FOUND", 10, 1004);
    public static final SettingsErrorType INVALID_CURRENCY_ID = new SettingsErrorType("INVALID_CURRENCY_ID", 11, 1005);
    public static final SettingsErrorType USER_NOT_LOGGED_IN = new SettingsErrorType("USER_NOT_LOGGED_IN", 12, 1006);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SettingsErrorType[] $values() {
        return new SettingsErrorType[]{CUSTOM_ERROR, UNKNOWN, GENERIC, INVALID_TOKEN, SESSION_EXPIRED, TOO_MANY_REQUEST, NETWORK_ISSUE, INVALID_SETTINGS, SETTINGS_NOT_FOUND, CACHE_ERROR, CURRENCY_NOT_FOUND, INVALID_CURRENCY_ID, USER_NOT_LOGGED_IN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SettingsErrorType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SettingsErrorType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SettingsErrorType[] settingsErrorTypeArr$values = $values();
        $VALUES = settingsErrorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(settingsErrorTypeArr$values);
    }

    public static SettingsErrorType valueOf(String str) {
        return (SettingsErrorType) Enum.valueOf(SettingsErrorType.class, str);
    }

    public static SettingsErrorType[] values() {
        return (SettingsErrorType[]) $VALUES.clone();
    }
}
