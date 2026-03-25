package com.okinc.unify_trade.bot.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class ContractGridForbiddenFunctions {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContractGridForbiddenFunctions[] $VALUES;
    private final String code;
    public static final ContractGridForbiddenFunctions IncreasePosition = new ContractGridForbiddenFunctions("IncreasePosition", 0, "1");
    public static final ContractGridForbiddenFunctions Tpsl = new ContractGridForbiddenFunctions("Tpsl", 1, "2");
    public static final ContractGridForbiddenFunctions SellAllWhenBotStops = new ContractGridForbiddenFunctions("SellAllWhenBotStops", 2, "3");
    public static final ContractGridForbiddenFunctions EditParameters = new ContractGridForbiddenFunctions("EditParameters", 3, "4");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContractGridForbiddenFunctions[] $values() {
        return new ContractGridForbiddenFunctions[]{IncreasePosition, Tpsl, SellAllWhenBotStops, EditParameters};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContractGridForbiddenFunctions> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    private ContractGridForbiddenFunctions(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        ContractGridForbiddenFunctions[] contractGridForbiddenFunctionsArr$values = $values();
        $VALUES = contractGridForbiddenFunctionsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contractGridForbiddenFunctionsArr$values);
    }

    public static ContractGridForbiddenFunctions valueOf(String str) {
        return (ContractGridForbiddenFunctions) Enum.valueOf(ContractGridForbiddenFunctions.class, str);
    }

    public static ContractGridForbiddenFunctions[] values() {
        return (ContractGridForbiddenFunctions[]) $VALUES.clone();
    }
}
