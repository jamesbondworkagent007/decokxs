package o;

import com.ibm.icu.impl.IllegalIcuArgumentException;
import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.util.MeasureUnit;
import java.math.BigDecimal;
import o.AbstractC7236afy;
import o.C7217aff;

/* JADX INFO: renamed from: o.afk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7222afk {
    public java.util.ArrayList<MeasureUnit> KWHzl = new java.util.ArrayList<>();
    public java.util.ArrayList<StateListAnimator> copydefault = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<MeasureUnit> EZpvd() {
        return this.KWHzl;
    }

    public C7222afk(MeasureUnitImpl measureUnitImpl, java.lang.String str, java.lang.String str2) {
        C7216afe c7216afe = new C7216afe();
        C7217aff.Application[] applicationArrAEQbTJ = c7216afe.AEQbTJ(c7216afe.OLrzqt(measureUnitImpl), str2, str);
        for (C7217aff.Application application : applicationArrAEQbTJ) {
            MeasureUnitImpl measureUnitImplEZpvd = MeasureUnitImpl.UnitsParser.EZpvd(application.copydefault());
            java.lang.String strOLrzqt = application.OLrzqt();
            if (!strOLrzqt.isEmpty() && !strOLrzqt.startsWith("precision-increment")) {
                throw new java.lang.AssertionError("Only `precision-increment` is allowed");
            }
            this.KWHzl.add(measureUnitImplEZpvd.AEQbTJ());
            this.copydefault.add(new StateListAnimator(measureUnitImpl, measureUnitImplEZpvd, application.EZpvd(), strOLrzqt, c7216afe.KWHzl()));
        }
    }

    public Application EZpvd(BigDecimal bigDecimal, C7169aek c7169aek) {
        StateListAnimator next = null;
        AbstractC7236afy abstractC7236afyAEQbTJ = c7169aek == null ? null : c7169aek.AkhnZx;
        java.util.Iterator<StateListAnimator> it = this.copydefault.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (next.EZpvd.OLrzqt(bigDecimal.abs(), next.AEQbTJ)) {
                break;
            }
        }
        if (abstractC7236afyAEQbTJ != null && (abstractC7236afyAEQbTJ instanceof AbstractC7236afy.Activity)) {
            AbstractC7236afy.Activity activity = (AbstractC7236afy.Activity) abstractC7236afyAEQbTJ;
            abstractC7236afyAEQbTJ = next.copydefault.length() > 0 ? activity.AEQbTJ(EZpvd(next.copydefault)) : activity.AEQbTJ(AbstractC7236afy.KWHzl().copydefault(2));
        }
        if (c7169aek != null) {
            c7169aek.AkhnZx = abstractC7236afyAEQbTJ;
        }
        return new Application(next.EZpvd.OLrzqt(bigDecimal, abstractC7236afyAEQbTJ), next.OLrzqt);
    }

    public static AbstractC7236afy EZpvd(java.lang.String str) {
        if (!str.startsWith("precision-increment/")) {
            throw new IllegalIcuArgumentException("precisionSkeleton is only precision-increment");
        }
        return AbstractC7236afy.OLrzqt(new BigDecimal(str.substring(20)));
    }

    /* JADX INFO: renamed from: o.afk$StateListAnimator */
    public static class StateListAnimator {
        public final BigDecimal AEQbTJ;
        public final C7214afc EZpvd;
        public final MeasureUnitImpl OLrzqt;
        public final java.lang.String copydefault;

        public StateListAnimator(MeasureUnitImpl measureUnitImpl, MeasureUnitImpl measureUnitImpl2, BigDecimal bigDecimal, java.lang.String str, C7218afg c7218afg) {
            this.EZpvd = new C7214afc(measureUnitImpl, measureUnitImpl2, c7218afg);
            this.AEQbTJ = bigDecimal;
            this.copydefault = str;
            this.OLrzqt = measureUnitImpl2;
        }
    }

    /* JADX INFO: renamed from: o.afk$Application */
    public class Application {
        public final java.util.List<C7254agP> AEQbTJ;
        public final MeasureUnitImpl EZpvd;

        public Application(java.util.List<C7254agP> list, MeasureUnitImpl measureUnitImpl) {
            this.AEQbTJ = list;
            this.EZpvd = measureUnitImpl;
        }
    }
}
