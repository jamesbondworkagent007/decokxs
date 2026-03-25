package com.okinc.business.dexui.main.swap.history.detail.adapter;

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
    public static final ItemType ITEM_TYPE_CREATE_TIME = new ItemType("ITEM_TYPE_CREATE_TIME", 0, "0");
    public static final ItemType ITEM_TYPE_SWAP_TYPE = new ItemType("ITEM_TYPE_SWAP_TYPE", 1, "2");
    public static final ItemType ITEM_TYPE_NETWORK = new ItemType("ITEM_TYPE_NETWORK", 2, "3");
    public static final ItemType ITEM_TYPE_SWAP_NETWORK_FEE_FROM = new ItemType("ITEM_TYPE_SWAP_NETWORK_FEE_FROM", 3, "4");
    public static final ItemType ITEM_TYPE_SWAP_NETWORK_FEE_BRIDGE = new ItemType("ITEM_TYPE_SWAP_NETWORK_FEE_BRIDGE", 4, "5");
    public static final ItemType ITEM_TYPE_SWAP_NETWORK_FEE_TO = new ItemType("ITEM_TYPE_SWAP_NETWORK_FEE_TO", 5, OrderDetailListItem.SLIP_OUT);
    public static final ItemType ITEM_TYPE_SWAP_NETWORK_FEE_OTHER = new ItemType("ITEM_TYPE_SWAP_NETWORK_FEE_OTHER", 6, "7");
    public static final ItemType ITEM_TYPE_TX_HASH = new ItemType("ITEM_TYPE_TX_HASH", 7, "8");
    public static final ItemType ITEM_TYPE_SWAP_GAS = new ItemType("ITEM_TYPE_SWAP_GAS", 8, "9");
    public static final ItemType ITEM_TYPE_SWAP_RADIO = new ItemType("ITEM_TYPE_SWAP_RADIO", 9, "10");
    public static final ItemType ITEM_TYPE_SWAP_TIME = new ItemType("ITEM_TYPE_SWAP_TIME", 10, "11");
    public static final ItemType ITEM_TYPE_SWAP_MEV = new ItemType("ITEM_TYPE_SWAP_MEV", 11, "12");
    public static final ItemType ITEM_TYPE_FACET_WITHDRAW_TYPE = new ItemType("ITEM_TYPE_FACET_WITHDRAW_TYPE", 12, "13");
    public static final ItemType ITEM_TYPE_WITHDRAW_HASH = new ItemType("ITEM_TYPE_WITHDRAW_HASH", 13, "14");
    public static final ItemType ITEM_TYPE_SLIPPAGE = new ItemType("ITEM_TYPE_SLIPPAGE", 14, "15");
    public static final ItemType ITEM_TYPE_SWAP_DE_FI_PLATFORM = new ItemType("ITEM_TYPE_SWAP_DE_FI_PLATFORM", 15, "16");
    public static final ItemType ITEM_TYPE_SERVICE_FEE = new ItemType("ITEM_TYPE_SERVICE_FEE", 16, "17");
    public static final ItemType ITEM_TYPE_SECTION_TITLE = new ItemType("ITEM_TYPE_SECTION_TITLE", 17, "18");
    public static final ItemType ITEM_TYPE_WALLET_USED = new ItemType("ITEM_TYPE_WALLET_USED", 18, "19");
    public static final ItemType ITEM_TYPE_ORDER_TYPE = new ItemType("ITEM_TYPE_ORDER_TYPE", 19, "20");
    public static final ItemType ITEM_TYPE_DIVIDER = new ItemType("ITEM_TYPE_DIVIDER", 20, "21");
    public static final ItemType ITEM_TYPE_TRANSACTION_TYPE = new ItemType("ITEM_TYPE_TRANSACTION_TYPE", 21, "22");
    public static final ItemType ITEM_TYPE_APPROVE_METHOD = new ItemType("ITEM_TYPE_APPROVE_METHOD", 22, "23");
    public static final ItemType ITEM_TYPE_SWAP_FEE_BRIDGE = new ItemType("ITEM_TYPE_SWAP_FEE_BRIDGE", 23, "24");
    public static final ItemType ITEM_TYPE_BOOST_VOLUME = new ItemType("ITEM_TYPE_BOOST_VOLUME", 24, "25");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ItemType[] $values() {
        return new ItemType[]{ITEM_TYPE_CREATE_TIME, ITEM_TYPE_SWAP_TYPE, ITEM_TYPE_NETWORK, ITEM_TYPE_SWAP_NETWORK_FEE_FROM, ITEM_TYPE_SWAP_NETWORK_FEE_BRIDGE, ITEM_TYPE_SWAP_NETWORK_FEE_TO, ITEM_TYPE_SWAP_NETWORK_FEE_OTHER, ITEM_TYPE_TX_HASH, ITEM_TYPE_SWAP_GAS, ITEM_TYPE_SWAP_RADIO, ITEM_TYPE_SWAP_TIME, ITEM_TYPE_SWAP_MEV, ITEM_TYPE_FACET_WITHDRAW_TYPE, ITEM_TYPE_WITHDRAW_HASH, ITEM_TYPE_SLIPPAGE, ITEM_TYPE_SWAP_DE_FI_PLATFORM, ITEM_TYPE_SERVICE_FEE, ITEM_TYPE_SECTION_TITLE, ITEM_TYPE_WALLET_USED, ITEM_TYPE_ORDER_TYPE, ITEM_TYPE_DIVIDER, ITEM_TYPE_TRANSACTION_TYPE, ITEM_TYPE_APPROVE_METHOD, ITEM_TYPE_SWAP_FEE_BRIDGE, ITEM_TYPE_BOOST_VOLUME};
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
