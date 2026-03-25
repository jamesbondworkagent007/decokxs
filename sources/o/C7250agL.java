package o;

import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ULocale;
import o.C7059acg;
import o.C7062acj;

/* JADX INFO: renamed from: o.agL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7250agL extends Currency.ActionBar {
    public static final C7059acg AEQbTJ = new Activity();

    @Override // com.ibm.icu.util.Currency.ActionBar
    public java.util.Locale[] KWHzl() {
        C7059acg c7059acg = AEQbTJ;
        if (c7059acg.valueOf()) {
            return ICUResourceBundle.copydefault();
        }
        return c7059acg.AEQbTJ();
    }

    @Override // com.ibm.icu.util.Currency.ActionBar
    public ULocale[] OLrzqt() {
        C7059acg c7059acg = AEQbTJ;
        if (c7059acg.valueOf()) {
            return ICUResourceBundle.OLrzqt();
        }
        return c7059acg.EZpvd();
    }

    @Override // com.ibm.icu.util.Currency.ActionBar
    public Currency copydefault(ULocale uLocale) {
        C7059acg c7059acg = AEQbTJ;
        if (c7059acg.valueOf()) {
            return Currency.createCurrency(uLocale);
        }
        return (Currency) c7059acg.EZpvd(uLocale);
    }

    @Override // com.ibm.icu.util.Currency.ActionBar
    public java.lang.Object KWHzl(Currency currency, ULocale uLocale) {
        return AEQbTJ.copydefault(currency, uLocale);
    }

    @Override // com.ibm.icu.util.Currency.ActionBar
    public boolean copydefault(java.lang.Object obj) {
        return AEQbTJ.KWHzl((C7062acj.TaskDescription) obj);
    }

    /* JADX INFO: renamed from: o.agL$Activity */
    /* JADX INFO: loaded from: classes22.dex */
    public static class Activity extends C7059acg {
        public Activity() {
            super("Currency");
            copydefault(new TaskDescription());
            AYXKKw();
        }

        /* JADX INFO: renamed from: o.agL$Activity$TaskDescription */
        public class TaskDescription extends C7059acg.StateListAnimator {
            public TaskDescription() {
            }

            @Override // o.C7059acg.StateListAnimator, o.C7059acg.ActionBar
            public java.lang.Object OLrzqt(ULocale uLocale, int i, C7062acj c7062acj) {
                return Currency.createCurrency(uLocale);
            }
        }
    }
}
