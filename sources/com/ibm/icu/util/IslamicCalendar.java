package com.ibm.icu.util;

import androidx.camera.video.AudioStats;
import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.gms.common.util.GmsVersion;
import com.ibm.icu.util.ULocale;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Locale;
import o.C7009abJ;
import o.C7011abL;
import o.C7012abM;

/* JADX INFO: loaded from: classes3.dex */
public class IslamicCalendar extends Calendar {
    private static final long ASTRONOMICAL_EPOC = 1948439;
    private static final long CIVIL_EPOC = 1948440;
    public static final int DHU_AL_HIJJAH = 11;
    public static final int DHU_AL_QIDAH = 10;
    private static final long HIJRA_MILLIS = -42521587200000L;
    public static final int JUMADA_1 = 4;
    public static final int JUMADA_2 = 5;
    public static final int MUHARRAM = 0;
    public static final int RABI_1 = 2;
    public static final int RABI_2 = 3;
    public static final int RAJAB = 6;
    public static final int RAMADAN = 8;
    public static final int SAFAR = 1;
    public static final int SHABAN = 7;
    public static final int SHAWWAL = 9;
    private static final int UMALQURA_YEAR_END = 1600;
    private static final int UMALQURA_YEAR_START = 1300;
    private static final long serialVersionUID = -6253365474073869325L;
    private CalculationType cType;
    private boolean civil;
    private static final int[][] LIMITS = {new int[]{0, 0, 0, 0}, new int[]{1, 1, GmsVersion.VERSION_LONGHORN, GmsVersion.VERSION_LONGHORN}, new int[]{0, 0, 11, 11}, new int[]{1, 1, 50, 51}, new int[0], new int[]{1, 1, 29, 30}, new int[]{1, 1, 354, 355}, new int[0], new int[]{-1, -1, 5, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[]{1, 1, GmsVersion.VERSION_LONGHORN, GmsVersion.VERSION_LONGHORN}, new int[0], new int[]{1, 1, GmsVersion.VERSION_LONGHORN, GmsVersion.VERSION_LONGHORN}, new int[0], new int[0]};
    private static final int[] UMALQURA_MONTHLENGTH = {2730, 3412, 3785, 1748, 1770, 876, 2733, 1365, 1705, 1938, 2985, 1492, 2778, 1372, 3373, 1685, 1866, 2900, 2922, 1453, 1198, 2639, 1303, 1675, 1701, 2773, 726, 2395, 1181, 2637, 3366, 3477, 1452, 2486, 698, 2651, 1323, 2709, 1738, 2793, 756, 2422, 694, 2390, 2762, 2980, 3026, 1497, 732, 2413, 1357, 2725, 2898, 2981, 1460, 2486, 1367, 663, 1355, 1699, 1874, 2917, 1386, 2731, 1323, 3221, 3402, 3493, 1482, 2774, 2391, 1195, 2379, 2725, 2898, 2922, 1397, 630, 2231, 1115, 1365, 1449, 1460, 2522, 1245, 622, 2358, 2730, 3412, 3506, 1493, 730, 2395, 1195, 2645, 2889, 2916, 2929, 1460, 2741, 2645, 3365, 3730, 3785, 1748, 2793, 2411, 1195, 2707, 3401, 3492, 3506, 2745, 1210, 2651, 1323, 2709, 2858, 2901, 1372, 1213, 573, 2333, 2709, 2890, 2906, 1389, 694, 2363, 1179, 1621, 1705, 1876, 2922, 1388, 2733, 1365, 2857, 2962, 2985, 1492, 2778, 1370, 2731, 1429, 1865, 1892, 2986, 1461, 694, 2646, 3661, 2853, 2898, 2922, 1453, 686, 2351, 1175, 1611, 1701, 1708, 2774, 1373, 1181, 2637, 3350, 3477, 1450, 1461, 730, 2395, 1197, 1429, 1738, 1764, 2794, 1269, 694, 2390, 2730, 2900, 3026, 1497, 746, 2413, 1197, 2709, 2890, 2981, 1458, 2485, 1238, 2711, 1351, 1683, 1865, 2901, 1386, 2667, 1323, 2699, 3398, 3491, 1482, 2774, 1243, 619, 2379, 2725, 2898, 2921, 1397, 374, 2231, TypedValues.MotionType.TYPE_EASING, 1323, 1381, 1460, 2522, 1261, 365, 2230, 2726, 3410, 3497, 1492, 2778, 2395, 1195, 1619, 1833, 1890, 2985, 1458, 2741, 1365, 2853, 3474, 3785, 1746, 2793, 1387, 1195, 2645, 3369, 3412, 3498, 2485, 1210, 2619, 1179, 2637, 2730, 2773, 730, 2397, 1118, 2606, 3226, 3413, 1714, 1721, 1210, 2653, 1325, 2709, 2898, 2984, MTCoreConstants.RemoteWhat.TURN_ON_CONNECT, 1465, 730, 2394, 2890, 3492, 3793, 1768, 2922, 1389, 1333, 1685, 3402, 3496, 3540, 1754, 1371, 669, 1579, 2837, 2890, 2965, 1450, 2734, 2350, 3215, 1319, 1685, 1706, 2774, 1373, 669};
    private static final byte[] UMALQURA_YEAR_START_ESTIMATE_FIX = {0, 0, -1, 0, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 1, 1, 0, 0, -1, 0, 1, 0, 1, 1, 0, 0, -1, 0, 1, 0, 0, 0, -1, 0, 1, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, -1, -1, 0, -1, 0, 1, 0, 0, 0, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, 0, 0, 1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 1, 1, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, -1, 0, 1, 0, 0, -1, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 1, 1, 0, 0, -1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, -1, 0, -1, 0, 1, 0, 0, 0, -1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, -1, -1, 0, -1, 0, 1, 0, 0, -1, -1, 0, 0, 1, 1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1};
    private static C7012abM astro = new C7012abM();
    private static C7009abJ cache = new C7009abJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CalculationType getCalculationType() {
        return this.cType;
    }

    public IslamicCalendar() {
        this(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public IslamicCalendar(TimeZone timeZone) {
        this(timeZone, ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public IslamicCalendar(Locale locale) {
        this(TimeZone.forLocaleOrDefault(locale), locale);
    }

    public IslamicCalendar(ULocale uLocale) {
        this(TimeZone.forULocaleOrDefault(uLocale), uLocale);
    }

    public IslamicCalendar(TimeZone timeZone, Locale locale) {
        this(timeZone, ULocale.forLocale(locale));
    }

    public IslamicCalendar(TimeZone timeZone, ULocale uLocale) {
        super(timeZone, uLocale);
        this.civil = true;
        this.cType = CalculationType.ISLAMIC_CIVIL;
        setCalcTypeForLocale(uLocale);
        setTimeInMillis(System.currentTimeMillis());
    }

    public IslamicCalendar(Date date) {
        super(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
        this.civil = true;
        this.cType = CalculationType.ISLAMIC_CIVIL;
        setTime(date);
    }

    public IslamicCalendar(int i, int i2, int i3) {
        super(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
        this.civil = true;
        this.cType = CalculationType.ISLAMIC_CIVIL;
        set(1, i);
        set(2, i2);
        set(5, i3);
    }

    public IslamicCalendar(int i, int i2, int i3, int i4, int i5, int i6) {
        super(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
        this.civil = true;
        this.cType = CalculationType.ISLAMIC_CIVIL;
        set(1, i);
        set(2, i2);
        set(5, i3);
        set(11, i4);
        set(12, i5);
        set(13, i6);
    }

    public void setCivil(boolean z) {
        this.civil = z;
        if (z) {
            CalculationType calculationType = this.cType;
            CalculationType calculationType2 = CalculationType.ISLAMIC_CIVIL;
            if (calculationType != calculationType2) {
                long timeInMillis = getTimeInMillis();
                this.cType = calculationType2;
                clear();
                setTimeInMillis(timeInMillis);
                return;
            }
        }
        if (z) {
            return;
        }
        CalculationType calculationType3 = this.cType;
        CalculationType calculationType4 = CalculationType.ISLAMIC;
        if (calculationType3 != calculationType4) {
            long timeInMillis2 = getTimeInMillis();
            this.cType = calculationType4;
            clear();
            setTimeInMillis(timeInMillis2);
        }
    }

    public boolean isCivil() {
        return this.cType == CalculationType.ISLAMIC_CIVIL;
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleGetLimit(int i, int i2) {
        return LIMITS[i][i2];
    }

    private static final boolean civilLeapYear(int i) {
        return ((i * 11) + 14) % 30 < 11;
    }

    private long yearStart(int i) {
        CalculationType calculationType;
        CalculationType calculationType2 = this.cType;
        if (calculationType2 == CalculationType.ISLAMIC_CIVIL || calculationType2 == CalculationType.ISLAMIC_TBLA || (calculationType2 == (calculationType = CalculationType.ISLAMIC_UMALQURA) && (i < UMALQURA_YEAR_START || i > UMALQURA_YEAR_END))) {
            return ((long) ((i - 1) * 354)) + ((long) Math.floor(((double) ((i * 11) + 3)) / 30.0d));
        }
        if (calculationType2 == CalculationType.ISLAMIC) {
            return trueMonthStart((i - 1) * 12);
        }
        if (calculationType2 != calculationType) {
            return 0L;
        }
        int i2 = i - 1300;
        return ((int) ((((double) i2) * 354.3672d) + 460322.05d + 0.5d)) + UMALQURA_YEAR_START_ESTIMATE_FIX[i2];
    }

    private long monthStart(int i, int i2) {
        CalculationType calculationType;
        int i3 = (i2 / 12) + i;
        int i4 = i2 % 12;
        CalculationType calculationType2 = this.cType;
        if (calculationType2 == CalculationType.ISLAMIC_CIVIL || calculationType2 == CalculationType.ISLAMIC_TBLA || (calculationType2 == (calculationType = CalculationType.ISLAMIC_UMALQURA) && i < UMALQURA_YEAR_START)) {
            return ((long) Math.ceil(((double) i4) * 29.5d)) + ((long) ((i3 - 1) * 354)) + ((long) Math.floor(((double) ((i3 * 11) + 3)) / 30.0d));
        }
        if (calculationType2 == CalculationType.ISLAMIC) {
            return trueMonthStart(((i3 - 1) * 12) + i4);
        }
        if (calculationType2 != calculationType) {
            return 0L;
        }
        long jYearStart = yearStart(i);
        for (int i5 = 0; i5 < i2; i5++) {
            jYearStart += (long) handleGetMonthLength(i, i5);
        }
        return jYearStart;
    }

    private static final long trueMonthStart(long j) {
        long jOLrzqt = cache.OLrzqt(j);
        if (jOLrzqt != C7009abJ.EZpvd) {
            return jOLrzqt;
        }
        long jFloor = (((long) Math.floor(j * 29.530588853d)) * CalendarModelKt.MillisecondsIn24Hours) - 42521587200000L;
        moonAge(jFloor);
        if (moonAge(jFloor) >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            do {
                jFloor -= CalendarModelKt.MillisecondsIn24Hours;
            } while (moonAge(jFloor) >= AudioStats.AUDIO_AMPLITUDE_NONE);
        } else {
            do {
                jFloor += CalendarModelKt.MillisecondsIn24Hours;
            } while (moonAge(jFloor) < AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        long j2 = ((jFloor + 42521587200000L) / CalendarModelKt.MillisecondsIn24Hours) + 1;
        cache.copydefault(j, j2);
        return j2;
    }

    public static final double moonAge(long j) {
        double dKWHzl;
        synchronized (astro) {
            astro.EZpvd(j);
            dKWHzl = astro.KWHzl();
        }
        double d = (dKWHzl * 180.0d) / 3.141592653589793d;
        return d > 180.0d ? d - 360.0d : d;
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleGetMonthLength(int i, int i2) {
        CalculationType calculationType = this.cType;
        if (calculationType == CalculationType.ISLAMIC_CIVIL || calculationType == CalculationType.ISLAMIC_TBLA || (calculationType == CalculationType.ISLAMIC_UMALQURA && (i < UMALQURA_YEAR_START || i > UMALQURA_YEAR_END))) {
            int i3 = (i2 + 1) % 2;
            return (i2 == 11 && civilLeapYear(i)) ? i3 + 30 : 29 + i3;
        }
        if (calculationType != CalculationType.ISLAMIC) {
            return (UMALQURA_MONTHLENGTH[i - UMALQURA_YEAR_START] & (1 << (11 - i2))) == 0 ? 29 : 30;
        }
        return (int) (trueMonthStart(r8 + 1) - trueMonthStart(((i - 1) * 12) + i2));
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleGetYearLength(int i) {
        CalculationType calculationType;
        CalculationType calculationType2 = this.cType;
        if (calculationType2 == CalculationType.ISLAMIC_CIVIL || calculationType2 == CalculationType.ISLAMIC_TBLA || (calculationType2 == (calculationType = CalculationType.ISLAMIC_UMALQURA) && (i < UMALQURA_YEAR_START || i > UMALQURA_YEAR_END))) {
            return (civilLeapYear(i) ? 1 : 0) + 354;
        }
        if (calculationType2 == CalculationType.ISLAMIC) {
            return (int) (trueMonthStart(r5 + 12) - trueMonthStart((i - 1) * 12));
        }
        int iHandleGetMonthLength = 0;
        if (calculationType2 == calculationType) {
            for (int i2 = 0; i2 < 12; i2++) {
                iHandleGetMonthLength += handleGetMonthLength(i, i2);
            }
        }
        return iHandleGetMonthLength;
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleComputeMonthStart(int i, int i2, boolean z) {
        return (int) ((monthStart(i, i2) + (this.cType == CalculationType.ISLAMIC_TBLA ? ASTRONOMICAL_EPOC : CIVIL_EPOC)) - 1);
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleGetExtendedYear() {
        if (newerField(19, 1) == 19) {
            return internalGet(19, 1);
        }
        return internalGet(1, 1);
    }

    @Override // com.ibm.icu.util.Calendar
    public void handleComputeFields(int i) {
        int iFloor;
        int iMin;
        int i2;
        long j = i;
        long j2 = j - CIVIL_EPOC;
        CalculationType calculationType = this.cType;
        if (calculationType == CalculationType.ISLAMIC_CIVIL || calculationType == CalculationType.ISLAMIC_TBLA) {
            if (calculationType == CalculationType.ISLAMIC_TBLA) {
                j2 = j - ASTRONOMICAL_EPOC;
            }
            iFloor = (int) Math.floor(((30 * j2) + 10646) / 10631.0d);
            iMin = Math.min((int) Math.ceil(((j2 - 29) - yearStart(iFloor)) / 29.5d), 11);
        } else if (calculationType == CalculationType.ISLAMIC) {
            int iFloor2 = (int) Math.floor(j2 / 29.530588853d);
            if (j2 - ((long) Math.floor((((double) iFloor2) * 29.530588853d) - 1.0d)) >= 25 && moonAge(internalGetTimeInMillis()) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                iFloor2++;
            }
            while (trueMonthStart(iFloor2) > j2) {
                iFloor2--;
            }
            iFloor = iFloor2 >= 0 ? (iFloor2 / 12) + 1 : (iFloor2 + 1) / 12;
            iMin = ((iFloor2 % 12) + 12) % 12;
        } else if (calculationType != CalculationType.ISLAMIC_UMALQURA) {
            iMin = 0;
            iFloor = 0;
        } else if (j2 < yearStart(UMALQURA_YEAR_START)) {
            int iFloor3 = (int) Math.floor(((30 * j2) + 10646) / 10631.0d);
            iMin = Math.min((int) Math.ceil(((j - 1948469) - yearStart(iFloor3)) / 29.5d), 11);
            iFloor = iFloor3;
        } else {
            int i3 = 1299;
            long jYearStart = 1;
            while (true) {
                if (jYearStart <= 0) {
                    iFloor = i3;
                    i2 = 0;
                    break;
                }
                i3++;
                jYearStart = (j2 - yearStart(i3)) + 1;
                if (jYearStart == handleGetYearLength(i3)) {
                    iFloor = i3;
                    i2 = 11;
                    break;
                } else if (jYearStart < handleGetYearLength(i3)) {
                    int iHandleGetMonthLength = handleGetMonthLength(i3, 0);
                    i2 = 0;
                    while (true) {
                        long j3 = iHandleGetMonthLength;
                        if (jYearStart <= j3) {
                            break;
                        }
                        jYearStart -= j3;
                        i2++;
                        iHandleGetMonthLength = handleGetMonthLength(i3, i2);
                    }
                    iFloor = i3;
                }
            }
            iMin = i2;
        }
        int iMonthStart = (int) (j2 - monthStart(iFloor, iMin));
        int iMonthStart2 = (int) ((j2 - monthStart(iFloor, 0)) + 1);
        internalSet(0, 0);
        internalSet(1, iFloor);
        internalSet(19, iFloor);
        internalSet(2, iMin);
        internalSet(5, iMonthStart + 1);
        internalSet(6, iMonthStart2);
    }

    public enum CalculationType {
        ISLAMIC("islamic"),
        ISLAMIC_CIVIL("islamic-civil"),
        ISLAMIC_UMALQURA("islamic-umalqura"),
        ISLAMIC_TBLA("islamic-tbla");

        private String bcpType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String bcpType() {
            return this.bcpType;
        }

        CalculationType(String str) {
            this.bcpType = str;
        }
    }

    public void setCalculationType(CalculationType calculationType) {
        this.cType = calculationType;
        this.civil = calculationType == CalculationType.ISLAMIC_CIVIL;
    }

    private void setCalcTypeForLocale(ULocale uLocale) {
        String strCopydefault = C7011abL.copydefault(uLocale);
        if ("islamic-civil".equals(strCopydefault)) {
            setCalculationType(CalculationType.ISLAMIC_CIVIL);
            return;
        }
        if ("islamic-umalqura".equals(strCopydefault)) {
            setCalculationType(CalculationType.ISLAMIC_UMALQURA);
            return;
        }
        if ("islamic-tbla".equals(strCopydefault)) {
            setCalculationType(CalculationType.ISLAMIC_TBLA);
        } else if (strCopydefault.startsWith("islamic")) {
            setCalculationType(CalculationType.ISLAMIC);
        } else {
            setCalculationType(CalculationType.ISLAMIC_CIVIL);
        }
    }

    @Override // com.ibm.icu.util.Calendar
    public String getType() {
        CalculationType calculationType = this.cType;
        return calculationType == null ? "islamic" : calculationType.bcpType();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        CalculationType calculationType = this.cType;
        if (calculationType == null) {
            this.cType = this.civil ? CalculationType.ISLAMIC_CIVIL : CalculationType.ISLAMIC;
        } else {
            this.civil = calculationType == CalculationType.ISLAMIC_CIVIL;
        }
    }
}
