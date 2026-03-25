package o;

import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.util.MeasureUnit;

/* JADX INFO: renamed from: o.afd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7215afd {
    public int OLrzqt = -1;
    public java.lang.String EZpvd = "";
    public int AEQbTJ = 1;
    public MeasureUnit.SIPrefix KWHzl = MeasureUnit.SIPrefix.ONE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MeasureUnit.SIPrefix copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(MeasureUnit.SIPrefix sIPrefix) {
        this.KWHzl = sIPrefix;
    }

    public C7215afd OLrzqt() {
        C7215afd c7215afd = new C7215afd();
        c7215afd.OLrzqt = this.OLrzqt;
        c7215afd.AEQbTJ = this.AEQbTJ;
        c7215afd.EZpvd = this.EZpvd;
        c7215afd.KWHzl = this.KWHzl;
        return c7215afd;
    }

    public MeasureUnit AEQbTJ() {
        return new MeasureUnitImpl(this).AEQbTJ();
    }

    public java.lang.String KWHzl() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iAbs = java.lang.Math.abs(EZpvd());
        if (iAbs != 1) {
            if (iAbs == 2) {
                sb.append("square-");
            } else if (iAbs == 3) {
                sb.append("cubic-");
            } else if (iAbs <= 15) {
                sb.append("pow");
                sb.append(iAbs);
                sb.append('-');
            } else {
                throw new java.lang.IllegalArgumentException("Unit Identifier Syntax Error");
            }
        }
        sb.append(copydefault().getIdentifier());
        sb.append(AYXKKw());
        return sb.toString();
    }

    public int AEQbTJ(C7215afd c7215afd) {
        int i;
        int i2;
        int i3 = this.AEQbTJ;
        if (i3 < 0 && c7215afd.AEQbTJ > 0) {
            return 1;
        }
        if ((i3 > 0 && c7215afd.AEQbTJ < 0) || (i = this.OLrzqt) < (i2 = c7215afd.OLrzqt)) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        if (copydefault().getPower() < c7215afd.copydefault().getPower()) {
            return -1;
        }
        return copydefault().getPower() > c7215afd.copydefault().getPower() ? 1 : 0;
    }

    public boolean KWHzl(C7215afd c7215afd) {
        return AEQbTJ(c7215afd) == 0;
    }

    public void OLrzqt(int i, java.lang.String[] strArr) {
        this.OLrzqt = i;
        this.EZpvd = strArr[i];
    }
}
