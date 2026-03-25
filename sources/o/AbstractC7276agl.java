package o;

import com.ibm.icu.text.DecimalFormat;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.RuleBasedNumberFormat;
import java.text.ParsePosition;

/* JADX INFO: renamed from: o.agl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7276agl {
    public final C7279ago AYXKKw;
    public final DecimalFormat copydefault;
    public final int gEmmrt;

    public abstract double AEQbTJ(double d);

    public boolean AEQbTJ() {
        return false;
    }

    public abstract double EZpvd(double d, double d2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.gEmmrt;
    }

    public abstract char KWHzl();

    public abstract double KWHzl(double d);

    public void KWHzl(int i, short s) {
    }

    public abstract long OLrzqt(long j);

    public int hashCode() {
        return 42;
    }

    public static AbstractC7276agl AEQbTJ(int i, C7277agm c7277agm, C7277agm c7277agm2, C7279ago c7279ago, RuleBasedNumberFormat ruleBasedNumberFormat, java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        switch (str.charAt(0)) {
            case '<':
                if (c7277agm.EZpvd() == -1) {
                    throw new java.lang.IllegalArgumentException("<< not allowed in negative-number rule");
                }
                if (c7277agm.EZpvd() == -2 || c7277agm.EZpvd() == -3 || c7277agm.EZpvd() == -4) {
                    return new C7268agd(i, c7279ago, str);
                }
                if (c7279ago.KWHzl()) {
                    return new C7281agq(i, c7277agm.EZpvd(), ruleBasedNumberFormat.getDefaultRuleSet(), str);
                }
                return new C7271agg(i, c7277agm, c7279ago, str);
            case '=':
                return new C7285agu(i, c7279ago, str);
            case '>':
                if (c7277agm.EZpvd() == -1) {
                    return new C7191afF(i, c7279ago, str);
                }
                if (c7277agm.EZpvd() == -2 || c7277agm.EZpvd() == -3 || c7277agm.EZpvd() == -4) {
                    return new C7266agb(i, c7279ago, str);
                }
                if (c7279ago.KWHzl()) {
                    throw new java.lang.IllegalArgumentException(">> not allowed in fraction rule set");
                }
                return new C7272agh(i, c7277agm, c7277agm2, c7279ago, str);
            default:
                throw new java.lang.IllegalArgumentException("Illegal substitution character");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC7276agl(int i, C7279ago c7279ago, java.lang.String str) {
        this.gEmmrt = i;
        int length = str.length();
        if (length >= 2) {
            int i2 = length - 1;
            if (str.charAt(0) == str.charAt(i2)) {
                str = str.substring(1, i2);
            } else if (length != 0) {
                throw new java.lang.IllegalArgumentException("Illegal substitution syntax");
            }
        }
        if (str.length() == 0) {
            this.AYXKKw = c7279ago;
            this.copydefault = null;
            return;
        }
        if (str.charAt(0) == '%') {
            this.AYXKKw = c7279ago.AhwBna.findRuleSet(str);
            this.copydefault = null;
            return;
        }
        if (str.charAt(0) == '#' || str.charAt(0) == '0') {
            this.AYXKKw = null;
            DecimalFormat decimalFormat = (DecimalFormat) c7279ago.AhwBna.getDecimalFormat().clone();
            this.copydefault = decimalFormat;
            decimalFormat.applyPattern(str);
            return;
        }
        if (str.charAt(0) != '>') {
            throw new java.lang.IllegalArgumentException("Illegal substitution syntax");
        }
        this.AYXKKw = c7279ago;
        this.copydefault = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractC7276agl abstractC7276agl = (AbstractC7276agl) obj;
        if (this.gEmmrt != abstractC7276agl.gEmmrt) {
            return false;
        }
        if (this.AYXKKw == null && abstractC7276agl.AYXKKw != null) {
            return false;
        }
        DecimalFormat decimalFormat = this.copydefault;
        DecimalFormat decimalFormat2 = abstractC7276agl.copydefault;
        if (decimalFormat == null) {
            if (decimalFormat2 != null) {
                return false;
            }
        } else if (!decimalFormat.equals(decimalFormat2)) {
            return false;
        }
        return true;
    }

    public java.lang.String toString() {
        if (this.AYXKKw != null) {
            return KWHzl() + this.AYXKKw.copydefault() + KWHzl();
        }
        return KWHzl() + this.copydefault.toPattern() + KWHzl();
    }

    public void EZpvd(long j, java.lang.StringBuilder sb, int i, int i2) {
        if (this.AYXKKw != null) {
            this.AYXKKw.AEQbTJ(OLrzqt(j), sb, i + this.gEmmrt, i2);
        } else {
            if (j <= 9007199254740991L) {
                double dAEQbTJ = AEQbTJ(j);
                if (this.copydefault.getMaximumFractionDigits() == 0) {
                    dAEQbTJ = java.lang.Math.floor(dAEQbTJ);
                }
                sb.insert(i + this.gEmmrt, this.copydefault.format(dAEQbTJ));
                return;
            }
            sb.insert(i + this.gEmmrt, this.copydefault.format(OLrzqt(j)));
        }
    }

    public void EZpvd(double d, java.lang.StringBuilder sb, int i, int i2) {
        C7279ago c7279ago;
        double dAEQbTJ = AEQbTJ(d);
        if (java.lang.Double.isInfinite(dAEQbTJ)) {
            this.AYXKKw.EZpvd(Double.POSITIVE_INFINITY).EZpvd(dAEQbTJ, sb, i + this.gEmmrt, i2);
            return;
        }
        if (dAEQbTJ == java.lang.Math.floor(dAEQbTJ) && (c7279ago = this.AYXKKw) != null) {
            c7279ago.AEQbTJ((long) dAEQbTJ, sb, i + this.gEmmrt, i2);
            return;
        }
        C7279ago c7279ago2 = this.AYXKKw;
        if (c7279ago2 != null) {
            c7279ago2.KWHzl(dAEQbTJ, sb, i + this.gEmmrt, i2);
        } else {
            sb.insert(i + this.gEmmrt, this.copydefault.format(dAEQbTJ));
        }
    }

    public java.lang.Number KWHzl(java.lang.String str, ParsePosition parsePosition, double d, double d2, boolean z, int i) {
        java.lang.Number numberOLrzqt;
        double dKWHzl = KWHzl(d2);
        C7279ago c7279ago = this.AYXKKw;
        if (c7279ago != null) {
            numberOLrzqt = c7279ago.OLrzqt(str, parsePosition, dKWHzl, i);
            if (z && !this.AYXKKw.KWHzl() && parsePosition.getIndex() == 0) {
                numberOLrzqt = this.AYXKKw.AhwBna.getDecimalFormat().parse(str, parsePosition);
            }
        } else {
            numberOLrzqt = this.copydefault.parse(str, parsePosition);
        }
        if (parsePosition.getIndex() == 0) {
            return numberOLrzqt;
        }
        double dEZpvd = EZpvd(numberOLrzqt.doubleValue(), d);
        long j = (long) dEZpvd;
        if (dEZpvd == j) {
            return java.lang.Long.valueOf(j);
        }
        return new java.lang.Double(dEZpvd);
    }

    public void EZpvd(DecimalFormatSymbols decimalFormatSymbols) {
        DecimalFormat decimalFormat = this.copydefault;
        if (decimalFormat != null) {
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        }
    }
}
