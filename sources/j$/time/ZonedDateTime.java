package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import j$.time.zone.ZoneOffsetTransition;
import j$.time.zone.ZoneRules;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC56371yCx;
import o.InterfaceC56353yCf;
import o.InterfaceC56365yCr;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56372yCy;
import o.yCF;
import o.yCG;

/* JADX INFO: loaded from: classes13.dex */
public final class ZonedDateTime implements InterfaceC56367yCt, InterfaceC56353yCf<LocalDate>, Serializable {
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
    private final ZoneId zone;

    /* JADX DEBUG: Method merged with bridge method: withZoneSameInstant(Lj$/time/ZoneId;)Lo/yCf; */
    @Override // o.InterfaceC56353yCf
    public ZonedDateTime withZoneSameInstant(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : create(this.dateTime.copydefault(this.offset), this.dateTime.getNano(), zoneId);
    }

    public ZonedDateTime withDayOfMonth(int i) {
        return resolveLocal(this.dateTime.withDayOfMonth(i));
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCf; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public ZonedDateTime with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return (ZonedDateTime) interfaceC56372yCy.adjustInto(this, j);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        int i = AnonymousClass2.copydefault[chronoField.ordinal()];
        return i != 1 ? i != 2 ? resolveLocal(this.dateTime.with(interfaceC56372yCy, j)) : resolveOffset(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))) : create(j, getNano(), this.zone);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCf; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public ZonedDateTime with(InterfaceC56366yCs interfaceC56366yCs) {
        if (interfaceC56366yCs instanceof LocalDate) {
            return resolveLocal(LocalDateTime.of((LocalDate) interfaceC56366yCs, this.dateTime.toLocalTime()));
        }
        if (interfaceC56366yCs instanceof LocalTime) {
            return resolveLocal(LocalDateTime.of(this.dateTime.toLocalDate(), (LocalTime) interfaceC56366yCs));
        }
        if (interfaceC56366yCs instanceof LocalDateTime) {
            return resolveLocal((LocalDateTime) interfaceC56366yCs);
        }
        if (interfaceC56366yCs instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) interfaceC56366yCs;
            return ofLocal(offsetDateTime.toLocalDateTime(), this.zone, offsetDateTime.getOffset());
        }
        if (!(interfaceC56366yCs instanceof Instant)) {
            return interfaceC56366yCs instanceof ZoneOffset ? resolveOffset((ZoneOffset) interfaceC56366yCs) : (ZonedDateTime) interfaceC56366yCs.adjustInto(this);
        }
        Instant instant = (Instant) interfaceC56366yCs;
        return create(instant.getEpochSecond(), instant.getNano(), this.zone);
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        ZonedDateTime zonedDateTimeFrom = from(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            return ycf.between(this, zonedDateTimeFrom);
        }
        ZonedDateTime zonedDateTimeWithZoneSameInstant = zonedDateTimeFrom.withZoneSameInstant(this.zone);
        return ycf.isDateBased() ? this.dateTime.until(zonedDateTimeWithZoneSameInstant.dateTime, ycf) : toOffsetDateTime().until(zonedDateTimeWithZoneSameInstant.toOffsetDateTime(), ycf);
    }

    public String toString() {
        String str = this.dateTime.toString() + this.offset.toString();
        if (this.offset == this.zone) {
            return str;
        }
        return str + AbstractJsonLexerKt.BEGIN_LIST + this.zone.toString() + AbstractJsonLexerKt.END_LIST;
    }

    public OffsetDateTime toOffsetDateTime() {
        return OffsetDateTime.of(this.dateTime, this.offset);
    }

    @Override // o.InterfaceC56353yCf
    public LocalTime toLocalTime() {
        return this.dateTime.toLocalTime();
    }

    /* JADX DEBUG: Method merged with bridge method: toLocalDateTime()Lo/yCb; */
    @Override // o.InterfaceC56353yCf
    public LocalDateTime toLocalDateTime() {
        return this.dateTime;
    }

    /* JADX DEBUG: Method merged with bridge method: toLocalDate()Lo/yBW; */
    @Override // o.InterfaceC56353yCf
    public LocalDate toLocalDate() {
        return this.dateTime.toLocalDate();
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? (interfaceC56372yCy == ChronoField.INSTANT_SECONDS || interfaceC56372yCy == ChronoField.OFFSET_SECONDS) ? interfaceC56372yCy.range() : this.dateTime.range(interfaceC56372yCy) : interfaceC56372yCy.rangeRefinedBy(this);
    }

    @Override // o.InterfaceC56365yCr
    public Object query(yCG ycg) {
        return ycg == AbstractC56371yCx.OLrzqt() ? toLocalDate() : super.query(ycg);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCf; */
    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public ZonedDateTime plus(long j, yCF ycf) {
        return ycf instanceof ChronoUnit ? ycf.isDateBased() ? resolveLocal(this.dateTime.plus(j, ycf)) : resolveInstant(this.dateTime.plus(j, ycf)) : (ZonedDateTime) ycf.addTo(this, j);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCf; */
    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public ZonedDateTime minus(long j, yCF ycf) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, ycf).plus(1L, ycf) : plus(-j, ycf);
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return (interfaceC56372yCy instanceof ChronoField) || (interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this));
    }

    public int hashCode() {
        return (this.dateTime.hashCode() ^ this.offset.hashCode()) ^ Integer.rotateLeft(this.zone.hashCode(), 3);
    }

    @Override // o.InterfaceC56353yCf
    public ZoneId getZone() {
        return this.zone;
    }

    @Override // o.InterfaceC56353yCf
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
        int i = AnonymousClass2.copydefault[((ChronoField) interfaceC56372yCy).ordinal()];
        return i != 1 ? i != 2 ? this.dateTime.getLong(interfaceC56372yCy) : getOffset().getTotalSeconds() : AEQbTJ();
    }

    @Override // o.InterfaceC56365yCr
    public int get(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return super.get(interfaceC56372yCy);
        }
        int i = AnonymousClass2.copydefault[((ChronoField) interfaceC56372yCy).ordinal()];
        if (i != 1) {
            return i != 2 ? this.dateTime.get(interfaceC56372yCy) : getOffset().getTotalSeconds();
        }
        throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.dateTime.equals(zonedDateTime.dateTime) && this.offset.equals(zonedDateTime.offset) && this.zone.equals(zonedDateTime.zone);
    }

    private ZonedDateTime resolveOffset(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.offset) || !this.zone.getRules().isValidOffset(this.dateTime, zoneOffset)) ? this : new ZonedDateTime(this.dateTime, zoneOffset, this.zone);
    }

    private ZonedDateTime resolveLocal(LocalDateTime localDateTime) {
        return ofLocal(localDateTime, this.zone, this.offset);
    }

    private ZonedDateTime resolveInstant(LocalDateTime localDateTime) {
        return ofInstant(localDateTime, this.offset, this.zone);
    }

    public static ZonedDateTime ofLocal(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List validOffsets = rules.getValidOffsets(localDateTime);
        if (validOffsets.size() == 1) {
            zoneOffset = (ZoneOffset) validOffsets.get(0);
        } else if (validOffsets.size() == 0) {
            ZoneOffsetTransition transition = rules.getTransition(localDateTime);
            localDateTime = localDateTime.plusSeconds(transition.getDuration().getSeconds());
            zoneOffset = transition.getOffsetAfter();
        } else if (zoneOffset == null || !validOffsets.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) validOffsets.get(0);
            Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    public static ZonedDateTime ofInstant(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        Objects.requireNonNull(zoneId, "zone");
        return zoneId.getRules().isValidOffset(localDateTime, zoneOffset) ? new ZonedDateTime(localDateTime, zoneOffset, zoneId) : create(localDateTime.copydefault(zoneOffset), localDateTime.getNano(), zoneId);
    }

    public static ZonedDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return create(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return ofLocal(localDateTime, zoneId, null);
    }

    public static ZonedDateTime of(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return of(LocalDateTime.of(localDate, localTime), zoneId);
    }

    public static ZonedDateTime from(InterfaceC56365yCr interfaceC56365yCr) {
        if (interfaceC56365yCr instanceof ZonedDateTime) {
            return (ZonedDateTime) interfaceC56365yCr;
        }
        try {
            ZoneId zoneIdFrom = ZoneId.from(interfaceC56365yCr);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            return interfaceC56365yCr.isSupported(chronoField) ? create(interfaceC56365yCr.getLong(chronoField), interfaceC56365yCr.get(ChronoField.NANO_OF_SECOND), zoneIdFrom) : of(LocalDate.from(interfaceC56365yCr), LocalTime.from(interfaceC56365yCr), zoneIdFrom);
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + interfaceC56365yCr + " of type " + interfaceC56365yCr.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: j$.time.ZonedDateTime$2, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[ChronoField.values().length];
            copydefault = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static ZonedDateTime create(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.ofEpochSecond(j, i));
        return new ZonedDateTime(LocalDateTime.ofEpochSecond(j, i, offset), offset, zoneId);
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.dateTime = localDateTime;
        this.offset = zoneOffset;
        this.zone = zoneId;
    }
}
