package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDateTimeImpl;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.util.Objects;
import o.yBW;

/* JADX INFO: renamed from: o.yCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56349yCb<D extends yBW> extends InterfaceC56367yCt, InterfaceC56366yCs, java.lang.Comparable<InterfaceC56349yCb<?>> {
    InterfaceC56353yCf atZone(ZoneId zoneId);

    int hashCode();

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    InterfaceC56349yCb plus(long j, yCF ycf);

    yBW toLocalDate();

    LocalTime toLocalTime();

    java.lang.String toString();

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    InterfaceC56349yCb with(InterfaceC56372yCy interfaceC56372yCy, long j);

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    default InterfaceC56349yCb with(InterfaceC56366yCs interfaceC56366yCs) {
        return ChronoLocalDateTimeImpl.ensureValid(KWHzl(), super.with(interfaceC56366yCs));
    }

    default Instant KWHzl(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(copydefault(zoneOffset), toLocalTime().getNano());
    }

    default long copydefault(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    @Override // o.InterfaceC56365yCr
    default java.lang.Object query(yCG ycg) {
        if (ycg == AbstractC56371yCx.djBIcL() || ycg == AbstractC56371yCx.gEmmrt() || ycg == AbstractC56371yCx.copydefault()) {
            return null;
        }
        return ycg == AbstractC56371yCx.KWHzl() ? toLocalTime() : ycg == AbstractC56371yCx.EZpvd() ? KWHzl() : ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.NANOS : ycg.AEQbTJ(this);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    default InterfaceC56349yCb minus(long j, yCF ycf) {
        return ChronoLocalDateTimeImpl.ensureValid(KWHzl(), super.minus(j, ycf));
    }

    default boolean isBefore(InterfaceC56349yCb interfaceC56349yCb) {
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = interfaceC56349yCb.toLocalDate().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && toLocalTime().toNanoOfDay() < interfaceC56349yCb.toLocalTime().toNanoOfDay());
    }

    default boolean isAfter(InterfaceC56349yCb interfaceC56349yCb) {
        long epochDay = toLocalDate().toEpochDay();
        long epochDay2 = interfaceC56349yCb.toLocalDate().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && toLocalTime().toNanoOfDay() > interfaceC56349yCb.toLocalTime().toNanoOfDay());
    }

    default InterfaceC56351yCd KWHzl() {
        return toLocalDate().getChronology();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    /* bridge */ /* synthetic */ default int compareTo(InterfaceC56349yCb<?> interfaceC56349yCb) {
        return compareTo((InterfaceC56349yCb) interfaceC56349yCb);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    default int compareTo(InterfaceC56349yCb interfaceC56349yCb) {
        int iCompareTo = toLocalDate().compareTo(interfaceC56349yCb.toLocalDate());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = toLocalTime().compareTo(interfaceC56349yCb.toLocalTime());
        return iCompareTo2 == 0 ? KWHzl().compareTo(interfaceC56349yCb.KWHzl()) : iCompareTo2;
    }

    @Override // o.InterfaceC56366yCs
    default InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return interfaceC56367yCt.with(ChronoField.EPOCH_DAY, toLocalDate().toEpochDay()).with(ChronoField.NANO_OF_DAY, toLocalTime().toNanoOfDay());
    }
}
