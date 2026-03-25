package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.util.Objects;
import o.InterfaceC56349yCb;
import o.InterfaceC56366yCs;
import o.InterfaceC56367yCt;
import o.InterfaceC56369yCv;
import o.InterfaceC56372yCy;
import o.yCF;

/* JADX INFO: loaded from: classes24.dex */
public final class MinguoDate extends ChronoLocalDateImpl {
    private final transient LocalDate isoDate;

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCy;J)Lo/yCt; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // o.InterfaceC56367yCt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MinguoDate with(InterfaceC56372yCy interfaceC56372yCy, long j) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return (MinguoDate) super.with(interfaceC56372yCy, j);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        if (getLong(chronoField) == j) {
            return this;
        }
        int[] iArr = AnonymousClass2.AEQbTJ;
        int i = iArr[chronoField.ordinal()];
        if (i == 4) {
            int iCheckValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
            int i2 = iArr[chronoField.ordinal()];
            if (i2 == 4) {
                return with(this.isoDate.withYear(getProlepticYear() >= 1 ? iCheckValidIntValue + 1911 : 1912 - iCheckValidIntValue));
            }
            if (i2 == 6) {
                return with(this.isoDate.withYear(iCheckValidIntValue + 1911));
            }
            if (i2 == 7) {
                return with(this.isoDate.withYear(1912 - getProlepticYear()));
            }
        } else {
            if (i == 5) {
                getChronology().range(chronoField).checkValidValue(j, chronoField);
                return plusMonths(j - getProlepticMonth());
            }
            if (i == 6 || i == 7) {
            }
        }
        return with(this.isoDate.with(interfaceC56372yCy, j));
    }

    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: with(Lo/yCs;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public MinguoDate with(InterfaceC56366yCs interfaceC56366yCs) {
        return (MinguoDate) super.with(interfaceC56366yCs);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.yBW, o.InterfaceC56367yCt
    public /* bridge */ /* synthetic */ long until(InterfaceC56367yCt interfaceC56367yCt, yCF ycf) {
        return super.until(interfaceC56367yCt, ycf);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.yBW
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.yBW
    public long toEpochDay() {
        return this.isoDate.toEpochDay();
    }

    @Override // o.InterfaceC56365yCr
    public ValueRange range(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.rangeRefinedBy(this);
        }
        if (!isSupported(interfaceC56372yCy)) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC56372yCy);
        }
        ChronoField chronoField = (ChronoField) interfaceC56372yCy;
        int i = AnonymousClass2.AEQbTJ[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.isoDate.range(interfaceC56372yCy);
        }
        if (i != 4) {
            return getChronology().range(chronoField);
        }
        ValueRange valueRangeRange = ChronoField.YEAR.range();
        return ValueRange.of(1L, getProlepticYear() <= 0 ? (-valueRangeRange.getMinimum()) + 1912 : valueRangeRange.getMaximum() - 1911);
    }

    /* JADX DEBUG: Method merged with bridge method: plusYears(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public MinguoDate plusYears(long j) {
        return with(this.isoDate.plusYears(j));
    }

    /* JADX DEBUG: Method merged with bridge method: plusMonths(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public MinguoDate plusMonths(long j) {
        return with(this.isoDate.plusMonths(j));
    }

    /* JADX DEBUG: Method merged with bridge method: plusDays(J)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    public MinguoDate plusDays(long j) {
        return with(this.isoDate.plusDays(j));
    }

    /* JADX DEBUG: Method merged with bridge method: plus(Lo/yCv;)Lo/yBW; */
    @Override // j$.time.chrono.ChronoLocalDateImpl, o.yBW
    public MinguoDate plus(InterfaceC56369yCv interfaceC56369yCv) {
        return (MinguoDate) super.plus(interfaceC56369yCv);
    }

    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: plus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public MinguoDate plus(long j, yCF ycf) {
        return (MinguoDate) super.plus(j, ycf);
    }

    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yBW; */
    /* JADX DEBUG: Method merged with bridge method: minus(JLo/yCF;)Lo/yCt; */
    @Override // o.InterfaceC56367yCt
    public MinguoDate minus(long j, yCF ycf) {
        return (MinguoDate) super.minus(j, ycf);
    }

    @Override // o.yBW
    public int hashCode() {
        return getChronology().getId().hashCode() ^ this.isoDate.hashCode();
    }

    @Override // o.InterfaceC56365yCr
    public long getLong(InterfaceC56372yCy interfaceC56372yCy) {
        if (!(interfaceC56372yCy instanceof ChronoField)) {
            return interfaceC56372yCy.getFrom(this);
        }
        int i = AnonymousClass2.AEQbTJ[((ChronoField) interfaceC56372yCy).ordinal()];
        if (i == 4) {
            int prolepticYear = getProlepticYear();
            if (prolepticYear < 1) {
                prolepticYear = 1 - prolepticYear;
            }
            return prolepticYear;
        }
        if (i == 5) {
            return getProlepticMonth();
        }
        if (i == 6) {
            return getProlepticYear();
        }
        if (i != 7) {
            return this.isoDate.getLong(interfaceC56372yCy);
        }
        return getProlepticYear() < 1 ? 0 : 1;
    }

    /* JADX DEBUG: Method merged with bridge method: getEra()Lo/yCe; */
    @Override // o.yBW
    public MinguoEra getEra() {
        return getProlepticYear() >= 1 ? MinguoEra.ROC : MinguoEra.BEFORE_ROC;
    }

    /* JADX DEBUG: Method merged with bridge method: getChronology()Lo/yCd; */
    @Override // o.yBW
    public MinguoChronology getChronology() {
        return MinguoChronology.INSTANCE;
    }

    @Override // o.yBW
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MinguoDate) {
            return this.isoDate.equals(((MinguoDate) obj).isoDate);
        }
        return false;
    }

    @Override // o.yBW
    public final InterfaceC56349yCb atTime(LocalTime localTime) {
        return super.atTime(localTime);
    }

    private MinguoDate with(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new MinguoDate(localDate);
    }

    private int getProlepticYear() {
        return this.isoDate.getYear() - 1911;
    }

    /* JADX INFO: renamed from: j$.time.chrono.MinguoDate$2, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[ChronoField.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[ChronoField.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[ChronoField.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[ChronoField.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private long getProlepticMonth() {
        return ((((long) getProlepticYear()) * 12) + ((long) this.isoDate.getMonthValue())) - 1;
    }

    MinguoDate(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.isoDate = localDate;
    }
}
