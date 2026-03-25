package uniffi.account;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class SecurityType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SecurityType[] $VALUES;
    public static final SecurityType PASSKEY = new SecurityType("PASSKEY", 0);
    public static final SecurityType GOOGLE_AUTHENTICATOR = new SecurityType("GOOGLE_AUTHENTICATOR", 1);
    public static final SecurityType PHONE = new SecurityType("PHONE", 2);
    public static final SecurityType EMAIL = new SecurityType("EMAIL", 3);
    public static final SecurityType LOGIN_PASSWORD = new SecurityType("LOGIN_PASSWORD", 4);
    public static final SecurityType DEVICE_SECURITY_SCAN = new SecurityType("DEVICE_SECURITY_SCAN", 5);
    public static final SecurityType EMERGENCY_CONTACT = new SecurityType("EMERGENCY_CONTACT", 6);
    public static final SecurityType DEVICE_MANAGEMENT = new SecurityType("DEVICE_MANAGEMENT", 7);
    public static final SecurityType ANTI_PHISHING_CODE = new SecurityType("ANTI_PHISHING_CODE", 8);
    public static final SecurityType APP_LOCK = new SecurityType("APP_LOCK", 9);
    public static final SecurityType AUTHORIZATION = new SecurityType("AUTHORIZATION", 10);
    public static final SecurityType CHANNEL_VERIFICATION = new SecurityType("CHANNEL_VERIFICATION", 11);
    public static final SecurityType DEX_ACCOUNT_MANAGEMENT = new SecurityType("DEX_ACCOUNT_MANAGEMENT", 12);
    public static final SecurityType FREEZE_ACCOUNT = new SecurityType("FREEZE_ACCOUNT", 13);
    public static final SecurityType CLOSE_ACCOUNT = new SecurityType("CLOSE_ACCOUNT", 14);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SecurityType[] $values() {
        return new SecurityType[]{PASSKEY, GOOGLE_AUTHENTICATOR, PHONE, EMAIL, LOGIN_PASSWORD, DEVICE_SECURITY_SCAN, EMERGENCY_CONTACT, DEVICE_MANAGEMENT, ANTI_PHISHING_CODE, APP_LOCK, AUTHORIZATION, CHANNEL_VERIFICATION, DEX_ACCOUNT_MANAGEMENT, FREEZE_ACCOUNT, CLOSE_ACCOUNT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SecurityType> getEntries() {
        return $ENTRIES;
    }

    private SecurityType(String str, int i) {
    }

    static {
        SecurityType[] securityTypeArr$values = $values();
        $VALUES = securityTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(securityTypeArr$values);
    }

    public static SecurityType valueOf(String str) {
        return (SecurityType) Enum.valueOf(SecurityType.class, str);
    }

    public static SecurityType[] values() {
        return (SecurityType[]) $VALUES.clone();
    }
}
