package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.Duration;
import j$.time.LocalDate;
import j$.time.chrono.IsoChronology;
import j$.time.format.ResolverStyle;
import java.util.Map;
import o.InterfaceC56351yCd;
import o.InterfaceC56365yCr;
import o.InterfaceC56367yCt;
import o.InterfaceC56372yCy;
import o.yBW;
import o.yCF;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes13.dex */
public abstract class IsoFields {
    public static final InterfaceC56372yCy EZpvd = Field.DAY_OF_QUARTER;
    public static final InterfaceC56372yCy OLrzqt = Field.QUARTER_OF_YEAR;
    public static final InterfaceC56372yCy AhwBna = Field.WEEK_OF_WEEK_BASED_YEAR;
    public static final InterfaceC56372yCy copydefault = Field.WEEK_BASED_YEAR;
    public static final yCF AEQbTJ = Unit.WEEK_BASED_YEARS;
    public static final yCF KWHzl = Unit.QUARTER_YEARS;

    enum Field implements InterfaceC56372yCy {
        DAY_OF_QUARTER { // from class: j$.time.temporal.IsoFields.Field.1
            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }

            /* JADX DEBUG: Method merged with bridge method: resolve(Ljava/util/Map;Lo/yCr;Lj$/time/format/ResolverStyle;)Lo/yCr; */
            @Override // o.InterfaceC56372yCy
            public yBW resolve(Map map, InterfaceC56365yCr interfaceC56365yCr, ResolverStyle resolverStyle) {
                LocalDate localDateOf;
                long jSubtractExact;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) map.get(chronoField);
                InterfaceC56372yCy interfaceC56372yCy = Field.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(interfaceC56372yCy);
                if (l == null || l2 == null) {
                    return null;
                }
                int iCheckValidIntValue = chronoField.checkValidIntValue(l.longValue());
                long jLongValue = ((Long) map.get(Field.DAY_OF_QUARTER)).longValue();
                Field.ensureIso(interfaceC56365yCr);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    localDateOf = LocalDate.of(iCheckValidIntValue, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3L));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    localDateOf = LocalDate.of(iCheckValidIntValue, ((interfaceC56372yCy.range().checkValidIntValue(l2.longValue(), interfaceC56372yCy) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        (resolverStyle == ResolverStyle.STRICT ? rangeRefinedBy(localDateOf) : range()).checkValidValue(jLongValue, this);
                    }
                    jSubtractExact = jLongValue - 1;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(interfaceC56372yCy);
                return localDateOf.plusDays(jSubtractExact);
            }

            @Override // j$.time.temporal.IsoFields.Field, o.InterfaceC56372yCy
            public ValueRange rangeRefinedBy(InterfaceC56365yCr interfaceC56365yCr) {
                if (!isSupportedBy(interfaceC56365yCr)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long j = interfaceC56365yCr.getLong(Field.QUARTER_OF_YEAR);
                if (j == 1) {
                    return IsoChronology.INSTANCE.isLeapYear(interfaceC56365yCr.getLong(ChronoField.YEAR)) ? ValueRange.of(1L, 91L) : ValueRange.of(1L, 90L);
                }
                return j == 2 ? ValueRange.of(1L, 91L) : (j == 3 || j == 4) ? ValueRange.of(1L, 92L) : range();
            }

            @Override // o.InterfaceC56372yCy
            public ValueRange range() {
                return ValueRange.of(1L, 90L, 92L);
            }

            @Override // o.InterfaceC56372yCy
            public boolean isSupportedBy(InterfaceC56365yCr interfaceC56365yCr) {
                return interfaceC56365yCr.isSupported(ChronoField.DAY_OF_YEAR) && interfaceC56365yCr.isSupported(ChronoField.MONTH_OF_YEAR) && interfaceC56365yCr.isSupported(ChronoField.YEAR) && Field.isIso(interfaceC56365yCr);
            }

            @Override // o.InterfaceC56372yCy
            public long getFrom(InterfaceC56365yCr interfaceC56365yCr) {
                if (!isSupportedBy(interfaceC56365yCr)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                return interfaceC56365yCr.get(ChronoField.DAY_OF_YEAR) - Field.QUARTER_DAYS[((interfaceC56365yCr.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.isLeapYear(interfaceC56365yCr.getLong(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // o.InterfaceC56372yCy
            public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt, long j) {
                long from = getFrom(interfaceC56367yCt);
                range().checkValidValue(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return interfaceC56367yCt.with(chronoField, interfaceC56367yCt.getLong(chronoField) + (j - from));
            }
        },
        QUARTER_OF_YEAR { // from class: j$.time.temporal.IsoFields.Field.2
            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }

            @Override // o.InterfaceC56372yCy
            public ValueRange range() {
                return ValueRange.of(1L, 4L);
            }

            @Override // o.InterfaceC56372yCy
            public boolean isSupportedBy(InterfaceC56365yCr interfaceC56365yCr) {
                return interfaceC56365yCr.isSupported(ChronoField.MONTH_OF_YEAR) && Field.isIso(interfaceC56365yCr);
            }

            @Override // o.InterfaceC56372yCy
            public long getFrom(InterfaceC56365yCr interfaceC56365yCr) {
                if (isSupportedBy(interfaceC56365yCr)) {
                    return (interfaceC56365yCr.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // o.InterfaceC56372yCy
            public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt, long j) {
                long from = getFrom(interfaceC56367yCt);
                range().checkValidValue(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return interfaceC56367yCt.with(chronoField, interfaceC56367yCt.getLong(chronoField) + ((j - from) * 3));
            }
        },
        WEEK_OF_WEEK_BASED_YEAR { // from class: j$.time.temporal.IsoFields.Field.3
            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }

            /* JADX DEBUG: Method merged with bridge method: resolve(Ljava/util/Map;Lo/yCr;Lj$/time/format/ResolverStyle;)Lo/yCr; */
            @Override // o.InterfaceC56372yCy
            public yBW resolve(Map map, InterfaceC56365yCr interfaceC56365yCr, ResolverStyle resolverStyle) {
                LocalDate localDateWith;
                long j;
                LocalDate localDatePlusWeeks;
                long j2;
                InterfaceC56372yCy interfaceC56372yCy = Field.WEEK_BASED_YEAR;
                Long l = (Long) map.get(interfaceC56372yCy);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iCheckValidIntValue = interfaceC56372yCy.range().checkValidIntValue(l.longValue(), interfaceC56372yCy);
                long jLongValue = ((Long) map.get(Field.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                Field.ensureIso(interfaceC56365yCr);
                LocalDate localDateOf = LocalDate.of(iCheckValidIntValue, 1, 4);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        j2 = jLongValue2 - 1;
                        localDatePlusWeeks = localDateOf.plusWeeks(j2 / 7);
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDatePlusWeeks = localDateOf.plusWeeks(Math.subtractExact(jLongValue2, 7L) / 7);
                            j2 = jLongValue2 + 6;
                        }
                        localDateWith = localDateOf.plusWeeks(Math.subtractExact(jLongValue, j)).with((InterfaceC56372yCy) chronoField, jLongValue2);
                    }
                    localDateOf = localDatePlusWeeks;
                    j = 1;
                    jLongValue2 = (j2 % 7) + 1;
                    localDateWith = localDateOf.plusWeeks(Math.subtractExact(jLongValue, j)).with((InterfaceC56372yCy) chronoField, jLongValue2);
                } else {
                    int iCheckValidIntValue2 = chronoField.checkValidIntValue(l2.longValue());
                    if (jLongValue < 1 || jLongValue > 52) {
                        (resolverStyle == ResolverStyle.STRICT ? Field.getWeekRange(localDateOf) : range()).checkValidValue(jLongValue, this);
                    }
                    localDateWith = localDateOf.plusWeeks(jLongValue - 1).with((InterfaceC56372yCy) chronoField, iCheckValidIntValue2);
                }
                map.remove(this);
                map.remove(interfaceC56372yCy);
                map.remove(chronoField);
                return localDateWith;
            }

            @Override // j$.time.temporal.IsoFields.Field, o.InterfaceC56372yCy
            public ValueRange rangeRefinedBy(InterfaceC56365yCr interfaceC56365yCr) {
                if (isSupportedBy(interfaceC56365yCr)) {
                    return Field.getWeekRange(LocalDate.from(interfaceC56365yCr));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // o.InterfaceC56372yCy
            public ValueRange range() {
                return ValueRange.of(1L, 52L, 53L);
            }

            @Override // o.InterfaceC56372yCy
            public boolean isSupportedBy(InterfaceC56365yCr interfaceC56365yCr) {
                return interfaceC56365yCr.isSupported(ChronoField.EPOCH_DAY) && Field.isIso(interfaceC56365yCr);
            }

            @Override // o.InterfaceC56372yCy
            public long getFrom(InterfaceC56365yCr interfaceC56365yCr) {
                if (isSupportedBy(interfaceC56365yCr)) {
                    return Field.getWeek(LocalDate.from(interfaceC56365yCr));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // o.InterfaceC56372yCy
            public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt, long j) {
                range().checkValidValue(j, this);
                return interfaceC56367yCt.plus(Math.subtractExact(j, getFrom(interfaceC56367yCt)), ChronoUnit.WEEKS);
            }
        },
        WEEK_BASED_YEAR { // from class: j$.time.temporal.IsoFields.Field.4
            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }

            @Override // o.InterfaceC56372yCy
            public ValueRange range() {
                return ChronoField.YEAR.range();
            }

            @Override // o.InterfaceC56372yCy
            public boolean isSupportedBy(InterfaceC56365yCr interfaceC56365yCr) {
                return interfaceC56365yCr.isSupported(ChronoField.EPOCH_DAY) && Field.isIso(interfaceC56365yCr);
            }

            @Override // o.InterfaceC56372yCy
            public long getFrom(InterfaceC56365yCr interfaceC56365yCr) {
                if (isSupportedBy(interfaceC56365yCr)) {
                    return Field.getWeekBasedYear(LocalDate.from(interfaceC56365yCr));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // o.InterfaceC56372yCy
            public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt, long j) {
                if (!isSupportedBy(interfaceC56367yCt)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int iCheckValidIntValue = range().checkValidIntValue(j, Field.WEEK_BASED_YEAR);
                LocalDate localDateFrom = LocalDate.from(interfaceC56367yCt);
                int i = localDateFrom.get(ChronoField.DAY_OF_WEEK);
                int week = Field.getWeek(localDateFrom);
                if (week == 53 && Field.getWeekRange(iCheckValidIntValue) == 52) {
                    week = 52;
                }
                return interfaceC56367yCt.with(LocalDate.of(iCheckValidIntValue, 1, 4).plusDays((i - r6.get(r0)) + ((week - 1) * 7)));
            }
        };

        private static final int[] QUARTER_DAYS = {0, 90, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 273, 0, 91, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 274};

        @Override // o.InterfaceC56372yCy
        public boolean isDateBased() {
            return true;
        }

        @Override // o.InterfaceC56372yCy
        public boolean isTimeBased() {
            return false;
        }

        @Override // o.InterfaceC56372yCy
        public ValueRange rangeRefinedBy(InterfaceC56365yCr interfaceC56365yCr) {
            return range();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isIso(InterfaceC56365yCr interfaceC56365yCr) {
            return InterfaceC56351yCd.KWHzl(interfaceC56365yCr).equals(IsoChronology.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ValueRange getWeekRange(LocalDate localDate) {
            return ValueRange.of(1L, getWeekRange(getWeekBasedYear(localDate)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekRange(int i) {
            LocalDate localDateOf = LocalDate.of(i, 1, 1);
            if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
                return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.isLeapYear()) ? 53 : 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeekBasedYear(LocalDate localDate) {
            int year = localDate.getYear();
            int dayOfYear = localDate.getDayOfYear();
            if (dayOfYear <= 3) {
                return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
            }
            if (dayOfYear >= 363) {
                return ((dayOfYear - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
            }
            return year;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getWeek(LocalDate localDate) {
            int iOrdinal = localDate.getDayOfWeek().ordinal();
            int dayOfYear = localDate.getDayOfYear() - 1;
            int i = (3 - iOrdinal) + dayOfYear;
            int i2 = i - ((i / 7) * 7);
            int i3 = i2 - 3;
            if (i3 < -3) {
                i3 = i2 + 4;
            }
            if (dayOfYear < i3) {
                return (int) getWeekRange(localDate.withDayOfYear(180).minusYears(1L)).getMaximum();
            }
            int i4 = ((dayOfYear - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
                return i4;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureIso(InterfaceC56365yCr interfaceC56365yCr) {
            if (!isIso(interfaceC56365yCr)) {
                throw new DateTimeException("Resolve requires IsoChronology");
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 int) A[MD:(java.lang.String, int):void (m)] (LINE:65352) call: j$.time.temporal.IsoFields.Field.<init>(java.lang.String, int):void type: THIS */
        /* synthetic */ Field(AnonymousClass2 anonymousClass2) {
            this();
        }
    }

    enum Unit implements yCF {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));

        private final Duration duration;
        private final String name;

        @Override // o.yCF
        public boolean isDateBased() {
            return true;
        }

        @Override // o.yCF
        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        @Override // o.yCF
        public Duration getDuration() {
            return this.duration;
        }

        @Override // o.yCF
        public long between(InterfaceC56367yCt interfaceC56367yCt, InterfaceC56367yCt interfaceC56367yCt2) {
            if (interfaceC56367yCt.getClass() != interfaceC56367yCt2.getClass()) {
                return interfaceC56367yCt.until(interfaceC56367yCt2, this);
            }
            int i = AnonymousClass2.OLrzqt[ordinal()];
            if (i == 1) {
                InterfaceC56372yCy interfaceC56372yCy = IsoFields.copydefault;
                return Math.subtractExact(interfaceC56367yCt2.getLong(interfaceC56372yCy), interfaceC56367yCt.getLong(interfaceC56372yCy));
            }
            if (i == 2) {
                return interfaceC56367yCt.until(interfaceC56367yCt2, ChronoUnit.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // o.yCF
        public InterfaceC56367yCt addTo(InterfaceC56367yCt interfaceC56367yCt, long j) {
            int i = AnonymousClass2.OLrzqt[ordinal()];
            if (i == 1) {
                return interfaceC56367yCt.with(IsoFields.copydefault, Math.addExact(interfaceC56367yCt.get(r0), j));
            }
            if (i == 2) {
                return interfaceC56367yCt.plus(j / 256, ChronoUnit.YEARS).plus((j % 256) * 3, ChronoUnit.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        Unit(String str, Duration duration) {
            this.name = str;
            this.duration = duration;
        }
    }

    /* JADX INFO: renamed from: j$.time.temporal.IsoFields$2, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[Unit.values().length];
            OLrzqt = iArr;
            try {
                iArr[Unit.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[Unit.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
