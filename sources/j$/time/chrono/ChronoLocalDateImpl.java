package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import java.io.Serializable;
import java.util.Objects;
import o.InterfaceC56351yCd;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56369yCv;
import o.InterfaceC56372yCy;
import o.yBW;
import o.yCF;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ChronoLocalDateImpl implements yBW, InterfaceC56367yCt, InterfaceC56366yCs, Serializable {
    abstract yBW plusDays(long j);

    abstract yBW plusMonths(long j);

    abstract yBW plusYears(long j);

    @Override // o.yBW, o.InterfaceC56367yCt
    public yBW with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        return super.with(interfaceC56372yCy, j);
    }

    @Override // o.yBW, o.InterfaceC56367yCt
    public yBW with(InterfaceC56366yCs interfaceC56366yCs) {
        return super.with(interfaceC56366yCs);
    }

    @Override // o.yBW, o.InterfaceC56367yCt
    public long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        Objects.requireNonNull(interfaceC56367yCt, "endExclusive");
        yBW ybwDate = getChronology().date(interfaceC56367yCt);
        if (!(ycf instanceof ChronoUnit)) {
            Objects.requireNonNull(ycf, "unit");
            return ycf.between(this, ybwDate);
        }
        switch (AnonymousClass1.AEQbTJ[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return daysUntil(ybwDate);
            case 2:
                return daysUntil(ybwDate) / 7;
            case 3:
                return monthsUntil(ybwDate);
            case 4:
                return monthsUntil(ybwDate) / 12;
            case 5:
                return monthsUntil(ybwDate) / 120;
            case 6:
                return monthsUntil(ybwDate) / 1200;
            case 7:
                return monthsUntil(ybwDate) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return ybwDate.getLong(chronoField) - getLong(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
        }
    }

    @Override // o.yBW
    public String toString() {
        long j = getLong(ChronoField.YEAR_OF_ERA);
        long j2 = getLong(ChronoField.MONTH_OF_YEAR);
        long j3 = getLong(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(j);
        sb.append(j2 < 10 ? "-0" : "-");
        sb.append(j2);
        sb.append(j3 >= 10 ? "-" : "-0");
        sb.append(j3);
        return sb.toString();
    }

    @Override // o.yBW
    public yBW plus(InterfaceC56369yCv interfaceC56369yCv) {
        return super.plus(interfaceC56369yCv);
    }

    @Override // o.yBW, o.InterfaceC56367yCt
    public yBW plus(long j, yCF ycf) {
        if (!(ycf instanceof ChronoUnit)) {
            return super.plus(j, ycf);
        }
        switch (AnonymousClass1.AEQbTJ[((ChronoUnit) ycf).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusDays(Math.multiplyExact(j, 7L));
            case 3:
                return plusMonths(j);
            case 4:
                return plusYears(j);
            case 5:
                return plusYears(Math.multiplyExact(j, 10L));
            case 6:
                return plusYears(Math.multiplyExact(j, 100L));
            case 7:
                return plusYears(Math.multiplyExact(j, 1000L));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return with((InterfaceC56372yCy) chronoField, Math.addExact(getLong(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + ycf);
        }
    }

    @Override // o.yBW, o.InterfaceC56367yCt
    public yBW minus(long j, yCF ycf) {
        return super.minus(j, ycf);
    }

    private long monthsUntil(yBW ybw) {
        if (getChronology().range(ChronoField.MONTH_OF_YEAR).getMaximum() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        long j = getLong(chronoField);
        ChronoField chronoField2 = ChronoField.DAY_OF_MONTH;
        return (((ybw.getLong(chronoField) * 32) + ((long) ybw.get(chronoField2))) - ((j * 32) + ((long) get(chronoField2)))) / 32;
    }

    public static yBW ensureValid(InterfaceC56351yCd interfaceC56351yCd, InterfaceC56367yCt interfaceC56367yCt) {
        yBW ybw = (yBW) interfaceC56367yCt;
        if (interfaceC56351yCd.equals(ybw.getChronology())) {
            return ybw;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC56351yCd.getId() + ", actual: " + ybw.getChronology().getId());
    }

    /* JADX INFO: renamed from: j$.time.chrono.ChronoLocalDateImpl$1, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AEQbTJ[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private long daysUntil(yBW ybw) {
        return ybw.toEpochDay() - toEpochDay();
    }

    ChronoLocalDateImpl() {
    }
}
