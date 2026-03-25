package com.okinc.tradelite.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class TradeMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeMode[] $VALUES;
    public static final Application Companion;
    private final String optionId;
    public static final TradeMode SPOT_TRADING = new TradeMode("SPOT_TRADING", 0, "0");
    public static final TradeMode COPY_TRADING = new TradeMode("COPY_TRADING", 1, "1");
    public static final TradeMode TRADING_BOTS = new TradeMode("TRADING_BOTS", 2, "2");
    public static final TradeMode FUTURES = new TradeMode("FUTURES", 3, "3");
    public static final TradeMode OPTIONS = new TradeMode("OPTIONS", 4, "4");
    public static final TradeMode BUY_AND_SELL = new TradeMode("BUY_AND_SELL", 5, "5");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeMode[] $values() {
        return new TradeMode[]{SPOT_TRADING, COPY_TRADING, TRADING_BOTS, FUTURES, OPTIONS, BUY_AND_SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptionId() {
        return this.optionId;
    }

    private TradeMode(String str, int i, String str2) {
        this.optionId = str2;
    }

    static {
        TradeMode[] tradeModeArr$values = $values();
        $VALUES = tradeModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeModeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradelite.bean.TradeMode.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ TradeMode getType$default(Application application, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return application.AEQbTJ(str);
        }

        public final TradeMode AEQbTJ(String str) {
            TradeMode tradeMode;
            TradeMode[] tradeModeArrValues = TradeMode.values();
            int length = tradeModeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tradeMode = null;
                    break;
                }
                tradeMode = tradeModeArrValues[i];
                if (Intrinsics.EZpvd((Object) tradeMode.getOptionId(), (Object) str)) {
                    break;
                }
                i++;
            }
            return tradeMode == null ? TradeMode.SPOT_TRADING : tradeMode;
        }
    }

    public static TradeMode valueOf(String str) {
        return (TradeMode) Enum.valueOf(TradeMode.class, str);
    }

    public static TradeMode[] values() {
        return (TradeMode[]) $VALUES.clone();
    }
}
