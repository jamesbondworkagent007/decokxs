package com.okinc.buysell.analytics;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes18.dex */
public final class GrafanaProperty {
    public static final GrafanaProperty KWHzl = new GrafanaProperty();

    private GrafanaProperty() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Page {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Page[] $VALUES;
        public static final Page DEX_GET_QUOTE_INPUT = new Page("DEX_GET_QUOTE_INPUT", 0, "dex_get_quote_input");
        public static final Page DEX_TRADE_STATUS_BSC = new Page("DEX_TRADE_STATUS_BSC", 1, "dex_trade_status_bsc");
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Page[] $values() {
            return new Page[]{DEX_GET_QUOTE_INPUT, DEX_TRADE_STATUS_BSC};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Page> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private Page(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            Page[] pageArr$values = $values();
            $VALUES = pageArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pageArr$values);
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
        }
    }
}
