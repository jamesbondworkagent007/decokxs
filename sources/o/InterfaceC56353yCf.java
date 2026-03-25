package o;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoZonedDateTimeImpl;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import o.yBW;

/* JADX INFO: renamed from: o.yCf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56353yCf<D extends yBW> extends InterfaceC56367yCt, java.lang.Comparable<InterfaceC56353yCf<?>> {
    ZoneOffset getOffset();

    ZoneId getZone();

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    InterfaceC56353yCf plus(long j, yCF ycf);

    InterfaceC56349yCb toLocalDateTime();

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    InterfaceC56353yCf with(InterfaceC56372yCy interfaceC56372yCy, long j);

    InterfaceC56353yCf withZoneSameInstant(ZoneId zoneId);

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    default InterfaceC56353yCf with(InterfaceC56366yCs interfaceC56366yCs) {
        return ChronoZonedDateTimeImpl.ensureValid(copydefault(), super.with(interfaceC56366yCs));
    }

    default LocalTime toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }

    default yBW toLocalDate() {
        return toLocalDateTime().toLocalDate();
    }

    default Instant OLrzqt() {
        return Instant.ofEpochSecond(AEQbTJ(), toLocalTime().getNano());
    }

    default long AEQbTJ() {
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) getOffset().getTotalSeconds());
    }

    @Override // o.InterfaceC56365yCr
    default ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? (interfaceC56372yCy == ChronoField.INSTANT_SECONDS || interfaceC56372yCy == ChronoField.OFFSET_SECONDS) ? interfaceC56372yCy.range() : toLocalDateTime().range(interfaceC56372yCy) : interfaceC56372yCy.rangeRefinedBy(this);
    }

    @Override // o.InterfaceC56365yCr
    default java.lang.Object query(yCG ycg) {
        return (ycg == AbstractC56371yCx.gEmmrt() || ycg == AbstractC56371yCx.djBIcL()) ? getZone() : ycg == AbstractC56371yCx.copydefault() ? getOffset() : ycg == AbstractC56371yCx.KWHzl() ? toLocalTime() : ycg == AbstractC56371yCx.EZpvd() ? copydefault() : ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.NANOS : ycg.AEQbTJ(this);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    default InterfaceC56353yCf minus(long j, yCF ycf) {
        return ChronoZonedDateTimeImpl.ensureValid(copydefault(), super.minus(j, ycf));
    }

    @Override // o.InterfaceC56365yCr
    default long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        int i = AnonymousClass5.AEQbTJ[((ChronoField) interfaceC56372yCy).ordinal()];
        return i != 1 ? i != 2 ? toLocalDateTime().getLong(interfaceC56372yCy) : getOffset().getTotalSeconds() : AEQbTJ();
    }

    default InterfaceC56351yCd copydefault() {
        return toLocalDate().getChronology();
    }

    @Override // o.InterfaceC56365yCr
    default int get(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return super.get(interfaceC56372yCy);
        }
        int i = AnonymousClass5.AEQbTJ[((ChronoField) interfaceC56372yCy).ordinal()];
        if (i != 1) {
            return i != 2 ? toLocalDateTime().get(interfaceC56372yCy) : getOffset().getTotalSeconds();
        }
        throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* JADX INFO: renamed from: o.yCf$5, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[ChronoField.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    default int compareTo(InterfaceC56353yCf interfaceC56353yCf) {
        int iCompare = java.lang.Long.compare(AEQbTJ(), interfaceC56353yCf.AEQbTJ());
        if (iCompare != 0) {
            return iCompare;
        }
        int nano = toLocalTime().getNano() - interfaceC56353yCf.toLocalTime().getNano();
        if (nano != 0) {
            return nano;
        }
        int iCompareTo = toLocalDateTime().compareTo(interfaceC56353yCf.toLocalDateTime());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getZone().getId().compareTo(interfaceC56353yCf.getZone().getId());
        return iCompareTo2 == 0 ? copydefault().compareTo(interfaceC56353yCf.copydefault()) : iCompareTo2;
    }
}
