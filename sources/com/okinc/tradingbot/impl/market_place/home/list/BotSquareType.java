package com.okinc.tradingbot.impl.market_place.home.list;

import androidx.annotation.StringRes;
import o.C48033uCm;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class BotSquareType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BotSquareType[] $VALUES;
    private final int title;
    public static final BotSquareType NMP_BOT = new BotSquareType("NMP_BOT", 0, C48033uCm.Fragment.invokespecialgBtXYZ);
    public static final BotSquareType BOT = new BotSquareType("BOT", 1, C55688xof.Application.QVMIlx);
    public static final BotSquareType SIGNAL = new BotSquareType("SIGNAL", 2, C55688xof.Application.HJWChPfvRMlC);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BotSquareType[] $values() {
        return new BotSquareType[]{NMP_BOT, BOT, SIGNAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BotSquareType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    private BotSquareType(@StringRes String str, int i, int i2) {
        this.title = i2;
    }

    static {
        BotSquareType[] botSquareTypeArr$values = $values();
        $VALUES = botSquareTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(botSquareTypeArr$values);
    }

    public static BotSquareType valueOf(String str) {
        return (BotSquareType) Enum.valueOf(BotSquareType.class, str);
    }

    public static BotSquareType[] values() {
        return (BotSquareType[]) $VALUES.clone();
    }
}
