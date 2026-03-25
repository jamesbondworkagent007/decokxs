package com.ibm.icu.util;

import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.JavaTimeZone;
import com.ibm.icu.impl.OlsonTimeZone;
import com.ibm.icu.impl.TimeZoneAdapter;
import com.ibm.icu.text.TimeZoneFormat;
import com.ibm.icu.text.TimeZoneNames;
import com.ibm.icu.util.ULocale;
import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.logging.Logger;
import o.C7019abT;
import o.C7047acU;
import o.C7053aca;
import o.C7255agQ;
import o.C7258agT;
import o.C7260agV;
import o.InterfaceC7248agJ;
import o.yCN;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TimeZone implements Serializable, Cloneable, InterfaceC7248agJ<TimeZone> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int GENERIC_LOCATION = 7;
    public static final TimeZone GMT_ZONE;
    static final String GMT_ZONE_ID = "Etc/GMT";
    public static final int LONG = 1;
    public static final int LONG_GENERIC = 3;
    public static final int LONG_GMT = 5;
    public static final int SHORT = 0;
    public static final int SHORT_COMMONLY_USED = 6;
    public static final int SHORT_GENERIC = 2;
    public static final int SHORT_GMT = 4;
    public static final int TIMEZONE_ICU = 0;
    public static final int TIMEZONE_JDK = 1;
    private static final String TZIMPL_CONFIG_ICU = "ICU";
    private static final String TZIMPL_CONFIG_JDK = "JDK";
    private static final String TZIMPL_CONFIG_KEY = "com.ibm.icu.util.TimeZone.DefaultTimeZoneType";
    private static int TZ_IMPL = 0;
    public static final TimeZone UNKNOWN_ZONE;
    public static final String UNKNOWN_ZONE_ID = "Etc/Unknown";
    private static final long serialVersionUID = -744942128318337471L;
    private String ID;
    private static final Logger LOGGER = Logger.getLogger("com.ibm.icu.util.TimeZone");
    private static volatile TimeZone defaultZone = null;

    public enum SystemTimeZoneType {
        ANY,
        CANONICAL,
        CANONICAL_LOCATION
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int getDefaultTimeZoneType() {
        return TZ_IMPL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getID() {
        return this.ID;
    }

    public abstract int getOffset(int i, int i2, int i3, int i4, int i5, int i6);

    public abstract int getRawOffset();

    public abstract boolean inDaylightTime(Date date);

    public boolean isFrozen() {
        return false;
    }

    public abstract void setRawOffset(int i);

    public abstract boolean useDaylightTime();

    static {
        int i = 0;
        UNKNOWN_ZONE = new ConstantZone(i, UNKNOWN_ZONE_ID).mo6320freeze();
        GMT_ZONE = new ConstantZone(i, GMT_ZONE_ID).mo6320freeze();
        TZ_IMPL = 0;
        if (C7053aca.AEQbTJ(TZIMPL_CONFIG_KEY, TZIMPL_CONFIG_ICU).equalsIgnoreCase(TZIMPL_CONFIG_JDK)) {
            TZ_IMPL = 1;
        }
    }

    public TimeZone() {
    }

    @Deprecated
    public TimeZone(String str) {
        str.getClass();
        this.ID = str;
    }

    public int getOffset(long j) {
        int[] iArr = new int[2];
        getOffset(j, false, iArr);
        return iArr[0] + iArr[1];
    }

    public void getOffset(long j, boolean z, int[] iArr) {
        int rawOffset = getRawOffset();
        iArr[0] = rawOffset;
        if (!z) {
            j += (long) rawOffset;
        }
        int[] iArr2 = new int[6];
        int i = 0;
        while (true) {
            C7019abT.KWHzl(j, iArr2);
            int offset = getOffset(1, iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[5]) - iArr[0];
            iArr[1] = offset;
            if (i != 0 || !z || offset == 0) {
                return;
            }
            j -= (long) offset;
            i++;
        }
    }

    public void setID(String str) {
        str.getClass();
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen TimeZone instance.");
        }
        this.ID = str;
    }

    public final String getDisplayName() {
        return _getDisplayName(3, false, ULocale.getDefault(ULocale.Category.DISPLAY));
    }

    public final String getDisplayName(Locale locale) {
        return _getDisplayName(3, false, ULocale.forLocale(locale));
    }

    public final String getDisplayName(ULocale uLocale) {
        return _getDisplayName(3, false, uLocale);
    }

    public final String getDisplayName(boolean z, int i) {
        return getDisplayName(z, i, ULocale.getDefault(ULocale.Category.DISPLAY));
    }

    public String getDisplayName(boolean z, int i, Locale locale) {
        return getDisplayName(z, i, ULocale.forLocale(locale));
    }

    public String getDisplayName(boolean z, int i, ULocale uLocale) {
        if (i < 0 || i > 7) {
            throw new IllegalArgumentException("Illegal style: " + i);
        }
        return _getDisplayName(i, z, uLocale);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String _getDisplayName(int i, boolean z, ULocale uLocale) {
        String str;
        String offsetShortLocalizedGMT;
        String displayName;
        if (uLocale == null) {
            throw new NullPointerException("locale is null");
        }
        String offsetISO8601Basic = null;
        TimeZoneNames.NameType nameType = null;
        offsetISO8601Basic = null;
        if (i == 7 || i == 3 || i == 2) {
            TimeZoneFormat timeZoneFormat = TimeZoneFormat.getInstance(uLocale);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C7255agQ<TimeZoneFormat.TimeType> c7255agQ = new C7255agQ<>(TimeZoneFormat.TimeType.UNKNOWN);
            if (i == 2) {
                str = timeZoneFormat.format(TimeZoneFormat.Style.GENERIC_SHORT, this, jCurrentTimeMillis, c7255agQ);
            } else if (i == 3) {
                str = timeZoneFormat.format(TimeZoneFormat.Style.GENERIC_LONG, this, jCurrentTimeMillis, c7255agQ);
            } else {
                if (i == 7) {
                    str = timeZoneFormat.format(TimeZoneFormat.Style.GENERIC_LOCATION, this, jCurrentTimeMillis, c7255agQ);
                }
                if ((!z && c7255agQ.copydefault == TimeZoneFormat.TimeType.STANDARD) || (!z && c7255agQ.copydefault == TimeZoneFormat.TimeType.DAYLIGHT)) {
                    int rawOffset = z ? getRawOffset() + getDSTSavings() : getRawOffset();
                    offsetShortLocalizedGMT = i == 2 ? timeZoneFormat.formatOffsetShortLocalizedGMT(rawOffset) : timeZoneFormat.formatOffsetLocalizedGMT(rawOffset);
                    return offsetShortLocalizedGMT;
                }
                return offsetISO8601Basic;
            }
            offsetISO8601Basic = str;
            if (!z) {
                if (z) {
                }
                if (i == 2) {
                }
            } else {
                if (z) {
                }
                if (i == 2) {
                }
            }
            return offsetShortLocalizedGMT;
        }
        if (i == 5 || i == 4) {
            TimeZoneFormat timeZoneFormat2 = TimeZoneFormat.getInstance(uLocale);
            int rawOffset2 = (z && useDaylightTime()) ? getRawOffset() + getDSTSavings() : getRawOffset();
            if (i == 4) {
                offsetISO8601Basic = timeZoneFormat2.formatOffsetISO8601Basic(rawOffset2, false, false, false);
            } else if (i == 5) {
                offsetISO8601Basic = timeZoneFormat2.formatOffsetLocalizedGMT(rawOffset2);
            }
            return offsetISO8601Basic;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        TimeZoneNames timeZoneNames = TimeZoneNames.getInstance(uLocale);
        if (i == 0) {
            nameType = z ? TimeZoneNames.NameType.SHORT_DAYLIGHT : TimeZoneNames.NameType.SHORT_STANDARD;
            displayName = timeZoneNames.getDisplayName(C7047acU.OLrzqt(this), nameType, jCurrentTimeMillis2);
            if (displayName == null) {
                return displayName;
            }
            TimeZoneFormat timeZoneFormat3 = TimeZoneFormat.getInstance(uLocale);
            int rawOffset3 = (z && useDaylightTime()) ? getRawOffset() + getDSTSavings() : getRawOffset();
            offsetShortLocalizedGMT = i == 1 ? timeZoneFormat3.formatOffsetLocalizedGMT(rawOffset3) : timeZoneFormat3.formatOffsetShortLocalizedGMT(rawOffset3);
        } else {
            if (i == 1) {
                nameType = z ? TimeZoneNames.NameType.LONG_DAYLIGHT : TimeZoneNames.NameType.LONG_STANDARD;
            } else if (i == 6) {
            }
            displayName = timeZoneNames.getDisplayName(C7047acU.OLrzqt(this), nameType, jCurrentTimeMillis2);
            if (displayName == null) {
            }
        }
        return offsetShortLocalizedGMT;
    }

    public int getDSTSavings() {
        return useDaylightTime() ? 3600000 : 0;
    }

    public boolean observesDaylightTime() {
        return useDaylightTime() || inDaylightTime(new Date());
    }

    public static TimeZone getTimeZone(String str) {
        return getTimeZone(str, TZ_IMPL, false);
    }

    public static TimeZone getFrozenTimeZone(String str) {
        return getTimeZone(str, TZ_IMPL, true);
    }

    public static TimeZone getTimeZone(String str, int i) {
        return getTimeZone(str, i, false);
    }

    private static TimeZone getTimeZone(String str, int i, boolean z) {
        TimeZone frozenICUTimeZone;
        if (i == 1) {
            JavaTimeZone javaTimeZoneCreateTimeZone = JavaTimeZone.createTimeZone(str);
            if (javaTimeZoneCreateTimeZone != null) {
                return z ? javaTimeZoneCreateTimeZone.mo6320freeze() : javaTimeZoneCreateTimeZone;
            }
            frozenICUTimeZone = getFrozenICUTimeZone(str, false);
        } else {
            frozenICUTimeZone = getFrozenICUTimeZone(str, true);
        }
        if (frozenICUTimeZone == null) {
            LOGGER.fine(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + str + "\" is a bogus id so timezone is falling back to Etc/Unknown(GMT).");
            frozenICUTimeZone = UNKNOWN_ZONE;
        }
        return z ? frozenICUTimeZone : frozenICUTimeZone.mo6319cloneAsThawed();
    }

    public static BasicTimeZone getFrozenICUTimeZone(String str, boolean z) {
        OlsonTimeZone olsonTimeZoneDjBIcL = z ? C7047acU.djBIcL(str) : null;
        return olsonTimeZoneDjBIcL == null ? C7047acU.AYXKKw(str) : olsonTimeZoneDjBIcL;
    }

    public static void setDefaultTimeZoneType(int i) {
        synchronized (TimeZone.class) {
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException("Invalid timezone type");
            }
            TZ_IMPL = i;
        }
    }

    public static Set<String> getAvailableIDs(SystemTimeZoneType systemTimeZoneType, String str, Integer num) {
        return C7047acU.EZpvd(systemTimeZoneType, str, num);
    }

    public static String[] getAvailableIDs(int i) {
        return (String[]) getAvailableIDs(SystemTimeZoneType.ANY, null, Integer.valueOf(i)).toArray(new String[0]);
    }

    public static String[] getAvailableIDs(String str) {
        return (String[]) getAvailableIDs(SystemTimeZoneType.ANY, str, null).toArray(new String[0]);
    }

    public static String[] getAvailableIDs() {
        return (String[]) getAvailableIDs(SystemTimeZoneType.ANY, null, null).toArray(new String[0]);
    }

    public static int countEquivalentIDs(String str) {
        return C7047acU.OLrzqt(str);
    }

    public static String getEquivalentID(String str, int i) {
        return C7047acU.copydefault(str, i);
    }

    @Deprecated
    public static TimeZone forULocaleOrDefault(ULocale uLocale) {
        String keywordValue = uLocale.getKeywordValue("timezone");
        return keywordValue == null ? getDefault() : getTimeZone(keywordValue);
    }

    @Deprecated
    public static TimeZone forLocaleOrDefault(Locale locale) {
        return forULocaleOrDefault(ULocale.forLocale(locale));
    }

    public static TimeZone getDefault() {
        TimeZone frozenTimeZone;
        TimeZone timeZone = defaultZone;
        if (timeZone == null) {
            synchronized (java.util.TimeZone.class) {
                synchronized (TimeZone.class) {
                    frozenTimeZone = defaultZone;
                    if (frozenTimeZone == null) {
                        if (TZ_IMPL == 1) {
                            frozenTimeZone = new JavaTimeZone();
                        } else {
                            frozenTimeZone = getFrozenTimeZone(java.util.TimeZone.getDefault().getID());
                        }
                        defaultZone = frozenTimeZone;
                    }
                }
            }
            timeZone = frozenTimeZone;
        }
        return timeZone.mo6319cloneAsThawed();
    }

    public static void setDefault(TimeZone timeZone) {
        java.util.TimeZone timeZoneWrap;
        synchronized (TimeZone.class) {
            setICUDefault(timeZone);
            if (timeZone != null) {
                if (timeZone instanceof JavaTimeZone) {
                    timeZoneWrap = ((JavaTimeZone) timeZone).unwrap();
                } else {
                    if (timeZone instanceof OlsonTimeZone) {
                        String id = timeZone.getID();
                        java.util.TimeZone timeZoneOLrzqt = yCN.OLrzqt(id);
                        if (!id.equals(timeZoneOLrzqt.getID())) {
                            String canonicalID = getCanonicalID(id);
                            timeZoneOLrzqt = yCN.OLrzqt(canonicalID);
                            if (!canonicalID.equals(timeZoneOLrzqt.getID())) {
                            }
                        }
                        timeZoneWrap = timeZoneOLrzqt;
                    }
                    timeZoneWrap = null;
                }
                if (timeZoneWrap == null) {
                    timeZoneWrap = TimeZoneAdapter.wrap(timeZone);
                }
                java.util.TimeZone.setDefault(timeZoneWrap);
            }
        }
    }

    @Deprecated
    public static void setICUDefault(TimeZone timeZone) {
        synchronized (TimeZone.class) {
            if (timeZone == null) {
                defaultZone = null;
            } else if (timeZone.isFrozen()) {
                defaultZone = timeZone;
            } else {
                defaultZone = ((TimeZone) timeZone.clone()).mo6320freeze();
            }
        }
    }

    public boolean hasSameRules(TimeZone timeZone) {
        return timeZone != null && getRawOffset() == timeZone.getRawOffset() && useDaylightTime() == timeZone.useDaylightTime();
    }

    public Object clone() {
        return isFrozen() ? this : mo6319cloneAsThawed();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.ID.equals(((TimeZone) obj).ID);
    }

    public int hashCode() {
        return this.ID.hashCode();
    }

    public static String getTZDataVersion() {
        return C7258agT.EZpvd();
    }

    public static String getCanonicalID(String str) {
        return getCanonicalID(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getCanonicalID(String str, boolean[] zArr) {
        String strKWHzl;
        boolean z;
        if (str != null && str.length() != 0) {
            strKWHzl = UNKNOWN_ZONE_ID;
            if (!str.equals(UNKNOWN_ZONE_ID)) {
                strKWHzl = C7047acU.KWHzl(str);
                if (strKWHzl != null) {
                    z = true;
                } else {
                    strKWHzl = C7047acU.EZpvd(str);
                }
            }
            if (zArr != null) {
                zArr[0] = z;
            }
            return strKWHzl;
        }
        strKWHzl = null;
        z = false;
        if (zArr != null) {
        }
        return strKWHzl;
    }

    public static String getRegion(String str) {
        String strGEmmrt = !str.equals(UNKNOWN_ZONE_ID) ? C7047acU.gEmmrt(str) : null;
        if (strGEmmrt != null) {
            return strGEmmrt;
        }
        throw new IllegalArgumentException("Unknown system zone id: " + str);
    }

    public static String getWindowsID(String str) {
        boolean[] zArr = {false};
        String canonicalID = getCanonicalID(str, zArr);
        if (!zArr[0]) {
            return null;
        }
        C7260agV newProxyInstance = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "windowsZones", ICUResourceBundle.AEQbTJ).isConnected("mapTimezones").getNewProxyInstance();
        while (newProxyInstance.EZpvd()) {
            UResourceBundle uResourceBundleCopydefault = newProxyInstance.copydefault();
            if (uResourceBundleCopydefault.AuCTel() == 2) {
                C7260agV newProxyInstance2 = uResourceBundleCopydefault.getNewProxyInstance();
                while (newProxyInstance2.EZpvd()) {
                    UResourceBundle uResourceBundleCopydefault2 = newProxyInstance2.copydefault();
                    if (uResourceBundleCopydefault2.AuCTel() == 0) {
                        for (String str2 : uResourceBundleCopydefault2.getFieldNames().split(" ")) {
                            if (str2.equals(canonicalID)) {
                                return uResourceBundleCopydefault.AEQbTJ();
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String getIDForWindowsID(String str, String str2) {
        int iIndexOf;
        String string = null;
        try {
            UResourceBundle uResourceBundleIsConnected = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "windowsZones", ICUResourceBundle.AEQbTJ).isConnected("mapTimezones").isConnected(str);
            if (str2 != null) {
                try {
                    string = uResourceBundleIsConnected.getString(str2);
                    if (string != null && (iIndexOf = string.indexOf(32)) > 0) {
                        string = string.substring(0, iIndexOf);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            return string == null ? uResourceBundleIsConnected.getString("001") : string;
        } catch (MissingResourceException unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: freeze */
    public TimeZone mo6320freeze() {
        throw new UnsupportedOperationException("Needs to be implemented by the subclass.");
    }

    /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: cloneAsThawed */
    public TimeZone mo6319cloneAsThawed() {
        try {
            return (TimeZone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    public static final class ConstantZone extends TimeZone {
        private static final long serialVersionUID = 1;
        private volatile transient boolean isFrozen;
        private int rawOffset;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
        @Override // com.ibm.icu.util.TimeZone
        /* JADX INFO: renamed from: freeze, reason: merged with bridge method [inline-methods] */
        public TimeZone mo6320freeze() {
            this.isFrozen = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.util.TimeZone
        public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
            return this.rawOffset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.util.TimeZone
        public int getRawOffset() {
            return this.rawOffset;
        }

        @Override // com.ibm.icu.util.TimeZone
        public boolean inDaylightTime(Date date) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.util.TimeZone
        public boolean isFrozen() {
            return this.isFrozen;
        }

        @Override // com.ibm.icu.util.TimeZone
        public boolean useDaylightTime() {
            return false;
        }

        private ConstantZone(int i, String str) {
            super(str);
            this.isFrozen = false;
            this.rawOffset = i;
        }

        @Override // com.ibm.icu.util.TimeZone
        public void setRawOffset(int i) {
            if (isFrozen()) {
                throw new UnsupportedOperationException("Attempt to modify a frozen TimeZone instance.");
            }
            this.rawOffset = i;
        }

        /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
        @Override // com.ibm.icu.util.TimeZone
        /* JADX INFO: renamed from: cloneAsThawed, reason: merged with bridge method [inline-methods] */
        public TimeZone mo6319cloneAsThawed() {
            ConstantZone constantZone = (ConstantZone) super.mo6319cloneAsThawed();
            constantZone.isFrozen = false;
            return constantZone;
        }
    }
}
