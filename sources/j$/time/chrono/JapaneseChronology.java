package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.AbstractC56368yCu;
import o.InterfaceC56349yCb;
import o.InterfaceC56352yCe;
import o.InterfaceC56353yCf;
import o.InterfaceC56365yCr;
import o.yBW;
import o.yBX;
import o.yCF;

/* JADX INFO: loaded from: classes17.dex */
public final class JapaneseChronology extends yBX implements Serializable {
    public static final JapaneseChronology INSTANCE = new JapaneseChronology();

    @Override // o.InterfaceC56351yCd
    public InterfaceC56353yCf zonedDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        return super.zonedDateTime(interfaceC56365yCr);
    }

    @Override // o.InterfaceC56351yCd
    public InterfaceC56353yCf zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // o.yBX
    public yBW resolveYearOfEra(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.ERA;
        Long l = (Long) map.get(chronoField);
        JapaneseEra japaneseEraEraOf = l != null ? eraOf(range(chronoField).checkValidIntValue(l.longValue(), chronoField)) : null;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l2 = (Long) map.get(chronoField2);
        int iCheckValidIntValue = l2 != null ? range(chronoField2).checkValidIntValue(l2.longValue(), chronoField2) : 0;
        if (japaneseEraEraOf == null && l2 != null && !map.containsKey(ChronoField.YEAR) && resolverStyle != ResolverStyle.STRICT) {
            japaneseEraEraOf = JapaneseEra.values()[JapaneseEra.values().length - 1];
        }
        if (l2 != null && japaneseEraEraOf != null) {
            if (map.containsKey(ChronoField.MONTH_OF_YEAR) && map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return resolveYMD(japaneseEraEraOf, iCheckValidIntValue, map, resolverStyle);
            }
            if (map.containsKey(ChronoField.DAY_OF_YEAR)) {
                return resolveYD(japaneseEraEraOf, iCheckValidIntValue, map, resolverStyle);
            }
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: resolveDate(Ljava/util/Map;Lj$/time/format/ResolverStyle;)Lo/yBW; */
    @Override // o.yBX, o.InterfaceC56351yCd
    public JapaneseDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (JapaneseDate) super.resolveDate(map, resolverStyle);
    }

    @Override // o.InterfaceC56351yCd
    public ValueRange range(ChronoField chronoField) {
        switch (AnonymousClass2.OLrzqt[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + chronoField);
            case 5:
                return ValueRange.of(1L, JapaneseEra.shortestYearsOfEra(), 999999999 - JapaneseEra.getCurrentEra().getSince().getYear());
            case 6:
                return ValueRange.of(1L, JapaneseEra.shortestDaysOfYear(), ChronoField.DAY_OF_YEAR.range().getMaximum());
            case 7:
                return ValueRange.of(JapaneseDate.MEIJI_6_ISODATE.getYear(), 999999999L);
            case 8:
                return ValueRange.of(JapaneseEra.MEIJI.getValue(), JapaneseEra.getCurrentEra().getValue());
            default:
                return chronoField.range();
        }
    }

    @Override // o.InterfaceC56351yCd
    public int prolepticYear(InterfaceC56352yCe interfaceC56352yCe, int i) {
        if (!(interfaceC56352yCe instanceof JapaneseEra)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        JapaneseEra japaneseEra = (JapaneseEra) interfaceC56352yCe;
        int year = (japaneseEra.getSince().getYear() + i) - 1;
        if (i == 1) {
            return year;
        }
        if (year < -999999999 || year > 999999999 || year < japaneseEra.getSince().getYear() || interfaceC56352yCe != JapaneseEra.from(LocalDate.of(year, 1, 1))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // o.InterfaceC56351yCd
    public InterfaceC56349yCb localDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        return super.localDateTime(interfaceC56365yCr);
    }

    @Override // o.InterfaceC56351yCd
    public boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j);
    }

    @Override // o.InterfaceC56351yCd
    public String getId() {
        return "Japanese";
    }

    @Override // o.InterfaceC56351yCd
    public String getCalendarType() {
        return "japanese";
    }

    @Override // o.InterfaceC56351yCd
    public List eras() {
        return Arrays.asList(JapaneseEra.values());
    }

    /* JADX DEBUG: Method merged with bridge method: eraOf(I)Lo/yCe; */
    @Override // o.InterfaceC56351yCd
    public JapaneseEra eraOf(int i) {
        return JapaneseEra.of(i);
    }

    public JapaneseDate dateYearDay(InterfaceC56352yCe interfaceC56352yCe, int i, int i2) {
        return JapaneseDate.ofYearDay((JapaneseEra) interfaceC56352yCe, i, i2);
    }

    /* JADX DEBUG: Method merged with bridge method: dateYearDay(II)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public JapaneseDate dateYearDay(int i, int i2) {
        return new JapaneseDate(LocalDate.ofYearDay(i, i2));
    }

    public JapaneseDate dateNow(Clock clock) {
        return date((InterfaceC56365yCr) LocalDate.now(clock));
    }

    /* JADX DEBUG: Method merged with bridge method: dateNow()Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public JapaneseDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    /* JADX DEBUG: Method merged with bridge method: dateEpochDay(J)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public JapaneseDate dateEpochDay(long j) {
        return new JapaneseDate(LocalDate.ofEpochDay(j));
    }

    /* JADX DEBUG: Method merged with bridge method: date(Lo/yCr;)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public JapaneseDate date(InterfaceC56365yCr interfaceC56365yCr) {
        return interfaceC56365yCr instanceof JapaneseDate ? (JapaneseDate) interfaceC56365yCr : new JapaneseDate(LocalDate.from(interfaceC56365yCr));
    }

    public JapaneseDate date(InterfaceC56352yCe interfaceC56352yCe, int i, int i2, int i3) {
        if (interfaceC56352yCe instanceof JapaneseEra) {
            return JapaneseDate.of((JapaneseEra) interfaceC56352yCe, i, i2, i3);
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    /* JADX DEBUG: Method merged with bridge method: date(III)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public JapaneseDate date(int i, int i2, int i3) {
        return new JapaneseDate(LocalDate.of(i, i2, i3));
    }

    private yBW resolveYMD(JapaneseEra japaneseEra, int i, Map map, ResolverStyle resolverStyle) {
        JapaneseDate japaneseDateWith;
        map.remove(ChronoField.ERA);
        map.remove(ChronoField.YEAR_OF_ERA);
        if (resolverStyle == ResolverStyle.LENIENT) {
            int iProlepticYearLenient = prolepticYearLenient(japaneseEra, i);
            return date(iProlepticYearLenient, 1, 1).plus(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L), (yCF) ChronoUnit.MONTHS).plus(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (yCF) ChronoUnit.DAYS);
        }
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        int iCheckValidIntValue = range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField);
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        int iCheckValidIntValue2 = range(chronoField2).checkValidIntValue(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (resolverStyle != ResolverStyle.SMART) {
            return date(japaneseEra, i, iCheckValidIntValue, iCheckValidIntValue2);
        }
        if (i < 1) {
            throw new DateTimeException("Invalid YearOfEra: " + i);
        }
        int iProlepticYearLenient2 = prolepticYearLenient(japaneseEra, i);
        try {
            japaneseDateWith = date(iProlepticYearLenient2, iCheckValidIntValue, iCheckValidIntValue2);
        } catch (DateTimeException unused) {
            japaneseDateWith = date(iProlepticYearLenient2, iCheckValidIntValue, 1).with(AbstractC56368yCu.OLrzqt());
        }
        if (japaneseDateWith.getEra() == japaneseEra || japaneseDateWith.get(ChronoField.YEAR_OF_ERA) <= 1 || i <= 1) {
            return japaneseDateWith;
        }
        throw new DateTimeException("Invalid YearOfEra for Era: " + japaneseEra + " " + i);
    }

    private yBW resolveYD(JapaneseEra japaneseEra, int i, Map map, ResolverStyle resolverStyle) {
        map.remove(ChronoField.ERA);
        map.remove(ChronoField.YEAR_OF_ERA);
        if (resolverStyle != ResolverStyle.LENIENT) {
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            return dateYearDay(japaneseEra, i, range(chronoField).checkValidIntValue(((Long) map.remove(chronoField)).longValue(), chronoField));
        }
        int iProlepticYearLenient = prolepticYearLenient(japaneseEra, i);
        return dateYearDay(iProlepticYearLenient, 1).plus(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_YEAR)).longValue(), 1L), (yCF) ChronoUnit.DAYS);
    }

    private int prolepticYearLenient(JapaneseEra japaneseEra, int i) {
        return (japaneseEra.getSince().getYear() + i) - 1;
    }

    /* JADX INFO: renamed from: j$.time.chrono.JapaneseChronology$2, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[ChronoField.values().length];
            OLrzqt = iArr;
            try {
                iArr[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[ChronoField.YEAR_OF_ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[ChronoField.DAY_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[ChronoField.YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                OLrzqt[ChronoField.ERA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private JapaneseChronology() {
    }
}
