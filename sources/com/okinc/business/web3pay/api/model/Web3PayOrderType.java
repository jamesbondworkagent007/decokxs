package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class Web3PayOrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Web3PayOrderType[] $VALUES;
    public static final Activity Companion;
    private final int value;
    public static final Web3PayOrderType ADD_ASSETS = new Web3PayOrderType("ADD_ASSETS", 0, 1);
    public static final Web3PayOrderType TRANSFER = new Web3PayOrderType("TRANSFER", 1, 2);
    public static final Web3PayOrderType ONCHAIN_SEND = new Web3PayOrderType("ONCHAIN_SEND", 2, 3);
    public static final Web3PayOrderType ONCHAIN_DEPOSIT = new Web3PayOrderType("ONCHAIN_DEPOSIT", 3, 4);
    public static final Web3PayOrderType PAY = new Web3PayOrderType("PAY", 4, 5);
    public static final Web3PayOrderType RECEIVE = new Web3PayOrderType("RECEIVE", 5, 6);
    public static final Web3PayOrderType PAY_REFUND = new Web3PayOrderType("PAY_REFUND", 6, 7);
    public static final Web3PayOrderType PAY_CANCEL = new Web3PayOrderType("PAY_CANCEL", 7, 8);
    public static final Web3PayOrderType CREATE_GIFT = new Web3PayOrderType("CREATE_GIFT", 8, 14);
    public static final Web3PayOrderType CLAIM_GIFT = new Web3PayOrderType("CLAIM_GIFT", 9, 15);
    public static final Web3PayOrderType GIFT_REFUND = new Web3PayOrderType("GIFT_REFUND", 10, 16);
    public static final Web3PayOrderType CONVERT = new Web3PayOrderType("CONVERT", 11, 17);
    public static final Web3PayOrderType REWARD = new Web3PayOrderType("REWARD", 12, 19);
    public static final Web3PayOrderType PURCHASE = new Web3PayOrderType("PURCHASE", 13, 60000);
    public static final Web3PayOrderType PURCHASE_RECEIVE = new Web3PayOrderType("PURCHASE_RECEIVE", 14, 60001);
    public static final Web3PayOrderType PURCHASE_REFUND = new Web3PayOrderType("PURCHASE_REFUND", 15, 60002);
    public static final Web3PayOrderType CARD_APPROVE = new Web3PayOrderType("CARD_APPROVE", 16, 20101);
    public static final Web3PayOrderType CARD_REVOKE = new Web3PayOrderType("CARD_REVOKE", 17, 20103);
    public static final Web3PayOrderType CARD_PURCHASE = new Web3PayOrderType("CARD_PURCHASE", 18, 20130);
    public static final Web3PayOrderType CARD_VERIFICATION = new Web3PayOrderType("CARD_VERIFICATION", 19, 20131);
    public static final Web3PayOrderType CARD_REFUND = new Web3PayOrderType("CARD_REFUND", 20, 20132);
    public static final Web3PayOrderType CARD_REWARD = new Web3PayOrderType("CARD_REWARD", 21, 20133);
    public static final Web3PayOrderType CARD_REWARD_ADJUST = new Web3PayOrderType("CARD_REWARD_ADJUST", 22, 20134);
    public static final Web3PayOrderType CARD_PROVISIONAL_DEBIT = new Web3PayOrderType("CARD_PROVISIONAL_DEBIT", 23, 20135);
    public static final Web3PayOrderType CARD_CREDIT_ADJUST = new Web3PayOrderType("CARD_CREDIT_ADJUST", 24, 20136);
    public static final Web3PayOrderType CARD_GROWTH_CENTER_REFERRAL_REWARD = new Web3PayOrderType("CARD_GROWTH_CENTER_REFERRAL_REWARD", 25, 20137);
    public static final Web3PayOrderType CARD_SUBSCRIPTION_REWARD = new Web3PayOrderType("CARD_SUBSCRIPTION_REWARD", 26, 20138);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Web3PayOrderType[] $values() {
        return new Web3PayOrderType[]{ADD_ASSETS, TRANSFER, ONCHAIN_SEND, ONCHAIN_DEPOSIT, PAY, RECEIVE, PAY_REFUND, PAY_CANCEL, CREATE_GIFT, CLAIM_GIFT, GIFT_REFUND, CONVERT, REWARD, PURCHASE, PURCHASE_RECEIVE, PURCHASE_REFUND, CARD_APPROVE, CARD_REVOKE, CARD_PURCHASE, CARD_VERIFICATION, CARD_REFUND, CARD_REWARD, CARD_REWARD_ADJUST, CARD_PROVISIONAL_DEBIT, CARD_CREDIT_ADJUST, CARD_GROWTH_CENTER_REFERRAL_REWARD, CARD_SUBSCRIPTION_REWARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Web3PayOrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private Web3PayOrderType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        Web3PayOrderType[] web3PayOrderTypeArr$values = $values();
        $VALUES = web3PayOrderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(web3PayOrderTypeArr$values);
        Companion = new Activity(null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.Web3PayOrderType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static Web3PayOrderType valueOf(String str) {
        return (Web3PayOrderType) Enum.valueOf(Web3PayOrderType.class, str);
    }

    public static Web3PayOrderType[] values() {
        return (Web3PayOrderType[]) $VALUES.clone();
    }
}
