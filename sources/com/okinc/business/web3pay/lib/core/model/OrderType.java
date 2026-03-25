package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class OrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrderType[] $VALUES;
    public static final ActionBar Companion;
    private final int value;
    public static final OrderType ADD_ASSETS = new OrderType("ADD_ASSETS", 0, 1);
    public static final OrderType TRANSFER = new OrderType("TRANSFER", 1, 2);
    public static final OrderType ONCHAIN_SEND = new OrderType("ONCHAIN_SEND", 2, 3);
    public static final OrderType ONCHAIN_DEPOSIT = new OrderType("ONCHAIN_DEPOSIT", 3, 4);
    public static final OrderType PAY = new OrderType("PAY", 4, 5);
    public static final OrderType RECEIVE = new OrderType("RECEIVE", 5, 6);
    public static final OrderType PAY_REFUND = new OrderType("PAY_REFUND", 6, 7);
    public static final OrderType PAY_CANCEL = new OrderType("PAY_CANCEL", 7, 8);
    public static final OrderType ACCOUNT_UPDATE = new OrderType("ACCOUNT_UPDATE", 8, 13);
    public static final OrderType CREATE_GIFT = new OrderType("CREATE_GIFT", 9, 14);
    public static final OrderType CLAIM_GIFT = new OrderType("CLAIM_GIFT", 10, 15);
    public static final OrderType GIFT_REFUND = new OrderType("GIFT_REFUND", 11, 16);
    public static final OrderType CONVERT = new OrderType("CONVERT", 12, 17);
    public static final OrderType REWARD = new OrderType("REWARD", 13, 19);
    public static final OrderType PURCHASE = new OrderType("PURCHASE", 14, 60000);
    public static final OrderType PURCHASE_RECEIVE = new OrderType("PURCHASE_RECEIVE", 15, 60001);
    public static final OrderType PURCHASE_REFUND = new OrderType("PURCHASE_REFUND", 16, 60002);
    public static final OrderType CARD_APPROVE = new OrderType("CARD_APPROVE", 17, 20101);
    public static final OrderType CARD_REVOKE = new OrderType("CARD_REVOKE", 18, 20103);
    public static final OrderType CARD_PURCHASE = new OrderType("CARD_PURCHASE", 19, 20130);
    public static final OrderType CARD_VERIFICATION = new OrderType("CARD_VERIFICATION", 20, 20131);
    public static final OrderType CARD_REFUND = new OrderType("CARD_REFUND", 21, 20132);
    public static final OrderType CARD_REWARD = new OrderType("CARD_REWARD", 22, 20133);
    public static final OrderType CARD_REWARD_ADJUST = new OrderType("CARD_REWARD_ADJUST", 23, 20134);
    public static final OrderType CARD_PROVISIONAL_DEBIT = new OrderType("CARD_PROVISIONAL_DEBIT", 24, 20135);
    public static final OrderType CARD_CREDIT_ADJUST = new OrderType("CARD_CREDIT_ADJUST", 25, 20136);
    public static final OrderType CARD_GROWTH_CENTER_REFERRAL_REWARD = new OrderType("CARD_GROWTH_CENTER_REFERRAL_REWARD", 26, 20137);
    public static final OrderType CARD_SUBSCRIPTION_REWARD = new OrderType("CARD_SUBSCRIPTION_REWARD", 27, 20138);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrderType[] $values() {
        return new OrderType[]{ADD_ASSETS, TRANSFER, ONCHAIN_SEND, ONCHAIN_DEPOSIT, PAY, RECEIVE, PAY_REFUND, PAY_CANCEL, ACCOUNT_UPDATE, CREATE_GIFT, CLAIM_GIFT, GIFT_REFUND, CONVERT, REWARD, PURCHASE, PURCHASE_RECEIVE, PURCHASE_REFUND, CARD_APPROVE, CARD_REVOKE, CARD_PURCHASE, CARD_VERIFICATION, CARD_REFUND, CARD_REWARD, CARD_REWARD_ADJUST, CARD_PROVISIONAL_DEBIT, CARD_CREDIT_ADJUST, CARD_GROWTH_CENTER_REFERRAL_REWARD, CARD_SUBSCRIPTION_REWARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private OrderType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        OrderType[] orderTypeArr$values = $values();
        $VALUES = orderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orderTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.OrderType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final OrderType OLrzqt(int i) {
            for (OrderType orderType : OrderType.values()) {
                if (orderType.getValue() == i) {
                    return orderType;
                }
            }
            return null;
        }
    }

    public static OrderType valueOf(String str) {
        return (OrderType) Enum.valueOf(OrderType.class, str);
    }

    public static OrderType[] values() {
        return (OrderType[]) $VALUES.clone();
    }
}
