package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.impl.units.UnitConverter;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.UResourceBundle;
import java.math.BigDecimal;
import java.math.MathContext;
import o.C7043acQ;

/* JADX INFO: renamed from: o.afg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7218afg {
    public java.util.HashMap<java.lang.String, TaskDescription> copydefault;

    public C7218afg() {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.copydefault("com/ibm/icu/impl/data/icudt68b", "units");
        Application application = new Application();
        iCUResourceBundle.copydefault("convertUnits", application);
        this.copydefault = application.AEQbTJ();
    }

    public final UnitConverter.ActionBar copydefault(C7215afd c7215afd) {
        return UnitConverter.ActionBar.KWHzl(this.copydefault.get(c7215afd.AYXKKw()).EZpvd()).OLrzqt(c7215afd.copydefault()).EZpvd(c7215afd.EZpvd());
    }

    public UnitConverter.ActionBar EZpvd(MeasureUnitImpl measureUnitImpl) {
        UnitConverter.ActionBar actionBar = new UnitConverter.ActionBar();
        java.util.Iterator<C7215afd> it = measureUnitImpl.gEmmrt().iterator();
        while (it.hasNext()) {
            actionBar = actionBar.copydefault(copydefault(it.next()));
        }
        return actionBar;
    }

    public BigDecimal copydefault(MeasureUnitImpl measureUnitImpl, MeasureUnitImpl measureUnitImpl2, UnitConverter.ActionBar actionBar, UnitConverter.ActionBar actionBar2, UnitConverter.Convertibility convertibility) {
        if (convertibility != UnitConverter.Convertibility.CONVERTIBLE) {
            return BigDecimal.valueOf(0L);
        }
        if (!OLrzqt(measureUnitImpl) || !OLrzqt(measureUnitImpl2)) {
            return BigDecimal.valueOf(0L);
        }
        return this.copydefault.get(measureUnitImpl.gEmmrt().get(0).AYXKKw()).KWHzl().subtract(this.copydefault.get(measureUnitImpl2.gEmmrt().get(0).AYXKKw()).KWHzl()).divide(actionBar2.KWHzl(), MathContext.DECIMAL128);
    }

    public MeasureUnitImpl copydefault(MeasureUnitImpl measureUnitImpl) {
        java.util.ArrayList<C7215afd> arrayListKWHzl = KWHzl(measureUnitImpl);
        MeasureUnitImpl measureUnitImpl2 = new MeasureUnitImpl();
        java.util.Iterator<C7215afd> it = arrayListKWHzl.iterator();
        while (it.hasNext()) {
            measureUnitImpl2.EZpvd(it.next());
        }
        return measureUnitImpl2;
    }

    public java.util.ArrayList<C7215afd> KWHzl(MeasureUnitImpl measureUnitImpl) {
        java.util.ArrayList<C7215afd> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<C7215afd> it = measureUnitImpl.gEmmrt().iterator();
        while (it.hasNext()) {
            arrayList.addAll(AEQbTJ(it.next()));
        }
        return arrayList;
    }

    public java.util.ArrayList<C7215afd> AEQbTJ(C7215afd c7215afd) {
        MeasureUnitImpl measureUnitImplEZpvd = MeasureUnitImpl.UnitsParser.EZpvd(this.copydefault.get(c7215afd.AYXKKw()).AEQbTJ());
        measureUnitImplEZpvd.EZpvd(c7215afd.EZpvd());
        return measureUnitImplEZpvd.gEmmrt();
    }

    public final boolean OLrzqt(MeasureUnitImpl measureUnitImpl) {
        if (measureUnitImpl.OLrzqt() != MeasureUnit.Complexity.SINGLE) {
            return false;
        }
        C7215afd c7215afd = measureUnitImpl.gEmmrt().get(0);
        return c7215afd.copydefault() == MeasureUnit.SIPrefix.ONE && c7215afd.EZpvd() == 1;
    }

    /* JADX INFO: renamed from: o.afg$Application */
    public static class Application extends C7043acQ.ActionBar {
        public java.util.HashMap<java.lang.String, TaskDescription> OLrzqt = new java.util.HashMap<>();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.HashMap<java.lang.String, TaskDescription> AEQbTJ() {
            return this.OLrzqt;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                java.lang.String string = application.toString();
                C7043acQ.StateListAnimator stateListAnimatorValueOf2 = taskDescription.valueOf();
                java.lang.String str = null;
                java.lang.String str2 = "0";
                java.lang.String str3 = null;
                for (int i2 = 0; stateListAnimatorValueOf2.AEQbTJ(i2, application, taskDescription); i2++) {
                    java.lang.String string2 = application.toString();
                    java.lang.String strReplaceAll = taskDescription.toString().replaceAll(" ", "");
                    if (TypedValues.AttributesType.S_TARGET.equals(string2)) {
                        str = strReplaceAll;
                    } else if ("factor".equals(string2)) {
                        str3 = strReplaceAll;
                    } else if (TypedValues.CycleType.S_WAVE_OFFSET.equals(string2)) {
                        str2 = strReplaceAll;
                    }
                }
                this.OLrzqt.put(string, new TaskDescription(string, str, str3, str2));
            }
        }
    }

    /* JADX INFO: renamed from: o.afg$TaskDescription */
    public static class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final BigDecimal copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BigDecimal KWHzl() {
            return this.copydefault;
        }

        public TaskDescription(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.OLrzqt = str3;
            this.copydefault = AEQbTJ(str4);
        }

        public static BigDecimal AEQbTJ(java.lang.String str) {
            java.lang.String[] strArrSplit = str.split("/");
            if (strArrSplit.length == 1) {
                return new BigDecimal(strArrSplit[0]);
            }
            return new BigDecimal(strArrSplit[0]).divide(new BigDecimal(strArrSplit[1]), MathContext.DECIMAL128);
        }
    }
}
