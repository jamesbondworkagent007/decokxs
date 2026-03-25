package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class PayMethod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PayMethod[] $VALUES;
    public static final Activity Companion;
    private static final PayMethod DEFAULT_PAY_METHOD;
    public static final PayMethod PAY_A_CONTACT;
    public static final PayMethod PAY_A_WALLET_ADDRESS;
    public static final PayMethod PAY_TO_EXCHANGE;
    private final String sharedPrefsValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PayMethod[] $values() {
        return new PayMethod[]{PAY_A_CONTACT, PAY_A_WALLET_ADDRESS, PAY_TO_EXCHANGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PayMethod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSharedPrefsValue() {
        return this.sharedPrefsValue;
    }

    private PayMethod(String str, int i, String str2) {
        this.sharedPrefsValue = str2;
    }

    static {
        PayMethod payMethod = new PayMethod("PAY_A_CONTACT", 0, "pay_a_contact");
        PAY_A_CONTACT = payMethod;
        PAY_A_WALLET_ADDRESS = new PayMethod("PAY_A_WALLET_ADDRESS", 1, "pay_a_wallet_address");
        PAY_TO_EXCHANGE = new PayMethod("PAY_TO_EXCHANGE", 2, "pay_to_exchange");
        PayMethod[] payMethodArr$values = $values();
        $VALUES = payMethodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(payMethodArr$values);
        Companion = new Activity(null);
        DEFAULT_PAY_METHOD = payMethod;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.PayMethod.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static PayMethod valueOf(String str) {
        return (PayMethod) Enum.valueOf(PayMethod.class, str);
    }

    public static PayMethod[] values() {
        return (PayMethod[]) $VALUES.clone();
    }
}
