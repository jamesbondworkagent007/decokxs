package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.UResourceBundle;
import o.C7043acQ;
import o.C7217aff;

/* JADX INFO: renamed from: o.afe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7216afe {
    public static volatile java.lang.String[] copydefault;
    public C7218afg KWHzl = new C7218afg();
    public C7217aff EZpvd = new C7217aff();
    public ActionBar AEQbTJ = new ActionBar();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7218afg KWHzl() {
        return this.KWHzl;
    }

    public static java.lang.String[] OLrzqt() {
        if (copydefault != null) {
            return copydefault;
        }
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "units");
        TaskDescription taskDescription = new TaskDescription();
        iCUResourceBundle.copydefault("convertUnits", taskDescription);
        copydefault = taskDescription.AEQbTJ;
        return copydefault;
    }

    public java.lang.String OLrzqt(MeasureUnitImpl measureUnitImpl) {
        java.lang.String identifier = MeasureUnit.fromMeasureUnitImpl(KWHzl().copydefault(measureUnitImpl)).getIdentifier();
        return identifier.equals("meter-per-cubic-meter") ? "consumption-inverse" : this.AEQbTJ.KWHzl.get(identifier);
    }

    public C7217aff.Application[] AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.EZpvd.copydefault(str, str2, str3);
    }

    /* JADX INFO: renamed from: o.afe$TaskDescription */
    public static class TaskDescription extends C7043acQ.ActionBar {
        public java.lang.String[] AEQbTJ = null;

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (!application.toString().equals("kilogram")) {
                    arrayList.add(application.toString());
                }
            }
            this.AEQbTJ = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        }
    }

    /* JADX INFO: renamed from: o.afe$ActionBar */
    public static class ActionBar {
        public java.util.HashMap<java.lang.String, java.lang.String> KWHzl;

        public ActionBar() {
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "units");
            Activity activity = new Activity();
            iCUResourceBundle.copydefault("unitQuantities", activity);
            this.KWHzl = activity.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.afe$Activity */
    public static class Activity extends C7043acQ.ActionBar {
        public java.util.HashMap<java.lang.String, java.lang.String> KWHzl = new java.util.HashMap<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ() {
            return this.KWHzl;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                this.KWHzl.put(application.toString(), taskDescription.toString());
            }
        }
    }
}
