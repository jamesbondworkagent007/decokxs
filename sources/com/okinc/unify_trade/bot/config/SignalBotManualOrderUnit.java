package com.okinc.unify_trade.bot.config;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SignalBotManualOrderUnit {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalBotManualOrderUnit[] $VALUES;
    public static final ActionBar Companion;
    private final String type;
    public static final SignalBotManualOrderUnit U = new SignalBotManualOrderUnit("U", 0, "2");
    public static final SignalBotManualOrderUnit CRYPTO = new SignalBotManualOrderUnit("CRYPTO", 1, "0");
    public static final SignalBotManualOrderUnit CONT = new SignalBotManualOrderUnit("CONT", 2, "1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalBotManualOrderUnit[] $values() {
        return new SignalBotManualOrderUnit[]{U, CRYPTO, CONT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalBotManualOrderUnit> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private SignalBotManualOrderUnit(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        SignalBotManualOrderUnit[] signalBotManualOrderUnitArr$values = $values();
        $VALUES = signalBotManualOrderUnitArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalBotManualOrderUnitArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.SignalBotManualOrderUnit.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SignalBotManualOrderUnit OLrzqt(String str) {
            SignalBotManualOrderUnit signalBotManualOrderUnit;
            SignalBotManualOrderUnit[] signalBotManualOrderUnitArrValues = SignalBotManualOrderUnit.values();
            int length = signalBotManualOrderUnitArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    signalBotManualOrderUnit = null;
                    break;
                }
                signalBotManualOrderUnit = signalBotManualOrderUnitArrValues[i];
                if (Intrinsics.EZpvd((Object) signalBotManualOrderUnit.getType(), (Object) str)) {
                    break;
                }
                i++;
            }
            return signalBotManualOrderUnit == null ? SignalBotManualOrderUnit.U : signalBotManualOrderUnit;
        }
    }

    public static SignalBotManualOrderUnit valueOf(String str) {
        return (SignalBotManualOrderUnit) Enum.valueOf(SignalBotManualOrderUnit.class, str);
    }

    public static SignalBotManualOrderUnit[] values() {
        return (SignalBotManualOrderUnit[]) $VALUES.clone();
    }
}
