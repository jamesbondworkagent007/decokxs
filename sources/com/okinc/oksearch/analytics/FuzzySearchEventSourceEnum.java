package com.okinc.oksearch.analytics;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class FuzzySearchEventSourceEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FuzzySearchEventSourceEnum[] $VALUES;
    private final String source;
    public static final FuzzySearchEventSourceEnum UNKNOWN = new FuzzySearchEventSourceEnum("UNKNOWN", 0, "UNKNOWN");
    public static final FuzzySearchEventSourceEnum OKMARKETLITE_COIN = new FuzzySearchEventSourceEnum("OKMARKETLITE_COIN", 1, "OKMARKETLITE_COIN");
    public static final FuzzySearchEventSourceEnum OKMARKET_COIN = new FuzzySearchEventSourceEnum("OKMARKET_COIN", 2, "OKMARKET_COIN");
    public static final FuzzySearchEventSourceEnum OKPAYMENTS_COIN = new FuzzySearchEventSourceEnum("OKPAYMENTS_COIN", 3, "OKPAYMENTS_COIN");
    public static final FuzzySearchEventSourceEnum OKPAYMENTS_BANK = new FuzzySearchEventSourceEnum("OKPAYMENTS_BANK", 4, "OKPAYMENTS_BANK");
    public static final FuzzySearchEventSourceEnum OKAFFILATE_CODE = new FuzzySearchEventSourceEnum("OKAFFILATE_CODE", 5, "OKAFFILATE_CODE");
    public static final FuzzySearchEventSourceEnum OKP2P_CURRENCY_QUOTE = new FuzzySearchEventSourceEnum("OKP2P_CURRENCY_QUOTE", 6, "OKP2P_CURRENCY_QUOTE");
    public static final FuzzySearchEventSourceEnum OKP2P_CURRENCY_PAIR = new FuzzySearchEventSourceEnum("OKP2P_CURRENCY_PAIR", 7, "OKP2P_CURRENCY_PAIR");
    public static final FuzzySearchEventSourceEnum OKP2P_CURRENCY = new FuzzySearchEventSourceEnum("OKP2P_CURRENCY", 8, "OKP2P_CURRENCY");
    public static final FuzzySearchEventSourceEnum OKASSETSPRO_TRANSFER = new FuzzySearchEventSourceEnum("OKASSETSPRO_TRANSFER", 9, "OKASSETSPRO_TRANSFER");
    public static final FuzzySearchEventSourceEnum OKASSETSPRO_TRANSACTION = new FuzzySearchEventSourceEnum("OKASSETSPRO_TRANSACTION", 10, "OKASSETSPRO_TRANSACTION");
    public static final FuzzySearchEventSourceEnum OKASSETSPRO_DEPOSIT = new FuzzySearchEventSourceEnum("OKASSETSPRO_DEPOSIT", 11, "OKASSETSPRO_DEPOSIT");
    public static final FuzzySearchEventSourceEnum OKASSETSPRO_WITHDRAW = new FuzzySearchEventSourceEnum("OKASSETSPRO_WITHDRAW", 12, "OKASSETSPRO_WITHDRAW");
    public static final FuzzySearchEventSourceEnum OKGROWTH = new FuzzySearchEventSourceEnum("OKGROWTH", 13, "OKGROWTH");
    public static final FuzzySearchEventSourceEnum OKTRADINGECO_CONTRACT = new FuzzySearchEventSourceEnum("OKTRADINGECO_CONTRACT", 14, "OKTRADINGECO_CONTRACT");
    public static final FuzzySearchEventSourceEnum OKTRADINGECO_COIN = new FuzzySearchEventSourceEnum("OKTRADINGECO_COIN", 15, "OKTRADINGECO_COIN");
    public static final FuzzySearchEventSourceEnum OKTRADE_LEVERAGE = new FuzzySearchEventSourceEnum("OKTRADE_LEVERAGE", 16, "OKTRADE_LEVERAGE");
    public static final FuzzySearchEventSourceEnum OKTRADE_BILLS = new FuzzySearchEventSourceEnum("OKTRADE_BILLS", 17, "OKTRADE_BILLS");
    public static final FuzzySearchEventSourceEnum OKTRADE_RECURRING = new FuzzySearchEventSourceEnum("OKTRADE_RECURRING", 18, "OKTRADE_RECURRING");
    public static final FuzzySearchEventSourceEnum OKTRADE_BORROW = new FuzzySearchEventSourceEnum("OKTRADE_BORROW", 19, "OKTRADE_BORROW");
    public static final FuzzySearchEventSourceEnum OKTRADE_MULTI_COIN = new FuzzySearchEventSourceEnum("OKTRADE_MULTI_COIN", 20, "OKTRADE_MULTI_COIN");
    public static final FuzzySearchEventSourceEnum OKTRADE_STRATEGY = new FuzzySearchEventSourceEnum("OKTRADE_STRATEGY", 21, "OKTRADE_STRATEGY");
    public static final FuzzySearchEventSourceEnum OKKTRADE_INSTRUMENTSELECT = new FuzzySearchEventSourceEnum("OKKTRADE_INSTRUMENTSELECT", 22, "OKKTRADE_INSTRUMENTSELECT");
    public static final FuzzySearchEventSourceEnum OKTRADECORE_SINGLE_COIN = new FuzzySearchEventSourceEnum("OKTRADECORE_SINGLE_COIN", 23, "OKTRADECORE_SINGLE_COIN");
    public static final FuzzySearchEventSourceEnum OKTRADECORE_COIN = new FuzzySearchEventSourceEnum("OKTRADECORE_COIN", 24, "OKTRADECORE_COIN");
    public static final FuzzySearchEventSourceEnum OKCONVERT_COIN = new FuzzySearchEventSourceEnum("OKCONVERT_COIN", 25, "OKCONVERT_COIN");
    public static final FuzzySearchEventSourceEnum LUA_BRIDGE = new FuzzySearchEventSourceEnum("LUA_BRIDGE", 26, "LUA_BRIDGE");
    public static final FuzzySearchEventSourceEnum OKWEB3PAY_RECIPIENTS_CONTACTS = new FuzzySearchEventSourceEnum("OKWEB3PAY_RECIPIENTS_CONTACTS", 27, "OKWEB3PAY_RECIPIENTS_CONTACTS");
    public static final FuzzySearchEventSourceEnum OKWEB3PAY_RECIPIENTS_FRIENDS = new FuzzySearchEventSourceEnum("OKWEB3PAY_RECIPIENTS_FRIENDS", 28, "OKWEB3PAY_RECIPIENTS_FRIENDS");
    public static final FuzzySearchEventSourceEnum MARKETLITE_CEDEFI_COIN = new FuzzySearchEventSourceEnum("MARKETLITE_CEDEFI_COIN", 29, "MARKETLITE_CEDEFI_COIN");
    public static final FuzzySearchEventSourceEnum BSC_CEDEFI_COIN = new FuzzySearchEventSourceEnum("BSC_CEDEFI_COIN", 30, "BSC_CEDEFI_COIN");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FuzzySearchEventSourceEnum[] $values() {
        return new FuzzySearchEventSourceEnum[]{UNKNOWN, OKMARKETLITE_COIN, OKMARKET_COIN, OKPAYMENTS_COIN, OKPAYMENTS_BANK, OKAFFILATE_CODE, OKP2P_CURRENCY_QUOTE, OKP2P_CURRENCY_PAIR, OKP2P_CURRENCY, OKASSETSPRO_TRANSFER, OKASSETSPRO_TRANSACTION, OKASSETSPRO_DEPOSIT, OKASSETSPRO_WITHDRAW, OKGROWTH, OKTRADINGECO_CONTRACT, OKTRADINGECO_COIN, OKTRADE_LEVERAGE, OKTRADE_BILLS, OKTRADE_RECURRING, OKTRADE_BORROW, OKTRADE_MULTI_COIN, OKTRADE_STRATEGY, OKKTRADE_INSTRUMENTSELECT, OKTRADECORE_SINGLE_COIN, OKTRADECORE_COIN, OKCONVERT_COIN, LUA_BRIDGE, OKWEB3PAY_RECIPIENTS_CONTACTS, OKWEB3PAY_RECIPIENTS_FRIENDS, MARKETLITE_CEDEFI_COIN, BSC_CEDEFI_COIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FuzzySearchEventSourceEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    private FuzzySearchEventSourceEnum(String str, int i, String str2) {
        this.source = str2;
    }

    static {
        FuzzySearchEventSourceEnum[] fuzzySearchEventSourceEnumArr$values = $values();
        $VALUES = fuzzySearchEventSourceEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(fuzzySearchEventSourceEnumArr$values);
    }

    public static FuzzySearchEventSourceEnum valueOf(String str) {
        return (FuzzySearchEventSourceEnum) Enum.valueOf(FuzzySearchEventSourceEnum.class, str);
    }

    public static FuzzySearchEventSourceEnum[] values() {
        return (FuzzySearchEventSourceEnum[]) $VALUES.clone();
    }
}
