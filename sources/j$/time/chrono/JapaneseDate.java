package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.util.Objects;
import o.InterfaceC56349yCb;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56369yCv;
import o.InterfaceC56372yCy;
import o.yCF;

/* JADX INFO: loaded from: classes24.dex */
public final class JapaneseDate extends ChronoLocalDateImpl {
    static final LocalDate MEIJI_6_ISODATE = LocalDate.of(1873, 1, 1);
    private transient JapaneseEra era;
    private final transient LocalDate isoDate;
    private transient int yearOfEra;

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public JapaneseDate with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return (JapaneseDate) super.with(interfaceC56372yCy, j);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        if (getLong(chronoField) == j) {
            return this;
        }
        int[] iArr = AnonymousClass5.copydefault;
        int i = iArr[chronoField.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            int iCheckValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
            int i2 = iArr[chronoField.ordinal()];
            if (i2 == 3) {
                return withYear(iCheckValidIntValue);
            }
            if (i2 == 8) {
                return withYear(JapaneseEra.of(iCheckValidIntValue), this.yearOfEra);
            }
            if (i2 == 9) {
                return with(this.isoDate.withYear(iCheckValidIntValue));
            }
        }
        return with(this.isoDate.with(interfaceC56372yCy, j));
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public JapaneseDate with(InterfaceC56366yCs interfaceC56366yCs) {
        return (JapaneseDate) super.with(interfaceC56366yCs);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.yBW, o.InterfaceC56367yCt
    public /* bridge */ /* synthetic */ long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        return super.until(interfaceC56367yCt, ycf);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.yBW
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.yBW
    public long toEpochDay() {
        return this.isoDate.toEpochDay();
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.rangeRefinedBy(this);
        }
        if (!isSupported(interfaceC56372yCy)) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        int i = AnonymousClass5.copydefault[chronoField.ordinal()];
        if (i == 1) {
            return ValueRange.of(1L, lengthOfMonth());
        }
        if (i == 2) {
            return ValueRange.of(1L, lengthOfYear());
        }
        if (i != 3) {
            return getChronology().range(chronoField);
        }
        int year = this.era.getSince().getYear();
        return this.era.next() != null ? ValueRange.of(1L, (r0.getSince().getYear() - year) + 1) : ValueRange.of(1L, 999999999 - year);
    }

