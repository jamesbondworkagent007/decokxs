package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import j$.time.OffsetTime;
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

/* JADX INFO: loaded from: classes17.dex */
public final class OffsetTime implements InterfaceC56367yCt, InterfaceC56366yCs, Comparable<OffsetTime>, Serializable {
    private final ZoneOffset offset;
    private final LocalTime time;
    public static final OffsetTime MIN = LocalTime.MIN.atOffset(ZoneOffset.MAX);
    public static final OffsetTime MAX = LocalTime.MAX.atOffset(ZoneOffset.MIN);

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public OffsetTime with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.OFFSET_SECONDS ? with(this.time, ZoneOffset.ofTotalSeconds(((ChronoField) interfaceC56372yCy).checkValidIntValue(j))) : with(this.time.with(interfaceC56372yCy, j), this.offset) : (OffsetTime) interfaceC56372yCy.adjustInto(this, j);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public OffsetTime with(InterfaceC56366yCs interfaceC56366yCs) {
        return interfaceC56366yCs instanceof LocalTime ? with((LocalTime) interfaceC56366yCs, this.offset) : interfaceC56366yCs instanceof ZoneOffset ? with(this.time, (ZoneOffset) interfaceC56366yCs) : interfaceC56366yCs instanceof OffsetTime ? (OffsetTime) interfaceC56366yCs : (OffsetTime) interfaceC56366yCs.adjustInto(this);
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        long j;
        OffsetTime offsetTimeFrom = from(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            return ycf.between(this, offsetTimeFrom);
        }
        long epochNano = offsetTimeFrom.toEpochNano() - toEpochNano();
        switch (AnonymousClass5.KWHzl[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return epochNano;
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
        return epochNano / j;
    }

    public String toString() {
        return this.time.toString() + this.offset.toString();
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.OFFSET_SECONDS ? interfaceC56372yCy.range() : this.time.range(interfaceC56372yCy) : interfaceC56372yCy.rangeRefinedBy(this);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        if (ycg == AbstractC56371yCx.copydefault() || ycg == AbstractC56371yCx.gEmmrt()) {
            return this.offset;
        }
        if (((ycg == AbstractC56371yCx.djBIcL()) || (ycg == AbstractC56371yCx.EZpvd())) || ycg == AbstractC56371yCx.OLrzqt()) {
            return null;
        }
        return ycg == AbstractC56371yCx.KWHzl() ? this.time : ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.NANOS : ycg.AEQbTJ(this);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public OffsetTime plus(long j, yCF ycf) {
        return ycf instanceof ChronoUnit ? with(this.time.plus(j, ycf), this.offset) : (OffsetTime) ycf.addTo(this, j);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public OffsetTime minus(long j, yCF ycf) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, ycf).plus(1L, ycf) : plus(-j, ycf);
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy.isTimeBased() || interfaceC56372yCy == ChronoField.OFFSET_SECONDS : interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
    }

    public int hashCode() {
        return this.time.hashCode() ^ this.offset.hashCode();
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.OFFSET_SECONDS ? this.offset.getTotalSeconds() : this.time.getLong(interfaceC56372yCy) : interfaceC56372yCy.getFrom(this);
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        return super.get(interfaceC56372yCy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetTime)) {
            return false;
        }
        OffsetTime offsetTime = (OffsetTime) obj;
        return this.time.equals(offsetTime.time) && this.offset.equals(offsetTime.offset);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(OffsetTime offsetTime) {
        int iCompare;
        return (this.offset.equals(offsetTime.offset) || (iCompare = Long.compare(toEpochNano(), offsetTime.toEpochNano())) == 0) ? this.time.compareTo(offsetTime.time) : iCompare;
    }

    @Override // o.InterfaceC56366yCs
    public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return interfaceC56367yCt.with(ChronoField.NANO_OF_DAY, this.time.toNanoOfDay()).with(ChronoField.OFFSET_SECONDS, this.offset.getTotalSeconds());
    }

    private OffsetTime with(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.time == localTime && this.offset.equals(zoneOffset)) ? this : new OffsetTime(localTime, zoneOffset);
    }

    private long toEpochNano() {
        return this.time.toNanoOfDay() - (((long) this.offset.getTotalSeconds()) * C.NANOS_PER_SECOND);
    }

    public static OffsetTime parse(CharSequence charSequence, C56350yCc c56350yCc) {
        Objects.requireNonNull(c56350yCc, "formatter");
        return (OffsetTime) c56350yCc.AEQbTJ(charSequence, new yCG() { // from class: o.yCa
            @Override // o.yCG
            public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
                return OffsetTime.from(interfaceC56365yCr);
            }
        });
    }

    public static OffsetTime of(LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetTime(localTime, zoneOffset);
    }

    public static OffsetTime from(InterfaceC56365yCr interfaceC56365yCr) {
        if (interfaceC56365yCr instanceof OffsetTime) {
            return (OffsetTime) interfaceC56365yCr;
        }
        try {
            return new OffsetTime(LocalTime.from(interfaceC56365yCr), ZoneOffset.from(interfaceC56365yCr));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + interfaceC56365yCr + " of type " + interfaceC56365yCr.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: j$.time.OffsetTime$5, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass5 {
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

    private OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, CrashHianalyticsData.TIME);
        this.time = localTime;
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        this.offset = zoneOffset;
    }
}
