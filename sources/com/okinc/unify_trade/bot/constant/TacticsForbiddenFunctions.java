package com.okinc.unify_trade.bot.constant;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class TacticsForbiddenFunctions {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TacticsForbiddenFunctions[] $VALUES;
    private final String code;
    public static final TacticsForbiddenFunctions IncreasePosition = new TacticsForbiddenFunctions("IncreasePosition", 0, "1");
    public static final TacticsForbiddenFunctions Tpsl = new TacticsForbiddenFunctions("Tpsl", 1, "2");
    public static final TacticsForbiddenFunctions SellAllWhenBotStops = new TacticsForbiddenFunctions("SellAllWhenBotStops", 2, "3");
    public static final TacticsForbiddenFunctions EditParameters = new TacticsForbiddenFunctions("EditParameters", 3, "4");
    public static final TacticsForbiddenFunctions ModifyThenReinvest = new TacticsForbiddenFunctions("ModifyThenReinvest", 4, "5");
    public static final TacticsForbiddenFunctions WithdrawProfits = new TacticsForbiddenFunctions("WithdrawProfits", 5, OrderDetailListItem.SLIP_OUT);
    public static final TacticsForbiddenFunctions ModifySimpleEarn = new TacticsForbiddenFunctions("ModifySimpleEarn", 6, "7");
    public static final TacticsForbiddenFunctions PauseBot = new TacticsForbiddenFunctions("PauseBot", 7, "9");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TacticsForbiddenFunctions[] $values() {
        return new TacticsForbiddenFunctions[]{IncreasePosition, Tpsl, SellAllWhenBotStops, EditParameters, ModifyThenReinvest, WithdrawProfits, ModifySimpleEarn, PauseBot};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TacticsForbiddenFunctions> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    private TacticsForbiddenFunctions(String str, int i, String str2) {
        this.code = str2;
    }

    static {
        TacticsForbiddenFunctions[] tacticsForbiddenFunctionsArr$values = $values();
        $VALUES = tacticsForbiddenFunctionsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tacticsForbiddenFunctionsArr$values);
    }

    public static TacticsForbiddenFunctions valueOf(String str) {
        return (TacticsForbiddenFunctions) Enum.valueOf(TacticsForbiddenFunctions.class, str);
    }

    public static TacticsForbiddenFunctions[] values() {
        return (TacticsForbiddenFunctions[]) $VALUES.clone();
    }
}
