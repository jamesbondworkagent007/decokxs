package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TransactionEventType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionEventType[] $VALUES;
    public static final TransactionEventType EARN_DEPOSIT = new TransactionEventType("EARN_DEPOSIT", 0);
    public static final TransactionEventType EARN_REDEMPTION = new TransactionEventType("EARN_REDEMPTION", 1);
    public static final TransactionEventType EARN_INTEREST_RECEIVE = new TransactionEventType("EARN_INTEREST_RECEIVE", 2);
    public static final TransactionEventType BUY_BANK_CARD = new TransactionEventType("BUY_BANK_CARD", 3);
    public static final TransactionEventType BUY_P2P = new TransactionEventType("BUY_P2P", 4);
    public static final TransactionEventType BUY_THIRD_PARTY = new TransactionEventType("BUY_THIRD_PARTY", 5);
    public static final TransactionEventType SELL_BANK_CARD = new TransactionEventType("SELL_BANK_CARD", 6);
    public static final TransactionEventType SELL_P2P = new TransactionEventType("SELL_P2P", 7);
    public static final TransactionEventType SELL_THIRD_PARTY = new TransactionEventType("SELL_THIRD_PARTY", 8);
    public static final TransactionEventType SEND = new TransactionEventType("SEND", 9);
    public static final TransactionEventType SEND_RED_PACKET = new TransactionEventType("SEND_RED_PACKET", 10);
    public static final TransactionEventType RECEIVE = new TransactionEventType("RECEIVE", 11);
    public static final TransactionEventType RECEIVE_RED_PACKET = new TransactionEventType("RECEIVE_RED_PACKET", 12);
    public static final TransactionEventType AIRDROP = new TransactionEventType("AIRDROP", 13);
    public static final TransactionEventType CONVERT_FROM = new TransactionEventType("CONVERT_FROM", 14);
    public static final TransactionEventType CONVERT_FROM_CARD = new TransactionEventType("CONVERT_FROM_CARD", 15);
    public static final TransactionEventType CONVERT_FROM_P2P = new TransactionEventType("CONVERT_FROM_P2P", 16);
    public static final TransactionEventType CONVERT_FROM_THIRD_PARTY = new TransactionEventType("CONVERT_FROM_THIRD_PARTY", 17);
    public static final TransactionEventType CONVERT_TO = new TransactionEventType("CONVERT_TO", 18);
    public static final TransactionEventType CONVERT_TO_CARD = new TransactionEventType("CONVERT_TO_CARD", 19);
    public static final TransactionEventType CONVERT_TO_P2P = new TransactionEventType("CONVERT_TO_P2P", 20);
    public static final TransactionEventType CONVERT_TO_THIRD_PARTY = new TransactionEventType("CONVERT_TO_THIRD_PARTY", 21);
    public static final TransactionEventType LIMIT_ORDER = new TransactionEventType("LIMIT_ORDER", 22);
    public static final TransactionEventType FIAT_DEPOSIT = new TransactionEventType("FIAT_DEPOSIT", 23);
    public static final TransactionEventType FIAT_WITHDRAWAL = new TransactionEventType("FIAT_WITHDRAWAL", 24);
    public static final TransactionEventType COPY_TRADING = new TransactionEventType("COPY_TRADING", 25);
    public static final TransactionEventType SMART_ACCOUNT_TRANSFER = new TransactionEventType("SMART_ACCOUNT_TRANSFER", 26);
    public static final TransactionEventType CRYPTO_GIFT_SENT = new TransactionEventType("CRYPTO_GIFT_SENT", 27);
    public static final TransactionEventType CRYPTO_GIFT_RECEIVED = new TransactionEventType("CRYPTO_GIFT_RECEIVED", 28);
    public static final TransactionEventType CRYPTO_GIFT_REFUND = new TransactionEventType("CRYPTO_GIFT_REFUND", 29);
    public static final TransactionEventType REWARDS_RECEIVED = new TransactionEventType("REWARDS_RECEIVED", 30);
    public static final TransactionEventType TRY_EARN_DEPOSIT = new TransactionEventType("TRY_EARN_DEPOSIT", 31);
    public static final TransactionEventType TRY_EARN_REDEMPTION = new TransactionEventType("TRY_EARN_REDEMPTION", 32);
    public static final TransactionEventType TRY_EARN_EARNINGS = new TransactionEventType("TRY_EARN_EARNINGS", 33);
    public static final TransactionEventType TRY_EARN_TAX = new TransactionEventType("TRY_EARN_TAX", 34);
    public static final TransactionEventType USDG_REWARD = new TransactionEventType("USDG_REWARD", 35);
    public static final TransactionEventType RECURRING_BUY = new TransactionEventType("RECURRING_BUY", 36);
    public static final TransactionEventType COIN_YIELD_DEPOSIT = new TransactionEventType("COIN_YIELD_DEPOSIT", 37);
    public static final TransactionEventType COIN_YIELD_REDEMPTION = new TransactionEventType("COIN_YIELD_REDEMPTION", 38);
    public static final TransactionEventType COIN_YIELD_EARNINGS = new TransactionEventType("COIN_YIELD_EARNINGS", 39);
    public static final TransactionEventType COIN_YIELD_FEE = new TransactionEventType("COIN_YIELD_FEE", 40);
    public static final TransactionEventType CEDEFI_BUY = new TransactionEventType("CEDEFI_BUY", 41);
    public static final TransactionEventType CEDEFI_SELL = new TransactionEventType("CEDEFI_SELL", 42);
    public static final TransactionEventType CEDEFI_BUY_HIDDEN_LEG = new TransactionEventType("CEDEFI_BUY_HIDDEN_LEG", 43);
    public static final TransactionEventType CEDEFI_SELL_HIDDEN_LEG = new TransactionEventType("CEDEFI_SELL_HIDDEN_LEG", 44);
    public static final TransactionEventType BUY_HIDDEN_LEG = new TransactionEventType("BUY_HIDDEN_LEG", 45);
    public static final TransactionEventType SELL_HIDDEN_LEG = new TransactionEventType("SELL_HIDDEN_LEG", 46);
    public static final TransactionEventType OTC_CONVERT_FROM = new TransactionEventType("OTC_CONVERT_FROM", 47);
    public static final TransactionEventType OTC_CONVERT_TO = new TransactionEventType("OTC_CONVERT_TO", 48);
    public static final TransactionEventType CEDEFI_LEND = new TransactionEventType("CEDEFI_LEND", 49);
    public static final TransactionEventType CEDEFI_REDEMPTION = new TransactionEventType("CEDEFI_REDEMPTION", 50);
    public static final TransactionEventType CEDEFI_REWARDS = new TransactionEventType("CEDEFI_REWARDS", 51);
    public static final TransactionEventType STABLE_COIN_DEPOSIT = new TransactionEventType("STABLE_COIN_DEPOSIT", 52);
    public static final TransactionEventType BUIDL_REWARD = new TransactionEventType("BUIDL_REWARD", 53);
    public static final TransactionEventType CONVERT_BATCH_PAYMENT_ORIGIN = new TransactionEventType("CONVERT_BATCH_PAYMENT_ORIGIN", 54);
    public static final TransactionEventType CONVERT_BATCH_PAYMENT_ORIGIN_HIDDEN_LEG = new TransactionEventType("CONVERT_BATCH_PAYMENT_ORIGIN_HIDDEN_LEG", 55);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionEventType[] $values() {
        return new TransactionEventType[]{EARN_DEPOSIT, EARN_REDEMPTION, EARN_INTEREST_RECEIVE, BUY_BANK_CARD, BUY_P2P, BUY_THIRD_PARTY, SELL_BANK_CARD, SELL_P2P, SELL_THIRD_PARTY, SEND, SEND_RED_PACKET, RECEIVE, RECEIVE_RED_PACKET, AIRDROP, CONVERT_FROM, CONVERT_FROM_CARD, CONVERT_FROM_P2P, CONVERT_FROM_THIRD_PARTY, CONVERT_TO, CONVERT_TO_CARD, CONVERT_TO_P2P, CONVERT_TO_THIRD_PARTY, LIMIT_ORDER, FIAT_DEPOSIT, FIAT_WITHDRAWAL, COPY_TRADING, SMART_ACCOUNT_TRANSFER, CRYPTO_GIFT_SENT, CRYPTO_GIFT_RECEIVED, CRYPTO_GIFT_REFUND, REWARDS_RECEIVED, TRY_EARN_DEPOSIT, TRY_EARN_REDEMPTION, TRY_EARN_EARNINGS, TRY_EARN_TAX, USDG_REWARD, RECURRING_BUY, COIN_YIELD_DEPOSIT, COIN_YIELD_REDEMPTION, COIN_YIELD_EARNINGS, COIN_YIELD_FEE, CEDEFI_BUY, CEDEFI_SELL, CEDEFI_BUY_HIDDEN_LEG, CEDEFI_SELL_HIDDEN_LEG, BUY_HIDDEN_LEG, SELL_HIDDEN_LEG, OTC_CONVERT_FROM, OTC_CONVERT_TO, CEDEFI_LEND, CEDEFI_REDEMPTION, CEDEFI_REWARDS, STABLE_COIN_DEPOSIT, BUIDL_REWARD, CONVERT_BATCH_PAYMENT_ORIGIN, CONVERT_BATCH_PAYMENT_ORIGIN_HIDDEN_LEG};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionEventType> getEntries() {
        return $ENTRIES;
    }

    private TransactionEventType(String str, int i) {
    }

    static {
        TransactionEventType[] transactionEventTypeArr$values = $values();
        $VALUES = transactionEventTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionEventTypeArr$values);
    }

    public static TransactionEventType valueOf(String str) {
        return (TransactionEventType) Enum.valueOf(TransactionEventType.class, str);
    }

    public static TransactionEventType[] values() {
        return (TransactionEventType[]) $VALUES.clone();
    }
}
