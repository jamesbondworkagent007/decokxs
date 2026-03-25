package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.Year;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.InterfaceC56352yCe;
import o.InterfaceC56365yCr;
import o.yBX;

/* JADX INFO: loaded from: classes13.dex */
public final class IsoChronology extends yBX implements Serializable {
    public static final IsoChronology INSTANCE = new IsoChronology();

    /* JADX DEBUG: Method merged with bridge method: zonedDateTime(Lo/yCr;)Lo/yCf; */
    @Override // o.InterfaceC56351yCd
    public ZonedDateTime zonedDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        return ZonedDateTime.from(interfaceC56365yCr);
    }

    /* JADX DEBUG: Method merged with bridge method: zonedDateTime(Lj$/time/Instant;Lj$/time/ZoneId;)Lo/yCf; */
    @Override // o.InterfaceC56351yCd
    public ZonedDateTime zonedDateTime(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    /* JADX DEBUG: Method merged with bridge method: resolveYearOfEra(Ljava/util/Map;Lj$/time/format/ResolverStyle;)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.yBX
    public LocalDate resolveYearOfEra(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField;
        long jSubtractExact;
        long jLongValue;
        ChronoField chronoField2 = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField2);
        if (l == null) {
            ChronoField chronoField3 = ChronoField.ERA;
            if (!map.containsKey(chronoField3)) {
                return null;
            }
            chronoField3.checkValidValue(((Long) map.get(chronoField3)).longValue());
            return null;
        }
        if (resolverStyle != ResolverStyle.LENIENT) {
            chronoField2.checkValidValue(l.longValue());
        }
        Long l2 = (Long) map.remove(ChronoField.ERA);
        if (l2 != null) {
            if (l2.longValue() == 1) {
                chronoField = ChronoField.YEAR;
                jSubtractExact = l.longValue();
            } else {
                if (l2.longValue() != 0) {
                    throw new DateTimeException("Invalid value for era: " + l2);
                }
                chronoField = ChronoField.YEAR;
                jSubtractExact = Math.subtractExact(1L, l.longValue());
            }
            addFieldValue(map, chronoField, jSubtractExact);
            return null;
        }
        ChronoField chronoField4 = ChronoField.YEAR;
        Long l3 = (Long) map.get(chronoField4);
        if (resolverStyle == ResolverStyle.STRICT) {
            if (l3 == null) {
                map.put(chronoField2, l);
                return null;
            }
            long jLongValue2 = l3.longValue();
            jLongValue = l.longValue();
            if (jLongValue2 <= 0) {
                jLongValue = Math.subtractExact(1L, jLongValue);
            }
        } else if (l3 == null || l3.longValue() > 0) {
            jLongValue = l.longValue();
        } else {
            jLongValue = l.longValue();
            jLongValue = Math.subtractExact(1L, jLongValue);
        }
        addFieldValue(map, chronoField4, jLongValue);
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: resolveYMD(Ljava/util/Map;Lj$/time/format/ResolverStyle;)Lo/yBW; */
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.yBX
    public LocalDate resolveYMD(Map map, ResolverStyle resolverStyle) {
        int length;
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = chronoField.checkValidIntValue(((Long) map.remove(chronoField)).longValue());
        if (resolverStyle == ResolverStyle.LENIENT) {
            return LocalDate.of(iCheckValidIntValue, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).plusDays(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iCheckValidIntValue2 = chronoField2.checkValidIntValue(((Long) map.remove(chronoField2)).longValue());
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iCheckValidIntValue3 = chronoField3.checkValidIntValue(((Long) map.remove(chronoField3)).longValue());
        if (resolverStyle == ResolverStyle.SMART) {
            if (iCheckValidIntValue2 != 4 && iCheckValidIntValue2 != 6 && iCheckValidIntValue2 != 9 && iCheckValidIntValue2 != 11) {
                length = iCheckValidIntValue2 == 2 ? Month.FEBRUARY.length(Year.isLeap(iCheckValidIntValue)) : 30;
            }
            iCheckValidIntValue3 = Math.min(iCheckValidIntValue3, length);
        }
        return LocalDate.of(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3);
    }

    @Override // o.yBX
    public void resolveProlepticMonth(Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.checkValidValue(l.longValue());
            }
            addFieldValue(map, ChronoField.MONTH_OF_YEAR, Math.floorMod(l.longValue(), 12L) + 1);
            addFieldValue(map, ChronoField.YEAR, Math.floorDiv(l.longValue(), 12L));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: resolveDate(Ljava/util/Map;Lj$/time/format/ResolverStyle;)Lo/yBW; */
    @Override // o.yBX, o.InterfaceC56351yCd
    public LocalDate resolveDate(Map map, ResolverStyle resolverStyle) {
        return (LocalDate) super.resolveDate(map, resolverStyle);
    }

    @Override // o.InterfaceC56351yCd
    public ValueRange range(ChronoField chronoField) {
        return chronoField.range();
    }

    @Override // o.InterfaceC56351yCd
    public int prolepticYear(InterfaceC56352yCe interfaceC56352yCe, int i) {
        if (interfaceC56352yCe instanceof IsoEra) {
            return interfaceC56352yCe == IsoEra.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    /* JADX DEBUG: Method merged with bridge method: localDateTime(Lo/yCr;)Lo/yCb; */
    @Override // o.InterfaceC56351yCd
    public LocalDateTime localDateTime(InterfaceC56365yCr interfaceC56365yCr) {
        return LocalDateTime.from(interfaceC56365yCr);
    }

    @Override // o.InterfaceC56351yCd
    public boolean isLeapYear(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    @Override // o.InterfaceC56351yCd
    public String getId() {
        return ExifInterface.TAG_RW2_ISO;
    }

    @Override // o.InterfaceC56351yCd
    public String getCalendarType() {
        return "iso8601";
    }

    @Override // o.InterfaceC56351yCd
    public List eras() {
        return Arrays.asList(IsoEra.values());
    }

    /* JADX DEBUG: Method merged with bridge method: eraOf(I)Lo/yCe; */
    @Override // o.InterfaceC56351yCd
    public IsoEra eraOf(int i) {
        return IsoEra.of(i);
    }

    /* JADX DEBUG: Method merged with bridge method: dateYearDay(II)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public LocalDate dateYearDay(int i, int i2) {
        return LocalDate.ofYearDay(i, i2);
    }

    public LocalDate dateNow(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        return date((InterfaceC56365yCr) LocalDate.now(clock));
    }

    /* JADX DEBUG: Method merged with bridge method: dateNow()Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public LocalDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    /* JADX DEBUG: Method merged with bridge method: dateEpochDay(J)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public LocalDate dateEpochDay(long j) {
        return LocalDate.ofEpochDay(j);
    }

    /* JADX DEBUG: Method merged with bridge method: date(Lo/yCr;)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public LocalDate date(InterfaceC56365yCr interfaceC56365yCr) {
        return LocalDate.from(interfaceC56365yCr);
    }

    /* JADX DEBUG: Method merged with bridge method: date(III)Lo/yBW; */
    @Override // o.InterfaceC56351yCd
    public LocalDate date(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    private IsoChronology() {
    }
}
