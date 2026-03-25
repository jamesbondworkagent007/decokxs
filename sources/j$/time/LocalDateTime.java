package j$.time;

import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Objects;
import o.AbstractC56371yCx;
import o.C56350yCc;
import o.InterfaceC56349yCb;
import o.InterfaceC56365yCr;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56372yCy;
import o.yCF;
import o.yCG;

/* JADX INFO: loaded from: classes13.dex */
public final class LocalDateTime implements InterfaceC56367yCt, InterfaceC56366yCs, InterfaceC56349yCb<LocalDate>, Serializable {
    private final LocalDate date;
    private final LocalTime time;
    public static final LocalDateTime MIN = of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = of(LocalDate.MAX, LocalTime.MAX);

    public LocalDateTime withDayOfMonth(int i) {
        return with(this.date.withDayOfMonth(i), this.time);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCb; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalDateTime with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        return interfaceC56372yCy instanceof ChronoField ? ((ChronoField) interfaceC56372yCy).isTimeBased() ? with(this.date, this.time.with(interfaceC56372yCy, j)) : with(this.date.with(interfaceC56372yCy, j), this.time) : (LocalDateTime) interfaceC56372yCy.adjustInto(this, j);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCb; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalDateTime with(InterfaceC56366yCs interfaceC56366yCs) {
        return interfaceC56366yCs instanceof LocalDate ? with((LocalDate) interfaceC56366yCs, this.time) : interfaceC56366yCs instanceof LocalTime ? with(this.date, (LocalTime) interfaceC56366yCs) : interfaceC56366yCs instanceof LocalDateTime ? (LocalDateTime) interfaceC56366yCs : (LocalDateTime) interfaceC56366yCs.adjustInto(this);
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        long jMultiplyExact;
        long j;
        long jMultiplyExact2;
        long j2;
        LocalDateTime localDateTimeFrom = from(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            return ycf.between(this, localDateTimeFrom);
        }
        if (!ycf.isTimeBased()) {
            LocalDate localDatePlusDays = localDateTimeFrom.date;
            if (localDatePlusDays.isAfter(this.date) && localDateTimeFrom.time.isBefore(this.time)) {
                localDatePlusDays = localDatePlusDays.minusDays(1L);
            } else if (localDatePlusDays.isBefore(this.date) && localDateTimeFrom.time.isAfter(this.time)) {
                localDatePlusDays = localDatePlusDays.plusDays(1L);
            }
            return this.date.until(localDatePlusDays, ycf);
        }
        long jDaysUntil = this.date.daysUntil(localDateTimeFrom.date);
        if (jDaysUntil == 0) {
            return this.time.until(localDateTimeFrom.time, ycf);
        }
        long nanoOfDay = localDateTimeFrom.time.toNanoOfDay() - this.time.toNanoOfDay();
        if (jDaysUntil > 0) {
            jMultiplyExact = jDaysUntil - 1;
            j = nanoOfDay + 86400000000000L;
        } else {
            jMultiplyExact = jDaysUntil + 1;
            j = nanoOfDay - 86400000000000L;
        }
        switch (AnonymousClass2.KWHzl[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                jMultiplyExact = Math.multiplyExact(jMultiplyExact, 86400000000000L);
                break;
            case 2:
                jMultiplyExact2 = Math.multiplyExact(jMultiplyExact, 86400000000L);
                j2 = 1000;
                jMultiplyExact = jMultiplyExact2;
                j /= j2;
                break;
            case 3:
                jMultiplyExact2 = Math.multiplyExact(jMultiplyExact, CalendarModelKt.MillisecondsIn24Hours);
                j2 = 1000000;
                jMultiplyExact = jMultiplyExact2;
                j /= j2;
                break;
            case 4:
                jMultiplyExact2 = Math.multiplyExact(jMultiplyExact, 86400L);
                j2 = C.NANOS_PER_SECOND;
                jMultiplyExact = jMultiplyExact2;
                j /= j2;
                break;
            case 5:
                jMultiplyExact2 = Math.multiplyExact(jMultiplyExact, 1440L);
                j2 = 60000000000L;
                jMultiplyExact = jMultiplyExact2;
                j /= j2;
                break;
            case 6:
                jMultiplyExact2 = Math.multiplyExact(jMultiplyExact, 24L);
                j2 = 3600000000000L;
                jMultiplyExact = jMultiplyExact2;
                j /= j2;
                break;
            case 7:
                jMultiplyExact2 = Math.multiplyExact(jMultiplyExact, 2L);
                j2 = 43200000000000L;
                jMultiplyExact = jMultiplyExact2;
                j /= j2;
                break;
        }
        return Math.addExact(jMultiplyExact, j);
    }

    @Override // o.InterfaceC56349yCb
    public String toString() {
        return this.date.toString() + 'T' + this.time.toString();
    }

    @Override // o.InterfaceC56349yCb
    public LocalTime toLocalTime() {
        return this.time;
    }

    /* JADX DEBUG: Method merged with bridge method: toLocalDate()Lo/yBW; */
    @Override // o.InterfaceC56349yCb
    public LocalDate toLocalDate() {
        return this.date;
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? ((ChronoField) interfaceC56372yCy).isTimeBased() ? this.time.range(interfaceC56372yCy) : this.date.range(interfaceC56372yCy) : interfaceC56372yCy.rangeRefinedBy(this);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        return ycg == AbstractC56371yCx.OLrzqt() ? this.date : super.query(ycg);
    }

    public LocalDateTime plusSeconds(long j) {
        return plusWithOverflow(this.date, 0L, 0L, j, 0L, 1);
    }

    public LocalDateTime plusNanos(long j) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j, 1);
    }

