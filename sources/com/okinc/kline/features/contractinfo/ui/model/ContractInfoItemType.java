package com.okinc.kline.features.contractinfo.ui.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ContractInfoItemType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContractInfoItemType[] $VALUES;
    public static final ContractInfoItemType SETTLEMENT_COIN = new ContractInfoItemType("SETTLEMENT_COIN", 0);
    public static final ContractInfoItemType FACE_VALUE = new ContractInfoItemType("FACE_VALUE", 1);
    public static final ContractInfoItemType TICK_SIZE = new ContractInfoItemType("TICK_SIZE", 2);
    public static final ContractInfoItemType STEP_SIZE = new ContractInfoItemType("STEP_SIZE", 3);
    public static final ContractInfoItemType MIN_TRADE_AMOUNT = new ContractInfoItemType("MIN_TRADE_AMOUNT", 4);
    public static final ContractInfoItemType LEVERAGE = new ContractInfoItemType("LEVERAGE", 5);
    public static final ContractInfoItemType PRICE_LIMIT = new ContractInfoItemType("PRICE_LIMIT", 6);
    public static final ContractInfoItemType ORDER_RULE = new ContractInfoItemType("ORDER_RULE", 7);
    public static final ContractInfoItemType OPEN_INTEREST = new ContractInfoItemType("OPEN_INTEREST", 8);
    public static final ContractInfoItemType CLOSING_PROFIT = new ContractInfoItemType("CLOSING_PROFIT", 9);
    public static final ContractInfoItemType ADL_MECHANISM = new ContractInfoItemType("ADL_MECHANISM", 10);
    public static final ContractInfoItemType UNDERLYING_INDEX = new ContractInfoItemType("UNDERLYING_INDEX", 11);
    public static final ContractInfoItemType MARK_PRICE = new ContractInfoItemType("MARK_PRICE", 12);
    public static final ContractInfoItemType VOLUME_24H = new ContractInfoItemType("VOLUME_24H", 13);
    public static final ContractInfoItemType TRADING_INSTRUMENT = new ContractInfoItemType("TRADING_INSTRUMENT", 14);
    public static final ContractInfoItemType OPEN_POSITION_LIMIT = new ContractInfoItemType("OPEN_POSITION_LIMIT", 15);
    public static final ContractInfoItemType DELIVERY_TIME = new ContractInfoItemType("DELIVERY_TIME", 16);
    public static final ContractInfoItemType DELIVERY_PROFIT = new ContractInfoItemType("DELIVERY_PROFIT", 17);
    public static final ContractInfoItemType CONTRACT_TYPE = new ContractInfoItemType("CONTRACT_TYPE", 18);
    public static final ContractInfoItemType EXPIRY_TIME = new ContractInfoItemType("EXPIRY_TIME", 19);
    public static final ContractInfoItemType STRIKE_PRICE = new ContractInfoItemType("STRIKE_PRICE", 20);
    public static final ContractInfoItemType CONTRACT_MULTIPLIER = new ContractInfoItemType("CONTRACT_MULTIPLIER", 21);
    public static final ContractInfoItemType QUOTE_COIN = new ContractInfoItemType("QUOTE_COIN", 22);
    public static final ContractInfoItemType SETTLEMENT_PRICE = new ContractInfoItemType("SETTLEMENT_PRICE", 23);
    public static final ContractInfoItemType MIN_QUOTE_UNIT = new ContractInfoItemType("MIN_QUOTE_UNIT", 24);
    public static final ContractInfoItemType EXERCISE_PROFIT = new ContractInfoItemType("EXERCISE_PROFIT", 25);
    public static final ContractInfoItemType FEE_RATE = new ContractInfoItemType("FEE_RATE", 26);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContractInfoItemType[] $values() {
        return new ContractInfoItemType[]{SETTLEMENT_COIN, FACE_VALUE, TICK_SIZE, STEP_SIZE, MIN_TRADE_AMOUNT, LEVERAGE, PRICE_LIMIT, ORDER_RULE, OPEN_INTEREST, CLOSING_PROFIT, ADL_MECHANISM, UNDERLYING_INDEX, MARK_PRICE, VOLUME_24H, TRADING_INSTRUMENT, OPEN_POSITION_LIMIT, DELIVERY_TIME, DELIVERY_PROFIT, CONTRACT_TYPE, EXPIRY_TIME, STRIKE_PRICE, CONTRACT_MULTIPLIER, QUOTE_COIN, SETTLEMENT_PRICE, MIN_QUOTE_UNIT, EXERCISE_PROFIT, FEE_RATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContractInfoItemType> getEntries() {
        return $ENTRIES;
    }

    private ContractInfoItemType(String str, int i) {
    }

    static {
        ContractInfoItemType[] contractInfoItemTypeArr$values = $values();
        $VALUES = contractInfoItemTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contractInfoItemTypeArr$values);
    }

    public static ContractInfoItemType valueOf(String str) {
        return (ContractInfoItemType) Enum.valueOf(ContractInfoItemType.class, str);
    }

    public static ContractInfoItemType[] values() {
        return (ContractInfoItemType[]) $VALUES.clone();
    }
}
