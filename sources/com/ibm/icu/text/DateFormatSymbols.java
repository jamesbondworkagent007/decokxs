package com.ibm.icu.text;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.TimeZoneNames;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeMap;
import o.AbstractC7013abN;
import o.AbstractC7078acz;
import o.C7011abL;
import o.C7043acQ;
import o.C7045acS;
import o.C7260agV;
import o.C7275agk;

/* JADX INFO: loaded from: classes3.dex */
public class DateFormatSymbols implements Serializable, Cloneable {
    public static final int ABBREVIATED = 0;
    static final String ALTERNATE_TIME_SEPARATOR = ".";
    private static final String[][] CALENDAR_CLASSES = {new String[]{"GregorianCalendar", "gregorian"}, new String[]{"JapaneseCalendar", "japanese"}, new String[]{"BuddhistCalendar", "buddhist"}, new String[]{"TaiwanCalendar", "roc"}, new String[]{"PersianCalendar", "persian"}, new String[]{"IslamicCalendar", "islamic"}, new String[]{"HebrewCalendar", "hebrew"}, new String[]{"ChineseCalendar", "chinese"}, new String[]{"IndianCalendar", "indian"}, new String[]{"CopticCalendar", "coptic"}, new String[]{"EthiopicCalendar", "ethiopic"}};
    private static final String[] DAY_PERIOD_KEYS;
    static final String DEFAULT_TIME_SEPARATOR = ":";
    private static AbstractC7013abN<String, DateFormatSymbols, ULocale> DFSCACHE = null;

    @Deprecated
    public static final int DT_CONTEXT_COUNT = 3;
    static final int DT_LEAP_MONTH_PATTERN_FORMAT_ABBREV = 1;
    static final int DT_LEAP_MONTH_PATTERN_FORMAT_NARROW = 2;
    static final int DT_LEAP_MONTH_PATTERN_FORMAT_WIDE = 0;
    static final int DT_LEAP_MONTH_PATTERN_NUMERIC = 6;
    static final int DT_LEAP_MONTH_PATTERN_STANDALONE_ABBREV = 4;
    static final int DT_LEAP_MONTH_PATTERN_STANDALONE_NARROW = 5;
    static final int DT_LEAP_MONTH_PATTERN_STANDALONE_WIDE = 3;
    static final int DT_MONTH_PATTERN_COUNT = 7;

    @Deprecated
    public static final int DT_WIDTH_COUNT = 4;
    public static final int FORMAT = 0;
    private static final String[] LEAP_MONTH_PATTERNS_PATHS;
    public static final int NARROW = 2;

    @Deprecated
    public static final int NUMERIC = 2;
    public static final int SHORT = 3;
    public static final int STANDALONE = 1;
    public static final int WIDE = 1;
    private static final Map<String, CapitalizationContextUsage> contextUsageTypeMap;
    static final int millisPerHour = 3600000;
    static final String patternChars = "GyMdkHmsSEDFwWahKzYeugAZvcLQqVUOXxrbB";
    private static final long serialVersionUID = -5987973545549424702L;
    String[] abbreviatedDayPeriods;
    private ULocale actualLocale;
    String[] ampms;
    String[] ampmsNarrow;
    Map<CapitalizationContextUsage, boolean[]> capitalization;
    String[] eraNames;
    String[] eras;
    String[] leapMonthPatterns;
    String localPatternChars;
    String[] months;
    String[] narrowDayPeriods;
    String[] narrowEras;
    String[] narrowMonths;
    String[] narrowWeekdays;
    String[] quarters;
    private ULocale requestedLocale;
    String[] shortMonths;
    String[] shortQuarters;
    String[] shortWeekdays;
    String[] shortYearNames;
    String[] shortZodiacNames;
    String[] shorterWeekdays;
    String[] standaloneAbbreviatedDayPeriods;
    String[] standaloneMonths;
    String[] standaloneNarrowDayPeriods;
    String[] standaloneNarrowMonths;
    String[] standaloneNarrowWeekdays;
    String[] standaloneQuarters;
    String[] standaloneShortMonths;
    String[] standaloneShortQuarters;
    String[] standaloneShortWeekdays;
    String[] standaloneShorterWeekdays;
    String[] standaloneWeekdays;
    String[] standaloneWideDayPeriods;
    private String timeSeparator;
    private ULocale validLocale;
    String[] weekdays;
    String[] wideDayPeriods;
    private String[][] zoneStrings;

    public enum CapitalizationContextUsage {
        OTHER,
        MONTH_FORMAT,
        MONTH_STANDALONE,
        MONTH_NARROW,
        DAY_FORMAT,
        DAY_STANDALONE,
        DAY_NARROW,
        ERA_WIDE,
        ERA_ABBREV,
        ERA_NARROW,
        ZONE_LONG,
        ZONE_SHORT,
        METAZONE_LONG,
        METAZONE_SHORT
    }

    @Deprecated
    public static ResourceBundle getDateFormatBundle(Calendar calendar, ULocale uLocale) throws MissingResourceException {
        return null;
    }

    @Deprecated
    public static ResourceBundle getDateFormatBundle(Calendar calendar, Locale locale) throws MissingResourceException {
        return null;
    }

    @Deprecated
    public static ResourceBundle getDateFormatBundle(Class<? extends Calendar> cls, ULocale uLocale) throws MissingResourceException {
        return null;
    }

