package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import com.ibm.icu.util.UResourceTypeMismatchException;
import java.util.Collections;
import o.C7043acQ;

/* JADX INFO: renamed from: o.aeZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7158aeZ {
    public static final C7158aeZ EZpvd = new C7158aeZ();
    public static volatile java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public StandardPlural[] OLrzqt;
    public int copydefault = 0;

    /* JADX INFO: renamed from: o.aeZ$Activity */
    public static final class Activity extends C7043acQ.ActionBar {
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;

        public Activity(java.util.Map<java.lang.String, java.lang.String> map) {
            this.OLrzqt = map;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                this.OLrzqt.put(application.toString(), taskDescription.toString());
            }
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> copydefault() {
        java.util.Map<java.lang.String, java.lang.String> mapUnmodifiableMap = KWHzl;
        if (mapUnmodifiableMap == null) {
            java.util.HashMap map = new java.util.HashMap();
            ((ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "pluralRanges")).copydefault("locales", new Activity(map));
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        }
        if (KWHzl == null) {
            KWHzl = mapUnmodifiableMap;
        }
        return KWHzl;
    }

    /* JADX INFO: renamed from: o.aeZ$TaskDescription */
    public static final class TaskDescription extends C7043acQ.ActionBar {
        public C7158aeZ KWHzl;

        public TaskDescription(C7158aeZ c7158aeZ) {
            this.KWHzl = c7158aeZ;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.Activity activityOLrzqt = taskDescription.OLrzqt();
            this.KWHzl.AEQbTJ(activityOLrzqt.KWHzl());
            for (int i = 0; activityOLrzqt.copydefault(i, taskDescription); i++) {
                C7043acQ.Activity activityOLrzqt2 = taskDescription.OLrzqt();
                if (activityOLrzqt2.KWHzl() != 3) {
                    throw new UResourceTypeMismatchException("Expected 3 elements in pluralRanges.txt array");
                }
                activityOLrzqt2.copydefault(0, taskDescription);
                StandardPlural standardPluralFromString = StandardPlural.fromString(taskDescription.djBIcL());
                activityOLrzqt2.copydefault(1, taskDescription);
                StandardPlural standardPluralFromString2 = StandardPlural.fromString(taskDescription.djBIcL());
                activityOLrzqt2.copydefault(2, taskDescription);
                this.KWHzl.KWHzl(standardPluralFromString, standardPluralFromString2, StandardPlural.fromString(taskDescription.djBIcL()));
            }
        }
    }

    public static void AEQbTJ(java.lang.String str, C7158aeZ c7158aeZ) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "pluralRanges");
        sb.setLength(0);
        sb.append("rules/");
        sb.append(str);
        iCUResourceBundle.copydefault(sb.toString(), new TaskDescription(c7158aeZ));
    }

    public static C7158aeZ KWHzl(java.lang.String str) {
        C7158aeZ c7158aeZ = new C7158aeZ();
        if (str == null) {
            return EZpvd;
        }
        AEQbTJ(str, c7158aeZ);
        return c7158aeZ;
    }

    public static java.lang.String OLrzqt(ULocale uLocale) {
        return copydefault().get(uLocale.getLanguage());
    }

    private C7158aeZ() {
    }

    public final void KWHzl(StandardPlural standardPlural, StandardPlural standardPlural2, StandardPlural standardPlural3) {
        StandardPlural[] standardPluralArr = this.OLrzqt;
        int i = this.copydefault;
        int i2 = i * 3;
        standardPluralArr[i2] = standardPlural;
        standardPluralArr[i2 + 1] = standardPlural2;
        standardPluralArr[i2 + 2] = standardPlural3;
        this.copydefault = i + 1;
    }

    public final void AEQbTJ(int i) {
        this.OLrzqt = new StandardPlural[i * 3];
    }

    public StandardPlural OLrzqt(StandardPlural standardPlural, StandardPlural standardPlural2) {
        for (int i = 0; i < this.copydefault; i++) {
            StandardPlural[] standardPluralArr = this.OLrzqt;
            int i2 = i * 3;
            if (standardPlural == standardPluralArr[i2] && standardPlural2 == standardPluralArr[i2 + 1]) {
                return standardPluralArr[i2 + 2];
            }
        }
        return StandardPlural.OTHER;
    }
}
