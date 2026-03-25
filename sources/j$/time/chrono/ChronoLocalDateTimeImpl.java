package j$.time.chrono;

import androidx.compose.material3.CalendarModelKt;
import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Objects;
import o.InterfaceC56349yCb;
import o.InterfaceC56351yCd;
import o.InterfaceC56353yCf;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56372yCy;
import o.yBW;
import o.yCF;

/* JADX INFO: loaded from: classes13.dex */
public final class ChronoLocalDateTimeImpl implements InterfaceC56349yCb, InterfaceC56367yCt, InterfaceC56366yCs, Serializable {
    private final transient yBW date;
    private final transient LocalTime time;

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCb; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56349yCb, o.InterfaceC56367yCt
    public ChronoLocalDateTimeImpl with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        return interfaceC56372yCy instanceof ChronoField ? ((ChronoField) interfaceC56372yCy).isTimeBased() ? with(this.date, this.time.with(interfaceC56372yCy, j)) : with(this.date.with(interfaceC56372yCy, j), this.time) : ensureValid(this.date.getChronology(), interfaceC56372yCy.adjustInto(this, j));
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCb; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56349yCb, o.InterfaceC56367yCt
    public ChronoLocalDateTimeImpl with(InterfaceC56366yCs interfaceC56366yCs) {
        return interfaceC56366yCs instanceof yBW ? with((yBW) interfaceC56366yCs, this.time) : interfaceC56366yCs instanceof LocalTime ? with(this.date, (LocalTime) interfaceC56366yCs) : interfaceC56366yCs instanceof ChronoLocalDateTimeImpl ? ensureValid(this.date.getChronology(), (ChronoLocalDateTimeImpl) interfaceC56366yCs) : ensureValid(this.date.getChronology(), (ChronoLocalDateTimeImpl) interfaceC56366yCs.adjustInto(this));
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        long j;
        Objects.requireNonNull(interfaceC56367yCt, "endExclusive");
        InterfaceC56349yCb interfaceC56349yCbLocalDateTime = KWHzl().localDateTime(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            Objects.requireNonNull(ycf, "unit");
            return ycf.between(this, interfaceC56349yCbLocalDateTime);
        }
        if (!ycf.isTimeBased()) {
            yBW localDate = interfaceC56349yCbLocalDateTime.toLocalDate();
            if (interfaceC56349yCbLocalDateTime.toLocalTime().isBefore(this.time)) {
                localDate = localDate.minus(1L, (yCF) ChronoUnit.DAYS);
            }
            return this.date.until(localDate, ycf);
        }
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        long jMultiplyExact = interfaceC56349yCbLocalDateTime.getLong(chronoField) - this.date.getLong(chronoField);
        switch (AnonymousClass4.OLrzqt[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                j = 86400000000000L;
                break;
            case 2:
                j = 86400000000L;
                break;
            case 3:
                j = CalendarModelKt.MillisecondsIn24Hours;
                break;
            case 4:
                j = 86400;
                break;
            case 5:
                j = 1440;
                break;
            case 6:
                j = 24;
                break;
            case 7:
                j = 2;
                break;
            default:
                return Math.addExact(jMultiplyExact, this.time.until(interfaceC56349yCbLocalDateTime.toLocalTime(), ycf));
        }
        jMultiplyExact = Math.multiplyExact(jMultiplyExact, j);
        return Math.addExact(jMultiplyExact, this.time.until(interfaceC56349yCbLocalDateTime.toLocalTime(), ycf));
    }

    @Override // o.InterfaceC56349yCb
    public String toString() {
        return toLocalDate().toString() + 'T' + toLocalTime().toString();
    }

    @Override // o.InterfaceC56349yCb
    public LocalTime toLocalTime() {
        return this.time;
    }

    @Override // o.InterfaceC56349yCb
    public yBW toLocalDate() {
        return this.date;
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? ((ChronoField) interfaceC56372yCy).isTimeBased() ? this.time.range(interfaceC56372yCy) : this.date.range(interfaceC56372yCy) : interfaceC56372yCy.rangeRefinedBy(this);
    }

    ChronoLocalDateTimeImpl plusSeconds(long j) {
        return plusWithOverflow(this.date, 0L, 0L, j, 0L);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCb; */
    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56349yCb, o.InterfaceC56367yCt
    public ChronoLocalDateTimeImpl plus(long j, yCF ycf) {
        if (!(ycf instanceof ChronoUnit)) {
            return ensureValid(this.date.getChronology(), ycf.addTo(this, j));
        }
        switch (AnonymousClass4.OLrzqt[((ChronoUnit) ycf).ordinal()]) {
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

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        return chronoField.isDateBased() || chronoField.isTimeBased();
    }

    @Override // o.InterfaceC56349yCb
    public int hashCode() {
        return toLocalDate().hashCode() ^ toLocalTime().hashCode();
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? ((ChronoField) interfaceC56372yCy).isTimeBased() ? this.time.getLong(interfaceC56372yCy) : this.date.getLong(interfaceC56372yCy) : interfaceC56372yCy.getFrom(this);
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? ((ChronoField) interfaceC56372yCy).isTimeBased() ? this.time.get(interfaceC56372yCy) : this.date.get(interfaceC56372yCy) : range(interfaceC56372yCy).checkValidIntValue(getLong(interfaceC56372yCy), interfaceC56372yCy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC56349yCb) && compareTo((InterfaceC56349yCb) obj) == 0;
    }

    @Override // o.InterfaceC56349yCb
    public InterfaceC56353yCf atZone(ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.ofBest(this, zoneId, null);
    }

    private ChronoLocalDateTimeImpl with(InterfaceC56367yCt interfaceC56367yCt, LocalTime localTime) {
        yBW ybw = this.date;
        return (ybw == interfaceC56367yCt && this.time == localTime) ? this : new ChronoLocalDateTimeImpl(ChronoLocalDateImpl.ensureValid(ybw.getChronology(), interfaceC56367yCt), localTime);
    }

    private ChronoLocalDateTimeImpl plusWithOverflow(yBW ybw, long j, long j2, long j3, long j4) {
        LocalTime localTimeOfNanoOfDay;
        yBW ybwPlus;
        if ((j | j2 | j3 | j4) == 0) {
            localTimeOfNanoOfDay = this.time;
            ybwPlus = ybw;
        } else {
            long j5 = j4 / 86400000000000L;
            long j6 = j3 / 86400;
            long j7 = j2 / 1440;
            long j8 = j / 24;
            long nanoOfDay = this.time.toNanoOfDay();
            long j9 = (j4 % 86400000000000L) + ((j3 % 86400) * C.NANOS_PER_SECOND) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L) + nanoOfDay;
            long jFloorDiv = Math.floorDiv(j9, 86400000000000L);
            long jFloorMod = Math.floorMod(j9, 86400000000000L);
            localTimeOfNanoOfDay = jFloorMod == nanoOfDay ? this.time : LocalTime.ofNanoOfDay(jFloorMod);
            ybwPlus = ybw.plus(j5 + j6 + j7 + j8 + jFloorDiv, (yCF) ChronoUnit.DAYS);
        }
        return with(ybwPlus, localTimeOfNanoOfDay);
    }

    private ChronoLocalDateTimeImpl plusNanos(long j) {
        return plusWithOverflow(this.date, 0L, 0L, 0L, j);
    }

    private ChronoLocalDateTimeImpl plusMinutes(long j) {
        return plusWithOverflow(this.date, 0L, j, 0L, 0L);
    }

    private ChronoLocalDateTimeImpl plusHours(long j) {
        return plusWithOverflow(this.date, j, 0L, 0L, 0L);
    }

    private ChronoLocalDateTimeImpl plusDays(long j) {
        return with(this.date.plus(j, (yCF) ChronoUnit.DAYS), this.time);
    }

    public static ChronoLocalDateTimeImpl of(yBW ybw, LocalTime localTime) {
        return new ChronoLocalDateTimeImpl(ybw, localTime);
    }

    /* JADX INFO: renamed from: j$.time.chrono.ChronoLocalDateTimeImpl$4, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            OLrzqt = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static ChronoLocalDateTimeImpl ensureValid(InterfaceC56351yCd interfaceC56351yCd, InterfaceC56367yCt interfaceC56367yCt) {
        ChronoLocalDateTimeImpl chronoLocalDateTimeImpl = (ChronoLocalDateTimeImpl) interfaceC56367yCt;
        if (interfaceC56351yCd.equals(chronoLocalDateTimeImpl.KWHzl())) {
            return chronoLocalDateTimeImpl;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC56351yCd.getId() + ", actual: " + chronoLocalDateTimeImpl.KWHzl().getId());
    }

    private ChronoLocalDateTimeImpl(yBW ybw, LocalTime localTime) {
        Objects.requireNonNull(ybw, "date");
        Objects.requireNonNull(localTime, CrashHianalyticsData.TIME);
        this.date = ybw;
        this.time = localTime;
    }
}
