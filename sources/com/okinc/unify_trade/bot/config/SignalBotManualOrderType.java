package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SignalBotManualOrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalBotManualOrderType[] $VALUES;

    /* JADX INFO: renamed from: const, reason: not valid java name */
    private final String f87const;
    private final int showName;
    public static final SignalBotManualOrderType MARKET = new SignalBotManualOrderType("MARKET", 0, "market", C55688xof.Application.getOnBackPressedDispatcherannotations);
    public static final SignalBotManualOrderType LIMIT = new SignalBotManualOrderType("LIMIT", 1, "limit", C55688xof.Application.onBackPressedDispatcherlambda1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalBotManualOrderType[] $values() {
        return new SignalBotManualOrderType[]{MARKET, LIMIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalBotManualOrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConst() {
        return this.f87const;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowName() {
        return this.showName;
    }

    private SignalBotManualOrderType(String str, @StringRes int i, String str2, int i2) {
        this.f87const = str2;
        this.showName = i2;
    }

    static {
        SignalBotManualOrderType[] signalBotManualOrderTypeArr$values = $values();
        $VALUES = signalBotManualOrderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalBotManualOrderTypeArr$values);
    }

    public static SignalBotManualOrderType valueOf(String str) {
        return (SignalBotManualOrderType) Enum.valueOf(SignalBotManualOrderType.class, str);
    }

    public static SignalBotManualOrderType[] values() {
        return (SignalBotManualOrderType[]) $VALUES.clone();
    }
}
