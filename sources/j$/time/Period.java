package j$.time;

import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoUnit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import o.AbstractC56371yCx;
import o.InterfaceC56351yCd;
import o.InterfaceC56365yCr;
import o.InterfaceC56367yCt;
import o.InterfaceC56369yCv;

/* JADX INFO: loaded from: classes13.dex */
public final class Period implements InterfaceC56369yCv, Serializable {
    private final int days;
    private final int months;
    private final int years;
    public static final Period ZERO = new Period(0, 0, 0);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private static final List SUPPORTED_UNITS = Collections.unmodifiableList(Arrays.asList(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS));

    public long toTotalMonths() {
        return (((long) this.years) * 12) + ((long) this.months);
    }

    public String toString() {
        if (this == ZERO) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.years;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.months;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.days;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // o.InterfaceC56369yCv
    public InterfaceC56367yCt subtractFrom(InterfaceC56367yCt interfaceC56367yCt) {
        long totalMonths;
        ChronoUnit chronoUnit;
        validateChrono(interfaceC56367yCt);
        if (this.months == 0) {
            int i = this.years;
            if (i != 0) {
                totalMonths = i;
                chronoUnit = ChronoUnit.YEARS;
                interfaceC56367yCt = interfaceC56367yCt.minus(totalMonths, chronoUnit);
            }
        } else {
            totalMonths = toTotalMonths();
            if (totalMonths != 0) {
                chronoUnit = ChronoUnit.MONTHS;
                interfaceC56367yCt = interfaceC56367yCt.minus(totalMonths, chronoUnit);
            }
        }
        int i2 = this.days;
        return i2 != 0 ? interfaceC56367yCt.minus(i2, ChronoUnit.DAYS) : interfaceC56367yCt;
    }

    public boolean isZero() {
        return this == ZERO;
    }

    public int hashCode() {
        return this.years + Integer.rotateLeft(this.months, 8) + Integer.rotateLeft(this.days, 16);
    }

    public int getDays() {
        return this.days;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.years == period.years && this.months == period.months && this.days == period.days;
    }

    @Override // o.InterfaceC56369yCv
    public InterfaceC56367yCt addTo(InterfaceC56367yCt interfaceC56367yCt) {
        long totalMonths;
        ChronoUnit chronoUnit;
        validateChrono(interfaceC56367yCt);
        if (this.months == 0) {
            int i = this.years;
            if (i != 0) {
                totalMonths = i;
                chronoUnit = ChronoUnit.YEARS;
                interfaceC56367yCt = interfaceC56367yCt.plus(totalMonths, chronoUnit);
            }
        } else {
            totalMonths = toTotalMonths();
            if (totalMonths != 0) {
                chronoUnit = ChronoUnit.MONTHS;
                interfaceC56367yCt = interfaceC56367yCt.plus(totalMonths, chronoUnit);
            }
        }
        int i2 = this.days;
        return i2 != 0 ? interfaceC56367yCt.plus(i2, ChronoUnit.DAYS) : interfaceC56367yCt;
    }

    private void validateChrono(InterfaceC56365yCr interfaceC56365yCr) {
        Objects.requireNonNull(interfaceC56365yCr, "temporal");
        InterfaceC56351yCd interfaceC56351yCd = (InterfaceC56351yCd) interfaceC56365yCr.query(AbstractC56371yCx.EZpvd());
        if (interfaceC56351yCd == null || IsoChronology.INSTANCE.equals(interfaceC56351yCd)) {
            return;
        }
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + interfaceC56351yCd.getId());
    }

    public static Period ofDays(int i) {
        return create(0, 0, i);
    }

    private static Period create(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? ZERO : new Period(i, i2, i3);
    }

    private Period(int i, int i2, int i3) {
        this.years = i;
        this.months = i2;
        this.days = i3;
    }
}
