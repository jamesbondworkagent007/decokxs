package com.okinc.tradelite.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class TradeLoadingMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeLoadingMode[] $VALUES;
    public static final String CALL_AUCTION = "call_auction";
    public static final StateListAnimator Companion;
    public static final String NORMAL = "listed";
    public static final String PRE_OPEN = "pre_quote";
    private final String loadingMode;
    public static final TradeLoadingMode LISTED = new TradeLoadingMode("LISTED", 0, "0");
    public static final TradeLoadingMode COUNTDOWN = new TradeLoadingMode("COUNTDOWN", 1, "1");
    public static final TradeLoadingMode AUCTION = new TradeLoadingMode("AUCTION", 2, "2");
    public static final TradeLoadingMode PRE_QUOTE = new TradeLoadingMode("PRE_QUOTE", 3, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeLoadingMode[] $values() {
        return new TradeLoadingMode[]{LISTED, COUNTDOWN, AUCTION, PRE_QUOTE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeLoadingMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoadingMode() {
        return this.loadingMode;
    }

    private TradeLoadingMode(String str, int i, String str2) {
        this.loadingMode = str2;
    }

    static {
        TradeLoadingMode[] tradeLoadingModeArr$values = $values();
        $VALUES = tradeLoadingModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeLoadingModeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradelite.bean.TradeLoadingMode.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ TradeLoadingMode getType$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return stateListAnimator.EZpvd(str);
        }

        public final TradeLoadingMode EZpvd(String str) {
            TradeLoadingMode tradeLoadingMode;
            TradeLoadingMode[] tradeLoadingModeArrValues = TradeLoadingMode.values();
            int length = tradeLoadingModeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tradeLoadingMode = null;
                    break;
                }
                tradeLoadingMode = tradeLoadingModeArrValues[i];
                if (Intrinsics.EZpvd((Object) tradeLoadingMode.getLoadingMode(), (Object) str)) {
                    break;
                }
                i++;
            }
            return tradeLoadingMode == null ? TradeLoadingMode.LISTED : tradeLoadingMode;
        }
    }

    public static TradeLoadingMode valueOf(String str) {
        return (TradeLoadingMode) Enum.valueOf(TradeLoadingMode.class, str);
    }

    public static TradeLoadingMode[] values() {
        return (TradeLoadingMode[]) $VALUES.clone();
    }
}
