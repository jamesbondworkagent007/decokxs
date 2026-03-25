package o;

import com.okinc.kline.library.data.DataSource;

/* JADX INFO: loaded from: classes8.dex */
public class oUM extends oUG {
    public java.util.ArrayList<DataSource.StateListAnimator> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<DataSource.StateListAnimator> valueOf() {
        return this.djBIcL;
    }

    public oUM(java.lang.String str) {
        super(str);
    }

    @Override // o.oUG
    public void EZpvd(boolean z) {
        this.djBIcL = C36246oUr.copydefault().sSMYrx().get(copydefault()).AEQbTJ;
    }

    public boolean AEQbTJ(int i, double[] dArr) {
        java.util.ArrayList<DataSource.StateListAnimator> arrayList = this.djBIcL;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            return false;
        }
        DataSource.StateListAnimator stateListAnimator = this.djBIcL.get(i);
        dArr[0] = stateListAnimator.values();
        dArr[1] = stateListAnimator.AkhnZx();
        return true;
    }

    @Override // o.oUG
    public final boolean OLrzqt(int[] iArr, int i, double[][] dArr, int[][] iArr2) {
        double[] dArr2 = new double[2];
        double d = Double.MAX_VALUE;
        double d2 = -1.7976931348623157E308d;
        int i2 = -1;
        int i3 = -1;
        int i4 = i;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i4 < i6) {
                double[] dArr3 = dArr[i5];
                dArr3[0] = 0.0d;
                dArr3[1] = 0.0d;
            } else {
                while (i4 >= i6) {
                    if (AEQbTJ(i4, dArr2)) {
                        double d3 = dArr2[0];
                        if (d > d3) {
                            i2 = i4;
                            d = d3;
                        }
                        double d4 = dArr2[1];
                        if (d2 < d4) {
                            i3 = i4;
                            d2 = d4;
                        }
                    }
                    i4--;
                }
                if (d > d2) {
                    return false;
                }
                double[] dArr4 = dArr[i5];
                dArr4[0] = d;
                dArr4[1] = d2;
            }
            if (iArr2 != null) {
                int[] iArr3 = iArr2[i5];
                iArr3[0] = i2;
                iArr3[1] = i3;
            }
        }
        return true;
    }
}
