package com.okinc.business.invest_biz.ui.screens.validator_selection.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ValidatorTrxType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ValidatorTrxType[] $VALUES;
    public static final ValidatorTrxType INVEST = new ValidatorTrxType("INVEST", 0);
    public static final ValidatorTrxType REDEEM = new ValidatorTrxType("REDEEM", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ValidatorTrxType[] $values() {
        return new ValidatorTrxType[]{INVEST, REDEEM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ValidatorTrxType> getEntries() {
        return $ENTRIES;
    }

    private ValidatorTrxType(String str, int i) {
    }

    static {
        ValidatorTrxType[] validatorTrxTypeArr$values = $values();
        $VALUES = validatorTrxTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(validatorTrxTypeArr$values);
    }

    public static ValidatorTrxType valueOf(String str) {
        return (ValidatorTrxType) Enum.valueOf(ValidatorTrxType.class, str);
    }

    public static ValidatorTrxType[] values() {
        return (ValidatorTrxType[]) $VALUES.clone();
    }
}
