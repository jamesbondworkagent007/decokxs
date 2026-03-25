package com.okinc.okpaymentapi.data.remote.model.management;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class BusinessType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BusinessType[] $VALUES;
    private final String type;
    public static final BusinessType TOPUP = new BusinessType("TOPUP", 0, "topup");
    public static final BusinessType ADDFUNDS = new BusinessType("ADDFUNDS", 1, "addFunds");
    public static final BusinessType BUYCRYPTO = new BusinessType("BUYCRYPTO", 2, TradeType.BUY_CRYPTO_TRADE_TYPE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BusinessType[] $values() {
        return new BusinessType[]{TOPUP, ADDFUNDS, BUYCRYPTO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BusinessType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private BusinessType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        BusinessType[] businessTypeArr$values = $values();
        $VALUES = businessTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(businessTypeArr$values);
    }

    public static BusinessType valueOf(String str) {
        return (BusinessType) Enum.valueOf(BusinessType.class, str);
    }

    public static BusinessType[] values() {
        return (BusinessType[]) $VALUES.clone();
    }
}
