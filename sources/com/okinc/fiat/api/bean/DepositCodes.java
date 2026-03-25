package com.okinc.fiat.api.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class DepositCodes {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DepositCodes[] $VALUES;
    private final int code;
    public static final DepositCodes KOINAL = new DepositCodes("KOINAL", 0, 1);
    public static final DepositCodes BANXA = new DepositCodes("BANXA", 1, 3);
    public static final DepositCodes MOONPAY = new DepositCodes("MOONPAY", 2, 4);
    public static final DepositCodes INDACOIN = new DepositCodes("INDACOIN", 3, 6);
    public static final DepositCodes XANPOOL = new DepositCodes("XANPOOL", 4, 5);
    public static final DepositCodes MERCURYO = new DepositCodes("MERCURYO", 5, 7);
    public static final DepositCodes COINIFY = new DepositCodes("COINIFY", 6, 8);
    public static final DepositCodes PAXFUL = new DepositCodes("PAXFUL", 7, 2);
    public static final DepositCodes OKEX_P2P = new DepositCodes("OKEX_P2P", 8, 10);
    public static final DepositCodes OKCOIN = new DepositCodes("OKCOIN", 9, 9);
    public static final DepositCodes CUBOPAY = new DepositCodes("CUBOPAY", 10, 14);
    public static final DepositCodes UTORG = new DepositCodes("UTORG", 11, 15);
    public static final DepositCodes LATAMEX = new DepositCodes("LATAMEX", 12, 11);
    public static final DepositCodes ADVCASH = new DepositCodes("ADVCASH", 13, 12);
    public static final DepositCodes MENAPAY = new DepositCodes("MENAPAY", 14, 13);
    public static final DepositCodes FIAHUB = new DepositCodes("FIAHUB", 15, 19);
    public static final DepositCodes BITBNS = new DepositCodes("BITBNS", 16, 20);
    public static final DepositCodes ITEZ = new DepositCodes("ITEZ", 17, 18);
    public static final DepositCodes GEO_PAY = new DepositCodes("GEO_PAY", 18, 21);
    public static final DepositCodes BUYUCOIN = new DepositCodes("BUYUCOIN", 19, 22);
    public static final DepositCodes FRAXEUM = new DepositCodes("FRAXEUM", 20, 23);
    public static final DepositCodes CARD_PAYMENT = new DepositCodes("CARD_PAYMENT", 21, 25);
    public static final DepositCodes FOXBIT = new DepositCodes("FOXBIT", 22, 26);
    public static final DepositCodes PAYMOUNT = new DepositCodes("PAYMOUNT", 23, 27);
    public static final DepositCodes ALCHEMY_PAY = new DepositCodes("ALCHEMY_PAY", 24, 28);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DepositCodes[] $values() {
        return new DepositCodes[]{KOINAL, BANXA, MOONPAY, INDACOIN, XANPOOL, MERCURYO, COINIFY, PAXFUL, OKEX_P2P, OKCOIN, CUBOPAY, UTORG, LATAMEX, ADVCASH, MENAPAY, FIAHUB, BITBNS, ITEZ, GEO_PAY, BUYUCOIN, FRAXEUM, CARD_PAYMENT, FOXBIT, PAYMOUNT, ALCHEMY_PAY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DepositCodes> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private DepositCodes(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        DepositCodes[] depositCodesArr$values = $values();
        $VALUES = depositCodesArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(depositCodesArr$values);
    }

    public static DepositCodes valueOf(String str) {
        return (DepositCodes) Enum.valueOf(DepositCodes.class, str);
    }

    public static DepositCodes[] values() {
        return (DepositCodes[]) $VALUES.clone();
    }
}
