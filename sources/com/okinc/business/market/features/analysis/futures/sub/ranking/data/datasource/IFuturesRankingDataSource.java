package com.okinc.business.market.features.analysis.futures.sub.ranking.data.datasource;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes6.dex */
public interface IFuturesRankingDataSource {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PayloadPnlType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PayloadPnlType[] $VALUES;
        private final int value;
        public static final PayloadPnlType NET_PNL = new PayloadPnlType("NET_PNL", 0, 1);
        public static final PayloadPnlType LONG_PNL = new PayloadPnlType("LONG_PNL", 1, 2);
        public static final PayloadPnlType SHORT_PNL = new PayloadPnlType("SHORT_PNL", 2, 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PayloadPnlType[] $values() {
            return new PayloadPnlType[]{NET_PNL, LONG_PNL, SHORT_PNL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PayloadPnlType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private PayloadPnlType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            PayloadPnlType[] payloadPnlTypeArr$values = $values();
            $VALUES = payloadPnlTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(payloadPnlTypeArr$values);
        }

        public static PayloadPnlType valueOf(String str) {
            return (PayloadPnlType) Enum.valueOf(PayloadPnlType.class, str);
        }

        public static PayloadPnlType[] values() {
            return (PayloadPnlType[]) $VALUES.clone();
        }
    }
}