    @Deprecated
    public static ResourceBundle getDateFormatBundle(Class<? extends Calendar> cls, Locale locale) throws MissingResourceException {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLocalPatternChars() {
        return this.localPatternChars;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public String getTimeSeparatorString() {
        return this.timeSeparator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLocalPatternChars(String str) {
        this.localPatternChars = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public void setTimeSeparatorString(String str) {
        this.timeSeparator = str;
    }

    public DateFormatSymbols() {
        this(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public DateFormatSymbols(Locale locale) {
        this(ULocale.forLocale(locale));
    }

    public DateFormatSymbols(ULocale uLocale) {
        this.eras = null;
        this.eraNames = null;
        this.narrowEras = null;
        this.months = null;
        this.shortMonths = null;
        this.narrowMonths = null;
        this.standaloneMonths = null;
        this.standaloneShortMonths = null;
        this.standaloneNarrowMonths = null;
        this.weekdays = null;
        this.shortWeekdays = null;
        this.shorterWeekdays = null;
        this.narrowWeekdays = null;
        this.standaloneWeekdays = null;
        this.standaloneShortWeekdays = null;
        this.standaloneShorterWeekdays = null;
        this.standaloneNarrowWeekdays = null;
        this.ampms = null;
        this.ampmsNarrow = null;
        this.timeSeparator = null;
        this.shortQuarters = null;
        this.quarters = null;
        this.standaloneShortQuarters = null;
        this.standaloneQuarters = null;
        this.leapMonthPatterns = null;
        this.shortYearNames = null;
        this.shortZodiacNames = null;
        this.zoneStrings = null;
        this.localPatternChars = null;
        this.abbreviatedDayPeriods = null;
        this.wideDayPeriods = null;
        this.narrowDayPeriods = null;
        this.standaloneAbbreviatedDayPeriods = null;
        this.standaloneWideDayPeriods = null;
        this.standaloneNarrowDayPeriods = null;
        this.capitalization = null;
        initializeData(uLocale, C7011abL.copydefault(uLocale));
    }

    public static DateFormatSymbols getInstance() {
        return new DateFormatSymbols();
    }

    public static DateFormatSymbols getInstance(Locale locale) {
        return new DateFormatSymbols(locale);
    }

    public static DateFormatSymbols getInstance(ULocale uLocale) {
        return new DateFormatSymbols(uLocale);
    }

    public static Locale[] getAvailableLocales() {
        return ICUResourceBundle.copydefault();
    }

    public static ULocale[] getAvailableULocales() {
        return ICUResourceBundle.OLrzqt();
    }

    static {
        HashMap map = new HashMap();
        contextUsageTypeMap = map;
        map.put("month-format-except-narrow", CapitalizationContextUsage.MONTH_FORMAT);
        map.put("month-standalone-except-narrow", CapitalizationContextUsage.MONTH_STANDALONE);
        map.put("month-narrow", CapitalizationContextUsage.MONTH_NARROW);
        map.put("day-format-except-narrow", CapitalizationContextUsage.DAY_FORMAT);
        map.put("day-standalone-except-narrow", CapitalizationContextUsage.DAY_STANDALONE);
        map.put("day-narrow", CapitalizationContextUsage.DAY_NARROW);
        map.put("era-name", CapitalizationContextUsage.ERA_WIDE);
        map.put("era-abbr", CapitalizationContextUsage.ERA_ABBREV);
        map.put("era-narrow", CapitalizationContextUsage.ERA_NARROW);
        map.put("zone-long", CapitalizationContextUsage.ZONE_LONG);
        map.put("zone-short", CapitalizationContextUsage.ZONE_SHORT);
        map.put("metazone-long", CapitalizationContextUsage.METAZONE_LONG);
        map.put("metazone-short", CapitalizationContextUsage.METAZONE_SHORT);
        DFSCACHE = new AbstractC7078acz<String, DateFormatSymbols, ULocale>() { // from class: com.ibm.icu.text.DateFormatSymbols.2
            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // o.AbstractC7013abN
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public DateFormatSymbols copydefault(String str, ULocale uLocale) {
                int iIndexOf = str.indexOf(43) + 1;
                int iIndexOf2 = str.indexOf(43, iIndexOf);
                if (iIndexOf2 < 0) {
                    iIndexOf2 = str.length();
                }
                return new DateFormatSymbols(uLocale, null, str.substring(iIndexOf, iIndexOf2));
            }
        };
        LEAP_MONTH_PATTERNS_PATHS = new String[]{"monthPatterns/format/wide", "monthPatterns/format/abbreviated", "monthPatterns/format/narrow", "monthPatterns/stand-alone/wide", "monthPatterns/stand-alone/abbreviated", "monthPatterns/stand-alone/narrow", "monthPatterns/numeric/all"};
        DAY_PERIOD_KEYS = new String[]{"midnight", "noon", "morning1", "afternoon1", "evening1", "night1", "morning2", "afternoon2", "evening2", "night2"};
    }

    public String[] getEras() {
        return duplicate(this.eras);
    }

    public void setEras(String[] strArr) {
        this.eras = duplicate(strArr);
    }

    public String[] getEraNames() {
        return duplicate(this.eraNames);
    }

    public void setEraNames(String[] strArr) {
        this.eraNames = duplicate(strArr);
    }

    public String[] getNarrowEras() {
        return duplicate(this.narrowEras);
    }

    public void setNarrowEras(String[] strArr) {
        this.narrowEras = duplicate(strArr);
    }

    public String[] getMonths() {
        return duplicate(this.months);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] getMonths(int i, int i2) {
        String[] strArr;
        if (i != 0) {
            if (i == 1) {
                if (i2 == 0) {
                    strArr = this.standaloneShortMonths;
                } else if (i2 == 1) {
                    strArr = this.standaloneMonths;
                } else if (i2 == 2) {
                    strArr = this.standaloneNarrowMonths;
                } else if (i2 != 3) {
                    strArr = null;
                }
            }
        } else if (i2 == 0) {
            strArr = this.shortMonths;
        } else if (i2 == 1) {
            strArr = this.months;
        } else if (i2 == 2) {
            strArr = this.narrowMonths;
        } else if (i2 != 3) {
        }
        if (strArr == null) {
            throw new IllegalArgumentException("Bad context or width argument");
        }
        return duplicate(strArr);
    }

    public void setMonths(String[] strArr) {
        this.months = duplicate(strArr);
    }

    public void setMonths(String[] strArr, int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                this.shortMonths = duplicate(strArr);
                return;
            } else if (i2 == 1) {
                this.months = duplicate(strArr);
                return;
            } else {
                if (i2 != 2) {
                    return;
                }
                this.narrowMonths = duplicate(strArr);
                return;
            }
        }
        if (i != 1) {
            return;
        }
        if (i2 == 0) {
            this.standaloneShortMonths = duplicate(strArr);
        } else if (i2 == 1) {
            this.standaloneMonths = duplicate(strArr);
        } else {
            if (i2 != 2) {
                return;
            }
            this.standaloneNarrowMonths = duplicate(strArr);
        }
    }

    public String[] getShortMonths() {
        return duplicate(this.shortMonths);
    }

    public void setShortMonths(String[] strArr) {
        this.shortMonths = duplicate(strArr);
    }

    public String[] getWeekdays() {
        return duplicate(this.weekdays);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] getWeekdays(int i, int i2) {
        String[] strArr;
        if (i != 0) {
            if (i == 1) {
                if (i2 == 0) {
                    strArr = this.standaloneShortWeekdays;
                } else if (i2 == 1) {
                    strArr = this.standaloneWeekdays;
                } else if (i2 == 2) {
                    strArr = this.standaloneNarrowWeekdays;
                } else if (i2 != 3) {
                    strArr = null;
                } else {
                    strArr = this.standaloneShorterWeekdays;
                    if (strArr == null) {
                    }
                }
            }
        } else if (i2 == 0) {
            strArr = this.shortWeekdays;
        } else if (i2 == 1) {
            strArr = this.weekdays;
        } else if (i2 == 2) {
            strArr = this.narrowWeekdays;
        } else if (i2 == 3) {
            strArr = this.shorterWeekdays;
            if (strArr == null) {
            }
        }
        if (strArr == null) {
            throw new IllegalArgumentException("Bad context or width argument");
        }
        return duplicate(strArr);
    }

    public void setWeekdays(String[] strArr, int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                this.shortWeekdays = duplicate(strArr);
                return;
            }
            if (i2 == 1) {
                this.weekdays = duplicate(strArr);
                return;
            } else if (i2 == 2) {
                this.narrowWeekdays = duplicate(strArr);
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                this.shorterWeekdays = duplicate(strArr);
                return;
            }
        }
        if (i != 1) {
            return;
        }
        if (i2 == 0) {
            this.standaloneShortWeekdays = duplicate(strArr);
            return;
        }
        if (i2 == 1) {
            this.standaloneWeekdays = duplicate(strArr);
        } else if (i2 == 2) {
            this.standaloneNarrowWeekdays = duplicate(strArr);
        } else {
            if (i2 != 3) {
                return;
            }
            this.standaloneShorterWeekdays = duplicate(strArr);
        }
    }

    public void setWeekdays(String[] strArr) {
        this.weekdays = duplicate(strArr);
    }

    public String[] getShortWeekdays() {
        return duplicate(this.shortWeekdays);
    }

    public void setShortWeekdays(String[] strArr) {
        this.shortWeekdays = duplicate(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String[] getQuarters(int i, int i2) {
        String[] strArr;
        if (i != 0) {
            if (i == 1) {
                if (i2 == 0) {
                    strArr = this.standaloneShortQuarters;
                } else if (i2 == 1) {
                    strArr = this.standaloneQuarters;
                } else if (i2 == 2 || i2 != 3) {
                    strArr = null;
                }
            }
        } else if (i2 == 0) {
            strArr = this.shortQuarters;
        } else if (i2 == 1) {
            strArr = this.quarters;
        } else if (i2 == 2 || i2 != 3) {
        }
        if (strArr == null) {
            throw new IllegalArgumentException("Bad context or width argument");
        }
        return duplicate(strArr);
    }

    public void setQuarters(String[] strArr, int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                this.shortQuarters = duplicate(strArr);
                return;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.quarters = duplicate(strArr);
                return;
            }
        }
        if (i != 1) {
            return;
        }
        if (i2 == 0) {
            this.standaloneShortQuarters = duplicate(strArr);
        } else {
            if (i2 != 1) {
                return;
            }
            this.standaloneQuarters = duplicate(strArr);
        }
    }

    public String[] getYearNames(int i, int i2) {
        String[] strArr = this.shortYearNames;
        if (strArr != null) {
            return duplicate(strArr);
        }
        return null;
    }

    public void setYearNames(String[] strArr, int i, int i2) {
        if (i == 0 && i2 == 0) {
            this.shortYearNames = duplicate(strArr);
        }
    }

    public String[] getZodiacNames(int i, int i2) {
        String[] strArr = this.shortZodiacNames;
        if (strArr != null) {
            return duplicate(strArr);
        }
        return null;
    }

    public void setZodiacNames(String[] strArr, int i, int i2) {
        if (i == 0 && i2 == 0) {
            this.shortZodiacNames = duplicate(strArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getLeapMonthPattern(int i, int i2) {
        String[] strArr = this.leapMonthPatterns;
        if (strArr == null) {
            return null;
        }
        byte b = -1;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    b = 6;
                }
            } else if (i2 == 0) {
                b = 1;
            } else if (i2 == 1) {
                b = 3;
            } else if (i2 == 2) {
                b = 5;
            } else if (i2 == 3) {
            }
        } else if (i2 != 0) {
            if (i2 == 1) {
                b = 0;
            } else if (i2 == 2) {
                b = 2;
            } else if (i2 == 3) {
            }
        }
        if (b < 0) {
            throw new IllegalArgumentException("Bad context or width argument");
        }
        return strArr[b];
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setLeapMonthPattern(String str, int i, int i2) {
        String[] strArr = this.leapMonthPatterns;
        if (strArr != null) {
            byte b = 1;
            if (i != 0) {
                if (i != 1) {
                    b = i != 2 ? (byte) -1 : (byte) 6;
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        b = 3;
                    } else if (i2 == 2) {
                        b = 5;
                    }
                }
            } else if (i2 != 0) {
                if (i2 == 1) {
                    b = 0;
                } else if (i2 == 2) {
                    b = 2;
                }
            }
            if (b >= 0) {
                strArr[b] = str;
            }
        }
    }

    public String[] getAmPmStrings() {
        return duplicate(this.ampms);
    }

    public void setAmPmStrings(String[] strArr) {
        this.ampms = duplicate(strArr);
    }

    public String[][] getZoneStrings() {
        String[][] strArr = this.zoneStrings;
        if (strArr != null) {
            return duplicate(strArr);
        }
        String[] availableIDs = TimeZone.getAvailableIDs();
        TimeZoneNames timeZoneNames = TimeZoneNames.getInstance(this.validLocale);
        timeZoneNames.loadAllDisplayNames();
        TimeZoneNames.NameType[] nameTypeArr = {TimeZoneNames.NameType.LONG_STANDARD, TimeZoneNames.NameType.SHORT_STANDARD, TimeZoneNames.NameType.LONG_DAYLIGHT, TimeZoneNames.NameType.SHORT_DAYLIGHT};
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, availableIDs.length, 5);
        for (int i = 0; i < availableIDs.length; i++) {
            String canonicalID = TimeZone.getCanonicalID(availableIDs[i]);
            if (canonicalID == null) {
                canonicalID = availableIDs[i];
            }
            strArr2[i][0] = availableIDs[i];
            timeZoneNames.getDisplayNames(canonicalID, nameTypeArr, jCurrentTimeMillis, strArr2[i], 1);
        }
        this.zoneStrings = strArr2;
        return strArr2;
    }

    public void setZoneStrings(String[][] strArr) {
        this.zoneStrings = duplicate(strArr);
    }

    public Object clone() {
        try {
            return (DateFormatSymbols) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    public int hashCode() {
        return this.requestedLocale.toString().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DateFormatSymbols dateFormatSymbols = (DateFormatSymbols) obj;
        return C7045acS.EZpvd(this.eras, dateFormatSymbols.eras) && C7045acS.EZpvd(this.eraNames, dateFormatSymbols.eraNames) && C7045acS.EZpvd(this.narrowEras, dateFormatSymbols.narrowEras) && C7045acS.EZpvd(this.months, dateFormatSymbols.months) && C7045acS.EZpvd(this.shortMonths, dateFormatSymbols.shortMonths) && C7045acS.EZpvd(this.narrowMonths, dateFormatSymbols.narrowMonths) && C7045acS.EZpvd(this.standaloneMonths, dateFormatSymbols.standaloneMonths) && C7045acS.EZpvd(this.standaloneShortMonths, dateFormatSymbols.standaloneShortMonths) && C7045acS.EZpvd(this.standaloneNarrowMonths, dateFormatSymbols.standaloneNarrowMonths) && C7045acS.EZpvd(this.weekdays, dateFormatSymbols.weekdays) && C7045acS.EZpvd(this.shortWeekdays, dateFormatSymbols.shortWeekdays) && C7045acS.EZpvd(this.shorterWeekdays, dateFormatSymbols.shorterWeekdays) && C7045acS.EZpvd(this.narrowWeekdays, dateFormatSymbols.narrowWeekdays) && C7045acS.EZpvd(this.standaloneWeekdays, dateFormatSymbols.standaloneWeekdays) && C7045acS.EZpvd(this.standaloneShortWeekdays, dateFormatSymbols.standaloneShortWeekdays) && C7045acS.EZpvd(this.standaloneShorterWeekdays, dateFormatSymbols.standaloneShorterWeekdays) && C7045acS.EZpvd(this.standaloneNarrowWeekdays, dateFormatSymbols.standaloneNarrowWeekdays) && C7045acS.EZpvd(this.ampms, dateFormatSymbols.ampms) && C7045acS.EZpvd(this.ampmsNarrow, dateFormatSymbols.ampmsNarrow) && C7045acS.EZpvd(this.abbreviatedDayPeriods, dateFormatSymbols.abbreviatedDayPeriods) && C7045acS.EZpvd(this.wideDayPeriods, dateFormatSymbols.wideDayPeriods) && C7045acS.EZpvd(this.narrowDayPeriods, dateFormatSymbols.narrowDayPeriods) && C7045acS.EZpvd(this.standaloneAbbreviatedDayPeriods, dateFormatSymbols.standaloneAbbreviatedDayPeriods) && C7045acS.EZpvd(this.standaloneWideDayPeriods, dateFormatSymbols.standaloneWideDayPeriods) && C7045acS.EZpvd(this.standaloneNarrowDayPeriods, dateFormatSymbols.standaloneNarrowDayPeriods) && C7045acS.copydefault(this.timeSeparator, dateFormatSymbols.timeSeparator) && arrayOfArrayEquals(this.zoneStrings, dateFormatSymbols.zoneStrings) && this.requestedLocale.getDisplayName().equals(dateFormatSymbols.requestedLocale.getDisplayName()) && C7045acS.copydefault(this.localPatternChars, dateFormatSymbols.localPatternChars);
    }

    public void initializeData(ULocale uLocale, String str) {
        String str2 = uLocale.getBaseName() + '+' + str;
        String keywordValue = uLocale.getKeywordValue("numbers");
        if (keywordValue != null && keywordValue.length() > 0) {
            str2 = str2 + '+' + keywordValue;
        }
        initializeData(DFSCACHE.AEQbTJ(str2, uLocale));
    }

    public void initializeData(DateFormatSymbols dateFormatSymbols) {
        this.eras = dateFormatSymbols.eras;
        this.eraNames = dateFormatSymbols.eraNames;
        this.narrowEras = dateFormatSymbols.narrowEras;
        this.months = dateFormatSymbols.months;
        this.shortMonths = dateFormatSymbols.shortMonths;
        this.narrowMonths = dateFormatSymbols.narrowMonths;
        this.standaloneMonths = dateFormatSymbols.standaloneMonths;
        this.standaloneShortMonths = dateFormatSymbols.standaloneShortMonths;
        this.standaloneNarrowMonths = dateFormatSymbols.standaloneNarrowMonths;
        this.weekdays = dateFormatSymbols.weekdays;
        this.shortWeekdays = dateFormatSymbols.shortWeekdays;
        this.shorterWeekdays = dateFormatSymbols.shorterWeekdays;
        this.narrowWeekdays = dateFormatSymbols.narrowWeekdays;
        this.standaloneWeekdays = dateFormatSymbols.standaloneWeekdays;
        this.standaloneShortWeekdays = dateFormatSymbols.standaloneShortWeekdays;
        this.standaloneShorterWeekdays = dateFormatSymbols.standaloneShorterWeekdays;
        this.standaloneNarrowWeekdays = dateFormatSymbols.standaloneNarrowWeekdays;
        this.ampms = dateFormatSymbols.ampms;
        this.ampmsNarrow = dateFormatSymbols.ampmsNarrow;
        this.timeSeparator = dateFormatSymbols.timeSeparator;
        this.shortQuarters = dateFormatSymbols.shortQuarters;
        this.quarters = dateFormatSymbols.quarters;
        this.standaloneShortQuarters = dateFormatSymbols.standaloneShortQuarters;
        this.standaloneQuarters = dateFormatSymbols.standaloneQuarters;
        this.leapMonthPatterns = dateFormatSymbols.leapMonthPatterns;
        this.shortYearNames = dateFormatSymbols.shortYearNames;
        this.shortZodiacNames = dateFormatSymbols.shortZodiacNames;
        this.abbreviatedDayPeriods = dateFormatSymbols.abbreviatedDayPeriods;
        this.wideDayPeriods = dateFormatSymbols.wideDayPeriods;
        this.narrowDayPeriods = dateFormatSymbols.narrowDayPeriods;
        this.standaloneAbbreviatedDayPeriods = dateFormatSymbols.standaloneAbbreviatedDayPeriods;
        this.standaloneWideDayPeriods = dateFormatSymbols.standaloneWideDayPeriods;
        this.standaloneNarrowDayPeriods = dateFormatSymbols.standaloneNarrowDayPeriods;
        this.zoneStrings = dateFormatSymbols.zoneStrings;
        this.localPatternChars = dateFormatSymbols.localPatternChars;
        this.capitalization = dateFormatSymbols.capitalization;
        this.actualLocale = dateFormatSymbols.actualLocale;
        this.validLocale = dateFormatSymbols.validLocale;
        this.requestedLocale = dateFormatSymbols.requestedLocale;
    }

    public static final class CalendarDataSink extends C7043acQ.ActionBar {
        public String OLrzqt;
        public Set<String> djBIcL;
        public Map<String, String[]> AEQbTJ = new TreeMap();
        public Map<String, Map<String, String>> KWHzl = new TreeMap();
        public List<String> copydefault = new ArrayList();
        public String EZpvd = null;
        public String gEmmrt = null;

        public enum AliasType {
            SAME_CALENDAR,
            DIFFERENT_CALENDAR,
            GREGORIAN,
            NONE
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt() {
            this.djBIcL = null;
        }

        public void copydefault(String str) {
            this.EZpvd = str;
            this.gEmmrt = null;
            this.copydefault.clear();
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            HashSet hashSet = null;
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                String string = application.toString();
                AliasType aliasTypeCopydefault = copydefault(string, taskDescription);
                if (aliasTypeCopydefault != AliasType.GREGORIAN) {
                    if (aliasTypeCopydefault == AliasType.DIFFERENT_CALENDAR) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(this.OLrzqt);
                    } else if (aliasTypeCopydefault == AliasType.SAME_CALENDAR) {
                        if (!this.AEQbTJ.containsKey(string) && !this.KWHzl.containsKey(string)) {
                            this.copydefault.add(this.OLrzqt);
                            this.copydefault.add(string);
                        }
                    } else {
                        Set<String> set = this.djBIcL;
                        if (set == null || set.isEmpty() || this.djBIcL.contains(string) || string.equals("AmPmMarkersAbbr")) {
                            if (string.startsWith("AmPmMarkers")) {
                                if (!string.endsWith("%variant") && !this.AEQbTJ.containsKey(string)) {
                                    this.AEQbTJ.put(string, taskDescription.gEmmrt());
                                }
                            } else if (string.equals("eras") || string.equals("dayNames") || string.equals("monthNames") || string.equals("quarters") || string.equals("dayPeriod") || string.equals("monthPatterns") || string.equals("cyclicNameSets")) {
                                EZpvd(string, application, taskDescription);
                            }
                        }
                    }
                }
            }
            do {
                int i2 = 0;
                boolean z2 = false;
                while (i2 < this.copydefault.size()) {
                    String str = this.copydefault.get(i2);
                    if (this.AEQbTJ.containsKey(str)) {
                        this.AEQbTJ.put(this.copydefault.get(i2 + 1), this.AEQbTJ.get(str));
                    } else if (this.KWHzl.containsKey(str)) {
                        this.KWHzl.put(this.copydefault.get(i2 + 1), this.KWHzl.get(str));
                    } else {
                        i2 += 2;
                    }
                    this.copydefault.remove(i2 + 1);
                    this.copydefault.remove(i2);
                    z2 = true;
                }
                if (!z2) {
                    break;
                }
            } while (!this.copydefault.isEmpty());
            if (hashSet != null) {
                this.djBIcL = hashSet;
            }
        }

        public void EZpvd(String str, C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            HashMap map = null;
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (!application.KWHzl("%variant")) {
                    String string = application.toString();
                    if (taskDescription.AhwBna() == 0) {
                        if (i == 0) {
                            map = new HashMap();
                            this.KWHzl.put(str, map);
                        }
                        map.put(string, taskDescription.djBIcL());
                    } else {
                        String str2 = str + "/" + string;
                        if ((!str2.startsWith("cyclicNameSets") || "cyclicNameSets/years/format/abbreviated".startsWith(str2) || "cyclicNameSets/zodiacs/format/abbreviated".startsWith(str2) || "cyclicNameSets/dayParts/format/abbreviated".startsWith(str2)) && !this.AEQbTJ.containsKey(str2) && !this.KWHzl.containsKey(str2)) {
                            if (copydefault(str2, taskDescription) == AliasType.SAME_CALENDAR) {
                                this.copydefault.add(this.OLrzqt);
                                this.copydefault.add(str2);
                            } else if (taskDescription.AhwBna() == 8) {
                                this.AEQbTJ.put(str2, taskDescription.gEmmrt());
                            } else if (taskDescription.AhwBna() == 2) {
                                EZpvd(str2, application, taskDescription);
                            }
                        }
                    }
                }
            }
        }

        public final AliasType copydefault(String str, C7043acQ.TaskDescription taskDescription) {
            int iIndexOf;
            if (taskDescription.AhwBna() == 3) {
                String strAEQbTJ = taskDescription.AEQbTJ();
                if (strAEQbTJ.startsWith("/LOCALE/calendar/") && strAEQbTJ.length() > 17 && (iIndexOf = strAEQbTJ.indexOf(47, 17)) > 17) {
                    String strSubstring = strAEQbTJ.substring(17, iIndexOf);
                    this.OLrzqt = strAEQbTJ.substring(iIndexOf + 1);
                    if (this.EZpvd.equals(strSubstring) && !str.equals(this.OLrzqt)) {
                        return AliasType.SAME_CALENDAR;
                    }
                    if (!this.EZpvd.equals(strSubstring) && str.equals(this.OLrzqt)) {
                        if (strSubstring.equals("gregorian")) {
                            return AliasType.GREGORIAN;
                        }
                        String str2 = this.gEmmrt;
                        if (str2 == null || str2.equals(strSubstring)) {
                            this.gEmmrt = strSubstring;
                            return AliasType.DIFFERENT_CALENDAR;
                        }
                    }
                }
                throw new ICUException("Malformed 'calendar' alias. Path: " + strAEQbTJ);
            }
            return AliasType.NONE;
        }
    }

    private DateFormatSymbols(ULocale uLocale, ICUResourceBundle iCUResourceBundle, String str) {
        this.eras = null;
        this.eraNames = null;
        this.narrowEras = null;
        this.months = null;
        this.shortMonths = null;
        this.narrowMonths = null;
        this.standaloneMonths = null;
        this.standaloneShortMonths = null;
        this.standaloneNarrowMonths = null;
        this.weekdays = null;
        this.shortWeekdays = null;
        this.shorterWeekdays = null;
        this.narrowWeekdays = null;
        this.standaloneWeekdays = null;
        this.standaloneShortWeekdays = null;
        this.standaloneShorterWeekdays = null;
        this.standaloneNarrowWeekdays = null;
        this.ampms = null;
        this.ampmsNarrow = null;
        this.timeSeparator = null;
        this.shortQuarters = null;
        this.quarters = null;
        this.standaloneShortQuarters = null;
        this.standaloneQuarters = null;
        this.leapMonthPatterns = null;
        this.shortYearNames = null;
        this.shortZodiacNames = null;
        this.zoneStrings = null;
        this.localPatternChars = null;
        this.abbreviatedDayPeriods = null;
        this.wideDayPeriods = null;
        this.narrowDayPeriods = null;
        this.standaloneAbbreviatedDayPeriods = null;
        this.standaloneWideDayPeriods = null;
        this.standaloneNarrowDayPeriods = null;
        this.capitalization = null;
        initializeData(uLocale, iCUResourceBundle, str);
    }

    @Deprecated
    public void initializeData(ULocale uLocale, ICUResourceBundle iCUResourceBundle, String str) {
        ICUResourceBundle iCUResourceBundleValueOf;
        Map<String, String> map;
        String str2;
        CalendarDataSink calendarDataSink = new CalendarDataSink();
        if (iCUResourceBundle == null) {
            iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
        }
        while (str != null) {
            ICUResourceBundle iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt("calendar/" + str);
            if (iCUResourceBundleGEmmrt == null) {
                if ("gregorian".equals(str)) {
                    throw new MissingResourceException("The 'gregorian' calendar type wasn't found for the locale: " + uLocale.getBaseName(), getClass().getName(), "gregorian");
                }
                calendarDataSink.OLrzqt();
            } else {
                calendarDataSink.copydefault(str);
                iCUResourceBundleGEmmrt.copydefault("", calendarDataSink);
                if (str.equals("gregorian")) {
                    break;
                }
                str = calendarDataSink.gEmmrt;
                if (str == null) {
                    calendarDataSink.OLrzqt();
                }
            }
            str = "gregorian";
        }
        Map<String, String[]> map2 = calendarDataSink.AEQbTJ;
        Map<String, Map<String, String>> map3 = calendarDataSink.KWHzl;
        this.eras = map2.get("eras/abbreviated");
        this.eraNames = map2.get("eras/wide");
        this.narrowEras = map2.get("eras/narrow");
        this.months = map2.get("monthNames/format/wide");
        this.shortMonths = map2.get("monthNames/format/abbreviated");
        this.narrowMonths = map2.get("monthNames/format/narrow");
        this.standaloneMonths = map2.get("monthNames/stand-alone/wide");
        this.standaloneShortMonths = map2.get("monthNames/stand-alone/abbreviated");
        this.standaloneNarrowMonths = map2.get("monthNames/stand-alone/narrow");
        String[] strArr = map2.get("dayNames/format/wide");
        String[] strArr2 = new String[8];
        this.weekdays = strArr2;
        strArr2[0] = "";
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        String[] strArr3 = map2.get("dayNames/format/abbreviated");
        String[] strArr4 = new String[8];
        this.shortWeekdays = strArr4;
        strArr4[0] = "";
        System.arraycopy(strArr3, 0, strArr4, 1, strArr3.length);
        String[] strArr5 = map2.get("dayNames/format/short");
        String[] strArr6 = new String[8];
        this.shorterWeekdays = strArr6;
        strArr6[0] = "";
        System.arraycopy(strArr5, 0, strArr6, 1, strArr5.length);
        String[] strArr7 = map2.get("dayNames/format/narrow");
        if (strArr7 == null && (strArr7 = map2.get("dayNames/stand-alone/narrow")) == null && (strArr7 = map2.get("dayNames/format/abbreviated")) == null) {
            throw new MissingResourceException("Resource not found", getClass().getName(), "dayNames/format/abbreviated");
        }
        String[] strArr8 = new String[8];
        this.narrowWeekdays = strArr8;
        strArr8[0] = "";
        System.arraycopy(strArr7, 0, strArr8, 1, strArr7.length);
        String[] strArr9 = map2.get("dayNames/stand-alone/wide");
        String[] strArr10 = new String[8];
        this.standaloneWeekdays = strArr10;
        strArr10[0] = "";
        System.arraycopy(strArr9, 0, strArr10, 1, strArr9.length);
        String[] strArr11 = map2.get("dayNames/stand-alone/abbreviated");
        String[] strArr12 = new String[8];
        this.standaloneShortWeekdays = strArr12;
        strArr12[0] = "";
        System.arraycopy(strArr11, 0, strArr12, 1, strArr11.length);
        String[] strArr13 = map2.get("dayNames/stand-alone/short");
        String[] strArr14 = new String[8];
        this.standaloneShorterWeekdays = strArr14;
        strArr14[0] = "";
        System.arraycopy(strArr13, 0, strArr14, 1, strArr13.length);
        String[] strArr15 = map2.get("dayNames/stand-alone/narrow");
        String[] strArr16 = new String[8];
        this.standaloneNarrowWeekdays = strArr16;
        strArr16[0] = "";
        System.arraycopy(strArr15, 0, strArr16, 1, strArr15.length);
        this.ampms = map2.get("AmPmMarkers");
        this.ampmsNarrow = map2.get("AmPmMarkersNarrow");
        this.quarters = map2.get("quarters/format/wide");
        this.shortQuarters = map2.get("quarters/format/abbreviated");
        this.standaloneQuarters = map2.get("quarters/stand-alone/wide");
        this.standaloneShortQuarters = map2.get("quarters/stand-alone/abbreviated");
        this.abbreviatedDayPeriods = loadDayPeriodStrings(map3.get("dayPeriod/format/abbreviated"));
        this.wideDayPeriods = loadDayPeriodStrings(map3.get("dayPeriod/format/wide"));
        this.narrowDayPeriods = loadDayPeriodStrings(map3.get("dayPeriod/format/narrow"));
        this.standaloneAbbreviatedDayPeriods = loadDayPeriodStrings(map3.get("dayPeriod/stand-alone/abbreviated"));
        this.standaloneWideDayPeriods = loadDayPeriodStrings(map3.get("dayPeriod/stand-alone/wide"));
        this.standaloneNarrowDayPeriods = loadDayPeriodStrings(map3.get("dayPeriod/stand-alone/narrow"));
        for (int i = 0; i < 7; i++) {
            String str3 = LEAP_MONTH_PATTERNS_PATHS[i];
            if (str3 != null && (map = map3.get(str3)) != null && (str2 = map.get("leap")) != null) {
                if (this.leapMonthPatterns == null) {
                    this.leapMonthPatterns = new String[7];
                }
                this.leapMonthPatterns[i] = str2;
            }
        }
        this.shortYearNames = map2.get("cyclicNameSets/years/format/abbreviated");
        this.shortZodiacNames = map2.get("cyclicNameSets/zodiacs/format/abbreviated");
        this.requestedLocale = uLocale;
        ICUResourceBundle iCUResourceBundle2 = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
        this.localPatternChars = patternChars;
        ULocale uLocaleFetchVPNInfo = iCUResourceBundle2.fetchVPNInfo();
        setLocale(uLocaleFetchVPNInfo, uLocaleFetchVPNInfo);
        this.capitalization = new HashMap();
        boolean[] zArr = {false, false};
        for (CapitalizationContextUsage capitalizationContextUsage : CapitalizationContextUsage.values()) {
            this.capitalization.put(capitalizationContextUsage, zArr);
        }
        try {
            iCUResourceBundleValueOf = iCUResourceBundle2.valueOf("contextTransforms");
        } catch (MissingResourceException unused) {
            iCUResourceBundleValueOf = null;
        }
        if (iCUResourceBundleValueOf != null) {
            C7260agV newProxyInstance = iCUResourceBundleValueOf.getNewProxyInstance();
            while (newProxyInstance.EZpvd()) {
                UResourceBundle uResourceBundleCopydefault = newProxyInstance.copydefault();
                int[] iArrUzCIH = uResourceBundleCopydefault.uzCIH();
                if (iArrUzCIH.length >= 2) {
                    CapitalizationContextUsage capitalizationContextUsage2 = contextUsageTypeMap.get(uResourceBundleCopydefault.AEQbTJ());
                    if (capitalizationContextUsage2 != null) {
                        boolean[] zArr2 = new boolean[2];
                        zArr2[0] = iArrUzCIH[0] != 0;
                        zArr2[1] = iArrUzCIH[1] != 0;
                        this.capitalization.put(capitalizationContextUsage2, zArr2);
                    }
                }
            }
        }
        C7275agk c7275agkEZpvd = C7275agk.EZpvd(uLocale);
        try {
            setTimeSeparatorString(iCUResourceBundle2.djBIcL("NumberElements/" + (c7275agkEZpvd == null ? "latn" : c7275agkEZpvd.EZpvd()) + "/symbols/timeSeparator"));
        } catch (MissingResourceException unused2) {
            setTimeSeparatorString(":");
        }
    }

    private static final boolean arrayOfArrayEquals(Object[][] objArr, Object[][] objArr2) {
        boolean zEZpvd = true;
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < objArr.length && (zEZpvd = C7045acS.EZpvd(objArr[i], objArr2[i])); i++) {
        }
        return zEZpvd;
    }

