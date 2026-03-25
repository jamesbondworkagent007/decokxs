package o;

import androidx.camera.video.AudioStats;
import com.ibm.icu.util.Currency;
import java.math.BigDecimal;
import java.math.MathContext;

/* JADX INFO: renamed from: o.afy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7236afy {
    public MathContext AkhnZx = C7180aev.EZpvd;

    @java.lang.Deprecated
    public static final Activity EZpvd = new Activity();
    public static final FragmentManager values = new FragmentManager();
    public static final ActionBar copydefault = new ActionBar(0, 0);
    public static final ActionBar AEQbTJ = new ActionBar(2, 2);
    public static final ActionBar KWHzl = new ActionBar(0, 6);
    public static final LoaderManager valueOf = new LoaderManager(2, 2);
    public static final LoaderManager AYXKKw = new LoaderManager(3, 3);
    public static final LoaderManager isConnected = new LoaderManager(2, 3);
    public static final StateListAnimator OLrzqt = new StateListAnimator(0, 0, 2, -1);
    public static final TaskDescription djBIcL = new TaskDescription(new BigDecimal("0.05"), 2, 2);
    public static final Application AhwBna = new Application(Currency.CurrencyUsage.STANDARD);
    public static final Application gEmmrt = new Application(Currency.CurrencyUsage.CASH);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AbstractC7236afy AEQbTJ() {
        return values;
    }

    public static int AhwBna(int i) {
        if (i == -1) {
            return Integer.MIN_VALUE;
        }
        return -i;
    }

    public static int gEmmrt(int i) {
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return -i;
    }

    @java.lang.Deprecated
    public abstract void AEQbTJ(InterfaceC7163aee interfaceC7163aee);

    public abstract AbstractC7236afy copydefault();

    public static AbstractC7236afy OLrzqt() {
        return AEQbTJ();
    }

    public static AbstractC7224afm KWHzl() {
        return copydefault(0, 0);
    }

    public static AbstractC7224afm AEQbTJ(int i) {
        if (i >= 0 && i <= 999) {
            return copydefault(i, i);
        }
        throw new java.lang.IllegalArgumentException("Fraction length must be between 0 and 999 (inclusive)");
    }

    public static AbstractC7224afm djBIcL(int i) {
        if (i >= 0 && i <= 999) {
            return copydefault(i, -1);
        }
        throw new java.lang.IllegalArgumentException("Fraction length must be between 0 and 999 (inclusive)");
    }

    public static AbstractC7224afm valueOf(int i) {
        if (i >= 0 && i <= 999) {
            return copydefault(0, i);
        }
        throw new java.lang.IllegalArgumentException("Fraction length must be between 0 and 999 (inclusive)");
    }

    public static AbstractC7224afm OLrzqt(int i, int i2) {
        if (i >= 0 && i2 <= 999 && i <= i2) {
            return copydefault(i, i2);
        }
        throw new java.lang.IllegalArgumentException("Fraction length must be between 0 and 999 (inclusive)");
    }

    public static AbstractC7236afy AYXKKw(int i) {
        if (i >= 1 && i <= 999) {
            return KWHzl(i, i);
        }
        throw new java.lang.IllegalArgumentException("Significant digits must be between 1 and 999 (inclusive)");
    }

    public static AbstractC7236afy DbNXlk(int i) {
        if (i >= 1 && i <= 999) {
            return KWHzl(i, -1);
        }
        throw new java.lang.IllegalArgumentException("Significant digits must be between 1 and 999 (inclusive)");
    }

    public static AbstractC7236afy EZpvd(int i, int i2) {
        if (i >= 1 && i2 <= 999 && i <= i2) {
            return KWHzl(i, i2);
        }
        throw new java.lang.IllegalArgumentException("Significant digits must be between 1 and 999 (inclusive)");
    }

    public static AbstractC7236afy OLrzqt(BigDecimal bigDecimal) {
        if (bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            return AEQbTJ(bigDecimal);
        }
        throw new java.lang.IllegalArgumentException("Rounding increment must be positive and non-null");
    }

    public static AbstractC7226afo copydefault(Currency.CurrencyUsage currencyUsage) {
        if (currencyUsage != null) {
            return OLrzqt(currencyUsage);
        }
        throw new java.lang.IllegalArgumentException("CurrencyUsage must be non-null");
    }

    @java.lang.Deprecated
    public AbstractC7236afy KWHzl(MathContext mathContext) {
        if (this.AkhnZx.equals(mathContext)) {
            return this;
        }
        AbstractC7236afy abstractC7236afyCopydefault = copydefault();
        abstractC7236afyCopydefault.AkhnZx = mathContext;
        return abstractC7236afyCopydefault;
    }

    public static AbstractC7224afm copydefault(int i, int i2) {
        return (i == 0 && i2 == 0) ? copydefault : (i == 2 && i2 == 2) ? AEQbTJ : (i == 0 && i2 == 6) ? KWHzl : new ActionBar(i, i2);
    }

    public static AbstractC7236afy KWHzl(int i, int i2) {
        return (i == 2 && i2 == 2) ? valueOf : (i == 3 && i2 == 3) ? AYXKKw : (i == 2 && i2 == 3) ? isConnected : new LoaderManager(i, i2);
    }

    public static AbstractC7236afy AEQbTJ(AbstractC7224afm abstractC7224afm, int i, int i2) {
        ActionBar actionBar = (ActionBar) abstractC7224afm;
        int i3 = actionBar.DbNXlk;
        return ((i3 == 0 && actionBar.fetchVPNInfo == 0 && i == 2) ? OLrzqt : new StateListAnimator(i3, actionBar.fetchVPNInfo, i, i2)).KWHzl(actionBar.AkhnZx);
    }

    public static AbstractC7236afy AEQbTJ(BigDecimal bigDecimal) {
        TaskDescription taskDescription = djBIcL;
        if (bigDecimal.equals(taskDescription.fARcdN)) {
            return taskDescription;
        }
        BigDecimal bigDecimalStripTrailingZeros = bigDecimal.stripTrailingZeros();
        if (bigDecimalStripTrailingZeros.precision() == 1) {
            int iScale = bigDecimal.scale();
            int iScale2 = bigDecimalStripTrailingZeros.scale();
            java.math.BigInteger bigIntegerUnscaledValue = bigDecimalStripTrailingZeros.unscaledValue();
            if (bigIntegerUnscaledValue.intValue() == 1) {
                return new Fragment(bigDecimal, iScale, iScale2);
            }
            if (bigIntegerUnscaledValue.intValue() == 5) {
                return new TaskDescription(bigDecimal, iScale, iScale2);
            }
        }
        return new Dialog(bigDecimal);
    }

    public static AbstractC7226afo OLrzqt(Currency.CurrencyUsage currencyUsage) {
        if (currencyUsage == Currency.CurrencyUsage.STANDARD) {
            return AhwBna;
        }
        if (currencyUsage == Currency.CurrencyUsage.CASH) {
            return gEmmrt;
        }
        throw new java.lang.AssertionError();
    }

    public static AbstractC7236afy EZpvd(AbstractC7226afo abstractC7226afo, Currency currency) {
        AbstractC7236afy abstractC7236afyCopydefault;
        Application application = (Application) abstractC7226afo;
        double roundingIncrement = currency.getRoundingIncrement(application.DbNXlk);
        if (roundingIncrement != AudioStats.AUDIO_AMPLITUDE_NONE) {
            abstractC7236afyCopydefault = AEQbTJ(BigDecimal.valueOf(roundingIncrement));
        } else {
            int defaultFractionDigits = currency.getDefaultFractionDigits(application.DbNXlk);
            abstractC7236afyCopydefault = copydefault(defaultFractionDigits, defaultFractionDigits);
        }
        return abstractC7236afyCopydefault.KWHzl(application.AkhnZx);
    }

    public AbstractC7236afy AEQbTJ(Currency currency) {
        return this instanceof AbstractC7226afo ? ((AbstractC7226afo) this).EZpvd(currency) : this;
    }

    public int EZpvd(InterfaceC7163aee interfaceC7163aee, InterfaceC7177aes interfaceC7177aes) {
        int iOLrzqt;
        int iAEQbTJ = interfaceC7163aee.AEQbTJ();
        int iOLrzqt2 = interfaceC7177aes.OLrzqt(iAEQbTJ);
        interfaceC7163aee.AEQbTJ(iOLrzqt2);
        AEQbTJ(interfaceC7163aee);
        if (interfaceC7163aee.valueOf() || interfaceC7163aee.AEQbTJ() == iAEQbTJ + iOLrzqt2 || iOLrzqt2 == (iOLrzqt = interfaceC7177aes.OLrzqt(iAEQbTJ + 1))) {
            return iOLrzqt2;
        }
        interfaceC7163aee.AEQbTJ(iOLrzqt - iOLrzqt2);
        AEQbTJ(interfaceC7163aee);
        return iOLrzqt;
    }

    /* JADX INFO: renamed from: o.afy$Activity */
    @java.lang.Deprecated
    public static class Activity extends AbstractC7236afy {
        @java.lang.Deprecated
        public Activity() {
        }

        @Override // o.AbstractC7236afy
        @java.lang.Deprecated
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            throw new java.lang.AssertionError("BogusRounder must not be applied");
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        @Override // o.AbstractC7236afy
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Activity copydefault() {
            Activity activity = new Activity();
            activity.AkhnZx = this.AkhnZx;
            return activity;
        }

        @java.lang.Deprecated
        public AbstractC7236afy AEQbTJ(AbstractC7236afy abstractC7236afy) {
            AbstractC7236afy abstractC7236afyCopydefault = abstractC7236afy.copydefault();
            abstractC7236afyCopydefault.AkhnZx = this.AkhnZx;
            return abstractC7236afyCopydefault;
        }
    }

    /* JADX INFO: renamed from: o.afy$FragmentManager */
    public static class FragmentManager extends AbstractC7236afy {
        @Override // o.AbstractC7236afy
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            interfaceC7163aee.djBIcL();
            interfaceC7163aee.copydefault(0);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        @Override // o.AbstractC7236afy
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public FragmentManager copydefault() {
            FragmentManager fragmentManager = new FragmentManager();
            fragmentManager.AkhnZx = this.AkhnZx;
            return fragmentManager;
        }
    }

    /* JADX INFO: renamed from: o.afy$ActionBar */
    public static class ActionBar extends AbstractC7224afm {
        public final int DbNXlk;
        public final int fetchVPNInfo;

        public ActionBar(int i, int i2) {
            this.DbNXlk = i;
            this.fetchVPNInfo = i2;
        }

        @Override // o.AbstractC7236afy
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            interfaceC7163aee.OLrzqt(AbstractC7236afy.AhwBna(this.fetchVPNInfo), this.AkhnZx);
            interfaceC7163aee.copydefault(java.lang.Math.max(0, -AbstractC7236afy.gEmmrt(this.DbNXlk)));
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        @Override // o.AbstractC7236afy
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public ActionBar copydefault() {
            ActionBar actionBar = new ActionBar(this.DbNXlk, this.fetchVPNInfo);
            actionBar.AkhnZx = this.AkhnZx;
            return actionBar;
        }
    }

    /* JADX INFO: renamed from: o.afy$LoaderManager */
    public static class LoaderManager extends AbstractC7236afy {
        public final int DbNXlk;
        public final int fetchVPNInfo;

        public LoaderManager(int i, int i2) {
            this.fetchVPNInfo = i;
            this.DbNXlk = i2;
        }

        @Override // o.AbstractC7236afy
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            interfaceC7163aee.OLrzqt(AbstractC7236afy.copydefault(interfaceC7163aee, this.DbNXlk), this.AkhnZx);
            interfaceC7163aee.copydefault(java.lang.Math.max(0, -AbstractC7236afy.KWHzl(interfaceC7163aee, this.fetchVPNInfo)));
            if (!interfaceC7163aee.valueOf() || this.fetchVPNInfo <= 0) {
                return;
            }
            interfaceC7163aee.valueOf(1);
        }

        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee, int i) {
            interfaceC7163aee.copydefault(this.fetchVPNInfo - i);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        @Override // o.AbstractC7236afy
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public LoaderManager copydefault() {
            LoaderManager loaderManager = new LoaderManager(this.fetchVPNInfo, this.DbNXlk);
            loaderManager.AkhnZx = this.AkhnZx;
            return loaderManager;
        }
    }

    /* JADX INFO: renamed from: o.afy$StateListAnimator */
    public static class StateListAnimator extends AbstractC7236afy {
        public final int AuCTel;
        public final int DbNXlk;
        public final int fJNWhG;
        public final int fetchVPNInfo;

        public StateListAnimator(int i, int i2, int i3, int i4) {
            this.fJNWhG = i;
            this.fetchVPNInfo = i2;
            this.AuCTel = i3;
            this.DbNXlk = i4;
        }

        @Override // o.AbstractC7236afy
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            int iMin;
            int iGEmmrt = AbstractC7236afy.gEmmrt(this.fJNWhG);
            int iAhwBna = AbstractC7236afy.AhwBna(this.fetchVPNInfo);
            int i = this.AuCTel;
            if (i == -1) {
                iMin = java.lang.Math.max(iAhwBna, AbstractC7236afy.copydefault(interfaceC7163aee, this.DbNXlk));
            } else {
                iMin = java.lang.Math.min(iAhwBna, AbstractC7236afy.KWHzl(interfaceC7163aee, i));
            }
            interfaceC7163aee.OLrzqt(iMin, this.AkhnZx);
            interfaceC7163aee.copydefault(java.lang.Math.max(0, -iGEmmrt));
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        @Override // o.AbstractC7236afy
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator copydefault() {
            StateListAnimator stateListAnimator = new StateListAnimator(this.fJNWhG, this.fetchVPNInfo, this.AuCTel, this.DbNXlk);
            stateListAnimator.AkhnZx = this.AkhnZx;
            return stateListAnimator;
        }
    }

    /* JADX INFO: renamed from: o.afy$Dialog */
    public static class Dialog extends AbstractC7236afy {
        public final BigDecimal fARcdN;

        public Dialog(BigDecimal bigDecimal) {
            this.fARcdN = bigDecimal;
        }

        @Override // o.AbstractC7236afy
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            interfaceC7163aee.copydefault(this.fARcdN, this.AkhnZx);
            interfaceC7163aee.copydefault(this.fARcdN.scale());
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        @Override // o.AbstractC7236afy
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
        public Dialog copydefault() {
            Dialog dialog = new Dialog(this.fARcdN);
            dialog.AkhnZx = this.AkhnZx;
            return dialog;
        }
    }

    /* JADX INFO: renamed from: o.afy$Fragment */
    public static class Fragment extends Dialog {
        public final int DbNXlk;
        public final int fetchVPNInfo;

        public Fragment(BigDecimal bigDecimal, int i, int i2) {
            super(bigDecimal);
            this.DbNXlk = i;
            this.fetchVPNInfo = i2;
        }

        @Override // o.AbstractC7236afy.Dialog, o.AbstractC7236afy
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            interfaceC7163aee.OLrzqt(-this.fetchVPNInfo, this.AkhnZx);
            interfaceC7163aee.copydefault(this.DbNXlk);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        /* JADX DEBUG: Method merged with bridge method: djBIcL()Lo/afy$Dialog; */
        @Override // o.AbstractC7236afy.Dialog
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Fragment copydefault() {
            Fragment fragment = new Fragment(this.fARcdN, this.DbNXlk, this.fetchVPNInfo);
            fragment.AkhnZx = this.AkhnZx;
            return fragment;
        }
    }

    /* JADX INFO: renamed from: o.afy$TaskDescription */
    public static class TaskDescription extends Dialog {
        public final int DbNXlk;
        public final int fetchVPNInfo;

        public TaskDescription(BigDecimal bigDecimal, int i, int i2) {
            super(bigDecimal);
            this.DbNXlk = i;
            this.fetchVPNInfo = i2;
        }

        @Override // o.AbstractC7236afy.Dialog, o.AbstractC7236afy
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            interfaceC7163aee.AEQbTJ(-this.fetchVPNInfo, this.AkhnZx);
            interfaceC7163aee.copydefault(this.DbNXlk);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        /* JADX DEBUG: Method merged with bridge method: djBIcL()Lo/afy$Dialog; */
        @Override // o.AbstractC7236afy.Dialog
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public TaskDescription copydefault() {
            TaskDescription taskDescription = new TaskDescription(this.fARcdN, this.DbNXlk, this.fetchVPNInfo);
            taskDescription.AkhnZx = this.AkhnZx;
            return taskDescription;
        }
    }

    /* JADX INFO: renamed from: o.afy$Application */
    public static class Application extends AbstractC7226afo {
        public final Currency.CurrencyUsage DbNXlk;

        public Application(Currency.CurrencyUsage currencyUsage) {
            this.DbNXlk = currencyUsage;
        }

        @Override // o.AbstractC7236afy
        public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
            throw new java.lang.AssertionError();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/afy; */
        @Override // o.AbstractC7236afy
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Application copydefault() {
            Application application = new Application(this.DbNXlk);
            application.AkhnZx = this.AkhnZx;
            return application;
        }
    }

    public static int copydefault(InterfaceC7163aee interfaceC7163aee, int i) {
        if (i == -1) {
            return Integer.MIN_VALUE;
        }
        return ((interfaceC7163aee.valueOf() ? 0 : interfaceC7163aee.AEQbTJ()) - i) + 1;
    }

    public static int KWHzl(InterfaceC7163aee interfaceC7163aee, int i) {
        return ((interfaceC7163aee.valueOf() ? 0 : interfaceC7163aee.AEQbTJ()) - i) + 1;
    }
}
