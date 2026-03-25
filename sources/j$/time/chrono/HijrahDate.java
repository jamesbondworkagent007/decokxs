package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import o.InterfaceC56349yCb;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56369yCv;
import o.InterfaceC56372yCy;
import o.yCF;

/* JADX INFO: loaded from: classes24.dex */
public final class HijrahDate extends ChronoLocalDateImpl {
    private final transient HijrahChronology chrono;
    private final transient int dayOfMonth;
    private final transient int monthOfYear;
    private final transient int prolepticYear;

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public HijrahDate with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return (HijrahDate) super.with(interfaceC56372yCy, j);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        this.chrono.range(chronoField).checkValidValue(j, chronoField);
        int i = (int) j;
        switch (AnonymousClass3.copydefault[chronoField.ordinal()]) {
            case 1:
                return resolvePreviousValid(this.prolepticYear, this.monthOfYear, i);
            case 2:
                return plusDays(Math.min(i, lengthOfYear()) - getDayOfYear());
            case 3:
                return plusDays((j - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return plusDays(j - ((long) getDayOfWeek()));
            case 5:
                return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return plusDays(j - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new HijrahDate(this.chrono, j);
            case 8:
                return plusDays((j - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return resolvePreviousValid(this.prolepticYear, i, this.dayOfMonth);
            case 10:
                return plusMonths(j - getProlepticMonth());
            case 11:
                if (this.prolepticYear < 1) {
                    i = 1 - i;
                }
                return resolvePreviousValid(i, this.monthOfYear, this.dayOfMonth);
            case 12:
                return resolvePreviousValid(i, this.monthOfYear, this.dayOfMonth);
            case 13:
                return resolvePreviousValid(1 - this.prolepticYear, this.monthOfYear, this.dayOfMonth);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public HijrahDate with(InterfaceC56366yCs interfaceC56366yCs) {
        return (HijrahDate) super.with(interfaceC56366yCs);
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
        return this.chrono.getEpochDay(this.prolepticYear, this.monthOfYear, this.dayOfMonth);
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.rangeRefinedBy(this);
        }
        if (isSupported(interfaceC56372yCy)) {
            ChronoField chronoField = (ChronoField) interfaceC56372yCy;
            int i = AnonymousClass3.copydefault[chronoField.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? getChronology().range(chronoField) : ValueRange.of(1L, 5L) : ValueRange.of(1L, lengthOfYear()) : ValueRange.of(1L, lengthOfMonth());
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    /* JADX DEBUG: Method merged with bridge method: plusYears(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public HijrahDate plusYears(long j) {
        return j == 0 ? this : resolvePreviousValid(Math.addExact(this.prolepticYear, (int) j), this.monthOfYear, this.dayOfMonth);
    }

    /* JADX DEBUG: Method merged with bridge method: plusMonths(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public HijrahDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.prolepticYear) * 12) + ((long) (this.monthOfYear - 1)) + j;
        return resolvePreviousValid(this.chrono.checkValidYear(Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1, this.dayOfMonth);
    }

    /* JADX DEBUG: Method merged with bridge method: plusDays(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public HijrahDate plusDays(long j) {
        return new HijrahDate(this.chrono, toEpochDay() + j);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(Lo/yCv;)Lo/yBW; */
    @Override // j$.time.chrono.ChronoLocalDateImpl, o.yBW
    public HijrahDate plus(InterfaceC56369yCv interfaceC56369yCv) {
        return (HijrahDate) super.plus(interfaceC56369yCv);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public HijrahDate plus(long j, yCF ycf) {
        return (HijrahDate) super.plus(j, ycf);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public HijrahDate minus(long j, yCF ycf) {
        return (HijrahDate) super.minus(j, ycf);
    }

    @Override // o.yBW
    public int lengthOfYear() {
        return this.chrono.getYearLength(this.prolepticYear);
    }

    public int lengthOfMonth() {
        return this.chrono.getMonthLength(this.prolepticYear, this.monthOfYear);
    }

    @Override // o.yBW
    public boolean isLeapYear() {
        return this.chrono.isLeapYear(this.prolepticYear);
    }

    @Override // o.yBW
    public int hashCode() {
        int i = this.prolepticYear;
        return ((i & (-2048)) ^ getChronology().getId().hashCode()) ^ (((i << 11) + (this.monthOfYear << 6)) + this.dayOfMonth);
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        int dayOfYear;
        int dayOfYear2;
        int dayOfWeek;
        int i;
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        switch (AnonymousClass3.copydefault[((ChronoField) interfaceC56372yCy).ordinal()]) {
            case 1:
                dayOfYear = this.dayOfMonth;
                return dayOfYear;
            case 2:
                dayOfYear = getDayOfYear();
                return dayOfYear;
            case 3:
                dayOfYear2 = this.dayOfMonth;
                i = (dayOfYear2 - 1) / 7;
                dayOfYear = i + 1;
                return dayOfYear;
            case 4:
                dayOfYear = getDayOfWeek();
                return dayOfYear;
            case 5:
                dayOfWeek = getDayOfWeek();
                i = (dayOfWeek - 1) % 7;
                dayOfYear = i + 1;
                return dayOfYear;
            case 6:
                dayOfWeek = getDayOfYear();
                i = (dayOfWeek - 1) % 7;
                dayOfYear = i + 1;
                return dayOfYear;
            case 7:
                return toEpochDay();
            case 8:
                dayOfYear2 = getDayOfYear();
                i = (dayOfYear2 - 1) / 7;
                dayOfYear = i + 1;
                return dayOfYear;
            case 9:
                dayOfYear = this.monthOfYear;
                return dayOfYear;
            case 10:
                return getProlepticMonth();
            case 11:
            case 12:
                dayOfYear = this.prolepticYear;
                return dayOfYear;
            case 13:
                dayOfYear = getEraValue();
                return dayOfYear;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getEra()Lo/yCe; */
    @Override // o.yBW
    public HijrahEra getEra() {
        return HijrahEra.AH;
    }

    /* JADX DEBUG: Method merged with bridge method: getChronology()Lo/yCd; */
    @Override // o.yBW
    public HijrahChronology getChronology() {
        return this.chrono;
    }

    @Override // o.yBW
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HijrahDate)) {
            return false;
        }
        HijrahDate hijrahDate = (HijrahDate) obj;
        return this.prolepticYear == hijrahDate.prolepticYear && this.monthOfYear == hijrahDate.monthOfYear && this.dayOfMonth == hijrahDate.dayOfMonth && getChronology().equals(hijrahDate.getChronology());
    }

    @Override // o.yBW
    public final InterfaceC56349yCb atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    private HijrahDate resolvePreviousValid(int i, int i2, int i3) {
        int monthLength = this.chrono.getMonthLength(i, i2);
        if (i3 > monthLength) {
            i3 = monthLength;
        }
        return of(this.chrono, i, i2, i3);
    }

    static HijrahDate ofEpochDay(HijrahChronology hijrahChronology, long j) {
        return new HijrahDate(hijrahChronology, j);
    }

    static HijrahDate of(HijrahChronology hijrahChronology, int i, int i2, int i3) {
        return new HijrahDate(hijrahChronology, i, i2, i3);
    }

    private long getProlepticMonth() {
        return ((((long) this.prolepticYear) * 12) + ((long) this.monthOfYear)) - 1;
    }

    private int getEraValue() {
        return this.prolepticYear > 1 ? 1 : 0;
    }

    private int getDayOfYear() {
        return this.chrono.getDayOfYear(this.prolepticYear, this.monthOfYear) + this.dayOfMonth;
    }

    private int getDayOfWeek() {
        return ((int) Math.floorMod(toEpochDay() + 3, 7L)) + 1;
    }

    /* JADX INFO: renamed from: j$.time.chrono.HijrahDate$3, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass3 {
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
                copydefault[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[ChronoField.DAY_OF_WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                copydefault[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                copydefault[ChronoField.EPOCH_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                copydefault[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                copydefault[ChronoField.MONTH_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                copydefault[ChronoField.PROLEPTIC_MONTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                copydefault[ChronoField.YEAR_OF_ERA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                copydefault[ChronoField.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                copydefault[ChronoField.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private HijrahDate(HijrahChronology hijrahChronology, long j) {
        int[] hijrahDateInfo = hijrahChronology.getHijrahDateInfo((int) j);
        this.chrono = hijrahChronology;
        this.prolepticYear = hijrahDateInfo[0];
        this.monthOfYear = hijrahDateInfo[1];
        this.dayOfMonth = hijrahDateInfo[2];
    }

    private HijrahDate(HijrahChronology hijrahChronology, int i, int i2, int i3) {
        hijrahChronology.getEpochDay(i, i2, i3);
        this.chrono = hijrahChronology;
        this.prolepticYear = i;
        this.monthOfYear = i2;
        this.dayOfMonth = i3;
    }
}
