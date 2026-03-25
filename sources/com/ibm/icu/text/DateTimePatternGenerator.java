package com.ibm.icu.text;

import androidx.exifinterface.media.ExifInterface;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.C;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.Region;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeMap;
import o.C7027acA;
import o.C7028acB;
import o.C7043acQ;
import o.C7068acp;
import o.InterfaceC7054acb;
import o.InterfaceC7248agJ;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimePatternGenerator implements InterfaceC7248agJ<DateTimePatternGenerator>, Cloneable {
    public static final DisplayWidth AEQbTJ;
    public static final String[] AYXKKw;
    public static final String[] AhwBna;
    public static final Map<String, String[]> DbNXlk;
    public static final int EZpvd;
    public static final Set<String> KWHzl;
    public static final String[] OLrzqt;
    public static final String[] copydefault;
    public static InterfaceC7054acb<String, DateTimePatternGenerator> djBIcL;
    public static final DisplayWidth[] gEmmrt;
    public static final int[][] isConnected;
    public static final String[] valueOf = {DateFormat.HOUR24};
    public String[] AkhnZx;
    public transient StateListAnimator ejfBZ;
    public transient Dialog fetchVPNInfo;
    public TreeMap<StateListAnimator, FragmentManager> getFieldNames = new TreeMap<>();
    public TreeMap<String, FragmentManager> fIwbmz = new TreeMap<>();
    public String AuCTel = "?";
    public String fARcdN = "{1} {0}";
    public String[] values = new String[16];
    public String[][] hDKMBd = (String[][]) Array.newInstance((Class<?>) String.class, 16, DisplayWidth.COUNT);
    public char uzCIH = 'H';
    public volatile boolean iwGUEr = false;
    public transient LoaderManager getNewProxyInstance = new LoaderManager();
    public Set<String> fJNWhG = new HashSet(20);

    public enum DTPGflags {
        FIX_FRACTIONAL_SECONDS,
        SKELETON_USES_CAP_J
    }

    public static final class Fragment {
        public int EZpvd;
        public String KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DateTimePatternGenerator AhwBna() {
        this.iwGUEr = true;
        return this;
    }

    public final int gEmmrt(int i) {
        int i2 = 0;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2 - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.iwGUEr;
    }

    public DateTimePatternGenerator() {
        this.ejfBZ = new StateListAnimator();
        this.fetchVPNInfo = new Dialog();
    }

    public static DateTimePatternGenerator KWHzl(ULocale uLocale) {
        return EZpvd(uLocale).valueOf();
    }

    @Deprecated
    public static DateTimePatternGenerator EZpvd(ULocale uLocale) {
        String string = uLocale.toString();
        DateTimePatternGenerator dateTimePatternGeneratorEZpvd = djBIcL.EZpvd(string);
        if (dateTimePatternGeneratorEZpvd != null) {
            return dateTimePatternGeneratorEZpvd;
        }
        DateTimePatternGenerator dateTimePatternGenerator = new DateTimePatternGenerator();
        dateTimePatternGenerator.EZpvd(uLocale, false);
        dateTimePatternGenerator.AhwBna();
        djBIcL.KWHzl(string, dateTimePatternGenerator);
        return dateTimePatternGenerator;
    }

    @Deprecated
    public static DateTimePatternGenerator AEQbTJ(ULocale uLocale) {
        DateTimePatternGenerator dateTimePatternGenerator = new DateTimePatternGenerator();
        dateTimePatternGenerator.EZpvd(uLocale, true);
        return dateTimePatternGenerator;
    }

    public final void EZpvd(ULocale uLocale, boolean z) {
        Fragment fragment = new Fragment();
        KWHzl();
        if (!z) {
            KWHzl(fragment, uLocale);
        }
        copydefault(fragment, uLocale);
        if (!z) {
            djBIcL(uLocale);
        } else {
            copydefault("{1} {0}");
        }
        AYXKKw(uLocale);
        copydefault(uLocale);
        djBIcL();
    }

    public final void KWHzl(Fragment fragment, ULocale uLocale) {
        for (int i = 0; i <= 3; i++) {
            AEQbTJ(((SimpleDateFormat) DateFormat.getDateInstance(i, uLocale)).toPattern(), false, fragment);
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) DateFormat.getTimeInstance(i, uLocale);
            AEQbTJ(simpleDateFormat.toPattern(), false, fragment);
            if (i == 3) {
                EZpvd(simpleDateFormat.toPattern(), fragment);
            }
        }
    }

    public final String OLrzqt(ULocale uLocale) {
        String keywordValue = uLocale.getKeywordValue("calendar");
        if (keywordValue == null) {
            keywordValue = Calendar.getKeywordValuesForLocale("calendar", uLocale, true)[0];
        }
        return keywordValue == null ? "gregorian" : keywordValue;
    }

    public final void EZpvd(String str, Fragment fragment) {
        AEQbTJ(fragment, str);
    }

    public class ActionBar extends C7043acQ.ActionBar {
        public ActionBar() {
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                int iOLrzqt = DateTimePatternGenerator.OLrzqt(application);
                if (DateTimePatternGenerator.this.copydefault(iOLrzqt) == null) {
                    DateTimePatternGenerator.this.OLrzqt(iOLrzqt, taskDescription.toString());
                }
            }
        }
    }

    public class TaskDescription extends C7043acQ.ActionBar {
        public TaskDescription() {
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            int iEZpvd;
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (taskDescription.AhwBna() == 2 && (iEZpvd = DateTimePatternGenerator.EZpvd(application)) != -1) {
                    int i2 = iEZpvd / DisplayWidth.COUNT;
                    DisplayWidth displayWidth = DateTimePatternGenerator.gEmmrt[iEZpvd % DisplayWidth.COUNT];
                    C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                    int i3 = 0;
                    while (true) {
                        if (!stateListAnimatorValueOf2.AEQbTJ(i3, application, taskDescription)) {
                            break;
                        }
                        if (!application.copydefault("dn")) {
                            i3++;
                        } else if (DateTimePatternGenerator.this.EZpvd(i2, displayWidth) == null) {
                            DateTimePatternGenerator.this.KWHzl(i2, displayWidth, taskDescription.toString());
                        }
                    }
                }
            }
        }
    }

    public final void djBIcL() {
        for (int i = 0; i < 16; i++) {
            if (copydefault(i) == null) {
                OLrzqt(i, "{0} ├{2}: {1}┤");
            }
            DisplayWidth displayWidth = DisplayWidth.WIDE;
            if (EZpvd(i, displayWidth) == null) {
                KWHzl(i, displayWidth, "F" + i);
            }
            DisplayWidth displayWidth2 = DisplayWidth.ABBREVIATED;
            if (EZpvd(i, displayWidth2) == null) {
                KWHzl(i, displayWidth2, EZpvd(i, displayWidth));
            }
            DisplayWidth displayWidth3 = DisplayWidth.NARROW;
            if (EZpvd(i, displayWidth3) == null) {
                KWHzl(i, displayWidth3, EZpvd(i, displayWidth2));
            }
        }
    }

    public class Application extends C7043acQ.ActionBar {
        public Fragment OLrzqt;

        public Application(Fragment fragment) {
            this.OLrzqt = fragment;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                String string = application.toString();
                if (!DateTimePatternGenerator.this.KWHzl(string)) {
                    DateTimePatternGenerator.this.AEQbTJ(string);
                    DateTimePatternGenerator.this.AEQbTJ(taskDescription.toString(), string, !z, this.OLrzqt);
                }
            }
        }
    }

    public final void copydefault(Fragment fragment, ULocale uLocale) {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", uLocale);
        String strOLrzqt = OLrzqt(uLocale);
        try {
            iCUResourceBundle.copydefault("calendar/" + strOLrzqt + "/appendItems", new ActionBar());
        } catch (MissingResourceException unused) {
        }
        try {
            iCUResourceBundle.copydefault("fields", new TaskDescription());
        } catch (MissingResourceException unused2) {
        }
        try {
            iCUResourceBundle.copydefault("calendar/" + strOLrzqt + "/availableFormats", new Application(fragment));
        } catch (MissingResourceException unused3) {
        }
    }

    public final void djBIcL(ULocale uLocale) {
        copydefault(Calendar.getDateTimePattern(Calendar.getInstance(uLocale), uLocale, 2));
    }

    public final void AYXKKw(ULocale uLocale) {
        valueOf(String.valueOf(new DecimalFormatSymbols(uLocale).getDecimalSeparator()));
    }

    public final String[] AEQbTJ(String str, String str2) {
        Map<String, String[]> map = DbNXlk;
        String[] strArr = map.get(str + "_" + str2);
        return strArr == null ? map.get(str2) : strArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(ULocale uLocale) {
        Character ch;
        byte b;
        String language = uLocale.getLanguage();
        String country = uLocale.getCountry();
        if (language.isEmpty() || country.isEmpty()) {
            ULocale uLocaleAddLikelySubtags = ULocale.addLikelySubtags(uLocale);
            String language2 = uLocaleAddLikelySubtags.getLanguage();
            country = uLocaleAddLikelySubtags.getCountry();
            language = language2;
        }
        if (language.isEmpty()) {
            language = C.LANGUAGE_UNDETERMINED;
        }
        if (country.isEmpty()) {
            country = "001";
        }
        String[] strArrAEQbTJ = AEQbTJ(language, country);
        String keywordValue = uLocale.getKeywordValue("hours");
        if (keywordValue != null) {
            switch (keywordValue.hashCode()) {
                case 101512:
                    b = !keywordValue.equals("h11") ? (byte) -1 : (byte) 0;
                    break;
                case 101513:
                    if (keywordValue.equals("h12")) {
                        b = 1;
                        break;
                    }
                    break;
                case 101545:
                    if (keywordValue.equals("h23")) {
                        b = 2;
                        break;
                    }
                    break;
                case 101546:
                    if (keywordValue.equals("h24")) {
                        b = 3;
                        break;
                    }
                    break;
            }
            if (b == 0) {
                ch = 'K';
            } else if (b == 1) {
                ch = 'h';
            } else if (b != 2) {
                ch = b != 3 ? null : 'k';
            } else {
                ch = 'H';
            }
        }
        if (strArrAEQbTJ == null) {
            try {
                strArrAEQbTJ = AEQbTJ(language, Region.OLrzqt(country).toString());
            } catch (IllegalArgumentException unused) {
            }
        }
        if (strArrAEQbTJ != null) {
            this.uzCIH = ch != null ? ch.charValue() : strArrAEQbTJ[0].charAt(0);
            this.AkhnZx = (String[]) Arrays.copyOfRange(strArrAEQbTJ, 1, strArrAEQbTJ.length - 1);
        } else {
            String[] strArr = valueOf;
            this.AkhnZx = strArr;
            this.uzCIH = ch != null ? ch.charValue() : strArr[0].charAt(0);
        }
    }

    public static class Activity extends C7043acQ.ActionBar {
        public HashMap<String, String[]> OLrzqt;

        public Activity(HashMap<String, String[]> map) {
            this.OLrzqt = map;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            String[] strArr;
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                String string = application.toString();
                C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                String[] strArrAYXKKw = null;
                String strDjBIcL = null;
                for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                    if (application.copydefault("allowed")) {
                        strArrAYXKKw = taskDescription.AYXKKw();
                    } else if (application.copydefault("preferred")) {
                        strDjBIcL = taskDescription.djBIcL();
                    }
                }
                if (strArrAYXKKw == null || strArrAYXKKw.length <= 0) {
                    strArr = new String[2];
                    if (strDjBIcL == null) {
                        strDjBIcL = DateTimePatternGenerator.valueOf[0];
                    }
                    strArr[0] = strDjBIcL;
                    strArr[1] = strDjBIcL;
                } else {
                    strArr = new String[strArrAYXKKw.length + 1];
                    if (strDjBIcL == null) {
                        strDjBIcL = strArrAYXKKw[0];
                    }
                    strArr[0] = strDjBIcL;
                    System.arraycopy(strArrAYXKKw, 0, strArr, 1, strArrAYXKKw.length);
                }
                this.OLrzqt.put(string, strArr);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        ((ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "supplementalData", ICUResourceBundle.AEQbTJ)).copydefault("timeData", new Activity(map));
        DbNXlk = Collections.unmodifiableMap(map);
        DisplayWidth displayWidth = DisplayWidth.WIDE;
        AEQbTJ = displayWidth;
        EZpvd = displayWidth.ordinal();
        gEmmrt = DisplayWidth.values();
        djBIcL = new C7027acA();
        copydefault = new String[]{"Era", "Year", "Quarter", "Month", "Week", "*", "Day-Of-Week", "Day", "*", "*", "*", "Hour", "Minute", "Second", "*", "Timezone"};
        AYXKKw = new String[]{"era", "year", "quarter", "month", "week", "weekOfMonth", "weekday", MTPushConstants.NotificationTime.KEY_DAYS, "dayOfYear", "weekdayOfMonth", "dayperiod", "hour", "minute", "second", "*", "zone"};
        AhwBna = new String[]{"Era", "Year", "Quarter", "Month", "Week_in_Year", "Week_in_Month", "Weekday", "Day", "Day_Of_Year", "Day_of_Week_in_Month", "Dayperiod", "Hour", "Minute", "Second", "Fractional_Second", "Zone"};
        String[] strArr = {"G", DateFormat.YEAR, "Q", "M", "w", ExifInterface.LONGITUDE_WEST, "E", DateFormat.DAY, "D", "F", IEncryptorType.DEFAULT_ENCRYPTOR, DateFormat.HOUR24, DateFormat.MINUTE, DateFormat.SECOND, ExifInterface.LATITUDE_SOUTH, DateFormat.ABBR_GENERIC_TZ};
        OLrzqt = strArr;
        KWHzl = new HashSet(Arrays.asList(strArr));
        isConnected = new int[][]{new int[]{71, 0, -259, 1, 3}, new int[]{71, 0, -260, 4}, new int[]{71, 0, -257, 5}, new int[]{121, 1, 256, 1, 20}, new int[]{89, 1, 272, 1, 20}, new int[]{117, 1, 288, 1, 20}, new int[]{114, 1, 304, 1, 20}, new int[]{85, 1, -259, 1, 3}, new int[]{85, 1, -260, 4}, new int[]{85, 1, -257, 5}, new int[]{81, 2, 256, 1, 2}, new int[]{81, 2, -259, 3}, new int[]{81, 2, -260, 4}, new int[]{81, 2, -257, 5}, new int[]{WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, 2, 272, 1, 2}, new int[]{WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, 2, -275, 3}, new int[]{WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, 2, -276, 4}, new int[]{WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, 2, -273, 5}, new int[]{77, 3, 256, 1, 2}, new int[]{77, 3, -259, 3}, new int[]{77, 3, -260, 4}, new int[]{77, 3, -257, 5}, new int[]{76, 3, 272, 1, 2}, new int[]{76, 3, -275, 3}, new int[]{76, 3, -276, 4}, new int[]{76, 3, -273, 5}, new int[]{108, 3, 272, 1, 1}, new int[]{119, 4, 256, 1, 2}, new int[]{87, 5, 256, 1}, new int[]{69, 6, -259, 1, 3}, new int[]{69, 6, -260, 4}, new int[]{69, 6, -257, 5}, new int[]{69, 6, -258, 6}, new int[]{99, 6, 288, 1, 2}, new int[]{99, 6, -291, 3}, new int[]{99, 6, -292, 4}, new int[]{99, 6, -289, 5}, new int[]{99, 6, -290, 6}, new int[]{101, 6, 272, 1, 2}, new int[]{101, 6, -275, 3}, new int[]{101, 6, -276, 4}, new int[]{101, 6, -273, 5}, new int[]{101, 6, -274, 6}, new int[]{100, 7, 256, 1, 2}, new int[]{103, 7, 272, 1, 20}, new int[]{68, 8, 256, 1, 3}, new int[]{70, 9, 256, 1}, new int[]{97, 10, -259, 1, 3}, new int[]{97, 10, -260, 4}, new int[]{97, 10, -257, 5}, new int[]{98, 10, -275, 1, 3}, new int[]{98, 10, -276, 4}, new int[]{98, 10, -273, 5}, new int[]{66, 10, -307, 1, 3}, new int[]{66, 10, -308, 4}, new int[]{66, 10, -305, 5}, new int[]{72, 11, 416, 1, 2}, new int[]{107, 11, 432, 1, 2}, new int[]{104, 11, 256, 1, 2}, new int[]{75, 11, 272, 1, 2}, new int[]{109, 12, 256, 1, 2}, new int[]{115, 13, 256, 1, 2}, new int[]{65, 13, 272, 1, 1000}, new int[]{83, 14, 256, 1, 1000}, new int[]{118, 15, -291, 1}, new int[]{118, 15, -292, 4}, new int[]{122, 15, -259, 1, 3}, new int[]{122, 15, -260, 4}, new int[]{90, 15, -273, 1, 3}, new int[]{90, 15, -276, 4}, new int[]{90, 15, -275, 5}, new int[]{79, 15, -275, 1}, new int[]{79, 15, -276, 4}, new int[]{86, 15, -275, 1}, new int[]{86, 15, -276, 2}, new int[]{86, 15, -277, 3}, new int[]{86, 15, -278, 4}, new int[]{88, 15, -273, 1}, new int[]{88, 15, -275, 2}, new int[]{88, 15, -276, 4}, new int[]{120, 15, -273, 1}, new int[]{120, 15, -275, 2}, new int[]{120, 15, -276, 4}};
    }

    public final void AEQbTJ(Fragment fragment, String str) {
        this.getNewProxyInstance.copydefault(str);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= this.getNewProxyInstance.EZpvd.size()) {
                break;
            }
            Object obj = this.getNewProxyInstance.EZpvd.get(i);
            if (!(obj instanceof String)) {
                char cCharAt = obj.toString().charAt(0);
                if (cCharAt != 'm') {
                    if (cCharAt != 's') {
                        if (z || cCharAt == 'z' || cCharAt == 'Z' || cCharAt == 'v' || cCharAt == 'V') {
                            break;
                        }
                    } else if (z) {
                        sb.append(obj);
                        AEQbTJ(sb.toString(), false, fragment);
                    }
                } else {
                    sb.append(obj);
                    z = true;
                }
            } else if (z) {
                sb.append(this.getNewProxyInstance.OLrzqt(obj.toString()));
            }
            i++;
        }
        BitSet bitSet = new BitSet();
        BitSet bitSet2 = new BitSet();
        for (int i2 = 0; i2 < this.getNewProxyInstance.EZpvd.size(); i2++) {
            Object obj2 = this.getNewProxyInstance.EZpvd.get(i2);
            if (obj2 instanceof TaskStackBuilder) {
                bitSet.set(i2);
                char cCharAt2 = obj2.toString().charAt(0);
                if (cCharAt2 == 's' || cCharAt2 == 'S') {
                    bitSet2.set(i2);
                    for (int i3 = i2 - 1; i3 >= 0 && !bitSet.get(i3); i3++) {
                        bitSet2.set(i2);
                    }
                }
            }
        }
        AEQbTJ(KWHzl(this.getNewProxyInstance, bitSet2), false, fragment);
    }

    public static String KWHzl(LoaderManager loaderManager, BitSet bitSet) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loaderManager.EZpvd.size(); i++) {
            if (!bitSet.get(i)) {
                Object obj = loaderManager.EZpvd.get(i);
                if (obj instanceof String) {
                    sb.append(loaderManager.OLrzqt(obj.toString()));
                } else {
                    sb.append(obj.toString());
                }
            }
        }
        return sb.toString();
    }

    @Deprecated
    public static int OLrzqt(C7043acQ.Application application) {
        int i = 0;
        while (true) {
            String[] strArr = copydefault;
            if (i >= strArr.length) {
                return -1;
            }
            if (application.copydefault(strArr[i])) {
                return i;
            }
            i++;
        }
    }

    public static int EZpvd(C7043acQ.Application application) {
        for (int i = 0; i < AYXKKw.length; i++) {
            for (int i2 = 0; i2 < DisplayWidth.COUNT; i2++) {
                if (application.copydefault(AYXKKw[i].concat(gEmmrt[i2].cldrKey()))) {
                    return (i * DisplayWidth.COUNT) + i2;
                }
            }
        }
        return -1;
    }

    public String EZpvd(String str) {
        return copydefault(str, null, 0);
    }

    public final String copydefault(String str, StateListAnimator stateListAnimator, int i) {
        EnumSet<DTPGflags> enumSetNoneOf = EnumSet.noneOf(DTPGflags.class);
        String strEZpvd = EZpvd(str, enumSetNoneOf);
        synchronized (this) {
            this.ejfBZ.OLrzqt(strEZpvd, this.getNewProxyInstance, false);
            PendingIntent pendingIntentEZpvd = EZpvd(this.ejfBZ, -1, this.fetchVPNInfo, stateListAnimator);
            Dialog dialog = this.fetchVPNInfo;
            if (dialog.EZpvd == 0 && dialog.copydefault == 0) {
                return EZpvd(pendingIntentEZpvd, this.ejfBZ, enumSetNoneOf, i);
            }
            int iCopydefault = this.ejfBZ.copydefault();
            String strEZpvd2 = EZpvd(this.ejfBZ, iCopydefault & 1023, this.fetchVPNInfo, stateListAnimator, enumSetNoneOf, i);
            String strEZpvd3 = EZpvd(this.ejfBZ, iCopydefault & 64512, this.fetchVPNInfo, stateListAnimator, enumSetNoneOf, i);
            return strEZpvd2 == null ? strEZpvd3 == null ? "" : strEZpvd3 : strEZpvd3 == null ? strEZpvd2 : C7028acB.OLrzqt(AYXKKw(), 2, 2, strEZpvd3, strEZpvd2);
        }
    }

    public final String EZpvd(String str, EnumSet<DTPGflags> enumSet) {
        char c;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\'') {
                z = !z;
            } else if (!z) {
                if (cCharAt == 'j' || cCharAt == 'C') {
                    int i2 = 0;
                    while (true) {
                        int i3 = i + 1;
                        if (i3 >= str.length() || str.charAt(i3) != cCharAt) {
                            break;
                        }
                        i2++;
                        i = i3;
                    }
                    int i4 = i2 < 2 ? 1 : (i2 >> 1) + 3;
                    if (cCharAt == 'j') {
                        c = this.uzCIH;
                    } else {
                        String str2 = this.AkhnZx[0];
                        char cCharAt2 = str2.charAt(0);
                        char cCharAt3 = str2.charAt(str2.length() - 1);
                        c = (cCharAt3 == 'b' || cCharAt3 == 'B') ? cCharAt3 : 'a';
                        c = cCharAt2;
                    }
                    if (c == 'H' || c == 'k') {
                        i4 = 0;
                    }
                    while (i4 > 0) {
                        sb.append(c);
                        i4--;
                    }
                    for (int i5 = (i2 & 1) + 1; i5 > 0; i5--) {
                        sb.append(c);
                    }
                } else if (cCharAt == 'J') {
                    sb.append('H');
                    enumSet.add(DTPGflags.SKELETON_USES_CAP_J);
                } else {
                    sb.append(cCharAt);
                }
            }
            i++;
        }
        return sb.toString();
    }

    public DateTimePatternGenerator AEQbTJ(String str, boolean z, Fragment fragment) {
        return AEQbTJ(str, null, z, fragment);
    }

    @Deprecated
    public DateTimePatternGenerator AEQbTJ(String str, String str2, boolean z, Fragment fragment) {
        StateListAnimator stateListAnimatorOLrzqt;
        EZpvd();
        if (str2 == null) {
            stateListAnimatorOLrzqt = new StateListAnimator().OLrzqt(str, this.getNewProxyInstance, false);
        } else {
            stateListAnimatorOLrzqt = new StateListAnimator().OLrzqt(str2, this.getNewProxyInstance, false);
        }
        String strOLrzqt = stateListAnimatorOLrzqt.OLrzqt();
        FragmentManager fragmentManager = this.fIwbmz.get(strOLrzqt);
        if (fragmentManager != null && (!fragmentManager.EZpvd || (str2 != null && !z))) {
            fragment.EZpvd = 1;
            fragment.KWHzl = fragmentManager.KWHzl;
            if (!z) {
                return this;
            }
        }
        FragmentManager fragmentManager2 = this.getFieldNames.get(stateListAnimatorOLrzqt);
        if (fragmentManager2 != null) {
            fragment.EZpvd = 2;
            fragment.KWHzl = fragmentManager2.KWHzl;
            if (!z || (str2 != null && fragmentManager2.EZpvd)) {
                return this;
            }
        }
        fragment.EZpvd = 0;
        fragment.KWHzl = "";
        FragmentManager fragmentManager3 = new FragmentManager(str, str2 != null);
        this.getFieldNames.put(stateListAnimatorOLrzqt, fragmentManager3);
        this.fIwbmz.put(strOLrzqt, fragmentManager3);
        return this;
    }

    public String OLrzqt(String str) {
        String string;
        synchronized (this) {
            this.ejfBZ.OLrzqt(str, this.getNewProxyInstance, false);
            string = this.ejfBZ.toString();
        }
        return string;
    }

    public void copydefault(String str) {
        EZpvd();
        this.fARcdN = str;
    }

    public void valueOf(String str) {
        EZpvd();
        this.AuCTel = str;
    }

    public enum DisplayWidth {
        WIDE(""),
        ABBREVIATED("-short"),
        NARROW("-narrow");


        @Deprecated
        private static int COUNT = values().length;
        private final String cldrKey;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public String cldrKey() {
            return this.cldrKey;
        }

        DisplayWidth(String str) {
            this.cldrKey = str;
        }
    }

    public void OLrzqt(int i, String str) {
        EZpvd();
        this.values[i] = str;
    }

    public String copydefault(int i) {
        return this.values[i];
    }

    @Deprecated
    public final void KWHzl(int i, DisplayWidth displayWidth, String str) {
        EZpvd();
        if (i >= 16 || i < 0) {
            return;
        }
        this.hDKMBd[i][displayWidth.ordinal()] = str;
    }

    public String EZpvd(int i, DisplayWidth displayWidth) {
        return (i >= 16 || i < 0) ? "" : this.hDKMBd[i][displayWidth.ordinal()];
    }

    public final void AEQbTJ(String str) {
        EZpvd();
        this.fJNWhG.add(str);
    }

    public final boolean KWHzl(String str) {
        return this.fJNWhG.contains(str);
    }

    public DateTimePatternGenerator valueOf() {
        DateTimePatternGenerator dateTimePatternGenerator = (DateTimePatternGenerator) clone();
        this.iwGUEr = false;
        return dateTimePatternGenerator;
    }

    public Object clone() {
        try {
            DateTimePatternGenerator dateTimePatternGenerator = (DateTimePatternGenerator) super.clone();
            dateTimePatternGenerator.getFieldNames = (TreeMap) this.getFieldNames.clone();
            dateTimePatternGenerator.fIwbmz = (TreeMap) this.fIwbmz.clone();
            dateTimePatternGenerator.values = (String[]) this.values.clone();
            dateTimePatternGenerator.hDKMBd = (String[][]) this.hDKMBd.clone();
            dateTimePatternGenerator.ejfBZ = new StateListAnimator();
            dateTimePatternGenerator.getNewProxyInstance = new LoaderManager();
            dateTimePatternGenerator.fetchVPNInfo = new Dialog();
            dateTimePatternGenerator.iwGUEr = false;
            return dateTimePatternGenerator;
        } catch (CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException("Internal Error", e);
        }
    }

    @Deprecated
    public static class TaskStackBuilder {
        public final String EZpvd;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public String toString() {
            return this.EZpvd;
        }

        @Deprecated
        public TaskStackBuilder(String str, boolean z) {
            int iKWHzl = DateTimePatternGenerator.KWHzl(str, z);
            this.OLrzqt = iKWHzl;
            if (iKWHzl >= 0) {
                this.EZpvd = str;
                return;
            }
            throw new IllegalArgumentException("Illegal datetime field:\t" + str);
        }

        @Deprecated
        public int copydefault() {
            return DateTimePatternGenerator.isConnected[this.OLrzqt][1];
        }

        @Deprecated
        public boolean KWHzl() {
            return DateTimePatternGenerator.isConnected[this.OLrzqt][2] > 0;
        }
    }

    @Deprecated
    public static class LoaderManager {
        public static final UnicodeSet copydefault = new UnicodeSet("[a-zA-Z]").AYXKKw();
        public static final UnicodeSet AEQbTJ = new UnicodeSet("[[[:script=Latn:][:script=Cyrl:]]&[[:L:][:M:]]]").AYXKKw();
        public transient C7068acp KWHzl = new C7068acp().OLrzqt(copydefault).copydefault(AEQbTJ).AEQbTJ(true);
        public List<Object> EZpvd = new ArrayList();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Deprecated
        public List<Object> OLrzqt() {
            return this.EZpvd;
        }

        @Deprecated
        public LoaderManager() {
        }

        @Deprecated
        public final LoaderManager copydefault(String str) {
            return AEQbTJ(str, false);
        }

        @Deprecated
        public LoaderManager AEQbTJ(String str, boolean z) {
            this.EZpvd.clear();
            if (str.length() == 0) {
                return this;
            }
            this.KWHzl.KWHzl(str);
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            while (true) {
                stringBuffer.setLength(0);
                int iOLrzqt = this.KWHzl.OLrzqt(stringBuffer);
                if (iOLrzqt == 0) {
                    AEQbTJ(stringBuffer2, false);
                    return this;
                }
                if (iOLrzqt == 1) {
                    if (stringBuffer2.length() != 0 && stringBuffer.charAt(0) != stringBuffer2.charAt(0)) {
                        AEQbTJ(stringBuffer2, false);
                    }
                    stringBuffer2.append(stringBuffer);
                } else {
                    AEQbTJ(stringBuffer2, false);
                    this.EZpvd.add(stringBuffer.toString());
                }
            }
        }

        public final void AEQbTJ(StringBuffer stringBuffer, boolean z) {
            if (stringBuffer.length() != 0) {
                this.EZpvd.add(new TaskStackBuilder(stringBuffer.toString(), z));
                stringBuffer.setLength(0);
            }
        }

        @Deprecated
        public String toString() {
            return EZpvd(0, this.EZpvd.size());
        }

        @Deprecated
        public String EZpvd(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            while (i < i2) {
                Object obj = this.EZpvd.get(i);
                if (obj instanceof String) {
                    sb.append(this.KWHzl.AEQbTJ((String) obj));
                } else {
                    sb.append(this.EZpvd.get(i).toString());
                }
                i++;
            }
            return sb.toString();
        }

        @Deprecated
        public Object OLrzqt(String str) {
            return this.KWHzl.AEQbTJ(str);
        }
    }

    public static class PendingIntent {
        public StateListAnimator AEQbTJ;
        public String copydefault;

        public PendingIntent(String str, StateListAnimator stateListAnimator) {
            this.copydefault = str;
            this.AEQbTJ = stateListAnimator;
        }
    }

    public static class FragmentManager {
        public boolean EZpvd;
        public String KWHzl;

        public FragmentManager(String str, boolean z) {
            this.KWHzl = str;
            this.EZpvd = z;
        }

        public String toString() {
            return this.KWHzl + "," + this.EZpvd;
        }
    }

    public final void EZpvd() {
        if (gEmmrt()) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
    }

    public final String EZpvd(StateListAnimator stateListAnimator, int i, Dialog dialog, StateListAnimator stateListAnimator2, EnumSet<DTPGflags> enumSet, int i2) {
        if (i == 0) {
            return null;
        }
        PendingIntent pendingIntentEZpvd = EZpvd(stateListAnimator, i, dialog, stateListAnimator2);
        String strEZpvd = EZpvd(pendingIntentEZpvd, stateListAnimator, enumSet, i2);
        while (true) {
            int i3 = dialog.EZpvd;
            if (i3 == 0) {
                return strEZpvd;
            }
            if ((i3 & 24576) == 16384 && (i & 24576) == 24576) {
                pendingIntentEZpvd.copydefault = strEZpvd;
                enumSet = EnumSet.copyOf((EnumSet) enumSet);
                enumSet.add(DTPGflags.FIX_FRACTIONAL_SECONDS);
                strEZpvd = EZpvd(pendingIntentEZpvd, stateListAnimator, enumSet, i2);
                dialog.EZpvd &= -16385;
            } else {
                String strEZpvd2 = EZpvd(EZpvd(stateListAnimator, i3, dialog, stateListAnimator2), stateListAnimator, enumSet, i2);
                int iGEmmrt = gEmmrt(i3 & (~dialog.EZpvd));
                strEZpvd = C7028acB.OLrzqt(AEQbTJ(iGEmmrt), 2, 3, strEZpvd, strEZpvd2, KWHzl(iGEmmrt));
            }
        }
    }

    public final String KWHzl(int i) {
        return "'" + this.hDKMBd[i][EZpvd] + "'";
    }

    public final String AEQbTJ(int i) {
        return this.values[i];
    }

    public final void KWHzl() {
        Fragment fragment = new Fragment();
        int i = 0;
        while (true) {
            String[] strArr = OLrzqt;
            if (i >= strArr.length) {
                return;
            }
            AEQbTJ(String.valueOf(strArr[i]), false, fragment);
            i++;
        }
    }

    public final PendingIntent EZpvd(StateListAnimator stateListAnimator, int i, Dialog dialog, StateListAnimator stateListAnimator2) {
        int iAEQbTJ;
        PendingIntent pendingIntent = new PendingIntent("", null);
        Dialog dialog2 = new Dialog();
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (StateListAnimator stateListAnimator3 : this.getFieldNames.keySet()) {
            if (!stateListAnimator3.equals(stateListAnimator2) && ((iAEQbTJ = stateListAnimator.AEQbTJ(stateListAnimator3, i, dialog2)) < i2 || (iAEQbTJ == i2 && i3 < dialog2.EZpvd))) {
                i3 = dialog2.EZpvd;
                FragmentManager fragmentManager = this.getFieldNames.get(stateListAnimator3);
                pendingIntent.copydefault = fragmentManager.KWHzl;
                if (fragmentManager.EZpvd) {
                    pendingIntent.AEQbTJ = stateListAnimator3;
                } else {
                    pendingIntent.AEQbTJ = null;
                }
                dialog.AEQbTJ(dialog2);
                if (iAEQbTJ == 0) {
                    break;
                }
                i2 = iAEQbTJ;
            }
        }
        return pendingIntent;
    }

    public final String EZpvd(PendingIntent pendingIntent, StateListAnimator stateListAnimator, EnumSet<DTPGflags> enumSet, int i) {
        char c;
        this.getNewProxyInstance.copydefault(pendingIntent.copydefault);
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.getNewProxyInstance.OLrzqt()) {
            if (obj instanceof String) {
                sb.append(this.getNewProxyInstance.OLrzqt((String) obj));
            } else {
                TaskStackBuilder taskStackBuilder = (TaskStackBuilder) obj;
                StringBuilder sb2 = new StringBuilder(taskStackBuilder.toString());
                int iCopydefault = taskStackBuilder.copydefault();
                if (enumSet.contains(DTPGflags.FIX_FRACTIONAL_SECONDS) && iCopydefault == 13) {
                    sb2.append(this.AuCTel);
                    stateListAnimator.OLrzqt.OLrzqt(14, sb2);
                } else if (stateListAnimator.copydefault[iCopydefault] != 0) {
                    char cAEQbTJ = stateListAnimator.OLrzqt.AEQbTJ(iCopydefault);
                    int iEZpvd = stateListAnimator.OLrzqt.EZpvd(iCopydefault);
                    if (cAEQbTJ == 'E' && iEZpvd < 3) {
                        iEZpvd = 3;
                    }
                    StateListAnimator stateListAnimator2 = pendingIntent.AEQbTJ;
                    if ((iCopydefault == 11 && (i & 2048) == 0) || ((iCopydefault == 12 && (i & 4096) == 0) || (iCopydefault == 13 && (i & 8192) == 0))) {
                        iEZpvd = sb2.length();
                    } else if (stateListAnimator2 != null) {
                        int iEZpvd2 = stateListAnimator2.OLrzqt.EZpvd(iCopydefault);
                        boolean zKWHzl = taskStackBuilder.KWHzl();
                        boolean zEZpvd = stateListAnimator2.EZpvd(iCopydefault);
                        if (iEZpvd2 == iEZpvd || ((zKWHzl && !zEZpvd) || (zEZpvd && !zKWHzl))) {
                            iEZpvd = sb2.length();
                        }
                    }
                    char cCharAt = (iCopydefault == 11 || iCopydefault == 3 || iCopydefault == 6 || (iCopydefault == 1 && cAEQbTJ != 'Y')) ? sb2.charAt(0) : cAEQbTJ;
                    if (iCopydefault == 11) {
                        if (enumSet.contains(DTPGflags.SKELETON_USES_CAP_J) || cAEQbTJ == (c = this.uzCIH)) {
                            cCharAt = this.uzCIH;
                        } else if (cAEQbTJ == 'h' && c == 'K') {
                            cCharAt = 'K';
                        } else if (cAEQbTJ == 'H' && c == 'k') {
                            cCharAt = 'k';
                        } else if (cAEQbTJ == 'k' && c == 'H') {
                            cCharAt = 'H';
                        } else if (cAEQbTJ == 'K' && c == 'h') {
                            cCharAt = 'h';
                        }
                    }
                    sb2 = new StringBuilder();
                    while (iEZpvd > 0) {
                        sb2.append(cCharAt);
                        iEZpvd--;
                    }
                }
                sb.append((CharSequence) sb2);
            }
        }
        return sb.toString();
    }

    public static String EZpvd(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 16; i2++) {
            if (((1 << i2) & i) != 0) {
                if (sb.length() != 0) {
                    sb.append(" | ");
                }
                sb.append(AhwBna[i2]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static int KWHzl(String str, boolean z) {
        int length = str.length();
        if (length == 0) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        for (int i = 1; i < length; i++) {
            if (str.charAt(i) != cCharAt) {
                return -1;
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr = isConnected;
            if (i3 >= iArr.length) {
                if (z) {
                    return -1;
                }
                return i2;
            }
            int[] iArr2 = iArr[i3];
            if (iArr2[0] == cCharAt) {
                if (iArr2[3] <= length && iArr2[iArr2.length - 1] >= length) {
                    return i3;
                }
                i2 = i3;
            }
            i3++;
        }
    }

    public static char EZpvd(int i, char c) {
        if (c == 'h' || c == 'K') {
            return 'h';
        }
        int i2 = 0;
        while (true) {
            int[][] iArr = isConnected;
            if (i2 < iArr.length) {
                int[] iArr2 = iArr[i2];
                if (iArr2[1] == i) {
                    return (char) iArr2[0];
                }
                i2++;
            } else {
                throw new IllegalArgumentException("Could not find field " + i);
            }
        }
    }

    public static class AssistContent {
        public byte[] EZpvd;
        public byte[] OLrzqt;

        private AssistContent() {
            this.OLrzqt = new byte[16];
            this.EZpvd = new byte[16];
        }

        public void OLrzqt() {
            Arrays.fill(this.OLrzqt, (byte) 0);
            Arrays.fill(this.EZpvd, (byte) 0);
        }

        public void KWHzl(int i) {
            this.OLrzqt[i] = 0;
            this.EZpvd[i] = 0;
        }

        public char AEQbTJ(int i) {
            return (char) this.OLrzqt[i];
        }

        public int EZpvd(int i) {
            return this.EZpvd[i];
        }

        public void AEQbTJ(int i, String str) {
            for (char c : str.toCharArray()) {
            }
            EZpvd(i, str.charAt(0), str.length());
        }

        public void EZpvd(int i, char c, int i2) {
            this.OLrzqt[i] = (byte) c;
            this.EZpvd[i] = (byte) i2;
        }

        public boolean copydefault(int i) {
            return this.EZpvd[i] == 0;
        }

        public String toString() {
            return EZpvd(new StringBuilder(), false, false).toString();
        }

        public String EZpvd(boolean z) {
            return EZpvd(new StringBuilder(), false, z).toString();
        }

        public final StringBuilder EZpvd(StringBuilder sb, boolean z, boolean z2) {
            for (int i = 0; i < 16; i++) {
                if (!z2 || i != 10) {
                    EZpvd(i, sb, z);
                }
            }
            return sb;
        }

        public StringBuilder OLrzqt(int i, StringBuilder sb) {
            return EZpvd(i, sb, false);
        }

        public final StringBuilder EZpvd(int i, StringBuilder sb, boolean z) {
            char cEZpvd = (char) this.OLrzqt[i];
            byte b = this.EZpvd[i];
            if (z) {
                cEZpvd = DateTimePatternGenerator.EZpvd(i, cEZpvd);
            }
            for (int i2 = 0; i2 < b; i2++) {
                sb.append(cEZpvd);
            }
            return sb;
        }

        public int KWHzl(AssistContent assistContent) {
            for (int i = 0; i < 16; i++) {
                int i2 = this.OLrzqt[i] - assistContent.OLrzqt[i];
                if (i2 != 0) {
                    return i2;
                }
                int i3 = this.EZpvd[i] - assistContent.EZpvd[i];
                if (i3 != 0) {
                    return i3;
                }
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj != null && (obj instanceof AssistContent) && KWHzl((AssistContent) obj) == 0);
        }

        public int hashCode() {
            return Arrays.hashCode(this.OLrzqt) ^ Arrays.hashCode(this.EZpvd);
        }
    }

    public static class StateListAnimator implements Comparable<StateListAnimator> {
        public boolean AEQbTJ;
        public AssistContent EZpvd;
        public AssistContent OLrzqt;
        public int[] copydefault;

        private StateListAnimator() {
            this.copydefault = new int[16];
            this.OLrzqt = new AssistContent();
            this.EZpvd = new AssistContent();
            this.AEQbTJ = false;
        }

        public boolean EZpvd(int i) {
            return this.copydefault[i] > 0;
        }

        public String toString() {
            return this.OLrzqt.EZpvd(this.AEQbTJ);
        }

        public String OLrzqt() {
            return this.EZpvd.EZpvd(this.AEQbTJ);
        }

        public StateListAnimator OLrzqt(String str, LoaderManager loaderManager, boolean z) {
            String string;
            char cAEQbTJ;
            Arrays.fill(this.copydefault, 0);
            this.OLrzqt.OLrzqt();
            this.EZpvd.OLrzqt();
            this.AEQbTJ = false;
            loaderManager.copydefault(str);
            Iterator<Object> it = loaderManager.OLrzqt().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof TaskStackBuilder) {
                        TaskStackBuilder taskStackBuilder = (TaskStackBuilder) next;
                        string = taskStackBuilder.toString();
                        int[] iArr = DateTimePatternGenerator.isConnected[taskStackBuilder.OLrzqt()];
                        int i = iArr[1];
                        if (!this.OLrzqt.copydefault(i)) {
                            cAEQbTJ = this.OLrzqt.AEQbTJ(i);
                            char cCharAt = string.charAt(0);
                            if (!z && (cAEQbTJ != 'r' || cCharAt != 'U')) {
                                if (cAEQbTJ != 'U' || cCharAt != 'r') {
                                    break;
                                }
                            }
                        } else {
                            this.OLrzqt.AEQbTJ(i, string);
                            char c = (char) iArr[0];
                            this.EZpvd.EZpvd(i, c, "GEzvQ".indexOf(c) < 0 ? iArr[3] : 1);
                            int length = iArr[2];
                            if (length > 0) {
                                length += string.length();
                            }
                            this.copydefault[i] = length;
                        }
                    }
                } else {
                    if (!this.OLrzqt.copydefault(12) && !this.OLrzqt.copydefault(14) && this.OLrzqt.copydefault(13)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= DateTimePatternGenerator.isConnected.length) {
                                break;
                            }
                            int[] iArr2 = DateTimePatternGenerator.isConnected[i2];
                            if (iArr2[1] == 13) {
                                this.OLrzqt.EZpvd(13, (char) iArr2[0], iArr2[3]);
                                this.EZpvd.EZpvd(13, (char) iArr2[0], iArr2[3]);
                                int i3 = iArr2[2];
                                int[] iArr3 = this.copydefault;
                                if (i3 > 0) {
                                    i3++;
                                }
                                iArr3[13] = i3;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (!this.OLrzqt.copydefault(11)) {
                        if (this.OLrzqt.AEQbTJ(11) == 'h' || this.OLrzqt.AEQbTJ(11) == 'K') {
                            if (this.OLrzqt.copydefault(10)) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= DateTimePatternGenerator.isConnected.length) {
                                        break;
                                    }
                                    int[] iArr4 = DateTimePatternGenerator.isConnected[i4];
                                    if (iArr4[1] == 10) {
                                        this.OLrzqt.EZpvd(10, (char) iArr4[0], iArr4[3]);
                                        this.EZpvd.EZpvd(10, (char) iArr4[0], iArr4[3]);
                                        this.copydefault[10] = iArr4[2];
                                        this.AEQbTJ = true;
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        } else if (!this.OLrzqt.copydefault(10)) {
                            this.OLrzqt.KWHzl(10);
                            this.EZpvd.KWHzl(10);
                            this.copydefault[10] = 0;
                        }
                    }
                    return this;
                }
            }
            throw new IllegalArgumentException("Conflicting fields:\t" + cAEQbTJ + ", " + string + "\t in " + str);
        }

        public int copydefault() {
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr = this.copydefault;
                if (i >= iArr.length) {
                    return i2;
                }
                if (iArr[i] != 0) {
                    i2 |= 1 << i;
                }
                i++;
            }
        }

        public int AEQbTJ(StateListAnimator stateListAnimator, int i, Dialog dialog) {
            dialog.OLrzqt();
            int iAbs = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                int i3 = ((1 << i2) & i) == 0 ? 0 : this.copydefault[i2];
                int i4 = stateListAnimator.copydefault[i2];
                if (i3 != i4) {
                    if (i3 == 0) {
                        iAbs += 65536;
                        dialog.AEQbTJ(i2);
                    } else if (i4 == 0) {
                        iAbs += 4096;
                        dialog.copydefault(i2);
                    } else {
                        iAbs += Math.abs(i3 - i4);
                    }
                }
            }
            return iAbs;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public int compareTo(StateListAnimator stateListAnimator) {
            int iKWHzl = this.OLrzqt.KWHzl(stateListAnimator.OLrzqt);
            if (iKWHzl > 0) {
                return -1;
            }
            return iKWHzl < 0 ? 1 : 0;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj != null && (obj instanceof StateListAnimator) && this.OLrzqt.equals(((StateListAnimator) obj).OLrzqt));
        }

        public int hashCode() {
            return this.OLrzqt.hashCode();
        }
    }

    public static class Dialog {
        public int EZpvd;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ(int i) {
            this.copydefault = (1 << i) | this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt() {
            this.copydefault = 0;
            this.EZpvd = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault(int i) {
            this.EZpvd = (1 << i) | this.EZpvd;
        }

        private Dialog() {
        }

        public void AEQbTJ(Dialog dialog) {
            this.EZpvd = dialog.EZpvd;
            this.copydefault = dialog.copydefault;
        }

        public String toString() {
            return "missingFieldMask: " + DateTimePatternGenerator.EZpvd(this.EZpvd) + ", extraFieldMask: " + DateTimePatternGenerator.EZpvd(this.copydefault);
        }
    }
}
