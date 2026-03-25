package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SignalBotTradingSignType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalBotTradingSignType[] $VALUES;
    public static final TaskDescription Companion;

    /* JADX INFO: renamed from: const, reason: not valid java name */
    private final String f88const;
    private final int showName;
    public static final SignalBotTradingSignType ENTER_LONG = new SignalBotTradingSignType("ENTER_LONG", 0, "ENTER_LONG", C55688xof.Application.ZNPcth);
    public static final SignalBotTradingSignType EXIT_LONG = new SignalBotTradingSignType("EXIT_LONG", 1, "EXIT_LONG", C55688xof.Application.identifier);
    public static final SignalBotTradingSignType ENTER_SHORT = new SignalBotTradingSignType("ENTER_SHORT", 2, "ENTER_SHORT", C55688xof.Application.dbAction);
    public static final SignalBotTradingSignType EXIT_SHORT = new SignalBotTradingSignType("EXIT_SHORT", 3, "EXIT_SHORT", C55688xof.Application.ZaDspl);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalBotTradingSignType[] $values() {
        return new SignalBotTradingSignType[]{ENTER_LONG, EXIT_LONG, ENTER_SHORT, EXIT_SHORT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalBotTradingSignType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConst() {
        return this.f88const;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getShowName() {
        return this.showName;
    }

    private SignalBotTradingSignType(String str, @StringRes int i, String str2, int i2) {
        this.f88const = str2;
        this.showName = i2;
    }

    static {
        SignalBotTradingSignType[] signalBotTradingSignTypeArr$values = $values();
        $VALUES = signalBotTradingSignTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalBotTradingSignTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.SignalBotTradingSignType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static SignalBotTradingSignType valueOf(String str) {
        return (SignalBotTradingSignType) Enum.valueOf(SignalBotTradingSignType.class, str);
    }

    public static SignalBotTradingSignType[] values() {
        return (SignalBotTradingSignType[]) $VALUES.clone();
    }
}
