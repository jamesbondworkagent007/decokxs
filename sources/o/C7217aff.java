package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.UResourceBundle;
import java.math.BigDecimal;
import o.C7043acQ;

/* JADX INFO: renamed from: o.aff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7217aff {
    public java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, Application[]>> copydefault;

    public C7217aff() {
        this.copydefault = new java.util.HashMap<>();
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "units");
        StateListAnimator stateListAnimator = new StateListAnimator();
        iCUResourceBundle.copydefault("unitPreferenceData", stateListAnimator);
        this.copydefault = stateListAnimator.EZpvd();
    }

    public static java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return str + "++" + str2;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
    public static java.lang.String[] copydefault(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            if (str.charAt(length) == '-') {
                arrayList.add(str.substring(0, length));
            }
        }
        if (!str.equals("default")) {
            arrayList.add("default");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public Application[] copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Application[] applicationArrAEQbTJ = null;
        for (java.lang.String str4 : copydefault(str2)) {
            applicationArrAEQbTJ = AEQbTJ(str, str4, str3);
            if (applicationArrAEQbTJ != null) {
                break;
            }
        }
        return applicationArrAEQbTJ;
    }

    public final Application[] AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strEZpvd = EZpvd(str, str2);
        if (!this.copydefault.containsKey(strEZpvd)) {
            return null;
        }
        java.util.HashMap<java.lang.String, Application[]> map = this.copydefault.get(strEZpvd);
        if (map.containsKey(str3)) {
            return map.get(str3);
        }
        return map.get("001");
    }

    /* JADX INFO: renamed from: o.aff$Application */
    public static class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final BigDecimal copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public Application(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.AEQbTJ = str;
            this.copydefault = new BigDecimal(str2);
            this.KWHzl = str3;
        }
    }

    /* JADX INFO: renamed from: o.aff$StateListAnimator */
    public static class StateListAnimator extends C7043acQ.ActionBar {
        public java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, Application[]>> EZpvd = new java.util.HashMap<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, Application[]>> EZpvd() {
            return this.EZpvd;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.Application application2 = application;
            C7043acQ.TaskDescription taskDescription2 = taskDescription;
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            int i = 0;
            while (stateListAnimatorValueOf.AEQbTJ(i, application2, taskDescription2)) {
                java.lang.String string = application.toString();
                C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                int i2 = 0;
                while (stateListAnimatorValueOf2.AEQbTJ(i2, application2, taskDescription2)) {
                    java.lang.String string2 = application.toString();
                    C7043acQ.StateListAnimator stateListAnimatorValueOf3 = taskDescription.valueOf();
                    int i3 = 0;
                    while (stateListAnimatorValueOf3.AEQbTJ(i3, application2, taskDescription2)) {
                        java.lang.String string3 = application.toString();
                        C7043acQ.Activity activityOLrzqt = taskDescription.OLrzqt();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int i4 = 0;
                        while (activityOLrzqt.copydefault(i4, taskDescription2)) {
                            C7043acQ.StateListAnimator stateListAnimatorValueOf4 = taskDescription.valueOf();
                            java.lang.String strDjBIcL = null;
                            C7043acQ.StateListAnimator stateListAnimator = stateListAnimatorValueOf;
                            java.lang.String strDjBIcL2 = "1";
                            C7043acQ.StateListAnimator stateListAnimator2 = stateListAnimatorValueOf2;
                            java.lang.String strDjBIcL3 = "";
                            C7043acQ.StateListAnimator stateListAnimator3 = stateListAnimatorValueOf3;
                            int i5 = 0;
                            while (stateListAnimatorValueOf4.AEQbTJ(i5, application2, taskDescription2)) {
                                java.lang.String string4 = application.toString();
                                if ("unit".equals(string4)) {
                                    strDjBIcL = taskDescription.djBIcL();
                                } else if ("geq".equals(string4)) {
                                    strDjBIcL2 = taskDescription.djBIcL();
                                } else if ("skeleton".equals(string4)) {
                                    strDjBIcL3 = taskDescription.djBIcL();
                                }
                                i5++;
                                application2 = application;
                                taskDescription2 = taskDescription;
                            }
                            arrayList.add(new Application(strDjBIcL, strDjBIcL2, strDjBIcL3));
                            i4++;
                            application2 = application;
                            taskDescription2 = taskDescription;
                            stateListAnimatorValueOf = stateListAnimator;
                            stateListAnimatorValueOf2 = stateListAnimator2;
                            stateListAnimatorValueOf3 = stateListAnimator3;
                        }
                        OLrzqt(string, string2, string3, (Application[]) arrayList.toArray(new Application[0]));
                        i3++;
                        application2 = application;
                        taskDescription2 = taskDescription;
                        stateListAnimatorValueOf = stateListAnimatorValueOf;
                    }
                    i2++;
                    application2 = application;
                    taskDescription2 = taskDescription;
                    stateListAnimatorValueOf = stateListAnimatorValueOf;
                }
                i++;
                application2 = application;
                taskDescription2 = taskDescription;
                stateListAnimatorValueOf = stateListAnimatorValueOf;
            }
        }

        public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, Application[] applicationArr) {
            java.util.HashMap<java.lang.String, Application[]> map;
            java.lang.String strEZpvd = C7217aff.EZpvd(str, str2);
            if (this.EZpvd.containsKey(strEZpvd)) {
                map = this.EZpvd.get(strEZpvd);
            } else {
                java.util.HashMap<java.lang.String, Application[]> map2 = new java.util.HashMap<>();
                this.EZpvd.put(strEZpvd, map2);
                map = map2;
            }
            map.put(str3, applicationArr);
        }
    }
}
