package o;

import j$.time.LocalTime;
import j$.time.chrono.ChronoLocalDateImpl;
import j$.time.chrono.ChronoLocalDateTimeImpl;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes13.dex */
public interface yBW extends InterfaceC56367yCt, InterfaceC56366yCs, java.lang.Comparable {
    boolean equals(java.lang.Object obj);

    InterfaceC56351yCd getChronology();

    InterfaceC56352yCe getEra();

    int hashCode();

    long toEpochDay();

    java.lang.String toString();

    @Override // o.InterfaceC56367yCt
    long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf);

    @Override // o.InterfaceC56367yCt
    default yBW with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return ChronoLocalDateImpl.ensureValid(getChronology(), interfaceC56372yCy.adjustInto(this, j));
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
    }

    @Override // o.InterfaceC56367yCt
    default yBW with(InterfaceC56366yCs interfaceC56366yCs) {
        return ChronoLocalDateImpl.ensureValid(getChronology(), super.with(interfaceC56366yCs));
    }

    @Override // o.InterfaceC56365yCr
    default java.lang.Object query(yCG ycg) {
        if (ycg == AbstractC56371yCx.djBIcL() || ycg == AbstractC56371yCx.gEmmrt() || ycg == AbstractC56371yCx.copydefault() || ycg == AbstractC56371yCx.KWHzl()) {
            return null;
        }
        return ycg == AbstractC56371yCx.EZpvd() ? getChronology() : ycg == AbstractC56371yCx.AEQbTJ() ? ChronoUnit.DAYS : ycg.AEQbTJ(this);
    }

    default yBW plus(InterfaceC56369yCv interfaceC56369yCv) {
        return ChronoLocalDateImpl.ensureValid(getChronology(), super.AEQbTJ(interfaceC56369yCv));
    }

    @Override // o.InterfaceC56367yCt
    default yBW plus(long j, yCF ycf) {
        if (!(ycf instanceof ChronoUnit)) {
            return ChronoLocalDateImpl.ensureValid(getChronology(), ycf.addTo(this, j));
        }
        throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
    }

    @Override // o.InterfaceC56367yCt
    default yBW minus(long j, yCF ycf) {
        return ChronoLocalDateImpl.ensureValid(getChronology(), super.minus(j, ycf));
    }

    default int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // o.InterfaceC56365yCr
    default boolean isSupported(InterfaceC56372yCy interfaceC56372yCy) {
        return interfaceC56372yCy instanceof ChronoField ? interfaceC56372yCy.isDateBased() : interfaceC56372yCy != null && interfaceC56372yCy.isSupportedBy(this);
    }

    default boolean isLeapYear() {
        return getChronology().isLeapYear(getLong(ChronoField.YEAR));
    }

    default boolean isBefore(yBW ybw) {
        return toEpochDay() < ybw.toEpochDay();
    }

    default boolean isAfter(yBW ybw) {
        return toEpochDay() > ybw.toEpochDay();
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    default int compareTo(yBW ybw) {
        int iCompare = java.lang.Long.compare(toEpochDay(), ybw.toEpochDay());
        return iCompare == 0 ? getChronology().compareTo(ybw.getChronology()) : iCompare;
    }

    default InterfaceC56349yCb atTime(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.of(this, localTime);
    }

    @Override // o.InterfaceC56366yCs
    default InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt) {
        return interfaceC56367yCt.with(ChronoField.EPOCH_DAY, toEpochDay());
    }
}
