package com.ibm.icu.text;

import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.TZDBTimeZoneNames;
import com.ibm.icu.impl.TimeZoneGenericNames;
import com.ibm.icu.impl.TimeZoneNamesImpl;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.TimeZoneNames;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import o.AbstractC7078acz;
import o.C7029acC;
import o.C7047acU;
import o.C7070acr;
import o.C7223afl;
import o.C7255agQ;
import o.C7275agk;
import o.InterfaceC7248agJ;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZoneFormat extends UFormat implements InterfaceC7248agJ<TimeZoneFormat>, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ASCII_DIGITS = "0123456789";
    private static final char DEFAULT_GMT_OFFSET_SEP = ':';
    private static final String DEFAULT_GMT_PATTERN = "GMT{0}";
    private static final String ISO8601_UTC = "Z";
    private static final int ISO_LOCAL_STYLE_FLAG = 256;
    private static final int ISO_Z_STYLE_FLAG = 128;
    private static final int MAX_OFFSET = 86400000;
    private static final int MAX_OFFSET_HOUR = 23;
    private static final int MAX_OFFSET_MINUTE = 59;
    private static final int MAX_OFFSET_SECOND = 59;
    private static final int MILLIS_PER_HOUR = 3600000;
    private static final int MILLIS_PER_MINUTE = 60000;
    private static final int MILLIS_PER_SECOND = 1000;
    private static volatile C7029acC<String> SHORT_ZONE_ID_TRIE = null;
    private static final String TZID_GMT = "Etc/GMT";
    private static final String UNKNOWN_LOCATION = "Unknown";
    private static final int UNKNOWN_OFFSET = Integer.MAX_VALUE;
    private static final String UNKNOWN_SHORT_ZONE_ID = "unk";
    private static final String UNKNOWN_ZONE_ID = "Etc/Unknown";
    private static volatile C7029acC<String> ZONE_ID_TRIE = null;
    private static final long serialVersionUID = 2281246852693575022L;
    private transient boolean _abuttingOffsetHoursAndMinutes;
    private volatile transient boolean _frozen;
    private String[] _gmtOffsetDigits;
    private transient Object[][] _gmtOffsetPatternItems;
    private String[] _gmtOffsetPatterns;
    private String _gmtPattern;
    private transient String _gmtPatternPrefix;
    private transient String _gmtPatternSuffix;
    private String _gmtZeroFormat;
    private volatile transient TimeZoneGenericNames _gnames;
    private ULocale _locale;
    private boolean _parseAllStyles;
    private boolean _parseTZDBNames;
    private transient String _region;
    private volatile transient TimeZoneNames _tzdbNames;
    private TimeZoneNames _tznames;
    private static final String DEFAULT_GMT_ZERO = "GMT";
    private static final String[] ALT_GMT_STRINGS = {DEFAULT_GMT_ZERO, "UTC", "UT"};
    private static final String[] DEFAULT_GMT_DIGITS = {"0", "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8", "9"};
    private static final GMTOffsetPatternType[] PARSE_GMT_OFFSET_TYPES = {GMTOffsetPatternType.POSITIVE_HMS, GMTOffsetPatternType.NEGATIVE_HMS, GMTOffsetPatternType.POSITIVE_HM, GMTOffsetPatternType.NEGATIVE_HM, GMTOffsetPatternType.POSITIVE_H, GMTOffsetPatternType.NEGATIVE_H};
    private static ActionBar _tzfCache = new ActionBar(null);
    private static final EnumSet<TimeZoneNames.NameType> ALL_SIMPLE_NAME_TYPES = EnumSet.of(TimeZoneNames.NameType.LONG_STANDARD, TimeZoneNames.NameType.LONG_DAYLIGHT, TimeZoneNames.NameType.SHORT_STANDARD, TimeZoneNames.NameType.SHORT_DAYLIGHT, TimeZoneNames.NameType.EXEMPLAR_LOCATION);
    private static final EnumSet<TimeZoneGenericNames.GenericNameType> ALL_GENERIC_NAME_TYPES = EnumSet.of(TimeZoneGenericNames.GenericNameType.LOCATION, TimeZoneGenericNames.GenericNameType.LONG, TimeZoneGenericNames.GenericNameType.SHORT);
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("_locale", ULocale.class), new ObjectStreamField("_tznames", TimeZoneNames.class), new ObjectStreamField("_gmtPattern", String.class), new ObjectStreamField("_gmtOffsetPatterns", String[].class), new ObjectStreamField("_gmtOffsetDigits", String[].class), new ObjectStreamField("_gmtZeroFormat", String.class), new ObjectStreamField("_parseAllStyles", Boolean.TYPE)};

    public enum OffsetFields {
        H,
        HM,
        HMS
    }

    /* JADX INFO: loaded from: classes14.dex */
    public enum ParseOption {
        ALL_STYLES,
        TZ_DATABASE_ABBREVIATIONS
    }

    public enum TimeType {
        UNKNOWN,
        STANDARD,
        DAYLIGHT
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
    /* JADX INFO: renamed from: freeze, reason: merged with bridge method [inline-methods] */
    public TimeZoneFormat m6327freeze() {
        this._frozen = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getGMTPattern() {
        return this._gmtPattern;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getGMTZeroFormat() {
        return this._gmtZeroFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TimeZoneNames getTimeZoneNames() {
        return this._tznames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isFrozen() {
        return this._frozen;
    }

    public enum Style {
        GENERIC_LOCATION(1),
        GENERIC_LONG(2),
        GENERIC_SHORT(4),
        SPECIFIC_LONG(8),
        SPECIFIC_SHORT(16),
        LOCALIZED_GMT(32),
        LOCALIZED_GMT_SHORT(64),
        ISO_BASIC_SHORT(128),
        ISO_BASIC_LOCAL_SHORT(256),
        ISO_BASIC_FIXED(128),
        ISO_BASIC_LOCAL_FIXED(256),
        ISO_BASIC_FULL(128),
        ISO_BASIC_LOCAL_FULL(256),
        ISO_EXTENDED_FIXED(128),
        ISO_EXTENDED_LOCAL_FIXED(256),
        ISO_EXTENDED_FULL(128),
        ISO_EXTENDED_LOCAL_FULL(256),
        ZONE_ID(512),
        ZONE_ID_SHORT(1024),
        EXEMPLAR_LOCATION(2048);

        final int flag;

        Style(int i) {
            this.flag = i;
        }
    }

    public enum GMTOffsetPatternType {
        POSITIVE_HM("+H:mm", DateFormat.HOUR24_MINUTE, true),
        POSITIVE_HMS("+H:mm:ss", DateFormat.HOUR24_MINUTE_SECOND, true),
        NEGATIVE_HM("-H:mm", DateFormat.HOUR24_MINUTE, false),
        NEGATIVE_HMS("-H:mm:ss", DateFormat.HOUR24_MINUTE_SECOND, false),
        POSITIVE_H("+H", DateFormat.HOUR24, true),
        NEGATIVE_H("-H", DateFormat.HOUR24, false);

        private String _defaultPattern;
        private boolean _isPositive;
        private String _required;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public String defaultPattern() {
            return this._defaultPattern;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPositive() {
            return this._isPositive;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public String required() {
            return this._required;
        }

        GMTOffsetPatternType(String str, String str2, boolean z) {
            this._defaultPattern = str;
            this._required = str2;
            this._isPositive = z;
        }
    }

    public TimeZoneFormat(ULocale uLocale) {
        String str;
        String strDjBIcL;
        this._locale = uLocale;
        this._tznames = TimeZoneNames.getInstance(uLocale);
        this._gmtZeroFormat = DEFAULT_GMT_ZERO;
        String strDjBIcL2 = null;
        try {
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/zone", uLocale);
            try {
                strDjBIcL = iCUResourceBundle.djBIcL("zoneStrings/gmtFormat");
            } catch (MissingResourceException unused) {
                strDjBIcL = null;
            }
            try {
                strDjBIcL2 = iCUResourceBundle.djBIcL("zoneStrings/hourFormat");
            } catch (MissingResourceException unused2) {
            }
            try {
                this._gmtZeroFormat = iCUResourceBundle.djBIcL("zoneStrings/gmtZeroFormat");
            } catch (MissingResourceException unused3) {
            }
            str = strDjBIcL2;
            strDjBIcL2 = strDjBIcL;
        } catch (MissingResourceException unused4) {
            str = null;
        }
        initGMTPattern(strDjBIcL2 == null ? DEFAULT_GMT_PATTERN : strDjBIcL2);
        String[] strArr = new String[GMTOffsetPatternType.values().length];
        if (str != null) {
            String[] strArrSplit = str.split(";", 2);
            strArr[GMTOffsetPatternType.POSITIVE_H.ordinal()] = truncateOffsetPattern(strArrSplit[0]);
            strArr[GMTOffsetPatternType.POSITIVE_HM.ordinal()] = strArrSplit[0];
            strArr[GMTOffsetPatternType.POSITIVE_HMS.ordinal()] = expandOffsetPattern(strArrSplit[0]);
            strArr[GMTOffsetPatternType.NEGATIVE_H.ordinal()] = truncateOffsetPattern(strArrSplit[1]);
            strArr[GMTOffsetPatternType.NEGATIVE_HM.ordinal()] = strArrSplit[1];
            strArr[GMTOffsetPatternType.NEGATIVE_HMS.ordinal()] = expandOffsetPattern(strArrSplit[1]);
        } else {
            for (GMTOffsetPatternType gMTOffsetPatternType : GMTOffsetPatternType.values()) {
                strArr[gMTOffsetPatternType.ordinal()] = gMTOffsetPatternType.defaultPattern();
            }
        }
        initGMTOffsetPatterns(strArr);
        this._gmtOffsetDigits = DEFAULT_GMT_DIGITS;
        C7275agk c7275agkEZpvd = C7275agk.EZpvd(uLocale);
        if (c7275agkEZpvd.copydefault()) {
            return;
        }
        this._gmtOffsetDigits = toCodePoints(c7275agkEZpvd.KWHzl());
    }

    public static TimeZoneFormat getInstance(ULocale uLocale) {
        if (uLocale == null) {
            throw new NullPointerException("locale is null");
        }
        return _tzfCache.AEQbTJ(uLocale, uLocale);
    }

    public static TimeZoneFormat getInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale));
    }

    private TimeZoneGenericNames getTimeZoneGenericNames() {
        if (this._gnames == null) {
            synchronized (this) {
                if (this._gnames == null) {
                    this._gnames = TimeZoneGenericNames.getInstance(this._locale);
                }
            }
        }
        return this._gnames;
    }

    private TimeZoneNames getTZDBTimeZoneNames() {
        if (this._tzdbNames == null) {
            synchronized (this) {
                if (this._tzdbNames == null) {
                    this._tzdbNames = new TZDBTimeZoneNames(this._locale);
                }
            }
        }
        return this._tzdbNames;
    }

    public TimeZoneFormat setTimeZoneNames(TimeZoneNames timeZoneNames) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        this._tznames = timeZoneNames;
        this._gnames = new TimeZoneGenericNames(this._locale, this._tznames);
        return this;
    }

    public TimeZoneFormat setGMTPattern(String str) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        initGMTPattern(str);
        return this;
    }

    public String getGMTOffsetPattern(GMTOffsetPatternType gMTOffsetPatternType) {
        return this._gmtOffsetPatterns[gMTOffsetPatternType.ordinal()];
    }

    public TimeZoneFormat setGMTOffsetPattern(GMTOffsetPatternType gMTOffsetPatternType, String str) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        if (str != null) {
            Object[] offsetPattern = parseOffsetPattern(str, gMTOffsetPatternType.required());
            this._gmtOffsetPatterns[gMTOffsetPatternType.ordinal()] = str;
            this._gmtOffsetPatternItems[gMTOffsetPatternType.ordinal()] = offsetPattern;
            checkAbuttingHoursAndMinutes();
            return this;
        }
        throw new NullPointerException("Null GMT offset pattern");
    }

    public String getGMTOffsetDigits() {
        StringBuilder sb = new StringBuilder(this._gmtOffsetDigits.length);
        for (String str : this._gmtOffsetDigits) {
            sb.append(str);
        }
        return sb.toString();
    }

    public TimeZoneFormat setGMTOffsetDigits(String str) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        if (str == null) {
            throw new NullPointerException("Null GMT offset digits");
        }
        String[] codePoints = toCodePoints(str);
        if (codePoints.length != 10) {
            throw new IllegalArgumentException("Length of digits must be 10");
        }
        this._gmtOffsetDigits = codePoints;
        return this;
    }

    public TimeZoneFormat setGMTZeroFormat(String str) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        if (str == null) {
            throw new NullPointerException("Null GMT zero format");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Empty GMT zero format");
        }
        this._gmtZeroFormat = str;
        return this;
    }

    public TimeZoneFormat setDefaultParseOptions(EnumSet<ParseOption> enumSet) {
        this._parseAllStyles = enumSet.contains(ParseOption.ALL_STYLES);
        this._parseTZDBNames = enumSet.contains(ParseOption.TZ_DATABASE_ABBREVIATIONS);
        return this;
    }

    public EnumSet<ParseOption> getDefaultParseOptions() {
        boolean z = this._parseAllStyles;
        if (z && this._parseTZDBNames) {
            return EnumSet.of(ParseOption.ALL_STYLES, ParseOption.TZ_DATABASE_ABBREVIATIONS);
        }
        if (z) {
            return EnumSet.of(ParseOption.ALL_STYLES);
        }
        if (this._parseTZDBNames) {
            return EnumSet.of(ParseOption.TZ_DATABASE_ABBREVIATIONS);
        }
        return EnumSet.noneOf(ParseOption.class);
    }

    public final String formatOffsetISO8601Basic(int i, boolean z, boolean z2, boolean z3) {
        return formatOffsetISO8601(i, true, z, z2, z3);
    }

    public final String formatOffsetISO8601Extended(int i, boolean z, boolean z2, boolean z3) {
        return formatOffsetISO8601(i, false, z, z2, z3);
    }

    public String formatOffsetLocalizedGMT(int i) {
        return formatOffsetLocalizedGMT(i, false);
    }

    public String formatOffsetShortLocalizedGMT(int i) {
        return formatOffsetLocalizedGMT(i, true);
    }

    public final String format(Style style, TimeZone timeZone, long j) {
        return format(style, timeZone, j, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: T */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, com.ibm.icu.text.TimeZoneFormat$TimeType] */
    public String format(Style style, TimeZone timeZone, long j, C7255agQ<TimeType> c7255agQ) {
        String genericLocationName;
        boolean z;
        if (c7255agQ != null) {
            c7255agQ.copydefault = TimeType.UNKNOWN;
        }
        int[] iArr = AnonymousClass1.copydefault;
        switch (iArr[style.ordinal()]) {
            case 1:
                genericLocationName = getTimeZoneGenericNames().getGenericLocationName(C7047acU.OLrzqt(timeZone));
                z = false;
                break;
            case 2:
                genericLocationName = getTimeZoneGenericNames().getDisplayName(timeZone, TimeZoneGenericNames.GenericNameType.LONG, j);
                z = false;
                break;
            case 3:
                genericLocationName = getTimeZoneGenericNames().getDisplayName(timeZone, TimeZoneGenericNames.GenericNameType.SHORT, j);
                z = false;
                break;
            case 4:
                genericLocationName = formatSpecific(timeZone, TimeZoneNames.NameType.LONG_STANDARD, TimeZoneNames.NameType.LONG_DAYLIGHT, j, c7255agQ);
                z = false;
                break;
            case 5:
                genericLocationName = formatSpecific(timeZone, TimeZoneNames.NameType.SHORT_STANDARD, TimeZoneNames.NameType.SHORT_DAYLIGHT, j, c7255agQ);
                z = false;
                break;
            case 6:
                genericLocationName = timeZone.getID();
                z = true;
                break;
            case 7:
                genericLocationName = C7047acU.AEQbTJ(timeZone);
                if (genericLocationName == null) {
                    genericLocationName = UNKNOWN_SHORT_ZONE_ID;
                }
                z = true;
                break;
            case 8:
                genericLocationName = formatExemplarLocation(timeZone);
                z = true;
                break;
            default:
                genericLocationName = null;
                z = false;
                break;
        }
        if (genericLocationName == null && !z) {
            int[] iArr2 = {0, 0};
            timeZone.getOffset(j, false, iArr2);
            int i = iArr2[0] + iArr2[1];
            switch (iArr[style.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 9:
                    genericLocationName = formatOffsetLocalizedGMT(i);
                    break;
                case 3:
                case 5:
                case 10:
                    genericLocationName = formatOffsetShortLocalizedGMT(i);
                    break;
                case 11:
                    genericLocationName = formatOffsetISO8601Basic(i, true, true, true);
                    break;
                case 12:
                    genericLocationName = formatOffsetISO8601Basic(i, false, true, true);
                    break;
                case 13:
                    genericLocationName = formatOffsetISO8601Basic(i, true, false, true);
                    break;
                case 14:
                    genericLocationName = formatOffsetISO8601Basic(i, false, false, true);
                    break;
                case 15:
                    genericLocationName = formatOffsetISO8601Basic(i, true, false, false);
                    break;
                case 16:
                    genericLocationName = formatOffsetISO8601Basic(i, false, false, false);
                    break;
                case 17:
                    genericLocationName = formatOffsetISO8601Extended(i, true, false, true);
                    break;
                case 18:
                    genericLocationName = formatOffsetISO8601Extended(i, false, false, true);
                    break;
                case 19:
                    genericLocationName = formatOffsetISO8601Extended(i, true, false, false);
                    break;
                case 20:
                    genericLocationName = formatOffsetISO8601Extended(i, false, false, false);
                    break;
            }
            if (c7255agQ != null) {
                c7255agQ.copydefault = iArr2[1] != 0 ? TimeType.DAYLIGHT : TimeType.STANDARD;
            }
        }
        return genericLocationName;
    }

    public final int parseOffsetISO8601(String str, ParsePosition parsePosition) {
        return parseOffsetISO8601(str, parsePosition, false, null);
    }

    public int parseOffsetLocalizedGMT(String str, ParsePosition parsePosition) {
        return parseOffsetLocalizedGMT(str, parsePosition, false, null);
    }

    public int parseOffsetShortLocalizedGMT(String str, ParsePosition parsePosition) {
        return parseOffsetLocalizedGMT(str, parsePosition, true, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:214:0x0459 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:220:0x047f */
    /* JADX DEBUG: Multi-variable search result rejected for r8v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v48, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v80, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v86, resolved type: T */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04d6  */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, com.ibm.icu.text.TimeZoneFormat$TimeType] */
    /* JADX WARN: Type inference failed for: r1v23, types: [T, com.ibm.icu.text.TimeZoneFormat$TimeType] */
    /* JADX WARN: Type inference failed for: r1v28, types: [T, com.ibm.icu.text.TimeZoneFormat$TimeType] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, com.ibm.icu.text.TimeZoneFormat$TimeType] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TimeZone parse(Style style, String str, ParsePosition parsePosition, EnumSet<ParseOption> enumSet, C7255agQ<TimeType> c7255agQ) {
        int offsetLocalizedGMT;
        int index;
        int i;
        boolean zContains;
        EnumSet<ParseOption> enumSet2;
        boolean zContains2;
        T t;
        int i2;
        String strEZpvd;
        TimeZone timeZoneForOffset;
        TimeType timeType;
        TimeType timeType2;
        String timeZoneID;
        String str2;
        TimeType timeTypeCopydefault;
        String zoneID;
        TimeZoneGenericNames.ActionBar actionBarFindBestMatch;
        Collection<TimeZoneNames.Activity> collectionFind;
        TimeZoneNames.Activity activity;
        int iKWHzl;
        EnumSet<TimeZoneGenericNames.GenericNameType> enumSetOf;
        EnumSet<TimeZoneNames.NameType> enumSetOf2;
        Collection<TimeZoneNames.Activity> collectionFind2;
        int i3;
        C7255agQ<TimeType> c7255agQ2 = c7255agQ;
        if (c7255agQ2 == null) {
            c7255agQ2 = new C7255agQ<>(TimeType.UNKNOWN);
        } else {
            c7255agQ2.copydefault = TimeType.UNKNOWN;
        }
        int index2 = parsePosition.getIndex();
        int length = str.length();
        Style style2 = Style.SPECIFIC_LONG;
        boolean z = style == style2 || style == Style.GENERIC_LONG || style == Style.GENERIC_LOCATION;
        boolean z2 = style == Style.SPECIFIC_SHORT || style == Style.GENERIC_SHORT;
        ParsePosition parsePosition2 = new ParsePosition(index2);
        if (z || z2) {
            C7255agQ<Boolean> c7255agQ3 = new C7255agQ<>(Boolean.FALSE);
            offsetLocalizedGMT = parseOffsetLocalizedGMT(str, parsePosition2, z2, c7255agQ3);
            if (parsePosition2.getErrorIndex() != -1) {
                index = -1;
                offsetLocalizedGMT = Integer.MAX_VALUE;
            } else {
                if (parsePosition2.getIndex() == length || c7255agQ3.copydefault.booleanValue()) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return getTimeZoneForOffset(offsetLocalizedGMT);
                }
                index = parsePosition2.getIndex();
            }
            i = Style.LOCALIZED_GMT_SHORT.flag | Style.LOCALIZED_GMT.flag;
        } else {
            index = -1;
            i = 0;
            offsetLocalizedGMT = Integer.MAX_VALUE;
        }
        if (enumSet == null) {
            zContains = getDefaultParseOptions().contains(ParseOption.TZ_DATABASE_ABBREVIATIONS);
        } else {
            zContains = enumSet.contains(ParseOption.TZ_DATABASE_ABBREVIATIONS);
        }
        int[] iArr = AnonymousClass1.copydefault;
        switch (iArr[style.ordinal()]) {
            case 1:
            case 2:
            case 3:
                int i4 = iArr[style.ordinal()];
                if (i4 == 1) {
                    enumSetOf = EnumSet.of(TimeZoneGenericNames.GenericNameType.LOCATION);
                } else if (i4 == 2) {
                    enumSetOf = EnumSet.of(TimeZoneGenericNames.GenericNameType.LONG, TimeZoneGenericNames.GenericNameType.LOCATION);
                } else {
                    enumSetOf = i4 != 3 ? null : EnumSet.of(TimeZoneGenericNames.GenericNameType.SHORT, TimeZoneGenericNames.GenericNameType.LOCATION);
                }
                TimeZoneGenericNames.ActionBar actionBarFindBestMatch2 = getTimeZoneGenericNames().findBestMatch(str, index2, enumSetOf);
                if (actionBarFindBestMatch2 != null && actionBarFindBestMatch2.OLrzqt() + index2 > index) {
                    c7255agQ2.copydefault = actionBarFindBestMatch2.copydefault();
                    parsePosition.setIndex(index2 + actionBarFindBestMatch2.OLrzqt());
                    return TimeZone.getTimeZone(actionBarFindBestMatch2.EZpvd());
                }
                int i5 = style.flag | i;
                if (index <= index2) {
                    parsePosition.setIndex(index);
                    return getTimeZoneForOffset(offsetLocalizedGMT);
                }
                TimeType timeType3 = TimeType.UNKNOWN;
                if (index < length && ((i5 & 128) == 0 || (i5 & 256) == 0)) {
                    parsePosition2.setIndex(index2);
                    parsePosition2.setErrorIndex(-1);
                    C7255agQ c7255agQ4 = new C7255agQ(Boolean.FALSE);
                    int offsetISO8601 = parseOffsetISO8601(str, parsePosition2, false, c7255agQ4);
                    if (parsePosition2.getErrorIndex() == -1) {
                        if (parsePosition2.getIndex() == length || ((Boolean) c7255agQ4.copydefault).booleanValue()) {
                            parsePosition.setIndex(parsePosition2.getIndex());
                            return getTimeZoneForOffset(offsetISO8601);
                        }
                        if (index < parsePosition2.getIndex()) {
                            index = parsePosition2.getIndex();
                            offsetLocalizedGMT = offsetISO8601;
                        }
                    }
                }
                if (index < length && (Style.LOCALIZED_GMT.flag & i5) == 0) {
                    parsePosition2.setIndex(index2);
                    parsePosition2.setErrorIndex(-1);
                    C7255agQ<Boolean> c7255agQ5 = new C7255agQ<>(Boolean.FALSE);
                    int offsetLocalizedGMT2 = parseOffsetLocalizedGMT(str, parsePosition2, false, c7255agQ5);
                    if (parsePosition2.getErrorIndex() == -1) {
                        if (parsePosition2.getIndex() == length || c7255agQ5.copydefault.booleanValue()) {
                            parsePosition.setIndex(parsePosition2.getIndex());
                            return getTimeZoneForOffset(offsetLocalizedGMT2);
                        }
                        if (index < parsePosition2.getIndex()) {
                            index = parsePosition2.getIndex();
                            offsetLocalizedGMT = offsetLocalizedGMT2;
                        }
                    }
                }
                if (index >= length || (Style.LOCALIZED_GMT_SHORT.flag & i5) != 0) {
                    enumSet2 = enumSet;
                } else {
                    parsePosition2.setIndex(index2);
                    parsePosition2.setErrorIndex(-1);
                    C7255agQ<Boolean> c7255agQ6 = new C7255agQ<>(Boolean.FALSE);
                    int offsetLocalizedGMT3 = parseOffsetLocalizedGMT(str, parsePosition2, true, c7255agQ6);
                    if (parsePosition2.getErrorIndex() == -1) {
                        if (parsePosition2.getIndex() == length || c7255agQ6.copydefault.booleanValue()) {
                            parsePosition.setIndex(parsePosition2.getIndex());
                            return getTimeZoneForOffset(offsetLocalizedGMT3);
                        }
                        if (index < parsePosition2.getIndex()) {
                            index = parsePosition2.getIndex();
                            enumSet2 = enumSet;
                            offsetLocalizedGMT = offsetLocalizedGMT3;
                        }
                    }
                }
                if (enumSet2 == null) {
                    zContains2 = getDefaultParseOptions().contains(ParseOption.ALL_STYLES);
                } else {
                    zContains2 = enumSet2.contains(ParseOption.ALL_STYLES);
                }
                if (zContains2) {
                    if (index < length) {
                        Collection<TimeZoneNames.Activity> collectionFind3 = this._tznames.find(str, index2, ALL_SIMPLE_NAME_TYPES);
                        if (collectionFind3 != null) {
                            activity = null;
                            iKWHzl = -1;
                            for (TimeZoneNames.Activity activity2 : collectionFind3) {
                                TimeType timeType4 = timeType3;
                                if (index2 + activity2.KWHzl() > iKWHzl) {
                                    iKWHzl = activity2.KWHzl() + index2;
                                    activity = activity2;
                                }
                                timeType3 = timeType4;
                            }
                            timeType = timeType3;
                        } else {
                            timeType = timeType3;
                            activity = null;
                            iKWHzl = -1;
                        }
                        if (index < iKWHzl) {
                            timeZoneID = getTimeZoneID(activity.AEQbTJ(), activity.EZpvd());
                            index = iKWHzl;
                            offsetLocalizedGMT = Integer.MAX_VALUE;
                            timeType2 = getTimeType(activity.copydefault());
                        }
                        if (zContains || index >= length || (Style.SPECIFIC_SHORT.flag & i5) != 0 || (collectionFind = getTZDBTimeZoneNames().find(str, index2, ALL_SIMPLE_NAME_TYPES)) == null) {
                            str2 = timeZoneID;
                        } else {
                            TimeZoneNames.Activity activity3 = null;
                            int iKWHzl2 = -1;
                            for (TimeZoneNames.Activity activity4 : collectionFind) {
                                String str3 = timeZoneID;
                                if (index2 + activity4.KWHzl() > iKWHzl2) {
                                    iKWHzl2 = activity4.KWHzl() + index2;
                                    activity3 = activity4;
                                }
                                timeZoneID = str3;
                            }
                            str2 = timeZoneID;
                            if (index < iKWHzl2) {
                                strEZpvd = getTimeZoneID(activity3.AEQbTJ(), activity3.EZpvd());
                                index = iKWHzl2;
                                offsetLocalizedGMT = Integer.MAX_VALUE;
                                timeTypeCopydefault = getTimeType(activity3.copydefault());
                            }
                            if (index < length && (actionBarFindBestMatch = getTimeZoneGenericNames().findBestMatch(str, index2, ALL_GENERIC_NAME_TYPES)) != null && index < actionBarFindBestMatch.OLrzqt() + index2) {
                                index = index2 + actionBarFindBestMatch.OLrzqt();
                                strEZpvd = actionBarFindBestMatch.EZpvd();
                                timeTypeCopydefault = actionBarFindBestMatch.copydefault();
                                offsetLocalizedGMT = Integer.MAX_VALUE;
                            }
                            if (index < length && (Style.ZONE_ID.flag & i5) == 0) {
                                parsePosition2.setIndex(index2);
                                parsePosition2.setErrorIndex(-1);
                                zoneID = parseZoneID(str, parsePosition2);
                                if (parsePosition2.getErrorIndex() == -1 && index < parsePosition2.getIndex()) {
                                    int index3 = parsePosition2.getIndex();
                                    timeTypeCopydefault = TimeType.UNKNOWN;
                                    index = index3;
                                    strEZpvd = zoneID;
                                    offsetLocalizedGMT = Integer.MAX_VALUE;
                                }
                            }
                            if (index >= length || (i5 & Style.ZONE_ID_SHORT.flag) != 0) {
                                i2 = offsetLocalizedGMT;
                                t = timeTypeCopydefault;
                            } else {
                                parsePosition2.setIndex(index2);
                                parsePosition2.setErrorIndex(-1);
                                String shortZoneID = parseShortZoneID(str, parsePosition2);
                                if (parsePosition2.getErrorIndex() == -1 && index < parsePosition2.getIndex()) {
                                    index = parsePosition2.getIndex();
                                    t = TimeType.UNKNOWN;
                                    i2 = Integer.MAX_VALUE;
                                    strEZpvd = shortZoneID;
                                }
                            }
                        }
                        strEZpvd = str2;
                        timeTypeCopydefault = timeType2;
                        if (index < length) {
                            index = index2 + actionBarFindBestMatch.OLrzqt();
                            strEZpvd = actionBarFindBestMatch.EZpvd();
                            timeTypeCopydefault = actionBarFindBestMatch.copydefault();
                            offsetLocalizedGMT = Integer.MAX_VALUE;
                        }
                        if (index < length) {
                            parsePosition2.setIndex(index2);
                            parsePosition2.setErrorIndex(-1);
                            zoneID = parseZoneID(str, parsePosition2);
                            if (parsePosition2.getErrorIndex() == -1) {
                                int index32 = parsePosition2.getIndex();
                                timeTypeCopydefault = TimeType.UNKNOWN;
                                index = index32;
                                strEZpvd = zoneID;
                                offsetLocalizedGMT = Integer.MAX_VALUE;
                            }
                        }
                        if (index >= length) {
                            i2 = offsetLocalizedGMT;
                            t = timeTypeCopydefault;
                        }
                    } else {
                        timeType = timeType3;
                    }
                    timeType2 = timeType;
                    timeZoneID = null;
                    if (zContains) {
                        str2 = timeZoneID;
                        strEZpvd = str2;
                        timeTypeCopydefault = timeType2;
                        if (index < length) {
                        }
                        if (index < length) {
                        }
                        if (index >= length) {
                        }
                    }
                } else {
                    t = timeType3;
                    i2 = offsetLocalizedGMT;
                    strEZpvd = null;
                }
                if (index > index2) {
                    if (strEZpvd != null) {
                        timeZoneForOffset = TimeZone.getTimeZone(strEZpvd);
                    } else {
                        timeZoneForOffset = getTimeZoneForOffset(i2);
                    }
                    c7255agQ2.copydefault = t;
                    parsePosition.setIndex(index);
                    return timeZoneForOffset;
                }
                parsePosition.setErrorIndex(index2);
                return null;
            case 4:
            case 5:
                if (style == style2) {
                    enumSetOf2 = EnumSet.of(TimeZoneNames.NameType.LONG_STANDARD, TimeZoneNames.NameType.LONG_DAYLIGHT);
                } else {
                    enumSetOf2 = EnumSet.of(TimeZoneNames.NameType.SHORT_STANDARD, TimeZoneNames.NameType.SHORT_DAYLIGHT);
                }
                Collection<TimeZoneNames.Activity> collectionFind4 = this._tznames.find(str, index2, enumSetOf2);
                if (collectionFind4 != null) {
                    TimeZoneNames.Activity activity5 = null;
                    for (TimeZoneNames.Activity activity6 : collectionFind4) {
                        if (index2 + activity6.KWHzl() > index) {
                            index = activity6.KWHzl() + index2;
                            activity5 = activity6;
                        }
                    }
                    if (activity5 != null) {
                        c7255agQ2.copydefault = getTimeType(activity5.copydefault());
                        parsePosition.setIndex(index);
                        return TimeZone.getTimeZone(getTimeZoneID(activity5.AEQbTJ(), activity5.EZpvd()));
                    }
                }
                if (zContains && style == Style.SPECIFIC_SHORT && (collectionFind2 = getTZDBTimeZoneNames().find(str, index2, enumSetOf2)) != null) {
                    TimeZoneNames.Activity activity7 = null;
                    for (TimeZoneNames.Activity activity8 : collectionFind2) {
                        if (activity8.KWHzl() + index2 > index) {
                            index = activity8.KWHzl() + index2;
                            activity7 = activity8;
                        }
                    }
                    if (activity7 != null) {
                        c7255agQ2.copydefault = getTimeType(activity7.copydefault());
                        parsePosition.setIndex(index);
                        return TimeZone.getTimeZone(getTimeZoneID(activity7.AEQbTJ(), activity7.EZpvd()));
                    }
                }
                int i52 = style.flag | i;
                if (index <= index2) {
                }
                break;
            case 6:
                parsePosition2.setIndex(index2);
                parsePosition2.setErrorIndex(-1);
                String zoneID2 = parseZoneID(str, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return TimeZone.getTimeZone(zoneID2);
                }
                int i522 = style.flag | i;
                if (index <= index2) {
                }
                break;
            case 7:
                parsePosition2.setIndex(index2);
                parsePosition2.setErrorIndex(-1);
                String shortZoneID2 = parseShortZoneID(str, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return TimeZone.getTimeZone(shortZoneID2);
                }
                int i5222 = style.flag | i;
                if (index <= index2) {
                }
                break;
            case 8:
                parsePosition2.setIndex(index2);
                parsePosition2.setErrorIndex(-1);
                String exemplarLocation = parseExemplarLocation(str, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return TimeZone.getTimeZone(exemplarLocation);
                }
                int i52222 = style.flag | i;
                if (index <= index2) {
                }
                break;
            case 9:
                parsePosition2.setIndex(index2);
                parsePosition2.setErrorIndex(-1);
                int offsetLocalizedGMT4 = parseOffsetLocalizedGMT(str, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return getTimeZoneForOffset(offsetLocalizedGMT4);
                }
                i3 = Style.LOCALIZED_GMT_SHORT.flag;
                i |= i3;
                int i522222 = style.flag | i;
                if (index <= index2) {
                }
                break;
            case 10:
                parsePosition2.setIndex(index2);
                parsePosition2.setErrorIndex(-1);
                int offsetShortLocalizedGMT = parseOffsetShortLocalizedGMT(str, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return getTimeZoneForOffset(offsetShortLocalizedGMT);
                }
                i3 = Style.LOCALIZED_GMT.flag;
                i |= i3;
                int i5222222 = style.flag | i;
                if (index <= index2) {
                }
                break;
            case 11:
            case 13:
            case 15:
            case 17:
            case 19:
                parsePosition2.setIndex(index2);
                parsePosition2.setErrorIndex(-1);
                int offsetISO86012 = parseOffsetISO8601(str, parsePosition2);
                if (parsePosition2.getErrorIndex() == -1) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return getTimeZoneForOffset(offsetISO86012);
                }
                int i52222222 = style.flag | i;
                if (index <= index2) {
                }
                break;
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:
                parsePosition2.setIndex(index2);
                parsePosition2.setErrorIndex(-1);
                C7255agQ c7255agQ7 = new C7255agQ(Boolean.FALSE);
                int offsetISO86013 = parseOffsetISO8601(str, parsePosition2, false, c7255agQ7);
                if (parsePosition2.getErrorIndex() == -1 && ((Boolean) c7255agQ7.copydefault).booleanValue()) {
                    parsePosition.setIndex(parsePosition2.getIndex());
                    return getTimeZoneForOffset(offsetISO86013);
                }
                int i522222222 = style.flag | i;
                if (index <= index2) {
                }
                break;
            default:
                int i5222222222 = style.flag | i;
                if (index <= index2) {
                }
                break;
        }
    }

    public TimeZone parse(Style style, String str, ParsePosition parsePosition, C7255agQ<TimeType> c7255agQ) {
        return parse(style, str, parsePosition, null, c7255agQ);
    }

    public final TimeZone parse(String str, ParsePosition parsePosition) {
        return parse(Style.GENERIC_LOCATION, str, parsePosition, EnumSet.of(ParseOption.ALL_STYLES), null);
    }

    public final TimeZone parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        TimeZone timeZone = parse(str, parsePosition);
        if (parsePosition.getErrorIndex() < 0) {
            return timeZone;
        }
        throw new ParseException("Unparseable time zone: \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, 0);
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (obj instanceof TimeZone) {
            timeZone = (TimeZone) obj;
        } else if (obj instanceof Calendar) {
            Calendar calendar = (Calendar) obj;
            TimeZone timeZone2 = calendar.getTimeZone();
            long timeInMillis = calendar.getTimeInMillis();
            timeZone = timeZone2;
            jCurrentTimeMillis = timeInMillis;
        } else {
            throw new IllegalArgumentException("Cannot format given Object (" + obj.getClass().getName() + ") as a time zone");
        }
        String offsetLocalizedGMT = formatOffsetLocalizedGMT(timeZone.getOffset(jCurrentTimeMillis));
        stringBuffer.append(offsetLocalizedGMT);
        if (fieldPosition.getFieldAttribute() == DateFormat.Field.TIME_ZONE || fieldPosition.getField() == 17) {
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(offsetLocalizedGMT.length());
        }
        return stringBuffer;
    }

    @Override // java.text.Format
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        AttributedString attributedString = new AttributedString(format(obj, new StringBuffer(), new FieldPosition(0)).toString());
        DateFormat.Field field = DateFormat.Field.TIME_ZONE;
        attributedString.addAttribute(field, field);
        return attributedString.getIterator();
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    private String formatOffsetLocalizedGMT(int i, boolean z) {
        boolean z2;
        Object[] objArr;
        if (i == 0) {
            return this._gmtZeroFormat;
        }
        StringBuilder sb = new StringBuilder();
        if (i < 0) {
            i = -i;
            z2 = false;
        } else {
            z2 = true;
        }
        int i2 = i / MILLIS_PER_HOUR;
        int i3 = i % MILLIS_PER_HOUR;
        int i4 = i3 / 60000;
        int i5 = i3 % 60000;
        int i6 = i5 / 1000;
        if (i2 > 23 || i4 > 59 || i6 > 59) {
            throw new IllegalArgumentException("Offset out of range :" + i5);
        }
        if (z2) {
            if (i6 != 0) {
                objArr = this._gmtOffsetPatternItems[GMTOffsetPatternType.POSITIVE_HMS.ordinal()];
            } else if (i4 != 0 || !z) {
                objArr = this._gmtOffsetPatternItems[GMTOffsetPatternType.POSITIVE_HM.ordinal()];
            } else {
                objArr = this._gmtOffsetPatternItems[GMTOffsetPatternType.POSITIVE_H.ordinal()];
            }
        } else if (i6 != 0) {
            objArr = this._gmtOffsetPatternItems[GMTOffsetPatternType.NEGATIVE_HMS.ordinal()];
        } else if (i4 != 0 || !z) {
            objArr = this._gmtOffsetPatternItems[GMTOffsetPatternType.NEGATIVE_HM.ordinal()];
        } else {
            objArr = this._gmtOffsetPatternItems[GMTOffsetPatternType.NEGATIVE_H.ordinal()];
        }
        sb.append(this._gmtPatternPrefix);
        for (Object obj : objArr) {
            if (obj instanceof String) {
                sb.append((String) obj);
            } else if (obj instanceof Application) {
                char cEZpvd = ((Application) obj).EZpvd();
                if (cEZpvd == 'H') {
                    appendOffsetDigits(sb, i2, z ? 1 : 2);
                } else if (cEZpvd == 'm') {
                    appendOffsetDigits(sb, i4, 2);
                } else if (cEZpvd == 's') {
                    appendOffsetDigits(sb, i6, 2);
                }
            }
        }
        sb.append(this._gmtPatternSuffix);
        return sb.toString();
    }

    private String formatOffsetISO8601(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        char c;
        int i2 = i < 0 ? -i : i;
        if (z2) {
            if (i2 < 1000) {
                return ISO8601_UTC;
            }
            if (z4 && i2 < 60000) {
                return ISO8601_UTC;
            }
        }
        OffsetFields offsetFields = z3 ? OffsetFields.H : OffsetFields.HM;
        OffsetFields offsetFields2 = z4 ? OffsetFields.HM : OffsetFields.HMS;
        Character ch = z ? null : ':';
        if (i2 >= MAX_OFFSET) {
            throw new IllegalArgumentException("Offset out of range :" + i);
        }
        int i3 = i2 / MILLIS_PER_HOUR;
        int i4 = i2 % MILLIS_PER_HOUR;
        int[] iArr = {i3, i4 / 60000, (i4 % 60000) / 1000};
        int iOrdinal = offsetFields2.ordinal();
        while (iOrdinal > offsetFields.ordinal() && iArr[iOrdinal] == 0) {
            iOrdinal--;
        }
        StringBuilder sb = new StringBuilder();
        if (i < 0) {
            for (int i5 = 0; i5 <= iOrdinal; i5++) {
                if (iArr[i5] != 0) {
                    c = '-';
                    break;
                }
            }
            c = '+';
        } else {
            c = '+';
        }
        sb.append(c);
        for (int i6 = 0; i6 <= iOrdinal; i6++) {
            if (ch != null && i6 != 0) {
                sb.append(ch);
            }
            if (iArr[i6] < 10) {
                sb.append('0');
            }
            sb.append(iArr[i6]);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private String formatSpecific(TimeZone timeZone, TimeZoneNames.NameType nameType, TimeZoneNames.NameType nameType2, long j, C7255agQ<TimeType> c7255agQ) {
        String displayName;
        boolean zInDaylightTime = timeZone.inDaylightTime(new Date(j));
        if (zInDaylightTime) {
            displayName = getTimeZoneNames().getDisplayName(C7047acU.OLrzqt(timeZone), nameType2, j);
        } else {
            displayName = getTimeZoneNames().getDisplayName(C7047acU.OLrzqt(timeZone), nameType, j);
        }
        if (displayName != null && c7255agQ != null) {
            c7255agQ.copydefault = zInDaylightTime ? TimeType.DAYLIGHT : TimeType.STANDARD;
        }
        return displayName;
    }

    private String formatExemplarLocation(TimeZone timeZone) {
        String exemplarLocationName = getTimeZoneNames().getExemplarLocationName(C7047acU.OLrzqt(timeZone));
        if (exemplarLocationName != null) {
            return exemplarLocationName;
        }
        String exemplarLocationName2 = getTimeZoneNames().getExemplarLocationName("Etc/Unknown");
        return exemplarLocationName2 == null ? "Unknown" : exemplarLocationName2;
    }

    private String getTimeZoneID(String str, String str2) {
        if (str != null || (str = this._tznames.getReferenceZoneID(str2, getTargetRegion())) != null) {
            return str;
        }
        throw new IllegalArgumentException("Invalid mzID: " + str2);
    }

    private String getTargetRegion() {
        String str;
        synchronized (this) {
            if (this._region == null) {
                String country = this._locale.getCountry();
                this._region = country;
                if (country.length() == 0) {
                    String country2 = ULocale.addLikelySubtags(this._locale).getCountry();
                    this._region = country2;
                    if (country2.length() == 0) {
                        this._region = "001";
                    }
                }
            }
            str = this._region;
        }
        return str;
    }

    /* JADX INFO: renamed from: com.ibm.icu.text.TimeZoneFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[TimeZoneNames.NameType.values().length];
            EZpvd = iArr;
            try {
                iArr[TimeZoneNames.NameType.LONG_STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[TimeZoneNames.NameType.SHORT_STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EZpvd[TimeZoneNames.NameType.LONG_DAYLIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EZpvd[TimeZoneNames.NameType.SHORT_DAYLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Style.values().length];
            copydefault = iArr2;
            try {
                iArr2[Style.GENERIC_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                copydefault[Style.GENERIC_LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                copydefault[Style.GENERIC_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                copydefault[Style.SPECIFIC_LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                copydefault[Style.SPECIFIC_SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                copydefault[Style.ZONE_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                copydefault[Style.ZONE_ID_SHORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                copydefault[Style.EXEMPLAR_LOCATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                copydefault[Style.LOCALIZED_GMT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                copydefault[Style.LOCALIZED_GMT_SHORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                copydefault[Style.ISO_BASIC_SHORT.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                copydefault[Style.ISO_BASIC_LOCAL_SHORT.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                copydefault[Style.ISO_BASIC_FIXED.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                copydefault[Style.ISO_BASIC_LOCAL_FIXED.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                copydefault[Style.ISO_BASIC_FULL.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                copydefault[Style.ISO_BASIC_LOCAL_FULL.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                copydefault[Style.ISO_EXTENDED_FIXED.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                copydefault[Style.ISO_EXTENDED_LOCAL_FIXED.ordinal()] = 18;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                copydefault[Style.ISO_EXTENDED_FULL.ordinal()] = 19;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                copydefault[Style.ISO_EXTENDED_LOCAL_FULL.ordinal()] = 20;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    private TimeType getTimeType(TimeZoneNames.NameType nameType) {
        int i = AnonymousClass1.EZpvd[nameType.ordinal()];
        if (i == 1 || i == 2) {
            return TimeType.STANDARD;
        }
        if (i == 3 || i == 4) {
            return TimeType.DAYLIGHT;
        }
        return TimeType.UNKNOWN;
    }

    private void initGMTPattern(String str) {
        int iIndexOf = str.indexOf("{0}");
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Bad localized GMT pattern: " + str);
        }
        this._gmtPattern = str;
        this._gmtPatternPrefix = unquote(str.substring(0, iIndexOf));
        this._gmtPatternSuffix = unquote(str.substring(iIndexOf + 3));
    }

    private static String unquote(String str) {
        if (str.indexOf(39) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\'' || z) {
                sb.append(cCharAt);
                z = false;
            } else {
                z = true;
            }
        }
        return sb.toString();
    }

    private void initGMTOffsetPatterns(String[] strArr) {
        int length = GMTOffsetPatternType.values().length;
        if (strArr.length < length) {
            throw new IllegalArgumentException("Insufficient number of elements in gmtOffsetPatterns");
        }
        Object[][] objArr = new Object[length][];
        for (GMTOffsetPatternType gMTOffsetPatternType : GMTOffsetPatternType.values()) {
            int iOrdinal = gMTOffsetPatternType.ordinal();
            objArr[iOrdinal] = parseOffsetPattern(strArr[iOrdinal], gMTOffsetPatternType.required());
        }
        String[] strArr2 = new String[length];
        this._gmtOffsetPatterns = strArr2;
        System.arraycopy(strArr, 0, strArr2, 0, length);
        this._gmtOffsetPatternItems = objArr;
        checkAbuttingHoursAndMinutes();
    }

    private void checkAbuttingHoursAndMinutes() {
        this._abuttingOffsetHoursAndMinutes = false;
        for (Object[] objArr : this._gmtOffsetPatternItems) {
            boolean z = false;
            for (Object obj : objArr) {
                if (!(obj instanceof Application)) {
                    if (z) {
                        break;
                    }
                } else {
                    Application application = (Application) obj;
                    if (z) {
                        this._abuttingOffsetHoursAndMinutes = true;
                    } else if (application.EZpvd() == 'H') {
                        z = true;
                    }
                }
            }
        }
    }

    public static class Application {
        public final char EZpvd;
        public final int OLrzqt;

        public static boolean EZpvd(char c, int i) {
            return i == 1 || i == 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public char EZpvd() {
            return this.EZpvd;
        }

        public Application(char c, int i) {
            this.EZpvd = c;
            this.OLrzqt = i;
        }
    }

    private static Object[] parseOffsetPattern(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        BitSet bitSet = new BitSet(str2.length());
        boolean z = true;
        int i = 1;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (true) {
            if (i2 >= str.length()) {
                z = false;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\'') {
                if (z3) {
                    sb.append('\'');
                    z3 = false;
                } else {
                    if (c != 0) {
                        if (!Application.EZpvd(c, i)) {
                            break;
                        }
                        arrayList.add(new Application(c, i));
                        c = 0;
                    }
                    z3 = true;
                }
                z2 = !z2;
                i2++;
            } else {
                if (z2) {
                    sb.append(cCharAt);
                } else {
                    int iIndexOf = str2.indexOf(cCharAt);
                    if (iIndexOf < 0) {
                        if (c != 0) {
                            if (!Application.EZpvd(c, i)) {
                                break;
                            }
                            arrayList.add(new Application(c, i));
                            c = 0;
                        }
                        sb.append(cCharAt);
                    } else if (cCharAt == c) {
                        i++;
                    } else {
                        if (c == 0) {
                            if (sb.length() > 0) {
                                arrayList.add(sb.toString());
                                sb.setLength(0);
                            }
                        } else {
                            if (!Application.EZpvd(c, i)) {
                                break;
                            }
                            arrayList.add(new Application(c, i));
                        }
                        bitSet.set(iIndexOf);
                        i = 1;
                        z3 = false;
                        c = cCharAt;
                    }
                    i2++;
                }
                z3 = false;
                i2++;
            }
        }
        if (!z) {
            if (c == 0) {
                if (sb.length() > 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            } else if (Application.EZpvd(c, i)) {
                arrayList.add(new Application(c, i));
            }
            if (!z) {
                return arrayList.toArray(new Object[arrayList.size()]);
            }
        } else if (!z && bitSet.cardinality() == str2.length()) {
            return arrayList.toArray(new Object[arrayList.size()]);
        }
        throw new IllegalStateException("Bad localized GMT offset pattern: " + str);
    }

    private static String expandOffsetPattern(String str) {
        int iIndexOf = str.indexOf("mm");
        if (iIndexOf < 0) {
            throw new RuntimeException("Bad time zone hour pattern data");
        }
        int iLastIndexOf = str.substring(0, iIndexOf).lastIndexOf(DateFormat.HOUR24);
        String strSubstring = iLastIndexOf >= 0 ? str.substring(iLastIndexOf + 1, iIndexOf) : ":";
        StringBuilder sb = new StringBuilder();
        int i = iIndexOf + 2;
        sb.append(str.substring(0, i));
        sb.append(strSubstring);
        sb.append("ss");
        sb.append(str.substring(i));
        return sb.toString();
    }

    private static String truncateOffsetPattern(String str) {
        int iIndexOf = str.indexOf("mm");
        if (iIndexOf < 0) {
            throw new RuntimeException("Bad time zone hour pattern data");
        }
        int iLastIndexOf = str.substring(0, iIndexOf).lastIndexOf("HH");
        if (iLastIndexOf >= 0) {
            return str.substring(0, iLastIndexOf + 2);
        }
        int iLastIndexOf2 = str.substring(0, iIndexOf).lastIndexOf(DateFormat.HOUR24);
        if (iLastIndexOf2 >= 0) {
            return str.substring(0, iLastIndexOf2 + 1);
        }
        throw new RuntimeException("Bad time zone hour pattern data");
    }

    private void appendOffsetDigits(StringBuilder sb, int i, int i2) {
        int i3 = i >= 10 ? 2 : 1;
        for (int i4 = 0; i4 < i2 - i3; i4++) {
            sb.append(this._gmtOffsetDigits[0]);
        }
        if (i3 == 2) {
            sb.append(this._gmtOffsetDigits[i / 10]);
        }
        sb.append(this._gmtOffsetDigits[i % 10]);
    }

    private TimeZone getTimeZoneForOffset(int i) {
        if (i == 0) {
            return TimeZone.getTimeZone(TZID_GMT);
        }
        return C7047acU.AEQbTJ(i);
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r11v5, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Boolean] */
    private int parseOffsetLocalizedGMT(String str, ParsePosition parsePosition, boolean z, C7255agQ<Boolean> c7255agQ) {
        int index = parsePosition.getIndex();
        int[] iArr = {0};
        if (c7255agQ != null) {
            c7255agQ.copydefault = Boolean.FALSE;
        }
        int offsetLocalizedGMTPattern = parseOffsetLocalizedGMTPattern(str, index, z, iArr);
        int i = iArr[0];
        if (i > 0) {
            if (c7255agQ != null) {
                c7255agQ.copydefault = Boolean.TRUE;
            }
            parsePosition.setIndex(index + i);
            return offsetLocalizedGMTPattern;
        }
        int offsetDefaultLocalizedGMT = parseOffsetDefaultLocalizedGMT(str, index, iArr);
        int i2 = iArr[0];
        if (i2 > 0) {
            if (c7255agQ != null) {
                c7255agQ.copydefault = Boolean.TRUE;
            }
            parsePosition.setIndex(index + i2);
            return offsetDefaultLocalizedGMT;
        }
        String str2 = this._gmtZeroFormat;
        if (str.regionMatches(true, index, str2, 0, str2.length())) {
            parsePosition.setIndex(index + this._gmtZeroFormat.length());
            return 0;
        }
        for (String str3 : ALT_GMT_STRINGS) {
            if (str.regionMatches(true, index, str3, 0, str3.length())) {
                parsePosition.setIndex(index + str3.length());
                return 0;
            }
        }
        parsePosition.setErrorIndex(index);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[PHI: r1
  0x0045: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:8:0x002b, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int parseOffsetLocalizedGMTPattern(String str, int i, boolean z, int[] iArr) {
        int i2;
        boolean z2;
        int offsetFields;
        int length = this._gmtPatternPrefix.length();
        if (length <= 0 || str.regionMatches(true, i, this._gmtPatternPrefix, 0, length)) {
            i2 = i + length;
            z2 = true;
            int[] iArr2 = new int[1];
            offsetFields = parseOffsetFields(str, i2, false, iArr2);
            int i3 = iArr2[0];
            if (i3 == 0) {
                z2 = false;
            } else {
                i2 += i3;
                int length2 = this._gmtPatternSuffix.length();
                if (length2 <= 0 || str.regionMatches(true, i2, this._gmtPatternSuffix, 0, length2)) {
                    i2 += length2;
                }
            }
        } else {
            i2 = i;
            z2 = false;
            offsetFields = 0;
        }
        iArr[0] = z2 ? i2 - i : 0;
        return offsetFields;
    }

    private int parseOffsetFields(String str, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (iArr != null && iArr.length >= 1) {
            iArr[0] = 0;
        }
        int[] iArr2 = {0, 0, 0};
        GMTOffsetPatternType[] gMTOffsetPatternTypeArr = PARSE_GMT_OFFSET_TYPES;
        int length = gMTOffsetPatternTypeArr.length;
        int offsetFieldsWithPattern = 0;
        int i8 = 0;
        while (true) {
            i2 = -1;
            if (i8 >= length) {
                i3 = offsetFieldsWithPattern;
                i4 = 1;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                break;
            }
            GMTOffsetPatternType gMTOffsetPatternType = gMTOffsetPatternTypeArr[i8];
            offsetFieldsWithPattern = parseOffsetFieldsWithPattern(str, i, this._gmtOffsetPatternItems[gMTOffsetPatternType.ordinal()], false, iArr2);
            if (offsetFieldsWithPattern > 0) {
                i3 = offsetFieldsWithPattern;
                i4 = gMTOffsetPatternType.isPositive() ? 1 : -1;
                i5 = iArr2[0];
                i6 = iArr2[1];
                i7 = iArr2[2];
            } else {
                i8++;
            }
        }
        if (i3 > 0 && this._abuttingOffsetHoursAndMinutes) {
            GMTOffsetPatternType[] gMTOffsetPatternTypeArr2 = PARSE_GMT_OFFSET_TYPES;
            int length2 = gMTOffsetPatternTypeArr2.length;
            int offsetFieldsWithPattern2 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= length2) {
                    break;
                }
                GMTOffsetPatternType gMTOffsetPatternType2 = gMTOffsetPatternTypeArr2[i9];
                int i10 = i9;
                int i11 = length2;
                GMTOffsetPatternType[] gMTOffsetPatternTypeArr3 = gMTOffsetPatternTypeArr2;
                offsetFieldsWithPattern2 = parseOffsetFieldsWithPattern(str, i, this._gmtOffsetPatternItems[gMTOffsetPatternType2.ordinal()], true, iArr2);
                if (offsetFieldsWithPattern2 <= 0) {
                    i9 = i10 + 1;
                    length2 = i11;
                    gMTOffsetPatternTypeArr2 = gMTOffsetPatternTypeArr3;
                } else if (gMTOffsetPatternType2.isPositive()) {
                    break;
                }
            }
            i2 = 1;
            if (offsetFieldsWithPattern2 > i3) {
                i5 = iArr2[0];
                i6 = iArr2[1];
                i7 = iArr2[2];
                i3 = offsetFieldsWithPattern2;
                i4 = i2;
            }
        }
        if (iArr != null && iArr.length >= 1) {
            iArr[0] = i3;
        }
        if (i3 > 0) {
            return ((((i5 * 60) + i6) * 60) + i7) * 1000 * i4;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int parseOffsetFieldsWithPattern(String str, int i, Object[] objArr, boolean z, int[] iArr) {
        boolean z2;
        int i2;
        int i3;
        iArr[2] = 0;
        iArr[1] = 0;
        iArr[0] = 0;
        int[] iArr2 = {0};
        int i4 = i;
        int offsetFieldWithLocalizedDigits = 0;
        int offsetFieldWithLocalizedDigits2 = 0;
        int offsetFieldWithLocalizedDigits3 = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj instanceof String) {
                String str2 = (String) obj;
                int length = str2.length();
                if (i5 == 0 && i4 < str.length()) {
                    if (!C7070acr.AEQbTJ(str.codePointAt(i4))) {
                        int i6 = 0;
                        while (length > 0) {
                            int iCodePointAt = str2.codePointAt(i6);
                            if (!C7070acr.AEQbTJ(iCodePointAt)) {
                                break;
                            }
                            int iCharCount = Character.charCount(iCodePointAt);
                            length -= iCharCount;
                            i6 += iCharCount;
                        }
                        i3 = length;
                        i2 = i6;
                    }
                    if (str.regionMatches(true, i4, str2, i2, i3)) {
                        z2 = true;
                        break;
                    }
                    i4 += i3;
                }
                i2 = 0;
                i3 = length;
                if (str.regionMatches(true, i4, str2, i2, i3)) {
                }
            } else {
                char cEZpvd = ((Application) obj).EZpvd();
                if (cEZpvd == 'H') {
                    offsetFieldWithLocalizedDigits = parseOffsetFieldWithLocalizedDigits(str, i4, 1, z ? 1 : 2, 0, 23, iArr2);
                } else if (cEZpvd == 'm') {
                    offsetFieldWithLocalizedDigits2 = parseOffsetFieldWithLocalizedDigits(str, i4, 2, 2, 0, 59, iArr2);
                } else if (cEZpvd == 's') {
                    offsetFieldWithLocalizedDigits3 = parseOffsetFieldWithLocalizedDigits(str, i4, 2, 2, 0, 59, iArr2);
                }
                int i7 = iArr2[0];
                if (i7 == 0) {
                    z2 = true;
                    break;
                }
                i4 += i7;
            }
        }
        z2 = false;
        if (z2) {
            return 0;
        }
        iArr[0] = offsetFieldWithLocalizedDigits;
        iArr[1] = offsetFieldWithLocalizedDigits2;
        iArr[2] = offsetFieldWithLocalizedDigits3;
        return i4 - i;
    }

    private int parseOffsetDefaultLocalizedGMT(String str, int i, int[] iArr) {
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String[] strArr = ALT_GMT_STRINGS;
        int length2 = strArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length2) {
                length = 0;
                break;
            }
            String str2 = strArr[i8];
            length = str2.length();
            if (str.regionMatches(true, i, str2, 0, length)) {
                break;
            }
            i8++;
        }
        if (length != 0 && (i5 = (i4 = length + i) + 1) < str.length()) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '+') {
                i6 = cCharAt == '-' ? -1 : 1;
                i2 = 0;
                i3 = 0;
            }
            int[] iArr2 = {0};
            int defaultOffsetFields = parseDefaultOffsetFields(str, i5, ':', iArr2);
            if (iArr2[0] == str.length() - i5) {
                i3 = defaultOffsetFields * i6;
                i7 = i5 + iArr2[0];
            } else {
                int[] iArr3 = {0};
                int abuttingOffsetFields = parseAbuttingOffsetFields(str, i5, iArr3);
                int i9 = iArr2[0];
                int i10 = iArr3[0];
                if (i9 > i10) {
                    i3 = defaultOffsetFields * i6;
                    i7 = i5 + i9;
                } else {
                    i3 = abuttingOffsetFields * i6;
                    i7 = i5 + i10;
                }
            }
            i2 = i7 - i;
        } else {
            i2 = 0;
            i3 = 0;
        }
        iArr[0] = i2;
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int parseDefaultOffsetFields(String str, int i, char c, int[] iArr) {
        int i2;
        int offsetFieldWithLocalizedDigits;
        int offsetFieldWithLocalizedDigits2;
        int i3;
        int length = str.length();
        int[] iArr2 = {0};
        int offsetFieldWithLocalizedDigits3 = parseOffsetFieldWithLocalizedDigits(str, i, 1, 2, 0, 23, iArr2);
        int i4 = iArr2[0];
        if (i4 != 0) {
            i2 = i + i4;
            int i5 = i2 + 1;
            if (i5 < length && str.charAt(i2) == c) {
                offsetFieldWithLocalizedDigits = parseOffsetFieldWithLocalizedDigits(str, i5, 2, 2, 0, 59, iArr2);
                int i6 = iArr2[0];
                if (i6 != 0 && (i3 = (i2 = i2 + i6 + 1) + 1) < length && str.charAt(i2) == c) {
                    offsetFieldWithLocalizedDigits2 = parseOffsetFieldWithLocalizedDigits(str, i3, 2, 2, 0, 59, iArr2);
                    int i7 = iArr2[0];
                    if (i7 != 0) {
                        i2 += i7 + 1;
                    }
                } else {
                    offsetFieldWithLocalizedDigits2 = 0;
                }
            }
            if (i2 != i) {
                iArr[0] = 0;
                return 0;
            }
            iArr[0] = i2 - i;
            return (offsetFieldWithLocalizedDigits3 * MILLIS_PER_HOUR) + (offsetFieldWithLocalizedDigits * 60000) + (offsetFieldWithLocalizedDigits2 * 1000);
        }
        i2 = i;
        offsetFieldWithLocalizedDigits2 = 0;
        offsetFieldWithLocalizedDigits = 0;
        if (i2 != i) {
        }
    }

    private int parseAbuttingOffsetFields(String str, int i, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        int[] iArr4 = {0};
        int i10 = i;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            int singleLocalizedDigit = parseSingleLocalizedDigit(str, i10, iArr4);
            iArr2[i12] = singleLocalizedDigit;
            if (singleLocalizedDigit < 0) {
                break;
            }
            i10 += iArr4[0];
            iArr3[i12] = i10 - i;
            i11++;
        }
        if (i11 == 0) {
            iArr[0] = 0;
            return 0;
        }
        while (i11 > 0) {
            switch (i11) {
                case 1:
                    i2 = iArr2[0];
                    i3 = i2;
                    i4 = 0;
                    i5 = 0;
                    break;
                case 2:
                    i2 = (iArr2[0] * 10) + iArr2[1];
                    i3 = i2;
                    i4 = 0;
                    i5 = 0;
                    break;
                case 3:
                    i3 = iArr2[0];
                    i6 = iArr2[1] * 10;
                    i7 = iArr2[2];
                    i5 = i6 + i7;
                    i4 = 0;
                    break;
                case 4:
                    i3 = iArr2[1] + (iArr2[0] * 10);
                    i6 = iArr2[2] * 10;
                    i7 = iArr2[3];
                    i5 = i6 + i7;
                    i4 = 0;
                    break;
                case 5:
                    i3 = iArr2[0];
                    i5 = iArr2[2] + (iArr2[1] * 10);
                    int i13 = iArr2[3];
                    i8 = iArr2[4];
                    i9 = i13 * 10;
                    i4 = i8 + i9;
                    break;
                case 6:
                    i3 = (iArr2[0] * 10) + iArr2[1];
                    i5 = (iArr2[2] * 10) + iArr2[3];
                    i8 = iArr2[4] * 10;
                    i9 = iArr2[5];
                    i4 = i8 + i9;
                    break;
                default:
                    i4 = 0;
                    i5 = 0;
                    i3 = 0;
                    break;
            }
            if (i3 <= 23 && i5 <= 59 && i4 <= 59) {
                iArr[0] = iArr3[i11 - 1];
                return (i3 * MILLIS_PER_HOUR) + (i5 * 60000) + (i4 * 1000);
            }
            i11--;
        }
        return 0;
    }

    private int parseOffsetFieldWithLocalizedDigits(String str, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int singleLocalizedDigit;
        int i6;
        iArr[0] = 0;
        int[] iArr2 = {0};
        int i7 = i;
        int i8 = 0;
        int i9 = 0;
        while (i7 < str.length() && i8 < i3 && (singleLocalizedDigit = parseSingleLocalizedDigit(str, i7, iArr2)) >= 0 && (i6 = (i9 * 10) + singleLocalizedDigit) <= i5) {
            i8++;
            i7 += iArr2[0];
            i9 = i6;
        }
        if (i8 < i2 || i9 < i4) {
            return -1;
        }
        iArr[0] = i7 - i;
        return i9;
    }

    private int parseSingleLocalizedDigit(String str, int i, int[] iArr) {
        iArr[0] = 0;
        int iOLrzqt = -1;
        if (i < str.length()) {
            int iCodePointAt = Character.codePointAt(str, i);
            int i2 = 0;
            while (true) {
                String[] strArr = this._gmtOffsetDigits;
                if (i2 >= strArr.length) {
                    break;
                }
                if (iCodePointAt == strArr[i2].codePointAt(0)) {
                    iOLrzqt = i2;
                    break;
                }
                i2++;
            }
            if (iOLrzqt < 0) {
                iOLrzqt = C7223afl.OLrzqt(iCodePointAt);
            }
            if (iOLrzqt >= 0) {
                iArr[0] = Character.charCount(iCodePointAt);
            }
        }
        return iOLrzqt;
    }

    private static String[] toCodePoints(String str) {
        int i = 0;
        int iCodePointCount = str.codePointCount(0, str.length());
        String[] strArr = new String[iCodePointCount];
        int i2 = 0;
        while (i < iCodePointCount) {
            int iCharCount = Character.charCount(str.codePointAt(i2)) + i2;
            strArr[i] = str.substring(i2, iCharCount);
            i++;
            i2 = iCharCount;
        }
        return strArr;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Boolean] */
    private static int parseOffsetISO8601(String str, ParsePosition parsePosition, boolean z, C7255agQ<Boolean> c7255agQ) {
        if (c7255agQ != null) {
            c7255agQ.copydefault = Boolean.FALSE;
        }
        int index = parsePosition.getIndex();
        if (index >= str.length()) {
            parsePosition.setErrorIndex(index);
            return 0;
        }
        char cCharAt = str.charAt(index);
        int i = 1;
        if (Character.toUpperCase(cCharAt) == ISO8601_UTC.charAt(0)) {
            parsePosition.setIndex(index + 1);
            return 0;
        }
        if (cCharAt != '+') {
            if (cCharAt != '-') {
                parsePosition.setErrorIndex(index);
                return 0;
            }
            i = -1;
        }
        int i2 = index + 1;
        ParsePosition parsePosition2 = new ParsePosition(i2);
        OffsetFields offsetFields = OffsetFields.H;
        OffsetFields offsetFields2 = OffsetFields.HMS;
        int asciiOffsetFields = parseAsciiOffsetFields(str, parsePosition2, ':', offsetFields, offsetFields2);
        if (parsePosition2.getErrorIndex() == -1 && !z && parsePosition2.getIndex() - index <= 3) {
            ParsePosition parsePosition3 = new ParsePosition(i2);
            int abuttingAsciiOffsetFields = parseAbuttingAsciiOffsetFields(str, parsePosition3, offsetFields, offsetFields2, false);
            if (parsePosition3.getErrorIndex() == -1 && parsePosition3.getIndex() > parsePosition2.getIndex()) {
                parsePosition2.setIndex(parsePosition3.getIndex());
                asciiOffsetFields = abuttingAsciiOffsetFields;
            }
        }
        if (parsePosition2.getErrorIndex() != -1) {
            parsePosition.setErrorIndex(index);
            return 0;
        }
        parsePosition.setIndex(parsePosition2.getIndex());
        if (c7255agQ != null) {
            c7255agQ.copydefault = Boolean.TRUE;
        }
        return i * asciiOffsetFields;
    }

    private static int parseAbuttingAsciiOffsetFields(String str, ParsePosition parsePosition, OffsetFields offsetFields, OffsetFields offsetFields2, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int index = parsePosition.getIndex();
        boolean z2 = true;
        int iOrdinal = ((offsetFields.ordinal() + 1) * 2) - (!z ? 1 : 0);
        int iOrdinal2 = (offsetFields2.ordinal() + 1) * 2;
        int[] iArr = new int[iOrdinal2];
        int i9 = 0;
        for (int i10 = index; i9 < iOrdinal2 && i10 < str.length(); i10++) {
            int iIndexOf = ASCII_DIGITS.indexOf(str.charAt(i10));
            if (iIndexOf < 0) {
                break;
            }
            iArr[i9] = iIndexOf;
            i9++;
        }
        if (z && (i9 & 1) != 0) {
            i9--;
        }
        if (i9 < iOrdinal) {
            parsePosition.setErrorIndex(index);
            return 0;
        }
        while (true) {
            if (i9 >= iOrdinal) {
                switch (i9) {
                    case 1:
                        i4 = iArr[0];
                        i2 = i4;
                        i = 0;
                        i3 = 0;
                        break;
                    case 2:
                        i4 = (iArr[0] * 10) + iArr[1];
                        i2 = i4;
                        i = 0;
                        i3 = 0;
                        break;
                    case 3:
                        i2 = iArr[0];
                        i5 = iArr[1] * 10;
                        i6 = iArr[2];
                        i3 = i5 + i6;
                        i = 0;
                        break;
                    case 4:
                        i2 = iArr[1] + (iArr[0] * 10);
                        i5 = iArr[2] * 10;
                        i6 = iArr[3];
                        i3 = i5 + i6;
                        i = 0;
                        break;
                    case 5:
                        i2 = iArr[0];
                        i3 = (iArr[1] * 10) + iArr[2];
                        int i11 = iArr[3];
                        i7 = iArr[4];
                        i8 = i11 * 10;
                        i = i7 + i8;
                        break;
                    case 6:
                        i2 = (iArr[0] * 10) + iArr[1];
                        i3 = (iArr[2] * 10) + iArr[3];
                        i7 = iArr[4] * 10;
                        i8 = iArr[5];
                        i = i7 + i8;
                        break;
                    default:
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        break;
                }
                if (i2 > 23 || i3 > 59 || i > 59) {
                    i9 -= z ? 2 : 1;
                }
            } else {
                i = 0;
                z2 = false;
                i2 = 0;
                i3 = 0;
            }
        }
        if (!z2) {
            parsePosition.setErrorIndex(index);
            return 0;
        }
        parsePosition.setIndex(index + i9);
        return ((((i2 * 60) + i3) * 60) + i) * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0094 A[PHI: r11 r13 r15
  0x0094: PHI (r11v2 int) = (r11v1 int), (r11v1 int), (r11v4 int), (r11v4 int) binds: [B:34:0x0070, B:36:0x0076, B:39:0x0084, B:41:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int), (r13v4 int) binds: [B:34:0x0070, B:36:0x0076, B:39:0x0084, B:41:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r15v3 com.ibm.icu.text.TimeZoneFormat$OffsetFields) = 
  (r15v2 com.ibm.icu.text.TimeZoneFormat$OffsetFields)
  (r15v2 com.ibm.icu.text.TimeZoneFormat$OffsetFields)
  (r15v5 com.ibm.icu.text.TimeZoneFormat$OffsetFields)
  (r15v5 com.ibm.icu.text.TimeZoneFormat$OffsetFields)
 binds: [B:34:0x0070, B:36:0x0076, B:39:0x0084, B:41:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int parseAsciiOffsetFields(String str, ParsePosition parsePosition, char c, OffsetFields offsetFields, OffsetFields offsetFields2) {
        int i;
        int i2;
        OffsetFields offsetFields3;
        int i3;
        int i4;
        int iIndexOf;
        int index = parsePosition.getIndex();
        int[] iArr = {0, 0, 0};
        int[] iArr2 = {0, -1, -1};
        int i5 = index;
        int i6 = 0;
        while (true) {
            i = 1;
            if (i5 >= str.length() || i6 > offsetFields2.ordinal()) {
                break;
            }
            char cCharAt = str.charAt(i5);
            if (cCharAt != c) {
                if (iArr2[i6] == -1 || (iIndexOf = ASCII_DIGITS.indexOf(cCharAt)) < 0) {
                    break;
                }
                iArr[i6] = (iArr[i6] * 10) + iIndexOf;
                int i7 = iArr2[i6] + 1;
                iArr2[i6] = i7;
                if (i7 >= 2) {
                    i6++;
                }
            } else if (i6 == 0) {
                if (iArr2[0] == 0) {
                    break;
                }
                i6++;
            } else {
                if (iArr2[i6] != -1) {
                    break;
                }
                iArr2[i6] = 0;
            }
            i5++;
        }
        int i8 = iArr2[0];
        if (i8 == 0) {
            offsetFields3 = null;
            i2 = 0;
            i = 0;
        } else {
            int i9 = iArr[0];
            if (i9 > 23) {
                i2 = (i9 / 10) * MILLIS_PER_HOUR;
                offsetFields3 = OffsetFields.H;
            } else {
                i2 = i9 * MILLIS_PER_HOUR;
                OffsetFields offsetFields4 = OffsetFields.H;
                int i10 = iArr2[1];
                if (i10 != 2 || (i3 = iArr[1]) > 59) {
                    i = i8;
                    offsetFields3 = offsetFields4;
                } else {
                    i2 += i3 * 60000;
                    i8 += i10 + 1;
                    offsetFields4 = OffsetFields.HM;
                    int i11 = iArr2[2];
                    if (i11 == 2 && (i4 = iArr[2]) <= 59) {
                        i2 += i4 * 1000;
                        i = i8 + i11 + 1;
                        offsetFields3 = OffsetFields.HMS;
                    }
                }
            }
        }
        if (offsetFields3 == null || offsetFields3.ordinal() < offsetFields.ordinal()) {
            parsePosition.setErrorIndex(index);
            return 0;
        }
        parsePosition.setIndex(index + i);
        return i2;
    }

    private static String parseZoneID(String str, ParsePosition parsePosition) {
        if (ZONE_ID_TRIE == null) {
            synchronized (TimeZoneFormat.class) {
                if (ZONE_ID_TRIE == null) {
                    C7029acC<String> c7029acC = new C7029acC<>(true);
                    for (String str2 : TimeZone.getAvailableIDs()) {
                        c7029acC.AEQbTJ(str2, str2);
                    }
                    ZONE_ID_TRIE = c7029acC;
                }
            }
        }
        C7029acC.Activity activity = new C7029acC.Activity();
        Iterator<String> itAEQbTJ = ZONE_ID_TRIE.AEQbTJ(str, parsePosition.getIndex(), activity);
        if (itAEQbTJ != null) {
            String next = itAEQbTJ.next();
            parsePosition.setIndex(parsePosition.getIndex() + activity.copydefault);
            return next;
        }
        parsePosition.setErrorIndex(parsePosition.getIndex());
        return null;
    }

    private static String parseShortZoneID(String str, ParsePosition parsePosition) {
        if (SHORT_ZONE_ID_TRIE == null) {
            synchronized (TimeZoneFormat.class) {
                if (SHORT_ZONE_ID_TRIE == null) {
                    C7029acC<String> c7029acC = new C7029acC<>(true);
                    for (String str2 : TimeZone.getAvailableIDs(TimeZone.SystemTimeZoneType.CANONICAL, null, null)) {
                        String strValueOf = C7047acU.valueOf(str2);
                        if (strValueOf != null) {
                            c7029acC.AEQbTJ(strValueOf, str2);
                        }
                    }
                    c7029acC.AEQbTJ(UNKNOWN_SHORT_ZONE_ID, "Etc/Unknown");
                    SHORT_ZONE_ID_TRIE = c7029acC;
                }
            }
        }
        C7029acC.Activity activity = new C7029acC.Activity();
        Iterator<String> itAEQbTJ = SHORT_ZONE_ID_TRIE.AEQbTJ(str, parsePosition.getIndex(), activity);
        if (itAEQbTJ != null) {
            String next = itAEQbTJ.next();
            parsePosition.setIndex(parsePosition.getIndex() + activity.copydefault);
            return next;
        }
        parsePosition.setErrorIndex(parsePosition.getIndex());
        return null;
    }

    private String parseExemplarLocation(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        Collection<TimeZoneNames.Activity> collectionFind = this._tznames.find(str, index, EnumSet.of(TimeZoneNames.NameType.EXEMPLAR_LOCATION));
        String timeZoneID = null;
        if (collectionFind != null) {
            int iKWHzl = -1;
            TimeZoneNames.Activity activity = null;
            for (TimeZoneNames.Activity activity2 : collectionFind) {
                if (activity2.KWHzl() + index > iKWHzl) {
                    iKWHzl = activity2.KWHzl() + index;
                    activity = activity2;
                }
            }
            if (activity != null) {
                timeZoneID = getTimeZoneID(activity.AEQbTJ(), activity.EZpvd());
                parsePosition.setIndex(iKWHzl);
            }
        }
        if (timeZoneID == null) {
            parsePosition.setErrorIndex(index);
        }
        return timeZoneID;
    }

    public static class ActionBar extends AbstractC7078acz<ULocale, TimeZoneFormat, ULocale> {
        private ActionBar() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:3125) call: com.ibm.icu.text.TimeZoneFormat.ActionBar.<init>():void type: THIS */
        public /* synthetic */ ActionBar(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public TimeZoneFormat copydefault(ULocale uLocale, ULocale uLocale2) {
            TimeZoneFormat timeZoneFormat = new TimeZoneFormat(uLocale2);
            timeZoneFormat.m6327freeze();
            return timeZoneFormat;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("_locale", this._locale);
        putFieldPutFields.put("_tznames", this._tznames);
        putFieldPutFields.put("_gmtPattern", this._gmtPattern);
        putFieldPutFields.put("_gmtOffsetPatterns", this._gmtOffsetPatterns);
        putFieldPutFields.put("_gmtOffsetDigits", this._gmtOffsetDigits);
        putFieldPutFields.put("_gmtZeroFormat", this._gmtZeroFormat);
        putFieldPutFields.put("_parseAllStyles", this._parseAllStyles);
        objectOutputStream.writeFields();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        ObjectInputStream.GetField fields = objectInputStream.readFields();
        ULocale uLocale = (ULocale) fields.get("_locale", (Object) null);
        this._locale = uLocale;
        if (uLocale == null) {
            throw new InvalidObjectException("Missing field: locale");
        }
        TimeZoneNames timeZoneNames = (TimeZoneNames) fields.get("_tznames", (Object) null);
        this._tznames = timeZoneNames;
        if (timeZoneNames == null) {
            throw new InvalidObjectException("Missing field: tznames");
        }
        String str = (String) fields.get("_gmtPattern", (Object) null);
        this._gmtPattern = str;
        if (str == null) {
            throw new InvalidObjectException("Missing field: gmtPattern");
        }
        String[] strArr = (String[]) fields.get("_gmtOffsetPatterns", (Object) null);
        if (strArr == null) {
            throw new InvalidObjectException("Missing field: gmtOffsetPatterns");
        }
        if (strArr.length < 4) {
            throw new InvalidObjectException("Incompatible field: gmtOffsetPatterns");
        }
        this._gmtOffsetPatterns = new String[6];
        if (strArr.length == 4) {
            for (int i = 0; i < 4; i++) {
                this._gmtOffsetPatterns[i] = strArr[i];
            }
            this._gmtOffsetPatterns[GMTOffsetPatternType.POSITIVE_H.ordinal()] = truncateOffsetPattern(this._gmtOffsetPatterns[GMTOffsetPatternType.POSITIVE_HM.ordinal()]);
            this._gmtOffsetPatterns[GMTOffsetPatternType.NEGATIVE_H.ordinal()] = truncateOffsetPattern(this._gmtOffsetPatterns[GMTOffsetPatternType.NEGATIVE_HM.ordinal()]);
        } else {
            this._gmtOffsetPatterns = strArr;
        }
        String[] strArr2 = (String[]) fields.get("_gmtOffsetDigits", (Object) null);
        this._gmtOffsetDigits = strArr2;
        if (strArr2 == null) {
            throw new InvalidObjectException("Missing field: gmtOffsetDigits");
        }
        if (strArr2.length != 10) {
            throw new InvalidObjectException("Incompatible field: gmtOffsetDigits");
        }
        String str2 = (String) fields.get("_gmtZeroFormat", (Object) null);
        this._gmtZeroFormat = str2;
        if (str2 == null) {
            throw new InvalidObjectException("Missing field: gmtZeroFormat");
        }
        this._parseAllStyles = fields.get("_parseAllStyles", false);
        if (fields.defaulted("_parseAllStyles")) {
            throw new InvalidObjectException("Missing field: parseAllStyles");
        }
        if (this._tznames instanceof TimeZoneNamesImpl) {
            this._tznames = TimeZoneNames.getInstance(this._locale);
            this._gnames = null;
        } else {
            this._gnames = new TimeZoneGenericNames(this._locale, this._tznames);
        }
        initGMTPattern(this._gmtPattern);
        initGMTOffsetPatterns(this._gmtOffsetPatterns);
    }

    /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
    /* JADX INFO: renamed from: cloneAsThawed, reason: merged with bridge method [inline-methods] */
    public TimeZoneFormat m6326cloneAsThawed() {
        TimeZoneFormat timeZoneFormat = (TimeZoneFormat) super.clone();
        timeZoneFormat._frozen = false;
        return timeZoneFormat;
    }
}
