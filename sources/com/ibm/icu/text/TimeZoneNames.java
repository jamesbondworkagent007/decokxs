package com.ibm.icu.text;

import com.ibm.icu.impl.TZDBTimeZoneNames;
import com.ibm.icu.impl.TimeZoneNamesImpl;
import com.ibm.icu.util.ULocale;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import o.AbstractC7078acz;
import o.C7053aca;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TimeZoneNames implements Serializable {
    private static final String DEFAULT_FACTORY_CLASS = "com.ibm.icu.impl.TimeZoneNamesFactoryImpl";
    private static final String FACTORY_NAME_PROP = "com.ibm.icu.text.TimeZoneNames.Factory.impl";
    private static TaskDescription TZNAMES_CACHE = new TaskDescription();
    private static final Application TZNAMES_FACTORY;
    private static final long serialVersionUID = -9180227029248969153L;

    public enum NameType {
        LONG_GENERIC,
        LONG_STANDARD,
        LONG_DAYLIGHT,
        SHORT_GENERIC,
        SHORT_STANDARD,
        SHORT_DAYLIGHT,
        EXEMPLAR_LOCATION
    }

    public abstract Set<String> getAvailableMetaZoneIDs();

    public abstract Set<String> getAvailableMetaZoneIDs(String str);

    public abstract String getMetaZoneDisplayName(String str, NameType nameType);

    public abstract String getMetaZoneID(String str, long j);

    public abstract String getReferenceZoneID(String str, String str2);

    public abstract String getTimeZoneDisplayName(String str, NameType nameType);

    @Deprecated
    public void loadAllDisplayNames() {
    }

    static {
        Application taskDescription = null;
        String strAEQbTJ = C7053aca.AEQbTJ(FACTORY_NAME_PROP, DEFAULT_FACTORY_CLASS);
        while (true) {
            try {
                taskDescription = (Application) Class.forName(strAEQbTJ).newInstance();
                break;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                if (strAEQbTJ.equals(DEFAULT_FACTORY_CLASS)) {
                    break;
                } else {
                    strAEQbTJ = DEFAULT_FACTORY_CLASS;
                }
            }
        }
        if (taskDescription == null) {
            taskDescription = new DefaultTimeZoneNames.TaskDescription();
        }
        TZNAMES_FACTORY = taskDescription;
    }

    public static TimeZoneNames getInstance(ULocale uLocale) {
        return TZNAMES_CACHE.AEQbTJ(uLocale.getBaseName(), uLocale);
    }

    public static TimeZoneNames getInstance(Locale locale) {
        return getInstance(ULocale.forLocale(locale));
    }

    public static TimeZoneNames getTZDBInstance(ULocale uLocale) {
        return new TZDBTimeZoneNames(uLocale);
    }

    public final String getDisplayName(String str, NameType nameType, long j) {
        String timeZoneDisplayName = getTimeZoneDisplayName(str, nameType);
        return timeZoneDisplayName == null ? getMetaZoneDisplayName(getMetaZoneID(str, j), nameType) : timeZoneDisplayName;
    }

    public String getExemplarLocationName(String str) {
        return TimeZoneNamesImpl.getDefaultExemplarLocationName(str);
    }

    public Collection<Activity> find(CharSequence charSequence, int i, EnumSet<NameType> enumSet) {
        throw new UnsupportedOperationException("The method is not implemented in TimeZoneNames base class.");
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class Activity {
        public int AEQbTJ;
        public NameType KWHzl;
        public String OLrzqt;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NameType copydefault() {
            return this.KWHzl;
        }

        public Activity(NameType nameType, String str, String str2, int i) {
            if (nameType == null) {
                throw new IllegalArgumentException("nameType is null");
            }
            if (str == null && str2 == null) {
                throw new IllegalArgumentException("Either tzID or mzID must be available");
            }
            if (i <= 0) {
                throw new IllegalArgumentException("matchLength must be positive value");
            }
            this.KWHzl = nameType;
            this.copydefault = str;
            this.OLrzqt = str2;
            this.AEQbTJ = i;
        }
    }

    @Deprecated
    public void getDisplayNames(String str, NameType[] nameTypeArr, long j, String[] strArr, int i) {
        if (str == null || str.length() == 0) {
            return;
        }
        String metaZoneID = null;
        for (int i2 = 0; i2 < nameTypeArr.length; i2++) {
            NameType nameType = nameTypeArr[i2];
            String timeZoneDisplayName = getTimeZoneDisplayName(str, nameType);
            if (timeZoneDisplayName == null) {
                if (metaZoneID == null) {
                    metaZoneID = getMetaZoneID(str, j);
                }
                timeZoneDisplayName = getMetaZoneDisplayName(metaZoneID, nameType);
            }
            strArr[i + i2] = timeZoneDisplayName;
        }
    }

    @Deprecated
    public static abstract class Application {
        @Deprecated
        public abstract TimeZoneNames copydefault(ULocale uLocale);

        @Deprecated
        public Application() {
        }
    }

    public static class TaskDescription extends AbstractC7078acz<String, TimeZoneNames, ULocale> {
        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public TimeZoneNames copydefault(String str, ULocale uLocale) {
            return TimeZoneNames.TZNAMES_FACTORY.copydefault(uLocale);
        }
    }

    public static class DefaultTimeZoneNames extends TimeZoneNames {
        public static final DefaultTimeZoneNames INSTANCE = new DefaultTimeZoneNames();
        private static final long serialVersionUID = -995672072494349071L;

        @Override // com.ibm.icu.text.TimeZoneNames
        public String getMetaZoneDisplayName(String str, NameType nameType) {
            return null;
        }

        @Override // com.ibm.icu.text.TimeZoneNames
        public String getMetaZoneID(String str, long j) {
            return null;
        }

        @Override // com.ibm.icu.text.TimeZoneNames
        public String getReferenceZoneID(String str, String str2) {
            return null;
        }

        @Override // com.ibm.icu.text.TimeZoneNames
        public String getTimeZoneDisplayName(String str, NameType nameType) {
            return null;
        }

        private DefaultTimeZoneNames() {
        }

        @Override // com.ibm.icu.text.TimeZoneNames
        public Set<String> getAvailableMetaZoneIDs() {
            return Collections.emptySet();
        }

        @Override // com.ibm.icu.text.TimeZoneNames
        public Set<String> getAvailableMetaZoneIDs(String str) {
            return Collections.emptySet();
        }

        @Override // com.ibm.icu.text.TimeZoneNames
        public Collection<Activity> find(CharSequence charSequence, int i, EnumSet<NameType> enumSet) {
            return Collections.emptyList();
        }

        public static class TaskDescription extends Application {
            @Override // com.ibm.icu.text.TimeZoneNames.Application
            public TimeZoneNames copydefault(ULocale uLocale) {
                return DefaultTimeZoneNames.INSTANCE;
            }
        }
    }
}
