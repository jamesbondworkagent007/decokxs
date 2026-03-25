package com.okinc.okassetslite.api.assets_lite_api;

import o.C56444yFp;
import o.InterfaceC43217rlC;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes23.dex */
public interface AssetsLiteRouteService extends InterfaceC43217rlC {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DestinationTab {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DestinationTab[] $VALUES;
        public static final DestinationTab EXCHANGE_ACCOUNT_TAB = new DestinationTab("EXCHANGE_ACCOUNT_TAB", 0, 0);
        public static final DestinationTab SMART_ACCOUNT_TAB = new DestinationTab("SMART_ACCOUNT_TAB", 1, 1);
        private final int tab;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DestinationTab[] $values() {
            return new DestinationTab[]{EXCHANGE_ACCOUNT_TAB, SMART_ACCOUNT_TAB};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DestinationTab> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTab() {
            return this.tab;
        }

        private DestinationTab(String str, int i, int i2) {
            this.tab = i2;
        }

        static {
            DestinationTab[] destinationTabArr$values = $values();
            $VALUES = destinationTabArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(destinationTabArr$values);
        }

        public static DestinationTab valueOf(String str) {
            return (DestinationTab) Enum.valueOf(DestinationTab.class, str);
        }

        public static DestinationTab[] values() {
            return (DestinationTab[]) $VALUES.clone();
        }
    }
}
