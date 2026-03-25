package uniffi.account;

import com.okinc.auth.impl.mfa.model.MfaResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class AccountErrorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AccountErrorType[] $VALUES;
    private final int value;
    public static final AccountErrorType CUSTOM_ERROR = new AccountErrorType("CUSTOM_ERROR", 0, -3);
    public static final AccountErrorType UNKNOWN = new AccountErrorType("UNKNOWN", 1, -2);
    public static final AccountErrorType GENERIC = new AccountErrorType("GENERIC", 2, -1);
    public static final AccountErrorType INVALID_TOKEN = new AccountErrorType("INVALID_TOKEN", 3, 401);
    public static final AccountErrorType SESSION_EXPIRED = new AccountErrorType("SESSION_EXPIRED", 4, 3030);
    public static final AccountErrorType TOO_MANY_REQUEST = new AccountErrorType("TOO_MANY_REQUEST", 5, MfaResponse.TOO_MANY_OTP_REQUEST);
    public static final AccountErrorType TWO_FACTOR = new AccountErrorType("TWO_FACTOR", 6, 3944);
    public static final AccountErrorType USER_NOT_EXISTS = new AccountErrorType("USER_NOT_EXISTS", 7, 3905);
    public static final AccountErrorType UNABLE_RESET_ALL = new AccountErrorType("UNABLE_RESET_ALL", 8, 33902);
    public static final AccountErrorType ON_GOING_TICKET = new AccountErrorType("ON_GOING_TICKET", 9, 33903);
    public static final AccountErrorType UNBIND_NO_PASSWORD = new AccountErrorType("UNBIND_NO_PASSWORD", 10, 3807);
    public static final AccountErrorType COMBINE_ACCOUNT_EMAIL = new AccountErrorType("COMBINE_ACCOUNT_EMAIL", 11, 3351);
    public static final AccountErrorType COMBINE_ACCOUNT_PHONE = new AccountErrorType("COMBINE_ACCOUNT_PHONE", 12, 3381);
    public static final AccountErrorType EMAIL_FORMAT = new AccountErrorType("EMAIL_FORMAT", 13, 3354);
    public static final AccountErrorType THIRD_PARTY_REGISTERED = new AccountErrorType("THIRD_PARTY_REGISTERED", 14, 3406);
    public static final AccountErrorType CHINESE_USER_USE_PASSPORT = new AccountErrorType("CHINESE_USER_USE_PASSPORT", 15, 3409);
    public static final AccountErrorType RESET_DUPLICATE = new AccountErrorType("RESET_DUPLICATE", 16, 3394);
    public static final AccountErrorType MFA_GENERIC_ERROR = new AccountErrorType("MFA_GENERIC_ERROR", 17, 5000);
    public static final AccountErrorType MFA_CREATE_SESSION_FAILED = new AccountErrorType("MFA_CREATE_SESSION_FAILED", 18, MfaResponse.CREATE_SESSION_FAILURE);
    public static final AccountErrorType MFA_SESSION_EXPIRED = new AccountErrorType("MFA_SESSION_EXPIRED", 19, MfaResponse.SESSION_EXPIRED);
    public static final AccountErrorType MFA_SESSION_INVALID = new AccountErrorType("MFA_SESSION_INVALID", 20, MfaResponse.SESSION_INVALID);
    public static final AccountErrorType MFA_BUSINESS_NOT_SUPPORTED = new AccountErrorType("MFA_BUSINESS_NOT_SUPPORTED", 21, MfaResponse.BUSINESS_NOT_SUPPORTED);
    public static final AccountErrorType MFA_VERIFICATION_FAILED = new AccountErrorType("MFA_VERIFICATION_FAILED", 22, MfaResponse.VERIFICATION_FAILURE);
    public static final AccountErrorType OTP_VERIFICATION_FAILED_MAX_ATTEMPTS = new AccountErrorType("OTP_VERIFICATION_FAILED_MAX_ATTEMPTS", 23, MfaResponse.MAXIMUM_RETRY);
    public static final AccountErrorType MFA_FACE_VERIFICATION_FAILED = new AccountErrorType("MFA_FACE_VERIFICATION_FAILED", 24, MfaResponse.FACIAL_CAN_RETRY);
    public static final AccountErrorType MFA_FACE_VERIFICATION_MAX_OUT = new AccountErrorType("MFA_FACE_VERIFICATION_MAX_OUT", 25, MfaResponse.FACIAL_MAXIMUM_RETRY);
    public static final AccountErrorType MFA_ONGOING_TICKET = new AccountErrorType("MFA_ONGOING_TICKET", 26, 5009);
    public static final AccountErrorType MFA_USER_LACKS_MFA_METHODS = new AccountErrorType("MFA_USER_LACKS_MFA_METHODS", 27, 5010);
    public static final AccountErrorType INVALID_SESSION_ID = new AccountErrorType("INVALID_SESSION_ID", 28, 3928);
    public static final AccountErrorType PASS_KEY_REACH_LIMIT = new AccountErrorType("PASS_KEY_REACH_LIMIT", 29, 42009);
    public static final AccountErrorType PASSKEY_ACCOUNT_FROZEN = new AccountErrorType("PASSKEY_ACCOUNT_FROZEN", 30, 42501);
    public static final AccountErrorType PASSKEY_CONCURRENT_ACTION = new AccountErrorType("PASSKEY_CONCURRENT_ACTION", 31, 42011);
    public static final AccountErrorType PASSKEY_UNLINK_LAST = new AccountErrorType("PASSKEY_UNLINK_LAST", 32, 42012);
    public static final AccountErrorType PASSKEY_TOKEN_INVALID = new AccountErrorType("PASSKEY_TOKEN_INVALID", 33, 42007);
    public static final AccountErrorType PASSKEY_EASY_REG_TOKEN_INVALID = new AccountErrorType("PASSKEY_EASY_REG_TOKEN_INVALID", 34, 42013);
    public static final AccountErrorType LOGIN_ID_USED = new AccountErrorType("LOGIN_ID_USED", 35, 3153);
    public static final AccountErrorType PHONE_FORMAT_INVALID = new AccountErrorType("PHONE_FORMAT_INVALID", 36, 3384);
    public static final AccountErrorType LOGIN_ID_USED_DURING_CODE_VERIFY = new AccountErrorType("LOGIN_ID_USED_DURING_CODE_VERIFY", 37, 3170);
    public static final AccountErrorType REGISTER_BLOCK_BY_RISK = new AccountErrorType("REGISTER_BLOCK_BY_RISK", 38, 31603);
    public static final AccountErrorType BOUND_WALLET_REACH_LIMIT = new AccountErrorType("BOUND_WALLET_REACH_LIMIT", 39, 8500);
    public static final AccountErrorType BIND_UNBIND_WALLET_NONCE_EXPIRED = new AccountErrorType("BIND_UNBIND_WALLET_NONCE_EXPIRED", 40, 8505);
    public static final AccountErrorType BIND_WALLET_NEED_KYC = new AccountErrorType("BIND_WALLET_NEED_KYC", 41, 8507);
    public static final AccountErrorType HIGH_RISK_CRR = new AccountErrorType("HIGH_RISK_CRR", 42, 3453);
    public static final AccountErrorType COMMON_VERIFICATION_ERROR = new AccountErrorType("COMMON_VERIFICATION_ERROR", 43, 3915);
    public static final AccountErrorType SUB_ACCOUNT_NAME_USED = new AccountErrorType("SUB_ACCOUNT_NAME_USED", 44, 3376);
    public static final AccountErrorType REACH_ADD_LIMIT = new AccountErrorType("REACH_ADD_LIMIT", 45, 3364);
    public static final AccountErrorType LOGINNAME_ERROR = new AccountErrorType("LOGINNAME_ERROR", 46, 3106);
    public static final AccountErrorType CREATION_FAIL = new AccountErrorType("CREATION_FAIL", 47, 3379);
    public static final AccountErrorType ACCOUNT_ALREADY_LINKED = new AccountErrorType("ACCOUNT_ALREADY_LINKED", 48, 3802);
    public static final AccountErrorType CAPTCHA_REQUIRED = new AccountErrorType("CAPTCHA_REQUIRED", 49, 3116);
    public static final AccountErrorType CAPTCHA_CHECK_BOX_REQUIRED = new AccountErrorType("CAPTCHA_CHECK_BOX_REQUIRED", 50, 3960);
    public static final AccountErrorType GEETEST_RISK_BLOCKED = new AccountErrorType("GEETEST_RISK_BLOCKED", 51, 3951);
    public static final AccountErrorType GEETEST_IP_MISMATCH = new AccountErrorType("GEETEST_IP_MISMATCH", 52, 3952);
    public static final AccountErrorType GEETEST_DEEPKNOW_NO_RECORD = new AccountErrorType("GEETEST_DEEPKNOW_NO_RECORD", 53, 3953);
    public static final AccountErrorType CAPTCHA_VENDOR_UNAVAILABLE = new AccountErrorType("CAPTCHA_VENDOR_UNAVAILABLE", 54, 3959);
    public static final AccountErrorType ACCOUNT_CONNECT_ALREADY_BOUND = new AccountErrorType("ACCOUNT_CONNECT_ALREADY_BOUND", 55, 10400);
    public static final AccountErrorType ACCOUNT_CONNECT_SUB_ACCOUNT_NOT_ALLOWED = new AccountErrorType("ACCOUNT_CONNECT_SUB_ACCOUNT_NOT_ALLOWED", 56, 10401);
    public static final AccountErrorType ACCOUNT_CONNECT_KYC_INSUFFICIENT = new AccountErrorType("ACCOUNT_CONNECT_KYC_INSUFFICIENT", 57, 10402);
    public static final AccountErrorType ACCOUNT_CONNECT_BINDING_TOKEN_EXPIRED = new AccountErrorType("ACCOUNT_CONNECT_BINDING_TOKEN_EXPIRED", 58, 10403);
    public static final AccountErrorType ACCOUNT_CONNECT_ACCOUNT_SWITCHED = new AccountErrorType("ACCOUNT_CONNECT_ACCOUNT_SWITCHED", 59, 10404);
    public static final AccountErrorType DEVICE_RISK_REJECTED = new AccountErrorType("DEVICE_RISK_REJECTED", 60, 3136);
    public static final AccountErrorType ACCOUNT_BLACKLISTED = new AccountErrorType("ACCOUNT_BLACKLISTED", 61, 3137);
    public static final AccountErrorType INVALID_CREDENTIAL = new AccountErrorType("INVALID_CREDENTIAL", 62, 3111);
    public static final AccountErrorType ACCOUNT_LOCKED = new AccountErrorType("ACCOUNT_LOCKED", 63, 3118);
    public static final AccountErrorType ACCOUNT_FROZEN = new AccountErrorType("ACCOUNT_FROZEN", 64, 3102);
    public static final AccountErrorType ACCOUNT_SELF_FROZEN = new AccountErrorType("ACCOUNT_SELF_FROZEN", 65, 3127);
    public static final AccountErrorType ACCOUNT_DELETED = new AccountErrorType("ACCOUNT_DELETED", 66, 3108);
    public static final AccountErrorType NETWORK_ISSUE = new AccountErrorType("NETWORK_ISSUE", 67, 3950);
    public static final AccountErrorType NEW_DEVICE_AUTH_ERROR = new AccountErrorType("NEW_DEVICE_AUTH_ERROR", 68, 3131);
    public static final AccountErrorType NOT_UNDER_SAME_NETWORK_OR_LOGIN_USER_FREEZE_COOLING = new AccountErrorType("NOT_UNDER_SAME_NETWORK_OR_LOGIN_USER_FREEZE_COOLING", 69, 3128);
    public static final AccountErrorType INCORRECT_APP_OTP = new AccountErrorType("INCORRECT_APP_OTP", 70, 3129);
    public static final AccountErrorType VERIFY_TIMEOUT = new AccountErrorType("VERIFY_TIMEOUT", 71, 3124);
    public static final AccountErrorType DEVICE_KEYSTORE_INCOMPATIBLE = new AccountErrorType("DEVICE_KEYSTORE_INCOMPATIBLE", 72, 3142);
    public static final AccountErrorType PASSKEY_SWITCH_SITE_REQUIRED = new AccountErrorType("PASSKEY_SWITCH_SITE_REQUIRED", 73, 3143);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AccountErrorType[] $values() {
        return new AccountErrorType[]{CUSTOM_ERROR, UNKNOWN, GENERIC, INVALID_TOKEN, SESSION_EXPIRED, TOO_MANY_REQUEST, TWO_FACTOR, USER_NOT_EXISTS, UNABLE_RESET_ALL, ON_GOING_TICKET, UNBIND_NO_PASSWORD, COMBINE_ACCOUNT_EMAIL, COMBINE_ACCOUNT_PHONE, EMAIL_FORMAT, THIRD_PARTY_REGISTERED, CHINESE_USER_USE_PASSPORT, RESET_DUPLICATE, MFA_GENERIC_ERROR, MFA_CREATE_SESSION_FAILED, MFA_SESSION_EXPIRED, MFA_SESSION_INVALID, MFA_BUSINESS_NOT_SUPPORTED, MFA_VERIFICATION_FAILED, OTP_VERIFICATION_FAILED_MAX_ATTEMPTS, MFA_FACE_VERIFICATION_FAILED, MFA_FACE_VERIFICATION_MAX_OUT, MFA_ONGOING_TICKET, MFA_USER_LACKS_MFA_METHODS, INVALID_SESSION_ID, PASS_KEY_REACH_LIMIT, PASSKEY_ACCOUNT_FROZEN, PASSKEY_CONCURRENT_ACTION, PASSKEY_UNLINK_LAST, PASSKEY_TOKEN_INVALID, PASSKEY_EASY_REG_TOKEN_INVALID, LOGIN_ID_USED, PHONE_FORMAT_INVALID, LOGIN_ID_USED_DURING_CODE_VERIFY, REGISTER_BLOCK_BY_RISK, BOUND_WALLET_REACH_LIMIT, BIND_UNBIND_WALLET_NONCE_EXPIRED, BIND_WALLET_NEED_KYC, HIGH_RISK_CRR, COMMON_VERIFICATION_ERROR, SUB_ACCOUNT_NAME_USED, REACH_ADD_LIMIT, LOGINNAME_ERROR, CREATION_FAIL, ACCOUNT_ALREADY_LINKED, CAPTCHA_REQUIRED, CAPTCHA_CHECK_BOX_REQUIRED, GEETEST_RISK_BLOCKED, GEETEST_IP_MISMATCH, GEETEST_DEEPKNOW_NO_RECORD, CAPTCHA_VENDOR_UNAVAILABLE, ACCOUNT_CONNECT_ALREADY_BOUND, ACCOUNT_CONNECT_SUB_ACCOUNT_NOT_ALLOWED, ACCOUNT_CONNECT_KYC_INSUFFICIENT, ACCOUNT_CONNECT_BINDING_TOKEN_EXPIRED, ACCOUNT_CONNECT_ACCOUNT_SWITCHED, DEVICE_RISK_REJECTED, ACCOUNT_BLACKLISTED, INVALID_CREDENTIAL, ACCOUNT_LOCKED, ACCOUNT_FROZEN, ACCOUNT_SELF_FROZEN, ACCOUNT_DELETED, NETWORK_ISSUE, NEW_DEVICE_AUTH_ERROR, NOT_UNDER_SAME_NETWORK_OR_LOGIN_USER_FREEZE_COOLING, INCORRECT_APP_OTP, VERIFY_TIMEOUT, DEVICE_KEYSTORE_INCOMPATIBLE, PASSKEY_SWITCH_SITE_REQUIRED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AccountErrorType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AccountErrorType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AccountErrorType[] accountErrorTypeArr$values = $values();
        $VALUES = accountErrorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(accountErrorTypeArr$values);
    }

    public static AccountErrorType valueOf(String str) {
        return (AccountErrorType) Enum.valueOf(AccountErrorType.class, str);
    }

    public static AccountErrorType[] values() {
        return (AccountErrorType[]) $VALUES.clone();
    }
}