    /* JADX DEBUG: Method merged with bridge method: plusYears(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public JapaneseDate plusYears(long j) {
        return with(this.isoDate.plusYears(j));
    }

    /* JADX DEBUG: Method merged with bridge method: plusMonths(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public JapaneseDate plusMonths(long j) {
        return with(this.isoDate.plusMonths(j));
    }

    /* JADX DEBUG: Method merged with bridge method: plusDays(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public JapaneseDate plusDays(long j) {
        return with(this.isoDate.plusDays(j));
    }

    /* JADX DEBUG: Method merged with bridge method: plus(Lo/yCv;)Lo/yBW; */
    @Override // j$.time.chrono.ChronoLocalDateImpl, o.yBW
    public JapaneseDate plus(InterfaceC56369yCv interfaceC56369yCv) {
        return (JapaneseDate) super.plus(interfaceC56369yCv);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public JapaneseDate plus(long j, yCF ycf) {
        return (JapaneseDate) super.plus(j, ycf);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public JapaneseDate minus(long j, yCF ycf) {
        return (JapaneseDate) super.minus(j, ycf);
    }

    @Override // o.yBW
    public int lengthOfYear() {
        JapaneseEra next = this.era.next();
        int iLengthOfYear = (next == null || next.getSince().getYear() != this.isoDate.getYear()) ? this.isoDate.lengthOfYear() : next.getSince().getDayOfYear() - 1;
        return this.yearOfEra == 1 ? iLengthOfYear - (this.era.getSince().getDayOfYear() - 1) : iLengthOfYear;
    }

    public int lengthOfMonth() {
        return this.isoDate.lengthOfMonth();
    }

    @Override // o.yBW, o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        if (interfaceC56372yCy != ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH && interfaceC56372yCy != ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR && interfaceC56372yCy != ChronoField.ALIGNED_WEEK_OF_MONTH && interfaceC56372yCy != ChronoField.ALIGNED_WEEK_OF_YEAR) {
            if (interfaceC56372yCy instanceof ChronoField) {
                return interfaceC56372yCy.isDateBased();
            }
            if (interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.yBW
    public int hashCode() {
        return getChronology().getId().hashCode() ^ this.isoDate.hashCode();
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        switch (AnonymousClass5.copydefault[((ChronoField) interfaceC56372yCy).ordinal()]) {
            case 2:
                return this.yearOfEra == 1 ? (this.isoDate.getDayOfYear() - this.era.getSince().getDayOfYear()) + 1 : this.isoDate.getDayOfYear();
            case 3:
                return this.yearOfEra;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
            case 8:
                return this.era.getValue();
            default:
                return this.isoDate.getLong(interfaceC56372yCy);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getEra()Lo/yCe; */
    @Override // o.yBW
    public JapaneseEra getEra() {
        return this.era;
    }

    /* JADX DEBUG: Method merged with bridge method: getChronology()Lo/yCd; */
    @Override // o.yBW
    public JapaneseChronology getChronology() {
        return JapaneseChronology.INSTANCE;
    }

    @Override // o.yBW
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JapaneseDate) {
            return this.isoDate.equals(((JapaneseDate) obj).isoDate);
        }
        return false;
    }

    @Override // o.yBW
    public final InterfaceC56349yCb atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    private JapaneseDate withYear(JapaneseEra japaneseEra, int i) {
        return with(this.isoDate.withYear(JapaneseChronology.INSTANCE.prolepticYear(japaneseEra, i)));
    }

    private JapaneseDate withYear(int i) {
        return withYear(getEra(), i);
    }

    private JapaneseDate with(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new JapaneseDate(localDate);
    }

    static JapaneseDate ofYearDay(JapaneseEra japaneseEra, int i, int i2) {
        Objects.requireNonNull(japaneseEra, "era");
        int year = japaneseEra.getSince().getYear();
        LocalDate localDateOfYearDay = i == 1 ? LocalDate.ofYearDay(year, (japaneseEra.getSince().getDayOfYear() + i2) - 1) : LocalDate.ofYearDay((year + i) - 1, i2);
        if (localDateOfYearDay.isBefore(japaneseEra.getSince()) || japaneseEra != JapaneseEra.from(localDateOfYearDay)) {
            throw new DateTimeException("Invalid parameters");
        }
        return new JapaneseDate(japaneseEra, i, localDateOfYearDay);
    }

    public static JapaneseDate of(JapaneseEra japaneseEra, int i, int i2, int i3) {
        Objects.requireNonNull(japaneseEra, "era");
        LocalDate localDateOf = LocalDate.of((japaneseEra.getSince().getYear() + i) - 1, i2, i3);
        if (localDateOf.isBefore(japaneseEra.getSince()) || japaneseEra != JapaneseEra.from(localDateOf)) {
            throw new DateTimeException("year, month, and day not valid for Era");
        }
        return new JapaneseDate(japaneseEra, i, localDateOf);
    }

    JapaneseDate(JapaneseEra japaneseEra, int i, LocalDate localDate) {
        if (localDate.isBefore(MEIJI_6_ISODATE)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.era = japaneseEra;
        this.yearOfEra = i;
        this.isoDate = localDate;
    }

    /* JADX INFO: renamed from: j$.time.chrono.JapaneseDate$5, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[ChronoField.values().length];
            copydefault = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                copydefault[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                copydefault[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                copydefault[ChronoField.ERA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                copydefault[ChronoField.YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    JapaneseDate(LocalDate localDate) {
        if (localDate.isBefore(MEIJI_6_ISODATE)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.era = JapaneseEra.from(localDate);
        this.yearOfEra = (localDate.getYear() - this.era.getSince().getYear()) + 1;
        this.isoDate = localDate;
    }
}
