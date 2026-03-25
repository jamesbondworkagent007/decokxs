package j$.time.chrono;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.zone.ZoneOffsetTransition;
import j$.time.zone.ZoneRules;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC56349yCb;
import o.InterfaceC56351yCd;
import o.InterfaceC56353yCf;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56372yCy;
import o.yCF;

/* JADX INFO: loaded from: classes13.dex */
public final class ChronoZonedDateTimeImpl implements InterfaceC56353yCf, Serializable {
    private final transient ChronoLocalDateTimeImpl dateTime;
    private final transient ZoneOffset offset;
    private final transient ZoneId zone;

    @Override // o.InterfaceC56353yCf
    public InterfaceC56353yCf withZoneSameInstant(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : create(this.dateTime.KWHzl(this.offset), zoneId);
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56353yCf, o.InterfaceC56367yCt
    public InterfaceC56353yCf with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return ensureValid(copydefault(), interfaceC56372yCy.adjustInto(this, j));
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        int i = AnonymousClass5.OLrzqt[chronoField.ordinal()];
        if (i == 1) {
            return plus(j - AEQbTJ(), (yCF) ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return ofBest(this.dateTime.with(interfaceC56372yCy, j), this.zone, this.offset);
        }
        return create(this.dateTime.KWHzl(ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))), this.zone);
    }

    @Override // o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        Objects.requireNonNull(interfaceC56367yCt, "endExclusive");
        InterfaceC56353yCf interfaceC56353yCfZonedDateTime = copydefault().zonedDateTime(interfaceC56367yCt);
        if (ycf instanceof ChronoUnit) {
            return this.dateTime.until(interfaceC56353yCfZonedDateTime.withZoneSameInstant(this.offset).toLocalDateTime(), ycf);
        }
        Objects.requireNonNull(ycf, "unit");
        return ycf.between(this, interfaceC56353yCfZonedDateTime);
    }

    public String toString() {
        String str = toLocalDateTime().toString() + getOffset().toString();
        if (getOffset() == getZone()) {
            return str;
        }
        return str + AbstractJsonLexerKt.BEGIN_LIST + getZone().toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // o.InterfaceC56353yCf
    public InterfaceC56349yCb toLocalDateTime() {
        return this.dateTime;
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56353yCf, o.InterfaceC56367yCt
    public InterfaceC56353yCf plus(long j, yCF ycf) {
        return ycf instanceof ChronoUnit ? with((InterfaceC56366yCs) this.dateTime.plus(j, ycf)) : ensureValid(copydefault(), ycf.addTo(this, j));
    }

    @Override // o.InterfaceC56365yCr
    public boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return (interfaceC56372yCy instanceof ChronoField) || (interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this));
    }

    public int hashCode() {
        return (toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    @Override // o.InterfaceC56353yCf
    public ZoneId getZone() {
        return this.zone;
    }

    @Override // o.InterfaceC56353yCf
    public ZoneOffset getOffset() {
        return this.offset;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC56353yCf) && compareTo((InterfaceC56353yCf) obj) == 0;
    }

    public static ChronoZonedDateTimeImpl ofInstant(InterfaceC56351yCd interfaceC56351yCd, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, TypedValues.CycleType.S_WAVE_OFFSET);
        return new ChronoZonedDateTimeImpl((ChronoLocalDateTimeImpl) interfaceC56351yCd.localDateTime(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset)), offset, zoneId);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC56353yCf ofBest(ChronoLocalDateTimeImpl chronoLocalDateTimeImpl, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(chronoLocalDateTimeImpl, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeFrom = LocalDateTime.from(chronoLocalDateTimeImpl);
        List validOffsets = rules.getValidOffsets(localDateTimeFrom);
        if (validOffsets.size() != 1) {
            if (validOffsets.size() == 0) {
                ZoneOffsetTransition transition = rules.getTransition(localDateTimeFrom);
                chronoLocalDateTimeImpl = chronoLocalDateTimeImpl.plusSeconds(transition.getDuration().getSeconds());
                zoneOffset = transition.getOffsetAfter();
            } else if (zoneOffset == null || !validOffsets.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) validOffsets.get(0);
            }
        }
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, zoneOffset, zoneId);
    }

    public static ChronoZonedDateTimeImpl ensureValid(InterfaceC56351yCd interfaceC56351yCd, InterfaceC56367yCt interfaceC56367yCt) {
        ChronoZonedDateTimeImpl chronoZonedDateTimeImpl = (ChronoZonedDateTimeImpl) interfaceC56367yCt;
        if (interfaceC56351yCd.equals(chronoZonedDateTimeImpl.copydefault())) {
            return chronoZonedDateTimeImpl;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC56351yCd.getId() + ", actual: " + chronoZonedDateTimeImpl.copydefault().getId());
    }

    /* JADX INFO: renamed from: j$.time.chrono.ChronoZonedDateTimeImpl$5, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass5 {
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

    private ChronoZonedDateTimeImpl create(Instant instant, ZoneId zoneId) {
        return ofInstant(copydefault(), instant, zoneId);
    }

    private ChronoZonedDateTimeImpl(ChronoLocalDateTimeImpl chronoLocalDateTimeImpl, ZoneOffset zoneOffset, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTimeImpl, "dateTime");
        this.dateTime = chronoLocalDateTimeImpl;
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        this.offset = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.zone = zoneId;
    }
}
