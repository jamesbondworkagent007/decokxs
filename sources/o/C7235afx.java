package o;

import java.math.BigDecimal;
import java.math.MathContext;

/* JADX INFO: renamed from: o.afx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7235afx {
    public final MathContext AYXKKw;
    public final BigDecimal AhwBna;
    public final int djBIcL;
    public final BigDecimal gEmmrt;
    public static final C7235afx OLrzqt = new C7235afx(0, null);
    public static final C7235afx KWHzl = new C7235afx(2, null);
    public static final C7235afx AEQbTJ = new C7235afx(3, null);
    public static final BigDecimal copydefault = BigDecimal.valueOf(100L);
    public static final BigDecimal EZpvd = BigDecimal.valueOf(1000L);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return (this.djBIcL == 0 && this.gEmmrt == null) ? false : true;
    }

    public C7235afx(int i, BigDecimal bigDecimal) {
        this(i, bigDecimal, C7180aev.KWHzl);
    }

    public C7235afx(int i, BigDecimal bigDecimal, MathContext mathContext) {
        if (bigDecimal != null) {
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            bigDecimal = bigDecimal.compareTo(bigDecimal2) == 0 ? bigDecimal2 : bigDecimal.stripTrailingZeros();
            if (bigDecimal.precision() == 1 && bigDecimal.unscaledValue().equals(java.math.BigInteger.ONE)) {
                i -= bigDecimal.scale();
                bigDecimal = null;
            }
        }
        this.djBIcL = i;
        this.gEmmrt = bigDecimal;
        this.AYXKKw = mathContext;
        if (bigDecimal == null || BigDecimal.ZERO.compareTo(bigDecimal) == 0) {
            this.AhwBna = null;
        } else {
            this.AhwBna = BigDecimal.ONE.divide(bigDecimal, mathContext);
        }
    }

    public static C7235afx EZpvd(int i) {
        return i == 0 ? OLrzqt : i == 2 ? KWHzl : i == 3 ? AEQbTJ : new C7235afx(i, null);
    }

    public static C7235afx EZpvd(BigDecimal bigDecimal) {
        return bigDecimal.compareTo(BigDecimal.ONE) == 0 ? OLrzqt : bigDecimal.compareTo(copydefault) == 0 ? KWHzl : bigDecimal.compareTo(EZpvd) == 0 ? AEQbTJ : new C7235afx(0, bigDecimal);
    }

    public static C7235afx EZpvd(double d) {
        return d == 1.0d ? OLrzqt : d == 100.0d ? KWHzl : d == 1000.0d ? AEQbTJ : new C7235afx(0, BigDecimal.valueOf(d));
    }

    @java.lang.Deprecated
    public C7235afx EZpvd(MathContext mathContext) {
        return this.AYXKKw.equals(mathContext) ? this : new C7235afx(this.djBIcL, this.gEmmrt, mathContext);
    }

    @java.lang.Deprecated
    public void EZpvd(InterfaceC7163aee interfaceC7163aee) {
        interfaceC7163aee.AEQbTJ(this.djBIcL);
        BigDecimal bigDecimal = this.gEmmrt;
        if (bigDecimal != null) {
            interfaceC7163aee.copydefault(bigDecimal);
        }
    }

    @java.lang.Deprecated
    public void AEQbTJ(InterfaceC7163aee interfaceC7163aee) {
        interfaceC7163aee.AEQbTJ(-this.djBIcL);
        BigDecimal bigDecimal = this.AhwBna;
        if (bigDecimal != null) {
            interfaceC7163aee.copydefault(bigDecimal);
            interfaceC7163aee.OLrzqt(interfaceC7163aee.AEQbTJ() - this.AYXKKw.getPrecision(), this.AYXKKw);
        }
    }
}
