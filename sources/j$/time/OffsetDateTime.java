package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.OffsetDateTime;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
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
public final class OffsetDateTime implements InterfaceC56367yCt, InterfaceC56366yCs, Comparable<OffsetDateTime>, Serializable {
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
    public static final OffsetDateTime MIN = LocalDateTime.MIN.atOffset(ZoneOffset.MAX);
    public static final OffsetDateTime MAX = LocalDateTime.MAX.atOffset(ZoneOffset.MIN);

    public OffsetDateTime withOffsetSameInstant(ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.offset)) {
            return this;
        }
        return new OffsetDateTime(this.dateTime.plusSeconds(zoneOffset.getTotalSeconds() - this.offset.getTotalSeconds()), zoneOffset);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public OffsetDateTime with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return (OffsetDateTime) interfaceC56372yCy.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        int i = AnonymousClass4.OLrzqt[chronoField.ordinal()];
        return i != 1 ? i != 2 ? with(this.dateTime.with(interfaceC56372yCy, j), this.offset) : with(this.dateTime, ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))) : ofInstant(Instant.ofEpochSecond(j, getNano()), this.offset);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public OffsetDateTime with(InterfaceC56366yCs interfaceC56366yCs) {
        return ((interfaceC56366yCs instanceof LocalDate) || (interfaceC56366yCs instanceof LocalTime) || (interfaceC56366yCs instanceof LocalDateTime)) ? with(this.dateTime.with(interfaceC56366yCs), this.offset) : interfaceC56366yCs instanceof Instant ? ofInstant((Instant) interfaceC56366yCs, this.offset) : interfaceC56366yCs instanceof ZoneOffset ? with(this.dateTime, (ZoneOffset) interfaceC56366yCs) : interfaceC56366yCs instanceof OffsetDateTime ? (OffsetDateTime) interfaceC56366yCs : (OffsetDateTime) interfaceC56366yCs.adjustInto(this);
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        OffsetDateTime offsetDateTimeFrom = from(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            return ycf.between(this, offsetDateTimeFrom);
        }
        return this.dateTime.until(offsetDateTimeFrom.withOffsetSameInstant(this.offset).dateTime, ycf);
    }

    public String toString() {
        return this.dateTime.toString() + this.offset.toString();
    }

    public LocalTime toLocalTime() {
        return this.dateTime.toLocalTime();
    }

    public LocalDateTime toLocalDateTime() {
        return this.dateTime;
    }

    public LocalDate toLocalDate() {
        return this.dateTime.toLocalDate();
    }

    public Instant toInstant() {
        return this.dateTime.KWHzl(this.offset);
    }

    public long toEpochSecond() {
        return this.dateTime.copydefault(this.offset);
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? (interfaceC56372yCy == ChronoField.INSTANT_SECONDS || interfaceC56372yCy == ChronoField.OFFSET_SECONDS) ? interfaceC56372yCy.range() : this.dateTime.range(interfaceC56372yCy) : interfaceC56372yCy.rangeRefinedBy(this);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        if (ycg == AbstractC56371yCx.copydefault() || ycg == AbstractC56371yCx.gEmmrt()) {
            return getOffset();
        }
        if (ycg == AbstractC56371yCx.djBIcL()) {
            return null;
        }
        return ycg == AbstractC56371yCx.OLrzqt() ? toLocalDate() : ycg == AbstractC56371yCx.KWHzl() ? toLocalTime() : ycg == AbstractC56371yCx.EZpvd() ? IsoChronology.INSTANCE : ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.NANOS : ycg.AEQbTJ(this);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public OffsetDateTime plus(long j, yCF ycf) {
        return ycf instanceof ChronoUnit ? with(this.dateTime.plus(j, ycf), this.offset) : (OffsetDateTime) ycf.addTo(this, j);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public OffsetDateTime minus(long j, yCF ycf) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, ycf).plus(1L, ycf) : plus(-j, ycf);
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return (interfaceC56372yCy instanceof ChronoField) || (interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this));
    }

    public int hashCode() {
        return this.dateTime.hashCode() ^ this.offset.hashCode();
    }

    public ZoneOffset getOffset() {
        return this.offset;
    }

    public int getNano() {
        return this.dateTime.getNano();
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        int i = AnonymousClass4.OLrzqt[((ChronoField) interfaceC56372yCy).ordinal()];
        return i != 1 ? i != 2 ? this.dateTime.getLong(interfaceC56372yCy) : getOffset().getTotalSeconds() : toEpochSecond();
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return super.get(interfaceC56372yCy);
        }
        int i = AnonymousClass4.OLrzqt[((ChronoField) interfaceC56372yCy).ordinal()];
        if (i != 1) {
            return i != 2 ? this.dateTime.get(interfaceC56372yCy) : getOffset().getTotalSeconds();
        }
        throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.dateTime.equals(offsetDateTime.dateTime) && this.offset.equals(offsetDateTime.offset);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(OffsetDateTime offsetDateTime) {
        int iCompareInstant = compareInstant(this, offsetDateTime);
        return iCompareInstant == 0 ? toLocalDateTime().compareTo2((InterfaceC56349yCb) offsetDateTime.toLocalDateTime()) : iCompareInstant;
    }

    @Override // o.InterfaceC56366yCs
    public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return interfaceC56367yCt.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay()).with(ChronoField.OFFSET_SECONDS, getOffset().getTotalSeconds());
    }

    private OffsetDateTime with(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.dateTime == localDateTime && this.offset.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime parse(CharSequence charSequence, C56350yCc c56350yCc) {
        Objects.requireNonNull(c56350yCc, "formatter");
        return (OffsetDateTime) c56350yCc.AEQbTJ(charSequence, new yCG() { // from class: o.yBZ
            @Override // o.yCG
            public final java.lang.Object AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
                return OffsetDateTime.from(interfaceC56365yCr);
            }
        });
    }

    public static OffsetDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset), offset);
    }

    public static OffsetDateTime of(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime of(LocalDate localDate, LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(LocalDateTime.of(localDate, localTime), zoneOffset);
    }

    public static OffsetDateTime from(InterfaceC56365yCr interfaceC56365yCr) {
        if (interfaceC56365yCr instanceof OffsetDateTime) {
            return (OffsetDateTime) interfaceC56365yCr;
        }
        try {
            ZoneOffset zoneOffsetFrom = ZoneOffset.from(interfaceC56365yCr);
            LocalDate localDate = (LocalDate) interfaceC56365yCr.query(AbstractC56371yCx.OLrzqt());
            LocalTime localTime = (LocalTime) interfaceC56365yCr.query(AbstractC56371yCx.KWHzl());
            return (localDate == null || localTime == null) ? ofInstant(Instant.from(interfaceC56365yCr), zoneOffsetFrom) : of(localDate, localTime, zoneOffsetFrom);
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + interfaceC56365yCr + " of type " + interfaceC56365yCr.getClass().getName(), e);
        }
    }

    private static int compareInstant(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        if (offsetDateTime.getOffset().equals(offsetDateTime2.getOffset())) {
            return offsetDateTime.toLocalDateTime().compareTo2((InterfaceC56349yCb) offsetDateTime2.toLocalDateTime());
        }
        int iCompare = Long.compare(offsetDateTime.toEpochSecond(), offsetDateTime2.toEpochSecond());
        return iCompare == 0 ? offsetDateTime.toLocalTime().getNano() - offsetDateTime2.toLocalTime().getNano() : iCompare;
    }

    /* JADX INFO: renamed from: j$.time.OffsetDateTime$4, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[ChronoField.values().length];
            OLrzqt = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.dateTime = localDateTime;
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        this.offset = zoneOffset;
    }
}
