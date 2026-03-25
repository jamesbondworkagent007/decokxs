package j$.time;

import androidx.compose.material3.CalendarModelKt;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import j$.time.LocalTime;
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
import o.InterfaceC56372yCy;
import o.yCF;
import o.yCG;

/* JADX INFO: loaded from: classes13.dex */
public final class LocalTime implements InterfaceC56367yCt, InterfaceC56366yCs, Comparable<LocalTime>, Serializable {
    private static final LocalTime[] HOURS = new LocalTime[24];
    public static final LocalTime MAX;
    public static final LocalTime MIDNIGHT;
    public static final LocalTime MIN;
    public static final LocalTime NOON;
    private final byte hour;
    private final byte minute;
    private final int nano;
    private final byte second;

    public LocalTime withSecond(int i) {
        if (this.second == i) {
            return this;
        }
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i);
        return create(this.hour, this.minute, i, this.nano);
    }

    public LocalTime withNano(int i) {
        if (this.nano == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.checkValidValue(i);
        return create(this.hour, this.minute, this.second, i);
    }

    public LocalTime withMinute(int i) {
        if (this.minute == i) {
            return this;
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i);
        return create(this.hour, i, this.second, this.nano);
    }

    public LocalTime withHour(int i) {
        if (this.hour == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        return create(i, this.minute, this.second, this.nano);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalTime with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return (LocalTime) interfaceC56372yCy.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        chronoField.checkValidValue(j);
        switch (AnonymousClass3.EZpvd[chronoField.ordinal()]) {
            case 1:
                return withNano((int) j);
            case 2:
                return ofNanoOfDay(j);
            case 3:
                return withNano(((int) j) * 1000);
            case 4:
                return ofNanoOfDay(j * 1000);
            case 5:
                return withNano(((int) j) * 1000000);
            case 6:
                return ofNanoOfDay(j * 1000000);
            case 7:
                return withSecond((int) j);
            case 8:
                return plusSeconds(j - ((long) toSecondOfDay()));
            case 9:
                return withMinute((int) j);
            case 10:
                return plusMinutes(j - ((long) ((this.hour * 60) + this.minute)));
            case 11:
                return plusHours(j - ((long) (this.hour % Ascii.FF)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return plusHours(j - ((long) (this.hour % Ascii.FF)));
            case 13:
                return withHour((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return withHour((int) j);
            case 15:
                return plusHours((j - ((long) (this.hour / Ascii.FF))) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalTime with(InterfaceC56366yCs interfaceC56366yCs) {
        return interfaceC56366yCs instanceof LocalTime ? (LocalTime) interfaceC56366yCs : (LocalTime) interfaceC56366yCs.adjustInto(this);
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        long j;
        LocalTime localTimeFrom = from(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            return ycf.between(this, localTimeFrom);
        }
        long nanoOfDay = localTimeFrom.toNanoOfDay() - toNanoOfDay();
        switch (AnonymousClass3.KWHzl[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return nanoOfDay;
            case 2:
                j = 1000;
                break;
            case 3:
                j = 1000000;
                break;
            case 4:
                j = C.NANOS_PER_SECOND;
                break;
            case 5:
                j = 60000000000L;
                break;
            case 6:
                j = 3600000000000L;
                break;
            case 7:
                j = 43200000000000L;
                break;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
        }
        return nanoOfDay / j;
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.hour;
        byte b2 = this.minute;
        byte b3 = this.second;
        int i2 = this.nano;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i2 > 0) {
            sb.append(b3 >= 10 ? ":" : ":0");
            sb.append((int) b3);
            if (i2 > 0) {
                sb.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }

    public int toSecondOfDay() {
        return (this.hour * 3600) + (this.minute * 60) + this.second;
    }

    public long toNanoOfDay() {
        return (((long) this.hour) * 3600000000000L) + (((long) this.minute) * 60000000000L) + (((long) this.second) * C.NANOS_PER_SECOND) + ((long) this.nano);
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return super.range(interfaceC56372yCy);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        if (ycg == AbstractC56371yCx.EZpvd() || ycg == AbstractC56371yCx.djBIcL() || ycg == AbstractC56371yCx.gEmmrt() || ycg == AbstractC56371yCx.copydefault()) {
            return null;
        }
        if (ycg == AbstractC56371yCx.KWHzl()) {
            return this;
        }
        if (ycg == AbstractC56371yCx.OLrzqt()) {
            return null;
        }
        return ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.NANOS : ycg.AEQbTJ(this);
    }

    public LocalTime plusSeconds(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 3600) + (this.minute * 60) + this.second;
        int i2 = ((((int) (j % 86400)) + i) + RemoteMessageConst.DEFAULT_TTL) % RemoteMessageConst.DEFAULT_TTL;
        return i == i2 ? this : create(i2 / IMarketApiService.SIXTY_MINUTES, (i2 / 60) % 60, i2 % 60, this.nano);
    }

    public LocalTime plusNanos(long j) {
        if (j == 0) {
            return this;
        }
        long nanoOfDay = toNanoOfDay();
        long j2 = (((j % 86400000000000L) + nanoOfDay) + 86400000000000L) % 86400000000000L;
        return nanoOfDay == j2 ? this : create((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / C.NANOS_PER_SECOND) % 60), (int) (j2 % C.NANOS_PER_SECOND));
    }

    public LocalTime plusMinutes(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 60) + this.minute;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : create(i2 / 60, i2 % 60, this.second, this.nano);
    }

    public LocalTime plusHours(long j) {
        return j == 0 ? this : create(((((int) (j % 24)) + this.hour) + 24) % 24, this.minute, this.second, this.nano);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalTime plus(long j, yCF ycf) {
        if (!(ycf instanceof ChronoUnit)) {
            return (LocalTime) ycf.addTo(this, j);
        }
        switch (AnonymousClass3.KWHzl[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return plusNanos((j % 86400000000L) * 1000);
            case 3:
                return plusNanos((j % CalendarModelKt.MillisecondsIn24Hours) * 1000000);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusMinutes(j);
            case 6:
                return plusHours(j);
            case 7:
                return plusHours((j % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public LocalTime minus(long j, yCF ycf) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, ycf).plus(1L, ycf) : plus(-j, ycf);
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy.isTimeBased() : interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
    }

    public boolean isBefore(LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    public boolean isAfter(LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public int hashCode() {
        long nanoOfDay = toNanoOfDay();
        return (int) (nanoOfDay ^ (nanoOfDay >>> 32));
    }

    public int getSecond() {
        return this.second;
    }

    public int getNano() {
        return this.nano;
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.NANO_OF_DAY ? toNanoOfDay() : interfaceC56372yCy == ChronoField.MICRO_OF_DAY ? toNanoOfDay() / 1000 : get0(interfaceC56372yCy) : interfaceC56372yCy.getFrom(this);
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? get0(interfaceC56372yCy) : super.get(interfaceC56372yCy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        return this.hour == localTime.hour && this.minute == localTime.minute && this.second == localTime.second && this.nano == localTime.nano;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.hour, localTime.hour);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.minute, localTime.minute);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.second, localTime.second);
        return iCompare3 == 0 ? Integer.compare(this.nano, localTime.nano) : iCompare3;
    }

    public OffsetTime atOffset(ZoneOffset zoneOffset) {
        return OffsetTime.of(this, zoneOffset);
    }

    @Override // o.InterfaceC56366yCs
    public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return interfaceC56367yCt.with(ChronoField.NANO_OF_DAY, toNanoOfDay());
    }

    public static LocalTime parse(CharSequence charSequence, C56350yCc c56350yCc) {
        Objects.requireNonNull(c56350yCc, "formatter");
        return (LocalTime) c56350yCc.AEQbTJ(charSequence, new yCG() { // from class: o.yBV
            @Override // o.yCG
            public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
                return LocalTime.from(interfaceC56365yCr);
            }
        });
    }

    public static LocalTime ofNanoOfDay(long j) {
        ChronoField.NANO_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / C.NANOS_PER_SECOND);
        return create(i, i2, i3, (int) (j3 - (((long) i3) * C.NANOS_PER_SECOND)));
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        ChronoField.SECOND_OF_MINUTE.checkValidValue(i3);
        ChronoField.NANO_OF_SECOND.checkValidValue(i4);
        return create(i, i2, i3, i4);
    }

    public static LocalTime of(int i, int i2) {
        ChronoField.HOUR_OF_DAY.checkValidValue(i);
        if (i2 == 0) {
            return HOURS[i];
        }
        ChronoField.MINUTE_OF_HOUR.checkValidValue(i2);
        return new LocalTime(i, i2, 0, 0);
    }

    private int get0(InterfaceC56372yCy interfaceC56372yCy) {
        switch (AnonymousClass3.EZpvd[((ChronoField) interfaceC56372yCy).ordinal()]) {
            case 1:
                return this.nano;
            case 2:
                throw new UnsupportedTemporalTypeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.nano / 1000;
            case 4:
                throw new UnsupportedTemporalTypeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.nano / 1000000;
            case 6:
                return (int) (toNanoOfDay() / 1000000);
            case 7:
                return this.second;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.minute;
            case 10:
                return (this.hour * 60) + this.minute;
            case 11:
                return this.hour % Ascii.FF;
            case 12:
                int i = this.hour % Ascii.FF;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.hour;
            case 14:
                byte b = this.hour;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.hour / Ascii.FF;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
    }

    public static LocalTime from(InterfaceC56365yCr interfaceC56365yCr) {
        Objects.requireNonNull(interfaceC56365yCr, "temporal");
        LocalTime localTime = (LocalTime) interfaceC56365yCr.query(AbstractC56371yCx.KWHzl());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC56365yCr + " of type " + interfaceC56365yCr.getClass().getName());
    }

    private static LocalTime create(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? HOURS[i] : new LocalTime(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: j$.time.LocalTime$3, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] EZpvd;
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
            int[] iArr2 = new int[ChronoField.values().length];
            EZpvd = iArr2;
            try {
                iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                EZpvd[ChronoField.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                EZpvd[ChronoField.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                EZpvd[ChronoField.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                EZpvd[ChronoField.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                EZpvd[ChronoField.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                EZpvd[ChronoField.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                EZpvd[ChronoField.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                EZpvd[ChronoField.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                EZpvd[ChronoField.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                EZpvd[ChronoField.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                EZpvd[ChronoField.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                EZpvd[ChronoField.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                EZpvd[ChronoField.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                EZpvd[ChronoField.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.hour = (byte) i;
        this.minute = (byte) i2;
        this.second = (byte) i3;
        this.nano = i4;
    }

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = HOURS;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                MIDNIGHT = localTime;
                NOON = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }
}
