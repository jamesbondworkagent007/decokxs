package com.okinc.business.invest_biz.data.contants;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TransactionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    private final int value;
    public static final TransactionType Invest = new TransactionType("Invest", 0, 1);
    public static final TransactionType Redeem = new TransactionType("Redeem", 1, 2);
    public static final TransactionType Univ3Invest = new TransactionType("Univ3Invest", 2, 3);
    public static final TransactionType Univ3Redeem = new TransactionType("Univ3Redeem", 3, 4);
    public static final TransactionType Univ3FarmInvest = new TransactionType("Univ3FarmInvest", 4, 5);
    public static final TransactionType Univ3FarmRedeem = new TransactionType("Univ3FarmRedeem", 5, 6);
    public static final TransactionType DotSwapInvest = new TransactionType("DotSwapInvest", 6, 7);
    public static final TransactionType DotSwapRedeem = new TransactionType("DotSwapRedeem", 7, 8);
    public static final TransactionType Mint = new TransactionType("Mint", 8, 9);
    public static final TransactionType Repay = new TransactionType("Repay", 9, 10);
    public static final TransactionType LybraInvest = new TransactionType("LybraInvest", 10, 11);
    public static final TransactionType LybraRedeem = new TransactionType("LybraRedeem", 11, 12);
    public static final TransactionType BabylonInvest = new TransactionType("BabylonInvest", 12, 13);
    public static final TransactionType BabylonRedeem = new TransactionType("BabylonRedeem", 13, 14);
    public static final TransactionType BORROW = new TransactionType("BORROW", 14, 17);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{Invest, Redeem, Univ3Invest, Univ3Redeem, Univ3FarmInvest, Univ3FarmRedeem, DotSwapInvest, DotSwapRedeem, Mint, Repay, LybraInvest, LybraRedeem, BabylonInvest, BabylonRedeem, BORROW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TransactionType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
