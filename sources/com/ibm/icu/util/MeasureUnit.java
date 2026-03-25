package com.ibm.icu.util;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.text.UnicodeSet;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C7023abX;
import o.C7043acQ;
import o.C7215afd;
import o.C7257agS;

/* JADX INFO: loaded from: classes3.dex */
public class MeasureUnit implements Serializable {
    private static final long serialVersionUID = -1839973855554750484L;
    private MeasureUnitImpl measureUnitImpl;

    @Deprecated
    protected final String subType;

    @Deprecated
    protected final String type;
    private static final Map<String, Map<String, MeasureUnit>> cache = new HashMap();
    private static boolean cacheIsPopulated = false;
    static final UnicodeSet ASCII = new UnicodeSet(97, 122).AYXKKw();
    static final UnicodeSet ASCII_HYPHEN_DIGITS = new UnicodeSet(45, 45, 48, 57, 97, 122).AYXKKw();
    private static Application UNIT_FACTORY = new Application() { // from class: com.ibm.icu.util.MeasureUnit.2
        @Override // com.ibm.icu.util.MeasureUnit.Application
        public MeasureUnit KWHzl(String str, String str2) {
            return new MeasureUnit(str, str2);
        }
    };
    static Application CURRENCY_FACTORY = new Application() { // from class: com.ibm.icu.util.MeasureUnit.5
        @Override // com.ibm.icu.util.MeasureUnit.Application
        public MeasureUnit KWHzl(String str, String str2) {
            return new Currency(str2);
        }
    };
    static Application TIMEUNIT_FACTORY = new Application() { // from class: com.ibm.icu.util.MeasureUnit.1
        @Override // com.ibm.icu.util.MeasureUnit.Application
        public MeasureUnit KWHzl(String str, String str2) {
            return new TimeUnit(str, str2);
        }
    };
    public static final MeasureUnit G_FORCE = internalGetInstance("acceleration", "g-force");
    public static final MeasureUnit METER_PER_SECOND_SQUARED = internalGetInstance("acceleration", "meter-per-square-second");
    public static final MeasureUnit ARC_MINUTE = internalGetInstance(EopTrackEvent.ANGLE, "arc-minute");
    public static final MeasureUnit ARC_SECOND = internalGetInstance(EopTrackEvent.ANGLE, "arc-second");
    public static final MeasureUnit DEGREE = internalGetInstance(EopTrackEvent.ANGLE, "degree");
    public static final MeasureUnit RADIAN = internalGetInstance(EopTrackEvent.ANGLE, "radian");
    public static final MeasureUnit REVOLUTION_ANGLE = internalGetInstance(EopTrackEvent.ANGLE, "revolution");
    public static final MeasureUnit ACRE = internalGetInstance(OtcExtraKeys.AREA, "acre");
    public static final MeasureUnit DUNAM = internalGetInstance(OtcExtraKeys.AREA, "dunam");
    public static final MeasureUnit HECTARE = internalGetInstance(OtcExtraKeys.AREA, "hectare");
    public static final MeasureUnit SQUARE_CENTIMETER = internalGetInstance(OtcExtraKeys.AREA, "square-centimeter");
    public static final MeasureUnit SQUARE_FOOT = internalGetInstance(OtcExtraKeys.AREA, "square-foot");
    public static final MeasureUnit SQUARE_INCH = internalGetInstance(OtcExtraKeys.AREA, "square-inch");
    public static final MeasureUnit SQUARE_KILOMETER = internalGetInstance(OtcExtraKeys.AREA, "square-kilometer");
    public static final MeasureUnit SQUARE_METER = internalGetInstance(OtcExtraKeys.AREA, "square-meter");
    public static final MeasureUnit SQUARE_MILE = internalGetInstance(OtcExtraKeys.AREA, "square-mile");
    public static final MeasureUnit SQUARE_YARD = internalGetInstance(OtcExtraKeys.AREA, "square-yard");
    public static final MeasureUnit KARAT = internalGetInstance("concentr", "karat");
    public static final MeasureUnit MILLIGRAM_PER_DECILITER = internalGetInstance("concentr", "milligram-per-deciliter");
    public static final MeasureUnit MILLIMOLE_PER_LITER = internalGetInstance("concentr", "millimole-per-liter");
    public static final MeasureUnit MOLE = internalGetInstance("concentr", "mole");
    public static final MeasureUnit PERCENT = internalGetInstance("concentr", "percent");
    public static final MeasureUnit PERMILLE = internalGetInstance("concentr", "permille");
    public static final MeasureUnit PART_PER_MILLION = internalGetInstance("concentr", "permillion");
    public static final MeasureUnit PERMYRIAD = internalGetInstance("concentr", "permyriad");
    public static final MeasureUnit LITER_PER_100KILOMETERS = internalGetInstance("consumption", "liter-per-100-kilometer");
    public static final MeasureUnit LITER_PER_KILOMETER = internalGetInstance("consumption", "liter-per-kilometer");
    public static final MeasureUnit MILE_PER_GALLON = internalGetInstance("consumption", "mile-per-gallon");
    public static final MeasureUnit MILE_PER_GALLON_IMPERIAL = internalGetInstance("consumption", "mile-per-gallon-imperial");
    public static final MeasureUnit BIT = internalGetInstance("digital", "bit");
    public static final MeasureUnit BYTE = internalGetInstance("digital", "byte");
    public static final MeasureUnit GIGABIT = internalGetInstance("digital", "gigabit");
    public static final MeasureUnit GIGABYTE = internalGetInstance("digital", "gigabyte");
    public static final MeasureUnit KILOBIT = internalGetInstance("digital", "kilobit");
    public static final MeasureUnit KILOBYTE = internalGetInstance("digital", "kilobyte");
    public static final MeasureUnit MEGABIT = internalGetInstance("digital", "megabit");
    public static final MeasureUnit MEGABYTE = internalGetInstance("digital", "megabyte");
    public static final MeasureUnit PETABYTE = internalGetInstance("digital", "petabyte");
    public static final MeasureUnit TERABIT = internalGetInstance("digital", "terabit");
    public static final MeasureUnit TERABYTE = internalGetInstance("digital", "terabyte");
    public static final MeasureUnit CENTURY = internalGetInstance("duration", "century");
    public static final TimeUnit DAY = (TimeUnit) internalGetInstance("duration", MTPushConstants.NotificationTime.KEY_DAYS);
    public static final MeasureUnit DAY_PERSON = internalGetInstance("duration", "day-person");
    public static final MeasureUnit DECADE = internalGetInstance("duration", "decade");
    public static final TimeUnit HOUR = (TimeUnit) internalGetInstance("duration", "hour");
    public static final MeasureUnit MICROSECOND = internalGetInstance("duration", "microsecond");
    public static final MeasureUnit MILLISECOND = internalGetInstance("duration", "millisecond");
    public static final TimeUnit MINUTE = (TimeUnit) internalGetInstance("duration", "minute");
    public static final TimeUnit MONTH = (TimeUnit) internalGetInstance("duration", "month");
    public static final MeasureUnit MONTH_PERSON = internalGetInstance("duration", "month-person");
    public static final MeasureUnit NANOSECOND = internalGetInstance("duration", "nanosecond");
    public static final TimeUnit SECOND = (TimeUnit) internalGetInstance("duration", "second");
    public static final TimeUnit WEEK = (TimeUnit) internalGetInstance("duration", "week");
    public static final MeasureUnit WEEK_PERSON = internalGetInstance("duration", "week-person");
    public static final TimeUnit YEAR = (TimeUnit) internalGetInstance("duration", "year");
    public static final MeasureUnit YEAR_PERSON = internalGetInstance("duration", "year-person");
    public static final MeasureUnit AMPERE = internalGetInstance("electric", "ampere");
    public static final MeasureUnit MILLIAMPERE = internalGetInstance("electric", "milliampere");
    public static final MeasureUnit OHM = internalGetInstance("electric", "ohm");
    public static final MeasureUnit VOLT = internalGetInstance("electric", "volt");
    public static final MeasureUnit BRITISH_THERMAL_UNIT = internalGetInstance("energy", "british-thermal-unit");
    public static final MeasureUnit CALORIE = internalGetInstance("energy", "calorie");
    public static final MeasureUnit ELECTRONVOLT = internalGetInstance("energy", "electronvolt");
    public static final MeasureUnit FOODCALORIE = internalGetInstance("energy", "foodcalorie");
    public static final MeasureUnit JOULE = internalGetInstance("energy", "joule");
    public static final MeasureUnit KILOCALORIE = internalGetInstance("energy", "kilocalorie");
    public static final MeasureUnit KILOJOULE = internalGetInstance("energy", "kilojoule");
    public static final MeasureUnit KILOWATT_HOUR = internalGetInstance("energy", "kilowatt-hour");
    public static final MeasureUnit THERM_US = internalGetInstance("energy", "therm-us");
    public static final MeasureUnit NEWTON = internalGetInstance("force", "newton");
    public static final MeasureUnit POUND_FORCE = internalGetInstance("force", "pound-force");
    public static final MeasureUnit GIGAHERTZ = internalGetInstance("frequency", "gigahertz");
    public static final MeasureUnit HERTZ = internalGetInstance("frequency", "hertz");
    public static final MeasureUnit KILOHERTZ = internalGetInstance("frequency", "kilohertz");
    public static final MeasureUnit MEGAHERTZ = internalGetInstance("frequency", "megahertz");
    public static final MeasureUnit DOT = internalGetInstance("graphics", "dot");
    public static final MeasureUnit DOT_PER_CENTIMETER = internalGetInstance("graphics", "dot-per-centimeter");
    public static final MeasureUnit DOT_PER_INCH = internalGetInstance("graphics", "dot-per-inch");
    public static final MeasureUnit EM = internalGetInstance("graphics", "em");
    public static final MeasureUnit MEGAPIXEL = internalGetInstance("graphics", "megapixel");
    public static final MeasureUnit PIXEL = internalGetInstance("graphics", "pixel");
    public static final MeasureUnit PIXEL_PER_CENTIMETER = internalGetInstance("graphics", "pixel-per-centimeter");
    public static final MeasureUnit PIXEL_PER_INCH = internalGetInstance("graphics", "pixel-per-inch");
    public static final MeasureUnit ASTRONOMICAL_UNIT = internalGetInstance("length", "astronomical-unit");
    public static final MeasureUnit CENTIMETER = internalGetInstance("length", "centimeter");
    public static final MeasureUnit DECIMETER = internalGetInstance("length", "decimeter");
    public static final MeasureUnit EARTH_RADIUS = internalGetInstance("length", "earth-radius");
    public static final MeasureUnit FATHOM = internalGetInstance("length", "fathom");
    public static final MeasureUnit FOOT = internalGetInstance("length", "foot");
    public static final MeasureUnit FURLONG = internalGetInstance("length", "furlong");
    public static final MeasureUnit INCH = internalGetInstance("length", "inch");
    public static final MeasureUnit KILOMETER = internalGetInstance("length", "kilometer");
    public static final MeasureUnit LIGHT_YEAR = internalGetInstance("length", "light-year");
    public static final MeasureUnit METER = internalGetInstance("length", "meter");
    public static final MeasureUnit MICROMETER = internalGetInstance("length", "micrometer");
    public static final MeasureUnit MILE = internalGetInstance("length", "mile");
    public static final MeasureUnit MILE_SCANDINAVIAN = internalGetInstance("length", "mile-scandinavian");
    public static final MeasureUnit MILLIMETER = internalGetInstance("length", "millimeter");
    public static final MeasureUnit NANOMETER = internalGetInstance("length", "nanometer");
    public static final MeasureUnit NAUTICAL_MILE = internalGetInstance("length", "nautical-mile");
    public static final MeasureUnit PARSEC = internalGetInstance("length", "parsec");
    public static final MeasureUnit PICOMETER = internalGetInstance("length", "picometer");
    public static final MeasureUnit POINT = internalGetInstance("length", "point");
    public static final MeasureUnit SOLAR_RADIUS = internalGetInstance("length", "solar-radius");
    public static final MeasureUnit YARD = internalGetInstance("length", "yard");
    public static final MeasureUnit CANDELA = internalGetInstance("light", "candela");
    public static final MeasureUnit LUMEN = internalGetInstance("light", "lumen");
    public static final MeasureUnit LUX = internalGetInstance("light", "lux");
    public static final MeasureUnit SOLAR_LUMINOSITY = internalGetInstance("light", "solar-luminosity");
    public static final MeasureUnit CARAT = internalGetInstance("mass", "carat");
    public static final MeasureUnit DALTON = internalGetInstance("mass", "dalton");
    public static final MeasureUnit EARTH_MASS = internalGetInstance("mass", "earth-mass");
    public static final MeasureUnit GRAIN = internalGetInstance("mass", "grain");
    public static final MeasureUnit GRAM = internalGetInstance("mass", "gram");
    public static final MeasureUnit KILOGRAM = internalGetInstance("mass", "kilogram");
    public static final MeasureUnit METRIC_TON = internalGetInstance("mass", "metric-ton");
    public static final MeasureUnit MICROGRAM = internalGetInstance("mass", "microgram");
    public static final MeasureUnit MILLIGRAM = internalGetInstance("mass", "milligram");
    public static final MeasureUnit OUNCE = internalGetInstance("mass", "ounce");
    public static final MeasureUnit OUNCE_TROY = internalGetInstance("mass", "ounce-troy");
    public static final MeasureUnit POUND = internalGetInstance("mass", "pound");
    public static final MeasureUnit SOLAR_MASS = internalGetInstance("mass", "solar-mass");
    public static final MeasureUnit STONE = internalGetInstance("mass", "stone");
    public static final MeasureUnit TON = internalGetInstance("mass", "ton");
    public static final MeasureUnit GIGAWATT = internalGetInstance("power", "gigawatt");
    public static final MeasureUnit HORSEPOWER = internalGetInstance("power", "horsepower");
    public static final MeasureUnit KILOWATT = internalGetInstance("power", "kilowatt");
    public static final MeasureUnit MEGAWATT = internalGetInstance("power", "megawatt");
    public static final MeasureUnit MILLIWATT = internalGetInstance("power", "milliwatt");
    public static final MeasureUnit WATT = internalGetInstance("power", "watt");
    public static final MeasureUnit ATMOSPHERE = internalGetInstance("pressure", "atmosphere");
    public static final MeasureUnit BAR = internalGetInstance("pressure", "bar");
    public static final MeasureUnit HECTOPASCAL = internalGetInstance("pressure", "hectopascal");
    public static final MeasureUnit INCH_HG = internalGetInstance("pressure", "inch-ofhg");
    public static final MeasureUnit KILOPASCAL = internalGetInstance("pressure", "kilopascal");
    public static final MeasureUnit MEGAPASCAL = internalGetInstance("pressure", "megapascal");
    public static final MeasureUnit MILLIBAR = internalGetInstance("pressure", "millibar");
    public static final MeasureUnit MILLIMETER_OF_MERCURY = internalGetInstance("pressure", "millimeter-ofhg");
    public static final MeasureUnit PASCAL = internalGetInstance("pressure", "pascal");
    public static final MeasureUnit POUND_PER_SQUARE_INCH = internalGetInstance("pressure", "pound-force-per-square-inch");
    public static final MeasureUnit KILOMETER_PER_HOUR = internalGetInstance("speed", "kilometer-per-hour");
    public static final MeasureUnit KNOT = internalGetInstance("speed", "knot");
    public static final MeasureUnit METER_PER_SECOND = internalGetInstance("speed", "meter-per-second");
    public static final MeasureUnit MILE_PER_HOUR = internalGetInstance("speed", "mile-per-hour");
    public static final MeasureUnit CELSIUS = internalGetInstance("temperature", "celsius");
    public static final MeasureUnit FAHRENHEIT = internalGetInstance("temperature", "fahrenheit");
    public static final MeasureUnit GENERIC_TEMPERATURE = internalGetInstance("temperature", "generic");
    public static final MeasureUnit KELVIN = internalGetInstance("temperature", "kelvin");
    public static final MeasureUnit NEWTON_METER = internalGetInstance("torque", "newton-meter");
    public static final MeasureUnit POUND_FOOT = internalGetInstance("torque", "pound-force-foot");
    public static final MeasureUnit ACRE_FOOT = internalGetInstance("volume", "acre-foot");
    public static final MeasureUnit BARREL = internalGetInstance("volume", "barrel");
    public static final MeasureUnit BUSHEL = internalGetInstance("volume", "bushel");
    public static final MeasureUnit CENTILITER = internalGetInstance("volume", "centiliter");
    public static final MeasureUnit CUBIC_CENTIMETER = internalGetInstance("volume", "cubic-centimeter");
    public static final MeasureUnit CUBIC_FOOT = internalGetInstance("volume", "cubic-foot");
    public static final MeasureUnit CUBIC_INCH = internalGetInstance("volume", "cubic-inch");
    public static final MeasureUnit CUBIC_KILOMETER = internalGetInstance("volume", "cubic-kilometer");
    public static final MeasureUnit CUBIC_METER = internalGetInstance("volume", "cubic-meter");
    public static final MeasureUnit CUBIC_MILE = internalGetInstance("volume", "cubic-mile");
    public static final MeasureUnit CUBIC_YARD = internalGetInstance("volume", "cubic-yard");
    public static final MeasureUnit CUP = internalGetInstance("volume", "cup");
    public static final MeasureUnit CUP_METRIC = internalGetInstance("volume", "cup-metric");
    public static final MeasureUnit DECILITER = internalGetInstance("volume", "deciliter");
    public static final MeasureUnit DESSERT_SPOON = internalGetInstance("volume", "dessert-spoon");
    public static final MeasureUnit DESSERT_SPOON_IMPERIAL = internalGetInstance("volume", "dessert-spoon-imperial");
    public static final MeasureUnit DRAM = internalGetInstance("volume", "dram");
    public static final MeasureUnit DROP = internalGetInstance("volume", "drop");
    public static final MeasureUnit FLUID_OUNCE = internalGetInstance("volume", "fluid-ounce");
    public static final MeasureUnit FLUID_OUNCE_IMPERIAL = internalGetInstance("volume", "fluid-ounce-imperial");
    public static final MeasureUnit GALLON = internalGetInstance("volume", "gallon");
    public static final MeasureUnit GALLON_IMPERIAL = internalGetInstance("volume", "gallon-imperial");
    public static final MeasureUnit HECTOLITER = internalGetInstance("volume", "hectoliter");
    public static final MeasureUnit JIGGER = internalGetInstance("volume", "jigger");
    public static final MeasureUnit LITER = internalGetInstance("volume", "liter");
    public static final MeasureUnit MEGALITER = internalGetInstance("volume", "megaliter");
    public static final MeasureUnit MILLILITER = internalGetInstance("volume", "milliliter");
    public static final MeasureUnit PINCH = internalGetInstance("volume", "pinch");
    public static final MeasureUnit PINT = internalGetInstance("volume", "pint");
    public static final MeasureUnit PINT_METRIC = internalGetInstance("volume", "pint-metric");
    public static final MeasureUnit QUART = internalGetInstance("volume", "quart");
    public static final MeasureUnit QUART_IMPERIAL = internalGetInstance("volume", "quart-imperial");
    public static final MeasureUnit TABLESPOON = internalGetInstance("volume", "tablespoon");
    public static final MeasureUnit TEASPOON = internalGetInstance("volume", "teaspoon");

