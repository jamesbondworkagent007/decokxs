package com.ibm.icu.impl;

import com.ibm.icu.text.TimeZoneNames;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.C7029acC;

/* JADX INFO: loaded from: classes14.dex */
public class TZDBTimeZoneNames extends TimeZoneNames {
    private static final ConcurrentHashMap<String, Application> TZDB_NAMES_MAP = new ConcurrentHashMap<>();
    private static volatile C7029acC<Activity> TZDB_NAMES_TRIE = null;
    private static final ICUResourceBundle ZONESTRINGS = (ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b/zone", "tzdbNames").isConnected("zoneStrings");
    private static final long serialVersionUID = 1;
    private ULocale _locale;
    private volatile transient String _region;

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getTimeZoneDisplayName(String str, TimeZoneNames.NameType nameType) {
        return null;
    }

    public TZDBTimeZoneNames(ULocale uLocale) {
        this._locale = uLocale;
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public Set<String> getAvailableMetaZoneIDs() {
        return TimeZoneNamesImpl._getAvailableMetaZoneIDs();
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public Set<String> getAvailableMetaZoneIDs(String str) {
        return TimeZoneNamesImpl._getAvailableMetaZoneIDs(str);
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getMetaZoneID(String str, long j) {
        return TimeZoneNamesImpl._getMetaZoneID(str, j);
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getReferenceZoneID(String str, String str2) {
        return TimeZoneNamesImpl._getReferenceZoneID(str, str2);
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getMetaZoneDisplayName(String str, TimeZoneNames.NameType nameType) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (nameType == TimeZoneNames.NameType.SHORT_STANDARD || nameType == TimeZoneNames.NameType.SHORT_DAYLIGHT) {
            return getMetaZoneNames(str).KWHzl(nameType);
        }
        return null;
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public Collection<TimeZoneNames.Activity> find(CharSequence charSequence, int i, EnumSet<TimeZoneNames.NameType> enumSet) {
        if (charSequence == null || charSequence.length() == 0 || i < 0 || i >= charSequence.length()) {
            throw new IllegalArgumentException("bad input text or range");
        }
        prepareFind();
        TaskDescription taskDescription = new TaskDescription(enumSet, getTargetRegion());
        TZDB_NAMES_TRIE.EZpvd(charSequence, i, taskDescription);
        return taskDescription.OLrzqt();
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class Application {
        public static final Application OLrzqt = new Application(null, null);
        public static final String[] copydefault = {"ss", "sd"};
        public String[] AEQbTJ;
        public String[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String[] copydefault() {
            return this.AEQbTJ;
        }

        public Application(String[] strArr, String[] strArr2) {
            this.EZpvd = strArr;
            this.AEQbTJ = strArr2;
        }

        public static Application AEQbTJ(ICUResourceBundle iCUResourceBundle, String str) {
            String[] strArrIsConnected;
            if (iCUResourceBundle == null || str == null || str.length() == 0) {
                return OLrzqt;
            }
            try {
                ICUResourceBundle iCUResourceBundle2 = (ICUResourceBundle) iCUResourceBundle.isConnected(str);
                int length = copydefault.length;
                String[] strArr = new String[length];
                boolean z = true;
                int i = 0;
                while (true) {
                    strArrIsConnected = null;
                    if (i >= length) {
                        break;
                    }
                    try {
                        strArr[i] = iCUResourceBundle2.getString(copydefault[i]);
                        z = false;
                    } catch (MissingResourceException unused) {
                        strArr[i] = null;
                    }
                    i++;
                }
                if (z) {
                    return OLrzqt;
                }
                try {
                    ICUResourceBundle iCUResourceBundle3 = (ICUResourceBundle) iCUResourceBundle2.isConnected("parseRegions");
                    if (iCUResourceBundle3.AuCTel() == 0) {
                        strArrIsConnected = new String[]{iCUResourceBundle3.getFieldNames()};
                    } else if (iCUResourceBundle3.AuCTel() == 8) {
                        strArrIsConnected = iCUResourceBundle3.isConnected();
                    }
                } catch (MissingResourceException unused2) {
                }
                return new Application(strArr, strArrIsConnected);
            } catch (MissingResourceException unused3) {
                return OLrzqt;
            }
        }

        public String KWHzl(TimeZoneNames.NameType nameType) {
            if (this.EZpvd == null) {
                return null;
            }
            int i = AnonymousClass2.copydefault[nameType.ordinal()];
            if (i == 1) {
                return this.EZpvd[0];
            }
            if (i != 2) {
                return null;
            }
            return this.EZpvd[1];
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.TZDBTimeZoneNames$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[TimeZoneNames.NameType.values().length];
            copydefault = iArr;
            try {
                iArr[TimeZoneNames.NameType.SHORT_STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[TimeZoneNames.NameType.SHORT_DAYLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class Activity {
        public final String[] AEQbTJ;
        public final String EZpvd;
        public final TimeZoneNames.NameType OLrzqt;
        public final boolean copydefault;

        public Activity(String str, TimeZoneNames.NameType nameType, boolean z, String[] strArr) {
            this.EZpvd = str;
            this.OLrzqt = nameType;
            this.copydefault = z;
            this.AEQbTJ = strArr;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class TaskDescription implements C7029acC.TaskDescription<Activity> {
        public String AEQbTJ;
        public Collection<TimeZoneNames.Activity> EZpvd;
        public EnumSet<TimeZoneNames.NameType> copydefault;

        public TaskDescription(EnumSet<TimeZoneNames.NameType> enumSet, String str) {
            this.copydefault = enumSet;
            this.AEQbTJ = str;
        }

        @Override // o.C7029acC.TaskDescription
        public boolean EZpvd(int i, Iterator<Activity> it) {
            Activity activity;
            TimeZoneNames.NameType nameType;
            Activity next;
            Activity activity2 = null;
            loop0: while (true) {
                activity = activity2;
                while (it.hasNext()) {
                    next = it.next();
                    EnumSet<TimeZoneNames.NameType> enumSet = this.copydefault;
                    if (enumSet == null || enumSet.contains(next.OLrzqt)) {
                        String[] strArr = next.AEQbTJ;
                        if (strArr != null) {
                            int length = strArr.length;
                            boolean z = false;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                if (this.AEQbTJ.equals(strArr[i2])) {
                                    activity = next;
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            if (z) {
                                break loop0;
                            }
                            if (activity == null) {
                                activity = next;
                            }
                        } else if (activity2 == null) {
                            break;
                        }
                    }
                }
                activity2 = next;
            }
            if (activity != null) {
                TimeZoneNames.NameType nameType2 = activity.OLrzqt;
                if (activity.copydefault && ((nameType2 == (nameType = TimeZoneNames.NameType.SHORT_STANDARD) || nameType2 == TimeZoneNames.NameType.SHORT_DAYLIGHT) && this.copydefault.contains(nameType) && this.copydefault.contains(TimeZoneNames.NameType.SHORT_DAYLIGHT))) {
                    nameType2 = TimeZoneNames.NameType.SHORT_GENERIC;
                }
                TimeZoneNames.Activity activity3 = new TimeZoneNames.Activity(nameType2, null, activity.EZpvd, i);
                if (this.EZpvd == null) {
                    this.EZpvd = new LinkedList();
                }
                this.EZpvd.add(activity3);
            }
            return true;
        }

        public Collection<TimeZoneNames.Activity> OLrzqt() {
            Collection<TimeZoneNames.Activity> collection = this.EZpvd;
            return collection == null ? Collections.emptyList() : collection;
        }
    }

    private static Application getMetaZoneNames(String str) {
        ConcurrentHashMap<String, Application> concurrentHashMap = TZDB_NAMES_MAP;
        Application application = concurrentHashMap.get(str);
        if (application != null) {
            return application;
        }
        Application applicationAEQbTJ = Application.AEQbTJ(ZONESTRINGS, "meta:" + str);
        Application applicationPutIfAbsent = concurrentHashMap.putIfAbsent(str.intern(), applicationAEQbTJ);
        return applicationPutIfAbsent == null ? applicationAEQbTJ : applicationPutIfAbsent;
    }

    private static void prepareFind() {
        if (TZDB_NAMES_TRIE == null) {
            synchronized (TZDBTimeZoneNames.class) {
                if (TZDB_NAMES_TRIE == null) {
                    C7029acC<Activity> c7029acC = new C7029acC<>(true);
                    for (String str : TimeZoneNamesImpl._getAvailableMetaZoneIDs()) {
                        Application metaZoneNames = getMetaZoneNames(str);
                        TimeZoneNames.NameType nameType = TimeZoneNames.NameType.SHORT_STANDARD;
                        String strKWHzl = metaZoneNames.KWHzl(nameType);
                        TimeZoneNames.NameType nameType2 = TimeZoneNames.NameType.SHORT_DAYLIGHT;
                        String strKWHzl2 = metaZoneNames.KWHzl(nameType2);
                        if (strKWHzl != null || strKWHzl2 != null) {
                            String[] strArrCopydefault = metaZoneNames.copydefault();
                            String strIntern = str.intern();
                            boolean z = (strKWHzl == null || strKWHzl2 == null || !strKWHzl.equals(strKWHzl2)) ? false : true;
                            if (strKWHzl != null) {
                                c7029acC.AEQbTJ(strKWHzl, new Activity(strIntern, nameType, z, strArrCopydefault));
                            }
                            if (strKWHzl2 != null) {
                                c7029acC.AEQbTJ(strKWHzl2, new Activity(strIntern, nameType2, z, strArrCopydefault));
                            }
                        }
                    }
                    TZDB_NAMES_TRIE = c7029acC;
                }
            }
        }
    }

    private String getTargetRegion() {
        if (this._region == null) {
            String country = this._locale.getCountry();
            if (country.length() == 0) {
                country = ULocale.addLikelySubtags(this._locale).getCountry();
                if (country.length() == 0) {
                    country = "001";
                }
            }
            this._region = country;
        }
        return this._region;
    }
}
