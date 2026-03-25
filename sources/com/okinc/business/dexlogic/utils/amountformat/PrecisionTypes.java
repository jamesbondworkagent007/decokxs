package com.okinc.business.dexlogic.utils.amountformat;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class PrecisionTypes {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PrecisionTypes[] $VALUES;
    public static final PrecisionTypes LIQUIDITY_SIGN_NUMBERS = new PrecisionTypes("LIQUIDITY_SIGN_NUMBERS", 0);
    public static final PrecisionTypes MARKET_HISTORY_SIGN_NUMBERS = new PrecisionTypes("MARKET_HISTORY_SIGN_NUMBERS", 1);
    public static final PrecisionTypes LIQUIDITY_POOL_DETAILS = new PrecisionTypes("LIQUIDITY_POOL_DETAILS", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PrecisionTypes[] $values() {
        return new PrecisionTypes[]{LIQUIDITY_SIGN_NUMBERS, MARKET_HISTORY_SIGN_NUMBERS, LIQUIDITY_POOL_DETAILS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PrecisionTypes> getEntries() {
        return $ENTRIES;
    }

    private PrecisionTypes(String str, int i) {
    }

    static {
        PrecisionTypes[] precisionTypesArr$values = $values();
        $VALUES = precisionTypesArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(precisionTypesArr$values);
    }

    public static PrecisionTypes valueOf(String str) {
        return (PrecisionTypes) Enum.valueOf(PrecisionTypes.class, str);
    }

    public static PrecisionTypes[] values() {
        return (PrecisionTypes[]) $VALUES.clone();
    }
}
