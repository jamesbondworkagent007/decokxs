package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ULocale;
import java.util.MissingResourceException;
import o.C7059acg;
import o.C7062acj;

/* JADX INFO: renamed from: o.agn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7278agn extends NumberFormat.StateListAnimator {
    public static C7059acg AEQbTJ = new Activity();

    @Override // com.ibm.icu.text.NumberFormat.StateListAnimator
    public java.util.Locale[] OLrzqt() {
        if (AEQbTJ.valueOf()) {
            return ICUResourceBundle.copydefault();
        }
        return AEQbTJ.AEQbTJ();
    }

    @Override // com.ibm.icu.text.NumberFormat.StateListAnimator
    public ULocale[] AEQbTJ() {
        if (AEQbTJ.valueOf()) {
            return ICUResourceBundle.OLrzqt();
        }
        return AEQbTJ.EZpvd();
    }

    /* JADX INFO: renamed from: o.agn$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar extends C7059acg.ActionBar {
        public NumberFormat.Activity OLrzqt;

        public ActionBar(NumberFormat.Activity activity) {
            super(activity.AEQbTJ());
            this.OLrzqt = activity;
        }

        @Override // o.C7059acg.ActionBar, o.C7062acj.TaskDescription
        public java.lang.Object AEQbTJ(C7062acj.StateListAnimator stateListAnimator, C7062acj c7062acj) {
            if (!KWHzl(stateListAnimator) || !(stateListAnimator instanceof C7059acg.Activity)) {
                return null;
            }
            C7059acg.Activity activity = (C7059acg.Activity) stateListAnimator;
            NumberFormat numberFormatOLrzqt = this.OLrzqt.OLrzqt(activity.EZpvd(), activity.djBIcL());
            return numberFormatOLrzqt == null ? c7062acj.EZpvd(stateListAnimator, null, this) : numberFormatOLrzqt;
        }

        @Override // o.C7059acg.ActionBar
        public java.util.Set<java.lang.String> AEQbTJ() {
            return this.OLrzqt.EZpvd();
        }
    }

    @Override // com.ibm.icu.text.NumberFormat.StateListAnimator
    public java.lang.Object OLrzqt(NumberFormat.Activity activity) {
        return AEQbTJ.copydefault(new ActionBar(activity));
    }

    @Override // com.ibm.icu.text.NumberFormat.StateListAnimator
    public boolean AEQbTJ(java.lang.Object obj) {
        return AEQbTJ.KWHzl((C7062acj.TaskDescription) obj);
    }

    @Override // com.ibm.icu.text.NumberFormat.StateListAnimator
    public NumberFormat KWHzl(ULocale uLocale, int i) {
        ULocale[] uLocaleArr = new ULocale[1];
        NumberFormat numberFormat = (NumberFormat) AEQbTJ.copydefault(uLocale, i, uLocaleArr);
        if (numberFormat == null) {
            throw new MissingResourceException("Unable to construct NumberFormat", "", "");
        }
        NumberFormat numberFormat2 = (NumberFormat) numberFormat.clone();
        if (i == 1 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
            numberFormat2.setCurrency(Currency.getInstance(uLocale));
        }
        ULocale uLocale2 = uLocaleArr[0];
        numberFormat2.setLocale(uLocale2, uLocale2);
        return numberFormat2;
    }

    /* JADX INFO: renamed from: o.agn$Activity */
    public static class Activity extends C7059acg {
        public Activity() {
            super("NumberFormat");
            copydefault(new Application());
            AYXKKw();
        }

        /* JADX INFO: renamed from: o.agn$Activity$Application */
        public class Application extends C7059acg.StateListAnimator {
            public Application() {
            }

            @Override // o.C7059acg.StateListAnimator, o.C7059acg.ActionBar
            public java.lang.Object OLrzqt(ULocale uLocale, int i, C7062acj c7062acj) {
                return NumberFormat.createInstance(uLocale, i);
            }
        }
    }
}
