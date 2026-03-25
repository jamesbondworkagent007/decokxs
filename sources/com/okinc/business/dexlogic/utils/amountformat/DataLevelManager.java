package com.okinc.business.dexlogic.utils.amountformat;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import o.C23311hvo;
import o.C23313hvq;
import o.C33129mqd;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DataLevelManager {
    public static final DataLevelManager EZpvd = new DataLevelManager();

    private DataLevelManager() {
    }

    public final Triple<String, String, BigLevel> OLrzqt(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            return KWHzl(str, str2);
        }
        return OLrzqt(str, str2);
    }

    public final Triple<String, String, BigLevel> OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C23313hvq.AEQbTJ(str, str2);
        return new Triple<>(str, str2, BigLevel.NORMAL);
    }

    public final Triple<String, String, BigLevel> KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C23313hvq.AEQbTJ(str, str2);
        String strCopydefault = C23311hvo.copydefault(str);
        if (C23313hvq.KWHzl(strCopydefault, 1000)) {
            return new Triple<>(str, str2, BigLevel.NORMAL);
        }
        if (C23313hvq.EZpvd(strCopydefault, 1000) & C23313hvq.KWHzl(strCopydefault, 1000000)) {
            return new Triple<>(C23313hvq.divCheckS$default(str, 1000, Integer.valueOf(C33129mqd.AhwBna("18")), Boolean.FALSE, null, 8, null), "2", BigLevel.THOUSANDS);
        }
        if (C23313hvq.EZpvd(strCopydefault, 1000000) & C23313hvq.KWHzl(strCopydefault, 1000000000)) {
            return new Triple<>(C23313hvq.divCheckS$default(str, 1000000, Integer.valueOf(C33129mqd.AhwBna("18")), Boolean.FALSE, null, 8, null), "2", BigLevel.MILLION);
        }
        return new Triple<>(C23313hvq.divCheckS$default(str, 1000000000, Integer.valueOf(C33129mqd.AhwBna("18")), Boolean.FALSE, null, 8, null), "2", BigLevel.BILLION);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BigLevel {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BigLevel[] $VALUES;
        private final String unit;
        public static final BigLevel NORMAL = new BigLevel("NORMAL", 0, "");
        public static final BigLevel THOUSANDS = new BigLevel("THOUSANDS", 1, "K");
        public static final BigLevel MILLION = new BigLevel("MILLION", 2, "M");
        public static final BigLevel BILLION = new BigLevel("BILLION", 3, "B");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BigLevel[] $values() {
            return new BigLevel[]{NORMAL, THOUSANDS, MILLION, BILLION};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BigLevel> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUnit() {
            return this.unit;
        }

        private BigLevel(String str, int i, String str2) {
            this.unit = str2;
        }

        static {
            BigLevel[] bigLevelArr$values = $values();
            $VALUES = bigLevelArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(bigLevelArr$values);
        }

        public static BigLevel valueOf(String str) {
            return (BigLevel) Enum.valueOf(BigLevel.class, str);
        }

        public static BigLevel[] values() {
            return (BigLevel[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class BigLevelKMBT {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BigLevelKMBT[] $VALUES;
        private final String unit;
        public static final BigLevelKMBT NORMAL = new BigLevelKMBT("NORMAL", 0, "");
        public static final BigLevelKMBT THOUSANDS = new BigLevelKMBT("THOUSANDS", 1, "K");
        public static final BigLevelKMBT MILLION = new BigLevelKMBT("MILLION", 2, "M");
        public static final BigLevelKMBT BILLION = new BigLevelKMBT("BILLION", 3, "B");
        public static final BigLevelKMBT TRILLION = new BigLevelKMBT("TRILLION", 4, ExifInterface.GPS_DIRECTION_TRUE);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BigLevelKMBT[] $values() {
            return new BigLevelKMBT[]{NORMAL, THOUSANDS, MILLION, BILLION, TRILLION};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BigLevelKMBT> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUnit() {
            return this.unit;
        }

        private BigLevelKMBT(String str, int i, String str2) {
            this.unit = str2;
        }

        static {
            BigLevelKMBT[] bigLevelKMBTArr$values = $values();
            $VALUES = bigLevelKMBTArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(bigLevelKMBTArr$values);
        }

        public static BigLevelKMBT valueOf(String str) {
            return (BigLevelKMBT) Enum.valueOf(BigLevelKMBT.class, str);
        }

        public static BigLevelKMBT[] values() {
            return (BigLevelKMBT[]) $VALUES.clone();
        }
    }
}
