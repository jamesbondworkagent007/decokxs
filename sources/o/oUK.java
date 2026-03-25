package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.indicator.Expression;

/* JADX INFO: loaded from: classes8.dex */
public class oUK extends oUG {
    public AbstractC36262oVg AhwBna;
    public java.util.ArrayList<DataSource.StateListAnimator> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC36262oVg isConnected() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<DataSource.StateListAnimator> valueOf() {
        return this.djBIcL;
    }

    public final void KWHzl(AbstractC36262oVg abstractC36262oVg) {
        this.AhwBna = abstractC36262oVg;
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().sSMYrx().get(copydefault());
        if (dataSource != null) {
            this.djBIcL = dataSource.AEQbTJ;
            this.AhwBna.KWHzl(dataSource, false);
        }
    }

    public oUK(java.lang.String str) {
        super(str);
    }

    @Override // o.oUG
    public void EZpvd(boolean z) throws java.lang.Exception {
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().sSMYrx().get(copydefault());
        this.djBIcL = dataSource.AEQbTJ;
        if (dataSource.gEmmrt() < 1) {
            return;
        }
        if (dataSource.isConnected() == 1) {
            this.AhwBna.KWHzl();
        }
        this.AhwBna.KWHzl(dataSource, z);
    }

    public boolean copydefault(int i, double[] dArr) {
        int i2;
        dArr[0] = Double.MAX_VALUE;
        dArr[1] = -1.7976931348623157E308d;
        oWN own = C36246oUr.copydefault().DCJXGO().get(copydefault());
        int size = this.AhwBna.KWHzl.size();
        AbstractC36262oVg abstractC36262oVg = this.AhwBna;
        if ((abstractC36262oVg instanceof C36277oVv) && i < abstractC36262oVg.djBIcL()) {
            return false;
        }
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC36262oVg abstractC36262oVg2 = this.AhwBna;
            if ((!(abstractC36262oVg2 instanceof oVA) && !(abstractC36262oVg2 instanceof C36272oVq) && !(abstractC36262oVg2 instanceof C36270oVo)) || i3 > abstractC36262oVg2.isConnected().size() - 1 || this.AhwBna.copydefault(i3).getIsShow()) {
                double dExecute = this.AhwBna.KWHzl.get(i3).execute(i);
                if (AEQbTJ(isConnected())) {
                    if (dExecute != AudioStats.AUDIO_AMPLITUDE_NONE && !java.lang.Double.isNaN(dExecute)) {
                        if (dArr[0] > dExecute) {
                            dArr[0] = dExecute;
                        }
                        if (dArr[1] < dExecute) {
                            dArr[1] = dExecute;
                        }
                        z = true;
                    }
                } else {
                    AbstractC36262oVg abstractC36262oVg3 = this.AhwBna;
                    if (abstractC36262oVg3 instanceof C36270oVo) {
                        if (own != null && dExecute > AudioStats.AUDIO_AMPLITUDE_NONE && i3 > 0) {
                            Expression.Parameter parameterEZpvd = abstractC36262oVg3.EZpvd(i3);
                            int iIsConnected = own.isConnected();
                            int iIsConnected2 = own.isConnected();
                            while (true) {
                                if (iIsConnected2 >= i) {
                                    i2 = iIsConnected;
                                    break;
                                }
                                if (this.AhwBna.OLrzqt(i3).execute(iIsConnected2) != AudioStats.AUDIO_AMPLITUDE_NONE) {
                                    i2 = iIsConnected2;
                                    break;
                                }
                                iIsConnected2++;
                            }
                            double dEZpvd = pDQ.copydefault.EZpvd(own.isConnected(), i2, dExecute, parameterEZpvd.getName());
                            if (dEZpvd > AudioStats.AUDIO_AMPLITUDE_NONE) {
                                if (dArr[0] > dEZpvd) {
                                    dArr[0] = dEZpvd;
                                }
                                if (dArr[1] < dEZpvd) {
                                    dArr[1] = dEZpvd;
                                }
                                z = true;
                            }
                        }
                    } else if (abstractC36262oVg3 instanceof oVL) {
                        if (!java.lang.Double.isNaN(dExecute) && dExecute >= AudioStats.AUDIO_AMPLITUDE_NONE && dExecute <= 100.0d) {
                            if (dArr[0] > dExecute) {
                                dArr[0] = dExecute;
                            }
                            if (dArr[1] < dExecute) {
                                dArr[1] = dExecute;
                            }
                            z = true;
                        }
                    } else if (!java.lang.Double.isNaN(dExecute)) {
                        if (dArr[0] > dExecute) {
                            dArr[0] = dExecute;
                        }
                        if (dArr[1] < dExecute) {
                            dArr[1] = dExecute;
                        }
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public final boolean AEQbTJ(int i, double[] dArr, int i2) {
        dArr[0] = Double.MAX_VALUE;
        dArr[1] = -1.7976931348623157E308d;
        double dExecute = this.AhwBna.KWHzl.get(i2).execute(i);
        if (AEQbTJ(isConnected())) {
            if (dExecute == AudioStats.AUDIO_AMPLITUDE_NONE || java.lang.Double.isNaN(dExecute)) {
                return false;
            }
            if (dArr[0] > dExecute) {
                dArr[0] = dExecute;
            }
            if (dArr[1] < dExecute) {
                dArr[1] = dExecute;
            }
        } else {
            if (java.lang.Double.isNaN(dExecute)) {
                return false;
            }
            if (dArr[0] > dExecute) {
                dArr[0] = dExecute;
            }
            if (dArr[1] < dExecute) {
                dArr[1] = dExecute;
            }
        }
        return true;
    }

    @Override // o.oUG
    public boolean OLrzqt(int[] iArr, int i, double[][] dArr, int[][] iArr2) {
        AbstractC36262oVg abstractC36262oVg = this.AhwBna;
        if (abstractC36262oVg.EZpvd) {
            int size = abstractC36262oVg.KWHzl.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.AhwBna.KWHzl.get(i2).OLrzqt(-1.7976931348623157E308d);
                this.AhwBna.KWHzl.get(i2).AEQbTJ(Double.MAX_VALUE);
                double[] dArr2 = new double[2];
                Expression.Output output = this.AhwBna.KWHzl.get(i2);
                int i3 = i;
                for (int i4 : iArr) {
                    if (i3 < i4) {
                        output.AEQbTJ(AudioStats.AUDIO_AMPLITUDE_NONE);
                        output.OLrzqt(AudioStats.AUDIO_AMPLITUDE_NONE);
                    } else {
                        while (i3 >= i4) {
                            if (AEQbTJ(i3, dArr2, i2)) {
                                if (this.AhwBna.KWHzl.get(i2).gEmmrt() > dArr2[0]) {
                                    this.AhwBna.KWHzl.get(i2).AEQbTJ(dArr2[0]);
                                }
                                if (this.AhwBna.KWHzl.get(i2).valueOf() < dArr2[1]) {
                                    this.AhwBna.KWHzl.get(i2).OLrzqt(dArr2[1]);
                                }
                            }
                            i3--;
                        }
                    }
                }
            }
            if (size == 2 && this.AhwBna.KWHzl.get(0).valueOf() < this.AhwBna.KWHzl.get(1).valueOf()) {
                this.AhwBna.EZpvd = false;
            }
        }
        return AEQbTJ(iArr, i, dArr, iArr2);
    }

    public final boolean AEQbTJ(int[] iArr, int i, double[][] dArr, int[][] iArr2) {
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
                    if (copydefault(i4, dArr2)) {
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

    public boolean AEQbTJ(AbstractC36262oVg abstractC36262oVg) {
        return (abstractC36262oVg instanceof C36275oVt) || (abstractC36262oVg instanceof C36281oVz) || (abstractC36262oVg instanceof oVB) || (abstractC36262oVg instanceof C36269oVn) || (abstractC36262oVg instanceof oVG);
    }
}
