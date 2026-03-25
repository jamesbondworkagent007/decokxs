package com.ibm.icu.impl;

import androidx.exifinterface.media.ExifInterface;
import com.amplifyframework.core.model.ModelIdentifier;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ibm.icu.text.LocaleDisplayNames;
import com.ibm.icu.text.TimeZoneFormat;
import com.ibm.icu.text.TimeZoneNames;
import com.ibm.icu.util.BasicTimeZone;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.MissingResourceException;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC7078acz;
import o.C7029acC;
import o.C7047acU;
import o.C7255agQ;
import o.C7261agW;
import o.InterfaceC7248agJ;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZoneGenericNames implements Serializable, InterfaceC7248agJ<TimeZoneGenericNames> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long DST_CHECK_RANGE = 15897600000L;
    private static Activity GENERIC_NAMES_CACHE = new Activity(null);
    private static final TimeZoneNames.NameType[] GENERIC_NON_LOCATION_TYPES = {TimeZoneNames.NameType.LONG_GENERIC, TimeZoneNames.NameType.SHORT_GENERIC};
    private static final long serialVersionUID = 2729910342063468417L;
    private volatile transient boolean _frozen;
    private transient ConcurrentHashMap<String, String> _genericLocationNamesMap;
    private transient ConcurrentHashMap<String, String> _genericPartialLocationNamesMap;
    private transient C7029acC<Application> _gnamesTrie;
    private transient boolean _gnamesTrieFullyLoaded;
    private final ULocale _locale;
    private transient WeakReference<LocaleDisplayNames> _localeDisplayNamesRef;
    private transient MessageFormat[] _patternFormatters;
    private transient String _region;
    private TimeZoneNames _tznames;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
    /* JADX INFO: renamed from: freeze, reason: merged with bridge method [inline-methods] */
    public TimeZoneGenericNames m6322freeze() {
        this._frozen = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isFrozen() {
        return this._frozen;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.ibm.icu.util.ULocale) A[MD:(com.ibm.icu.util.ULocale):void (m)] (LINE:44) call: com.ibm.icu.impl.TimeZoneGenericNames.<init>(com.ibm.icu.util.ULocale):void type: THIS */
    public /* synthetic */ TimeZoneGenericNames(ULocale uLocale, AnonymousClass5 anonymousClass5) {
        this(uLocale);
    }

    public enum GenericNameType {
        LOCATION("LONG", "SHORT"),
        LONG(new String[0]),
        SHORT(new String[0]);

        String[] _fallbackTypeOf;

        GenericNameType(String... strArr) {
            this._fallbackTypeOf = strArr;
        }

        public boolean isFallbackTypeOf(GenericNameType genericNameType) {
            String string = genericNameType.toString();
            for (String str : this._fallbackTypeOf) {
                if (str.equals(string)) {
                    return true;
                }
            }
            return false;
        }
    }

    public enum Pattern {
        REGION_FORMAT("regionFormat", "({0})"),
        FALLBACK_FORMAT("fallbackFormat", "{1} ({0})");

        String _defaultVal;
        String _key;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String defaultValue() {
            return this._defaultVal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String key() {
            return this._key;
        }

        Pattern(String str, String str2) {
            this._key = str;
            this._defaultVal = str2;
        }
    }

    public TimeZoneGenericNames(ULocale uLocale, TimeZoneNames timeZoneNames) {
        this._locale = uLocale;
        this._tznames = timeZoneNames;
        init();
    }

    private void init() {
        if (this._tznames == null) {
            this._tznames = TimeZoneNames.getInstance(this._locale);
        }
        this._genericLocationNamesMap = new ConcurrentHashMap<>();
        this._genericPartialLocationNamesMap = new ConcurrentHashMap<>();
        this._gnamesTrie = new C7029acC<>(true);
        this._gnamesTrieFullyLoaded = false;
        String strOLrzqt = C7047acU.OLrzqt(TimeZone.getDefault());
        if (strOLrzqt != null) {
            loadStrings(strOLrzqt);
        }
    }

    private TimeZoneGenericNames(ULocale uLocale) {
        this(uLocale, (TimeZoneNames) null);
    }

    public static TimeZoneGenericNames getInstance(ULocale uLocale) {
        return GENERIC_NAMES_CACHE.AEQbTJ(uLocale.getBaseName(), uLocale);
    }

    public String getDisplayName(TimeZone timeZone, GenericNameType genericNameType, long j) {
        String strOLrzqt;
        int i = AnonymousClass5.OLrzqt[genericNameType.ordinal()];
        if (i == 1) {
            String strOLrzqt2 = C7047acU.OLrzqt(timeZone);
            if (strOLrzqt2 != null) {
                return getGenericLocationName(strOLrzqt2);
            }
        } else if (i == 2 || i == 3) {
            String genericNonLocationName = formatGenericNonLocationName(timeZone, genericNameType, j);
            return (genericNonLocationName != null || (strOLrzqt = C7047acU.OLrzqt(timeZone)) == null) ? genericNonLocationName : getGenericLocationName(strOLrzqt);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public String getGenericLocationName(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String pattern = this._genericLocationNamesMap.get(str);
        if (pattern != null) {
            if (pattern.length() == 0) {
                return null;
            }
            return pattern;
        }
        C7255agQ c7255agQ = new C7255agQ();
        String strEZpvd = C7047acU.EZpvd(str, c7255agQ);
        if (strEZpvd != null) {
            if (((Boolean) c7255agQ.copydefault).booleanValue()) {
                pattern = formatPattern(Pattern.REGION_FORMAT, getLocaleDisplayNames().KWHzl(strEZpvd));
            } else {
                pattern = formatPattern(Pattern.REGION_FORMAT, this._tznames.getExemplarLocationName(str));
            }
        }
        if (pattern == null) {
            this._genericLocationNamesMap.putIfAbsent(str.intern(), "");
        } else {
            synchronized (this) {
                String strIntern = str.intern();
                String strPutIfAbsent = this._genericLocationNamesMap.putIfAbsent(strIntern, pattern.intern());
                if (strPutIfAbsent == null) {
                    this._gnamesTrie.AEQbTJ(pattern, new Application(strIntern, GenericNameType.LOCATION));
                } else {
                    pattern = strPutIfAbsent;
                }
            }
        }
        return pattern;
    }

    public TimeZoneGenericNames setFormatPattern(Pattern pattern, String str) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        if (!this._genericLocationNamesMap.isEmpty()) {
            this._genericLocationNamesMap = new ConcurrentHashMap<>();
        }
        if (!this._genericPartialLocationNamesMap.isEmpty()) {
            this._genericPartialLocationNamesMap = new ConcurrentHashMap<>();
        }
        this._gnamesTrie = null;
        this._gnamesTrieFullyLoaded = false;
        if (this._patternFormatters == null) {
            this._patternFormatters = new MessageFormat[Pattern.values().length];
        }
        this._patternFormatters[pattern.ordinal()] = new MessageFormat(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String formatGenericNonLocationName(TimeZone timeZone, GenericNameType genericNameType, long j) {
        String metaZoneID;
        String str;
        String metaZoneDisplayName;
        TimeZoneNames.NameType nameType;
        String displayName;
        C7261agW nextTransition;
        String strOLrzqt = C7047acU.OLrzqt(timeZone);
        if (strOLrzqt == null) {
            return null;
        }
        TimeZoneNames.NameType nameType2 = genericNameType == GenericNameType.LONG ? TimeZoneNames.NameType.LONG_GENERIC : TimeZoneNames.NameType.SHORT_GENERIC;
        String timeZoneDisplayName = this._tznames.getTimeZoneDisplayName(strOLrzqt, nameType2);
        if (timeZoneDisplayName != null || (metaZoneID = this._tznames.getMetaZoneID(strOLrzqt, j)) == null) {
            return timeZoneDisplayName;
        }
        int[] iArr = {0, 0};
        timeZone.getOffset(j, false, iArr);
        if (iArr[1] != 0) {
            str = timeZoneDisplayName;
        } else if (timeZone instanceof BasicTimeZone) {
            BasicTimeZone basicTimeZone = (BasicTimeZone) timeZone;
            C7261agW previousTransition = basicTimeZone.getPreviousTransition(j, true);
            if ((previousTransition == null || j - previousTransition.KWHzl() >= DST_CHECK_RANGE || previousTransition.EZpvd().getDSTSavings() == 0) && ((nextTransition = basicTimeZone.getNextTransition(j, false)) == null || nextTransition.KWHzl() - j >= DST_CHECK_RANGE || nextTransition.OLrzqt().getDSTSavings() == 0)) {
                nameType = nameType2;
                nameType2 = nameType;
                displayName = this._tznames.getDisplayName(strOLrzqt, nameType2 != TimeZoneNames.NameType.LONG_GENERIC ? TimeZoneNames.NameType.LONG_STANDARD : TimeZoneNames.NameType.SHORT_STANDARD, j);
                if (displayName == null) {
                    str = displayName.equalsIgnoreCase(this._tznames.getMetaZoneDisplayName(metaZoneID, nameType2)) ? null : displayName;
                }
            }
            str = timeZoneDisplayName;
        } else {
            int[] iArr2 = new int[2];
            nameType = nameType2;
            timeZone.getOffset(j - DST_CHECK_RANGE, false, iArr2);
            if (iArr2[1] == 0) {
                timeZone.getOffset(j + DST_CHECK_RANGE, false, iArr2);
                if (iArr2[1] == 0) {
                    nameType2 = nameType;
                    displayName = this._tznames.getDisplayName(strOLrzqt, nameType2 != TimeZoneNames.NameType.LONG_GENERIC ? TimeZoneNames.NameType.LONG_STANDARD : TimeZoneNames.NameType.SHORT_STANDARD, j);
                    if (displayName == null) {
                    }
                }
                str = timeZoneDisplayName;
            }
            nameType2 = nameType;
            str = timeZoneDisplayName;
        }
        if (str != null || (metaZoneDisplayName = this._tznames.getMetaZoneDisplayName(metaZoneID, nameType2)) == null) {
            return str;
        }
        String referenceZoneID = this._tznames.getReferenceZoneID(metaZoneID, getTargetRegion());
        if (referenceZoneID == null || referenceZoneID.equals(strOLrzqt)) {
            return metaZoneDisplayName;
        }
        int[] iArr3 = {0, 0};
        TimeZone.getFrozenTimeZone(referenceZoneID).getOffset(j + ((long) iArr[0]) + ((long) iArr[1]), true, iArr3);
        if (iArr[0] == iArr3[0] && iArr[1] == iArr3[1]) {
            return metaZoneDisplayName;
        }
        return getPartialLocationName(strOLrzqt, metaZoneID, nameType2 == TimeZoneNames.NameType.LONG_GENERIC, metaZoneDisplayName);
    }

    private String formatPattern(Pattern pattern, String... strArr) {
        String strDefaultValue;
        String str;
        synchronized (this) {
            if (this._patternFormatters == null) {
                this._patternFormatters = new MessageFormat[Pattern.values().length];
            }
            int iOrdinal = pattern.ordinal();
            if (this._patternFormatters[iOrdinal] == null) {
                try {
                    strDefaultValue = ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/zone", this._locale)).djBIcL("zoneStrings/" + pattern.key());
                } catch (MissingResourceException unused) {
                    strDefaultValue = pattern.defaultValue();
                }
                this._patternFormatters[iOrdinal] = new MessageFormat(strDefaultValue);
                str = this._patternFormatters[iOrdinal].format(strArr);
            } else {
                str = this._patternFormatters[iOrdinal].format(strArr);
            }
        }
        return str;
    }

    private LocaleDisplayNames getLocaleDisplayNames() {
        LocaleDisplayNames localeDisplayNamesKWHzl;
        synchronized (this) {
            WeakReference<LocaleDisplayNames> weakReference = this._localeDisplayNamesRef;
            localeDisplayNamesKWHzl = weakReference != null ? weakReference.get() : null;
            if (localeDisplayNamesKWHzl == null) {
                localeDisplayNamesKWHzl = LocaleDisplayNames.KWHzl(this._locale);
                this._localeDisplayNamesRef = new WeakReference<>(localeDisplayNamesKWHzl);
            }
        }
        return localeDisplayNamesKWHzl;
    }

    private void loadStrings(String str) {
        synchronized (this) {
            if (str != null) {
                if (str.length() != 0) {
                    getGenericLocationName(str);
                    for (String str2 : this._tznames.getAvailableMetaZoneIDs(str)) {
                        if (!str.equals(this._tznames.getReferenceZoneID(str2, getTargetRegion()))) {
                            TimeZoneNames.NameType[] nameTypeArr = GENERIC_NON_LOCATION_TYPES;
                            int length = nameTypeArr.length;
                            for (int i = 0; i < length; i++) {
                                TimeZoneNames.NameType nameType = nameTypeArr[i];
                                String metaZoneDisplayName = this._tznames.getMetaZoneDisplayName(str2, nameType);
                                if (metaZoneDisplayName != null) {
                                    getPartialLocationName(str, str2, nameType == TimeZoneNames.NameType.LONG_GENERIC, metaZoneDisplayName);
                                }
                            }
                        }
                    }
                }
            }
        }
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

    private String getPartialLocationName(String str, String str2, boolean z, String str3) {
        String exemplarLocationName;
        String str4 = str + ContainerUtils.FIELD_DELIMITER + str2 + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + (z ? "L" : ExifInterface.LATITUDE_SOUTH);
        String str5 = this._genericPartialLocationNamesMap.get(str4);
        if (str5 != null) {
            return str5;
        }
        String strAEQbTJ = C7047acU.AEQbTJ(str);
        if (strAEQbTJ != null) {
            if (str.equals(this._tznames.getReferenceZoneID(str2, strAEQbTJ))) {
                exemplarLocationName = getLocaleDisplayNames().KWHzl(strAEQbTJ);
            } else {
                exemplarLocationName = this._tznames.getExemplarLocationName(str);
            }
        } else {
            exemplarLocationName = this._tznames.getExemplarLocationName(str);
            if (exemplarLocationName == null) {
                exemplarLocationName = str;
            }
        }
        String pattern = formatPattern(Pattern.FALLBACK_FORMAT, exemplarLocationName, str3);
        synchronized (this) {
            String strPutIfAbsent = this._genericPartialLocationNamesMap.putIfAbsent(str4.intern(), pattern.intern());
            if (strPutIfAbsent == null) {
                this._gnamesTrie.AEQbTJ(pattern, new Application(str.intern(), z ? GenericNameType.LONG : GenericNameType.SHORT));
            } else {
                pattern = strPutIfAbsent;
            }
        }
        return pattern;
    }

    public static class Application {
        public final String KWHzl;
        public final GenericNameType copydefault;

        public Application(String str, GenericNameType genericNameType) {
            this.KWHzl = str;
            this.copydefault = genericNameType;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class ActionBar {
        public final TimeZoneFormat.TimeType AEQbTJ;
        public final int KWHzl;
        public final String OLrzqt;
        public final GenericNameType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TimeZoneFormat.TimeType copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.ibm.icu.impl.TimeZoneGenericNames$GenericNameType), (r2v0 java.lang.String), (r3v0 int) A[MD:(com.ibm.icu.impl.TimeZoneGenericNames$GenericNameType, java.lang.String, int):void (m)] (LINE:600) call: com.ibm.icu.impl.TimeZoneGenericNames.ActionBar.<init>(com.ibm.icu.impl.TimeZoneGenericNames$GenericNameType, java.lang.String, int):void type: THIS */
        public /* synthetic */ ActionBar(GenericNameType genericNameType, String str, int i, AnonymousClass5 anonymousClass5) {
            this(genericNameType, str, i);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.ibm.icu.impl.TimeZoneGenericNames$GenericNameType)
  (r2v0 java.lang.String)
  (r3v0 int)
  (r4v0 com.ibm.icu.text.TimeZoneFormat$TimeType)
 A[MD:(com.ibm.icu.impl.TimeZoneGenericNames$GenericNameType, java.lang.String, int, com.ibm.icu.text.TimeZoneFormat$TimeType):void (m)] (LINE:600) call: com.ibm.icu.impl.TimeZoneGenericNames.ActionBar.<init>(com.ibm.icu.impl.TimeZoneGenericNames$GenericNameType, java.lang.String, int, com.ibm.icu.text.TimeZoneFormat$TimeType):void type: THIS */
        public /* synthetic */ ActionBar(GenericNameType genericNameType, String str, int i, TimeZoneFormat.TimeType timeType, AnonymousClass5 anonymousClass5) {
            this(genericNameType, str, i, timeType);
        }

        public ActionBar(GenericNameType genericNameType, String str, int i) {
            this(genericNameType, str, i, TimeZoneFormat.TimeType.UNKNOWN);
        }

        public ActionBar(GenericNameType genericNameType, String str, int i, TimeZoneFormat.TimeType timeType) {
            this.copydefault = genericNameType;
            this.OLrzqt = str;
            this.KWHzl = i;
            this.AEQbTJ = timeType;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class StateListAnimator implements C7029acC.TaskDescription<Application> {
        public Collection<ActionBar> EZpvd;
        public EnumSet<GenericNameType> KWHzl;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Collection<ActionBar> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt() {
            this.EZpvd = null;
            this.OLrzqt = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int copydefault() {
            return this.OLrzqt;
        }

        public StateListAnimator(EnumSet<GenericNameType> enumSet) {
            this.KWHzl = enumSet;
        }

        @Override // o.C7029acC.TaskDescription
        public boolean EZpvd(int i, Iterator<Application> it) {
            while (it.hasNext()) {
                Application next = it.next();
                EnumSet<GenericNameType> enumSet = this.KWHzl;
                if (enumSet == null || enumSet.contains(next.copydefault)) {
                    ActionBar actionBar = new ActionBar(next.copydefault, next.KWHzl, i, (AnonymousClass5) null);
                    if (this.EZpvd == null) {
                        this.EZpvd = new LinkedList();
                    }
                    this.EZpvd.add(actionBar);
                    if (i > this.OLrzqt) {
                        this.OLrzqt = i;
                    }
                }
            }
            return true;
        }
    }

    public ActionBar findBestMatch(String str, int i, EnumSet<GenericNameType> enumSet) {
        if (str == null || str.length() == 0 || i < 0 || i >= str.length()) {
            throw new IllegalArgumentException("bad input text or range");
        }
        Collection<TimeZoneNames.Activity> collectionFindTimeZoneNames = findTimeZoneNames(str, i, enumSet);
        ActionBar actionBarCreateGenericMatchInfo = null;
        if (collectionFindTimeZoneNames != null) {
            TimeZoneNames.Activity activity = null;
            for (TimeZoneNames.Activity activity2 : collectionFindTimeZoneNames) {
                if (activity == null || activity2.KWHzl() > activity.KWHzl()) {
                    activity = activity2;
                }
            }
            if (activity != null) {
                actionBarCreateGenericMatchInfo = createGenericMatchInfo(activity);
                if (actionBarCreateGenericMatchInfo.OLrzqt() == str.length() - i && actionBarCreateGenericMatchInfo.AEQbTJ != TimeZoneFormat.TimeType.STANDARD) {
                    return actionBarCreateGenericMatchInfo;
                }
            }
        }
        Collection<ActionBar> collectionFindLocal = findLocal(str, i, enumSet);
        if (collectionFindLocal != null) {
            for (ActionBar actionBar : collectionFindLocal) {
                if (actionBarCreateGenericMatchInfo == null || actionBar.OLrzqt() >= actionBarCreateGenericMatchInfo.OLrzqt()) {
                    actionBarCreateGenericMatchInfo = actionBar;
                }
            }
        }
        return actionBarCreateGenericMatchInfo;
    }

    public Collection<ActionBar> find(String str, int i, EnumSet<GenericNameType> enumSet) {
        if (str == null || str.length() == 0 || i < 0 || i >= str.length()) {
            throw new IllegalArgumentException("bad input text or range");
        }
        Collection<ActionBar> collectionFindLocal = findLocal(str, i, enumSet);
        Collection<TimeZoneNames.Activity> collectionFindTimeZoneNames = findTimeZoneNames(str, i, enumSet);
        if (collectionFindTimeZoneNames != null) {
            for (TimeZoneNames.Activity activity : collectionFindTimeZoneNames) {
                if (collectionFindLocal == null) {
                    collectionFindLocal = new LinkedList<>();
                }
                collectionFindLocal.add(createGenericMatchInfo(activity));
            }
        }
        return collectionFindLocal;
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.TimeZoneGenericNames$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[TimeZoneNames.NameType.values().length];
            KWHzl = iArr;
            try {
                iArr[TimeZoneNames.NameType.LONG_STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[TimeZoneNames.NameType.LONG_GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[TimeZoneNames.NameType.SHORT_STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[TimeZoneNames.NameType.SHORT_GENERIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[GenericNameType.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[GenericNameType.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[GenericNameType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[GenericNameType.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private ActionBar createGenericMatchInfo(TimeZoneNames.Activity activity) {
        GenericNameType genericNameType;
        TimeZoneFormat.TimeType timeType = TimeZoneFormat.TimeType.UNKNOWN;
        int i = AnonymousClass5.KWHzl[activity.copydefault().ordinal()];
        if (i == 1) {
            genericNameType = GenericNameType.LONG;
            timeType = TimeZoneFormat.TimeType.STANDARD;
        } else if (i == 2) {
            genericNameType = GenericNameType.LONG;
        } else if (i == 3) {
            genericNameType = GenericNameType.SHORT;
            timeType = TimeZoneFormat.TimeType.STANDARD;
        } else if (i == 4) {
            genericNameType = GenericNameType.SHORT;
        } else {
            throw new IllegalArgumentException("Unexpected MatchInfo name type - " + activity.copydefault());
        }
        TimeZoneFormat.TimeType timeType2 = timeType;
        GenericNameType genericNameType2 = genericNameType;
        String strAEQbTJ = activity.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = this._tznames.getReferenceZoneID(activity.EZpvd(), getTargetRegion());
        }
        return new ActionBar(genericNameType2, strAEQbTJ, activity.KWHzl(), timeType2, null);
    }

    private Collection<TimeZoneNames.Activity> findTimeZoneNames(String str, int i, EnumSet<GenericNameType> enumSet) {
        EnumSet<TimeZoneNames.NameType> enumSetNoneOf = EnumSet.noneOf(TimeZoneNames.NameType.class);
        if (enumSet.contains(GenericNameType.LONG)) {
            enumSetNoneOf.add(TimeZoneNames.NameType.LONG_GENERIC);
            enumSetNoneOf.add(TimeZoneNames.NameType.LONG_STANDARD);
        }
        if (enumSet.contains(GenericNameType.SHORT)) {
            enumSetNoneOf.add(TimeZoneNames.NameType.SHORT_GENERIC);
            enumSetNoneOf.add(TimeZoneNames.NameType.SHORT_STANDARD);
        }
        if (enumSetNoneOf.isEmpty()) {
            return null;
        }
        return this._tznames.find(str, i, enumSetNoneOf);
    }

    private Collection<ActionBar> findLocal(String str, int i, EnumSet<GenericNameType> enumSet) {
        synchronized (this) {
            StateListAnimator stateListAnimator = new StateListAnimator(enumSet);
            this._gnamesTrie.EZpvd(str, i, stateListAnimator);
            if (stateListAnimator.copydefault() != str.length() - i && !this._gnamesTrieFullyLoaded) {
                Iterator<String> it = TimeZone.getAvailableIDs(TimeZone.SystemTimeZoneType.CANONICAL, null, null).iterator();
                while (it.hasNext()) {
                    loadStrings(it.next());
                }
                this._gnamesTrieFullyLoaded = true;
                stateListAnimator.OLrzqt();
                this._gnamesTrie.EZpvd(str, i, stateListAnimator);
                return stateListAnimator.EZpvd();
            }
            return stateListAnimator.EZpvd();
        }
    }

    public static class Activity extends AbstractC7078acz<String, TimeZoneGenericNames, ULocale> {
        private Activity() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:895) call: com.ibm.icu.impl.TimeZoneGenericNames.Activity.<init>():void type: THIS */
        public /* synthetic */ Activity(AnonymousClass5 anonymousClass5) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public TimeZoneGenericNames copydefault(String str, ULocale uLocale) {
            return new TimeZoneGenericNames(uLocale, (AnonymousClass5) null).m6322freeze();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
    }

    /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
    /* JADX INFO: renamed from: cloneAsThawed, reason: merged with bridge method [inline-methods] */
    public TimeZoneGenericNames m6321cloneAsThawed() {
        try {
            TimeZoneGenericNames timeZoneGenericNames = (TimeZoneGenericNames) super.clone();
            try {
                timeZoneGenericNames._frozen = false;
                return timeZoneGenericNames;
            } catch (Throwable unused) {
                return timeZoneGenericNames;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
