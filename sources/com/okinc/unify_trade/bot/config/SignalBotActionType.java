package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotActionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalBotActionType[] $VALUES;

    /* JADX INFO: renamed from: const, reason: not valid java name */
    private final String f86const;
    private final int showName;
    public static final SignalBotActionType TV_ACTION_MAP = new SignalBotActionType("TV_ACTION_MAP", 0, "tvActionMap", C55688xof.Application.getOnBackPressedDispatcher);
    public static final SignalBotActionType ACTION_MAPS = new SignalBotActionType("ACTION_MAPS", 1, "actionMaps", C55688xof.Application.ICustomTabsCallbackStubProxy);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalBotActionType[] $values() {
        return new SignalBotActionType[]{TV_ACTION_MAP, ACTION_MAPS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalBotActionType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConst() {
        return this.f86const;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowName() {
        return this.showName;
    }

    private SignalBotActionType(String str, @StringRes int i, String str2, int i2) {
        this.f86const = str2;
        this.showName = i2;
    }

    static {
        SignalBotActionType[] signalBotActionTypeArr$values = $values();
        $VALUES = signalBotActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalBotActionTypeArr$values);
    }

    public static SignalBotActionType valueOf(String str) {
        return (SignalBotActionType) Enum.valueOf(SignalBotActionType.class, str);
    }

    public static SignalBotActionType[] values() {
        return (SignalBotActionType[]) $VALUES.clone();
    }
}
