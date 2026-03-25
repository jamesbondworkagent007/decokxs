package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class PayTransactionErrorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PayTransactionErrorType[] $VALUES;
    public static final Application Companion;
    public static final PayTransactionErrorType ACCOUNT_FROZEN_STATE = new PayTransactionErrorType("ACCOUNT_FROZEN_STATE", 0, 1);
    public static final PayTransactionErrorType CEFI_WITHDRAWAL_USER_CHECK_FAIL = new PayTransactionErrorType("CEFI_WITHDRAWAL_USER_CHECK_FAIL", 1, 2);
    public static final PayTransactionErrorType ORDER_PROCESSING_STATE = new PayTransactionErrorType("ORDER_PROCESSING_STATE", 2, 3);
    public static final PayTransactionErrorType ACCOUNT_RECOVERING_CHECK = new PayTransactionErrorType("ACCOUNT_RECOVERING_CHECK", 3, 4);
    public static final PayTransactionErrorType ACCOUNT_NOT_MATCHED = new PayTransactionErrorType("ACCOUNT_NOT_MATCHED", 4, 5);
    public static final PayTransactionErrorType ORDER_EXPIRED = new PayTransactionErrorType("ORDER_EXPIRED", 5, 6);
    public static final PayTransactionErrorType ORDER_CANCELLED = new PayTransactionErrorType("ORDER_CANCELLED", 6, 7);
    public static final PayTransactionErrorType REPEATED_CLAIM = new PayTransactionErrorType("REPEATED_CLAIM", 7, 8);
    public static final PayTransactionErrorType ACCOUNT_KYC_NO_PASSED = new PayTransactionErrorType("ACCOUNT_KYC_NO_PASSED", 8, 9);
    public static final PayTransactionErrorType ACCOUNT_TRIG_FORBIDDEN_COUNTRY = new PayTransactionErrorType("ACCOUNT_TRIG_FORBIDDEN_COUNTRY", 9, 10);
    public static final PayTransactionErrorType RISK_REJECT = new PayTransactionErrorType("RISK_REJECT", 10, 11);
    public static final PayTransactionErrorType RISK_HOLD = new PayTransactionErrorType("RISK_HOLD", 11, 12);
    public static final PayTransactionErrorType RISK_VERIFY = new PayTransactionErrorType("RISK_VERIFY", 12, 13);
    public static final PayTransactionErrorType WITHDRAWAL_UNAVAIL_HOLD = new PayTransactionErrorType("WITHDRAWAL_UNAVAIL_HOLD", 13, 14);
    public static final PayTransactionErrorType WITHDRAWAL_UNAVAIL_REJECT = new PayTransactionErrorType("WITHDRAWAL_UNAVAIL_REJECT", 14, 15);
    public static final PayTransactionErrorType DEPOSIT_UNAVAIL_HOLD = new PayTransactionErrorType("DEPOSIT_UNAVAIL_HOLD", 15, 16);
    public static final PayTransactionErrorType DEPOSIT_UNAVAIL_REJECT = new PayTransactionErrorType("DEPOSIT_UNAVAIL_REJECT", 16, 17);
    public static final PayTransactionErrorType ACCOUNT_RISKY_HOLD = new PayTransactionErrorType("ACCOUNT_RISKY_HOLD", 17, 18);
    public static final PayTransactionErrorType ACCOUNT_RISKY_REJECT = new PayTransactionErrorType("ACCOUNT_RISKY_REJECT", 18, 19);
    public static final PayTransactionErrorType ACCOUNT_RISKY_CS_HOLD = new PayTransactionErrorType("ACCOUNT_RISKY_CS_HOLD", 19, 20);
    public static final PayTransactionErrorType ACCOUNT_RISKY_CS_REJECT = new PayTransactionErrorType("ACCOUNT_RISKY_CS_REJECT", 20, 21);
    public static final PayTransactionErrorType FRAUD_TARGET_FROZEN_HOLD = new PayTransactionErrorType("FRAUD_TARGET_FROZEN_HOLD", 21, 22);
    public static final PayTransactionErrorType FRAUD_TARGET_FROZEN_REJECT = new PayTransactionErrorType("FRAUD_TARGET_FROZEN_REJECT", 22, 23);
    public static final PayTransactionErrorType FRAUD_TARGET_BLOCKED_HOLD = new PayTransactionErrorType("FRAUD_TARGET_BLOCKED_HOLD", 23, 24);
    public static final PayTransactionErrorType FRAUD_TARGET_BLOCKED_REJECT = new PayTransactionErrorType("FRAUD_TARGET_BLOCKED_REJECT", 24, 25);
    public static final PayTransactionErrorType PHONE_UPDATE_HOLD = new PayTransactionErrorType("PHONE_UPDATE_HOLD", 25, 26);
    public static final PayTransactionErrorType PHONE_UPDATE_REJECT = new PayTransactionErrorType("PHONE_UPDATE_REJECT", 26, 27);
    public static final PayTransactionErrorType AUTHEN_APP_UPDATE_HOLD = new PayTransactionErrorType("AUTHEN_APP_UPDATE_HOLD", 27, 28);
    public static final PayTransactionErrorType AUTHEN_APP_UPDATE_REJECT = new PayTransactionErrorType("AUTHEN_APP_UPDATE_REJECT", 28, 29);
    public static final PayTransactionErrorType EMAIL_ADDR_UPDATE_HOLD = new PayTransactionErrorType("EMAIL_ADDR_UPDATE_HOLD", 29, 30);
    public static final PayTransactionErrorType EMAIL_ADDR_UPDATE_REJECT = new PayTransactionErrorType("EMAIL_ADDR_UPDATE_REJECT", 30, 31);
    public static final PayTransactionErrorType ACCOUNT_UPDATE_HOLD = new PayTransactionErrorType("ACCOUNT_UPDATE_HOLD", 31, 32);
    public static final PayTransactionErrorType ACCOUNT_UPDATE_REJECT = new PayTransactionErrorType("ACCOUNT_UPDATE_REJECT", 32, 33);
    public static final PayTransactionErrorType PASSKEY_UPDATE_HOLD = new PayTransactionErrorType("PASSKEY_UPDATE_HOLD", 33, 34);
    public static final PayTransactionErrorType PASSKEY_UPDATE_REJECT = new PayTransactionErrorType("PASSKEY_UPDATE_REJECT", 34, 35);
    public static final PayTransactionErrorType INVALID_EMAIL = new PayTransactionErrorType("INVALID_EMAIL", 35, 36);
    public static final PayTransactionErrorType NETWORK_MAINTAINING = new PayTransactionErrorType("NETWORK_MAINTAINING", 36, 37);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PayTransactionErrorType[] $values() {
        return new PayTransactionErrorType[]{ACCOUNT_FROZEN_STATE, CEFI_WITHDRAWAL_USER_CHECK_FAIL, ORDER_PROCESSING_STATE, ACCOUNT_RECOVERING_CHECK, ACCOUNT_NOT_MATCHED, ORDER_EXPIRED, ORDER_CANCELLED, REPEATED_CLAIM, ACCOUNT_KYC_NO_PASSED, ACCOUNT_TRIG_FORBIDDEN_COUNTRY, RISK_REJECT, RISK_HOLD, RISK_VERIFY, WITHDRAWAL_UNAVAIL_HOLD, WITHDRAWAL_UNAVAIL_REJECT, DEPOSIT_UNAVAIL_HOLD, DEPOSIT_UNAVAIL_REJECT, ACCOUNT_RISKY_HOLD, ACCOUNT_RISKY_REJECT, ACCOUNT_RISKY_CS_HOLD, ACCOUNT_RISKY_CS_REJECT, FRAUD_TARGET_FROZEN_HOLD, FRAUD_TARGET_FROZEN_REJECT, FRAUD_TARGET_BLOCKED_HOLD, FRAUD_TARGET_BLOCKED_REJECT, PHONE_UPDATE_HOLD, PHONE_UPDATE_REJECT, AUTHEN_APP_UPDATE_HOLD, AUTHEN_APP_UPDATE_REJECT, EMAIL_ADDR_UPDATE_HOLD, EMAIL_ADDR_UPDATE_REJECT, ACCOUNT_UPDATE_HOLD, ACCOUNT_UPDATE_REJECT, PASSKEY_UPDATE_HOLD, PASSKEY_UPDATE_REJECT, INVALID_EMAIL, NETWORK_MAINTAINING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PayTransactionErrorType> getEntries() {
        return $ENTRIES;
    }

    private PayTransactionErrorType(String str, int i, int i2) {
    }

    static {
        PayTransactionErrorType[] payTransactionErrorTypeArr$values = $values();
        $VALUES = payTransactionErrorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(payTransactionErrorTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.PayTransactionErrorType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final PayTransactionErrorType KWHzl(int i) {
            if (i == 10008) {
                return PayTransactionErrorType.ACCOUNT_RECOVERING_CHECK;
            }
            if (i == 10009) {
                return PayTransactionErrorType.ACCOUNT_FROZEN_STATE;
            }
            if (i == 10011) {
                return PayTransactionErrorType.ACCOUNT_KYC_NO_PASSED;
            }
            if (i == 10030) {
                return PayTransactionErrorType.INVALID_EMAIL;
            }
            if (i == 20090) {
                return PayTransactionErrorType.NETWORK_MAINTAINING;
            }
            if (i == 10013) {
                return PayTransactionErrorType.CEFI_WITHDRAWAL_USER_CHECK_FAIL;
            }
            if (i != 10014) {
                switch (i) {
                    case 20005:
                        return PayTransactionErrorType.ORDER_EXPIRED;
                    case 20006:
                        return PayTransactionErrorType.ACCOUNT_NOT_MATCHED;
                    case 20007:
                        return PayTransactionErrorType.ORDER_CANCELLED;
                    case 20008:
                        return PayTransactionErrorType.ORDER_PROCESSING_STATE;
                    case 20009:
                        return PayTransactionErrorType.REPEATED_CLAIM;
                    default:
                        switch (i) {
                            case 40002:
                                return PayTransactionErrorType.RISK_REJECT;
                            case 40003:
                                return PayTransactionErrorType.RISK_HOLD;
                            case 40004:
                                return PayTransactionErrorType.RISK_VERIFY;
                            default:
                                switch (i) {
                                    case 40101:
                                        return PayTransactionErrorType.WITHDRAWAL_UNAVAIL_HOLD;
                                    case 40102:
                                        return PayTransactionErrorType.WITHDRAWAL_UNAVAIL_REJECT;
                                    case 40103:
                                        return PayTransactionErrorType.DEPOSIT_UNAVAIL_HOLD;
                                    case 40104:
                                        return PayTransactionErrorType.DEPOSIT_UNAVAIL_REJECT;
                                    case 40105:
                                        return PayTransactionErrorType.ACCOUNT_RISKY_HOLD;
                                    case 40106:
                                        return PayTransactionErrorType.ACCOUNT_RISKY_REJECT;
                                    case 40107:
                                        return PayTransactionErrorType.ACCOUNT_RISKY_CS_HOLD;
                                    case 40108:
                                        return PayTransactionErrorType.ACCOUNT_RISKY_CS_REJECT;
                                    case 40109:
                                        return PayTransactionErrorType.FRAUD_TARGET_FROZEN_HOLD;
                                    case 40110:
                                        return PayTransactionErrorType.FRAUD_TARGET_FROZEN_REJECT;
                                    case 40111:
                                        return PayTransactionErrorType.FRAUD_TARGET_BLOCKED_HOLD;
                                    case 40112:
                                        return PayTransactionErrorType.FRAUD_TARGET_BLOCKED_REJECT;
                                    default:
                                        switch (i) {
                                            case 40201:
                                                return PayTransactionErrorType.PHONE_UPDATE_HOLD;
                                            case 40202:
                                                return PayTransactionErrorType.PHONE_UPDATE_REJECT;
                                            case 40203:
                                                return PayTransactionErrorType.AUTHEN_APP_UPDATE_HOLD;
                                            case 40204:
                                                return PayTransactionErrorType.AUTHEN_APP_UPDATE_REJECT;
                                            case 40205:
                                                return PayTransactionErrorType.EMAIL_ADDR_UPDATE_HOLD;
                                            case 40206:
                                                return PayTransactionErrorType.EMAIL_ADDR_UPDATE_REJECT;
                                            case 40207:
                                                return PayTransactionErrorType.ACCOUNT_UPDATE_HOLD;
                                            case 40208:
                                                return PayTransactionErrorType.ACCOUNT_UPDATE_REJECT;
                                            case 40209:
                                                return PayTransactionErrorType.PASSKEY_UPDATE_HOLD;
                                            case 40210:
                                                return PayTransactionErrorType.PASSKEY_UPDATE_REJECT;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
            }
            return PayTransactionErrorType.ACCOUNT_TRIG_FORBIDDEN_COUNTRY;
        }
    }

    public static PayTransactionErrorType valueOf(String str) {
        return (PayTransactionErrorType) Enum.valueOf(PayTransactionErrorType.class, str);
    }

    public static PayTransactionErrorType[] values() {
        return (PayTransactionErrorType[]) $VALUES.clone();
    }
}
