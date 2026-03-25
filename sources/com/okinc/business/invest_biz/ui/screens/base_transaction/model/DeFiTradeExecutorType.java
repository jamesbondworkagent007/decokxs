package com.okinc.business.invest_biz.ui.screens.base_transaction.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DeFiTradeExecutorType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DeFiTradeExecutorType[] $VALUES;
    public static final DeFiTradeExecutorType NONE = new DeFiTradeExecutorType("NONE", 0);
    public static final DeFiTradeExecutorType SINGLE_INVEST = new DeFiTradeExecutorType("SINGLE_INVEST", 1);
    public static final DeFiTradeExecutorType SINGLE_REDEEM_V2 = new DeFiTradeExecutorType("SINGLE_REDEEM_V2", 2);
    public static final DeFiTradeExecutorType V2_INVEST = new DeFiTradeExecutorType("V2_INVEST", 3);
    public static final DeFiTradeExecutorType V2_REDEEM = new DeFiTradeExecutorType("V2_REDEEM", 4);
    public static final DeFiTradeExecutorType V3_INVEST = new DeFiTradeExecutorType("V3_INVEST", 5);
    public static final DeFiTradeExecutorType V3_REDEEM = new DeFiTradeExecutorType("V3_REDEEM", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DeFiTradeExecutorType[] $values() {
        return new DeFiTradeExecutorType[]{NONE, SINGLE_INVEST, SINGLE_REDEEM_V2, V2_INVEST, V2_REDEEM, V3_INVEST, V3_REDEEM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DeFiTradeExecutorType> getEntries() {
        return $ENTRIES;
    }

    private DeFiTradeExecutorType(String str, int i) {
    }

    static {
        DeFiTradeExecutorType[] deFiTradeExecutorTypeArr$values = $values();
        $VALUES = deFiTradeExecutorTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(deFiTradeExecutorTypeArr$values);
    }

    public static DeFiTradeExecutorType valueOf(String str) {
        return (DeFiTradeExecutorType) Enum.valueOf(DeFiTradeExecutorType.class, str);
    }

    public static DeFiTradeExecutorType[] values() {
        return (DeFiTradeExecutorType[]) $VALUES.clone();
    }
}
