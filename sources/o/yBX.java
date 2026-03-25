package o;

import androidx.exifinterface.media.ExifInterface;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.chrono.AbstractChronology$$ExternalSyntheticLambda0;
import j$.time.chrono.AbstractChronology$$ExternalSyntheticLambda1;
import j$.time.chrono.AbstractChronology$$ExternalSyntheticLambda2;
import j$.time.chrono.HijrahChronology;
import j$.time.chrono.IsoChronology;
import j$.time.chrono.JapaneseChronology;
import j$.time.chrono.MinguoChronology;
import j$.time.chrono.ThaiBuddhistChronology;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yBX implements InterfaceC56351yCd {
    static final java.util.Comparator DATE_ORDER = new AbstractChronology$$ExternalSyntheticLambda0();
    static final java.util.Comparator DATE_TIME_ORDER = new AbstractChronology$$ExternalSyntheticLambda1();
    static final java.util.Comparator INSTANT_ORDER = new AbstractChronology$$ExternalSyntheticLambda2();
    private static final ConcurrentHashMap CHRONOS_BY_ID = new ConcurrentHashMap();
    private static final ConcurrentHashMap CHRONOS_BY_TYPE = new ConcurrentHashMap();
    private static final java.util.Locale JAPANESE_CALENDAR_LOCALE = new java.util.Locale("ja", "JP", "JP");

    @Override // o.InterfaceC56351yCd
    public java.lang.String toString() {
        return getId();
    }

    protected yBW resolveYearOfEra(java.util.Map map, ResolverStyle resolverStyle) {
        InterfaceC56352yCe era;
        long jProlepticYear;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        java.lang.Long l = (java.lang.Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            range(chronoField2).checkValidValue(((java.lang.Long) map.get(chronoField2)).longValue(), chronoField2);
            return null;
        }
        java.lang.Long l2 = (java.lang.Long) map.remove(ChronoField.ERA);
        int iCheckValidIntValue = resolverStyle != ResolverStyle.LENIENT ? range(chronoField).checkValidIntValue(l.longValue(), chronoField) : java.lang.Math.toIntExact(l.longValue());
        if (l2 != null) {
            addFieldValue(map, ChronoField.YEAR, prolepticYear(eraOf(range(r2).checkValidIntValue(l2.longValue(), r2)), iCheckValidIntValue));
            return null;
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        if (map.containsKey(chronoField3)) {
            era = dateYearDay(range(chronoField3).checkValidIntValue(((java.lang.Long) map.get(chronoField3)).longValue(), chronoField3), 1).getEra();
        } else {
            if (resolverStyle == ResolverStyle.STRICT) {
                map.put(chronoField, l);
                return null;
            }
            java.util.List listEras = eras();
            if (listEras.isEmpty()) {
                jProlepticYear = iCheckValidIntValue;
                addFieldValue(map, chronoField3, jProlepticYear);
                return null;
            }
            era = (InterfaceC56352yCe) listEras.get(listEras.size() - 1);
        }
        jProlepticYear = prolepticYear(era, iCheckValidIntValue);
        addFieldValue(map, chronoField3, jProlepticYear);
        return null;
    }

    protected yBW resolveYMD(java.util.Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = range(chronoField).checkValidIntValue(((java.lang.Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long jSubtractExact = java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return date(iCheckValidIntValue, 1, 1).plus(jSubtractExact, (yCF) ChronoUnit.MONTHS).plus(java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (yCF) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iCheckValidIntValue2 = range(chronoField2).checkValidIntValue(((java.lang.Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iCheckValidIntValue3 = range(chronoField3).checkValidIntValue(((java.lang.Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (resolverStyle != ResolverStyle.SMART) {
            return date(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3);
        }
        try {
            return date(iCheckValidIntValue, iCheckValidIntValue2, iCheckValidIntValue3);
        } catch (DateTimeException unused) {
            return date(iCheckValidIntValue, iCheckValidIntValue2, 1).with(AbstractC56368yCu.OLrzqt());
        }
    }

    yBW resolveYMAD(java.util.Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = range(chronoField).checkValidIntValue(((java.lang.Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return resolveAligned(date(iCheckValidIntValue, 1, 1), java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L), java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.ALIGNED_WEEK_OF_MONTH)).longValue(), 1L), java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.DAY_OF_WEEK)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iCheckValidIntValue2 = range(chronoField2).checkValidIntValue(((java.lang.Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.ALIGNED_WEEK_OF_MONTH;
        int iCheckValidIntValue3 = range(chronoField3).checkValidIntValue(((java.lang.Long) map.remove(chronoField3)).longValue(), chronoField3);
        ChronoField chronoField4 = ChronoField.DAY_OF_WEEK;
        yBW ybwWith = date(iCheckValidIntValue, iCheckValidIntValue2, 1).plus((iCheckValidIntValue3 - 1) * 7, (yCF) ChronoUnit.DAYS).with(AbstractC56368yCu.EZpvd(DayOfWeek.of(range(chronoField4).checkValidIntValue(((java.lang.Long) map.remove(chronoField4)).longValue(), chronoField4))));
        if (resolverStyle != ResolverStyle.STRICT || ybwWith.get(chronoField2) == iCheckValidIntValue2) {
            return ybwWith;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
    }

    yBW resolveYMAA(java.util.Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = range(chronoField).checkValidIntValue(((java.lang.Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            long jSubtractExact = java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return date(iCheckValidIntValue, 1, 1).plus(jSubtractExact, (yCF) ChronoUnit.MONTHS).plus(java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.ALIGNED_WEEK_OF_MONTH)).longValue(), 1L), (yCF) ChronoUnit.WEEKS).plus(java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)).longValue(), 1L), (yCF) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iCheckValidIntValue2 = range(chronoField2).checkValidIntValue(((java.lang.Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.ALIGNED_WEEK_OF_MONTH;
        int iCheckValidIntValue3 = range(chronoField3).checkValidIntValue(((java.lang.Long) map.remove(chronoField3)).longValue(), chronoField3);
        ChronoField chronoField4 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
        yBW ybwPlus = date(iCheckValidIntValue, iCheckValidIntValue2, 1).plus(((iCheckValidIntValue3 - 1) * 7) + (range(chronoField4).checkValidIntValue(((java.lang.Long) map.remove(chronoField4)).longValue(), chronoField4) - 1), (yCF) ChronoUnit.DAYS);
        if (resolverStyle != ResolverStyle.STRICT || ybwPlus.get(chronoField2) == iCheckValidIntValue2) {
            return ybwPlus;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
    }

    yBW resolveYD(java.util.Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = range(chronoField).checkValidIntValue(((java.lang.Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return dateYearDay(iCheckValidIntValue, 1).plus(java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.DAY_OF_YEAR)).longValue(), 1L), (yCF) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.DAY_OF_YEAR;
        return dateYearDay(iCheckValidIntValue, range(chronoField2).checkValidIntValue(((java.lang.Long) map.remove(chronoField2)).longValue(), chronoField2));
    }

    yBW resolveYAD(java.util.Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = range(chronoField).checkValidIntValue(((java.lang.Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return resolveAligned(dateYearDay(iCheckValidIntValue, 1), 0L, java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.ALIGNED_WEEK_OF_YEAR)).longValue(), 1L), java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.DAY_OF_WEEK)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        int iCheckValidIntValue2 = range(chronoField2).checkValidIntValue(((java.lang.Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_WEEK;
        yBW ybwWith = dateYearDay(iCheckValidIntValue, 1).plus((iCheckValidIntValue2 - 1) * 7, (yCF) ChronoUnit.DAYS).with(AbstractC56368yCu.EZpvd(DayOfWeek.of(range(chronoField3).checkValidIntValue(((java.lang.Long) map.remove(chronoField3)).longValue(), chronoField3))));
        if (resolverStyle != ResolverStyle.STRICT || ybwWith.get(chronoField) == iCheckValidIntValue) {
            return ybwWith;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    yBW resolveYAA(java.util.Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.YEAR;
        int iCheckValidIntValue = range(chronoField).checkValidIntValue(((java.lang.Long) map.remove(chronoField)).longValue(), chronoField);
        if (resolverStyle == ResolverStyle.LENIENT) {
            return dateYearDay(iCheckValidIntValue, 1).plus(java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.ALIGNED_WEEK_OF_YEAR)).longValue(), 1L), (yCF) ChronoUnit.WEEKS).plus(java.lang.Math.subtractExact(((java.lang.Long) map.remove(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)).longValue(), 1L), (yCF) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        int iCheckValidIntValue2 = range(chronoField2).checkValidIntValue(((java.lang.Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        yBW ybwPlus = dateYearDay(iCheckValidIntValue, 1).plus(((iCheckValidIntValue2 - 1) * 7) + (range(chronoField3).checkValidIntValue(((java.lang.Long) map.remove(chronoField3)).longValue(), chronoField3) - 1), (yCF) ChronoUnit.DAYS);
        if (resolverStyle != ResolverStyle.STRICT || ybwPlus.get(chronoField) == iCheckValidIntValue) {
            return ybwPlus;
        }
        throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    protected void resolveProlepticMonth(java.util.Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        java.lang.Long l = (java.lang.Long) map.remove(chronoField);
        if (l != null) {
            if (resolverStyle != ResolverStyle.LENIENT) {
                chronoField.checkValidValue(l.longValue());
            }
            yBW ybwWith = dateNow().with((InterfaceC56372yCy) ChronoField.DAY_OF_MONTH, 1L).with((InterfaceC56372yCy) chronoField, l.longValue());
            addFieldValue(map, ChronoField.MONTH_OF_YEAR, ybwWith.get(r0));
            addFieldValue(map, ChronoField.YEAR, ybwWith.get(r0));
        }
    }

    @Override // o.InterfaceC56351yCd
    public yBW resolveDate(java.util.Map map, ResolverStyle resolverStyle) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return dateEpochDay(((java.lang.Long) map.remove(chronoField)).longValue());
        }
        resolveProlepticMonth(map, resolverStyle);
        yBW ybwResolveYearOfEra = resolveYearOfEra(map, resolverStyle);
        if (ybwResolveYearOfEra != null) {
            return ybwResolveYearOfEra;
        }
        if (!map.containsKey(ChronoField.YEAR)) {
            return null;
        }
        if (map.containsKey(ChronoField.MONTH_OF_YEAR)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return resolveYMD(map, resolverStyle);
            }
            if (map.containsKey(ChronoField.ALIGNED_WEEK_OF_MONTH)) {
                if (map.containsKey(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                    return resolveYMAA(map, resolverStyle);
                }
                if (map.containsKey(ChronoField.DAY_OF_WEEK)) {
                    return resolveYMAD(map, resolverStyle);
                }
            }
        }
        if (map.containsKey(ChronoField.DAY_OF_YEAR)) {
            return resolveYD(map, resolverStyle);
        }
        if (!map.containsKey(ChronoField.ALIGNED_WEEK_OF_YEAR)) {
            return null;
        }
        if (map.containsKey(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
            return resolveYAA(map, resolverStyle);
        }
        if (map.containsKey(ChronoField.DAY_OF_WEEK)) {
            return resolveYAD(map, resolverStyle);
        }
        return null;
    }

    yBW resolveAligned(yBW ybw, long j, long j2, long j3) {
        long j4;
        yBW ybwPlus = ybw.plus(j, (yCF) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        yBW ybwPlus2 = ybwPlus.plus(j2, (yCF) chronoUnit);
        if (j3 <= 7) {
            if (j3 < 1) {
                ybwPlus2 = ybwPlus2.plus(java.lang.Math.subtractExact(j3, 7L) / 7, (yCF) chronoUnit);
                j4 = j3 + 6;
            }
            return ybwPlus2.with(AbstractC56368yCu.EZpvd(DayOfWeek.of((int) j3)));
        }
        j4 = j3 - 1;
        ybwPlus2 = ybwPlus2.plus(j4 / 7, (yCF) chronoUnit);
        j3 = (j4 % 7) + 1;
        return ybwPlus2.with(AbstractC56368yCu.EZpvd(DayOfWeek.of((int) j3)));
    }

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // o.InterfaceC56351yCd
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yBX) && compareTo((InterfaceC56351yCd) obj) == 0;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(InterfaceC56351yCd interfaceC56351yCd) {
        return getId().compareTo(interfaceC56351yCd.getId());
    }

    public void addFieldValue(java.util.Map map, ChronoField chronoField, long j) {
        java.lang.Long l = (java.lang.Long) map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, java.lang.Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
    }

    public static InterfaceC56351yCd registerChrono(InterfaceC56351yCd interfaceC56351yCd, java.lang.String str) {
        java.lang.String calendarType;
        InterfaceC56351yCd interfaceC56351yCd2 = (InterfaceC56351yCd) CHRONOS_BY_ID.putIfAbsent(str, interfaceC56351yCd);
        if (interfaceC56351yCd2 == null && (calendarType = interfaceC56351yCd.getCalendarType()) != null) {
            CHRONOS_BY_TYPE.putIfAbsent(calendarType, interfaceC56351yCd);
        }
        return interfaceC56351yCd2;
    }

    static InterfaceC56351yCd registerChrono(InterfaceC56351yCd interfaceC56351yCd) {
        return registerChrono(interfaceC56351yCd, interfaceC56351yCd.getId());
    }

    static InterfaceC56351yCd ofLocale(java.util.Locale locale) {
        Objects.requireNonNull(locale, "locale");
        java.lang.String calendarType = getCalendarType(locale);
        if (calendarType == null || "iso".equals(calendarType) || "iso8601".equals(calendarType)) {
            return IsoChronology.INSTANCE;
        }
        do {
            InterfaceC56351yCd interfaceC56351yCd = (InterfaceC56351yCd) CHRONOS_BY_TYPE.get(calendarType);
            if (interfaceC56351yCd != null) {
                return interfaceC56351yCd;
            }
        } while (initCache());
        for (InterfaceC56351yCd interfaceC56351yCd2 : ServiceLoader.load(InterfaceC56351yCd.class)) {
            if (calendarType.equals(interfaceC56351yCd2.getCalendarType())) {
                return interfaceC56351yCd2;
            }
        }
        throw new DateTimeException("Unknown calendar system: " + calendarType);
    }

    public static /* synthetic */ int lambda$static$b5a61975$1(InterfaceC56349yCb interfaceC56349yCb, InterfaceC56349yCb interfaceC56349yCb2) {
        int iCompare = java.lang.Long.compare(interfaceC56349yCb.toLocalDate().toEpochDay(), interfaceC56349yCb2.toLocalDate().toEpochDay());
        return iCompare == 0 ? java.lang.Long.compare(interfaceC56349yCb.toLocalTime().toNanoOfDay(), interfaceC56349yCb2.toLocalTime().toNanoOfDay()) : iCompare;
    }

    public static /* synthetic */ int lambda$static$2241c452$1(InterfaceC56353yCf interfaceC56353yCf, InterfaceC56353yCf interfaceC56353yCf2) {
        int iCompare = java.lang.Long.compare(interfaceC56353yCf.AEQbTJ(), interfaceC56353yCf2.AEQbTJ());
        return iCompare == 0 ? java.lang.Long.compare(interfaceC56353yCf.toLocalTime().getNano(), interfaceC56353yCf2.toLocalTime().getNano()) : iCompare;
    }

    private static boolean initCache() {
        if (CHRONOS_BY_ID.get(ExifInterface.TAG_RW2_ISO) != null) {
            return false;
        }
        registerChrono(HijrahChronology.INSTANCE);
        registerChrono(JapaneseChronology.INSTANCE);
        registerChrono(MinguoChronology.INSTANCE);
        registerChrono(ThaiBuddhistChronology.INSTANCE);
        for (yBX ybx : ServiceLoader.load(yBX.class, null)) {
            if (!ybx.getId().equals(ExifInterface.TAG_RW2_ISO)) {
                registerChrono(ybx);
            }
        }
        registerChrono(IsoChronology.INSTANCE);
        return true;
    }

    private static java.lang.String getCalendarType(java.util.Locale locale) {
        java.lang.String unicodeLocaleType = locale.getUnicodeLocaleType("ca");
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (locale.equals(JAPANESE_CALENDAR_LOCALE)) {
            return "japanese";
        }
        return null;
    }
}