    @Deprecated
    public interface Application {
        @Deprecated
        MeasureUnit KWHzl(String str, String str2);
    }

    public enum Complexity {
        SINGLE,
        COMPOUND,
        MIXED
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSubtype() {
        return this.subType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getType() {
        return this.type;
    }

    public enum SIPrefix {
        YOTTA(24, "yotta"),
        ZETTA(21, "zetta"),
        EXA(18, "exa"),
        PETA(15, "peta"),
        TERA(12, "tera"),
        GIGA(9, "giga"),
        MEGA(6, "mega"),
        KILO(3, "kilo"),
        HECTO(2, "hecto"),
        DEKA(1, "deka"),
        ONE(0, ""),
        DECI(-1, "deci"),
        CENTI(-2, "centi"),
        MILLI(-3, "milli"),
        MICRO(-6, "micro"),
        NANO(-9, "nano"),
        PICO(-12, "pico"),
        FEMTO(-15, "femto"),
        ATTO(-18, "atto"),
        ZEPTO(-21, "zepto"),
        YOCTO(-24, "yocto");

        private final String identifier;
        private final int power;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public String getIdentifier() {
            return this.identifier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getPower() {
            return this.power;
        }

        SIPrefix(int i, String str) {
            this.power = i;
            this.identifier = str;
        }
    }

    @Deprecated
    public MeasureUnit(String str, String str2) {
        this.type = str;
        this.subType = str2;
    }

    public static MeasureUnit forIdentifier(String str) {
        if (str == null || str.isEmpty()) {
            return C7257agS.AEQbTJ;
        }
        return MeasureUnitImpl.EZpvd(str).AEQbTJ();
    }

    @Deprecated
    public static MeasureUnit fromMeasureUnitImpl(MeasureUnitImpl measureUnitImpl) {
        measureUnitImpl.AYXKKw();
        MeasureUnit measureUnitFindBySubType = findBySubType(measureUnitImpl.KWHzl());
        return measureUnitFindBySubType != null ? measureUnitFindBySubType : new MeasureUnit(measureUnitImpl);
    }

    private MeasureUnit(MeasureUnitImpl measureUnitImpl) {
        this.type = null;
        this.subType = null;
        this.measureUnitImpl = measureUnitImpl.copydefault();
    }

    public String getIdentifier() {
        MeasureUnitImpl measureUnitImpl = this.measureUnitImpl;
        String subtype = measureUnitImpl == null ? getSubtype() : measureUnitImpl.KWHzl();
        return subtype == null ? "" : subtype;
    }

    public Complexity getComplexity() {
        MeasureUnitImpl measureUnitImpl = this.measureUnitImpl;
        if (measureUnitImpl == null) {
            return MeasureUnitImpl.EZpvd(getIdentifier()).OLrzqt();
        }
        return measureUnitImpl.OLrzqt();
    }

    public MeasureUnit withSIPrefix(SIPrefix sIPrefix) {
        C7215afd singleUnitImpl = getSingleUnitImpl();
        singleUnitImpl.copydefault(sIPrefix);
        return singleUnitImpl.AEQbTJ();
    }

    public SIPrefix getSIPrefix() {
        return getSingleUnitImpl().copydefault();
    }

    public int getDimensionality() {
        return getSingleUnitImpl().EZpvd();
    }

    public MeasureUnit withDimensionality(int i) {
        C7215afd singleUnitImpl = getSingleUnitImpl();
        singleUnitImpl.copydefault(i);
        return singleUnitImpl.AEQbTJ();
    }

    public MeasureUnit reciprocal() {
        MeasureUnitImpl copyOfMeasureUnitImpl = getCopyOfMeasureUnitImpl();
        copyOfMeasureUnitImpl.djBIcL();
        return copyOfMeasureUnitImpl.AEQbTJ();
    }

    public MeasureUnit product(MeasureUnit measureUnit) {
        MeasureUnitImpl copyOfMeasureUnitImpl = getCopyOfMeasureUnitImpl();
        if (measureUnit == null) {
            return copyOfMeasureUnitImpl.AEQbTJ();
        }
        MeasureUnitImpl mayBeReferenceOfMeasureUnitImpl = measureUnit.getMayBeReferenceOfMeasureUnitImpl();
        Complexity complexityOLrzqt = copyOfMeasureUnitImpl.OLrzqt();
        Complexity complexity = Complexity.MIXED;
        if (complexityOLrzqt == complexity || mayBeReferenceOfMeasureUnitImpl.OLrzqt() == complexity) {
            throw new UnsupportedOperationException();
        }
        Iterator<C7215afd> it = mayBeReferenceOfMeasureUnitImpl.gEmmrt().iterator();
        while (it.hasNext()) {
            copyOfMeasureUnitImpl.EZpvd(it.next());
        }
        return copyOfMeasureUnitImpl.AEQbTJ();
    }

    public List<MeasureUnit> splitToSingleUnits() {
        ArrayList<C7215afd> arrayListGEmmrt = getMayBeReferenceOfMeasureUnitImpl().gEmmrt();
        ArrayList arrayList = new ArrayList(arrayListGEmmrt.size());
        Iterator<C7215afd> it = arrayListGEmmrt.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().AEQbTJ());
        }
        return arrayList;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.subType.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MeasureUnit) {
            return getIdentifier().equals(((MeasureUnit) obj).getIdentifier());
        }
        return false;
    }

