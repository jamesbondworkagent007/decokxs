package com.okinc.environment;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes23.dex */
public final class PerformanceMeter {
    public static final PerformanceMeter OLrzqt = new PerformanceMeter();
    public static final int AEQbTJ = 8;

    private PerformanceMeter() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Level {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level HIGH = new Level(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 0);
        public static final Level MEDIUM = new Level(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 1);
        public static final Level LOW = new Level(VerifyDAppDomainUrlResponse.LEVEL_LOW, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Level[] $values() {
            return new Level[]{HIGH, MEDIUM, LOW};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Level> getEntries() {
            return $ENTRIES;
        }

        private Level(String str, int i) {
        }

        static {
            Level[] levelArr$values = $values();
            $VALUES = levelArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(levelArr$values);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }
}
