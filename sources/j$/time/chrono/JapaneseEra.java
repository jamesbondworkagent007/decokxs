package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import com.ibm.icu.text.DateFormat;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Arrays;
import o.InterfaceC56352yCe;
import o.InterfaceC56372yCy;
import o.yBW;

/* JADX INFO: loaded from: classes24.dex */
public final class JapaneseEra implements InterfaceC56352yCe, Serializable {
    public static final JapaneseEra HEISEI;
    private static final JapaneseEra[] KNOWN_ERAS;
    public static final JapaneseEra MEIJI;
    private static final int N_ERA_CONSTANTS;
    private static final JapaneseEra REIWA;
    public static final JapaneseEra SHOWA;
    public static final JapaneseEra TAISHO;
    private final transient String abbreviation;
    private final transient int eraValue;
    private final transient String name;
    private final transient LocalDate since;

    private static int ordinal(int i) {
        return i + 1;
    }

    public String toString() {
        return getName();
    }

    @Override // o.InterfaceC56352yCe, o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        ChronoField chronoField = ChronoField.ERA;
        return interfaceC56372yCy == chronoField ? JapaneseChronology.INSTANCE.range(chronoField) : super.range(interfaceC56372yCy);
    }

    JapaneseEra next() {
        if (this == getCurrentEra()) {
            return null;
        }
        return of(this.eraValue + 1);
    }

    @Override // o.InterfaceC56352yCe
    public int getValue() {
        return this.eraValue;
    }

    LocalDate getSince() {
        return this.since;
    }

    public static JapaneseEra[] values() {
        JapaneseEra[] japaneseEraArr = KNOWN_ERAS;
        return (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, japaneseEraArr.length);
    }

    static long shortestYearsOfEra() {
        int year = 1000000000 - getCurrentEra().since.getYear();
        int year2 = KNOWN_ERAS[0].since.getYear();
        int i = 1;
        while (true) {
            JapaneseEra[] japaneseEraArr = KNOWN_ERAS;
            if (i >= japaneseEraArr.length) {
                return year;
            }
            JapaneseEra japaneseEra = japaneseEraArr[i];
            year = Math.min(year, (japaneseEra.since.getYear() - year2) + 1);
            year2 = japaneseEra.since.getYear();
            i++;
        }
    }

    static long shortestDaysOfYear() {
        long smallestMaximum = ChronoField.DAY_OF_YEAR.range().getSmallestMaximum();
        for (JapaneseEra japaneseEra : KNOWN_ERAS) {
            smallestMaximum = Math.min(smallestMaximum, (japaneseEra.since.lengthOfYear() - japaneseEra.since.getDayOfYear()) + 1);
            if (japaneseEra.next() != null) {
                smallestMaximum = Math.min(smallestMaximum, japaneseEra.next().since.getDayOfYear() - 1);
            }
        }
        return smallestMaximum;
    }

    public static JapaneseEra of(int i) {
        if (i >= MEIJI.eraValue) {
            JapaneseEra[] japaneseEraArr = KNOWN_ERAS;
            if (i + 2 <= japaneseEraArr.length) {
                return japaneseEraArr[ordinal(i)];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    private String getName() {
        return this.name;
    }

    static JapaneseEra getCurrentEra() {
        return KNOWN_ERAS[r0.length - 1];
    }

    static JapaneseEra from(LocalDate localDate) {
        if (localDate.isBefore(JapaneseDate.MEIJI_6_ISODATE)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = KNOWN_ERAS.length - 1; length >= 0; length--) {
            JapaneseEra japaneseEra = KNOWN_ERAS[length];
            if (localDate.compareTo((yBW) japaneseEra.since) >= 0) {
                return japaneseEra;
            }
        }
        return null;
    }

    private JapaneseEra(int i, LocalDate localDate, String str, String str2) {
        this.eraValue = i;
        this.since = localDate;
        this.name = str;
        this.abbreviation = str2;
    }

    static {
        JapaneseEra japaneseEra = new JapaneseEra(-1, LocalDate.of(1868, 1, 1), "Meiji", "M");
        MEIJI = japaneseEra;
        JapaneseEra japaneseEra2 = new JapaneseEra(0, LocalDate.of(1912, 7, 30), "Taisho", ExifInterface.GPS_DIRECTION_TRUE);
        TAISHO = japaneseEra2;
        JapaneseEra japaneseEra3 = new JapaneseEra(1, LocalDate.of(1926, 12, 25), "Showa", ExifInterface.LATITUDE_SOUTH);
        SHOWA = japaneseEra3;
        JapaneseEra japaneseEra4 = new JapaneseEra(2, LocalDate.of(1989, 1, 8), "Heisei", DateFormat.HOUR24);
        HEISEI = japaneseEra4;
        JapaneseEra japaneseEra5 = new JapaneseEra(3, LocalDate.of(2019, 5, 1), DateFormat.JP_ERA_2019_ROOT, DateFormat.JP_ERA_2019_NARROW);
        REIWA = japaneseEra5;
        int value = japaneseEra5.getValue() + 2;
        N_ERA_CONSTANTS = value;
        JapaneseEra[] japaneseEraArr = new JapaneseEra[value];
        KNOWN_ERAS = japaneseEraArr;
        japaneseEraArr[0] = japaneseEra;
        japaneseEraArr[1] = japaneseEra2;
        japaneseEraArr[2] = japaneseEra3;
        japaneseEraArr[3] = japaneseEra4;
        japaneseEraArr[4] = japaneseEra5;
    }
}
