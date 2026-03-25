package j$.time;

import com.google.android.exoplayer2.C;
import j$.time.LocalDate;
import j$.time.chrono.IsoChronology;
import j$.time.chrono.IsoEra;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Objects;
import o.AbstractC56371yCx;
import o.C56350yCc;
import o.InterfaceC56365yCr;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56369yCv;
import o.InterfaceC56372yCy;
import o.yBW;
import o.yCF;
import o.yCG;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes13.dex */
public final class LocalDate implements InterfaceC56367yCt, InterfaceC56366yCs, yBW, Serializable {
    private final short day;
    private final short month;
    private final int year;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    public LocalDate withYear(int i) {
        if (this.year == i) {
            return this;
        }
        ChronoField.YEAR.checkValidValue(i);
        return resolvePreviousValid(i, this.month, this.day);
    }

    public LocalDate withMonth(int i) {
        if (this.month == i) {
            return this;
        }
        ChronoField.MONTH_OF_YEAR.checkValidValue(i);
        return resolvePreviousValid(this.year, i, this.day);
    }

    public LocalDate withDayOfYear(int i) {
        return getDayOfYear() == i ? this : ofYearDay(this.year, i);
    }

    public LocalDate withDayOfMonth(int i) {
        return this.day == i ? this : of(this.year, this.month, i);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalDate with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return (LocalDate) interfaceC56372yCy.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        chronoField.checkValidValue(j);
        switch (AnonymousClass4.KWHzl[chronoField.ordinal()]) {
            case 1:
                return withDayOfMonth((int) j);
            case 2:
                return withDayOfYear((int) j);
            case 3:
                return plusWeeks(j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.year < 1) {
                    j = 1 - j;
                }
                return withYear((int) j);
            case 5:
                return plusDays(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return plusWeeks(j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return withMonth((int) j);
            case 11:
                return plusMonths(j - getProlepticMonth());
            case 12:
                return withYear((int) j);
            case 13:
                return getLong(ChronoField.ERA) == j ? this : withYear(1 - this.year);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalDate with(InterfaceC56366yCs interfaceC56366yCs) {
        return interfaceC56366yCs instanceof LocalDate ? (LocalDate) interfaceC56366yCs : (LocalDate) interfaceC56366yCs.adjustInto(this);
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        long jDaysUntil;
        long j;
        LocalDate localDateFrom = from(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            return ycf.between(this, localDateFrom);
        }
        switch (AnonymousClass4.AEQbTJ[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return daysUntil(localDateFrom);
            case 2:
                jDaysUntil = daysUntil(localDateFrom);
                j = 7;
                break;
            case 3:
                return monthsUntil(localDateFrom);
            case 4:
                jDaysUntil = monthsUntil(localDateFrom);
                j = 12;
                break;
            case 5:
                jDaysUntil = monthsUntil(localDateFrom);
                j = 120;
                break;
            case 6:
                jDaysUntil = monthsUntil(localDateFrom);
                j = 1200;
                break;
            case 7:
                jDaysUntil = monthsUntil(localDateFrom);
                j = 12000;
                break;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return localDateFrom.getLong(chronoField) - getLong(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
        }
        return jDaysUntil / j;
    }

    @Override // o.yBW
    public String toString() {
        int i;
        int i2 = this.year;
        short s = this.month;
        short s2 = this.day;
        int iAbs = Math.abs(i2);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs < 1000) {
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            if (i2 > 9999) {
                sb.append('+');
            }
            sb.append(i2);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 >= 10 ? "-" : "-0");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // o.yBW
    public long toEpochDay() {
        long j = this.year;
        long j2 = this.month;
        long j3 = 365 * j;
        long j4 = (j >= 0 ? j3 + (((3 + j) / 4) - ((99 + j) / 100)) + ((j + 399) / 400) : j3 - (((j / (-4)) - (j / (-100))) + (j / (-400)))) + (((367 * j2) - 362) / 12) + ((long) (this.day - 1));
        if (j2 > 2) {
            j4 -= isLeapYear() ? 1L : 2L;
        }
        return j4 - 719528;
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        int iLengthOfMonth;
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.rangeRefinedBy(this);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        if (!chronoField.isDateBased()) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
        int i = AnonymousClass4.KWHzl[chronoField.ordinal()];
        if (i == 1) {
            iLengthOfMonth = lengthOfMonth();
        } else {
            if (i != 2) {
                if (i == 3) {
                    return ValueRange.of(1L, (getMonth() != Month.FEBRUARY || isLeapYear()) ? 5L : 4L);
                }
                if (i != 4) {
                    return interfaceC56372yCy.range();
                }
                return ValueRange.of(1L, getYear() <= 0 ? C.NANOS_PER_SECOND : 999999999L);
            }
            iLengthOfMonth = lengthOfYear();
        }
        return ValueRange.of(1L, iLengthOfMonth);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        return ycg == AbstractC56371yCx.OLrzqt() ? this : super.query(ycg);
    }

    public LocalDate plusYears(long j) {
        return j == 0 ? this : resolvePreviousValid(ChronoField.YEAR.checkValidIntValue(((long) this.year) + j), this.month, this.day);
    }

    public LocalDate plusWeeks(long j) {
        return plusDays(Math.multiplyExact(j, 7L));
    }

    public LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.year) * 12) + ((long) (this.month - 1)) + j;
        return resolvePreviousValid(ChronoField.YEAR.checkValidIntValue(Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1, this.day);
    }

    public LocalDate plusDays(long j) {
        return j == 0 ? this : ofEpochDay(Math.addExact(toEpochDay(), j));
    }

    /* JADX DEBUG: Method merged with bridge method: plus(Lo/yCv;)Lo/yBW; */
    @Override // o.yBW
    public LocalDate plus(InterfaceC56369yCv interfaceC56369yCv) {
        if (interfaceC56369yCv instanceof Period) {
            return plusMonths(((Period) interfaceC56369yCv).toTotalMonths()).plusDays(r4.getDays());
        }
        Objects.requireNonNull(interfaceC56369yCv, "amountToAdd");
        return (LocalDate) interfaceC56369yCv.addTo(this);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalDate plus(long j, yCF ycf) {
        if (!(ycf instanceof ChronoUnit)) {
            return (LocalDate) ycf.addTo(this, j);
        }
        switch (AnonymousClass4.AEQbTJ[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusWeeks(j);
            case 3:
                return plusMonths(j);
            case 4:
                return plusYears(j);
            case 5:
                return plusYears(Math.multiplyExact(j, 10L));
            case 6:
                return plusYears(Math.multiplyExact(j, 100L));
            case 7:
                return plusYears(Math.multiplyExact(j, 1000L));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return with((InterfaceC56372yCy) chronoField, Math.addExact(getLong(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
        }
    }

    public LocalDate minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public LocalDate minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalDate minus(long j, yCF ycf) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, ycf).plus(1L, ycf) : plus(-j, ycf);
    }

    @Override // o.yBW
    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    public int lengthOfMonth() {
        short s = this.month;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return super.isSupported(interfaceC56372yCy);
    }

    @Override // o.yBW
    public boolean isLeapYear() {
        return IsoChronology.INSTANCE.isLeapYear(this.year);
    }

    @Override // o.yBW
    public boolean isBefore(yBW ybw) {
        return ybw instanceof LocalDate ? compareTo0((LocalDate) ybw) < 0 : super.isBefore(ybw);
    }

    @Override // o.yBW
    public boolean isAfter(yBW ybw) {
        return ybw instanceof LocalDate ? compareTo0((LocalDate) ybw) > 0 : super.isAfter(ybw);
    }

    @Override // o.yBW
    public int hashCode() {
        int i = this.year;
        return (i & (-2048)) ^ (((i << 11) + (this.month << 6)) + this.day);
    }

    public int getYear() {
        return this.year;
    }

    public int getMonthValue() {
        return this.month;
    }

    public Month getMonth() {
        return Month.of(this.month);
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.EPOCH_DAY ? toEpochDay() : interfaceC56372yCy == ChronoField.PROLEPTIC_MONTH ? getProlepticMonth() : get0(interfaceC56372yCy) : interfaceC56372yCy.getFrom(this);
    }

    /* JADX DEBUG: Method merged with bridge method: getEra()Lo/yCe; */
    @Override // o.yBW
    public IsoEra getEra() {
        return getYear() >= 1 ? IsoEra.CE : IsoEra.BCE;
    }

    public int getDayOfYear() {
        return (getMonth().firstDayOfYear(isLeapYear()) + this.day) - 1;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of(((int) Math.floorMod(toEpochDay() + 3, 7L)) + 1);
    }

    public int getDayOfMonth() {
        return this.day;
    }

    /* JADX DEBUG: Method merged with bridge method: getChronology()Lo/yCd; */
    @Override // o.yBW
    public IsoChronology getChronology() {
        return IsoChronology.INSTANCE;
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? get0(interfaceC56372yCy) : super.get(interfaceC56372yCy);
    }

    public String format(C56350yCc c56350yCc) {
        Objects.requireNonNull(c56350yCc, "formatter");
        return c56350yCc.OLrzqt(this);
    }

    @Override // o.yBW
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && compareTo0((LocalDate) obj) == 0;
    }

    long daysUntil(LocalDate localDate) {
        return localDate.toEpochDay() - toEpochDay();
    }

    int compareTo0(LocalDate localDate) {
        int i = this.year - localDate.year;
        if (i != 0) {
            return i;
        }
        int i2 = this.month - localDate.month;
        return i2 == 0 ? this.day - localDate.day : i2;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // o.yBW, java.lang.Comparable
    public int compareTo(yBW ybw) {
        return ybw instanceof LocalDate ? compareTo0((LocalDate) ybw) : super.compareTo(ybw);
    }

    /* JADX DEBUG: Method merged with bridge method: atTime(Lj$/time/LocalTime;)Lo/yCb; */
    @Override // o.yBW
    public LocalDateTime atTime(LocalTime localTime) {
        return LocalDateTime.of(this, localTime);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.of(this, LocalTime.MIDNIGHT);
    }

    @Override // o.InterfaceC56366yCs
    public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return super.adjustInto(interfaceC56367yCt);
    }

    private static LocalDate resolvePreviousValid(int i, int i2, int i3) {
        int i4;
        if (i2 != 2) {
            if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
                i4 = 30;
            }
            return new LocalDate(i, i2, i3);
        }
        i4 = IsoChronology.INSTANCE.isLeapYear((long) i) ? 29 : 28;
        i3 = Math.min(i3, i4);
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate parse(CharSequence charSequence, C56350yCc c56350yCc) {
        Objects.requireNonNull(c56350yCc, "formatter");
        return (LocalDate) c56350yCc.AEQbTJ(charSequence, new yCG() { // from class: o.yBR
            @Override // o.yCG
            public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
                return LocalDate.from(interfaceC56365yCr);
            }
        });
    }

    public static LocalDate ofYearDay(int i, int i2) {
        long j = i;
        ChronoField.YEAR.checkValidValue(j);
        ChronoField.DAY_OF_YEAR.checkValidValue(i2);
        boolean zIsLeapYear = IsoChronology.INSTANCE.isLeapYear(j);
        if (i2 != 366 || zIsLeapYear) {
            Month monthOf = Month.of(((i2 - 1) / 31) + 1);
            if (i2 > (monthOf.firstDayOfYear(zIsLeapYear) + monthOf.length(zIsLeapYear)) - 1) {
                monthOf = monthOf.plus(1L);
            }
            return new LocalDate(i, monthOf.getValue(), (i2 - monthOf.firstDayOfYear(zIsLeapYear)) + 1);
        }
        throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
    }

    public static LocalDate ofEpochDay(long j) {
        long j2;
        long j3 = j + 719468;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA;
        return new LocalDate(ChronoField.YEAR.checkValidIntValue(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.checkValidValue(i);
        ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        ChronoField.DAY_OF_MONTH.checkValidValue(i3);
        return create(i, i2, i3);
    }

    public static LocalDate now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        return ofEpochDay(Math.floorDiv(instant.getEpochSecond() + ((long) clock.getZone().getRules().getOffset(instant).getTotalSeconds()), 86400L));
    }

    public static LocalDate now() {
        return now(Clock.systemDefaultZone());
    }

    private long monthsUntil(LocalDate localDate) {
        long prolepticMonth = getProlepticMonth();
        return (((localDate.getProlepticMonth() * 32) + ((long) localDate.getDayOfMonth())) - ((prolepticMonth * 32) + ((long) getDayOfMonth()))) / 32;
    }

    private long getProlepticMonth() {
        return ((((long) this.year) * 12) + ((long) this.month)) - 1;
    }

    private int get0(InterfaceC56372yCy interfaceC56372yCy) {
        switch (AnonymousClass4.KWHzl[((ChronoField) interfaceC56372yCy).ordinal()]) {
            case 1:
                return this.day;
            case 2:
                return getDayOfYear();
            case 3:
                return ((this.day - 1) / 7) + 1;
            case 4:
                int i = this.year;
                return i >= 1 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.day - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new UnsupportedTemporalTypeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.month;
            case 11:
                throw new UnsupportedTemporalTypeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.year;
            case 13:
                return this.year >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
    }

    public static LocalDate from(InterfaceC56365yCr interfaceC56365yCr) {
        Objects.requireNonNull(interfaceC56365yCr, "temporal");
        LocalDate localDate = (LocalDate) interfaceC56365yCr.query(AbstractC56371yCx.OLrzqt());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC56365yCr + " of type " + interfaceC56365yCr.getClass().getName());
    }

    private static LocalDate create(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (IsoChronology.INSTANCE.isLeapYear(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.of(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    /* JADX INFO: renamed from: j$.time.LocalDate$4, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AEQbTJ;
        static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AEQbTJ[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            KWHzl = iArr2;
            try {
                iArr2[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                KWHzl[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                KWHzl[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                KWHzl[ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                KWHzl[ChronoField.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                KWHzl[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                KWHzl[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                KWHzl[ChronoField.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                KWHzl[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                KWHzl[ChronoField.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                KWHzl[ChronoField.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                KWHzl[ChronoField.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                KWHzl[ChronoField.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private LocalDate(int i, int i2, int i3) {
        this.year = i;
        this.month = (short) i2;
        this.day = (short) i3;
    }
}
