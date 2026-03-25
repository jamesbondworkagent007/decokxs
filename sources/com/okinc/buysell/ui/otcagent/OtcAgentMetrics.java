package com.okinc.buysell.ui.otcagent;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes18.dex */
public final class OtcAgentMetrics {
    public static final OtcAgentMetrics AEQbTJ = new OtcAgentMetrics();

    private OtcAgentMetrics() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class SIDE {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SIDE[] $VALUES;
        public static final SIDE BUY = new SIDE("BUY", 0, "Buy");
        public static final SIDE SELL = new SIDE("SELL", 1, "Sell");
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SIDE[] $values() {
            return new SIDE[]{BUY, SELL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SIDE> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private SIDE(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            SIDE[] sideArr$values = $values();
            $VALUES = sideArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sideArr$values);
        }

        public static SIDE valueOf(String str) {
            return (SIDE) Enum.valueOf(SIDE.class, str);
        }

        public static SIDE[] values() {
            return (SIDE[]) $VALUES.clone();
        }
    }
}
