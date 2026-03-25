package com.ibm.icu.impl;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ULocale;
import java.util.HashMap;
import java.util.Map;
import o.C7043acQ;

/* JADX INFO: loaded from: classes3.dex */
public final class DayPeriodRules {
    public static final Activity OLrzqt = AEQbTJ();
    public DayPeriod[] EZpvd;
    public boolean KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.copydefault;
    }

    public enum DayPeriod {
        MIDNIGHT,
        NOON,
        MORNING1,
        AFTERNOON1,
        EVENING1,
        NIGHT1,
        MORNING2,
        AFTERNOON2,
        EVENING2,
        NIGHT2,
        AM,
        PM;

        public static DayPeriod[] VALUES = values();

        /* JADX INFO: Access modifiers changed from: private */
        public static DayPeriod fromStringOrNull(CharSequence charSequence) {
            if ("midnight".contentEquals(charSequence)) {
                return MIDNIGHT;
            }
            if ("noon".contentEquals(charSequence)) {
                return NOON;
            }
            if ("morning1".contentEquals(charSequence)) {
                return MORNING1;
            }
            if ("afternoon1".contentEquals(charSequence)) {
                return AFTERNOON1;
            }
            if ("evening1".contentEquals(charSequence)) {
                return EVENING1;
            }
            if ("night1".contentEquals(charSequence)) {
                return NIGHT1;
            }
            if ("morning2".contentEquals(charSequence)) {
                return MORNING2;
            }
            if ("afternoon2".contentEquals(charSequence)) {
                return AFTERNOON2;
            }
            if ("evening2".contentEquals(charSequence)) {
                return EVENING2;
            }
            if ("night2".contentEquals(charSequence)) {
                return NIGHT2;
            }
            if ("am".contentEquals(charSequence)) {
                return AM;
            }
            if ("pm".contentEquals(charSequence)) {
                return PM;
            }
            return null;
        }
    }

    public enum CutoffType {
        BEFORE,
        AFTER,
        FROM,
        AT;

        /* JADX INFO: Access modifiers changed from: private */
        public static CutoffType fromStringOrNull(CharSequence charSequence) {
            if ("from".contentEquals(charSequence)) {
                return FROM;
            }
            if (TtmlNode.RUBY_BEFORE.contentEquals(charSequence)) {
                return BEFORE;
            }
            if (TtmlNode.RUBY_AFTER.contentEquals(charSequence)) {
                return AFTER;
            }
            if ("at".contentEquals(charSequence)) {
                return AT;
            }
            return null;
        }
    }

    public static final class Activity {
        public DayPeriodRules[] EZpvd;
        public Map<String, Integer> KWHzl;
        public int OLrzqt;

        private Activity() {
            this.KWHzl = new HashMap();
            this.OLrzqt = -1;
        }
    }

    public static final class TaskDescription extends C7043acQ.ActionBar {
        public CutoffType AEQbTJ;
        public int[] EZpvd;
        public Activity KWHzl;
        public DayPeriod OLrzqt;
        public int copydefault;

        public TaskDescription(Activity activity) {
            this.EZpvd = new int[25];
            this.KWHzl = activity;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (application.copydefault("locales")) {
                    C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                    for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                        this.KWHzl.KWHzl.put(application.toString(), Integer.valueOf(DayPeriodRules.EZpvd(taskDescription.djBIcL())));
                    }
                } else if (application.copydefault("rules")) {
                    copydefault(taskDescription.valueOf(), application, taskDescription);
                }
            }
        }

        public final void copydefault(C7043acQ.StateListAnimator stateListAnimator, C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            for (int i = 0; stateListAnimator.AEQbTJ(i, application, taskDescription); i++) {
                int iEZpvd = DayPeriodRules.EZpvd(application.toString());
                this.copydefault = iEZpvd;
                this.KWHzl.EZpvd[iEZpvd] = new DayPeriodRules();
                C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
                for (int i2 = 0; stateListAnimatorValueOf.AEQbTJ(i2, application, taskDescription); i2++) {
                    DayPeriod dayPeriodFromStringOrNull = DayPeriod.fromStringOrNull(application);
                    this.OLrzqt = dayPeriodFromStringOrNull;
                    if (dayPeriodFromStringOrNull == null) {
                        throw new ICUException("Unknown day period in data.");
                    }
                    C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                    for (int i3 = 0; stateListAnimatorValueOf2.AEQbTJ(i3, application, taskDescription); i3++) {
                        if (taskDescription.AhwBna() != 0) {
                            this.AEQbTJ = CutoffType.fromStringOrNull(application);
                            C7043acQ.Activity activityOLrzqt = taskDescription.OLrzqt();
                            int iKWHzl = activityOLrzqt.KWHzl();
                            for (int i4 = 0; i4 < iKWHzl; i4++) {
                                activityOLrzqt.copydefault(i4, taskDescription);
                                OLrzqt(this.AEQbTJ, taskDescription.djBIcL());
                            }
                        } else {
                            OLrzqt(CutoffType.fromStringOrNull(application), taskDescription.djBIcL());
                        }
                    }
                    OLrzqt();
                    int i5 = 0;
                    while (true) {
                        int[] iArr = this.EZpvd;
                        if (i5 < iArr.length) {
                            iArr[i5] = 0;
                            i5++;
                        }
                    }
                }
                for (DayPeriod dayPeriod : this.KWHzl.EZpvd[this.copydefault].EZpvd) {
                    if (dayPeriod == null) {
                        throw new ICUException("Rules in data don't cover all 24 hours (they should).");
                    }
                }
            }
        }

        public final void OLrzqt(CutoffType cutoffType, String str) {
            if (cutoffType == null) {
                throw new ICUException("Cutoff type not recognized.");
            }
            int iEZpvd = EZpvd(str);
            int[] iArr = this.EZpvd;
            iArr[iEZpvd] = (1 << cutoffType.ordinal()) | iArr[iEZpvd];
        }

        public final void OLrzqt() {
            DayPeriodRules dayPeriodRules = this.KWHzl.EZpvd[this.copydefault];
            for (int i = 0; i <= 24; i++) {
                if ((this.EZpvd[i] & (1 << CutoffType.AT.ordinal())) > 0) {
                    if (i == 0 && this.OLrzqt == DayPeriod.MIDNIGHT) {
                        dayPeriodRules.KWHzl = true;
                    } else if (i == 12 && this.OLrzqt == DayPeriod.NOON) {
                        dayPeriodRules.copydefault = true;
                    } else {
                        throw new ICUException("AT cutoff must only be set for 0:00 or 12:00.");
                    }
                }
                if ((this.EZpvd[i] & (1 << CutoffType.FROM.ordinal())) > 0 || (this.EZpvd[i] & (1 << CutoffType.AFTER.ordinal())) > 0) {
                    int i2 = i + 1;
                    while (i2 != i) {
                        if (i2 == 25) {
                            i2 = 0;
                        }
                        if ((this.EZpvd[i2] & (1 << CutoffType.BEFORE.ordinal())) > 0) {
                            dayPeriodRules.KWHzl(i, i2, this.OLrzqt);
                        } else {
                            i2++;
                        }
                    }
                    throw new ICUException("FROM/AFTER cutoffs must have a matching BEFORE cutoff.");
                }
            }
        }

        public static int EZpvd(String str) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf < 0 || !str.substring(iIndexOf).equals(":00")) {
                throw new ICUException("Cutoff time must end in \":00\".");
            }
            String strSubstring = str.substring(0, iIndexOf);
            if (iIndexOf != 1 && iIndexOf != 2) {
                throw new ICUException("Cutoff time must begin with h: or hh:");
            }
            int i = Integer.parseInt(strSubstring);
            if (i < 0 || i > 24) {
                throw new ICUException("Cutoff hour must be between 0 and 24, inclusive.");
            }
            return i;
        }
    }

    public static class Application extends C7043acQ.ActionBar {
        public Activity copydefault;

        public Application(Activity activity) {
            this.copydefault = activity;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                int iEZpvd = DayPeriodRules.EZpvd(application.toString());
                Activity activity = this.copydefault;
                if (iEZpvd > activity.OLrzqt) {
                    activity.OLrzqt = iEZpvd;
                }
            }
        }
    }

    private DayPeriodRules() {
        this.KWHzl = false;
        this.copydefault = false;
        this.EZpvd = new DayPeriod[24];
    }

    public static DayPeriodRules copydefault(ULocale uLocale) {
        String baseName = uLocale.getBaseName();
        if (baseName.isEmpty()) {
            baseName = "root";
        }
        Integer num = null;
        while (num == null) {
            num = OLrzqt.KWHzl.get(baseName);
            if (num != null) {
                break;
            }
            baseName = ULocale.getFallback(baseName);
            if (baseName.isEmpty()) {
                break;
            }
        }
        if (num != null) {
            Activity activity = OLrzqt;
            if (activity.EZpvd[num.intValue()] != null) {
                return activity.EZpvd[num.intValue()];
            }
        }
        return null;
    }

    public double KWHzl(DayPeriod dayPeriod) {
        int iEZpvd = EZpvd(dayPeriod);
        int iCopydefault = copydefault(dayPeriod);
        double d = ((double) (iEZpvd + iCopydefault)) / 2.0d;
        if (iEZpvd <= iCopydefault) {
            return d;
        }
        double d2 = d + 12.0d;
        return d2 >= 24.0d ? d2 - 24.0d : d2;
    }

    public static Activity AEQbTJ() {
        Activity activity = new Activity();
        ICUResourceBundle iCUResourceBundleCopydefault = ICUResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "dayPeriods", ICUResourceBundle.AEQbTJ, true);
        iCUResourceBundleCopydefault.copydefault("rules", new Application(activity));
        activity.EZpvd = new DayPeriodRules[activity.OLrzqt + 1];
        iCUResourceBundleCopydefault.copydefault("", new TaskDescription(activity));
        return activity;
    }

    public final int EZpvd(DayPeriod dayPeriod) throws IllegalArgumentException {
        if (dayPeriod == DayPeriod.MIDNIGHT) {
            return 0;
        }
        if (dayPeriod == DayPeriod.NOON) {
            return 12;
        }
        DayPeriod[] dayPeriodArr = this.EZpvd;
        if (dayPeriodArr[0] == dayPeriod && dayPeriodArr[23] == dayPeriod) {
            for (int i = 22; i >= 1; i--) {
                if (this.EZpvd[i] != dayPeriod) {
                    return i + 1;
                }
            }
        } else {
            for (int i2 = 0; i2 <= 23; i2++) {
                if (this.EZpvd[i2] == dayPeriod) {
                    return i2;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final int copydefault(DayPeriod dayPeriod) {
        if (dayPeriod == DayPeriod.MIDNIGHT) {
            return 0;
        }
        if (dayPeriod == DayPeriod.NOON) {
            return 12;
        }
        DayPeriod[] dayPeriodArr = this.EZpvd;
        if (dayPeriodArr[0] == dayPeriod && dayPeriodArr[23] == dayPeriod) {
            for (int i = 1; i <= 22; i++) {
                if (this.EZpvd[i] != dayPeriod) {
                    return i;
                }
            }
        } else {
            for (int i2 = 23; i2 >= 0; i2--) {
                if (this.EZpvd[i2] == dayPeriod) {
                    return i2 + 1;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public DayPeriod AEQbTJ(int i) {
        return this.EZpvd[i];
    }

    public final void KWHzl(int i, int i2, DayPeriod dayPeriod) {
        while (i != i2) {
            if (i == 24) {
                i = 0;
            }
            this.EZpvd[i] = dayPeriod;
            i++;
        }
    }

    public static int EZpvd(String str) {
        if (!str.startsWith("set")) {
            throw new ICUException("Set number should start with \"set\".");
        }
        return Integer.parseInt(str.substring(3));
    }
}
