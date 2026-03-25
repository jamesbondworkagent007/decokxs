package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.MissingResourceException;
import java.util.TreeMap;
import o.C7043acQ;

/* JADX INFO: renamed from: o.abL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7011abL {
    public static java.lang.String copydefault(ULocale uLocale) {
        java.lang.String keywordValue = uLocale.getKeywordValue("calendar");
        if (keywordValue != null) {
            return keywordValue.toLowerCase(java.util.Locale.ROOT);
        }
        ULocale uLocaleCreateCanonical = ULocale.createCanonical(uLocale.toString());
        java.lang.String keywordValue2 = uLocaleCreateCanonical.getKeywordValue("calendar");
        if (keywordValue2 != null) {
            return keywordValue2;
        }
        return Activity.OLrzqt.copydefault(ULocale.getRegionForSupplementalData(uLocaleCreateCanonical, true));
    }

    /* JADX INFO: renamed from: o.abL$Activity */
    public static final class Activity extends C7043acQ.ActionBar {
        public static final Activity OLrzqt = new Activity();
        public java.util.Map<java.lang.String, java.lang.String> AEQbTJ = new TreeMap();

        public Activity() {
            try {
                ((ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "supplementalData")).copydefault("calendarPreferenceData", this);
            } catch (MissingResourceException unused) {
            }
        }

        public java.lang.String copydefault(java.lang.String str) {
            java.lang.String str2 = this.AEQbTJ.get(str);
            return str2 == null ? "gregorian" : str2;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (taskDescription.OLrzqt().copydefault(0, taskDescription)) {
                    java.lang.String strDjBIcL = taskDescription.djBIcL();
                    if (!strDjBIcL.equals("gregorian")) {
                        this.AEQbTJ.put(application.toString(), strDjBIcL);
                    }
                }
            }
        }
    }
}
