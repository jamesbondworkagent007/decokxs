package com.okinc.business.web3pay.lib.core.model;

import face.security.device.api.FaceSecCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TransactionAlertType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionAlertType[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final TransactionAlertType ORDER_PENDING_STATE = new TransactionAlertType("ORDER_PENDING_STATE", 0, 1);
    public static final TransactionAlertType ACCOUNT_RECOVERING = new TransactionAlertType("ACCOUNT_RECOVERING", 1, 2);
    public static final TransactionAlertType ACCOUNT_FROZEN_STATE = new TransactionAlertType("ACCOUNT_FROZEN_STATE", 2, 3);
    public static final TransactionAlertType EXCHANGE_NOT_SUPPORT = new TransactionAlertType("EXCHANGE_NOT_SUPPORT", 3, 4);
    public static final TransactionAlertType EXCHANGE_NOT_SUPPORT_CRYPTO = new TransactionAlertType("EXCHANGE_NOT_SUPPORT_CRYPTO", 4, 5);
    public static final TransactionAlertType ACCOUNT_KYC_NO_PASSED = new TransactionAlertType("ACCOUNT_KYC_NO_PASSED", 5, 6);
    public static final TransactionAlertType ACCOUNT_TRIG_FORBIDDEN_COUNTRY = new TransactionAlertType("ACCOUNT_TRIG_FORBIDDEN_COUNTRY", 6, 7);
    public static final TransactionAlertType RISK_REJECT = new TransactionAlertType("RISK_REJECT", 7, 8);
    public static final TransactionAlertType RISK_HOLD = new TransactionAlertType("RISK_HOLD", 8, 9);
    public static final TransactionAlertType RISK_VERIFY = new TransactionAlertType("RISK_VERIFY", 9, 10);
    public static final TransactionAlertType RECIPIENT_TRIG_FORBIDDEN_COUNTRY = new TransactionAlertType("RECIPIENT_TRIG_FORBIDDEN_COUNTRY", 10, 11);
    public static final TransactionAlertType WITHDRAWAL_UNAVAIL_HOLD = new TransactionAlertType("WITHDRAWAL_UNAVAIL_HOLD", 11, 12);
    public static final TransactionAlertType WITHDRAWAL_UNAVAIL_REJECT = new TransactionAlertType("WITHDRAWAL_UNAVAIL_REJECT", 12, 13);
    public static final TransactionAlertType DEPOSIT_UNAVAIL_HOLD = new TransactionAlertType("DEPOSIT_UNAVAIL_HOLD", 13, 14);
    public static final TransactionAlertType DEPOSIT_UNAVAIL_REJECT = new TransactionAlertType("DEPOSIT_UNAVAIL_REJECT", 14, 15);
    public static final TransactionAlertType ACCOUNT_RISKY_HOLD = new TransactionAlertType("ACCOUNT_RISKY_HOLD", 15, 16);
    public static final TransactionAlertType ACCOUNT_RISKY_REJECT = new TransactionAlertType("ACCOUNT_RISKY_REJECT", 16, 17);
    public static final TransactionAlertType ACCOUNT_RISKY_CS_HOLD = new TransactionAlertType("ACCOUNT_RISKY_CS_HOLD", 17, 18);
    public static final TransactionAlertType ACCOUNT_RISKY_CS_REJECT = new TransactionAlertType("ACCOUNT_RISKY_CS_REJECT", 18, 19);
    public static final TransactionAlertType FRAUD_TARGET_FROZEN_HOLD = new TransactionAlertType("FRAUD_TARGET_FROZEN_HOLD", 19, 20);
    public static final TransactionAlertType FRAUD_TARGET_FROZEN_REJECT = new TransactionAlertType("FRAUD_TARGET_FROZEN_REJECT", 20, 21);
    public static final TransactionAlertType FRAUD_TARGET_BLOCKED_HOLD = new TransactionAlertType("FRAUD_TARGET_BLOCKED_HOLD", 21, 22);
    public static final TransactionAlertType FRAUD_TARGET_BLOCKED_REJECT = new TransactionAlertType("FRAUD_TARGET_BLOCKED_REJECT", 22, 23);
    public static final TransactionAlertType PHONE_UPDATE_HOLD = new TransactionAlertType("PHONE_UPDATE_HOLD", 23, 24);
    public static final TransactionAlertType PHONE_UPDATE_REJECT = new TransactionAlertType("PHONE_UPDATE_REJECT", 24, 25);
    public static final TransactionAlertType AUTHEN_APP_UPDATE_HOLD = new TransactionAlertType("AUTHEN_APP_UPDATE_HOLD", 25, 26);
    public static final TransactionAlertType AUTHEN_APP_UPDATE_REJECT = new TransactionAlertType("AUTHEN_APP_UPDATE_REJECT", 26, 27);
    public static final TransactionAlertType EMAIL_ADDR_UPDATE_HOLD = new TransactionAlertType("EMAIL_ADDR_UPDATE_HOLD", 27, 28);
    public static final TransactionAlertType EMAIL_ADDR_UPDATE_REJECT = new TransactionAlertType("EMAIL_ADDR_UPDATE_REJECT", 28, 29);
    public static final TransactionAlertType ACCOUNT_UPDATE_HOLD = new TransactionAlertType("ACCOUNT_UPDATE_HOLD", 29, 30);
    public static final TransactionAlertType ACCOUNT_UPDATE_REJECT = new TransactionAlertType("ACCOUNT_UPDATE_REJECT", 30, 31);
    public static final TransactionAlertType PASSKEY_UPDATE_HOLD = new TransactionAlertType("PASSKEY_UPDATE_HOLD", 31, 32);
    public static final TransactionAlertType PASSKEY_UPDATE_REJECT = new TransactionAlertType("PASSKEY_UPDATE_REJECT", 32, 33);
    public static final TransactionAlertType NETWORK_MAINTAINING = new TransactionAlertType("NETWORK_MAINTAINING", 33, 34);
    public static final TransactionAlertType RISK_USER_HAS_NO_EMAIL = new TransactionAlertType("RISK_USER_HAS_NO_EMAIL", 34, 35);
    public static final TransactionAlertType INVALID_EMAIL = new TransactionAlertType("INVALID_EMAIL", 35, 36);
    public static final TransactionAlertType TRAVEL_RULE_EXPIRED = new TransactionAlertType("TRAVEL_RULE_EXPIRED", 36, 37);
    public static final TransactionAlertType CROSS_BORDER_UNSUPPORTED = new TransactionAlertType("CROSS_BORDER_UNSUPPORTED", 37, 38);
    public static final TransactionAlertType ACCOUNT_NOT_DEPLOYED = new TransactionAlertType("ACCOUNT_NOT_DEPLOYED", 38, 43);
    public static final TransactionAlertType NO_VALID_PASSKEY = new TransactionAlertType("NO_VALID_PASSKEY", 39, 44);
    public static final TransactionAlertType SUBACCOUNT_RESTRICT = new TransactionAlertType("SUBACCOUNT_RESTRICT", 40, 46);
    public static final TransactionAlertType PASSKEY_UNAVAILABLE = new TransactionAlertType("PASSKEY_UNAVAILABLE", 41, 47);
    public static final TransactionAlertType INSUFFICIENT_SYSTEM_BALANCE = new TransactionAlertType("INSUFFICIENT_SYSTEM_BALANCE", 42, 47);
    public static final TransactionAlertType EXCHANGE_ACCOUNT_FROZEN = new TransactionAlertType("EXCHANGE_ACCOUNT_FROZEN", 43, 48);
    public static final TransactionAlertType WITHDRAW_PAUSED = new TransactionAlertType("WITHDRAW_PAUSED", 44, 49);
    public static final TransactionAlertType ACCOUNT_DELETED = new TransactionAlertType("ACCOUNT_DELETED", 45, 50);
    public static final TransactionAlertType SECURITY_CHANGE = new TransactionAlertType("SECURITY_CHANGE", 46, 51);
    public static final TransactionAlertType MISSING_2FA = new TransactionAlertType("MISSING_2FA", 47, 52);
    public static final TransactionAlertType INVALID_CRYPTO_PAIR = new TransactionAlertType("INVALID_CRYPTO_PAIR", 48, 53);
    public static final TransactionAlertType INVALID_WITHDRAWAL_ADDRESS = new TransactionAlertType("INVALID_WITHDRAWAL_ADDRESS", 49, 54);
    public static final TransactionAlertType SLIPPAGE_EXCEEDED = new TransactionAlertType("SLIPPAGE_EXCEEDED", 50, 55);
    public static final TransactionAlertType INSUFFICIENT_ADDRESS_POOL = new TransactionAlertType("INSUFFICIENT_ADDRESS_POOL", 51, 56);
    public static final TransactionAlertType PURCHASE_ORDER_EXPIRED = new TransactionAlertType("PURCHASE_ORDER_EXPIRED", 52, 57);
    public static final TransactionAlertType PURCHASE_ALREADY_PAID = new TransactionAlertType("PURCHASE_ALREADY_PAID", 53, 58);
    public static final TransactionAlertType PURCHASE_INVALID_QRCODE = new TransactionAlertType("PURCHASE_INVALID_QRCODE", 54, 59);
    public static final TransactionAlertType PURCHASE_QUERY_QRCODE_FAIL = new TransactionAlertType("PURCHASE_QUERY_QRCODE_FAIL", 55, 60);
    public static final TransactionAlertType PURCHASE_SERVICE_UNAVAILABLE = new TransactionAlertType("PURCHASE_SERVICE_UNAVAILABLE", 56, 61);
    public static final TransactionAlertType PURCHASE_QUERY_RATE_FAILED = new TransactionAlertType("PURCHASE_QUERY_RATE_FAILED", 57, 62);
    public static final TransactionAlertType PURCHASE_C2B_ORDER_EXPIRED = new TransactionAlertType("PURCHASE_C2B_ORDER_EXPIRED", 58, 63);
    public static final TransactionAlertType PURCHASE_UNSUPPORTED_QRCODE = new TransactionAlertType("PURCHASE_UNSUPPORTED_QRCODE", 59, 64);
    public static final TransactionAlertType PURCHASE_EXPIRED_QRCODE = new TransactionAlertType("PURCHASE_EXPIRED_QRCODE", 60, 65);
    public static final TransactionAlertType PURCHASE_EXTERNAL_API_FAILED = new TransactionAlertType("PURCHASE_EXTERNAL_API_FAILED", 61, 66);
    public static final TransactionAlertType PURCHASE_UNSUPPORTED_CURRENCY = new TransactionAlertType("PURCHASE_UNSUPPORTED_CURRENCY", 62, 67);
    public static final TransactionAlertType PURCHASE_INPUT_AMOUNT_INVALID = new TransactionAlertType("PURCHASE_INPUT_AMOUNT_INVALID", 63, 68);
    public static final TransactionAlertType PURCHASE_TRANSACTION_LIMIT_DAILY = new TransactionAlertType("PURCHASE_TRANSACTION_LIMIT_DAILY", 64, 69);
    public static final TransactionAlertType PURCHASE_INPUT_AMOUNT_MAX = new TransactionAlertType("PURCHASE_INPUT_AMOUNT_MAX", 65, 70);
    public static final TransactionAlertType PURCHASE_INPUT_AMOUNT_MIN = new TransactionAlertType("PURCHASE_INPUT_AMOUNT_MIN", 66, 71);
    public static final TransactionAlertType PURCHASE_UNSUPPORTED_COUNTRY = new TransactionAlertType("PURCHASE_UNSUPPORTED_COUNTRY", 67, 72);
    public static final TransactionAlertType PURCHASE_TRANSACTION_LIMIT_MONTHLY = new TransactionAlertType("PURCHASE_TRANSACTION_LIMIT_MONTHLY", 68, 73);
    public static final TransactionAlertType AEON_PAY_UNAVAILABLE = new TransactionAlertType("AEON_PAY_UNAVAILABLE", 69, 74);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionAlertType[] $values() {
        return new TransactionAlertType[]{ORDER_PENDING_STATE, ACCOUNT_RECOVERING, ACCOUNT_FROZEN_STATE, EXCHANGE_NOT_SUPPORT, EXCHANGE_NOT_SUPPORT_CRYPTO, ACCOUNT_KYC_NO_PASSED, ACCOUNT_TRIG_FORBIDDEN_COUNTRY, RISK_REJECT, RISK_HOLD, RISK_VERIFY, RECIPIENT_TRIG_FORBIDDEN_COUNTRY, WITHDRAWAL_UNAVAIL_HOLD, WITHDRAWAL_UNAVAIL_REJECT, DEPOSIT_UNAVAIL_HOLD, DEPOSIT_UNAVAIL_REJECT, ACCOUNT_RISKY_HOLD, ACCOUNT_RISKY_REJECT, ACCOUNT_RISKY_CS_HOLD, ACCOUNT_RISKY_CS_REJECT, FRAUD_TARGET_FROZEN_HOLD, FRAUD_TARGET_FROZEN_REJECT, FRAUD_TARGET_BLOCKED_HOLD, FRAUD_TARGET_BLOCKED_REJECT, PHONE_UPDATE_HOLD, PHONE_UPDATE_REJECT, AUTHEN_APP_UPDATE_HOLD, AUTHEN_APP_UPDATE_REJECT, EMAIL_ADDR_UPDATE_HOLD, EMAIL_ADDR_UPDATE_REJECT, ACCOUNT_UPDATE_HOLD, ACCOUNT_UPDATE_REJECT, PASSKEY_UPDATE_HOLD, PASSKEY_UPDATE_REJECT, NETWORK_MAINTAINING, RISK_USER_HAS_NO_EMAIL, INVALID_EMAIL, TRAVEL_RULE_EXPIRED, CROSS_BORDER_UNSUPPORTED, ACCOUNT_NOT_DEPLOYED, NO_VALID_PASSKEY, SUBACCOUNT_RESTRICT, PASSKEY_UNAVAILABLE, INSUFFICIENT_SYSTEM_BALANCE, EXCHANGE_ACCOUNT_FROZEN, WITHDRAW_PAUSED, ACCOUNT_DELETED, SECURITY_CHANGE, MISSING_2FA, INVALID_CRYPTO_PAIR, INVALID_WITHDRAWAL_ADDRESS, SLIPPAGE_EXCEEDED, INSUFFICIENT_ADDRESS_POOL, PURCHASE_ORDER_EXPIRED, PURCHASE_ALREADY_PAID, PURCHASE_INVALID_QRCODE, PURCHASE_QUERY_QRCODE_FAIL, PURCHASE_SERVICE_UNAVAILABLE, PURCHASE_QUERY_RATE_FAILED, PURCHASE_C2B_ORDER_EXPIRED, PURCHASE_UNSUPPORTED_QRCODE, PURCHASE_EXPIRED_QRCODE, PURCHASE_EXTERNAL_API_FAILED, PURCHASE_UNSUPPORTED_CURRENCY, PURCHASE_INPUT_AMOUNT_INVALID, PURCHASE_TRANSACTION_LIMIT_DAILY, PURCHASE_INPUT_AMOUNT_MAX, PURCHASE_INPUT_AMOUNT_MIN, PURCHASE_UNSUPPORTED_COUNTRY, PURCHASE_TRANSACTION_LIMIT_MONTHLY, AEON_PAY_UNAVAILABLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionAlertType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TransactionAlertType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TransactionAlertType[] transactionAlertTypeArr$values = $values();
        $VALUES = transactionAlertTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionAlertTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.TransactionAlertType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TransactionAlertType EZpvd(int i) {
            if (i == 10013) {
                return TransactionAlertType.EXCHANGE_NOT_SUPPORT;
            }
            if (i == 10014) {
                return TransactionAlertType.ACCOUNT_TRIG_FORBIDDEN_COUNTRY;
            }
            if (i == 20089) {
                return TransactionAlertType.CROSS_BORDER_UNSUPPORTED;
            }
            if (i == 20090) {
                return TransactionAlertType.NETWORK_MAINTAINING;
            }
            switch (i) {
                case 10007:
                    return TransactionAlertType.ACCOUNT_NOT_DEPLOYED;
                case FaceSecCode.SC_NETWORK_RET_CODE_ERROR /* 10008 */:
                    return TransactionAlertType.ACCOUNT_RECOVERING;
                case FaceSecCode.SC_APPKEY_EMPTY /* 10009 */:
                    return TransactionAlertType.ACCOUNT_FROZEN_STATE;
                case FaceSecCode.SC_PARAMS_ERROR /* 10010 */:
                    return TransactionAlertType.NO_VALID_PASSKEY;
                case 10011:
                    return TransactionAlertType.ACCOUNT_KYC_NO_PASSED;
                default:
                    switch (i) {
                        case 10020:
                            return TransactionAlertType.RISK_USER_HAS_NO_EMAIL;
                        case 10030:
                            return TransactionAlertType.INVALID_EMAIL;
                        case 20004:
                            return TransactionAlertType.SUBACCOUNT_RESTRICT;
                        case 20008:
                            return TransactionAlertType.ORDER_PENDING_STATE;
                        case 20050:
                            return TransactionAlertType.EXCHANGE_NOT_SUPPORT_CRYPTO;
                        case 20087:
                            return TransactionAlertType.PASSKEY_UNAVAILABLE;
                        case 20095:
                            return TransactionAlertType.TRAVEL_RULE_EXPIRED;
                        case 20302:
                            return TransactionAlertType.RECIPIENT_TRIG_FORBIDDEN_COUNTRY;
                        case 60003:
                            return TransactionAlertType.PURCHASE_ORDER_EXPIRED;
                        case 60008:
                            return TransactionAlertType.PURCHASE_ALREADY_PAID;
                        case 60016:
                            break;
                        case 60037:
                            return TransactionAlertType.PURCHASE_SERVICE_UNAVAILABLE;
                        case 60043:
                            return TransactionAlertType.PURCHASE_UNSUPPORTED_CURRENCY;
                        default:
                            switch (i) {
                                case 40101:
                                    return TransactionAlertType.WITHDRAWAL_UNAVAIL_HOLD;
                                case 40102:
                                    return TransactionAlertType.WITHDRAWAL_UNAVAIL_REJECT;
                                case 40103:
                                    return TransactionAlertType.DEPOSIT_UNAVAIL_HOLD;
                                case 40104:
                                    return TransactionAlertType.DEPOSIT_UNAVAIL_REJECT;
                                case 40105:
                                    return TransactionAlertType.ACCOUNT_RISKY_HOLD;
                                case 40106:
                                    return TransactionAlertType.ACCOUNT_RISKY_REJECT;
                                case 40107:
                                    return TransactionAlertType.ACCOUNT_RISKY_CS_HOLD;
                                case 40108:
                                    return TransactionAlertType.ACCOUNT_RISKY_CS_REJECT;
                                case 40109:
                                    return TransactionAlertType.FRAUD_TARGET_FROZEN_HOLD;
                                case 40110:
                                    return TransactionAlertType.FRAUD_TARGET_FROZEN_REJECT;
                                case 40111:
                                    return TransactionAlertType.FRAUD_TARGET_BLOCKED_HOLD;
                                case 40112:
                                    return TransactionAlertType.FRAUD_TARGET_BLOCKED_REJECT;
                                default:
                                    switch (i) {
                                        case 60045:
                                            return TransactionAlertType.PURCHASE_INPUT_AMOUNT_INVALID;
                                        case 60046:
                                            return TransactionAlertType.PURCHASE_TRANSACTION_LIMIT_DAILY;
                                        case 60047:
                                            return TransactionAlertType.PURCHASE_INPUT_AMOUNT_MAX;
                                        case 60048:
                                            return TransactionAlertType.PURCHASE_INPUT_AMOUNT_MIN;
                                        case 60049:
                                            return TransactionAlertType.PURCHASE_UNSUPPORTED_COUNTRY;
                                        case 60050:
                                            return TransactionAlertType.PURCHASE_TRANSACTION_LIMIT_MONTHLY;
                                        case 60051:
                                            return TransactionAlertType.AEON_PAY_UNAVAILABLE;
                                        default:
                                            switch (i) {
                                                case 20410:
                                                    return TransactionAlertType.INSUFFICIENT_SYSTEM_BALANCE;
                                                case 20411:
                                                    return TransactionAlertType.EXCHANGE_ACCOUNT_FROZEN;
                                                case 20412:
                                                    return TransactionAlertType.WITHDRAW_PAUSED;
                                                case 20413:
                                                    return TransactionAlertType.ACCOUNT_DELETED;
                                                case 20414:
                                                    return TransactionAlertType.SECURITY_CHANGE;
                                                case 20415:
                                                    return TransactionAlertType.MISSING_2FA;
                                                case 20416:
                                                    return TransactionAlertType.INVALID_CRYPTO_PAIR;
                                                case 20417:
                                                    return TransactionAlertType.INVALID_WITHDRAWAL_ADDRESS;
                                                case 20418:
                                                    return TransactionAlertType.SLIPPAGE_EXCEEDED;
                                                case 20419:
                                                    return TransactionAlertType.INSUFFICIENT_ADDRESS_POOL;
                                                default:
                                                    switch (i) {
                                                        case 40002:
                                                            return TransactionAlertType.RISK_REJECT;
                                                        case 40003:
                                                            return TransactionAlertType.RISK_HOLD;
                                                        case 40004:
                                                            return TransactionAlertType.RISK_VERIFY;
                                                        default:
                                                            switch (i) {
                                                                case 40201:
                                                                    return TransactionAlertType.PHONE_UPDATE_HOLD;
                                                                case 40202:
                                                                    return TransactionAlertType.PHONE_UPDATE_REJECT;
                                                                case 40203:
                                                                    return TransactionAlertType.AUTHEN_APP_UPDATE_HOLD;
                                                                case 40204:
                                                                    return TransactionAlertType.AUTHEN_APP_UPDATE_REJECT;
                                                                case 40205:
                                                                    return TransactionAlertType.EMAIL_ADDR_UPDATE_HOLD;
                                                                case 40206:
                                                                    return TransactionAlertType.EMAIL_ADDR_UPDATE_REJECT;
                                                                case 40207:
                                                                    return TransactionAlertType.ACCOUNT_UPDATE_HOLD;
                                                                case 40208:
                                                                    return TransactionAlertType.ACCOUNT_UPDATE_REJECT;
                                                                case 40209:
                                                                    return TransactionAlertType.PASSKEY_UPDATE_HOLD;
                                                                case 40210:
                                                                    return TransactionAlertType.PASSKEY_UPDATE_REJECT;
                                                                default:
                                                                    switch (i) {
                                                                        case 60025:
                                                                            return TransactionAlertType.PURCHASE_QUERY_QRCODE_FAIL;
                                                                        case 60026:
                                                                            break;
                                                                        default:
                                                                            switch (i) {
                                                                                case 60030:
                                                                                    return TransactionAlertType.PURCHASE_INVALID_QRCODE;
                                                                                case 60031:
                                                                                    return TransactionAlertType.PURCHASE_UNSUPPORTED_QRCODE;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case 60039:
                                                                                            return TransactionAlertType.PURCHASE_EXPIRED_QRCODE;
                                                                                        case 60040:
                                                                                            return TransactionAlertType.PURCHASE_EXTERNAL_API_FAILED;
                                                                                        default:
                                                                                            return null;
                                                                                    }
                                                                            }
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    return TransactionAlertType.PURCHASE_QUERY_RATE_FAILED;
            }
        }
    }

    public static TransactionAlertType valueOf(String str) {
        return (TransactionAlertType) Enum.valueOf(TransactionAlertType.class, str);
    }

    public static TransactionAlertType[] values() {
        return (TransactionAlertType[]) $VALUES.clone();
    }
}
