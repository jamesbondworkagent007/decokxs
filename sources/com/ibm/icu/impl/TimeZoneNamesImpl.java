package com.ibm.icu.impl;

import androidx.compose.material3.CalendarModelKt;
import com.fasterxml.jackson.core.JsonPointer;
import com.ibm.icu.text.TimeZoneNames;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC7078acz;
import o.C7019abT;
import o.C7029acC;
import o.C7043acQ;
import o.C7045acS;
import o.C7047acU;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZoneNamesImpl extends TimeZoneNames {
    private static final Pattern LOC_EXCLUSION_PATTERN = Pattern.compile("Etc/.*|SystemV/.*|.*/Riyadh8[7-9]");
    private static volatile Set<String> METAZONE_IDS = null;
    private static final String MZ_PREFIX = "meta:";
    private static final Application MZ_TO_TZS_CACHE;
    private static final StateListAnimator TZ_TO_MZS_CACHE;
    private static final String ZONE_STRINGS_BUNDLE = "zoneStrings";
    private static final long serialVersionUID = -2179814848495897472L;
    private transient ConcurrentHashMap<String, ZNames> _mzNamesMap;
    private transient boolean _namesFullyLoaded;
    private transient C7029acC<TaskDescription> _namesTrie;
    private transient boolean _namesTrieFullyLoaded;
    private transient ConcurrentHashMap<String, ZNames> _tzNamesMap;
    private transient ICUResourceBundle _zoneStrings;

    static {
        AnonymousClass5 anonymousClass5 = null;
        TZ_TO_MZS_CACHE = new StateListAnimator(anonymousClass5);
        MZ_TO_TZS_CACHE = new Application(anonymousClass5);
    }

    public TimeZoneNamesImpl(ULocale uLocale) {
        initialize(uLocale);
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public Set<String> getAvailableMetaZoneIDs() {
        return _getAvailableMetaZoneIDs();
    }

    public static Set<String> _getAvailableMetaZoneIDs() {
        if (METAZONE_IDS == null) {
            synchronized (TimeZoneNamesImpl.class) {
                if (METAZONE_IDS == null) {
                    METAZONE_IDS = Collections.unmodifiableSet(UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "metaZones").isConnected("mapTimezones").keySet());
                }
            }
        }
        return METAZONE_IDS;
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public Set<String> getAvailableMetaZoneIDs(String str) {
        return _getAvailableMetaZoneIDs(str);
    }

    public static Set<String> _getAvailableMetaZoneIDs(String str) {
        if (str == null || str.length() == 0) {
            return Collections.emptySet();
        }
        List<Activity> listAEQbTJ = TZ_TO_MZS_CACHE.AEQbTJ(str, str);
        if (listAEQbTJ.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(listAEQbTJ.size());
        Iterator<Activity> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().EZpvd());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getMetaZoneID(String str, long j) {
        return _getMetaZoneID(str, j);
    }

    public static String _getMetaZoneID(String str, long j) {
        if (str != null && str.length() != 0) {
            for (Activity activity : TZ_TO_MZS_CACHE.AEQbTJ(str, str)) {
                if (j >= activity.OLrzqt() && j < activity.AEQbTJ()) {
                    return activity.EZpvd();
                }
            }
        }
        return null;
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getReferenceZoneID(String str, String str2) {
        return _getReferenceZoneID(str, str2);
    }

    public static String _getReferenceZoneID(String str, String str2) {
        if (str != null && str.length() != 0) {
            Map<String, String> mapAEQbTJ = MZ_TO_TZS_CACHE.AEQbTJ(str, str);
            if (!mapAEQbTJ.isEmpty()) {
                String str3 = mapAEQbTJ.get(str2);
                return str3 == null ? mapAEQbTJ.get("001") : str3;
            }
        }
        return null;
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getMetaZoneDisplayName(String str, TimeZoneNames.NameType nameType) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return loadMetaZoneNames(str).copydefault(nameType);
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getTimeZoneDisplayName(String str, TimeZoneNames.NameType nameType) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return loadTimeZoneNames(str).copydefault(nameType);
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public String getExemplarLocationName(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return loadTimeZoneNames(str).copydefault(TimeZoneNames.NameType.EXEMPLAR_LOCATION);
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public Collection<TimeZoneNames.Activity> find(CharSequence charSequence, int i, EnumSet<TimeZoneNames.NameType> enumSet) {
        synchronized (this) {
            if (charSequence != null) {
                if (charSequence.length() != 0 && i >= 0 && i < charSequence.length()) {
                    ActionBar actionBar = new ActionBar(enumSet);
                    Collection<TimeZoneNames.Activity> collectionDoFind = doFind(actionBar, charSequence, i);
                    if (collectionDoFind != null) {
                        return collectionDoFind;
                    }
                    addAllNamesIntoTrie();
                    Collection<TimeZoneNames.Activity> collectionDoFind2 = doFind(actionBar, charSequence, i);
                    if (collectionDoFind2 != null) {
                        return collectionDoFind2;
                    }
                    internalLoadAllDisplayNames();
                    for (String str : TimeZone.getAvailableIDs(TimeZone.SystemTimeZoneType.CANONICAL, null, null)) {
                        if (!this._tzNamesMap.containsKey(str)) {
                            ZNames.KWHzl(this._tzNamesMap, null, str);
                        }
                    }
                    addAllNamesIntoTrie();
                    this._namesTrieFullyLoaded = true;
                    return doFind(actionBar, charSequence, i);
                }
            }
            throw new IllegalArgumentException("bad input text or range");
        }
    }

    private Collection<TimeZoneNames.Activity> doFind(ActionBar actionBar, CharSequence charSequence, int i) {
        actionBar.copydefault();
        this._namesTrie.EZpvd(charSequence, i, actionBar);
        if (actionBar.EZpvd() == charSequence.length() - i || this._namesTrieFullyLoaded) {
            return actionBar.OLrzqt();
        }
        return null;
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public void loadAllDisplayNames() {
        synchronized (this) {
            internalLoadAllDisplayNames();
        }
    }

    @Override // com.ibm.icu.text.TimeZoneNames
    public void getDisplayNames(String str, TimeZoneNames.NameType[] nameTypeArr, long j, String[] strArr, int i) {
        if (str == null || str.length() == 0) {
            return;
        }
        ZNames zNamesLoadTimeZoneNames = loadTimeZoneNames(str);
        ZNames zNamesLoadMetaZoneNames = null;
        for (int i2 = 0; i2 < nameTypeArr.length; i2++) {
            TimeZoneNames.NameType nameType = nameTypeArr[i2];
            String strCopydefault = zNamesLoadTimeZoneNames.copydefault(nameType);
            if (strCopydefault == null) {
                if (zNamesLoadMetaZoneNames == null) {
                    String metaZoneID = getMetaZoneID(str, j);
                    if (metaZoneID == null || metaZoneID.length() == 0) {
                        zNamesLoadMetaZoneNames = ZNames.AEQbTJ;
                    } else {
                        zNamesLoadMetaZoneNames = loadMetaZoneNames(metaZoneID);
                    }
                }
                strCopydefault = zNamesLoadMetaZoneNames.copydefault(nameType);
            }
            strArr[i + i2] = strCopydefault;
        }
    }

    private void internalLoadAllDisplayNames() {
        if (this._namesFullyLoaded) {
            return;
        }
        this._namesFullyLoaded = true;
        new PendingIntent(this, null).EZpvd();
    }

    private void addAllNamesIntoTrie() {
        for (Map.Entry<String, ZNames> entry : this._tzNamesMap.entrySet()) {
            entry.getValue().OLrzqt(entry.getKey(), this._namesTrie);
        }
        for (Map.Entry<String, ZNames> entry2 : this._mzNamesMap.entrySet()) {
            entry2.getValue().EZpvd(entry2.getKey(), this._namesTrie);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class PendingIntent extends C7043acQ.ActionBar {
        public StringBuilder KWHzl;
        public HashMap<C7043acQ.Application, FragmentManager> copydefault;

        public PendingIntent() {
            this.copydefault = new HashMap<>(300);
            this.KWHzl = new StringBuilder(32);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.ibm.icu.impl.TimeZoneNamesImpl) A[MD:(com.ibm.icu.impl.TimeZoneNamesImpl):void (m)] (LINE:306) call: com.ibm.icu.impl.TimeZoneNamesImpl.PendingIntent.<init>(com.ibm.icu.impl.TimeZoneNamesImpl):void type: THIS */
        public /* synthetic */ PendingIntent(TimeZoneNamesImpl timeZoneNamesImpl, AnonymousClass5 anonymousClass5) {
            this();
        }

        public void EZpvd() {
            TimeZoneNamesImpl.this._zoneStrings.copydefault("", this);
            for (Map.Entry<C7043acQ.Application, FragmentManager> entry : this.copydefault.entrySet()) {
                FragmentManager value = entry.getValue();
                if (value != FragmentManager.copydefault) {
                    C7043acQ.Application key = entry.getKey();
                    if (copydefault(key)) {
                        ZNames.copydefault(TimeZoneNamesImpl.this._mzNamesMap, value.EZpvd(), OLrzqt(key));
                    } else {
                        ZNames.KWHzl(TimeZoneNamesImpl.this._tzNamesMap, value.EZpvd(), AEQbTJ(key));
                    }
                }
            }
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (taskDescription.AhwBna() == 2) {
                    OLrzqt(application, taskDescription, z);
                }
            }
        }

        public final void OLrzqt(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            FragmentManager fragmentManager = this.copydefault.get(application);
            if (fragmentManager == null) {
                AnonymousClass5 anonymousClass5 = null;
                if (copydefault(application)) {
                    if (TimeZoneNamesImpl.this._mzNamesMap.containsKey(OLrzqt(application))) {
                        fragmentManager = FragmentManager.copydefault;
                    } else {
                        fragmentManager = new FragmentManager(anonymousClass5);
                    }
                } else {
                    if (TimeZoneNamesImpl.this._tzNamesMap.containsKey(AEQbTJ(application))) {
                        fragmentManager = FragmentManager.copydefault;
                    } else {
                        fragmentManager = new FragmentManager(anonymousClass5);
                    }
                }
                this.copydefault.put(KWHzl(application), fragmentManager);
            }
            if (fragmentManager != FragmentManager.copydefault) {
                fragmentManager.copydefault(application, taskDescription, z);
            }
        }

        public C7043acQ.Application KWHzl(C7043acQ.Application application) {
            return application.clone();
        }

        public boolean copydefault(C7043acQ.Application application) {
            return application.OLrzqt(TimeZoneNamesImpl.MZ_PREFIX);
        }

        public final String OLrzqt(C7043acQ.Application application) {
            this.KWHzl.setLength(0);
            for (int i = 5; i < application.length(); i++) {
                this.KWHzl.append(application.charAt(i));
            }
            return this.KWHzl.toString();
        }

        public final String AEQbTJ(C7043acQ.Application application) {
            this.KWHzl.setLength(0);
            for (int i = 0; i < application.length(); i++) {
                char cCharAt = application.charAt(i);
                if (cCharAt == ':') {
                    cCharAt = JsonPointer.SEPARATOR;
                }
                this.KWHzl.append(cCharAt);
            }
            return this.KWHzl.toString();
        }
    }

    private void initialize(ULocale uLocale) {
        this._zoneStrings = (ICUResourceBundle) ((ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/zone", uLocale)).isConnected(ZONE_STRINGS_BUNDLE);
        this._tzNamesMap = new ConcurrentHashMap<>();
        this._mzNamesMap = new ConcurrentHashMap<>();
        this._namesFullyLoaded = false;
        this._namesTrie = new C7029acC<>(true);
        this._namesTrieFullyLoaded = false;
        String strOLrzqt = C7047acU.OLrzqt(TimeZone.getDefault());
        if (strOLrzqt != null) {
            loadStrings(strOLrzqt);
        }
    }

    private void loadStrings(String str) {
        synchronized (this) {
            if (str != null) {
                if (str.length() != 0) {
                    loadTimeZoneNames(str);
                    Iterator<String> it = getAvailableMetaZoneIDs(str).iterator();
                    while (it.hasNext()) {
                        loadMetaZoneNames(it.next());
                    }
                }
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this._zoneStrings.fetchVPNInfo());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        initialize((ULocale) objectInputStream.readObject());
    }

    private ZNames loadMetaZoneNames(String str) {
        ZNames zNamesCopydefault;
        synchronized (this) {
            zNamesCopydefault = this._mzNamesMap.get(str);
            if (zNamesCopydefault == null) {
                FragmentManager fragmentManager = new FragmentManager(null);
                fragmentManager.KWHzl(this._zoneStrings, str);
                zNamesCopydefault = ZNames.copydefault(this._mzNamesMap, fragmentManager.EZpvd(), str);
            }
        }
        return zNamesCopydefault;
    }

    private ZNames loadTimeZoneNames(String str) {
        ZNames zNamesKWHzl;
        synchronized (this) {
            zNamesKWHzl = this._tzNamesMap.get(str);
            if (zNamesKWHzl == null) {
                FragmentManager fragmentManager = new FragmentManager(null);
                fragmentManager.copydefault(this._zoneStrings, str);
                zNamesKWHzl = ZNames.KWHzl(this._tzNamesMap, fragmentManager.EZpvd(), str);
            }
        }
        return zNamesKWHzl;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class TaskDescription {
        public TimeZoneNames.NameType AEQbTJ;
        public String OLrzqt;
        public String copydefault;

        private TaskDescription() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:510) call: com.ibm.icu.impl.TimeZoneNamesImpl.TaskDescription.<init>():void type: THIS */
        public /* synthetic */ TaskDescription(AnonymousClass5 anonymousClass5) {
            this();
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class ActionBar implements C7029acC.TaskDescription<TaskDescription> {
        public Collection<TimeZoneNames.Activity> AEQbTJ;
        public EnumSet<TimeZoneNames.NameType> KWHzl;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault() {
            this.AEQbTJ = null;
            this.OLrzqt = 0;
        }

        public ActionBar(EnumSet<TimeZoneNames.NameType> enumSet) {
            this.KWHzl = enumSet;
        }

        @Override // o.C7029acC.TaskDescription
        public boolean EZpvd(int i, Iterator<TaskDescription> it) {
            TimeZoneNames.Activity activity;
            while (it.hasNext()) {
                TaskDescription next = it.next();
                EnumSet<TimeZoneNames.NameType> enumSet = this.KWHzl;
                if (enumSet == null || enumSet.contains(next.AEQbTJ)) {
                    String str = next.copydefault;
                    if (str != null) {
                        activity = new TimeZoneNames.Activity(next.AEQbTJ, str, null, i);
                    } else {
                        activity = new TimeZoneNames.Activity(next.AEQbTJ, null, next.OLrzqt, i);
                    }
                    if (this.AEQbTJ == null) {
                        this.AEQbTJ = new LinkedList();
                    }
                    this.AEQbTJ.add(activity);
                    if (i > this.OLrzqt) {
                        this.OLrzqt = i;
                    }
                }
            }
            return true;
        }

        public Collection<TimeZoneNames.Activity> OLrzqt() {
            Collection<TimeZoneNames.Activity> collection = this.AEQbTJ;
            return collection == null ? Collections.emptyList() : collection;
        }
    }

    public static final class FragmentManager extends C7043acQ.ActionBar {
        public static FragmentManager copydefault = new FragmentManager();
        public String[] KWHzl;

        private FragmentManager() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:584) call: com.ibm.icu.impl.TimeZoneNamesImpl.FragmentManager.<init>():void type: THIS */
        public /* synthetic */ FragmentManager(AnonymousClass5 anonymousClass5) {
            this();
        }

        public void KWHzl(ICUResourceBundle iCUResourceBundle, String str) {
            OLrzqt(iCUResourceBundle, TimeZoneNamesImpl.MZ_PREFIX + str);
        }

        public void copydefault(ICUResourceBundle iCUResourceBundle, String str) {
            OLrzqt(iCUResourceBundle, str.replace(JsonPointer.SEPARATOR, AbstractJsonLexerKt.COLON));
        }

        public void OLrzqt(ICUResourceBundle iCUResourceBundle, String str) {
            this.KWHzl = null;
            try {
                iCUResourceBundle.copydefault(str, this);
            } catch (MissingResourceException unused) {
            }
        }

        public static ZNames.NameTypeIndex KWHzl(C7043acQ.Application application) {
            if (application.length() != 2) {
                return null;
            }
            char cCharAt = application.charAt(0);
            char cCharAt2 = application.charAt(1);
            if (cCharAt == 'l') {
                if (cCharAt2 == 'g') {
                    return ZNames.NameTypeIndex.LONG_GENERIC;
                }
                if (cCharAt2 == 's') {
                    return ZNames.NameTypeIndex.LONG_STANDARD;
                }
                if (cCharAt2 == 'd') {
                    return ZNames.NameTypeIndex.LONG_DAYLIGHT;
                }
                return null;
            }
            if (cCharAt != 's') {
                if (cCharAt == 'e' && cCharAt2 == 'c') {
                    return ZNames.NameTypeIndex.EXEMPLAR_LOCATION;
                }
                return null;
            }
            if (cCharAt2 == 'g') {
                return ZNames.NameTypeIndex.SHORT_GENERIC;
            }
            if (cCharAt2 == 's') {
                return ZNames.NameTypeIndex.SHORT_STANDARD;
            }
            if (cCharAt2 == 'd') {
                return ZNames.NameTypeIndex.SHORT_DAYLIGHT;
            }
            return null;
        }

        public final void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            if (this.KWHzl == null) {
                this.KWHzl = new String[7];
            }
            ZNames.NameTypeIndex nameTypeIndexKWHzl = KWHzl(application);
            if (nameTypeIndexKWHzl != null && this.KWHzl[nameTypeIndexKWHzl.ordinal()] == null) {
                this.KWHzl[nameTypeIndexKWHzl.ordinal()] = taskDescription.djBIcL();
            }
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                copydefault(application, taskDescription);
            }
        }

        public final String[] EZpvd() {
            if (C7045acS.AEQbTJ(this.KWHzl, (Object) null)) {
                return null;
            }
            int i = 0;
            for (int i2 = 0; i2 < 7; i2++) {
                String str = this.KWHzl[i2];
                if (str != null) {
                    if (str.equals("∅∅∅")) {
                        this.KWHzl[i2] = null;
                    } else {
                        i = i2 + 1;
                    }
                }
            }
            if (i == 7) {
                return this.KWHzl;
            }
            if (i == 0) {
                return null;
            }
            return (String[]) Arrays.copyOfRange(this.KWHzl, 0, i);
        }
    }

    public static class ZNames {
        public static final ZNames AEQbTJ = new ZNames(null);
        public static final int OLrzqt = NameTypeIndex.EXEMPLAR_LOCATION.ordinal();
        public String[] EZpvd;
        public boolean KWHzl;

        public enum NameTypeIndex {
            EXEMPLAR_LOCATION,
            LONG_GENERIC,
            LONG_STANDARD,
            LONG_DAYLIGHT,
            SHORT_GENERIC,
            SHORT_STANDARD,
            SHORT_DAYLIGHT;

            static final NameTypeIndex[] values = values();
        }

        public static int OLrzqt(TimeZoneNames.NameType nameType) {
            switch (AnonymousClass5.OLrzqt[nameType.ordinal()]) {
                case 1:
                    return NameTypeIndex.EXEMPLAR_LOCATION.ordinal();
                case 2:
                    return NameTypeIndex.LONG_GENERIC.ordinal();
                case 3:
                    return NameTypeIndex.LONG_STANDARD.ordinal();
                case 4:
                    return NameTypeIndex.LONG_DAYLIGHT.ordinal();
                case 5:
                    return NameTypeIndex.SHORT_GENERIC.ordinal();
                case 6:
                    return NameTypeIndex.SHORT_STANDARD.ordinal();
                case 7:
                    return NameTypeIndex.SHORT_DAYLIGHT.ordinal();
                default:
                    throw new AssertionError("No NameTypeIndex match for " + nameType);
            }
        }

        public static TimeZoneNames.NameType OLrzqt(int i) {
            switch (AnonymousClass5.KWHzl[NameTypeIndex.values[i].ordinal()]) {
                case 1:
                    return TimeZoneNames.NameType.EXEMPLAR_LOCATION;
                case 2:
                    return TimeZoneNames.NameType.LONG_GENERIC;
                case 3:
                    return TimeZoneNames.NameType.LONG_STANDARD;
                case 4:
                    return TimeZoneNames.NameType.LONG_DAYLIGHT;
                case 5:
                    return TimeZoneNames.NameType.SHORT_GENERIC;
                case 6:
                    return TimeZoneNames.NameType.SHORT_STANDARD;
                case 7:
                    return TimeZoneNames.NameType.SHORT_DAYLIGHT;
                default:
                    throw new AssertionError("No NameType match for " + i);
            }
        }

        public ZNames(String[] strArr) {
            this.EZpvd = strArr;
            this.KWHzl = strArr == null;
        }

        public static ZNames copydefault(Map<String, ZNames> map, String[] strArr, String str) {
            String strIntern = str.intern();
            ZNames zNames = strArr == null ? AEQbTJ : new ZNames(strArr);
            map.put(strIntern, zNames);
            return zNames;
        }

        public static ZNames KWHzl(Map<String, ZNames> map, String[] strArr, String str) {
            if (strArr == null) {
                strArr = new String[OLrzqt + 1];
            }
            int i = OLrzqt;
            if (strArr[i] == null) {
                strArr[i] = TimeZoneNamesImpl.getDefaultExemplarLocationName(str);
            }
            String strIntern = str.intern();
            ZNames zNames = new ZNames(strArr);
            map.put(strIntern, zNames);
            return zNames;
        }

        public String copydefault(TimeZoneNames.NameType nameType) {
            int iOLrzqt = OLrzqt(nameType);
            String[] strArr = this.EZpvd;
            if (strArr == null || iOLrzqt >= strArr.length) {
                return null;
            }
            return strArr[iOLrzqt];
        }

        public void EZpvd(String str, C7029acC<TaskDescription> c7029acC) {
            AEQbTJ(str, null, c7029acC);
        }

        public void OLrzqt(String str, C7029acC<TaskDescription> c7029acC) {
            AEQbTJ(null, str, c7029acC);
        }

        public final void AEQbTJ(String str, String str2, C7029acC<TaskDescription> c7029acC) {
            if (this.EZpvd == null || this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            int i = 0;
            while (true) {
                String[] strArr = this.EZpvd;
                if (i >= strArr.length) {
                    return;
                }
                String str3 = strArr[i];
                if (str3 != null) {
                    TaskDescription taskDescription = new TaskDescription(null);
                    taskDescription.OLrzqt = str;
                    taskDescription.copydefault = str2;
                    taskDescription.AEQbTJ = OLrzqt(i);
                    c7029acC.AEQbTJ(str3, taskDescription);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.TimeZoneNamesImpl$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[ZNames.NameTypeIndex.values().length];
            KWHzl = iArr;
            try {
                iArr[ZNames.NameTypeIndex.EXEMPLAR_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[ZNames.NameTypeIndex.LONG_GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[ZNames.NameTypeIndex.LONG_STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[ZNames.NameTypeIndex.LONG_DAYLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KWHzl[ZNames.NameTypeIndex.SHORT_GENERIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KWHzl[ZNames.NameTypeIndex.SHORT_STANDARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                KWHzl[ZNames.NameTypeIndex.SHORT_DAYLIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[TimeZoneNames.NameType.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[TimeZoneNames.NameType.EXEMPLAR_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                OLrzqt[TimeZoneNames.NameType.LONG_GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                OLrzqt[TimeZoneNames.NameType.LONG_STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                OLrzqt[TimeZoneNames.NameType.LONG_DAYLIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                OLrzqt[TimeZoneNames.NameType.SHORT_GENERIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                OLrzqt[TimeZoneNames.NameType.SHORT_STANDARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                OLrzqt[TimeZoneNames.NameType.SHORT_DAYLIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static class Activity {
        public long AEQbTJ;
        public long KWHzl;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long OLrzqt() {
            return this.KWHzl;
        }

        public Activity(String str, long j, long j2) {
            this.OLrzqt = str;
            this.KWHzl = j;
            this.AEQbTJ = j2;
        }
    }

    public static class StateListAnimator extends AbstractC7078acz<String, List<Activity>, String> {
        private StateListAnimator() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:851) call: com.ibm.icu.impl.TimeZoneNamesImpl.StateListAnimator.<init>():void type: THIS */
        public /* synthetic */ StateListAnimator(AnonymousClass5 anonymousClass5) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public List<Activity> copydefault(String str, String str2) {
            String strCopydefault;
            String strCopydefault2;
            try {
                UResourceBundle uResourceBundleIsConnected = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "metaZones").isConnected("metazoneInfo").isConnected(str2.replace(JsonPointer.SEPARATOR, AbstractJsonLexerKt.COLON));
                ArrayList arrayList = new ArrayList(uResourceBundleIsConnected.fARcdN());
                for (int i = 0; i < uResourceBundleIsConnected.fARcdN(); i++) {
                    UResourceBundle uResourceBundleKWHzl = uResourceBundleIsConnected.KWHzl(i);
                    String strCopydefault3 = uResourceBundleKWHzl.copydefault(0);
                    if (uResourceBundleKWHzl.fARcdN() != 3) {
                        strCopydefault = "1970-01-01 00:00";
                        strCopydefault2 = "9999-12-31 23:59";
                    } else {
                        strCopydefault = uResourceBundleKWHzl.copydefault(1);
                        strCopydefault2 = uResourceBundleKWHzl.copydefault(2);
                    }
                    arrayList.add(new Activity(strCopydefault3, copydefault(strCopydefault), copydefault(strCopydefault2)));
                }
                return arrayList;
            } catch (MissingResourceException unused) {
                return Collections.emptyList();
            }
        }

        public static long copydefault(String str) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 <= 3; i3++) {
                int iCharAt = str.charAt(i3) - '0';
                if (iCharAt < 0 || iCharAt >= 10) {
                    throw new IllegalArgumentException("Bad year");
                }
                i2 = (i2 * 10) + iCharAt;
            }
            int i4 = 0;
            for (int i5 = 5; i5 <= 6; i5++) {
                int iCharAt2 = str.charAt(i5) - '0';
                if (iCharAt2 < 0 || iCharAt2 >= 10) {
                    throw new IllegalArgumentException("Bad month");
                }
                i4 = (i4 * 10) + iCharAt2;
            }
            int i6 = 0;
            for (int i7 = 8; i7 <= 9; i7++) {
                int iCharAt3 = str.charAt(i7) - '0';
                if (iCharAt3 < 0 || iCharAt3 >= 10) {
                    throw new IllegalArgumentException("Bad day");
                }
                i6 = (i6 * 10) + iCharAt3;
            }
            int i8 = 0;
            for (int i9 = 11; i9 <= 12; i9++) {
                int iCharAt4 = str.charAt(i9) - '0';
                if (iCharAt4 < 0 || iCharAt4 >= 10) {
                    throw new IllegalArgumentException("Bad hour");
                }
                i8 = (i8 * 10) + iCharAt4;
            }
            for (int i10 = 14; i10 <= 15; i10++) {
                int iCharAt5 = str.charAt(i10) - '0';
                if (iCharAt5 < 0 || iCharAt5 >= 10) {
                    throw new IllegalArgumentException("Bad minute");
                }
                i = (i * 10) + iCharAt5;
            }
            return (C7019abT.copydefault(i2, i4 - 1, i6) * CalendarModelKt.MillisecondsIn24Hours) + (((long) i8) * 3600000) + (((long) i) * 60000);
        }
    }

    public static class Application extends AbstractC7078acz<String, Map<String, String>, String> {
        private Application() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:957) call: com.ibm.icu.impl.TimeZoneNamesImpl.Application.<init>():void type: THIS */
        public /* synthetic */ Application(AnonymousClass5 anonymousClass5) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Map<String, String> copydefault(String str, String str2) {
            try {
                UResourceBundle uResourceBundleIsConnected = UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "metaZones").isConnected("mapTimezones").isConnected(str);
                Set<String> setKeySet = uResourceBundleIsConnected.keySet();
                HashMap map = new HashMap(setKeySet.size());
                for (String str3 : setKeySet) {
                    map.put(str3.intern(), uResourceBundleIsConnected.getString(str3).intern());
                }
                return map;
            } catch (MissingResourceException unused) {
                return Collections.emptyMap();
            }
        }
    }

    public static String getDefaultExemplarLocationName(String str) {
        int iLastIndexOf;
        int i;
        if (str == null || str.length() == 0 || LOC_EXCLUSION_PATTERN.matcher(str).matches() || (iLastIndexOf = str.lastIndexOf(47)) <= 0 || (i = iLastIndexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i).replace('_', ' ');
    }
}