    public String toString() {
        return this.type + "-" + this.subType;
    }

    public static Set<String> getAvailableTypes() {
        Set<String> setUnmodifiableSet;
        synchronized (MeasureUnit.class) {
            populateCache();
            setUnmodifiableSet = Collections.unmodifiableSet(cache.keySet());
        }
        return setUnmodifiableSet;
    }

    public static Set<MeasureUnit> getAvailable(String str) {
        Set<MeasureUnit> setUnmodifiableSet;
        synchronized (MeasureUnit.class) {
            populateCache();
            Map<String, MeasureUnit> map = cache.get(str);
            if (map == null) {
                setUnmodifiableSet = Collections.emptySet();
            } else {
                setUnmodifiableSet = Collections.unmodifiableSet(new C7023abX(map.values()));
            }
        }
        return setUnmodifiableSet;
    }

    public static Set<MeasureUnit> getAvailable() {
        Set<MeasureUnit> setUnmodifiableSet;
        synchronized (MeasureUnit.class) {
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(getAvailableTypes()).iterator();
            while (it.hasNext()) {
                Iterator<MeasureUnit> it2 = getAvailable((String) it.next()).iterator();
                while (it2.hasNext()) {
                    hashSet.add(it2.next());
                }
            }
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return setUnmodifiableSet;
    }

    @Deprecated
    public static MeasureUnit internalGetInstance(String str, String str2) {
        Application application;
        if (str == null || str2 == null) {
            throw new NullPointerException("Type and subType must be non-null");
        }
        if (!"currency".equals(str) && (!ASCII.EZpvd(str) || !ASCII_HYPHEN_DIGITS.EZpvd(str2))) {
            throw new IllegalArgumentException("The type or subType are invalid.");
        }
        if ("currency".equals(str)) {
            application = CURRENCY_FACTORY;
        } else {
            application = "duration".equals(str) ? TIMEUNIT_FACTORY : UNIT_FACTORY;
        }
        return addUnit(str, str2, application);
    }

    private static MeasureUnit findBySubType(String str) {
        populateCache();
        for (Map<String, MeasureUnit> map : cache.values()) {
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        return null;
    }

    public static final class StateListAnimator extends C7043acQ.ActionBar {
        private StateListAnimator() {
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (!application.copydefault("compound") && !application.copydefault("coordinate")) {
                    String string = application.toString();
                    C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                    for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                        MeasureUnit.internalGetInstance(string, application.toString());
                    }
                }
            }
        }
    }

