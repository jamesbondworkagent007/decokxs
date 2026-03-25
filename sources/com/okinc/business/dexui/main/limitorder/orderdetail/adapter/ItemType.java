package com.okinc.business.dexui.main.limitorder.orderdetail.adapter;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ItemType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;
    private final String value;
    public static final ItemType ITEM_TYPE_LIMIT_CREATE_TIME = new ItemType("ITEM_TYPE_LIMIT_CREATE_TIME", 0, "0");
    public static final ItemType ITEM_TYPE_LIMIT_EXPIRY_TIME = new ItemType("ITEM_TYPE_LIMIT_EXPIRY_TIME", 1, "1");
    public static final ItemType ITEM_TYPE_LIMIT_TYPE = new ItemType("ITEM_TYPE_LIMIT_TYPE", 2, "2");
    public static final ItemType ITEM_TYPE_LIMIT_NETWORK = new ItemType("ITEM_TYPE_LIMIT_NETWORK", 3, "3");
    public static final ItemType ITEM_TYPE_LIMIT_NETWORK_FEE = new ItemType("ITEM_TYPE_LIMIT_NETWORK_FEE", 4, "4");
    public static final ItemType ITEM_TYPE_LIMIT_NETWORK_FEE_BENEFIT = new ItemType("ITEM_TYPE_LIMIT_NETWORK_FEE_BENEFIT", 5, "5");
    public static final ItemType ITEM_TYPE_LIMIT_TRIGGER_RATE = new ItemType("ITEM_TYPE_LIMIT_TRIGGER_RATE", 6, OrderDetailListItem.SLIP_OUT);
    public static final ItemType ITEM_TYPE_LIMIT_EXECUTE_PRICE = new ItemType("ITEM_TYPE_LIMIT_EXECUTE_PRICE", 7, "7");
    public static final ItemType ITEM_TYPE_TX_HASH = new ItemType("ITEM_TYPE_TX_HASH", 8, "8");
    public static final ItemType ITEM_TYPE_MAX_TXN_FEE = new ItemType("ITEM_TYPE_MAX_TXN_FEE", 9, "9");
    public static final ItemType ITEM_TYPE_SLIPPAGE = new ItemType("ITEM_TYPE_SLIPPAGE", 10, "10");
    public static final ItemType ITEM_TYPE_CLOSING_TIME = new ItemType("ITEM_TYPE_CLOSING_TIME", 11, "11");
    public static final ItemType ITEM_TYPE_TRIGGER_PRICE_M_CAP = new ItemType("ITEM_TYPE_TRIGGER_PRICE_M_CAP", 12, "12");
    public static final ItemType ITEM_TYPE_LIMIT_SERVICE_FEE = new ItemType("ITEM_TYPE_LIMIT_SERVICE_FEE", 13, "13");
    public static final ItemType ITEM_TYPE_SECTION_TITLE = new ItemType("ITEM_TYPE_SECTION_TITLE", 14, "14");
    public static final ItemType ITEM_TYPE_ORDER_TYPE = new ItemType("ITEM_TYPE_ORDER_TYPE", 15, "15");
    public static final ItemType ITEM_TYPE_TRIGGER_PRICE = new ItemType("ITEM_TYPE_TRIGGER_PRICE", 16, "16");
    public static final ItemType ITEM_TYPE_ROUTE_SELECTION = new ItemType("ITEM_TYPE_ROUTE_SELECTION", 17, "17");
    public static final ItemType ITEM_TYPE_DIVIDER = new ItemType("ITEM_TYPE_DIVIDER", 18, "18");
    public static final ItemType ITEM_TYPE_TRANSACTION_TYPE = new ItemType("ITEM_TYPE_TRANSACTION_TYPE", 19, "19");
    public static final ItemType ITEM_TYPE_SWAP_DURATION = new ItemType("ITEM_TYPE_SWAP_DURATION", 20, "20");
    public static final ItemType ITEM_TYPE_APPROVE_METHOD = new ItemType("ITEM_TYPE_APPROVE_METHOD", 21, "21");
    public static final ItemType ITEM_TYPE_PROVIDER = new ItemType("ITEM_TYPE_PROVIDER", 22, "22");
    public static final ItemType ITEM_TYPE_WALLET_USED = new ItemType("ITEM_TYPE_WALLET_USED", 23, "23");
    public static final ItemType ITEM_TYPE_EXECUTION_RATE = new ItemType("ITEM_TYPE_EXECUTION_RATE", 24, "24");
    public static final ItemType ITEM_TYPE_COPY_TRADING_STRATEGY_TYPE = new ItemType("ITEM_TYPE_COPY_TRADING_STRATEGY_TYPE", 25, "25");
    public static final ItemType ITEM_TYPE_BOOST_VOLUME = new ItemType("ITEM_TYPE_BOOST_VOLUME", 26, "26");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ItemType[] $values() {
        return new ItemType[]{ITEM_TYPE_LIMIT_CREATE_TIME, ITEM_TYPE_LIMIT_EXPIRY_TIME, ITEM_TYPE_LIMIT_TYPE, ITEM_TYPE_LIMIT_NETWORK, ITEM_TYPE_LIMIT_NETWORK_FEE, ITEM_TYPE_LIMIT_NETWORK_FEE_BENEFIT, ITEM_TYPE_LIMIT_TRIGGER_RATE, ITEM_TYPE_LIMIT_EXECUTE_PRICE, ITEM_TYPE_TX_HASH, ITEM_TYPE_MAX_TXN_FEE, ITEM_TYPE_SLIPPAGE, ITEM_TYPE_CLOSING_TIME, ITEM_TYPE_TRIGGER_PRICE_M_CAP, ITEM_TYPE_LIMIT_SERVICE_FEE, ITEM_TYPE_SECTION_TITLE, ITEM_TYPE_ORDER_TYPE, ITEM_TYPE_TRIGGER_PRICE, ITEM_TYPE_ROUTE_SELECTION, ITEM_TYPE_DIVIDER, ITEM_TYPE_TRANSACTION_TYPE, ITEM_TYPE_SWAP_DURATION, ITEM_TYPE_APPROVE_METHOD, ITEM_TYPE_PROVIDER, ITEM_TYPE_WALLET_USED, ITEM_TYPE_EXECUTION_RATE, ITEM_TYPE_COPY_TRADING_STRATEGY_TYPE, ITEM_TYPE_BOOST_VOLUME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ItemType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private ItemType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ItemType[] itemTypeArr$values = $values();
        $VALUES = itemTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(itemTypeArr$values);
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) $VALUES.clone();
    }
}
