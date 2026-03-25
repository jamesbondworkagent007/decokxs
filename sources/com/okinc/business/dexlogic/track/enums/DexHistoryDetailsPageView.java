package com.okinc.business.dexlogic.track.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class DexHistoryDetailsPageView {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexHistoryDetailsPageView[] $VALUES;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexHistoryDetailsPageView[] $values() {
        return new DexHistoryDetailsPageView[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        DexHistoryDetailsPageView[] dexHistoryDetailsPageViewArr$values = $values();
        $VALUES = dexHistoryDetailsPageViewArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexHistoryDetailsPageViewArr$values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexHistoryDetailsPageView> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Source {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        private final String value;
        public static final Source WALLET = new Source("WALLET", 0, "wallet");
        public static final Source TRANSACTION_HISTORY = new Source("TRANSACTION_HISTORY", 1, "transaction_history");
        public static final Source GAS_STATION = new Source("GAS_STATION", 2, "gas_station");
        public static final Source DEX = new Source("DEX", 3, "dex");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Source[] $values() {
            return new Source[]{WALLET, TRANSACTION_HISTORY, GAS_STATION, DEX};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Source> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private Source(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sourceArr$values);
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    private DexHistoryDetailsPageView(String str, int i) {
    }

    public static DexHistoryDetailsPageView valueOf(String str) {
        return (DexHistoryDetailsPageView) Enum.valueOf(DexHistoryDetailsPageView.class, str);
    }

    public static DexHistoryDetailsPageView[] values() {
        return (DexHistoryDetailsPageView[]) $VALUES.clone();
    }
}
