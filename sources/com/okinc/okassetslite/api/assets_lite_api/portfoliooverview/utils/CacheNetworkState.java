package com.okinc.okassetslite.api.assets_lite_api.portfoliooverview.utils;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CacheNetworkState<T> {
    private CacheNetworkState() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DataSource {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DataSource[] $VALUES;
        public static final DataSource Cache = new DataSource("Cache", 0);
        public static final DataSource Network = new DataSource("Network", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DataSource[] $values() {
            return new DataSource[]{Cache, Network};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DataSource> getEntries() {
            return $ENTRIES;
        }

        static {
            DataSource[] dataSourceArr$values = $values();
            $VALUES = dataSourceArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(dataSourceArr$values);
        }

        private DataSource(String str, int i) {
        }

        public static DataSource valueOf(String str) {
            return (DataSource) Enum.valueOf(DataSource.class, str);
        }

        public static DataSource[] values() {
            return (DataSource[]) $VALUES.clone();
        }
    }
}
