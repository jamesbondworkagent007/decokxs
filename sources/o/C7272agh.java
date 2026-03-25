package o;

import java.text.ParsePosition;

/* JADX INFO: renamed from: o.agh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7272agh extends AbstractC7276agl {
    public long AEQbTJ;
    public final C7277agm OLrzqt;

    @Override // o.AbstractC7276agl
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7276agl
    public double EZpvd(double d, double d2) {
        return (d2 - (d2 % this.AEQbTJ)) + d;
    }

    @Override // o.AbstractC7276agl
    public char KWHzl() {
        return '>';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7276agl
    public double KWHzl(double d) {
        return this.AEQbTJ;
    }

    public C7272agh(int i, C7277agm c7277agm, C7277agm c7277agm2, C7279ago c7279ago, java.lang.String str) {
        super(i, c7279ago, str);
        long jCopydefault = c7277agm.copydefault();
        this.AEQbTJ = jCopydefault;
        if (jCopydefault == 0) {
            throw new java.lang.IllegalStateException("Substitution with bad divisor (" + this.AEQbTJ + ") " + str.substring(0, i) + " | " + str.substring(i));
        }
        if (str.equals(">>>")) {
            this.OLrzqt = c7277agm2;
        } else {
            this.OLrzqt = null;
        }
    }

    @Override // o.AbstractC7276agl
    public void KWHzl(int i, short s) {
        long jAEQbTJ = C7277agm.AEQbTJ(i, s);
        this.AEQbTJ = jAEQbTJ;
        if (jAEQbTJ == 0) {
            throw new java.lang.IllegalStateException("Substitution with bad divisor");
        }
    }

    @Override // o.AbstractC7276agl
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj) && this.AEQbTJ == ((C7272agh) obj).AEQbTJ;
    }

    @Override // o.AbstractC7276agl
    public void EZpvd(long j, java.lang.StringBuilder sb, int i, int i2) {
        if (this.OLrzqt == null) {
            super.EZpvd(j, sb, i, i2);
        } else {
            this.OLrzqt.copydefault(OLrzqt(j), sb, i + this.gEmmrt, i2);
        }
    }

    @Override // o.AbstractC7276agl
    public void EZpvd(double d, java.lang.StringBuilder sb, int i, int i2) {
        if (this.OLrzqt == null) {
            super.EZpvd(d, sb, i, i2);
        } else {
            this.OLrzqt.EZpvd(AEQbTJ(d), sb, i + this.gEmmrt, i2);
        }
    }

    @Override // o.AbstractC7276agl
    public long OLrzqt(long j) {
        return j % this.AEQbTJ;
    }

    @Override // o.AbstractC7276agl
    public double AEQbTJ(double d) {
        return java.lang.Math.floor(d % this.AEQbTJ);
    }

    @Override // o.AbstractC7276agl
    public java.lang.Number KWHzl(java.lang.String str, ParsePosition parsePosition, double d, double d2, boolean z, int i) {
        C7277agm c7277agm = this.OLrzqt;
        if (c7277agm == null) {
            return super.KWHzl(str, parsePosition, d, d2, z, i);
        }
        java.lang.Number numberOLrzqt = c7277agm.OLrzqt(str, parsePosition, false, d2, i);
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
}
