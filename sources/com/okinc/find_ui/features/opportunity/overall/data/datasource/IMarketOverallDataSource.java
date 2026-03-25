package com.okinc.find_ui.features.opportunity.overall.data.datasource;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes8.dex */
public interface IMarketOverallDataSource {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class PayloadTimeZone {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PayloadTimeZone[] $VALUES;
        public static final PayloadTimeZone HOUR_24 = new PayloadTimeZone("HOUR_24", 0, "24h");
        public static final PayloadTimeZone UTC_0 = new PayloadTimeZone("UTC_0", 1, "utc0");
        public static final PayloadTimeZone UTC_8 = new PayloadTimeZone("UTC_8", 2, "utc8");
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PayloadTimeZone[] $values() {
            return new PayloadTimeZone[]{HOUR_24, UTC_0, UTC_8};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PayloadTimeZone> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private PayloadTimeZone(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            PayloadTimeZone[] payloadTimeZoneArr$values = $values();
            $VALUES = payloadTimeZoneArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(payloadTimeZoneArr$values);
        }

        public static PayloadTimeZone valueOf(String str) {
            return (PayloadTimeZone) Enum.valueOf(PayloadTimeZone.class, str);
        }

        public static PayloadTimeZone[] values() {
            return (PayloadTimeZone[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class PayloadOverallType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PayloadOverallType[] $VALUES;
        private final int value;
        public static final PayloadOverallType CAPACITY = new PayloadOverallType("CAPACITY", 0, 1);
        public static final PayloadOverallType VOLUME = new PayloadOverallType("VOLUME", 1, 3);
        public static final PayloadOverallType SHARE = new PayloadOverallType("SHARE", 2, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PayloadOverallType[] $values() {
            return new PayloadOverallType[]{CAPACITY, VOLUME, SHARE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PayloadOverallType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private PayloadOverallType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            PayloadOverallType[] payloadOverallTypeArr$values = $values();
            $VALUES = payloadOverallTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(payloadOverallTypeArr$values);
        }

        public static PayloadOverallType valueOf(String str) {
            return (PayloadOverallType) Enum.valueOf(PayloadOverallType.class, str);
        }

        public static PayloadOverallType[] values() {
            return (PayloadOverallType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PayloadPeriod {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PayloadPeriod[] $VALUES;
        private final String value;
        public static final PayloadPeriod ONE_DAY = new PayloadPeriod("ONE_DAY", 0, "1D");
        public static final PayloadPeriod ONE_WEEK = new PayloadPeriod("ONE_WEEK", 1, "1W");
        public static final PayloadPeriod ONE_MONTH = new PayloadPeriod("ONE_MONTH", 2, "1M");
        public static final PayloadPeriod THREE_MONTH = new PayloadPeriod("THREE_MONTH", 3, "3M");
        public static final PayloadPeriod ONE_YEAR = new PayloadPeriod("ONE_YEAR", 4, "1Y");
        public static final PayloadPeriod ALL = new PayloadPeriod("ALL", 5, "ALL");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PayloadPeriod[] $values() {
            return new PayloadPeriod[]{ONE_DAY, ONE_WEEK, ONE_MONTH, THREE_MONTH, ONE_YEAR, ALL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PayloadPeriod> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private PayloadPeriod(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            PayloadPeriod[] payloadPeriodArr$values = $values();
            $VALUES = payloadPeriodArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(payloadPeriodArr$values);
        }

        public static PayloadPeriod valueOf(String str) {
            return (PayloadPeriod) Enum.valueOf(PayloadPeriod.class, str);
        }

        public static PayloadPeriod[] values() {
            return (PayloadPeriod[]) $VALUES.clone();
        }
    }
}
