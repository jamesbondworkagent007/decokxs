package o;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oUG extends C36252oUx {
    public double AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public double OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AhwBna() {
        return this.OLrzqt;
    }

    public abstract void EZpvd(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    public abstract boolean OLrzqt(int[] iArr, int i, double[][] dArr, int[][] iArr2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double gEmmrt() {
        return this.AEQbTJ;
    }

    public oUG(java.lang.String str) {
        super(str);
    }

    public final void AYXKKw() {
        int i;
        oWN own = C36246oUr.copydefault().DCJXGO().get(copydefault());
        int[] iArr = {own.isConnected()};
        double[][] dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Double.TYPE, 1, 2);
        int[][] iArr2 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 1, 2);
        if (OLrzqt(iArr, java.lang.Math.min(own.fIwbmz(), own.AuCTel() - 1), dArr, iArr2)) {
            double[] dArr2 = dArr[0];
            this.AEQbTJ = dArr2[0];
            this.OLrzqt = dArr2[1];
            int[] iArr3 = iArr2[0];
            this.KWHzl = iArr3[0];
            i = iArr3[1];
        } else {
            this.AEQbTJ = Double.MAX_VALUE;
            this.OLrzqt = -1.7976931348623157E308d;
            i = -1;
            this.KWHzl = -1;
        }
        this.EZpvd = i;
    }
}
