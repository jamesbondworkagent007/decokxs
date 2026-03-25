package org.web3j.utils;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes25.dex */
public final class Convert {
    private Convert() {
    }

    public enum Unit {
        WEI("wei", 0),
        KWEI("kwei", 3),
        MWEI("mwei", 6),
        GWEI("gwei", 9),
        SZABO("szabo", 12),
        FINNEY("finney", 15),
        ETHER("ether", 18),
        KETHER("kether", 21),
        METHER("mether", 24),
        GETHER("gether", 27);

        private String name;
        private BigDecimal weiFactor;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal getWeiFactor() {
            return this.weiFactor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        Unit(String str, int i) {
            this.name = str;
            this.weiFactor = BigDecimal.TEN.pow(i);
        }

        public static Unit fromString(String str) {
            if (str != null) {
                for (Unit unit : values()) {
                    if (str.equalsIgnoreCase(unit.name)) {
                        return unit;
                    }
                }
            }
            return valueOf(str);
        }
    }
}
