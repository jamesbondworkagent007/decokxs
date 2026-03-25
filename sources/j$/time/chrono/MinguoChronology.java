package j$.time.chrono;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.InterfaceC56349yCb;
import o.InterfaceC56352yCe;
import o.InterfaceC56353yCf;
import o.InterfaceC56365yCr;
import o.yBX;

/* JADX INFO: loaded from: classes17.dex */
public final class MinguoChronology extends yBX implements Serializable {
    public static final MinguoChronology INSTANCE = new MinguoChronology();

    @Override // o.InterfaceC56351yCd
    public InterfaceC56353yCf zonedDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        return super.zonedDateTime(interfaceC56365yCr);
    }

    @Override // o.InterfaceC56351yCd
    public InterfaceC56353yCf zonedDateTime(Instant instant, ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    /* JADX DEBUG: Method merged with bridge method: resolveDate(Ljava/util/Map;Lj$/time/format/ResolverStyle;)Lo/yBW; */
    @Override // o.yBX, o.InterfaceC56351yCd
    public MinguoDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (MinguoDate) super.resolveDate(map, resolverStyle);
    }

    @Override // o.InterfaceC56351yCd
    public ValueRange range(ChronoField chronoField) {
        int i = AnonymousClass2.EZpvd[chronoField.ordinal()];
        if (i == 1) {
            ValueRange valueRangeRange = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.of(valueRangeRange.getMinimum() - 22932, valueRangeRange.getMaximum() - 22932);
        }
        if (i == 2) {
            ValueRange valueRangeRange2 = ChronoField.YEAR.range();
            return ValueRange.of(1L, valueRangeRange2.getMaximum() - 1911, (-valueRangeRange2.getMinimum()) + 1912);
        }
        if (i != 3) {
            return chronoField.range();
        }
        ValueRange valueRangeRange3 = ChronoField.YEAR.range();
        return ValueRange.of(valueRangeRange3.getMinimum() - 1911, valueRangeRange3.getMaximum() - 1911);
    }

    @Override // o.InterfaceC56351yCd
    public int prolepticYear(InterfaceC56352yCe interfaceC56352yCe, int i) {
        if (interfaceC56352yCe instanceof MinguoEra) {
            return interfaceC56352yCe == MinguoEra.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // o.InterfaceC56351yCd
    public InterfaceC56349yCb localDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        return super.localDateTime(interfaceC56365yCr);
    }

    @Override // o.InterfaceC56351yCd
    public boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j + 1911);
    }

    @Override // o.InterfaceC56351yCd
    public String getId() {
        return "Minguo";
    }

    @Override // o.InterfaceC56351yCd
    public String getCalendarType() {
        return "roc";
    }

    @Override // o.InterfaceC56351yCd
    public List eras() {
        return Arrays.asList(MinguoEra.values());
    }

    /* JADX DEBUG: Method merged with bridge method: eraOf(I)Lo/yCe; */
    @Override // o.InterfaceC56351yCd
    public MinguoEra eraOf(int i) {
        return MinguoEra.of(i);
    }

    /* JADX DEBUG: Method merged with bridge method: dateYearDay(II)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public MinguoDate dateYearDay(int i, int i2) {
        return new MinguoDate(LocalDate.ofYearDay(i + 1911, i2));
    }

    public MinguoDate dateNow(Clock clock) {
        return date((InterfaceC56365yCr) LocalDate.now(clock));
    }

    /* JADX DEBUG: Method merged with bridge method: dateNow()Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public MinguoDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    /* JADX DEBUG: Method merged with bridge method: dateEpochDay(J)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public MinguoDate dateEpochDay(long j) {
        return new MinguoDate(LocalDate.ofEpochDay(j));
    }

    /* JADX DEBUG: Method merged with bridge method: date(Lo/yCr;)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public MinguoDate date(InterfaceC56365yCr interfaceC56365yCr) {
        return interfaceC56365yCr instanceof MinguoDate ? (MinguoDate) interfaceC56365yCr : new MinguoDate(LocalDate.from(interfaceC56365yCr));
    }

    /* JADX DEBUG: Method merged with bridge method: date(III)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public MinguoDate date(int i, int i2, int i3) {
        return new MinguoDate(LocalDate.of(i + 1911, i2, i3));
    }

    /* JADX INFO: renamed from: j$.time.chrono.MinguoChronology$2, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[ChronoField.values().length];
            EZpvd = iArr;
            try {
                iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EZpvd[ChronoField.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private MinguoChronology() {
    }
}
