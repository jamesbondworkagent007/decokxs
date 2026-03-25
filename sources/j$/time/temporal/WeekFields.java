package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.format.ResolverStyle;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC56351yCd;
import o.InterfaceC56365yCr;
import o.InterfaceC56367yCt;
import o.InterfaceC56372yCy;
import o.yBW;
import o.yCF;

/* JADX INFO: loaded from: classes13.dex */
public final class WeekFields implements Serializable {
    private static final ConcurrentMap CACHE = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);
    public static final WeekFields SUNDAY_START = of(DayOfWeek.SUNDAY, 1);
    public static final yCF WEEK_BASED_YEARS = IsoFields.AEQbTJ;
    private final DayOfWeek firstDayOfWeek;
    private final int minimalDays;
    private final transient InterfaceC56372yCy dayOfWeek = Activity.OLrzqt(this);
    private final transient InterfaceC56372yCy weekOfMonth = Activity.EZpvd(this);
    private final transient InterfaceC56372yCy weekOfYear = Activity.copydefault(this);
    private final transient InterfaceC56372yCy weekOfWeekBasedYear = Activity.AEQbTJ(this);
    private final transient InterfaceC56372yCy weekBasedYear = Activity.KWHzl(this);

    static class Activity implements InterfaceC56372yCy {
        private final yCF AEQbTJ;
        private final WeekFields AYXKKw;
        private final yCF AhwBna;
        private final ValueRange djBIcL;
        private final String valueOf;
        private static final ValueRange copydefault = ValueRange.of(1, 7);
        private static final ValueRange EZpvd = ValueRange.of(0, 1, 4, 6);
        private static final ValueRange KWHzl = ValueRange.of(0, 1, 52, 54);
        private static final ValueRange OLrzqt = ValueRange.of(1, 52, 53);

        @Override // o.InterfaceC56372yCy
        public boolean isDateBased() {
            return true;
        }

        @Override // o.InterfaceC56372yCy
        public boolean isTimeBased() {
            return false;
        }

        public String toString() {
            return this.valueOf + "[" + this.AYXKKw.toString() + "]";
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Ljava/util/Map;Lo/yCr;Lj$/time/format/ResolverStyle;)Lo/yCr; */
        @Override // o.InterfaceC56372yCy
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public yBW resolve(Map map, InterfaceC56365yCr interfaceC56365yCr, ResolverStyle resolverStyle) {
            int intExact = Math.toIntExact(((Long) map.get(this)).longValue());
            if (this.AhwBna == ChronoUnit.WEEKS) {
                long jFloorMod = Math.floorMod((this.AYXKKw.getFirstDayOfWeek().getValue() - 1) + (this.djBIcL.checkValidIntValue(r2, this) - 1), 7) + 1;
                map.remove(this);
                map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(jFloorMod));
                return null;
            }
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            if (!map.containsKey(chronoField)) {
                return null;
            }
            int iKWHzl = KWHzl(chronoField.checkValidIntValue(((Long) map.get(chronoField)).longValue()));
            InterfaceC56351yCd interfaceC56351yCdKWHzl = InterfaceC56351yCd.KWHzl(interfaceC56365yCr);
            ChronoField chronoField2 = ChronoField.YEAR;
            if (map.containsKey(chronoField2)) {
                int iCheckValidIntValue = chronoField2.checkValidIntValue(((Long) map.get(chronoField2)).longValue());
                if (this.AhwBna == ChronoUnit.MONTHS) {
                    Object obj = ChronoField.MONTH_OF_YEAR;
                    if (map.containsKey(obj)) {
                        return AEQbTJ(map, interfaceC56351yCdKWHzl, iCheckValidIntValue, ((Long) map.get(obj)).longValue(), intExact, iKWHzl, resolverStyle);
                    }
                }
                if (this.AhwBna == ChronoUnit.YEARS) {
                    return EZpvd(map, interfaceC56351yCdKWHzl, iCheckValidIntValue, intExact, iKWHzl, resolverStyle);
                }
            } else {
                yCF ycf = this.AhwBna;
                if ((ycf == WeekFields.WEEK_BASED_YEARS || ycf == ChronoUnit.FOREVER) && map.containsKey(this.AYXKKw.weekBasedYear) && map.containsKey(this.AYXKKw.weekOfWeekBasedYear)) {
                    return AEQbTJ(map, interfaceC56351yCdKWHzl, iKWHzl, resolverStyle);
                }
            }
            return null;
        }

        @Override // o.InterfaceC56372yCy
        public ValueRange rangeRefinedBy(InterfaceC56365yCr interfaceC56365yCr) {
            yCF ycf = this.AhwBna;
            if (ycf == ChronoUnit.WEEKS) {
                return this.djBIcL;
            }
            if (ycf == ChronoUnit.MONTHS) {
                return KWHzl(interfaceC56365yCr, ChronoField.DAY_OF_MONTH);
            }
            if (ycf == ChronoUnit.YEARS) {
                return KWHzl(interfaceC56365yCr, ChronoField.DAY_OF_YEAR);
            }
            if (ycf == WeekFields.WEEK_BASED_YEARS) {
                return djBIcL(interfaceC56365yCr);
            }
            if (ycf == ChronoUnit.FOREVER) {
                return ChronoField.YEAR.range();
            }
            throw new IllegalStateException("unreachable, rangeUnit: " + this.AhwBna + ", this: " + this);
        }

        @Override // o.InterfaceC56372yCy
        public ValueRange range() {
            return this.djBIcL;
        }

        @Override // o.InterfaceC56372yCy
        public boolean isSupportedBy(InterfaceC56365yCr interfaceC56365yCr) {
            ChronoField chronoField;
            if (!interfaceC56365yCr.isSupported(ChronoField.DAY_OF_WEEK)) {
                return false;
            }
            yCF ycf = this.AhwBna;
            if (ycf == ChronoUnit.WEEKS) {
                return true;
            }
            if (ycf == ChronoUnit.MONTHS) {
                chronoField = ChronoField.DAY_OF_MONTH;
            } else if (ycf == ChronoUnit.YEARS || ycf == WeekFields.WEEK_BASED_YEARS) {
                chronoField = ChronoField.DAY_OF_YEAR;
            } else {
                if (ycf != ChronoUnit.FOREVER) {
                    return false;
                }
                chronoField = ChronoField.YEAR;
            }
            return interfaceC56365yCr.isSupported(chronoField);
        }

        @Override // o.InterfaceC56372yCy
        public long getFrom(InterfaceC56365yCr interfaceC56365yCr) {
            int iCopydefault;
            yCF ycf = this.AhwBna;
            if (ycf == ChronoUnit.WEEKS) {
                iCopydefault = KWHzl(interfaceC56365yCr);
            } else {
                if (ycf == ChronoUnit.MONTHS) {
                    return EZpvd(interfaceC56365yCr);
                }
                if (ycf == ChronoUnit.YEARS) {
                    return AEQbTJ(interfaceC56365yCr);
                }
                if (ycf == WeekFields.WEEK_BASED_YEARS) {
                    iCopydefault = OLrzqt(interfaceC56365yCr);
                } else {
                    if (ycf != ChronoUnit.FOREVER) {
                        throw new IllegalStateException("unreachable, rangeUnit: " + this.AhwBna + ", this: " + this);
                    }
                    iCopydefault = copydefault(interfaceC56365yCr);
                }
            }
            return iCopydefault;
        }

        @Override // o.InterfaceC56372yCy
        public InterfaceC56367yCt adjustInto(InterfaceC56367yCt interfaceC56367yCt, long j) {
            if (this.djBIcL.checkValidIntValue(j, this) == interfaceC56367yCt.get(this)) {
                return interfaceC56367yCt;
            }
            if (this.AhwBna != ChronoUnit.FOREVER) {
                return interfaceC56367yCt.plus(r0 - r1, this.AEQbTJ);
            }
            return OLrzqt(InterfaceC56351yCd.KWHzl(interfaceC56367yCt), (int) j, interfaceC56367yCt.get(this.AYXKKw.weekOfWeekBasedYear), interfaceC56367yCt.get(this.AYXKKw.dayOfWeek));
        }

        private int KWHzl(int i, int i2) {
            int iFloorMod = Math.floorMod(i - i2, 7);
            return iFloorMod + 1 > this.AYXKKw.getMinimalDaysInFirstWeek() ? 7 - iFloorMod : -iFloorMod;
        }

        private yBW EZpvd(Map map, InterfaceC56351yCd interfaceC56351yCd, int i, long j, int i2, ResolverStyle resolverStyle) {
            yBW ybwPlus;
            yBW ybwDate = interfaceC56351yCd.date(i, 1, 1);
            if (resolverStyle == ResolverStyle.LENIENT) {
                ybwPlus = ybwDate.plus(Math.addExact(Math.multiplyExact(Math.subtractExact(j, AEQbTJ(ybwDate)), 7L), i2 - KWHzl(ybwDate)), (yCF) ChronoUnit.DAYS);
            } else {
                ybwPlus = ybwDate.plus((((int) (((long) this.djBIcL.checkValidIntValue(j, this)) - AEQbTJ(ybwDate))) * 7) + (i2 - KWHzl(ybwDate)), (yCF) ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && ybwPlus.getLong(ChronoField.YEAR) != i) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                }
            }
            map.remove(this);
            map.remove(ChronoField.YEAR);
            map.remove(ChronoField.DAY_OF_WEEK);
            return ybwPlus;
        }

        private yBW AEQbTJ(Map map, InterfaceC56351yCd interfaceC56351yCd, int i, long j, long j2, int i2, ResolverStyle resolverStyle) {
            yBW ybwPlus;
            if (resolverStyle == ResolverStyle.LENIENT) {
                yBW ybwPlus2 = interfaceC56351yCd.date(i, 1, 1).plus(Math.subtractExact(j, 1L), (yCF) ChronoUnit.MONTHS);
                ybwPlus = ybwPlus2.plus(Math.addExact(Math.multiplyExact(Math.subtractExact(j2, EZpvd(ybwPlus2)), 7L), i2 - KWHzl(ybwPlus2)), (yCF) ChronoUnit.DAYS);
            } else {
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                ybwPlus = interfaceC56351yCd.date(i, chronoField.checkValidIntValue(j), 1).plus((((int) (((long) this.djBIcL.checkValidIntValue(j2, this)) - EZpvd(r5))) * 7) + (i2 - KWHzl(r5)), (yCF) ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && ybwPlus.getLong(chronoField) != j) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
            map.remove(this);
            map.remove(ChronoField.YEAR);
            map.remove(ChronoField.MONTH_OF_YEAR);
            map.remove(ChronoField.DAY_OF_WEEK);
            return ybwPlus;
        }

        private yBW AEQbTJ(Map map, InterfaceC56351yCd interfaceC56351yCd, int i, ResolverStyle resolverStyle) {
            yBW ybwOLrzqt;
            int iCheckValidIntValue = this.AYXKKw.weekBasedYear.range().checkValidIntValue(((Long) map.get(this.AYXKKw.weekBasedYear)).longValue(), this.AYXKKw.weekBasedYear);
            if (resolverStyle == ResolverStyle.LENIENT) {
                ybwOLrzqt = OLrzqt(interfaceC56351yCd, iCheckValidIntValue, 1, i).plus(Math.subtractExact(((Long) map.get(this.AYXKKw.weekOfWeekBasedYear)).longValue(), 1L), (yCF) ChronoUnit.WEEKS);
            } else {
                ybwOLrzqt = OLrzqt(interfaceC56351yCd, iCheckValidIntValue, this.AYXKKw.weekOfWeekBasedYear.range().checkValidIntValue(((Long) map.get(this.AYXKKw.weekOfWeekBasedYear)).longValue(), this.AYXKKw.weekOfWeekBasedYear), i);
                if (resolverStyle == ResolverStyle.STRICT && copydefault(ybwOLrzqt) != iCheckValidIntValue) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
            }
            map.remove(this);
            map.remove(this.AYXKKw.weekBasedYear);
            map.remove(this.AYXKKw.weekOfWeekBasedYear);
            map.remove(ChronoField.DAY_OF_WEEK);
            return ybwOLrzqt;
        }

        private ValueRange djBIcL(InterfaceC56365yCr interfaceC56365yCr) {
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            if (!interfaceC56365yCr.isSupported(chronoField)) {
                return KWHzl;
            }
            int iKWHzl = KWHzl(interfaceC56365yCr);
            int i = interfaceC56365yCr.get(chronoField);
            int iKWHzl2 = KWHzl(i, iKWHzl);
            int iEZpvd = EZpvd(iKWHzl2, i);
            if (iEZpvd == 0) {
                return djBIcL(InterfaceC56351yCd.KWHzl(interfaceC56365yCr).date(interfaceC56365yCr).minus(i + 7, (yCF) ChronoUnit.DAYS));
            }
            return iEZpvd >= EZpvd(iKWHzl2, this.AYXKKw.getMinimalDaysInFirstWeek() + ((int) interfaceC56365yCr.range(chronoField).getMaximum())) ? djBIcL(InterfaceC56351yCd.KWHzl(interfaceC56365yCr).date(interfaceC56365yCr).plus((r0 - i) + 8, (yCF) ChronoUnit.DAYS)) : ValueRange.of(1L, r1 - 1);
        }

        private ValueRange KWHzl(InterfaceC56365yCr interfaceC56365yCr, InterfaceC56372yCy interfaceC56372yCy) {
            int iKWHzl = KWHzl(interfaceC56365yCr.get(interfaceC56372yCy), KWHzl(interfaceC56365yCr));
            ValueRange valueRangeRange = interfaceC56365yCr.range(interfaceC56372yCy);
            return ValueRange.of(EZpvd(iKWHzl, (int) valueRangeRange.getMinimum()), EZpvd(iKWHzl, (int) valueRangeRange.getMaximum()));
        }

        static Activity copydefault(WeekFields weekFields) {
            return new Activity("WeekOfYear", weekFields, ChronoUnit.WEEKS, ChronoUnit.YEARS, KWHzl);
        }

        static Activity AEQbTJ(WeekFields weekFields) {
            return new Activity("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, IsoFields.AEQbTJ, OLrzqt);
        }

        static Activity EZpvd(WeekFields weekFields) {
            return new Activity("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, EZpvd);
        }

        static Activity KWHzl(WeekFields weekFields) {
            return new Activity("WeekBasedYear", weekFields, IsoFields.AEQbTJ, ChronoUnit.FOREVER, ChronoField.YEAR.range());
        }

        private yBW OLrzqt(InterfaceC56351yCd interfaceC56351yCd, int i, int i2, int i3) {
            yBW ybwDate = interfaceC56351yCd.date(i, 1, 1);
            int iKWHzl = KWHzl(1, KWHzl(ybwDate));
            return ybwDate.plus((-iKWHzl) + (i3 - 1) + ((Math.min(i2, EZpvd(iKWHzl, ybwDate.lengthOfYear() + this.AYXKKw.getMinimalDaysInFirstWeek()) - 1) - 1) * 7), (yCF) ChronoUnit.DAYS);
        }

        static Activity OLrzqt(WeekFields weekFields) {
            return new Activity("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, copydefault);
        }

        private long AEQbTJ(InterfaceC56365yCr interfaceC56365yCr) {
            int iKWHzl = KWHzl(interfaceC56365yCr);
            int i = interfaceC56365yCr.get(ChronoField.DAY_OF_YEAR);
            return EZpvd(KWHzl(i, iKWHzl), i);
        }

        private int OLrzqt(InterfaceC56365yCr interfaceC56365yCr) {
            int iEZpvd;
            int iKWHzl = KWHzl(interfaceC56365yCr);
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            int i = interfaceC56365yCr.get(chronoField);
            int iKWHzl2 = KWHzl(i, iKWHzl);
            int iEZpvd2 = EZpvd(iKWHzl2, i);
            return iEZpvd2 == 0 ? OLrzqt(InterfaceC56351yCd.KWHzl(interfaceC56365yCr).date(interfaceC56365yCr).minus(i, (yCF) ChronoUnit.DAYS)) : (iEZpvd2 <= 50 || iEZpvd2 < (iEZpvd = EZpvd(iKWHzl2, ((int) interfaceC56365yCr.range(chronoField).getMaximum()) + this.AYXKKw.getMinimalDaysInFirstWeek()))) ? iEZpvd2 : (iEZpvd2 - iEZpvd) + 1;
        }

        private long EZpvd(InterfaceC56365yCr interfaceC56365yCr) {
            int iKWHzl = KWHzl(interfaceC56365yCr);
            int i = interfaceC56365yCr.get(ChronoField.DAY_OF_MONTH);
            return EZpvd(KWHzl(i, iKWHzl), i);
        }

        private int copydefault(InterfaceC56365yCr interfaceC56365yCr) {
            int iKWHzl = KWHzl(interfaceC56365yCr);
            int i = interfaceC56365yCr.get(ChronoField.YEAR);
            ChronoField chronoField = ChronoField.DAY_OF_YEAR;
            int i2 = interfaceC56365yCr.get(chronoField);
            int iKWHzl2 = KWHzl(i2, iKWHzl);
            int iEZpvd = EZpvd(iKWHzl2, i2);
            return iEZpvd == 0 ? i - 1 : iEZpvd >= EZpvd(iKWHzl2, ((int) interfaceC56365yCr.range(chronoField).getMaximum()) + this.AYXKKw.getMinimalDaysInFirstWeek()) ? i + 1 : i;
        }

        private int KWHzl(InterfaceC56365yCr interfaceC56365yCr) {
            return Math.floorMod(interfaceC56365yCr.get(ChronoField.DAY_OF_WEEK) - this.AYXKKw.getFirstDayOfWeek().getValue(), 7) + 1;
        }

        private int KWHzl(int i) {
            return Math.floorMod(i - this.AYXKKw.getFirstDayOfWeek().getValue(), 7) + 1;
        }

        private int EZpvd(int i, int i2) {
            return ((i + 7) + (i2 - 1)) / 7;
        }

        private Activity(String str, WeekFields weekFields, yCF ycf, yCF ycf2, ValueRange valueRange) {
            this.valueOf = str;
            this.AYXKKw = weekFields;
            this.AEQbTJ = ycf;
            this.AhwBna = ycf2;
            this.djBIcL = valueRange;
        }
    }

    public InterfaceC56372yCy weekOfWeekBasedYear() {
        return this.weekOfWeekBasedYear;
    }

    public InterfaceC56372yCy weekOfMonth() {
        return this.weekOfMonth;
    }

    public InterfaceC56372yCy weekBasedYear() {
        return this.weekBasedYear;
    }

    public String toString() {
        return "WeekFields[" + this.firstDayOfWeek + AbstractJsonLexerKt.COMMA + this.minimalDays + AbstractJsonLexerKt.END_LIST;
    }

    public int hashCode() {
        return (this.firstDayOfWeek.ordinal() * 7) + this.minimalDays;
    }

    public int getMinimalDaysInFirstWeek() {
        return this.minimalDays;
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public InterfaceC56372yCy dayOfWeek() {
        return this.dayOfWeek;
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        return of(DayOfWeek.SUNDAY.plus(r4.getFirstDayOfWeek() - 1), Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
    }

    public static WeekFields of(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap concurrentMap = CACHE;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentMap.get(str);
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.firstDayOfWeek = dayOfWeek;
        this.minimalDays = i;
    }
}