    public static final class Activity extends C7043acQ.ActionBar {
        private Activity() {
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                MeasureUnit.internalGetInstance("currency", application.toString());
            }
        }
    }

    private static void populateCache() {
        if (cacheIsPopulated) {
            return;
        }
        cacheIsPopulated = true;
        ((ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b/unit", "en")).copydefault("units", new StateListAnimator());
        ((ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "currencyNumericCodes", ICUResourceBundle.AEQbTJ)).copydefault("codeMap", new Activity());
    }

    @Deprecated
    public static MeasureUnit addUnit(String str, String str2, Application application) {
        MeasureUnit measureUnitKWHzl;
        synchronized (MeasureUnit.class) {
            Map<String, Map<String, MeasureUnit>> map = cache;
            Map<String, MeasureUnit> map2 = map.get(str);
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(str, map2);
            } else {
                str = map2.entrySet().iterator().next().getValue().type;
            }
            measureUnitKWHzl = map2.get(str2);
            if (measureUnitKWHzl == null) {
                measureUnitKWHzl = application.KWHzl(str, str2);
                map2.put(str2, measureUnitKWHzl);
            }
        }
        return measureUnitKWHzl;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new MeasureUnitProxy(this.type, this.subType);
    }

    private C7215afd getSingleUnitImpl() {
        MeasureUnitImpl measureUnitImpl = this.measureUnitImpl;
        if (measureUnitImpl == null) {
            return MeasureUnitImpl.EZpvd(getIdentifier()).AhwBna();
        }
        return measureUnitImpl.AhwBna();
    }

    private MeasureUnitImpl getCopyOfMeasureUnitImpl() {
        MeasureUnitImpl measureUnitImpl = this.measureUnitImpl;
        if (measureUnitImpl == null) {
            return MeasureUnitImpl.EZpvd(getIdentifier());
        }
        return measureUnitImpl.copydefault();
    }

    private MeasureUnitImpl getMayBeReferenceOfMeasureUnitImpl() {
        MeasureUnitImpl measureUnitImpl = this.measureUnitImpl;
        return measureUnitImpl == null ? MeasureUnitImpl.EZpvd(getIdentifier()) : measureUnitImpl;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class MeasureUnitProxy implements Externalizable {
        private static final long serialVersionUID = -3910681415330989598L;
        private String subType;
        private String type;

        public MeasureUnitProxy(String str, String str2) {
            this.type = str;
            this.subType = str2;
        }

        public MeasureUnitProxy() {
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(0);
            objectOutput.writeUTF(this.type);
            objectOutput.writeUTF(this.subType);
            objectOutput.writeShort(0);
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            objectInput.readByte();
            this.type = objectInput.readUTF();
            this.subType = objectInput.readUTF();
            int i = objectInput.readShort();
            if (i > 0) {
                objectInput.read(new byte[i], 0, i);
            }
        }

        private Object readResolve() throws ObjectStreamException {
            return MeasureUnit.internalGetInstance(this.type, this.subType);
        }
    }
}
