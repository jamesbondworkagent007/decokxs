package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class Web3PayTxHistoryFilterType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Web3PayTxHistoryFilterType[] $VALUES;
    public static final StateListAnimator Companion;
    public static final Web3PayTxHistoryFilterType ALL = new Web3PayTxHistoryFilterType("ALL", 0);
    public static final Web3PayTxHistoryFilterType PAY = new Web3PayTxHistoryFilterType("PAY", 1);
    public static final Web3PayTxHistoryFilterType RECEIVE = new Web3PayTxHistoryFilterType("RECEIVE", 2);
    public static final Web3PayTxHistoryFilterType ADD_ASSETS = new Web3PayTxHistoryFilterType("ADD_ASSETS", 3);
    public static final Web3PayTxHistoryFilterType TRANSFER = new Web3PayTxHistoryFilterType("TRANSFER", 4);
    public static final Web3PayTxHistoryFilterType CONVERT = new Web3PayTxHistoryFilterType("CONVERT", 5);
    public static final Web3PayTxHistoryFilterType RED_PACKET = new Web3PayTxHistoryFilterType("RED_PACKET", 6);
    public static final Web3PayTxHistoryFilterType REWARD = new Web3PayTxHistoryFilterType("REWARD", 7);
    public static final Web3PayTxHistoryFilterType MEMBERSHIP = new Web3PayTxHistoryFilterType("MEMBERSHIP", 8);
    public static final Web3PayTxHistoryFilterType PURCHASE = new Web3PayTxHistoryFilterType("PURCHASE", 9);
    public static final Web3PayTxHistoryFilterType CARD_ALL = new Web3PayTxHistoryFilterType("CARD_ALL", 10);
    public static final Web3PayTxHistoryFilterType CARD_PURCHASE = new Web3PayTxHistoryFilterType("CARD_PURCHASE", 11);
    public static final Web3PayTxHistoryFilterType CARD_APPROVE = new Web3PayTxHistoryFilterType("CARD_APPROVE", 12);
    public static final Web3PayTxHistoryFilterType CARD_REVOKE = new Web3PayTxHistoryFilterType("CARD_REVOKE", 13);
    public static final Web3PayTxHistoryFilterType CARD_REFUND = new Web3PayTxHistoryFilterType("CARD_REFUND", 14);
    public static final Web3PayTxHistoryFilterType CARD_VERIFICATION = new Web3PayTxHistoryFilterType("CARD_VERIFICATION", 15);
    public static final Web3PayTxHistoryFilterType CARD_REWARD = new Web3PayTxHistoryFilterType("CARD_REWARD", 16);
    public static final Web3PayTxHistoryFilterType CARD_REWARD_ADJUST = new Web3PayTxHistoryFilterType("CARD_REWARD_ADJUST", 17);
    public static final Web3PayTxHistoryFilterType CARD_PROVISIONAL_DEBIT = new Web3PayTxHistoryFilterType("CARD_PROVISIONAL_DEBIT", 18);
    public static final Web3PayTxHistoryFilterType CARD_CREDIT_ADJUST = new Web3PayTxHistoryFilterType("CARD_CREDIT_ADJUST", 19);
    public static final Web3PayTxHistoryFilterType CARD_GROWTH_CENTER_REFERRAL_REWARD = new Web3PayTxHistoryFilterType("CARD_GROWTH_CENTER_REFERRAL_REWARD", 20);
    public static final Web3PayTxHistoryFilterType CARD_SUBSCRIPTION_REWARD = new Web3PayTxHistoryFilterType("CARD_SUBSCRIPTION_REWARD", 21);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Web3PayTxHistoryFilterType[] $values() {
        return new Web3PayTxHistoryFilterType[]{ALL, PAY, RECEIVE, ADD_ASSETS, TRANSFER, CONVERT, RED_PACKET, REWARD, MEMBERSHIP, PURCHASE, CARD_ALL, CARD_PURCHASE, CARD_APPROVE, CARD_REVOKE, CARD_REFUND, CARD_VERIFICATION, CARD_REWARD, CARD_REWARD_ADJUST, CARD_PROVISIONAL_DEBIT, CARD_CREDIT_ADJUST, CARD_GROWTH_CENTER_REFERRAL_REWARD, CARD_SUBSCRIPTION_REWARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Web3PayTxHistoryFilterType> getEntries() {
        return $ENTRIES;
    }

    private Web3PayTxHistoryFilterType(String str, int i) {
    }

    static {
        Web3PayTxHistoryFilterType[] web3PayTxHistoryFilterTypeArr$values = $values();
        $VALUES = web3PayTxHistoryFilterTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(web3PayTxHistoryFilterTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.Web3PayTxHistoryFilterType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static Web3PayTxHistoryFilterType valueOf(String str) {
        return (Web3PayTxHistoryFilterType) Enum.valueOf(Web3PayTxHistoryFilterType.class, str);
    }

    public static Web3PayTxHistoryFilterType[] values() {
        return (Web3PayTxHistoryFilterType[]) $VALUES.clone();
    }
}
