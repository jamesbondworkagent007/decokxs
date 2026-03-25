package com.okinc.business.defi.assets.detail.biz;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ItemType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;
    public static final ItemType ITEM_TYPE_STATUS = new ItemType("ITEM_TYPE_STATUS", 0);
    public static final ItemType ITEM_TYPE_TIME = new ItemType("ITEM_TYPE_TIME", 1);
    public static final ItemType ITEM_TYPE_TYPE = new ItemType("ITEM_TYPE_TYPE", 2);
    public static final ItemType ITEM_TYPE_BLOCK_CONFIRMATION = new ItemType("ITEM_TYPE_BLOCK_CONFIRMATION", 3);
    public static final ItemType ITEM_TYPE_NETWORK = new ItemType("ITEM_TYPE_NETWORK", 4);
    public static final ItemType ITEM_TYPE_REGISTER_ADDRESS = new ItemType("ITEM_TYPE_REGISTER_ADDRESS", 5);
    public static final ItemType ITEM_TYPE_NETWORK_FEE = new ItemType("ITEM_TYPE_NETWORK_FEE", 6);
    public static final ItemType ITEM_TYPE_TRANSACTION_HASH = new ItemType("ITEM_TYPE_TRANSACTION_HASH", 7);
    public static final ItemType ITEM_TYPE_DETAIL_EXPLORER = new ItemType("ITEM_TYPE_DETAIL_EXPLORER", 8);
    public static final ItemType ITEM_TYPE_DETAIL_EXCHANGE = new ItemType("ITEM_TYPE_DETAIL_EXCHANGE", 9);
    public static final ItemType ITEM_TYPE_DETAIL_WALLET = new ItemType("ITEM_TYPE_DETAIL_WALLET", 10);
    public static final ItemType ITEM_TYPE_DETAIL_ON_OFF_RAMP = new ItemType("ITEM_TYPE_DETAIL_ON_OFF_RAMP", 11);
    public static final ItemType ITEM_TYPE_APPROVED_AMOUNT = new ItemType("ITEM_TYPE_APPROVED_AMOUNT", 12);
    public static final ItemType ITEM_TYPE_APPROVED_ASSETS = new ItemType("ITEM_TYPE_APPROVED_ASSETS", 13);
    public static final ItemType ITEM_TYPE_PRICE = new ItemType("ITEM_TYPE_PRICE", 14);
    public static final ItemType ITEM_TYPE_TRANSACTION_FEE = new ItemType("ITEM_TYPE_TRANSACTION_FEE", 15);
    public static final ItemType ITEM_TYPE_YOU_PAYED = new ItemType("ITEM_TYPE_YOU_PAYED", 16);
    public static final ItemType ITEM_TYPE_GAS_REBATE = new ItemType("ITEM_TYPE_GAS_REBATE", 17);
    public static final ItemType ITEM_TYPE_MEMO = new ItemType("ITEM_TYPE_MEMO", 18);
    public static final ItemType ITEM_TYPE_NONCE = new ItemType("ITEM_TYPE_NONCE", 19);
    public static final ItemType ITEM_TYPE_MEV = new ItemType("ITEM_TYPE_MEV", 20);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ItemType[] $values() {
        return new ItemType[]{ITEM_TYPE_STATUS, ITEM_TYPE_TIME, ITEM_TYPE_TYPE, ITEM_TYPE_BLOCK_CONFIRMATION, ITEM_TYPE_NETWORK, ITEM_TYPE_REGISTER_ADDRESS, ITEM_TYPE_NETWORK_FEE, ITEM_TYPE_TRANSACTION_HASH, ITEM_TYPE_DETAIL_EXPLORER, ITEM_TYPE_DETAIL_EXCHANGE, ITEM_TYPE_DETAIL_WALLET, ITEM_TYPE_DETAIL_ON_OFF_RAMP, ITEM_TYPE_APPROVED_AMOUNT, ITEM_TYPE_APPROVED_ASSETS, ITEM_TYPE_PRICE, ITEM_TYPE_TRANSACTION_FEE, ITEM_TYPE_YOU_PAYED, ITEM_TYPE_GAS_REBATE, ITEM_TYPE_MEMO, ITEM_TYPE_NONCE, ITEM_TYPE_MEV};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ItemType> getEntries() {
        return $ENTRIES;
    }

    private ItemType(String str, int i) {
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