    private String[] loadDayPeriodStrings(Map<String, String> map) {
        String[] strArr = new String[DAY_PERIOD_KEYS.length];
        if (map != null) {
            int i = 0;
            while (true) {
                String[] strArr2 = DAY_PERIOD_KEYS;
                if (i >= strArr2.length) {
                    break;
                }
                strArr[i] = map.get(strArr2[i]);
                i++;
            }
        }
        return strArr;
    }

    private final String[] duplicate(String[] strArr) {
        return (String[]) strArr.clone();
    }

    private final String[][] duplicate(String[][] strArr) {
        String[][] strArr2 = new String[strArr.length][];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = duplicate(strArr[i]);
        }
        return strArr2;
    }

    public DateFormatSymbols(Calendar calendar, Locale locale) {
        this.eras = null;
        this.eraNames = null;
        this.narrowEras = null;
        this.months = null;
        this.shortMonths = null;
        this.narrowMonths = null;
        this.standaloneMonths = null;
        this.standaloneShortMonths = null;
        this.standaloneNarrowMonths = null;
        this.weekdays = null;
        this.shortWeekdays = null;
        this.shorterWeekdays = null;
        this.narrowWeekdays = null;
        this.standaloneWeekdays = null;
        this.standaloneShortWeekdays = null;
        this.standaloneShorterWeekdays = null;
        this.standaloneNarrowWeekdays = null;
        this.ampms = null;
        this.ampmsNarrow = null;
        this.timeSeparator = null;
        this.shortQuarters = null;
        this.quarters = null;
        this.standaloneShortQuarters = null;
        this.standaloneQuarters = null;
        this.leapMonthPatterns = null;
        this.shortYearNames = null;
        this.shortZodiacNames = null;
        this.zoneStrings = null;
        this.localPatternChars = null;
        this.abbreviatedDayPeriods = null;
        this.wideDayPeriods = null;
        this.narrowDayPeriods = null;
        this.standaloneAbbreviatedDayPeriods = null;
        this.standaloneWideDayPeriods = null;
        this.standaloneNarrowDayPeriods = null;
        this.capitalization = null;
        initializeData(ULocale.forLocale(locale), calendar.getType());
    }

    public DateFormatSymbols(Calendar calendar, ULocale uLocale) {
        this.eras = null;
        this.eraNames = null;
        this.narrowEras = null;
        this.months = null;
        this.shortMonths = null;
        this.narrowMonths = null;
        this.standaloneMonths = null;
        this.standaloneShortMonths = null;
        this.standaloneNarrowMonths = null;
        this.weekdays = null;
        this.shortWeekdays = null;
        this.shorterWeekdays = null;
        this.narrowWeekdays = null;
        this.standaloneWeekdays = null;
        this.standaloneShortWeekdays = null;
        this.standaloneShorterWeekdays = null;
        this.standaloneNarrowWeekdays = null;
        this.ampms = null;
        this.ampmsNarrow = null;
        this.timeSeparator = null;
        this.shortQuarters = null;
        this.quarters = null;
        this.standaloneShortQuarters = null;
        this.standaloneQuarters = null;
        this.leapMonthPatterns = null;
        this.shortYearNames = null;
        this.shortZodiacNames = null;
        this.zoneStrings = null;
        this.localPatternChars = null;
        this.abbreviatedDayPeriods = null;
        this.wideDayPeriods = null;
        this.narrowDayPeriods = null;
        this.standaloneAbbreviatedDayPeriods = null;
        this.standaloneWideDayPeriods = null;
        this.standaloneNarrowDayPeriods = null;
        this.capitalization = null;
        initializeData(uLocale, calendar.getType());
    }

    public DateFormatSymbols(Class<? extends Calendar> cls, Locale locale) {
        this(cls, ULocale.forLocale(locale));
    }

    public DateFormatSymbols(Class<? extends Calendar> cls, ULocale uLocale) {
        String str = null;
        this.eras = null;
        this.eraNames = null;
        this.narrowEras = null;
        this.months = null;
        this.shortMonths = null;
        this.narrowMonths = null;
        this.standaloneMonths = null;
        this.standaloneShortMonths = null;
        this.standaloneNarrowMonths = null;
        this.weekdays = null;
        this.shortWeekdays = null;
        this.shorterWeekdays = null;
        this.narrowWeekdays = null;
        this.standaloneWeekdays = null;
        this.standaloneShortWeekdays = null;
        this.standaloneShorterWeekdays = null;
        this.standaloneNarrowWeekdays = null;
        this.ampms = null;
        this.ampmsNarrow = null;
        this.timeSeparator = null;
        this.shortQuarters = null;
        this.quarters = null;
        this.standaloneShortQuarters = null;
        this.standaloneQuarters = null;
        this.leapMonthPatterns = null;
        this.shortYearNames = null;
        this.shortZodiacNames = null;
        this.zoneStrings = null;
        this.localPatternChars = null;
        this.abbreviatedDayPeriods = null;
        this.wideDayPeriods = null;
        this.narrowDayPeriods = null;
        this.standaloneAbbreviatedDayPeriods = null;
        this.standaloneWideDayPeriods = null;
        this.standaloneNarrowDayPeriods = null;
        this.capitalization = null;
        String name = cls.getName();
        String strSubstring = name.substring(name.lastIndexOf(46) + 1);
        String[][] strArr = CALENDAR_CLASSES;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String[] strArr2 = strArr[i];
            if (strArr2[0].equals(strSubstring)) {
                str = strArr2[1];
                break;
            }
            i++;
        }
        initializeData(uLocale, str == null ? strSubstring.replaceAll("Calendar", "").toLowerCase(Locale.ENGLISH) : str);
    }

    public DateFormatSymbols(ResourceBundle resourceBundle, Locale locale) {
        this(resourceBundle, ULocale.forLocale(locale));
    }

    public DateFormatSymbols(ResourceBundle resourceBundle, ULocale uLocale) {
        this.eras = null;
        this.eraNames = null;
        this.narrowEras = null;
        this.months = null;
        this.shortMonths = null;
        this.narrowMonths = null;
        this.standaloneMonths = null;
        this.standaloneShortMonths = null;
        this.standaloneNarrowMonths = null;
        this.weekdays = null;
        this.shortWeekdays = null;
        this.shorterWeekdays = null;
        this.narrowWeekdays = null;
        this.standaloneWeekdays = null;
        this.standaloneShortWeekdays = null;
        this.standaloneShorterWeekdays = null;
        this.standaloneNarrowWeekdays = null;
        this.ampms = null;
        this.ampmsNarrow = null;
        this.timeSeparator = null;
        this.shortQuarters = null;
        this.quarters = null;
        this.standaloneShortQuarters = null;
        this.standaloneQuarters = null;
        this.leapMonthPatterns = null;
        this.shortYearNames = null;
        this.shortZodiacNames = null;
        this.zoneStrings = null;
        this.localPatternChars = null;
        this.abbreviatedDayPeriods = null;
        this.wideDayPeriods = null;
        this.narrowDayPeriods = null;
        this.standaloneAbbreviatedDayPeriods = null;
        this.standaloneWideDayPeriods = null;
        this.standaloneNarrowDayPeriods = null;
        this.capitalization = null;
        initializeData(uLocale, (ICUResourceBundle) resourceBundle, C7011abL.copydefault(uLocale));
    }

    public final ULocale getLocale(ULocale.StateListAnimator stateListAnimator) {
        return stateListAnimator == ULocale.ACTUAL_LOCALE ? this.actualLocale : this.validLocale;
    }

    public final void setLocale(ULocale uLocale, ULocale uLocale2) {
        if ((uLocale == null) != (uLocale2 == null)) {
            throw new IllegalArgumentException();
        }
        this.validLocale = uLocale;
        this.actualLocale = uLocale2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
