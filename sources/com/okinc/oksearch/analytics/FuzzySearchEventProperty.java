package com.okinc.oksearch.analytics;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes10.dex */
public final class FuzzySearchEventProperty {
    public static final FuzzySearchEventProperty copydefault = new FuzzySearchEventProperty();

    private FuzzySearchEventProperty() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Property {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Property[] $VALUES;
        private final String value;
        public static final Property TOKEN_TYPE = new Property("TOKEN_TYPE", 0, "token_type");
        public static final Property FLOW = new Property("FLOW", 1, "flow");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Property[] $values() {
            return new Property[]{TOKEN_TYPE, FLOW};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Property> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private Property(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            Property[] propertyArr$values = $values();
            $VALUES = propertyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(propertyArr$values);
        }

        public static Property valueOf(String str) {
            return (Property) Enum.valueOf(Property.class, str);
        }

        public static Property[] values() {
            return (Property[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TokenType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TokenType[] $VALUES;
        private final String value;
        public static final TokenType DEX = new TokenType("DEX", 0, "dex");
        public static final TokenType CEX = new TokenType("CEX", 1, "cex");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TokenType[] $values() {
            return new TokenType[]{DEX, CEX};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TokenType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private TokenType(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            TokenType[] tokenTypeArr$values = $values();
            $VALUES = tokenTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(tokenTypeArr$values);
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flow {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;
        public static final Flow BUY = new Flow("BUY", 0, "buy");
        public static final Flow SELL = new Flow("SELL", 1, "sell");
        private final String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Flow[] $values() {
            return new Flow[]{BUY, SELL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Flow> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private Flow(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            Flow[] flowArr$values = $values();
            $VALUES = flowArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(flowArr$values);
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }
    }
}