    public LocalDateTime plusMinutes(long j) {
        return plusWithOverflow(this.date, 0L, j, 0L, 0L, 1);
    }

    public LocalDateTime plusHours(long j) {
        return plusWithOverflow(this.date, j, 0L, 0L, 0L, 1);
    }

    public LocalDateTime plusDays(long j) {
        return with(this.date.plusDays(j), this.time);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCb; */
    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalDateTime plus(long j, yCF ycf) {
        if (!(ycf instanceof ChronoUnit)) {
            return (LocalDateTime) ycf.addTo(this, j);
        }
        switch (AnonymousClass2.KWHzl[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return plusDays(j / 86400000000L).plusNanos((j % 86400000000L) * 1000);
            case 3:
                return plusDays(j / CalendarModelKt.MillisecondsIn24Hours).plusNanos((j % CalendarModelKt.MillisecondsIn24Hours) * 1000000);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusMinutes(j);
            case 6:
                return plusHours(j);
            case 7:
                return plusDays(j / 256).plusHours((j % 256) * 12);
            default:
                return with(this.date.plus(j, ycf), this.time);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCb; */
    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalDateTime minus(long j, yCF ycf) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, ycf).plus(1L, ycf) : plus(-j, ycf);
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        return chronoField.isDateBased() || chronoField.isTimeBased();
    }

    @Override // o.InterfaceC56349yCb
    public boolean isBefore(InterfaceC56349yCb interfaceC56349yCb) {
        return interfaceC56349yCb instanceof LocalDateTime ? compareTo0((LocalDateTime) interfaceC56349yCb) < 0 : super.isBefore(interfaceC56349yCb);
    }

    @Override // o.InterfaceC56349yCb
    public boolean isAfter(InterfaceC56349yCb interfaceC56349yCb) {
        return interfaceC56349yCb instanceof LocalDateTime ? compareTo0((LocalDateTime) interfaceC56349yCb) > 0 : super.isAfter(interfaceC56349yCb);
    }

    @Override // o.InterfaceC56349yCb
    public int hashCode() {
        return this.date.hashCode() ^ this.time.hashCode();
    }

    public int getYear() {
        return this.date.getYear();
    }

    public int getSecond() {
        return this.time.getSecond();
    }

    public int getNano() {
        return this.time.getNano();
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? ((ChronoField) interfaceC56372yCy).isTimeBased() ? this.time.getLong(interfaceC56372yCy) : this.date.getLong(interfaceC56372yCy) : interfaceC56372yCy.getFrom(this);
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? ((ChronoField) interfaceC56372yCy).isTimeBased() ? this.time.get(interfaceC56372yCy) : this.date.get(interfaceC56372yCy) : super.get(interfaceC56372yCy);
    }

    public String format(C56350yCc c56350yCc) {
        Objects.requireNonNull(c56350yCc, "formatter");
        return c56350yCc.OLrzqt(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.date.equals(localDateTime.date) && this.time.equals(localDateTime.time);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.InterfaceC56349yCb, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(InterfaceC56349yCb<?> interfaceC56349yCb) {
        return compareTo2((InterfaceC56349yCb) interfaceC56349yCb);
    }

    @Override // o.InterfaceC56349yCb
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(InterfaceC56349yCb interfaceC56349yCb) {
        return interfaceC56349yCb instanceof LocalDateTime ? compareTo0((LocalDateTime) interfaceC56349yCb) : super.compareTo(interfaceC56349yCb);
    }

    /* JADX DEBUG: Method merged with bridge method: atZone(Lj$/time/ZoneId;)Lo/yCf; */
    @Override // o.InterfaceC56349yCb
    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.of(this, zoneOffset);
    }

    @Override // o.InterfaceC56366yCs
    public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return super.adjustInto(interfaceC56367yCt);
    }

    private LocalDateTime with(LocalDate localDate, LocalTime localTime) {
        return (this.date == localDate && this.time == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    private LocalDateTime plusWithOverflow(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        LocalTime localTimeOfNanoOfDay;
        LocalDate localDatePlusDays;
        if ((j | j2 | j3 | j4) == 0) {
            localTimeOfNanoOfDay = this.time;
            localDatePlusDays = localDate;
        } else {
            long j5 = j4 / 86400000000000L;
            long j6 = j3 / 86400;
            long j7 = j2 / 1440;
            long j8 = j / 24;
            long j9 = i;
            long nanoOfDay = this.time.toNanoOfDay();
            long j10 = (((j4 % 86400000000000L) + ((j3 % 86400) * C.NANOS_PER_SECOND) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L)) * j9) + nanoOfDay;
            long jFloorDiv = Math.floorDiv(j10, 86400000000000L);
            long jFloorMod = Math.floorMod(j10, 86400000000000L);
            localTimeOfNanoOfDay = jFloorMod == nanoOfDay ? this.time : LocalTime.ofNanoOfDay(jFloorMod);
            localDatePlusDays = localDate.plusDays(((j5 + j6 + j7 + j8) * j9) + jFloorDiv);
        }
        return with(localDatePlusDays, localTimeOfNanoOfDay);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().getOffset(instant));
    }

    public static LocalDateTime ofEpochSecond(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        long j2 = i;
        ChronoField.NANO_OF_SECOND.checkValidValue(j2);
        long totalSeconds = j + ((long) zoneOffset.getTotalSeconds());
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(totalSeconds, 86400L)), LocalTime.ofNanoOfDay((((long) ((int) Math.floorMod(totalSeconds, 86400L))) * C.NANOS_PER_SECOND) + j2));
    }

