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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC56349yCb;
import o.InterfaceC56352yCe;
import o.InterfaceC56353yCf;
import o.InterfaceC56365yCr;
import o.yBX;

/* JADX INFO: loaded from: classes17.dex */
public final class ThaiBuddhistChronology extends yBX implements Serializable {
    private static final HashMap ERA_FULL_NAMES;
    private static final HashMap ERA_NARROW_NAMES;
    private static final HashMap ERA_SHORT_NAMES;
    public static final ThaiBuddhistChronology INSTANCE = new ThaiBuddhistChronology();

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
    public ThaiBuddhistDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (ThaiBuddhistDate) super.resolveDate(map, resolverStyle);
    }

    @Override // o.InterfaceC56351yCd
    public ValueRange range(ChronoField chronoField) {
        int i = AnonymousClass1.AEQbTJ[chronoField.ordinal()];
        if (i == 1) {
            ValueRange valueRangeRange = ChronoField.PROLEPTIC_MONTH.range();
            return ValueRange.of(valueRangeRange.getMinimum() + 6516, valueRangeRange.getMaximum() + 6516);
        }
        if (i == 2) {
            ValueRange valueRangeRange2 = ChronoField.YEAR.range();
            return ValueRange.of(1L, 1 + (-(valueRangeRange2.getMinimum() + 543)), valueRangeRange2.getMaximum() + 543);
        }
        if (i != 3) {
            return chronoField.range();
        }
        ValueRange valueRangeRange3 = ChronoField.YEAR.range();
        return ValueRange.of(valueRangeRange3.getMinimum() + 543, valueRangeRange3.getMaximum() + 543);
    }

    @Override // o.InterfaceC56351yCd
    public int prolepticYear(InterfaceC56352yCe interfaceC56352yCe, int i) {
        if (interfaceC56352yCe instanceof ThaiBuddhistEra) {
            return interfaceC56352yCe == ThaiBuddhistEra.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // o.InterfaceC56351yCd
    public InterfaceC56349yCb localDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        return super.localDateTime(interfaceC56365yCr);
    }

    @Override // o.InterfaceC56351yCd
    public boolean isLeapYear(long j) {
        return IsoChronology.INSTANCE.isLeapYear(j - 543);
    }

    @Override // o.InterfaceC56351yCd
    public String getId() {
        return "ThaiBuddhist";
    }

    @Override // o.InterfaceC56351yCd
    public String getCalendarType() {
        return "buddhist";
    }

    @Override // o.InterfaceC56351yCd
    public List eras() {
        return Arrays.asList(ThaiBuddhistEra.values());
    }

    /* JADX DEBUG: Method merged with bridge method: eraOf(I)Lo/yCe; */
    @Override // o.InterfaceC56351yCd
    public ThaiBuddhistEra eraOf(int i) {
        return ThaiBuddhistEra.of(i);
    }

    /* JADX DEBUG: Method merged with bridge method: dateYearDay(II)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public ThaiBuddhistDate dateYearDay(int i, int i2) {
        return new ThaiBuddhistDate(LocalDate.ofYearDay(i - 543, i2));
    }

    public ThaiBuddhistDate dateNow(Clock clock) {
        return date((InterfaceC56365yCr) LocalDate.now(clock));
    }

    /* JADX DEBUG: Method merged with bridge method: dateNow()Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public ThaiBuddhistDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    /* JADX DEBUG: Method merged with bridge method: dateEpochDay(J)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public ThaiBuddhistDate dateEpochDay(long j) {
        return new ThaiBuddhistDate(LocalDate.ofEpochDay(j));
    }

    /* JADX DEBUG: Method merged with bridge method: date(Lo/yCr;)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public ThaiBuddhistDate date(InterfaceC56365yCr interfaceC56365yCr) {
        return interfaceC56365yCr instanceof ThaiBuddhistDate ? (ThaiBuddhistDate) interfaceC56365yCr : new ThaiBuddhistDate(LocalDate.from(interfaceC56365yCr));
    }

    /* JADX DEBUG: Method merged with bridge method: date(III)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public ThaiBuddhistDate date(int i, int i2, int i3) {
        return new ThaiBuddhistDate(LocalDate.of(i - 543, i2, i3));
    }

    /* JADX INFO: renamed from: j$.time.chrono.ThaiBuddhistChronology$1, reason: invalid class name */
    static abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[ChronoField.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ChronoField.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private ThaiBuddhistChronology() {
    }

    static {
        HashMap map = new HashMap();
        ERA_NARROW_NAMES = map;
        HashMap map2 = new HashMap();
        ERA_SHORT_NAMES = map2;
        HashMap map3 = new HashMap();
        ERA_FULL_NAMES = map3;
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }
}
