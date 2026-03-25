package j$.time;

import com.google.android.exoplayer2.C;
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
import o.yCF;
import o.yCG;

/* JADX INFO: loaded from: classes13.dex */
public final class Instant implements InterfaceC56367yCt, InterfaceC56366yCs, Comparable<Instant>, Serializable {
    private final int nanos;
    private final long seconds;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public Instant with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return (Instant) interfaceC56372yCy.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        chronoField.checkValidValue(j);
        int i = AnonymousClass2.AEQbTJ[chronoField.ordinal()];
        if (i == 1) {
            return j != ((long) this.nanos) ? create(this.seconds, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.nanos ? create(this.seconds, i2) : this;
        }
        if (i == 3) {
            int i3 = ((int) j) * 1000000;
            return i3 != this.nanos ? create(this.seconds, i3) : this;
        }
        if (i == 4) {
            return j != this.seconds ? create(j, this.nanos) : this;
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public Instant with(InterfaceC56366yCs interfaceC56366yCs) {
        return (Instant) interfaceC56366yCs.adjustInto(this);
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        Instant instantFrom = from(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            return ycf.between(this, instantFrom);
        }
        switch (AnonymousClass2.OLrzqt[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return nanosUntil(instantFrom);
            case 2:
                return nanosUntil(instantFrom) / 1000;
            case 3:
                return Math.subtractExact(instantFrom.toEpochMilli(), toEpochMilli());
            case 4:
                return secondsUntil(instantFrom);
            case 5:
                return secondsUntil(instantFrom) / 60;
            case 6:
                return secondsUntil(instantFrom) / 3600;
            case 7:
                return secondsUntil(instantFrom) / 43200;
            case 8:
                return secondsUntil(instantFrom) / 86400;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
        }
    }

    public Instant truncatedTo(yCF ycf) {
        if (ycf == ChronoUnit.NANOS) {
            return this;
        }
        Duration duration = ycf.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new UnsupportedTemporalTypeException("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (86400000000000L % nanos != 0) {
            throw new UnsupportedTemporalTypeException("Unit must divide into a standard day without remainder");
        }
        long j = ((this.seconds % 86400) * C.NANOS_PER_SECOND) + ((long) this.nanos);
        return plusNanos(((j / nanos) * nanos) - j);
    }

    public String toString() {
        return C56350yCc.AEQbTJ.OLrzqt(this);
    }

    public long toEpochMilli() {
        long jMultiplyExact;
        int i;
        long j = this.seconds;
        if (j >= 0 || this.nanos <= 0) {
            jMultiplyExact = Math.multiplyExact(j, 1000L);
            i = this.nanos / 1000000;
        } else {
            jMultiplyExact = Math.multiplyExact(j + 1, 1000L);
            i = (this.nanos / 1000000) - 1000;
        }
        return Math.addExact(jMultiplyExact, i);
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return super.range(interfaceC56372yCy);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        if (ycg == AbstractC56371yCx.AEQbTJ()) {
            return ChronoUnit.NANOS;
        }
        if (ycg == AbstractC56371yCx.EZpvd() || ycg == AbstractC56371yCx.djBIcL() || ycg == AbstractC56371yCx.gEmmrt() || ycg == AbstractC56371yCx.copydefault() || ycg == AbstractC56371yCx.OLrzqt() || ycg == AbstractC56371yCx.KWHzl()) {
            return null;
        }
        return ycg.AEQbTJ(this);
    }

    public Instant plusSeconds(long j) {
        return plus(j, 0L);
    }

    public Instant plusNanos(long j) {
        return plus(0L, j);
    }

    public Instant plusMillis(long j) {
        return plus(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plus(InterfaceC56369yCv interfaceC56369yCv) {
        return (Instant) interfaceC56369yCv.addTo(this);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public Instant plus(long j, yCF ycf) {
        if (!(ycf instanceof ChronoUnit)) {
            return (Instant) ycf.addTo(this, j);
        }
        switch (AnonymousClass2.OLrzqt[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return plus(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(Math.multiplyExact(j, 60L));
            case 6:
                return plusSeconds(Math.multiplyExact(j, 3600L));
            case 7:
                return plusSeconds(Math.multiplyExact(j, 43200L));
            case 8:
                return plusSeconds(Math.multiplyExact(j, 86400L));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
        }
    }

    public Instant minus(InterfaceC56369yCv interfaceC56369yCv) {
        return (Instant) interfaceC56369yCv.subtractFrom(this);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public Instant minus(long j, yCF ycf) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, ycf).plus(1L, ycf) : plus(-j, ycf);
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy == ChronoField.INSTANT_SECONDS || interfaceC56372yCy == ChronoField.NANO_OF_SECOND || interfaceC56372yCy == ChronoField.MICRO_OF_SECOND || interfaceC56372yCy == ChronoField.MILLI_OF_SECOND : interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public int getNano() {
        return this.nanos;
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        int i;
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        int i2 = AnonymousClass2.AEQbTJ[((ChronoField) interfaceC56372yCy).ordinal()];
        if (i2 == 1) {
            i = this.nanos;
        } else if (i2 == 2) {
            i = this.nanos / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.seconds;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
            }
            i = this.nanos / 1000000;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.seconds;
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return range(interfaceC56372yCy).checkValidIntValue(interfaceC56372yCy.getFrom(this), interfaceC56372yCy);
        }
        int i = AnonymousClass2.AEQbTJ[((ChronoField) interfaceC56372yCy).ordinal()];
        if (i == 1) {
            return this.nanos;
        }
        if (i == 2) {
            return this.nanos / 1000;
        }
        if (i == 3) {
            return this.nanos / 1000000;
        }
        if (i == 4) {
            ChronoField.INSTANT_SECONDS.checkValidIntValue(this.seconds);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.seconds == instant.seconds && this.nanos == instant.nanos;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.seconds, instant.seconds);
        return iCompare != 0 ? iCompare : this.nanos - instant.nanos;
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.ofInstant(this, zoneId);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.ofInstant(this, zoneOffset);
    }

    @Override // o.InterfaceC56366yCs
    public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return interfaceC56367yCt.with(ChronoField.INSTANT_SECONDS, this.seconds).with(ChronoField.NANO_OF_SECOND, this.nanos);
    }

    private long secondsUntil(Instant instant) {
        long jSubtractExact = Math.subtractExact(instant.seconds, this.seconds);
        long j = instant.nanos - this.nanos;
        return (jSubtractExact <= 0 || j >= 0) ? (jSubtractExact >= 0 || j <= 0) ? jSubtractExact : jSubtractExact + 1 : jSubtractExact - 1;
    }

    private Instant plus(long j, long j2) {
        return (j | j2) == 0 ? this : ofEpochSecond(Math.addExact(Math.addExact(this.seconds, j), j2 / C.NANOS_PER_SECOND), ((long) this.nanos) + (j2 % C.NANOS_PER_SECOND));
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return create(Math.addExact(j, Math.floorDiv(j2, C.NANOS_PER_SECOND)), (int) Math.floorMod(j2, C.NANOS_PER_SECOND));
    }

    public static Instant ofEpochSecond(long j) {
        return create(j, 0);
    }

    public static Instant ofEpochMilli(long j) {
        return create(Math.floorDiv(j, 1000L), ((int) Math.floorMod(j, 1000L)) * 1000000);
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    private long nanosUntil(Instant instant) {
        return Math.addExact(Math.multiplyExact(Math.subtractExact(instant.seconds, this.seconds), C.NANOS_PER_SECOND), instant.nanos - this.nanos);
    }

    public static Instant from(InterfaceC56365yCr interfaceC56365yCr) {
        if (interfaceC56365yCr instanceof Instant) {
            return (Instant) interfaceC56365yCr;
        }
        Objects.requireNonNull(interfaceC56365yCr, "temporal");
        try {
            return ofEpochSecond(interfaceC56365yCr.getLong(ChronoField.INSTANT_SECONDS), interfaceC56365yCr.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + interfaceC56365yCr + " of type " + interfaceC56365yCr.getClass().getName(), e);
        }
    }

    private static Instant create(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    /* JADX INFO: renamed from: j$.time.Instant$2, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AEQbTJ;
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
            try {
                OLrzqt[ChronoUnit.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            AEQbTJ = iArr2;
            try {
                iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AEQbTJ[ChronoField.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AEQbTJ[ChronoField.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AEQbTJ[ChronoField.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private Instant(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }
}