    public static LocalDateTime of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, CrashHianalyticsData.TIME);
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5, i6, i7));
    }

    public static LocalDateTime of(int i, int i2, int i3, int i4, int i5) {
        return new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5));
    }

    public static LocalDateTime from(InterfaceC56365yCr interfaceC56365yCr) {
        if (interfaceC56365yCr instanceof LocalDateTime) {
            return (LocalDateTime) interfaceC56365yCr;
        }
        if (interfaceC56365yCr instanceof ZonedDateTime) {
            return ((ZonedDateTime) interfaceC56365yCr).toLocalDateTime();
        }
        if (interfaceC56365yCr instanceof OffsetDateTime) {
            return ((OffsetDateTime) interfaceC56365yCr).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.from(interfaceC56365yCr), LocalTime.from(interfaceC56365yCr));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC56365yCr + " of type " + interfaceC56365yCr.getClass().getName(), e);
        }
    }

    private int compareTo0(LocalDateTime localDateTime) {
        int iCompareTo0 = this.date.compareTo0(localDateTime.toLocalDate());
        return iCompareTo0 == 0 ? this.time.compareTo(localDateTime.toLocalTime()) : iCompareTo0;
    }

    /* JADX INFO: renamed from: j$.time.LocalDateTime$2, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            KWHzl = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KWHzl[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KWHzl[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                KWHzl[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.date = localDate;
        this.time = localTime;
    }
}
