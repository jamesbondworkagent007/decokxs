package o;

/* JADX INFO: renamed from: o.agg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7271agg extends AbstractC7276agl {
    public long EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7276agl
    public double EZpvd(double d, double d2) {
        return d * this.EZpvd;
    }

    @Override // o.AbstractC7276agl
    public char KWHzl() {
        return '<';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7276agl
    public double KWHzl(double d) {
        return this.EZpvd;
    }

    public C7271agg(int i, C7277agm c7277agm, C7279ago c7279ago, java.lang.String str) {
        super(i, c7279ago, str);
        long jCopydefault = c7277agm.copydefault();
        this.EZpvd = jCopydefault;
        if (jCopydefault != 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Substitution with divisor 0 " + str.substring(0, i) + " | " + str.substring(i));
    }

    @Override // o.AbstractC7276agl
    public void KWHzl(int i, short s) {
        long jAEQbTJ = C7277agm.AEQbTJ(i, s);
        this.EZpvd = jAEQbTJ;
        if (jAEQbTJ == 0) {
            throw new java.lang.IllegalStateException("Substitution with divisor 0");
        }
    }

    @Override // o.AbstractC7276agl
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj) && this.EZpvd == ((C7271agg) obj).EZpvd;
    }

    @Override // o.AbstractC7276agl
    public long OLrzqt(long j) {
        return (long) java.lang.Math.floor(j / this.EZpvd);
    }

    @Override // o.AbstractC7276agl
    public double AEQbTJ(double d) {
        return this.AYXKKw == null ? d / this.EZpvd : java.lang.Math.floor(d / this.EZpvd);
    }
}
